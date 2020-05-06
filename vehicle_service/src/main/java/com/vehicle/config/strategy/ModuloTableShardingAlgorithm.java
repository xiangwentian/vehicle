package com.vehicle.config.strategy;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;
import com.google.common.collect.Range;
import com.vehicle.utils.HashUtil;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * 分表策略的基本实现
 */
public class ModuloTableShardingAlgorithm implements SingleKeyTableShardingAlgorithm<String> {

	@Override
	public String doEqualSharding(Collection<String> tableNames, ShardingValue<String> shardingValue) {
		for (String each : tableNames) {
			if (each.endsWith(HashUtil.getAscii(shardingValue.getValue(), 0, 1) % 2 + "")) {
				return each;
			}
		}
		throw new IllegalArgumentException();
	}

	@Override
	public Collection<String> doInSharding(Collection<String> tableNames, ShardingValue<String> shardingValue) {
		Collection<String> result = new LinkedHashSet<>(tableNames.size());
		for (String value : shardingValue.getValues()) {
			for (String tableName : tableNames) {
				if (tableName.endsWith(HashUtil.getAscii(value, 0, 1) % 2 + "")) {
					result.add(tableName);
				}
			}
		}
		return result;
	}

	@Override
	public Collection<String> doBetweenSharding(Collection<String> tableNames, ShardingValue<String> shardingValue) {
		Collection<String> result = new LinkedHashSet<>(tableNames.size());
		Range<String> range = (Range<String>) shardingValue.getValueRange();
		for (Integer i = HashUtil.getAscii(range.lowerEndpoint(), 0, 1); i <= HashUtil.getAscii(range.upperEndpoint(),
				0, 1); i++) {
			for (String each : tableNames) {
				if (each.endsWith(i % 2 + "")) {
					result.add(each);
				}
			}
		}
		return result;
	}
}
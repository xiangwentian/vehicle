# vehicle
使用springcloud模拟搭建停车平台

平台需要使用eureka做服务治理，可以使用我的另一个项目中的应用：https://github.com/xiangwentian/springcloud  

## 模块设计  
### vehicle_web:  
停车平台web端，提供用户查询车辆出入场查询功能、该模块设计提供用户支付页面(支付宝、微信等第三方)  
### vehicle_service：
停车平台服务端，提供用户查询数据。对外提供服务商(停车场、闸机系统)API调用接口（入场、出场、支付订单上传等信息）  
### vehicle_model：  
停车平台模型层，提供相应的model供各模块共用，避免各模块之间维护多个模型，便于管理  
### vehicle_common：  
停车平台工具，对时间处理的工具类、接口返回数据的封闭等方便全部放到了该模块下面  


## 创建表：
创建表文件在 /vehicle_service/src/main/resources/mybatis  
user_info.sql 用户信息表  
user_car_info.sql 用户-车辆绑定关系表  
car_info.sql 车辆信息表  
park.sql停车场信息表  
parking_record.sql停车记录表  
注：parking_record表针对car_no车牌（只对车牌汉字如：冀B851LP的"冀"做hash处理）做了表的分片操作，使用shardingjdbc实现分表操作。  
如果想实现分库也是可以的，代码有实现，只需要把/vehicle_service/src/main/java/com/vehicle/DataSourceConfig.java 74行放开，数据配置好就ok的  

## TODO  
初步搭建，功能有待完善。。。敬请期待



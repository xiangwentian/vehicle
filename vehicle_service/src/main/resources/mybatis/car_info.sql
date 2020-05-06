drop index color on car_info;

drop index car_no on car_info;

drop table if exists car_info;

/*==============================================================*/
/* Table: car_info    车辆信息表                                                                                      */
/*==============================================================*/
create table car_info
(
   car_id               varchar(20) not null,
   car_no               varchar(10) not null,
   color                int not null,
   card_no              varchar(50),
   primary key (car_id)
);

alter table car_info comment '车辆信息表';

/*==============================================================*/
/* Index: car_no                                                */
/*==============================================================*/
create index car_no on car_info
(
   
);

/*==============================================================*/
/* Index: color                                                 */
/*==============================================================*/
create index color on car_info
(
   
);

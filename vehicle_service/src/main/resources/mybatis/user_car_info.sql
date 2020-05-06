drop table if exists user_car_info;

/*==============================================================*/
/* Table: user_car_info  用户、车辆关系表                                                                */
/*==============================================================*/
create table user_car_info
(
   uid                  varchar(18) not null,
   car_id               varchar(20) not null,
   state                int not null,
   primary key (uid, car_id, state)
);

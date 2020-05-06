drop index car_no on parking_record;

drop index park_id on parking_record;

drop table if exists parking_record;

/*==============================================================*/
/* Table: parking_record   停车记录表                                                                          */
/*==============================================================*/
create table parking_record
(
   park_id              int not null,
   car_no               varchar(10) not null,
   in_time              timestamp,
   out_time             timestamp
);

/*==============================================================*/
/* Index: park_id                                               */
/*==============================================================*/
create index park_id on parking_record
(
   
);

/*==============================================================*/
/* Index: car_no                                                */
/*==============================================================*/
create index car_no on parking_record
(
   
);

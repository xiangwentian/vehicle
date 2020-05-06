drop index parkid on park;

drop table if exists park;

/*==============================================================*/
/* Table: park   停车场信息表                                                                                                */
/*==============================================================*/
create table park
(
   parkid               int not null auto_increment,
   name                 varchar(50) not null,
   address              varchar(100) not null,
   primary key (parkid)
);

alter table park comment '停车场信息表';

/*==============================================================*/
/* Index: parkid                                                */
/*==============================================================*/
create unique index parkid on park
(
   
);

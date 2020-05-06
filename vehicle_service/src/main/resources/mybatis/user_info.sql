drop index uid on user_info;

drop table if exists user_info;

/*==============================================================*/
/* Table: user_info    用户信息表                                                                                    */
/*==============================================================*/
create table user_info
(
   uid                  varchar(18) not null,
   phone                varchar(11),
   mail                 varchar(50),
   primary key (uid)
);

/*==============================================================*/
/* Index: uid                                                   */
/*==============================================================*/
create unique index uid on user_info
(
   
);

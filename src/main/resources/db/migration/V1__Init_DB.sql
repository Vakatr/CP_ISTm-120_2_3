CREATE SCHEMA IF NOT EXISTS migrations;

create sequence hibernate_sequence start 1 increment 1;

create table storages (
                          id int8 not null,
                          title varchar(255) not null,
                          address text not null,
                          primary key (id)
);

create table storagesData (
                              idStorage int8 not null,
                              sku varchar(255) not null,
                              quantity int
);

alter table storagesData
    add constraint storagesData_id_Storage
        foreign key (idStorage) references storages(id);

create table orders (
                        number_order varchar(10) not null,
                        date_of_created timestamp default current_timestamp,
                        customer varchar(255) not null,
                        address text not null,
                        status int8 not null,
                        primary key (number_order)
);

create table orders_Data (
                            id int8 not null,
                            sku varchar(255) not null,
                            quantity int8 not null,
                            weight int8 not null,
                            id_number_order varchar(10) not null,
                            primary key (id)
);

alter table orders_Data
    add constraint ordersData_id_Order
        foreign key (id_number_order) references orders(number_order);

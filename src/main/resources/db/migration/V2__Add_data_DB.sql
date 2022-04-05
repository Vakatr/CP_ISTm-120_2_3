insert into storages(id, title, address)
VALUES (1, 'Склад№1', 'ул, Промышленный пр-д, 5В');
insert into storages(id, title, address)
VALUES (2, 'Склад№2', 'Суздальский пр., 5');
insert into storagesData(idStorage, sku, quantity)
VALUES
(1,'sku1', 1),
(1,'sku2', 5),
(1,'sku3', 10),
(1,'sku4', 0),
(2,'sku1', 3),
(2,'sku2', 4),
(2,'sku3', 5),
(2,'sku4', 10);

insert into orders(number_order, customer,address,status)
VALUES
('IT-0000001','Клиент№1', 'ул. Безыменского, 9',1),
('IT-0000002','Клиент№2', 'ул. Каманина, 6',1),
('IT-0000003','Клиент№3', 'ул. Разина, 24',1),
('IT-0000004','Клиент№4', 'Центральная ул., 5',1),
('IT-0000005','Клиент№5', 'ул. Гастелло, 7Г',1);

insert into orders_Data(id, sku,quantity,weight,id_number_order)
VALUES
(1,'sku1',2,10,'IT-0000001'),
(2,'sku2',5,50,'IT-0000002'),
(3,'sku3',8,45,'IT-0000003'),
(4,'sku4',5,50,'IT-0000004'),
(5,'sku1',2,10,'IT-0000005'),
(6,'sku2',4,40,'IT-0000001'),
(7,'sku3',7,50,'IT-0000002'),
(8,'sku4',5,50,'IT-0000003');

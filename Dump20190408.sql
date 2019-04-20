CREATE DATABASE `tolet`;
USE `tolet`;



CREATE TABLE `addv` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `addtype` varchar(45) DEFAULT NULL,
  `descr` varchar(245) DEFAULT NULL,
  `loc` varchar(45) DEFAULT NULL,
  `ttl` varchar(145) DEFAULT NULL,
  `cont` varchar(45) DEFAULT NULL,
  `imgname` varchar(45) DEFAULT NULL,
  `url` varchar(245) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `addv` VALUES (1,'HOUSE',NULL,'DHAKA','This add is for a house','01969037346',NULL,NULL,'Fri Apr 05 00:00:00 BDT 2019'),
(2,'HOUSE',NULL,'DHAKA','This add is for a house','01869037346',NULL,NULL,'Sat Oct 19 00:00:00 BDT 2024'),
(3,'HOUSE',NULL,'DHAKA','This add is for a house','01869037346',NULL,NULL,'Mon Nov 18 00:00:00 BDT 2024'),
(4,'SHOP',NULL,'CUMILLA','Tis shop title.','01712671542',NULL,NULL,'Thu Apr 18 00:00:00 BDT 2019'),
(5,'SHOP',NULL,'CUMILLA','Tis shop title.','01812671542',NULL,NULL,'Mon Nov 25 00:00:00 BDT 2024'),
(6,'SHOP',NULL,'CUMILLA','Tis shop title.','01812671542',NULL,NULL,'Sun Nov 24 00:00:00 BDT 2024'),
(7,'HOUSE',NULL,'DHAKA','THIS IS A HOUSE TEST FOR CARD VIED','01712671542',NULL,NULL,'Tue Apr 23 00:00:00 BDT 2019'),
(8,'SHOP',NULL,'KHULNA','THIS IS A NEW SHOP','01812457845',NULL,NULL,'Tue Apr 09 00:00:00 BDT 2019'),
(9,'HOUSE',NULL,'CHITTAGONG','THIS IS A NEW HOUSE','01912457845',NULL,NULL,'Thu Apr 04 00:00:00 BDT 2019');
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `admin` VALUES (1,'admin','shaarifulz@gmail.com','admin'),
(2,'admin2','moon@gmail.com','admin2');


CREATE TABLE `houseorder` (
  `addid` int(11) NOT NULL AUTO_INCREMENT,
  `addtype` varchar(45) DEFAULT NULL,
  `descr` varchar(100) DEFAULT NULL,
  `loc` varchar(45) DEFAULT NULL,
  `cont` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`addid`)
);
INSERT INTO `houseorder` VALUES (1,'Shop','There is a shop','Dhaka','0121441','img','25-12-2001'),
(2,'House','There is a shop','Cumilla','46545645','img','25-12-1994');

CREATE TABLE `member` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  `cont` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
INSERT INTO `member` VALUES (1,'Shaariful','shaarifulz@gmail.com','MALE','123','01712671542'),
(5,'munna','moon@gmail.com','MALE','123','01969696969'),
(6,'munia','munia@gmail.com','FEMALE','123','01669696969'),
(8,'sayem','sayem@gmail.com','MALE','123','01888896969'),
(9,'nayeem','nayeem@gmail.com','MALE','123','01888896969'),
(11,'tarek','tarek@gmail.com','MALE','123','01964545454'),
(12,'tarek','tarek@gmail.com','MALE','123','01964545454');

CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `addname` varchar(45) DEFAULT NULL,
  `addtype` varchar(45) DEFAULT NULL,
  `amount` varchar(45) DEFAULT NULL,
  `paytype` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE `payment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `addname` varchar(45) DEFAULT NULL,
  `addtype` varchar(45) DEFAULT NULL,
  `amount` varchar(45) DEFAULT NULL,
  `paytype` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
INSERT INTO `payment` VALUES (1,'A New Shop','Shop','16000','DUE','Thu Oct 10 00:00:00 BDT 2024'),(2,'A New Shop','Shop','26000','PAID','Mon Oct 07 00:00:00 BDT 2024'),(3,'A New House','House','12000','PAID','Sat Apr 06 00:00:00 BDT 2019'),(4,'munna','HOUSE','12000','PAID','Fri Apr 19 00:00:00 BDT 2019'),(5,'munna','SHOP','50000','DUE','Mon Apr 15 00:00:00 BDT 2019'),(6,'munna','SHOP','50000','PAID','Sun Oct 27 00:00:00 BDT 2024'),(7,'munna','House','12000','PAID','Mon Apr 22 00:00:00 BDT 2019'),(9,'munna','House','12000','PAID','Wed Apr 10 00:00:00 BDT 2019'),(10,'tarek','SHOP','20000','PAID','Mon Apr 08 00:00:00 BDT 2019');



CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `pname` varchar(45) DEFAULT NULL,
  `brand` varchar(45) DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `product` VALUES (1,'Milk','Fresh','55'),(2,'Soap','Lux','60'),(3,'Salt','ACI','60'),(4,'Shirt','Polo','700'),(5,'Pant','Polo','700'),(6,'TShirt','Plus Point','450');

CREATE TABLE `shopadd` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `addtype` varchar(45) DEFAULT NULL,
  `descr` varchar(45) DEFAULT NULL,
  `loc` varchar(45) DEFAULT NULL,
  `cont` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
INSERT INTO `shopadd` VALUES (1,'SHOP','dahsdkjajs','adshkasdjk','hasdkjahsj','hajdhkj','ajsdhaksd'),
(2,'SHOP','akjdsj','hj','hjhj','hkjhj','jhj');

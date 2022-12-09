DROP TABLE IF EXISTS `order_line`
DROP TABLE IF EXISTS `pizza`
DROP TABLE IF EXISTS `order`
DROP TABLE IF EXISTS `user_roles`
DROP TABLE IF EXISTS `users`
DROP TABLE IF EXISTS `roles`


-- roles definition

CREATE TABLE `roles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
);


-- users definition

CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,  
  `phonenumber` varchar(20) NOT NULL,
  `password` varchar(120) NOT NULL,
  `firstname` varchar(120) NOT NULL,
  `lastname` varchar(120) NOT NULL,
  `address` varchar(120) NOT NULL,
  PRIMARY KEY (`id`)
);


-- user_roles definition

CREATE TABLE `user_roles` (
  `user_id` bigint NOT NULL,
  `role_id` int NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  CONSTRAINT `user_roles_FK1` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  CONSTRAINT `user_roles_FK2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
);

-- add roles
INSERT INTO roles(name) values ('USER'),('ADMIN');


-- order definition
CREATE TABLE `order` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `usr_id` bigint NOT NULL,
  `date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `total_amount` decimal(6,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`id`),
  CONSTRAINT `order_FK` FOREIGN KEY (`usr_id`) REFERENCES `users` (`id`)
);


-- pizza definition
CREATE TABLE `pizza` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(200) NOT NULL,
  `image` varchar(20) NOT NULL,
  `price` decimal(4,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- mariopizza.order_line definition
CREATE TABLE `order_line` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `ord_id` bigint unsigned NOT NULL,
  `piz_id` int NOT NULL,
  `quantity` smallint NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  CONSTRAINT `order_line_FK` FOREIGN KEY (`piz_id`) REFERENCES `pizza` (`id`),
  CONSTRAINT `order_line_FK_1` FOREIGN KEY (`ord_id`) REFERENCES `order` (`id`)
);




-- CREATE pizzas!
INSERT INTO pizza(name, description, image, price) VALUES
('Margherita', 'Sauce tomate à l\'origan et mozzarella', 'margherita.jpg', 7.90),
('4 Fromages', 'Sauce tomate à l\'origan ou crème fraîche légère, mozzarella, fromage de chèvre, emmental et Fourme d\'Ambert AOP', '4fromages.jpg', 10.50),
('Campagnarde', 'Crème fraîche légère, mozzarella, lardons, oignons rouges frais et champignons frais', 'campagnarde.jpg', 10.00),
('Chèvre Miel', 'Crème fraîche légère, mozzarella, fromage de chèvre, miel', 'chevre-miel.jpg', 9.50),
('Chicken Barbecue', 'Sauce barbecue, mozzarella, Poulet rôti, oignons rouges frais, champignons frais et poivrons verts frais', 'chicken-bbq.jpg', 10.00),
('Hawaïenne', 'Sauce tomate à l\'origan, mozzarella, jambon et ananas', 'hawaienne.jpg', 9.50),
('Nordique', 'Crème fraîche légère, mozzarella et saumon fumé de Norvège', 'nordique.jpg', 10.50),
('Orientale', 'Sauce tomate à l\'origan, mozzarella, merguez et champignons frais', 'orientale.jpg', 9.50),
('Pepperoni', 'Sauce tomate à l\'origan, mozzarella et saucisse pepperoni', 'pepperoni.jpg', 10.50),
('Reine', 'Sauce tomate à l\'origan, mozzarella, jambon et champignons frais', 'reine.jpg', 9.50),
('Texane Barbecue', 'Sauce barbecue, mozzarella, jambon, emietté au boeuf, lardons, champignons frais et oignons rouges frais.', 'texan-bbq.jpg', 10.00),
('Végétarienne', 'Sauce tomate à l\'origan, mozzarella, champignons frais, oignons rouges frais, poivrons verts frais, tomates fraîches et Olives noires', 'vegetarienne.jpg', 19.50)
;


CREATE USER toma IDENTIFIED BY 'Toto12345';


GRANT SELECT, UPDATE, DELETE, INSERT ON mariopizza.* TO toma;

select * from users u 

INSERT INTO users (firstname, lastname, phonenumber, password, address) 
	VALUES('thomas', 'bartier', '0605260397', '$2a$12$pE1rkYUbG43D2iX6aIJ1JumjGdO3.RQAE37E1uz49p9e0uwMMK0wa', '32 rue test')
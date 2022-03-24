CREATE TABLE IF NOT EXISTS `Store` (
	`id` INTEGER  PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS `Staff` (
	`id` INTEGER  PRIMARY KEY AUTO_INCREMENT,
	`store_id` INTEGER,
	`name` VARCHAR(50) NOT NULL,
	FOREIGN KEY (store_id) REFERENCES Store(id)
);

CREATE TABLE IF NOT EXISTS `Customer` (
	`id` INTEGER  PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL,
	`birthday` date,
	`gender` VARCHAR(2),
	`deleted_at` datetime
);

CREATE TABLE IF NOT EXISTS `Ticket` (
	`id` INTEGER  PRIMARY KEY AUTO_INCREMENT,
	`payment_code` VARCHAR(2) NOT NULL,
	`name`  VARCHAR(100) NOT NULL,
	`remaining` INTEGER,
	`start_date` datetime,
	`limit_date` datetime,
	`customer_id` INTEGER,
	FOREIGN KEY (customer_id) REFERENCES Customer(id)
);

CREATE TABLE IF NOT EXISTS `History` (
	`id` INTEGER  PRIMARY KEY AUTO_INCREMENT,
	`customer_id` INTEGER,
	`ticket_Id` INTEGER,
	`store_Id` INTEGER,
	`use_date` date,
	`staff_Id` INTEGER,
	FOREIGN KEY (customer_id) REFERENCES Customer(id),
	FOREIGN KEY (ticket_Id) REFERENCES Ticket(id),
	FOREIGN KEY (store_Id) REFERENCES Store(id),
	FOREIGN KEY (staff_Id) REFERENCES Staff(id)
);






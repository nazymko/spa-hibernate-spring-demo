CREATE SCHEMA `hr` DEFAULT CHARACTER SET utf8 ;



CREATE TABLE `hr`.`department` (
  `id` INT NOT NULL,
  `name` VARCHAR(1024) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


CREATE TABLE `hr`.`employee` (
  `id` INT NOT NULL,
  `first_name` VARCHAR(1024) NULL,
  `last_name` VARCHAR(1024) NULL,
  `birthdate` DATETIME NULL,
  `gender` VARCHAR(16) NULL,
  `taxnumber` VARCHAR(1024) NULL,
  PRIMARY KEY (`id`));

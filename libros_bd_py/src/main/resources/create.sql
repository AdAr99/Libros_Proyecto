CREATE TABLE `bdlibros`.`libros` (
  `id` INT NOT NULL,
  `titulo` VARCHAR(45) NULL,
  `tematica` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
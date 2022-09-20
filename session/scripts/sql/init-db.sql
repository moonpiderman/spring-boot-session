CREATE DATABASE side_dish;
CREATE USER 'side-dish'@'localhost' IDENTIFIED BY 'side-dish';
GRANT ALL PRIVILEGES ON side_dish.* TO 'side-dish'@'localhost';

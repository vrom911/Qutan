/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  vrom911
 * Created: May 27, 2016
 */
CREATE DATABASE qutan;
CREATE USER 'qutan'@'localhost'IDENTIFIED BY 'qutan';
GRANT ALL PRIVILEGES ON qutan.* TO 'qutan'@'localhost';
FLUSH PRIVILEGES;

-- app secret: cfb36cc41a4fb58ca63d7e5d9755cef7
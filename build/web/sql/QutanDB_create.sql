-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date on site: 2016-05-19 07:52:01.808
-- Last modified by vrom911: 2016-05-26

-- tables
-- Table: announcement
CREATE TABLE announcement (
    id int NOT NULL AUTO_INCREMENT,
    receipent_id int NOT NULL,
    blood_amount int NOT NULL,
    due_date date NOT NULL,
    photo blob NOT NULL,
    description varchar(300) NOT NULL,
    state varchar(10) NOT NULL,
    last_changed date NOT NULL,
    creation_date date NOT NULL,
    CONSTRAINT announcement_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'list of all announcements for blood';

-- Table: announcement_image
CREATE TABLE announcement_image (
    id int NOT NULL AUTO_INCREMENT,
    announcement_id int NOT NULL,
    create_date date NOT NULL,
    path varchar(200) NOT NULL,
    status int NOT NULL,
    CONSTRAINT announcement_image_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'Can put all images of the announcement attached';

-- Table: app_log
CREATE TABLE app_log (
    id int NOT NULL AUTO_INCREMENT,
    log_date timestamp NOT NULL,
    log_text varchar(1000) NOT NULL,
    log_status int NOT NULL COMMENT '0-success, 1-warning, 2-error',
    status int NOT NULL DEFAULT 0,
    app_module_id int NOT NULL,
    user_id int NOT NULL,
    CONSTRAINT app_log_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'application log table';

-- Table: app_module
CREATE TABLE app_module (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    status int NOT NULL,
    CONSTRAINT app_module_pk PRIMARY KEY (id)
);

-- Table: blood_group
CREATE TABLE blood_group (
    id int NOT NULL AUTO_INCREMENT,
    name char(2) NOT NULL,
    rhesus char(1) NOT NULL,
    state varchar(10) NOT NULL,
    CONSTRAINT blood_group_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'Table of all groups of blood';

-- Table: city
CREATE TABLE city (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    status int NOT NULL DEFAULT 0,
    country_id int NOT NULL,
    CONSTRAINT city_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'List of the cities of the country';

-- Table: country
CREATE TABLE country (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    short_name varchar(3) NOT NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT country_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'List of the countries';

-- Table: donor
CREATE TABLE donor (
    id int NOT NULL AUTO_INCREMENT,
    user_id int NOT NULL,
    registration_date date NOT NULL,
    last_visit_date date NOT NULL,
    user_status int NOT NULL DEFAULT -1,
    photo blob NOT NULL,
    gender char(1) NOT NULL,
    birth_date date NOT NULL,
    weight int NOT NULL,
    blood_group_id int NOT NULL,
    availability int NOT NULL,
    state varchar(10) NOT NULL,
    status int NOT NULL,
    CONSTRAINT donor_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'user which registered as a donor';

-- Table: donor_requests
CREATE TABLE donor_requests (
    id int NOT NULL AUTO_INCREMENT,
    state int NOT NULL COMMENT '0 - pending
1 - accepted
2 - given
-1 - rejected',
    donor_id int NOT NULL,
    announcement_id int NOT NULL,
    CONSTRAINT donor_requests_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'list of  connections: donors who are ready to help to particular announcement';

-- Table: donors_feedback
CREATE TABLE donors_feedback (
    id int NOT NULL AUTO_INCREMENT,
    donor_id int NOT NULL,
    receipent_id int NOT NULL,
    announcement_id int NOT NULL,
    description varchar(255) NOT NULL,
    state varchar(10) NOT NULL,
    CONSTRAINT donors_feedback_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'table of feedback gathered from receipents';

-- Table: mail_confirmation
CREATE TABLE mail_confirmation (
    id int NOT NULL AUTO_INCREMENT,
    create_date date NOT NULL,
    link varchar(100) NOT NULL,
    expire_date date NOT NULL,
    random_code varchar(100) NOT NULL,
    confirmation_status int NOT NULL DEFAULT 0 COMMENT '0-not confirmed, 1-confirmed',
    confirm_date date NULL,
    status int NOT NULL DEFAULT 0,
    user_id int NOT NULL,
    CONSTRAINT mail_confirmation_pk PRIMARY KEY (id)
);

-- Table: receipent
CREATE TABLE receipent (
    id int NOT NULL AUTO_INCREMENT,
    user_id int NOT NULL,
    registration_date date NOT NULL,
    last_visit_date date NOT NULL,
    user_status int NOT NULL DEFAULT -1,
    blood_group_id int NOT NULL,
    status int NOT NULL,
    CONSTRAINT receipent_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'this will be primary at the registration if not checked Donor. Also the user who needs to receive blood';

-- Table: request_to_donor
CREATE TABLE request_to_donor (
    request_id int NOT NULL AUTO_INCREMENT,
    donor_id int NOT NULL,
    user_id int NOT NULL,
    description varchar(255) NOT NULL,
    state varchar(10) NOT NULL,
    CONSTRAINT request_to_donor_pk PRIMARY KEY (request_id)
) COMMENT ''
COMMENT 'User/receiptotr can make request to donor for help';

-- Table: subscriber
CREATE TABLE subscriber (
    id int NOT NULL AUTO_INCREMENT,
    full_name varchar(50) NOT NULL,
    email varchar(50) NOT NULL,
    state int NOT NULL,
    CONSTRAINT subscriber_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'list of subscribers for newsletters';

-- Table: user
CREATE TABLE `user` (
    id int NOT NULL AUTO_INCREMENT,
    username varchar(20) NOT NULL,
    password varchar(200) NOT NULL,
    first_name varchar(100) NOT NULL,
    last_name varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    phone varchar(20) NOT NULL,
    fb_link varchar(50) NULL,
    birth_date date NULL,
    country_id int NOT NULL,
    city_id int NOT NULL,
    creation_date date NOT NULL,
    last_seen date NOT NULL,
    status int NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'common user registered to the system details';

-- foreign keys
-- Reference: announcement_receipent (table: announcement)
ALTER TABLE announcement ADD CONSTRAINT announcement_receipent FOREIGN KEY announcement_receipent (receipent_id)
    REFERENCES receipent (id);

-- Reference: app_log_app_module (table: app_log)
ALTER TABLE app_log ADD CONSTRAINT app_log_app_module FOREIGN KEY app_log_app_module (app_module_id)
    REFERENCES app_module (id);

-- Reference: app_log_user (table: app_log)
ALTER TABLE app_log ADD CONSTRAINT app_log_user FOREIGN KEY app_log_user (user_id)
    REFERENCES `user` (id);

-- Reference: city_country (table: city)
ALTER TABLE city ADD CONSTRAINT city_country FOREIGN KEY city_country (country_id)
    REFERENCES country (id);

-- Reference: donor_blood_group (table: donor)
ALTER TABLE donor ADD CONSTRAINT donor_blood_group FOREIGN KEY donor_blood_group (blood_group_id)
    REFERENCES blood_group (id);

-- Reference: donor_requests_announcement (table: donor_requests)
ALTER TABLE donor_requests ADD CONSTRAINT donor_requests_announcement FOREIGN KEY donor_requests_announcement (announcement_id)
    REFERENCES announcement (id);

-- Reference: donor_requests_donor (table: donor_requests)
ALTER TABLE donor_requests ADD CONSTRAINT donor_requests_donor FOREIGN KEY donor_requests_donor (donor_id)
    REFERENCES donor (id);

-- Reference: donor_user (table: donor)
ALTER TABLE donor ADD CONSTRAINT donor_user FOREIGN KEY donor_user (user_id)
    REFERENCES `user` (id);

-- Reference: donors_feedback_announcement (table: donors_feedback)
ALTER TABLE donors_feedback ADD CONSTRAINT donors_feedback_announcement FOREIGN KEY donors_feedback_announcement (announcement_id)
    REFERENCES announcement (id);

-- Reference: donors_feedback_donor (table: donors_feedback)
ALTER TABLE donors_feedback ADD CONSTRAINT donors_feedback_donor FOREIGN KEY donors_feedback_donor (donor_id)
    REFERENCES donor (id);

-- Reference: donors_feedback_receipent (table: donors_feedback)
ALTER TABLE donors_feedback ADD CONSTRAINT donors_feedback_receipent FOREIGN KEY donors_feedback_receipent (receipent_id)
    REFERENCES receipent (id);

-- Reference: receipent_blood_group (table: receipent)
ALTER TABLE receipent ADD CONSTRAINT receipent_blood_group FOREIGN KEY receipent_blood_group (blood_group_id)
    REFERENCES blood_group (id);

-- Reference: receipent_user (table: receipent)
ALTER TABLE receipent ADD CONSTRAINT receipent_user FOREIGN KEY receipent_user (user_id)
    REFERENCES `user` (id);

-- Reference: request_to_donor_donor (table: request_to_donor)
ALTER TABLE request_to_donor ADD CONSTRAINT request_to_donor_donor FOREIGN KEY request_to_donor_donor (donor_id)
    REFERENCES donor (id);

-- Reference: request_to_donor_user (table: request_to_donor)
ALTER TABLE request_to_donor ADD CONSTRAINT request_to_donor_user FOREIGN KEY request_to_donor_user (user_id)
    REFERENCES `user` (id);

-- Reference: announcement_image_announcement_info (table: announcement_image)
ALTER TABLE announcement_image ADD CONSTRAINT announcement_image_announcement FOREIGN KEY announcement_image_announcement (announcement_id)
    REFERENCES announcement (id);

-- Reference: user_city (table: user)
ALTER TABLE `user` ADD CONSTRAINT user_city FOREIGN KEY user_city (city_id)
    REFERENCES city (id);

-- Reference: user_country (table: user)
ALTER TABLE `user` ADD CONSTRAINT user_country FOREIGN KEY user_country (country_id)
    REFERENCES country (id);

-- End of file.


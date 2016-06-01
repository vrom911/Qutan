-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2016-05-29 19:14:27.6

-- tables
-- Table: announcement
CREATE TABLE announcement (
    id int NOT NULL AUTO_INCREMENT,
    receipent_id int NOT NULL,
    blood_amount int NOT NULL,
    due_date date NOT NULL,
    description varchar(300) NOT NULL,
    state varchar(10) NOT NULL,
    last_changed date NOT NULL,
    creation_date date NOT NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT announcement_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'list of all announcements for blood';

-- Table: announcement_image
CREATE TABLE announcement_image (
    id int NOT NULL AUTO_INCREMENT,
    announcement_id int NOT NULL,
    create_date date NOT NULL,
    path varchar(200) NOT NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT announcement_image_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'Can put all images of the announcement attached';

-- Table: app_log
CREATE TABLE app_log (
    id int NOT NULL AUTO_INCREMENT,
    log_date timestamp NOT NULL,
    log_text varchar(1000) NOT NULL,
    log_status int NOT NULL COMMENT '0-success, 1-warning, 2-error',
    app_module_id int NOT NULL,
    user_id int NOT NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT app_log_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'application log table';

-- Table: app_module
CREATE TABLE app_module (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT app_module_pk PRIMARY KEY (id)
);

-- Table: blood_group
CREATE TABLE blood_group (
    id int NOT NULL AUTO_INCREMENT,
    name char(2) NOT NULL,
    rhesus char(1) NOT NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT blood_group_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'Table of all groups of blood';

-- Table: calendar_events
CREATE TABLE calendar_events (
    id int NOT NULL,
    name varchar(200) NOT NULL,
    donor_id int NOT NULL,
    creation_date date NOT NULL,
    event_date date NOT NULL,
    user_status int NOT NULL,
    announcement_id int NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT calendar_events_pk PRIMARY KEY (id)
);

-- Table: city
CREATE TABLE city (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    country_id int NOT NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT city_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'List of the cities of the country';

-- Table: country
CREATE TABLE country (
    id int NOT NULL AUTO_INCREMENT,
    short_name varchar(3) NOT NULL,
    name varchar(100) NOT NULL,
    code int NOT NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT country_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'List of the countries';

-- Table: donor
CREATE TABLE donor (
    id int NOT NULL AUTO_INCREMENT,
    user_id int NOT NULL,
    donor_status int NOT NULL DEFAULT 0,
    weight int NOT NULL,
    blood_group_id int NOT NULL,
    availability int NOT NULL,
    applicable_state varchar(10) NOT NULL,
    rating int NOT NULL DEFAULT 0,
    given_blood int NOT NULL DEFAULT 0,
    status int NOT NULL DEFAULT 0,
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
    status int NOT NULL DEFAULT 0,
    CONSTRAINT donor_requests_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'list of  connections: donors who are ready to help to particular announcement';

-- Table: donors_feedback
CREATE TABLE donors_feedback (
    id int NOT NULL AUTO_INCREMENT,
    donor_id int NOT NULL,
    user_id int NOT NULL,
    announcement_id int NOT NULL,
    description varchar(255) NOT NULL,
    state varchar(10) NOT NULL DEFAULT 0,
    CONSTRAINT donors_feedback_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'table of feedback gathered from receipents';

-- Table: mail_confirmation
CREATE TABLE mail_confirmation (
    id int NOT NULL AUTO_INCREMENT,
    user_id int NOT NULL,
    create_date date NOT NULL,
    link varchar(100) NOT NULL,
    expire_date date NOT NULL,
    random_code varchar(100) NOT NULL,
    confirmation_status int NOT NULL DEFAULT 0 COMMENT '0-not confirmed, 1-confirmed',
    confirm_date date NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT mail_confirmation_pk PRIMARY KEY (id)
);
-- Table: message
CREATE TABLE message (
   id int NOT NULL AUTO_INCREMENT,
   fullname varchar(100) NOT NULL,
   email varchar(100) NOT NULL,
   phone varchar(20) NULL,
   message varchar(500) NOT NULL,
   response_status int NOT NULL DEFAULT -1,
   status int NOT NULL DEFAULT 0,
   CONSTRAINT message_pk PRIMARY KEY (id)
);

-- Table: person
CREATE TABLE person (
    id int NOT NULL AUTO_INCREMENT,
    firstname varchar(100) NOT NULL,
    surname varchar(100) NOT NULL,
    gender varchar(8) NOT NULL,
    city_id int NOT NULL,
    fb_link varchar(200) NULL,
    birthday date NOT NULL,
    creation_date date NOT NULL,
    creator_user_id int NOT NULL COMMENT 'the user who created this person data',
    user_status int NOT NULL DEFAULT 1 COMMENT '1 - this is user itself
0 - user created this data for receipent(not user, just data)',
    status int NOT NULL DEFAULT 0,
    CONSTRAINT person_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'common for every user';

-- Table: person_image
CREATE TABLE person_image (
    id int NOT NULL AUTO_INCREMENT,
    person_id int NOT NULL,
    create_date date NOT NULL,
    path varchar(200) NOT NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT announcement_image_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'Can put all images of the announcement attached';

-- Table: receipent
CREATE TABLE receipent (
    id int NOT NULL AUTO_INCREMENT,
    user_id int NOT NULL COMMENT 'creator-user, doesn''''t mean he is receipent, but possible',
    person_id int NOT NULL COMMENT 'this is proper personal data of receipent',
    last_visit_date date NOT NULL,
    user_status int NOT NULL DEFAULT 0,
    blood_group_id int NOT NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT receipent_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'this will be primary at the registration if not checked Donor. Also the user who needs to receive blood';

-- Table: request_to_donor
CREATE TABLE request_to_donor (
    request_id int NOT NULL AUTO_INCREMENT,
    donor_id int NOT NULL,
    user_id int NOT NULL,
    description varchar(255) NOT NULL,
    request_state int NOT NULL DEFAULT 0,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT request_to_donor_pk PRIMARY KEY (request_id)
) COMMENT ''
COMMENT 'User/receiptotr can make request to donor for help';

-- Table: subscriber
CREATE TABLE subscriber (
    id int NOT NULL AUTO_INCREMENT,
    full_name varchar(50) NOT NULL,
    email varchar(50) NOT NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT subscriber_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'list of subscribers for newsletters';

-- Table: user
CREATE TABLE `user` (
    id int NOT NULL AUTO_INCREMENT,
    username varchar(20) NOT NULL,
    password varchar(200) NOT NULL,
    email varchar(100) NOT NULL,
    phone varchar(20) NOT NULL,
    last_seen date NOT NULL,
    status int NOT NULL DEFAULT 0,
    CONSTRAINT user_pk PRIMARY KEY (id)
) COMMENT ''
COMMENT 'common user registered to the system details';

-- foreign keys
-- Reference: announcement_image_announcement (table: announcement_image)
ALTER TABLE announcement_image ADD CONSTRAINT announcement_image_announcement FOREIGN KEY announcement_image_announcement (announcement_id)
    REFERENCES announcement (id);

-- Reference: announcement_receipent (table: announcement)
ALTER TABLE announcement ADD CONSTRAINT announcement_receipent FOREIGN KEY announcement_receipent (receipent_id)
    REFERENCES receipent (id);

-- Reference: app_log_app_module (table: app_log)
ALTER TABLE app_log ADD CONSTRAINT app_log_app_module FOREIGN KEY app_log_app_module (app_module_id)
    REFERENCES app_module (id);

-- Reference: app_log_user (table: app_log)
ALTER TABLE app_log ADD CONSTRAINT app_log_user FOREIGN KEY app_log_user (user_id)
    REFERENCES `user` (id);

-- Reference: calendar_events_donor (table: calendar_events)
ALTER TABLE calendar_events ADD CONSTRAINT calendar_events_donor FOREIGN KEY calendar_events_donor (donor_id)
    REFERENCES donor (id);

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

-- Reference: donors_feedback_user (table: donors_feedback)
ALTER TABLE donors_feedback ADD CONSTRAINT donors_feedback_user FOREIGN KEY donors_feedback_user (user_id)
    REFERENCES `user` (id);

-- Reference: mail_confirmation_user (table: mail_confirmation)
ALTER TABLE mail_confirmation ADD CONSTRAINT mail_confirmation_user FOREIGN KEY mail_confirmation_user (user_id)
    REFERENCES `user` (id);

-- Reference: person_city (table: person)
ALTER TABLE person ADD CONSTRAINT person_city FOREIGN KEY person_city (city_id)
    REFERENCES city (id);

-- Reference: person_image_person (table: person_image)
ALTER TABLE person_image ADD CONSTRAINT person_image_person FOREIGN KEY person_image_person (person_id)
    REFERENCES person (id);

-- Reference: person_user (table: person)
ALTER TABLE person ADD CONSTRAINT person_user FOREIGN KEY person_user (creator_user_id)
    REFERENCES `user` (id);

-- Reference: receipent_blood_group (table: receipent)
ALTER TABLE receipent ADD CONSTRAINT receipent_blood_group FOREIGN KEY receipent_blood_group (blood_group_id)
    REFERENCES blood_group (id);

-- Reference: receipent_person (table: receipent)
ALTER TABLE receipent ADD CONSTRAINT receipent_person FOREIGN KEY receipent_person (person_id)
    REFERENCES person (id);

-- Reference: receipent_user (table: receipent)
ALTER TABLE receipent ADD CONSTRAINT receipent_user FOREIGN KEY receipent_user (user_id)
    REFERENCES `user` (id);

-- Reference: request_to_donor_donor (table: request_to_donor)
ALTER TABLE request_to_donor ADD CONSTRAINT request_to_donor_donor FOREIGN KEY request_to_donor_donor (donor_id)
    REFERENCES donor (id);

-- Reference: request_to_donor_user (table: request_to_donor)
ALTER TABLE request_to_donor ADD CONSTRAINT request_to_donor_user FOREIGN KEY request_to_donor_user (user_id)
    REFERENCES `user` (id);

-- End of file.

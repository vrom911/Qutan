-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2016-05-29 16:47:57.616

-- foreign keys
ALTER TABLE announcement_image
    DROP FOREIGN KEY announcement_image_announcement;

ALTER TABLE announcement
    DROP FOREIGN KEY announcement_receipent;

ALTER TABLE app_log
    DROP FOREIGN KEY app_log_app_module;

ALTER TABLE app_log
    DROP FOREIGN KEY app_log_user;

ALTER TABLE calendar_events
    DROP FOREIGN KEY calendar_events_donor;

ALTER TABLE city
    DROP FOREIGN KEY city_country;

ALTER TABLE donor
    DROP FOREIGN KEY donor_blood_group;

ALTER TABLE donor_requests
    DROP FOREIGN KEY donor_requests_announcement;

ALTER TABLE donor_requests
    DROP FOREIGN KEY donor_requests_donor;

ALTER TABLE donor
    DROP FOREIGN KEY donor_user;

ALTER TABLE donors_feedback
    DROP FOREIGN KEY donors_feedback_announcement;

ALTER TABLE donors_feedback
    DROP FOREIGN KEY donors_feedback_donor;

ALTER TABLE donors_feedback
    DROP FOREIGN KEY donors_feedback_user;

ALTER TABLE mail_confirmation
    DROP FOREIGN KEY mail_confirmation_user;

ALTER TABLE person_image
    DROP FOREIGN KEY person_image_person;

ALTER TABLE person
    DROP FOREIGN KEY person_user;

ALTER TABLE receipent
    DROP FOREIGN KEY receipent_blood_group;

ALTER TABLE receipent
    DROP FOREIGN KEY receipent_person;

ALTER TABLE receipent
    DROP FOREIGN KEY receipent_user;

ALTER TABLE request_to_donor
    DROP FOREIGN KEY request_to_donor_donor;

ALTER TABLE request_to_donor
    DROP FOREIGN KEY request_to_donor_user;

ALTER TABLE `user`
    DROP FOREIGN KEY user_city;

ALTER TABLE `user`
    DROP FOREIGN KEY user_country;

-- tables
DROP TABLE announcement;

DROP TABLE announcement_image;

DROP TABLE app_log;

DROP TABLE app_module;

DROP TABLE blood_group;

DROP TABLE calendar_events;

DROP TABLE city;

DROP TABLE country;

DROP TABLE donor;

DROP TABLE donor_requests;

DROP TABLE donors_feedback;

DROP TABLE mail_confirmation;

DROP TABLE person;

DROP TABLE person_image;

DROP TABLE receipent;

DROP TABLE request_to_donor;

DROP TABLE subscriber;

DROP TABLE `user`;

-- End of file.


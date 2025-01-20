CREATE TABLE country
(
    id_country NUMBER(6),
    country_name VARCHAR(30) CONSTRAINT country_name_nn NOT NULL
);

ALTER TABLE country
ADD
CONSTRAINT pk_country PRIMARY KEY (id_country)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

------------------------------------------------------------------------------------------------

CREATE TABLE province
(
    id_province NUMBER (6),
    province_name VARCHAR(30) CONSTRAINT province_name_nn NOT NULL,
    id_country_fk NUMBER(6)
);

ALTER TABLE province
ADD
CONSTRAINT pk_province PRIMARY KEY (id_province)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE province
ADD
CONSTRAINT fk_province_country FOREIGN KEY (id_country_fk) REFERENCES country(id_country);

------------------------------------------------------------------------------------------------

CREATE TABLE municipality
(
    id_municipality NUMBER(6),
    municipality_name VARCHAR(30) CONSTRAINT municipality_name_nn NOT NULL,
    id_province_fk NUMBER(6)
);

ALTER TABLE municipality
ADD
CONSTRAINT pk_municipality PRIMARY KEY (id_municipality)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE municipality
ADD
CONSTRAINT fk_municipality_province FOREIGN KEY (id_province_fk) REFERENCES province(id_province);

--------------------------------------------------------------------------------------------------

CREATE TABLE district
(
    id_district NUMBER(6),
    district_name VARCHAR(30) CONSTRAINT district_name_nn NOT NULL,
    id_municipality_fk NUMBER(6)
);

ALTER TABLE district
ADD
CONSTRAINT pk_district PRIMARY KEY (id_district)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE district
ADD
CONSTRAINT fk_district_municipality FOREIGN KEY (id_municipality_fk) REFERENCES municipality(id_municipality);

--------------------------------------------------------------------------------------------------

CREATE TABLE address
(
    id_address NUMBER(6),
    exact_address VARCHAR(70) CONSTRAINT exact_address_nn NOT NULL,
    zip_code VARCHAR(7),
    id_district_fk NUMBER(6),
    id_person_fk NUMBER(6)
);

ALTER TABLE address
ADD
CONSTRAINT pk_address PRIMARY KEY (id_address)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE address
ADD
CONSTRAINT fk_address_district FOREIGN KEY (id_district_fk) REFERENCES district(id_district);

ALTER TABLE address
ADD
CONSTRAINT fk_address_person FOREIGN KEY (id_person_fk) REFERENCES person(id_person);

--------------------------------------------------------------------------------------------------

CREATE TABLE carpool_app
(
    id_app NUMBER(6),
    app_name NVARCHAR2(50) CONSTRAINT app_name_nn NOT NULL,
    t_and_c NVARCHAR2(1000) CONSTRAINT t_and_c_nn NOT NULL
);

ALTER TABLE carpool_app
ADD
CONSTRAINT pk_carpool_app PRIMARY KEY (id_app)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

--------------------------------------------------------------------------------------------------

CREATE TABLE personal_id
(
    id_personal NUMBER(6),
    type_id NVARCHAR2(30) CONSTRAINT type_id_nn NOT NULL,
    number_id NVARCHAR2(15) CONSTRAINT number_id_nn NOT NULL,
    id_person_fk NUMBER(6) CONSTRAINT id_person_fk_nn NOT NULL
);

ALTER TABLE personal_id
ADD
CONSTRAINT pk_personal_id PRIMARY KEY (id_personal)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

--------------------------------------------------------------------------------------------------

CREATE TABLE gender
(
    id_gender NUMBER(6),
    gender NVARCHAR2(50) CONSTRAINT gender_nn NOT NULL
);

ALTER TABLE gender
ADD
CONSTRAINT pk_gender PRIMARY KEY (id_gender)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

--------------------------------------------------------------------------------------------------

CREATE TABLE educational_center
(
    id_center NUMBER(6),
    center_name NVARCHAR2(50) CONSTRAINT center_name_nn NOT NULL
);

ALTER TABLE educational_center
ADD
CONSTRAINT pk_center PRIMARY KEY (id_center)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

--------------------------------------------------------------------------------------------------

CREATE TABLE person
(
    id_person NUMBER(6),
    first_name NVARCHAR2(20) CONSTRAINT first_name_nn NOT NULL,
    second_name NVARCHAR2(20),
    last_name NVARCHAR2(25) CONSTRAINT last_name_nn NOT NULL,
    second_last_name NVARCHAR2(25) CONSTRAINT second_last_name_nn NOT NULL,
    accepts_T_and_C NUMBER(1) CONSTRAINT accepts_T_and_C_check CHECK(accepts_T_and_C=0 OR accepts_T_and_C=1),
    birthday DATE CONSTRAINT birthday_nn NOT NULL,
    age NUMBER(2) CONSTRAINT age_nn NOT NULL,
    institutional_email NVARCHAR2(25) CONSTRAINT email_nn NOT NULL,
    password_hash NVARCHAR2(2000) CONSTRAINT password_hash_nn NOT NULL,
    id_personal_fk NUMBER(6) CONSTRAINT id_personal_fk_nn NOT NULL,
    id_gender_fk NUMBER(6) CONSTRAINT id_gender_fk_nn NOT NULL,
    id_center_fk NUMBER(6) CONSTRAINT id_center_fk_nn NOT NULL,
    id_app_fk NUMBER(6) CONSTRAINT id_app_fk_nn NOT NULL
);

ALTER TABLE person
ADD
CONSTRAINT pk_person PRIMARY KEY (id_person)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE personal_id
ADD
CONSTRAINT fk_person_personalID FOREIGN KEY (id_person_fk) REFERENCES person(id_person);

ALTER TABLE person
ADD
CONSTRAINT fk_person_center FOREIGN KEY (id_center_fk) REFERENCES educational_center(id_center);

ALTER TABLE person
ADD
CONSTRAINT fk_person_gender FOREIGN KEY (id_gender_fk) REFERENCES gender(id_gender);

ALTER TABLE person
ADD
CONSTRAINT fk_person_app FOREIGN KEY (id_app_fk) REFERENCES carpool_app(id_app);

--------------------------------------------------------------------------------------------------

CREATE TABLE rating
(
    id_rating NUMBER(6),
    comments NVARCHAR2(100),
    score NUMBER(2) CONSTRAINT score_check_nn CHECK(score BETWEEN 0 AND 11) NOT NULL,
    id_person_fk NUMBER(6)
);

ALTER TABLE rating
ADD
CONSTRAINT pk_rating PRIMARY KEY (id_rating)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE rating
ADD
CONSTRAINT fk_rating_person FOREIGN KEY (id_person_fk) REFERENCES person(id_person);

--------------------------------------------------------------------------------------------------

CREATE TABLE picture
(
    id_picture NUMBER(6),
    picture BLOB,
    picture_name NVARCHAR2(20) CONSTRAINT score_nn NOT NULL,
    id_person_fk NUMBER(6)
);

ALTER TABLE picture
ADD
CONSTRAINT pk_picture PRIMARY KEY (id_picture)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE picture
ADD
CONSTRAINT fk_picture_person FOREIGN KEY (id_person_fk) REFERENCES person(id_person);

--------------------------------------------------------------------------------------------------

CREATE TABLE driver
(
    id_driver NUMBER(6),
    license_number NVARCHAR2(12) CONSTRAINT license_number_nn NOT NULL,
    expiration_date DATE CONSTRAINT expiration_date_nn NOT NULL,
    id_person_fk NUMBER(6)
);

ALTER TABLE driver
ADD
CONSTRAINT pk_driver PRIMARY KEY (id_driver)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE driver
ADD
CONSTRAINT fk_driver_person FOREIGN KEY (id_person_fk) REFERENCES person(id_person);

--------------------------------------------------------------------------------------------------

CREATE TABLE passenger
(
    id_passenger NUMBER(6),
    id_person_fk NUMBER(6)
);

ALTER TABLE passenger
ADD
CONSTRAINT pk_passenger PRIMARY KEY (id_passenger)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE passenger
ADD
CONSTRAINT fk_passenger_person FOREIGN KEY (id_person_fk) REFERENCES person(id_person);

--------------------------------------------------------------------------------------------------

CREATE TABLE admin_info
(
    id_admin NUMBER(6),
    admin_name NVARCHAR2(20) CONSTRAINT admin_nn NOT NULL,
    id_person_fk NUMBER(6)
);

ALTER TABLE admin_info
ADD
CONSTRAINT pk_admin PRIMARY KEY (id_admin)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE admin_info
ADD
CONSTRAINT fk_admin_person FOREIGN KEY (id_person_fk) REFERENCES person(id_person);

--------------------------------------------------------------------------------------------------

CREATE TABLE trip_preference
(
    id_trip_preference NUMBER(6),
    seat_preference NVARCHAR2(5),
    communication NUMBER(1) CONSTRAINT communication_check CHECK(communication=0 OR communication=1 OR communication=2),
    entertaiment NUMBER(1) CONSTRAINT entertaiment_check CHECK(entertaiment=0 OR entertaiment=1),
    music_genre NVARCHAR2(20),
    id_person_fk NUMBER(6)
);

ALTER TABLE trip_preference
ADD
CONSTRAINT pk_trip_prefrence PRIMARY KEY (id_trip_preference)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE trip_preference
ADD
CONSTRAINT fk_preference_person FOREIGN KEY (id_person_fk) REFERENCES person(id_person);

--------------------------------------------------------------------------------------------------

CREATE TABLE vehicle
(
    id_vehicle NUMBER(6),
    seat_quantity NUMBER(2),
    brand NVARCHAR2(15) CONSTRAINT brand_nn NOT NULL,
    car_model NVARCHAR2(15) CONSTRAINT car_model_nn NOT NULL,
    color NVARCHAR2(15) CONSTRAINT color_nn NOT NULL,
    plate_number NVARCHAR2(6) CONSTRAINT plate_number_nn NOT NULL,
                              CONSTRAINT plate_number_uk UNIQUE(plate_number),
    id_driver_fk NUMBER(6)
);

ALTER TABLE vehicle
ADD
CONSTRAINT pk_vehicle PRIMARY KEY (id_vehicle)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE vehicle
ADD
CONSTRAINT fk_vehicle_driver FOREIGN KEY (id_driver_fk) REFERENCES driver(id_driver);

--------------------------------------------------------------------------------------------------

CREATE TABLE payment_method
(
    id_payment_method NUMBER(6),
    payment_type NUMBER(1) CONSTRAINT payment_type_nn NOT NULL,
                           CONSTRAINT payment_type_check CHECK(payment_type=0 OR payment_type=1 OR payment_type=2),
    amount FLOAT CONSTRAINT amount_nn NOT NULL
);

ALTER TABLE payment_method
ADD
CONSTRAINT pk_payment_method PRIMARY KEY (id_payment_method)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

--------------------------------------------------------------------------------------------------

CREATE TABLE route
(
    id_route NUMBER(6),
    start_time NVARCHAR2(5) CONSTRAINT route_start_time_nn NOT NULL,
    end_time NVARCHAR2(5)CONSTRAINT route_end_time_nn NOT NULL,
    estimated_duration NVARCHAR2(5) CONSTRAINT route_estimated_duration_nn NOT NULL,
    available_space NUMBER(2) CONSTRAINT available_spaces_check_nn CHECK(available_space>=0 AND available_space<10) NOT NULL,
    id_vehicle_fk NUMBER(6),
    id_payment_fk NUMBER(6)
);

ALTER TABLE route
ADD
CONSTRAINT pk_route PRIMARY KEY (id_route)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE route
ADD
CONSTRAINT fk_route_vehicle FOREIGN KEY (id_vehicle_fk) REFERENCES vehicle(id_vehicle);

ALTER TABLE route
ADD
CONSTRAINT fk_route_payment FOREIGN KEY (id_payment_fk) REFERENCES payment_method(id_payment_method);

--------------------------------------------------------------------------------------------------

CREATE TABLE weekday
(
    id_day NUMBER(6),
    day_name NVARCHAR2(10)
);

ALTER TABLE weekday
ADD
CONSTRAINT pk_day PRIMARY KEY (id_day)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

--------------------------------------------------------------------------------------------------

CREATE TABLE schedule
(
    id_schedule NUMBER(6),
    recurrence NVARCHAR2(5) CONSTRAINT recurrence_nn NOT NULL,
    id_day_fk NUMBER(6)
    
);

ALTER TABLE schedule
ADD
CONSTRAINT pk_schedule PRIMARY KEY (id_schedule)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE schedule
ADD
CONSTRAINT fk_schedule_day FOREIGN KEY (id_day_fk) REFERENCES weekday(id_day);

--------------------------------------------------------------------------------------------------

CREATE TABLE key_location
(
    id_key_location NUMBER(6),
    location_name NVARCHAR2(50) CONSTRAINT location_name_nn NOT NULL,
    road_name NVARCHAR2(50) CONSTRAINT key_location_nn NOT NULL,
    relevant_location_1 NVARCHAR2(50) CONSTRAINT location_1_nn NOT NULL,
    relevant_location_2 NVARCHAR2(50) CONSTRAINT location_2_nn NOT NULL,
    id_route_fk NUMBER(6)
);

ALTER TABLE key_location
ADD
CONSTRAINT pk_key_location PRIMARY KEY (id_key_location)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE key_location
ADD
CONSTRAINT fk_location_route FOREIGN KEY (id_route_fk) REFERENCES route(id_route);

--------------------------------------------------------------------------------------------------

CREATE TABLE booking
(
    id_booking NUMBER(6),
    boooking_date DATE CONSTRAINT booking_date_nn NOT NULL,
    start_time NVARCHAR2(5) CONSTRAINT start_time_nn NOT NULL,
    end_time NVARCHAR2(5)CONSTRAINT end_time_nn NOT NULL,
    total_estimated_time NVARCHAR2(5) CONSTRAINT tota_estimated_nn NOT NULL,
    booking_comment NVARCHAR2(40) CONSTRAINT booking_comment_nn NOT NULL,
    id_passenger_fk NUMBER(6),
    id_route_fk NUMBER(6),
    id_pickup_point_fk NUMBER(6)
);

ALTER TABLE booking
ADD
CONSTRAINT pk_booking PRIMARY KEY (id_booking)
USING INDEX
TABLESPACE PROJ_Ind PCTFREE 20
STORAGE (INITIAL 10K NEXT 10K PCTINCREASE 0);

ALTER TABLE booking
ADD
CONSTRAINT fk_booking_passenger FOREIGN KEY (id_passenger_fk) REFERENCES passenger(id_passenger);

ALTER TABLE booking
ADD
CONSTRAINT fk_booking_route FOREIGN KEY (id_route_fk) REFERENCES route(id_route);

ALTER TABLE booking
ADD
CONSTRAINT fk_booking_key_location FOREIGN KEY (id_pickup_point_fk) REFERENCES key_location(id_key_location);
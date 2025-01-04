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

----------------------------------------------------------------------------------------------------

CREATE TABLE address
(
    id_address NUMBER(6),
    exact_address VARCHAR(70) CONSTRAINT exact_address_nn NOT NULL,
    zip_code VARCHAR(7),
    id_district_fk NUMBER(6)
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
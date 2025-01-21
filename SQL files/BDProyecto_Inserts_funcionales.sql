INSERT INTO country(id_country, country_name)
VALUES(s_country.nextval, 'COSTA RICA');

INSERT INTO country(id_country, country_name)
VALUES(s_country.nextval, 'EXTRANJERO');


INSERT INTO province(id_province, province_name, id_country_fk) VALUES (s_province.nextval, 'EXTRANJERO',1);
INSERT INTO province(id_province, province_name, id_country_fk) VALUES (s_province.nextval, 'SAN JOSE',0);
INSERT INTO province(id_province, province_name, id_country_fk) VALUES (s_province.nextval, 'ALAJUELA',0);
INSERT INTO province(id_province, province_name, id_country_fk) VALUES (s_province.nextval, 'CARTAGO',0);
INSERT INTO province(id_province, province_name, id_country_fk) VALUES (s_province.nextval, 'HEREDIA',0);
INSERT INTO province(id_province, province_name, id_country_fk) VALUES (s_province.nextval, 'GUANACASTE',0);
INSERT INTO province(id_province, province_name, id_country_fk) VALUES (s_province.nextval, 'PUNTARENAS',0);
INSERT INTO province(id_province, province_name, id_country_fk) VALUES (s_province.nextval, 'LIMON',0);




INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'ACOSTA', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'ALAJUELITA', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'ASERRI', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'CURRIDABAT', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'DESAMPARADOS', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'DOTA', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'ESCAZU', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'GOICOCHEA', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'LEON CORTES', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'MONTES DE OCA', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'MORA', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'MORAVIA', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'PEREZ ZELEDON', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'PURISCAL', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SAN JOSE', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'TARRAZU', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SANTA ANA', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'TIBAS', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'TURRUBARES', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'VAZQUEZ DE CORONADO', 1);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'ALAJUELA', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'ATENAS', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'GRECIA', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'GUATUSO', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'LOS CHILES', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'NARANJO', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'OROTINA', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'PALMARES', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'POAS', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'RIO CUARTO', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SAN CARLOS', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SAN MATEO', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SAN RAMON', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SARCHI', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'UPALA', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'ZARCERO', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'PEÑAS BLANCAS', 2);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'ALVARADO', 3);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'EL GUARCO', 3);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'JIMENEZ', 3);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'LA UNION', 3);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'OREAMUNO', 3);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'PARAISO', 3);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'TURRIALBA', 3);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'CERVANTES', 3);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'TUCURRIQUE', 3);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'BARVA', 4);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'BELEN', 4);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'FLORES', 4);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'HEREDIA', 4);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SAN ISIDRO', 4);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SAN PABLO', 4);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SAN RAFAEL', 4);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SANTA BARBARA', 4);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SANTO DOMINGO', 4);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SARAPIQUI', 4);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'ABANGARES', 5);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'BAGACES', 5);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'CAÑAS', 5);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'CARRILLO', 5);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'COLORADO', 5);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'HOJANCHA', 5);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'LA CRUZ', 5);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'LIBERIA', 5);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'NANDAYURE', 5);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'NICOYA', 5);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SANTA CRUZ', 5);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'TILARAN', 5);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'GUACIMO', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'LIMON', 7);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'MATINA', 7);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'POCOCI', 7);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'SIQUIRRES', 7);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'TALAMANCA', 7);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'BUENOS AIRES', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'CORREDORES', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'COTO BRUS', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'ESPARZA', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'GARABITO', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'MONTES DE ORO', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'MONTEVERDE', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'OSA', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'PARRITA', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'PUNTARENAS', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'QUEPOS', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'COBANO', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'LEPANTO', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'PAQUERA', 6);
INSERT INTO municipality(id_municipality, municipality_name, id_province_fk) VALUES (s_municipality.nextval, 'CARTAGO', 3);



INSERT INTO gender(id_gender, gender) VALUES (s_gender.nextval, 'MASCULINO');
INSERT INTO gender(id_gender, gender) VALUES (s_gender.nextval, 'FEMENINO');
INSERT INTO gender(id_gender, gender) VALUES (s_gender.nextval, 'OTRO');

INSERT INTO educational_center(id_center, center_name) VALUES (s_center.nextval, 'TEC');
INSERT INTO educational_center(id_center, center_name) VALUES (s_center.nextval, 'UCR');
INSERT INTO educational_center(id_center, center_name) VALUES (s_center.nextval, 'UNA');
INSERT INTO educational_center(id_center, center_name) VALUES (s_center.nextval, 'UNED');

INSERT INTO carpool_app(id_app, app_name, t_and_c)
VALUES(
    s_app.nextval,
    'UniDrive Carpooling',
    'Welcome to our Carpool App, designed solely for educational purposes as part of a school project. By using this app, you acknowledge that it is not intended for commercial use and is meant to facilitate learning and collaboration among users.

    All data collected during your use of the app will be stored temporarily and will be erased upon project completion. We prioritize your privacy and ensure that no personal information will be retained beyond the duration of this project.

    By participating, you agree to use the app responsibly and understand that any misuse may result in removal from the project. Thank you for your cooperation and support in our educational endeavor!'
    );
use pruebatecnica;
INSERT INTO `pruebatecnica`.`dueño` VALUES(1, 'Torrez',sysdate(),35855188,'Facundo',0,sysdate());
INSERT INTO `pruebatecnica`.`dueño` VALUES(2,'Rivera',sysdate(),41667739,'Tomas',1,sysdate());
INSERT INTO `pruebatecnica`.`dueño` VALUES(3,'Zorrilla',sysdate(),4568979,'Hectot',0,sysdate());
INSERT INTO `pruebatecnica`.`dueño` VALUES(4,'Medrano',sysdate(),5855188,'Elias',0,sysdate());
INSERT INTO `pruebatecnica`.`dueño` VALUES(5,'Torrez',sysdate(),3555188,'Camila',0,sysdate());
INSERT INTO `pruebatecnica`.`dueño` VALUES(6,'Rodriguez',sysdate(),25855188,'Luis',0,sysdate());

INSERT INTO `pruebatecnica`.`vehiculo` VALUES(1,sysdate(),'RES543','Toyota','Corolla',sysdate(),1);
INSERT INTO `pruebatecnica`.`vehiculo` VALUES(2,sysdate(),'AES563','Toyota','Etios',sysdate(),2);
INSERT INTO `pruebatecnica`.`vehiculo` VALUES(3,sysdate(),'BE2543','Fiat','Uno',sysdate(),3);
INSERT INTO `pruebatecnica`.`vehiculo` VALUES(4,sysdate(),'TES541','Peugeot','308',sysdate(),4);
INSERT INTO `pruebatecnica`.`vehiculo` VALUES(5,sysdate(),'DET543','Renault','Duster',sysdate(),5);
INSERT INTO `pruebatecnica`.`vehiculo` VALUES(6,sysdate(),'PES542','Renault','Sandero',sysdate(),6);

INSERT INTO `pruebatecnica`.`inspector` VALUES(1, 'Carniglia',sysdate(),51287971,'Nicolas',sysdate());
INSERT INTO `pruebatecnica`.`inspector` VALUES(2, 'Perez',sysdate(),41287971,'Daniel',sysdate());

INSERT INTO `pruebatecnica`.`inspecciones` VALUES(1,sysdate(),0,0,0,sysdate(),100,1,3);
INSERT INTO `pruebatecnica`.`inspecciones` VALUES(2,sysdate(),0,0,0,sysdate(),100,1,8);
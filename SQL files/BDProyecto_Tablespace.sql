CREATE TABLESPACE PROJ_Data
   DATAFILE 'D:\app\memis\oradata\BDProyecto\projdata01.dbf'
   SIZE 50M
   REUSE
   AUTOEXTEND ON
   NEXT 512k
   MAXSIZE 200M;
--
-- PE: INDEX
--
CREATE TABLESPACE PROJ_Ind
   DATAFILE 'D:\app\memis\oradata\BDProyecto\projind01.dbf'
   SIZE 50M
   REUSE
   AUTOEXTEND ON
   NEXT 512k
   MAXSIZE 200M;


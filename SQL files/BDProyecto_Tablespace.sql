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
   
   
   
--------------------------------------------------------------------------------

CREATE TABLESPACE PROJ_ADM_Data
   DATAFILE 'D:\app\memis\oradata\BDProyecto\projadmdata01.dbf'
   SIZE 50M
   REUSE
   AUTOEXTEND ON
   NEXT 512k
   MAXSIZE 200M;
--
-- PE: INDEX
--
CREATE TABLESPACE PROJ_ADM_Ind
   DATAFILE 'D:\app\memis\oradata\BDProyecto\projadmind01.dbf'
   SIZE 50M
   REUSE
   AUTOEXTEND ON
   NEXT 512k
   MAXSIZE 200M;
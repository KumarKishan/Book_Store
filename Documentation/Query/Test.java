
SQL*Loader: Release 10.2.0.3.0 - Production on Mon Nov 7 08:05:53 2016

Copyright (c) 1982, 2005, Oracle.  All rights reserved.

Control File:   E:\github\JProjects\Book_Store\Documentation\Query\Test.ctl
Data File:      E:\github\JProjects\Book_Store\Documentation\Query\Users.csv
  Bad File:     E:\github\JProjects\Book_Store\Documentation\Query\Users.bad
  Discard File:  none specified
 
 (Allow all discards)

Number to load: ALL
Number to skip: 0
Errors allowed: 50
Bind array:     64 rows, maximum of 256000 bytes
Continuation:    none specified
Path used:      Conventional

Table USER_DATA, loaded from every logical record.
Insert option in effect for this table: INSERT
TRAILING NULLCOLS option in effect

   Column Name                  Position   Len  Term Encl Datatype
------------------------------ ---------- ----- ---- ---- ---------------------
USER_ID                             FIRST     *   ,       CHARACTER            
PASSWORD                             NEXT     *   ,       CHARACTER            
NAME                                 NEXT     *   ,       CHARACTER            
ADDRESS                              NEXT     *   ,       CHARACTER            
CONTACT_NO                           NEXT     *   ,       CHARACTER            
EMAIL                                NEXT     *   ,       CHARACTER            
SEC_ID_TYPE                          NEXT     *   ,       CHARACTER            
SEC_ID_NUMBER                        NEXT     *   ,       CHARACTER            
ROLE                                 NEXT     *   ,       CHARACTER            
SEX                                  NEXT     *   ,       CHARACTER            
AGE                                  NEXT     *   ,       CHARACTER            
DEPOSITION_AMT                       NEXT     *   ,       CHARACTER            
LAST_TRANSACTION_TIME                NEXT     *   ,       CHARACTER            


Table USER_DATA:
  21 Rows successfully loaded.
  0 Rows not loaded due to data errors.
  0 Rows not loaded because all WHEN clauses were failed.
  0 Rows not loaded because all fields were null.


Space allocated for bind array:                 214656 bytes(64 rows)
Read   buffer bytes: 1048576

Total logical records skipped:          0
Total logical records read:            21
Total logical records rejected:         0
Total logical records discarded:        0

Run began on Mon Nov 07 08:05:53 2016
Run ended on Mon Nov 07 08:05:54 2016

Elapsed time was:     00:00:00.53
CPU time was:         00:00:00.08

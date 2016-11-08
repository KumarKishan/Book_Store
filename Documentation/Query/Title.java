
SQL*Loader: Release 10.2.0.3.0 - Production on Mon Nov 7 11:32:25 2016

Copyright (c) 1982, 2005, Oracle.  All rights reserved.

Control File:   E:\github\JProjects\Book_Store\Documentation\Query\Test.ctl
Data File:      E:\github\JProjects\Book_Store\Documentation\Query\Title.csv
  Bad File:     E:\github\JProjects\Book_Store\Documentation\Query\Title.bad
  Discard File:  none specified
 
 (Allow all discards)

Number to load: ALL
Number to skip: 0
Errors allowed: 50
Bind array:     64 rows, maximum of 256000 bytes
Continuation:    none specified
Path used:      Conventional

Table TITLE, loaded from every logical record.
Insert option in effect for this table: INSERT
TRAILING NULLCOLS option in effect

   Column Name                  Position   Len  Term Encl Datatype
------------------------------ ---------- ----- ---- ---- ---------------------
ISBN                                FIRST     *   ,       CHARACTER            
TITLE                                NEXT     *   ,       CHARACTER            
ABSTRACT                             NEXT     *   ,       CHARACTER            
EDITION                              NEXT     *   ,       CHARACTER            
DATE_PUBLISH                         NEXT     *   ,       CHARACTER            
CATEGORY_GENRE                       NEXT     *   ,       CHARACTER            
TITLE_COVER_PIC                      NEXT     *   ,       CHARACTER            
QUANTITY                             NEXT     *   ,       CHARACTER            
LANGUAGE                             NEXT     *   ,       CHARACTER            
PUBLISHER_NAME                       NEXT     *   ,       CHARACTER            
FINE_DAY                             NEXT     *   ,       CHARACTER            
RENTAL_PRICE                         NEXT     *   ,       CHARACTER            
COST                                 NEXT     *   ,       CHARACTER            
PURCHASE_DATE                        NEXT     *   ,       CHARACTER            
SELLER_NAME                          NEXT     *   ,       CHARACTER            
SELLER_ADDRESS                       NEXT     *   ,       CHARACTER            
SELLER_CONTACT                       NEXT     *   ,       CHARACTER            
FREQUENCY_ID                         NEXT     *   ,       CHARACTER            

value used for ROWS parameter changed from 64 to 55
Record 1: Rejected - Error on table TITLE, column EDITION.
ORA-01722: invalid number

Record 10: Rejected - Error on table TITLE, column DATE_PUBLISH.
ORA-01843: not a valid month


Table TITLE:
  8 Rows successfully loaded.
  2 Rows not loaded due to data errors.
  0 Rows not loaded because all WHEN clauses were failed.
  0 Rows not loaded because all fields were null.


Space allocated for bind array:                 255420 bytes(55 rows)
Read   buffer bytes: 1048576

Total logical records skipped:          0
Total logical records read:            10
Total logical records rejected:         2
Total logical records discarded:        0

Run began on Mon Nov 07 11:32:25 2016
Run ended on Mon Nov 07 11:32:25 2016

Elapsed time was:     00:00:00.22
CPU time was:         00:00:00.05

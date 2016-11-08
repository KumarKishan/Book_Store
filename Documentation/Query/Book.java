
SQL*Loader: Release 10.2.0.3.0 - Production on Mon Nov 7 11:40:17 2016

Copyright (c) 1982, 2005, Oracle.  All rights reserved.

Control File:   E:\github\JProjects\Book_Store\Documentation\Query\Test.ctl
Data File:      E:\github\JProjects\Book_Store\Documentation\Query\Book.csv
  Bad File:     E:\github\JProjects\Book_Store\Documentation\Query\Book.bad
  Discard File:  none specified
 
 (Allow all discards)

Number to load: ALL
Number to skip: 0
Errors allowed: 50
Bind array:     64 rows, maximum of 256000 bytes
Continuation:    none specified
Path used:      Conventional

Table BOOK, loaded from every logical record.
Insert option in effect for this table: INSERT
TRAILING NULLCOLS option in effect

   Column Name                  Position   Len  Term Encl Datatype
------------------------------ ---------- ----- ---- ---- ---------------------
BOOK_ID                             FIRST     *   ,       CHARACTER            
CALL_NUMBER                          NEXT     *   ,       CHARACTER            
ISBN                                 NEXT     *   ,       CHARACTER            
STATUS                               NEXT     *   ,       CHARACTER            

Record 205: Rejected - Error on table BOOK.
ORA-00001: unique constraint (SYSTEM.SYS_C006897) violated


Table BOOK:
  209 Rows successfully loaded.
  1 Row not loaded due to data errors.
  0 Rows not loaded because all WHEN clauses were failed.
  0 Rows not loaded because all fields were null.


Space allocated for bind array:                  66048 bytes(64 rows)
Read   buffer bytes: 1048576

Total logical records skipped:          0
Total logical records read:           210
Total logical records rejected:         1
Total logical records discarded:        0

Run began on Mon Nov 07 11:40:17 2016
Run ended on Mon Nov 07 11:40:17 2016

Elapsed time was:     00:00:00.16
CPU time was:         00:00:00.08

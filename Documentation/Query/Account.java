
SQL*Loader: Release 10.2.0.3.0 - Production on Mon Nov 7 11:52:38 2016

Copyright (c) 1982, 2005, Oracle.  All rights reserved.

Control File:   E:\github\JProjects\Book_Store\Documentation\Query\Test.ctl
Data File:      E:\github\JProjects\Book_Store\Documentation\Query\Account.csv
  Bad File:     E:\github\JProjects\Book_Store\Documentation\Query\Account.bad
  Discard File:  none specified
 
 (Allow all discards)

Number to load: ALL
Number to skip: 0
Errors allowed: 50
Bind array:     64 rows, maximum of 256000 bytes
Continuation:    none specified
Path used:      Conventional

Table ACCOUNT, loaded from every logical record.
Insert option in effect for this table: INSERT
TRAILING NULLCOLS option in effect

   Column Name                  Position   Len  Term Encl Datatype
------------------------------ ---------- ----- ---- ---- ---------------------
SR_NO                               FIRST     *   ,       CHARACTER            
MEMBER_ID                            NEXT     *   ,       CHARACTER            
PAY_DATE                             NEXT     *   ,       CHARACTER            
CR_DEBIT                             NEXT     *   ,       CHARACTER            
AMOUNT                               NEXT     *   ,       CHARACTER            
NARRATION                            NEXT     *   ,       CHARACTER            
TRANSACTION_TYPE                     NEXT     *   ,       CHARACTER            
TRANSACTION_ID                       NEXT     *   ,       CHARACTER            
MEMO_ID                              NEXT     *   ,       CHARACTER            


Table ACCOUNT:
  18 Rows successfully loaded.
  0 Rows not loaded due to data errors.
  0 Rows not loaded because all WHEN clauses were failed.
  0 Rows not loaded because all fields were null.


Space allocated for bind array:                 148608 bytes(64 rows)
Read   buffer bytes: 1048576

Total logical records skipped:          0
Total logical records read:            18
Total logical records rejected:         0
Total logical records discarded:        0

Run began on Mon Nov 07 11:52:38 2016
Run ended on Mon Nov 07 11:52:38 2016

Elapsed time was:     00:00:00.17
CPU time was:         00:00:00.06


SQL*Loader: Release 10.2.0.3.0 - Production on Mon Nov 7 11:48:45 2016

Copyright (c) 1982, 2005, Oracle.  All rights reserved.

Control File:   E:\github\JProjects\Book_Store\Documentation\Query\Test.ctl
Data File:      E:\github\JProjects\Book_Store\Documentation\Query\Transaction.csv
  Bad File:     E:\github\JProjects\Book_Store\Documentation\Query\Transaction.bad
  Discard File:  none specified
 
 (Allow all discards)

Number to load: ALL
Number to skip: 0
Errors allowed: 50
Bind array:     64 rows, maximum of 256000 bytes
Continuation:    none specified
Path used:      Conventional

Table TRANSACTION, loaded from every logical record.
Insert option in effect for this table: INSERT
TRAILING NULLCOLS option in effect

   Column Name                  Position   Len  Term Encl Datatype
------------------------------ ---------- ----- ---- ---- ---------------------
TRANSACTION_ID                      FIRST     *   ,       CHARACTER            
TRANS_TYPE                           NEXT     *   ,       CHARACTER            
TRANS_DATE                           NEXT     *   ,       CHARACTER            
MEMBER_ID                            NEXT     *   ,       CHARACTER            
REF_ID                               NEXT     *   ,       CHARACTER            
TOTAL_AMOUNT                         NEXT     *   ,       CHARACTER            
USER_ID                              NEXT     *   ,       CHARACTER            
MEMO_ID                              NEXT     *   ,       CHARACTER            
TRA_DETAIL_ID                        NEXT     *   ,       CHARACTER            
STATUS                               NEXT     *   ,       CHARACTER            
NARRATION                            NEXT     *   ,       CHARACTER            

Record 19: Discarded - all columns null.
Record 20: Discarded - all columns null.
Record 21: Discarded - all columns null.
Record 22: Discarded - all columns null.
Record 23: Discarded - all columns null.

Table TRANSACTION:
  18 Rows successfully loaded.
  0 Rows not loaded due to data errors.
  0 Rows not loaded because all WHEN clauses were failed.
  5 Rows not loaded because all fields were null.


Space allocated for bind array:                 181632 bytes(64 rows)
Read   buffer bytes: 1048576

Total logical records skipped:          0
Total logical records read:            23
Total logical records rejected:         0
Total logical records discarded:        5

Run began on Mon Nov 07 11:48:45 2016
Run ended on Mon Nov 07 11:48:45 2016

Elapsed time was:     00:00:00.15
CPU time was:         00:00:00.06

load data
infile "E:\github\JProjects\Book_Store\Documentation\Query\Account.csv"
insert into table Account
Fields Terminated BY ',' TRAILING NULLCOLS
(
SR_NO,
MEMBER_ID,
PAY_DATE,
CR_DEBIT,
AMOUNT,
NARRATION,
TRANSACTION_TYPE,
TRANSACTION_ID,
MEMO_ID
)
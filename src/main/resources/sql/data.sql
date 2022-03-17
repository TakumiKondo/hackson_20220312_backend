INSERT INTO Store VALUES (1, '新宿');
INSERT INTO Store VALUES (2, '渋谷');

INSERT INTO Staff VALUES (1, 1, '田中');
INSERT INTO Staff VALUES (2, 1, '佐藤');
INSERT INTO Staff VALUES (3, 2, '鈴木');
INSERT INTO Staff VALUES (4, 2, '渡辺');

INSERT INTO Customer VALUES (1, '田中', '1990-01-01', '1');
INSERT INTO Customer VALUES (2, '佐藤', '1990-02-01', '1');
INSERT INTO Customer VALUES (3, '鈴木', '1990-03-01', '2');
INSERT INTO Customer VALUES (4, '佐々木', '1990-04-01', '2');

INSERT INTO Ticket VALUES (1, '1', '田中', 10, null, null, 1);
INSERT INTO Ticket VALUES (2, '1', '佐藤', 3, null, null, 2);
INSERT INTO Ticket VALUES (3, '2', '佐藤', 20, null, null, 2);
INSERT INTO Ticket VALUES (4, '3', '鈴木', null, '2021-12-31', '2022-01-31', 3);


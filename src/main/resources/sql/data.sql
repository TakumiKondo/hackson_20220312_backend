INSERT INTO Store VALUES (1, '新宿');
INSERT INTO Store VALUES (2, '渋谷');

INSERT INTO Staff VALUES (1, 1, '田中');
INSERT INTO Staff VALUES (2, 1, '佐藤');
INSERT INTO Staff VALUES (3, 2, '鈴木');
INSERT INTO Staff VALUES (4, 2, '渡辺');

INSERT INTO Customer VALUES (1, '田中', '1990-01-01', '1', null);
INSERT INTO Customer VALUES (2, '佐藤', '1990-02-01', '1', null);
INSERT INTO Customer VALUES (3, '鈴木', '1990-03-01', '2', null);
INSERT INTO Customer VALUES (4, '佐々木', '1990-04-01', '2', null);

INSERT INTO Ticket VALUES (1, '1', '10回払い', 10, null, null, 1);
INSERT INTO Ticket VALUES (2, '2', '20回払い', 3, null, null, 2);
INSERT INTO Ticket VALUES (3, '3', '月会員', null, '2022-01-01', '2022-01-31', 2);
INSERT INTO Ticket VALUES (4, '4', '年会員', null, '2021-01-01', '2022-01-31', 3);
INSERT INTO Ticket VALUES (5, '4', '年会員', null, '2021-01-01', '2022-01-31', 4);

INSERT INTO History VALUES (1, 2, 2, 1, '2022-01-01', 1);
INSERT INTO History VALUES (2, 2, 2, 1, '2022-02-01', 2);
INSERT INTO History VALUES (3, 2, 2, 2, '2022-03-01', 3);
INSERT INTO History VALUES (4, 2, 2, 2, '2022-04-01', 4);
INSERT INTO History VALUES (5, 2, 2, 1, '2022-02-01', 2);
INSERT INTO History VALUES (6, 2, 2, 2, '2022-03-01', 3);
INSERT INTO History VALUES (7, 2, 2, 2, '2022-04-01', 4);
INSERT INTO History VALUES (8, 3, 4, 1, '2021-04-20', 2);

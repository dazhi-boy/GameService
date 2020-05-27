/*mock data***/
INSERT INTO user (username, password) 
VALUES 
('admin', '123'),
('password', '123');



INSERT INTO company (name, type, ceo, ceo_phone) 
VALUES 
('大智伟业', '销售业', '大智', '13765484561'),
('大智制造', '制造业', '大智', '13798465123');



INSERT INTO shop_category (company_id, title, parentid) 
VALUES 
(1, '蔬菜', 0),
(1, '水果', 0);



INSERT INTO shop_product (company_id, category_id, title, description,cover) 
VALUES 
(1, 1, '油菜花', '有机油菜花','/img/1/a1.jpg'),
(1, 1, '黄花菜', '有机黄花菜','/img/1/a2.jpg'),
(1, 1, '大白菜', '有机大白菜','/img/1/a3.jpg'),
(1, 1, '金针菇', '有机金针菇','/img/1/a1.jpg'),
(1, 1, '胡萝卜', '有机胡萝卜','/img/1/a2.jpg'),
(1, 1, '长山药', '有机长山药','/img/1/a3.jpg');








# SQL约束

## 1.NOT NULL 
强制不接受NULL值。
## 2.UNIQUE
UNIQUE约束唯一标识数据库中的每条记录。
而PRIMARY KEY拥有自动定义UNIQUE约束。
## 3.PRIMARY KEY
约束唯一标识数据库表中的每条记录。
主键必须包含唯一的值。
主键列不能包含NULL值。
每个表都只能有一个主键，并且每个表只有一个主键。
## 4.FOREIGN KEY
一个表中的FOREIGN KEY指向另一个表中的PRIMARY KEY。
## 5.CHECK
CHECK约束用于限制列中的值的范围。
比如设置`CHECK(id_P>0)`;
## 6.DEFAULT
DEFAULT 约束用于向列中插入默认值。
如果没有规定其他的值，那么会将默认值添加到所有的新记录。
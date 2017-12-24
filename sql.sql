
CREATE DATABASE design_db;
USE design_db;


DROP TABLE users;
CREATE TABLE users(
	id INT AUTO_INCREMENT PRIMARY KEY COMMENT '用户编号',
	username VARCHAR(50) NOT NULL COMMENT '登录账号',
	userpass VARCHAR(50) NOT NULL COMMENT '登录密码',
	nickname VARCHAR(50) COMMENT '用户昵称',
	createTime DATETIME COMMENT '创建时间',
	updateTime DATETIME COMMENT '最后修改时间',
	lastLogin DATETIME COMMENT '最后登录时间',
	userStatus INT COMMENT '用户状态 0 正常 1 锁定 2 删除'
) DEFAULT CHARSET "utf8";

INSERT INTO users(username, userpass,nickname,createTime,userStatus)
	VALUES("fyb", "123", "范一博", "2017-12-24", 0);
INSERT INTO users(username, userpass,nickname,createTime,userStatus)
	VALUES("nyc", "123", "倪雨轩", "2017-12-24", 0);
INSERT INTO users(username, userpass,nickname,createTime,userStatus)
	VALUES("ye", "123456", "叶敬伟","2017-12-24", 1);
INSERT INTO users(username, userpass,nickname,createTime,userStatus)
	VALUES("sun", "111111", "孙会钧","2017-12-24",1);
INSERT INTO users(username, userpass,nickname,createTime,userStatus)
	VALUES("test", "1", "测试", "2017-12-24", 0);
INSERT INTO users(username, userpass,nickname,createTime,userStatus)
	VALUES("t", "1", "测试", "2017-12-25", 1);
SELECT * FROM users;


#创建地址表
DROP TABLE address;
CREATE TABLE address(
	id 			INT AUTO_INCREMENT PRIMARY KEY 	COMMENT '主键',
	userid 		INT 							COMMENT '外键：关联用户表主键',
	defaultAddr	BOOLEAN							COMMENT '是否默认地址',
	nation 		VARCHAR(20) 					COMMENT '国家',
	province 	VARCHAR(20) 					COMMENT '省区',
	city 		VARCHAR(20) 					COMMENT '市区',
	country 	VARCHAR(20) 					COMMENT '县区'
) CHARSET "UTF8";
# 增加外键约束
ALTER TABLE address ADD FOREIGN KEY (userid) REFERENCES users(id);
# 增加测试数据
INSERT INTO address(userid, defaultAddr, nation, province, city, country)
	VALUES	(1, TRUE, "中国", "河南", "郑州", "金水区");

INSERT INTO address(id ,userid, defaultAddr, nation, province, city, country)
	VALUES	(2,1, FALSE, "中国", "福建", "嘉庚","南光8");
			
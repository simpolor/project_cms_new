CREATE TABLE `member` (
	`member_id` VARCHAR(20) NOT NULL COMMENT '회원 아이디',
	`member_pw` VARCHAR(50) NOT NULL COMMENT '회원 비밀번호',
	`member_name` VARCHAR(50) NOT NULL COMMENT '회원 이름',
	`member_nickname` VARCHAR(20) NOT NULL COMMENT '회원 닉네임',
	`member_email` VARCHAR(50) NOT NULL COMMENT '회원 이메일',
	`reg_id` VARCHAR(20) NULL DEFAULT NULL COMMENT '등록자 아이디',
	`reg_name` VARCHAR(50) NULL DEFAULT NULL COMMENT '등록자 이름',
	`reg_nickname` VARCHAR(50) NULL DEFAULT NULL COMMENT '등록자 닉네임',
	`reg_date` DATETIME NULL DEFAULT NULL COMMENT '등록일',
	`mod_id` VARCHAR(20) NULL DEFAULT NULL COMMENT '수정자 아이디',
	`mod_name` VARCHAR(50) NULL DEFAULT NULL COMMENT '수정자 이름',
	`mod_nickname` VARCHAR(50) NULL DEFAULT NULL COMMENT '수정자 닉네임',
	`mod_date` VARCHAR(50) NULL DEFAULT NULL COMMENT '수정일',
	`del_yn` CHAR(1) NOT NULL DEFAULT 'N' COMMENT '탈퇴유무',
	PRIMARY KEY (`member_id`)
);

CREATE TABLE `member_role` (
	`member_id` VARCHAR(50) NULL DEFAULT NULL,
	`role_code` VARCHAR(50) NULL DEFAULT NULL
);

CREATE TABLE `authority` (
	`role_name` VARCHAR(50) NULL DEFAULT NULL,
	`role_code` VARCHAR(50) NULL DEFAULT NULL
);
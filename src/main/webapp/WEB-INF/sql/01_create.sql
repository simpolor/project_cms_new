# 1. root권한으로 접속

# 2. mysql 사용
use mysql;

# 3. 데이터베이스 생성
create database devluff_cms;

# 4. 사용자 생성
insert into user ( host, user, password, ssl_cipher, x509_issuer , x509_subject, authentication_string )
     values ( '127.0.0.1', 'devluff', PASSWORD('devluff'), '', '', '', '' );
insert into user ( host, user, password, ssl_cipher, x509_issuer , x509_subject, authentication_string )
     values ( 'localhost', 'devluff', PASSWORD('devluff'), '', '', '', '' );

# 5. 데이터베이스 사용자 매핑
insert into db
     values ( '127.0.0.1', 'devluff_cms', 'devluff', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y');
insert into db
     values ( 'localhost', 'devluff_cms', 'devluff', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y', 'y');

# 6. 갱신
flush privileges;

# 7. devluff_cms 데이터베이스 사용
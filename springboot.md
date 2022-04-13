#springboot
####整合pom
- 一般在创建项目时勾选相关依赖
```xml
<!-- https://mvnrepository.com/artifact/com.baomidou/mybatisplus-spring-boot-starter -->

<!-- mybatisplusstarter -->
<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-boot-starter</artifactId>
    <version>3.5.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/com.alibaba/druid-spring-boot-starter -->

<!-- druid starter -->
<dependency>
<groupId>com.alibaba</groupId>
<artifactId>druid-spring-boot-starter</artifactId>
<version>1.2.9</version>
</dependency>
```
application.yam配置
```yaml
#配置服务器端口
server:
  port: 80
#配置druid数据库连接池
spring:
  datasource:
    druid:
      url: jdbc:mysql://localhost/zhguo
      username: root
      password: aabbcc570
      driver-class-name: com.mysql.cj.jdbc.Driver
# 配置数据库连接池 
#spring:
#  datasource:
#    url: jdbc:mysql://localhost:3306/zhguo
#    username: root
#    password: aabbcc570
#    driver-class-name: com.mysql.cj.jdbc.Driver
#取消驼峰命名
mybatis-plus:
  configuration:
    map-underscore-to-camel-case: false
# 开启主键递增，表名前缀
  global-config:
    db-config:
      id-type: auto
      table-prefix: t_
```
- mapper继承BaseMapper接口
  - select*****
  - insert*****
  - update*****
  - delete*****
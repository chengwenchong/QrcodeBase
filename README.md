### mqsql-mybatis application.yml文件配置
1.mybatis: 
    mapperLocations: classpath:/com/cheng/base/mappers/*.xml
    typeAliasesPackage: com.cheng.test.domain
2.database:
    host: localhost
    port: 3306
    name: qrcode_demo
3.datasource:
        url: jdbc:mysql://${database.host}:${database.port}/${database.name}?useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true
        username: root   //改成自己本地
        password: toor   //改成自己本地
        driver-class-name: com.mysql.jdbc.Driver
        maxActive: 1000
        initialSize: 10
        maxWait: 60000
        minIdle: 5
        test-on-borrow: true 
        test-on-return: true
        validation-query: SELECT 1
4.  <dependency>
	    <groupId>mysql</groupId>
	    <artifactId>mysql-connector-java</artifactId>
	</dependency>
5.	<dependency>
    	<groupId>org.mybatis.spring.boot</groupId>
	    <artifactId>mybatis-spring-boot-starter</artifactId>
	    <version>1.1.1</version>
	</dependency>

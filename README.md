### mqsql-mybatis application.yml文件配置
mybatis: 
    mapperLocations: classpath:/com/cheng/base/mappers/*.xml
    typeAliasesPackage: com.cheng.test.domain
database:
    host: localhost
    port: 3306
    name: qrcode_demo
datasource:
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
# 宜诺后台管理平台V2

### Deploy it

1. Execute the SQL script in MySQL `src/main/db/mysql/schema.sql`
2. Modify `application.properties`, for DB urls and logs location; `application-prod.properties` is for the production env
3. Package it, `mvn clean package -DskipTests`

### Run it
```
nohup java -Xms384m -Xmx384m -jar target/admin-0.0.1-SNAPSHOT.jar >console.log 2>&1 &
```

### Release it

http://admin.yinuo-tech.com/

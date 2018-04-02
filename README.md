应用上下文持有容器

可以方便的从spring容器中取出当前应用上下文，需要在项目里添加依赖项，并配置为启用

添加依赖项:

```pom
<dependency>
  <groupId>com.minlia.cloud.starter</groupId>
  <artifactId>cloud-starter-context</artifactId>
  <version>2.0.0.RELEASE</version>
</dependency>
```

应用配置项：


application-dev.yml
```yaml
system:
  context-holder:
    enabled: true
```

application-dev.properties

```properties
system.context-holder.enabled=true
```



# 应用上下文持有器  

可以方便的从spring容器中取出当前应用上下文，需要在项目里添加依赖项，并配置为启用  

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.minlia.cloud.starter/cloud-starter-context/badge.svg?style=plastic)](https://maven-badges.herokuapp.com/maven-central/com.minlia.cloud.starter/cloud-starter-context/) 
[![Apache License 2](https://img.shields.io/badge/license-ASF2-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0.txt) 
[![Build Status](https://travis-ci.org/minlia-projects/cloud-starter-context.svg?branch=master)](https://travis-ci.org/minlia-projects/cloud-starter-context)
[![Waffle.io - Columns and their card count](https://badge.waffle.io/minlia-projects/cloud-starter-context.svg?columns=all)](https://waffle.io/minlia-projects/cloud-starter-context)

## 集成到自已的项目时添加依赖项  

```pom
<dependency>
  <groupId>com.minlia.cloud.starter</groupId>
  <artifactId>cloud-starter-context</artifactId>
  <version>2.0.0.RELEASE</version>
</dependency>
```

##应用配置项：

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



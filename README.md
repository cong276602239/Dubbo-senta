# dubbo-demo

#### 介绍
dubbo的demo

#### 软件架构
使用阿里ddubbo框架，注册中心使用zk,分布式事务使用阿里seata中间件


#### 安装教程

1.  jdk1.8
2.  使用maven导入jar包
3.  数据库使用mysql 8.0.2  注意：mysql8的jdbc驱动和mysql其他版本不一致，请注意更改
4.  配置中心使用nacos
5.  seata中间件下载 https://github.com/seata/seata/releases


#### 使用说明

1.  访问测试地址localhost:8080/api/user/order/inser 
2.  入参{
      	"user": {
      		"name": "xxx"
      	}
      }

#### 项目说明

1. demo-core 所有项目使用jar包项目
2. demo-pojo 项目使用的dto bean 枚举 公共类 项目
3. demo-user-api  对外暴露的服务的抽象类接口
4. demo-user-api-impl 对应的服务的实现
5. dubbodemo-web 对外暴露的api地址 





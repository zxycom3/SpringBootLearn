# mvn

```mvn archetype: generate```

-DgroupId=com.cdutetc
-DartifactId=spring002
使用哪一个构建
-DarchetypeArtifactId=spring-boot-maven-archetype
指定版本
-DarchetypeVersion=3.2.5


## 完整的创建指令

mvn archetype:generate -DgroupId=com.cdutetc -DartifaceId=spring002 -DarchetypeArtifactId=spring-boot-maven-archetype -DarchetypeVersion=3.2.5


# curl
curl https://start.spring.io/starter.zip -o demo.zip

curl 地址                                输出为
curl https://start.spring.io/starter.zip -o demo.zip -d type=maven-project -d groupId=com.cdutetc -d name=demp -d packageName=com.cdutetc.demo -d javaVersion=17 -d bootVersion=3.5.6

upzip demo.zip -d spring-demo


# 传递参数 ？

## 传参数之前的问题？

企业开发的时候，不会为某一个api构建单独的返回模式，因为工程化的开发中，要求，前后端，必须使用相同的反馈形式。
在正式项目开发之前，我们需要准备一个标准数据返回模板（准备一个什么数据都可以存放的类）

在该类中，按如下组织：
code
message
data
success


## 参数返回的形式？

成功了，没数据
成功了，有数据
没成功，没数据
没成功，有数据（一般不存在）

## 传递参数的形式？

通过url传参数(查询参数)
http://www.baidu.com/?kw=100

k=v

@RequestParam 来接收

路径参数
http://www.baidu.com/123

123 就是路径参数

@PathVariable

请求体参数
{
    "id": 123,
    "name": "john:
}

@RequestBody （数据是整体的）
请求体的格式，需要和后端接受的dto格式一致。

表单数据，

@RequestParam 接收（数据是分开的）
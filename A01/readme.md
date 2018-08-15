* `spring framework` 依赖`common-log`,必须加`log4j.properties`
* bean
```
第一种方式
<bean id="person" class="pojo.Person"></bean>

第二种方式
<bean id="person" class="pojo.Person">
	<property name="id" value="12" />
	<property name="age" value="10" />
	<property name="name" value="panda" />
</bean>
```
* `bean` `entity` `model` `pojo` `dao` `service` `constroller`区别
```
bean 它不仅仅可以包括对象的属性以及get,set方法，还可以有具体的业务逻辑
entity 数据表对应到实体类的映射
model 是一个高度优化组合或者精简后的一个用于在View层展示数据的对象
pojo 简单java类,和model很像，但是不像entity的数据库表对应
dao 持久化数据
service 
constroller
```
* 在`spring xml`按键`alt + /`不提示问题
```
window > preferences 
搜索cata > xml catalog
add > 粘贴uri(http://www.springframework.org/schema/beans/spring-beans-4.0.xsd) 
或者从源码包scheme文件夹加载
再按键alt + /

``` 
* log4j.properties关于日志的记录，分类，保存到本地
* Bean容器初始化,文件，classpath，web
```
FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("F:/workspace/appcontext.xml")

ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:appcontext.xml")

<listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>
<servlet>
    <servlet-name>context</servlet-name>
    <servlet-class>org.springframework.web.context.ContextLoaderServlet</servlet-class>
    <load-on-startup>1<load-on-startup>
</servlet>
```
* 作用域
* 生命周期
* aware接口
* 自动装配
* resource
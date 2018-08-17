#### AOP
* AOP中的切面封装了增强（Advice）和切点（Pointcut）
* 函数之前，之后添加一个日志，package advice [Link](https://www.cnblogs.com/zhaozihan/p/5953063.html)
* 上面链接是 - 这篇文章是我对《Spring实战》和《AOP那点事儿》的一些知识的整理和例子的实现

#### 三种方式，
* java方式，接口MethodBeforeAdvice,AfterReturningAdvice
* AOP联盟 接口org.aopalliance.intercept.MethodInterceptor
*  声明式增强
*  引入增强，比如说我不想让GreetingImpl去直接实现Greeting接口

### spring aop [LINK](https://www.cnblogs.com/hongwz/p/5764917.html)
```
AOP配置
<aop:config>
	<!-- 一个切片要运行的函数 -->
 	<aop:aspect id="time" ref="timeHandler">
 		<!-- 切点切在那个函数 -->
 		<aop:pointcut id="addAllMethod" expression="execution(* springaop.HelloWorld.*(..))" />
 			<!-- before 执行切片函数class的那个方法 -->
         <aop:before method="printTime" pointcut-ref="addAllMethod" />
         <!-- after 执行切片函数class的那个方法 -->
         <aop:after method="printTime" pointcut-ref="addAllMethod" />
 	</aop:aspect>
 </aop:config>

```
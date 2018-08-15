### 扫描
```

<context:component-scan base-package="com.mypanda.pojo" />
	
<!-- 建议使用上面的，上面包含下面的  -->
<!-- <context:annotation-scan base-package="com.mypanda.pojo" /> -->
	
	
```

```

@Component
@Component("id")
省略参数，id是类的第一个字母小写，自定义id，可以加

```

```
作用域
@Scope("prototype")//不写prototype默认是单例
@Component
public class xx{
	public void myHashCode(){
		System.out.println("bean :" + this.hashCode()); 
	}
}

```

* 类里面获取context
```

public class MyResource implements ApplicationContextAware{

	private ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.ctx = arg0;
		
	}

}

```

* resource
```

```

* aware 函数里面获取context


```

初始化

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd" 
        default-init-method="defautInit" default-destroy-method="defaultDestroy">
        
        <bean id="beanLifeCycle" class="com.imooc.lifecycle.BeanLifeCycle"  init-method="start" destroy-method="stop"></bean>
	
 </beans>
 
```
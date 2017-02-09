package com.example;

import com.google.gson.Gson;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhimingli on 2017-2-9 0009.
 *
 * @Component 泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
 * 将配置中的前缀为user的属性注入
 *
 */
@ConfigurationProperties(prefix = "app")
@Component
public class AppConfig {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

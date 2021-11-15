package com.jetbulb.spring.overview.beans.naming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    /**
     * В качестве ID для бина берется имя метода.
     * Поведение по-умолчанию для java-конфигурации.
     */
    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

    /**
     * В случае, если аннотация {@link Bean} передано одно значение для свойства {@link Bean#name()},
     * то в качестве ID для бина берется это же значение.
     * В таком случае, имя метода игнорируется и не берется во внимание для присвоения ID.
     */
    @Bean("twinBean")
    public BeanA beanATwin() {
        return new BeanA();
    }

    /**
     * Аннотация {@link Bean} предоставляет возможность указывать ID, а также альтернативные имена,
     * чаще именуемые как псевдонимы (aliases).
     * Для этого свойство {@link Bean#name()} может принимать массив желаемых именований для будущего бина,
     * где первое значение будет основным идентификатором, иначе говоря ID, а все последующие - Aliases.
     *
     * В таком случае, имя метода игнорируется и не берется во внимание для присвоения ID.
     */
    @Bean({"anotherTwinBean", "aliasedTwinBean"})
    public BeanA anotherBeanA() {
        return new BeanA();
    }

}

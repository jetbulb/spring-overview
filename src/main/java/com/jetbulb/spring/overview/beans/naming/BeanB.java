package com.jetbulb.spring.overview.beans.naming;

import org.springframework.stereotype.Component;

/**
 * В случае, если аннотация {@link Component} передано одно значение для свойства {@link Component#value()},
 * то в качестве ID для бина берется это же значение.
 * В таком случае, имя класса игнорируется и не берется во внимание для присвоения ID.
 */
@Component("anotherBean")
public class BeanB {
}

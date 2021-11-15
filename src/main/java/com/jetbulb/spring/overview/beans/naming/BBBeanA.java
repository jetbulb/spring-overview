package com.jetbulb.spring.overview.beans.naming;

import org.springframework.stereotype.Component;

/**
 * Тем не менее, если автоматическое выполнение {@link java.beans.Introspector#decapitalize(String)}
 * было пропущено, то все равно можно выполнить эту операцию явно (вручную),
 * просто указав желамое ID бина в качестве значения для аттрибута {@link Component#value()}.
 */
@Component("bBBeanA")
public class BBBeanA {
}

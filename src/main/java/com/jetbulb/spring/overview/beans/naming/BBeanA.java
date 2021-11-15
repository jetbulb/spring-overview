package com.jetbulb.spring.overview.beans.naming;

import org.springframework.stereotype.Component;

/**
 * Как известно, по-умолчанию ID для бина берется на основании имени класса.
 * Для этого применяется операция {@link java.beans.Introspector#decapitalize(String)}, что
 * приводит ID бина к camelCase-формуту, где первый символ будет приведен к строчному.
 *
 * Для имени класса с несколькими заглавными буквами в имени класса,
 * операция {@link java.beans.Introspector#decapitalize(String)} именени будет пропущена,
 * и возьмется имя класса в оригинальном его виде.
 *
 * Иначе говоря, ID для бина типа {@link BBeanA} будет BBeanA, а не привычный bBeanA.
 */
@Component
public class BBeanA {
}

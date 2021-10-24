package com.jetbulb.spring.overview.scope.notworking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BadRobotProductionConfiguration {

    @Bean
    public RobotFactory robotFactory() {
        return new RobotFactory();
    }

    /**
     * Аннотация {@link Scope} со значением prototype используется над классом {@link Robot}.
     * Это не даст желаемого эффекта при создании бина с помощью метода аннотированного {@link Bean},
     * поскольку просто не будет принята во внимание.
     * Таким образом, выберется стандартная (базовая) область видимости - singleton.
     *
     * При создании бина с помощью метода аннотированного {@link Bean}, для выбора области видимости,
     * аннотацию {@link Scope} необходимо применять в комбинировании с аннотацией {@link Bean}.
     *
     *
     * Правильный вариант:
     *
     * <pre>{@code
     *
     * @Bean
     * @Scope("prototype")
     * public Robot robot(RobotFactory factory) {
     *     return factory.create();
     * }
     *
     * }</pre>
     *
     */
    @Bean
    public Robot robot(RobotFactory factory) {
        return factory.create();
    }

}

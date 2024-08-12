package com.allsimple.eureka;

import io.micrometer.core.instrument.binder.system.ProcessorMetrics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

@Configuration
public class CustomMetricsConfiguration {

    @Bean
    @ConditionalOnMissingBean(ProcessorMetrics.class)
    public ProcessorMetrics processorMetrics() {
        // 원하는 방식으로 ProcessorMetrics 빈을 정의하거나,
        // 빈을 비활성화하기 위해 null을 반환할 수도 있습니다.
        return null;
    }
}

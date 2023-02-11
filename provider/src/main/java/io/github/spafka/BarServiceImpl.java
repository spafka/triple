package io.github.spafka;

import org.apache.dubbo.config.annotation.Service;

@Service
public class BarServiceImpl implements FooService {
    @Override
    public String bar() {
        return "bar";
    }
}

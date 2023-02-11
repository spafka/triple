package io.github.spafka;

import org.apache.dubbo.config.annotation.Service;

@Service
public class FooEchoServiceImpl implements EchoService{
    @Override
    public String echo(String echo) {
        return "foo"+echo;
    }

    @Override
    public void echonull(String echo) {

    }
}

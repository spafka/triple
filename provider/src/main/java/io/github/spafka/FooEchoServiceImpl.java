package io.github.spafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

@Service
@Slf4j
public class FooEchoServiceImpl implements EchoService{
    @Override
    public String echo(String echo) {
        log.info("eeee");
        return "foo"+echo;
    }

    @Override
    public void echonull(String echo) {

    }
}

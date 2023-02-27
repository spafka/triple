package io.github.spafka;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;
import org.junit.Test;

public class SpiTests {


    @Test
    public void testSpi(){

        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);

        Protocol dubbo = extensionLoader.getExtension("dubbo");


        System.out.println();
    }

}

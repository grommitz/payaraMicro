package example;

import fish.payara.micro.BootstrapException;
import fish.payara.micro.PayaraMicro;


public class Main {
    public static void main(String[] args) throws BootstrapException {
        PayaraMicro payaraMicro = PayaraMicro.getInstance();
        payaraMicro.setHttpPort(8080);
        payaraMicro.setMinHttpThreads(20);
        payaraMicro.setMaxHttpThreads(500);

        payaraMicro.bootStrap();
    }

}

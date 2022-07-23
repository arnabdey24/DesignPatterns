package proxy;

import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws UnknownHostException {
        GlobalDomainServer globalDomainServer=new GlobalDomainServer();
        System.out.println(globalDomainServer.getIP("www.google.com"));

        ProxyDomainServer proxyDomainServer=new ProxyDomainServer();
        System.out.println(proxyDomainServer.getIP("www.google.com"));
        System.out.println(proxyDomainServer.getIP("www.google.com"));
        System.out.println(proxyDomainServer.getIP("www.fb.com"));
        System.out.println(proxyDomainServer.getIP("www.fb.com"));
    }
}

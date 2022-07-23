package proxy;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GlobalDomainServer implements DomainServer{

    @Override
    public String getIP(String domainName) throws UnknownHostException {
        System.out.println("Fetching form main server...");
        String ip=new String(InetAddress.getByName(domainName).getHostAddress());
        return ip;
    }
}

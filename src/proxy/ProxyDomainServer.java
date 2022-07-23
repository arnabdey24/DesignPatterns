package proxy;

import java.net.UnknownHostException;
import java.util.HashMap;

public class ProxyDomainServer implements DomainServer{

    private HashMap<String,String> ips;
    private GlobalDomainServer globalDomainServer;

    public ProxyDomainServer() {
        ips=new HashMap<>();
        globalDomainServer=new GlobalDomainServer();
    }

    @Override
    public String getIP(String domainName) throws UnknownHostException {
        if(ips.containsKey(domainName)){
            return ips.get(domainName);
        }else{
            String ip=globalDomainServer.getIP(domainName);
            ips.put(domainName,ip);
            return ip;
        }
    }
}

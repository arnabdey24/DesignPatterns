package proxy;

import java.net.UnknownHostException;

public interface DomainServer {

    String getIP(String domainName) throws UnknownHostException;
}

package com.cowain.pms.common.file;


import com.cowain.pms.common.exception.RRException;
import com.cowain.pms.common.http.StringUtils;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.TrackerGroup;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.net.InetSocketAddress;


@Component
@ConfigurationProperties()
public class FileConfiguration {

    protected static  org.slf4j.Logger logger = LoggerFactory.getLogger(FileConfiguration.class);

    @Value("${fastdfs.connectTimeout}")
    private int connectTimeout;
    @Value("${fastdfs.networkTimeout}")
    private int  networkTimeout;
    @Value("${fastdfs.trackerHttpPort}")
    private int  trackerHttpPort;
    @Value("${fastdfs.antiStealToken}")
    private boolean antiStealToken;
     @Value("${fastdfs.secretKey}")
    private String secretKey;
    @Value("${fastdfs.trackerServer}")
    private String trackerServer;
    @Value("${fastdfs.nginxServer}")
    private String nginxServer;
    @Value("${fastdfs.charSet}")
    private String charSet;
//
   @PostConstruct
    public void initConfiguration(){

       try {
           //给clientGlobal 赋值
           ClientGlobal.g_connect_timeout = getConnectTimeout();
           ClientGlobal.g_network_timeout =  getNetworkTimeout();
           ClientGlobal.g_tracker_http_port =  getTrackerHttpPort();
           ClientGlobal.g_anti_steal_token =  getAntiStealToken();
           ClientGlobal.g_secret_key =  getSecretKey();
           ClientGlobal.g_charset =  getCharSet();
           if (getTrackerServer() != null ) {
               String[] szTrackerServers = getTrackerServer().split(",");
               InetSocketAddress[] trackerServers = new InetSocketAddress[szTrackerServers.length];
               for(int i = 0; i < szTrackerServers.length; ++i) {
                   String[] parts = szTrackerServers[i].split("\\:", 2);
                   if (parts.length != 2) {
                       throw new RRException("the value of item \"tracker_server\" is invalid, the correct format is host:port");
                   }
                   // IP 和 端口
                   trackerServers[i] = new InetSocketAddress(parts[0].trim(), Integer.parseInt(parts[1].trim()));
                   ClientGlobal.g_tracker_group = new TrackerGroup(trackerServers);
               }
           } else {
               throw new RRException("item \"tracker_server\"  not found");
           }

       } catch (Exception e) {
           logger.error("FastDFS Client Init Fail!",e);
       }
   }

   public String getCharSet() {
       if (StringUtils.isEmpty(charSet)) {
           charSet = "utf-8";
       }
       return charSet;
   }
    public int getConnectTimeout() {
        if (connectTimeout <= 0) {
            return  5;
        }
        return connectTimeout;
    }

    public int getNetworkTimeout() {
        if (networkTimeout <= 0) {
            networkTimeout = 30;
        }
        return networkTimeout * 1000;
    }

    public int getTrackerHttpPort() {
        return trackerHttpPort;
    }

    public boolean getAntiStealToken() {
        return antiStealToken;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public String getTrackerServer() {
        return trackerServer;
    }

    public String getNginxServer() {
        return nginxServer;
    }
}

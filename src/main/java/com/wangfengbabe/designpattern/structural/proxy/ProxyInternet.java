package com.wangfengbabe.designpattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangfeng on 11/09/2017.
 */
public class ProxyInternet implements Internet {

  private Internet internet = new RealInternet();
  private static List<String> bannedSites;

  static {
    bannedSites = new ArrayList<String>();
    bannedSites.add("abc.com");
    bannedSites.add("def.com");
    bannedSites.add("ijk.com");
    bannedSites.add("lmn.com");
  }

  @Override
  public void connectTo(String serverHost) throws Exception {
    if (bannedSites.contains(serverHost.toLowerCase())) {
      throw new Exception("Access Denied");
    }
    internet.connectTo(serverHost);
  }
}

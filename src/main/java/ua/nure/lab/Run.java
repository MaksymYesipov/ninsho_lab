package ua.nure.lab;

import ua.nure.lab.cache.CallsList;
import ua.nure.lab.resolver.CallFactoryResolver;
import ua.nure.lab.util.ScannerUtils;
import ua.nure.lab.util.XMLUtils;

public class Run {
   public static void main(String[] args) {
      CallFactoryResolver callFactoryResolver = new CallFactoryResolver();
      CallsList list = XMLUtils.deserializeFromXML();
      list.addCall(callFactoryResolver.resolveBean(ScannerUtils.readCallFromConsole()));
      list.addCall(callFactoryResolver.resolveBean(ScannerUtils.readCallFromConsole()));
      list.addCall(callFactoryResolver.resolveBean(ScannerUtils.readCallFromConsole()));
      ScannerUtils.close();
      System.out.println(list.getCalls());
      XMLUtils.serializeToXML(list);
   }
}








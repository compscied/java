package com.ws.simple;

public class DoubleAdderProxy implements com.ws.simple.DoubleAdder {
  private String _endpoint = null;
  private com.ws.simple.DoubleAdder doubleAdder = null;
  
  public DoubleAdderProxy() {
    _initDoubleAdderProxy();
  }
  
  public DoubleAdderProxy(String endpoint) {
    _endpoint = endpoint;
    _initDoubleAdderProxy();
  }
  
  private void _initDoubleAdderProxy() {
    try {
      doubleAdder = (new com.ws.simple.DoubleAdderServiceLocator()).getDoubleAdder();
      if (doubleAdder != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)doubleAdder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)doubleAdder)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (doubleAdder != null)
      ((javax.xml.rpc.Stub)doubleAdder)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ws.simple.DoubleAdder getDoubleAdder() {
    if (doubleAdder == null)
      _initDoubleAdderProxy();
    return doubleAdder;
  }
  
  public double add(double x, double y) throws java.rmi.RemoteException{
    if (doubleAdder == null)
      _initDoubleAdderProxy();
    return doubleAdder.add(x, y);
  }
  
  
}
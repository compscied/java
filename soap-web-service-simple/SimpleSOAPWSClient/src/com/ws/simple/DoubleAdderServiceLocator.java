/**
 * DoubleAdderServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws.simple;

public class DoubleAdderServiceLocator extends org.apache.axis.client.Service implements com.ws.simple.DoubleAdderService {

    public DoubleAdderServiceLocator() {
    }


    public DoubleAdderServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DoubleAdderServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DoubleAdder
    private java.lang.String DoubleAdder_address = "http://localhost:8080/SimpleSOAPWS/services/DoubleAdder";

    public java.lang.String getDoubleAdderAddress() {
        return DoubleAdder_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DoubleAdderWSDDServiceName = "DoubleAdder";

    public java.lang.String getDoubleAdderWSDDServiceName() {
        return DoubleAdderWSDDServiceName;
    }

    public void setDoubleAdderWSDDServiceName(java.lang.String name) {
        DoubleAdderWSDDServiceName = name;
    }

    public com.ws.simple.DoubleAdder getDoubleAdder() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DoubleAdder_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDoubleAdder(endpoint);
    }

    public com.ws.simple.DoubleAdder getDoubleAdder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ws.simple.DoubleAdderSoapBindingStub _stub = new com.ws.simple.DoubleAdderSoapBindingStub(portAddress, this);
            _stub.setPortName(getDoubleAdderWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDoubleAdderEndpointAddress(java.lang.String address) {
        DoubleAdder_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ws.simple.DoubleAdder.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ws.simple.DoubleAdderSoapBindingStub _stub = new com.ws.simple.DoubleAdderSoapBindingStub(new java.net.URL(DoubleAdder_address), this);
                _stub.setPortName(getDoubleAdderWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DoubleAdder".equals(inputPortName)) {
            return getDoubleAdder();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://simple.ws.com", "DoubleAdderService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://simple.ws.com", "DoubleAdder"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DoubleAdder".equals(portName)) {
            setDoubleAdderEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

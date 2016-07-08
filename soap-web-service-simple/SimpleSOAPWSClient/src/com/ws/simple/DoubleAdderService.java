/**
 * DoubleAdderService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws.simple;

public interface DoubleAdderService extends javax.xml.rpc.Service {
    public java.lang.String getDoubleAdderAddress();

    public com.ws.simple.DoubleAdder getDoubleAdder() throws javax.xml.rpc.ServiceException;

    public com.ws.simple.DoubleAdder getDoubleAdder(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

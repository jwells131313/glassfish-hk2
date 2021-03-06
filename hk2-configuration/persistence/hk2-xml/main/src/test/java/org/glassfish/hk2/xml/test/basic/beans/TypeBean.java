/*
 * Copyright (c) 2015, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.hk2.xml.test.basic.beans;

import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

import org.jvnet.hk2.annotations.Contract;

/**
 * @author jwells
 *
 */
@XmlRootElement(name="type-bean") @Contract
public interface TypeBean {
    @XmlElement(name="int")
    public int getIType();
    public void setIType(int i);
    
    @XmlElement(name="long")
    public long getJType();
    public void setJType(long i);
    
    @XmlElement(name="boolean")
    public boolean getZType();
    public void setZType(boolean i);
    
    @XmlElement(name="byte")
    public byte getBType();
    public void setBType(byte i);
    
    @XmlElement(name="char")
    public char getCType();
    public void setCType(char i);
    
    @XmlElement(name="short")
    public short getSType();
    public void setSType(short i);
    
    @XmlElement(name="float")
    public float getFType();
    public void setFType(float i);
    
    @XmlElement(name="double")
    public double getDType();
    public void setDType(double i);
    
    @XmlElement(name="set")
    public Set<String> getSetType();
    public void setSetType(Set<String> set);
    
    @XmlElement(name="qname")
    public QName getQName();
    
    @XmlElement(name="qname-local-only")
    public QName getQNameLocalOnly();
    
    @XmlElement(name="qname-unknown-prefix")
    public QName getQNameUnknownPrefix();
    
    @XmlElement(name="qname-element-prefix")
    public QName getQNameElementPrefix();
}

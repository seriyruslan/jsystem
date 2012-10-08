/*
 * Created on Nov 28, 2005
 *
 * Copyright 2005-2010 Ignis Software Tools Ltd. All rights reserved.
 */
package systemobject.tests;

import junit.framework.SystemTestCase;

/**
 * @author guy.arieli
 *
 */
public class DeviceTest extends SystemTestCase {
	Device1 device1;
	public void setUp() throws Exception{
		device1 = (Device1)system.getSystemObject("device1");
	}
	
	public void testDoNothing(){
		report.report("get port id 0");
		device1.port[0].getPortId();
		report.report("get port id 1");
		device1.port[1].getPortId();
	}
}

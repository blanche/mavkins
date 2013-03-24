package at.lw.rjm.base.test;

import java.util.Iterator;
import java.util.Map;

import at.lw.rjm.base.HelloWorldBase;

public class EnvironmentTest {
	public static void main(String[] args) {
		HelloWorldBase base = new HelloWorldBase();
		Iterator it = base.getEnvironment().entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}
	}
}

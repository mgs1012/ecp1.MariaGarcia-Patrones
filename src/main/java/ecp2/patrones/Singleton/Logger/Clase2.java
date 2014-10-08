package ecp2.patrones.Singleton.Logger;


public class Clase2 {

	 public Clase2(Logger logger) {
	    	logger = Logger.getLogger();
	    }

	    public void method1() {
	        // ...
	        Logger.getLogger().addLog("Clase2:method1");
	    }

	    public void method2() {
	        Clase3 c3 = new Clase3();
	        c3.method1();
	        Logger.getLogger().addLog("Clase2:method2");
	    }

	}
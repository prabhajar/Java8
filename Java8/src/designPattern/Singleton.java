package designPattern;

/*public class Singleton {
	private static Singleton instance;

	private Singleton() {
		System.out.println("object is created");
	}

	public static Singleton getInstance() {

		if (instance == null) {

			synchronized (Singleton.class) {
				if (instance == null) {
					System.out.println("getInstance executing by.............!! " + Thread.currentThread().getName());
					instance = new Singleton();
				}
			}

		}
		return instance;

	}

}*/

public enum Singleton{
	INSTANCE;
}
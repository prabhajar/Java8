package designPattern;

import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton obj1 = Singleton.INSTANCE;
		Singleton obj2 = Singleton.INSTANCE;
	
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}
}

package Practice;

public class Singleton {

	// In OOP, a singleton class is a class that can have only one object (instance
	// of the class) at a time.
	// How to design Singleton class:
	// 1.make constructor as private.
	// 2. write a public static method(GetInstance) that has return type of object
	// of this
	// singleton class(Lazy initialization).

	// Q. Diff b/w Singleton class and normal class?
	// for normal class we use constructor where as foe singleton class we use
	// getInstance method for instantiation.

	private static Singleton singleton_instance = null;

	public String str;

	private Singleton() {
		str = "I am using singleton class";

	}

	// Lazy initialization-Is done by if condition- This method is very imp at a
	// time of interview.
	public static Singleton getInstance() {
		if (singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;

	}

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.str = x.str.toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = z.str.toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}

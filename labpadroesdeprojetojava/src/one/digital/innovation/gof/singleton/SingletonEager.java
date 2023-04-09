package one.digital.innovation.gof.singleton;

/**
 * Singleton "apressado".
 * @author Yghopm
 *
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
				return instancia;
	}
}

package one.digital.innovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * @author Yghopm
 *
 *@see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 */
public class SingletonLazyHolder {

	private static class InstanceHolder {
	public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
				return InstanceHolder.instancia;
	}
}

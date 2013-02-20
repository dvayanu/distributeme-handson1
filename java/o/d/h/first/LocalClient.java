package o.d.h.first;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 19.02.13 19:24
 */
public class LocalClient {
	public static void main(String a[]){
		String vopros = a.length == 0 ? "Moi vopros!" : a[0];
		FirstService service = new FirstServiceImpl();
		System.out.println(service.otvechaetRandomomNaKakoitoTamVopros(vopros));
	}
}

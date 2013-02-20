package o.d.h.first;

import org.distributeme.core.ServiceLocator;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 19.02.13 19:29
 */
public class RemoteClient {
	public static void main(String a[]){
		final String vopros = a.length == 0 ? "Moi vopros!" : a[0];
		final FirstService service = ServiceLocator.getRemote(FirstService.class);
		System.out.println("Otvet na nash vopros: "+service.otvechaetRandomomNaKakoitoTamVopros(vopros));

		for (int i=0;i<20; i++){
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					while(true){
						try{
							service.printMessage(vopros+" ---- " +System.nanoTime());
						}catch(Exception e){
							System.out.println("ERROR ... ");
						}
						//try{
						//	Thread.sleep(1000);
						//}catch(InterruptedException e){}
					}
				}
			});
			t.start();
		}
	}
}

package o.d.h.first;

import org.apache.log4j.Logger;

import java.util.Random;

/**
 * TODO comment this class
 *
 * @author lrosenberg
 * @since 19.02.13 19:22
 */
public class FirstServiceImpl implements FirstService{

	private Random rnd = new Random(System.nanoTime());

	public FirstServiceImpl(){
		Logger.getLogger("Moskito1m").info("THATS ME");
	}

	@Override
	public boolean otvechaetRandomomNaKakoitoTamVopros(String vopros) {
		System.out.println("I was asked: "+vopros);
		if (vopros==null)
			throw new IllegalArgumentException("Not null please");
		return rnd.nextInt(Math.abs(vopros.hashCode()))%2==1;
	}

	@Override
	public void printMessage(String message) {
		System.out.println("incoming message "+message);
	}
}

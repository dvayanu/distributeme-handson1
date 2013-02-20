package o.d.h.first;

import net.anotheria.anoprise.metafactory.Service;
import org.distributeme.annotation.ConcurrencyControlServerSideLimit;
import org.distributeme.annotation.DistributeMe;
import org.distributeme.annotation.FailBy;
import org.distributeme.annotation.Route;
import org.distributeme.annotation.RouteMe;
import org.distributeme.core.routing.PropertyBasedRegistrationNameProvider;
import org.distributeme.core.routing.RoundRobinRouterWithFailoverToNextNode;

@DistributeMe()
@RouteMe(providerClass=PropertyBasedRegistrationNameProvider.class, providerParameter="instanceId")
@Route(routerClass=RoundRobinRouterWithFailoverToNextNode.class,routerParameter="2")
@FailBy(strategyClass=RoundRobinRouterWithFailoverToNextNode.class, reuseRouter=true)
@ConcurrencyControlServerSideLimit(15)
public interface FirstService extends Service {
	boolean otvechaetRandomomNaKakoitoTamVopros(String vopros);

	void printMessage(String message);
}

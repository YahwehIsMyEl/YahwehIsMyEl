package YahwehIsMyEl.PraticeMod.proxy;

import YahwehIsMyEl.PraticeMod.init.PraticeItems;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders() {
		PraticeItems.registerRenders();
	}

}

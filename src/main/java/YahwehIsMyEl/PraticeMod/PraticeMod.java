package YahwehIsMyEl.PraticeMod;

import YahwehIsMyEl.PraticeMod.init.PraticeItems;
import YahwehIsMyEl.PraticeMod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class PraticeMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@Mod.Instance("PM")
	public static PraticeMod instance;
	
	@EventHandler()
	public void preInit(FMLPreInitializationEvent event) 
	{
		PraticeItems.init();
		PraticeItems.register();
	}
	
	@EventHandler()
	public void init(FMLInitializationEvent event) 
	{
		proxy.registerRenders();
	}
	
	@EventHandler()
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}

}

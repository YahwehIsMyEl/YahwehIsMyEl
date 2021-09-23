package YahwehIsMyEl.PraticeMod.init;

import YahwehIsMyEl.PraticeMod.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PraticeItems {
	
	public static Item drumbStick;
	
	public static void init() 
	{
		drumbStick = new Item().setUnlocalizedName("drumbStick");
	}
	
	public static void register()
	{
		registerItem(drumbStick);
	}
	
	public static void registerItem(Item item) 
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() 
	{
		registerRender(drumbStick);
		System.out.println("Registered Renders");
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}

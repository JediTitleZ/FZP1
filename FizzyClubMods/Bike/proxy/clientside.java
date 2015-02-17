package FizzyClubBikeMod.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import FizzyClubBikeMod.entity.EntityFizzyBike;
import FizzyClubBikeMod.render.RenderFizzyBike;
import FizzyClubBikeMod.render.Model.ModelFizzy;

public class clientside extends serverside{

	
	public void registerRender() {
		


	    RenderingRegistry.registerEntityRenderingHandler(EntityFizzyBike.class, new RenderFizzyBike(new ModelFizzy(), 0.5F));
		
	}
}

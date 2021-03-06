/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2017
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.GUI.Book;

import java.util.ArrayList;
import java.util.Arrays;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

import Reika.ChromatiCraft.ChromatiCraft;
import Reika.ChromatiCraft.Auxiliary.ChromaBookData;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.PoolRecipes;
import Reika.ChromatiCraft.Auxiliary.RecipeManagers.PoolRecipes.PoolRecipe;
import Reika.ChromatiCraft.Base.GuiBookSection;
import Reika.ChromatiCraft.Registry.ChromaGuis;
import Reika.ChromatiCraft.Registry.ChromaResearch;
import Reika.ChromatiCraft.Registry.ChromaSounds;
import Reika.DragonAPI.ModList;
import Reika.DragonAPI.Instantiable.Event.NEIRecipeCheckEvent;
import Reika.DragonAPI.Instantiable.GUI.CustomSoundGuiButton.CustomSoundImagedGuiButton;
import Reika.DragonAPI.Libraries.IO.ReikaChatHelper;
import Reika.DragonAPI.Libraries.IO.ReikaGuiAPI;
import Reika.DragonAPI.Libraries.IO.ReikaRenderHelper;
import Reika.DragonAPI.Libraries.IO.ReikaSoundHelper;
import codechicken.nei.NEIClientConfig;

public class GuiPoolRecipe extends GuiBookSection {

	private final ArrayList<PoolRecipe> recipes;
	private int index = 0;
	private boolean centeredMouse = false;

	public GuiPoolRecipe(EntityPlayer ep, int offset, boolean nei) {
		super(ChromaGuis.ALLOYING, ep, ChromaResearch.ALLOYS, 256, 220, nei);
		recipes = new ArrayList(PoolRecipes.instance.getAllPoolRecipesForPlayer(ep));
		index = offset;
	}

	private PoolRecipe getActiveRecipe() {
		return recipes.get(index);
	}

	@Override
	public void initGui() {
		super.initGui();

		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		String file = "Textures/GUIs/Handbook/buttons.png";
		if (recipes.size() > 1) {
			buttonList.add(new CustomSoundImagedGuiButton(0, j+205, k-3, 10, 12, 183, 6, file, ChromatiCraft.class, this));
			buttonList.add(new CustomSoundImagedGuiButton(1, j+215, k-3, 10, 12, 193, 6, file, ChromatiCraft.class, this));
		}

		if (NEItrigger && !centeredMouse) {
			Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
			centeredMouse = true;
		}
	}

	@Override
	public final void keyTyped(char c, int key) {
		super.keyTyped(c, key);

		if (ModList.NEI.isLoaded() && key == NEIClientConfig.getKeyBinding("gui.recipe") && !NEIClientConfig.isHidden()) {
			int x = ReikaGuiAPI.instance.getMouseRealX();
			int y = ReikaGuiAPI.instance.getMouseRealY();
			int j = (width - xSize) / 2;
			int k = (height - ySize) / 2;
			if (x >= j && y >= k && x < j+xSize && y < k+ySize) {
				ItemStack is = ReikaGuiAPI.instance.getItemRenderAt(x, y);
				if (is != null) {
					ReikaSoundHelper.playClientSound(ChromaSounds.GUICLICK, player, 0.33F, 1);
					if (!MinecraftForge.EVENT_BUS.post(new NEIRecipeCheckEvent(null, is)))
						codechicken.nei.recipe.GuiCraftingRecipe.openRecipeGui("item", is);
				}
			}
		}
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		if (System.currentTimeMillis()-buttoncooldown >= 50) {
			if (button.id == 0 && index > 0) {
				index--;
				subpage = Math.min(subpage, this.getMaxSubpage());
			}
			else if (button.id == 1 && index < recipes.size()-1) {
				index++;
				subpage = Math.min(subpage, this.getMaxSubpage());
			}
		}
		//renderq = 22.5F;
		super.actionPerformed(button);
		this.initGui();
	}

	private final void drawRecipes() {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		int posX = (width - xSize) / 2;
		int posY = (height - ySize) / 2;
		try {
			this.drawAuxData(posX, posY);
		}
		catch (Exception e) {
			ReikaChatHelper.write(Arrays.toString(e.getStackTrace()));
			e.printStackTrace();
		}
	}

	protected void drawAuxData(int posX, int posY) {
		ChromaBookData.drawPoolRecipe(fontRendererObj, ri, this.getActiveRecipe(), subpage, posX, posY);
	}

	private final void drawGraphics() {
		int posX = (width - xSize) / 2-2;
		int posY = (height - ySize) / 2-8;

		ReikaRenderHelper.disableLighting();
		int msx = ReikaGuiAPI.instance.getMouseRealX();
		int msy = ReikaGuiAPI.instance.getMouseRealY();

		this.drawAuxGraphics(posX, posY);
	}

	@Override
	public int getMaxSubpage() {
		return 0;
	}

	protected void drawAuxGraphics(int posX, int posY) {

	}

	@Override
	public final void drawScreen(int x, int y, float f)
	{
		super.drawScreen(x, y, f);

		int posX = (width - xSize) / 2;
		int posY = (height - ySize) / 2 - 8;

		//if (subpage == 0 && !disable)
		this.drawRecipes();

		this.drawGraphics();

		RenderHelper.disableStandardItemLighting();
	}

	@Override
	public String getPageTitle() {
		return this.getActiveRecipe().getOutput().getDisplayName();//+" Casting";
	}

	@Override
	protected int getTitleOffset() {
		return 6;
	}

	@Override
	protected PageType getGuiLayout() {
		return PageType.POOL;
	}

}

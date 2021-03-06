package techreborn.compat.jei.fusionReactor;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.BlankRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import techreborn.api.reactor.FusionReactorRecipe;
import techreborn.compat.jei.RecipeUtil;

import javax.annotation.Nonnull;
import java.util.Arrays;

public class FusionReactorRecipeWrapper extends BlankRecipeWrapper {
	private final FusionReactorRecipe baseRecipe;

	public FusionReactorRecipeWrapper(FusionReactorRecipe baseRecipe) {
		this.baseRecipe = baseRecipe;
	}

	@Override
	public void getIngredients(
		@Nonnull
			IIngredients ingredients) {
		ingredients.setOutputs(ItemStack.class, Arrays.asList(baseRecipe.getTopInput(), baseRecipe.getBottomInput()));
		ingredients.setInput(ItemStack.class, baseRecipe.getOutput());
	}

	public ItemStack getTopInput() {
		return baseRecipe.getTopInput();
	}

	public ItemStack getBottomInput() {
		return baseRecipe.getBottomInput();
	}

	@Override
	public void drawInfo(
		@Nonnull
			Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY) {
		RecipeUtil.drawInfo(minecraft, 0, 67, baseRecipe.getStartEU(), baseRecipe.getEuTick(),
			baseRecipe.getTickTime());
	}
}

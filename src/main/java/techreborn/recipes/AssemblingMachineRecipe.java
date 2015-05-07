package techreborn.recipes;

import net.minecraft.item.ItemStack;
import techreborn.api.recipe.BaseRecipe;

public class AssemblingMachineRecipe extends BaseRecipe {

	public AssemblingMachineRecipe(ItemStack input1, ItemStack input2, ItemStack output1, int tickTime, int euPerTick) 
	{
		super("assemblingMachineRecipe", tickTime, euPerTick);
		if(input1 != null)
			inputs.add(input1);
		if(input2 != null)
			inputs.add(input2);
		if(output1 != null)
			outputs.add(output1);
	}
}
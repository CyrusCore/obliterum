
package net.mcreator.obliterum.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.obliterum.itemgroup.ObliterumItemGroup;
import net.mcreator.obliterum.ObliterumModElements;

@ObliterumModElements.ModElement.Tag
public class ObliterumIngotItem extends ObliterumModElements.ModElement {
	@ObjectHolder("obliterum:obliterum_ingot")
	public static final Item block = null;
	public ObliterumIngotItem(ObliterumModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ObliterumItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("obliterum_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}

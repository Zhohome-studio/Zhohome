
package org.supermommy.zhohome.item;

import org.supermommy.zhohome.itemgroup.ZhoworldItemGroup;
import org.supermommy.zhohome.ZhohomeModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@ZhohomeModElements.ModElement.Tag
public class Zh3Item extends ZhohomeModElements.ModElement {
	@ObjectHolder("zhohome:zh_3")
	public static final Item block = null;

	public Zh3Item(ZhohomeModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 108;
			}

			public float getEfficiency() {
				return 5.5f;
			}

			public float getAttackDamage() {
				return 2.1f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 3;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 0, -2.9f, new Item.Properties().group(ZhoworldItemGroup.tab)) {
		}.setRegistryName("zh_3"));
	}
}

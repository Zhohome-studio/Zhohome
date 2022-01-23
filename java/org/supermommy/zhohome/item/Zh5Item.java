
package org.supermommy.zhohome.item;

import org.supermommy.zhohome.itemgroup.ZhoworldItemGroup;
import org.supermommy.zhohome.ZhohomeModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@ZhohomeModElements.ModElement.Tag
public class Zh5Item extends ZhohomeModElements.ModElement {
	@ObjectHolder("zhohome:zh_5")
	public static final Item block = null;

	public Zh5Item(ZhohomeModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}, 1, -2.9f, new Item.Properties().group(ZhoworldItemGroup.tab)) {
		}.setRegistryName("zh_5"));
	}
}

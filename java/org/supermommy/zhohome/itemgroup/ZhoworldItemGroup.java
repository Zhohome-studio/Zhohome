
package org.supermommy.zhohome.itemgroup;

import org.supermommy.zhohome.item.Zh2Item;
import org.supermommy.zhohome.ZhohomeModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ZhohomeModElements.ModElement.Tag
public class ZhoworldItemGroup extends ZhohomeModElements.ModElement {
	public ZhoworldItemGroup(ZhohomeModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabzhoworld") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Zh2Item.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}

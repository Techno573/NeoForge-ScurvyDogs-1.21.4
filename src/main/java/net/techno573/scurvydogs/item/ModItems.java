package net.techno573.scurvydogs.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.DyedItemColor;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.techno573.scurvydogs.ScurvyDogsMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ScurvyDogsMod.MOD_ID);

    public static final DeferredItem<Item> TRICORN_HAT = ITEMS.registerSimpleItem("tricorn_hat", new Item.Properties()
            .equippable(EquipmentSlot.HEAD)
            .durability(55)
            .attributes(ItemAttributeModifiers.builder().add(
                    Attributes.ARMOR,new AttributeModifier(ResourceLocation.withDefaultNamespace("armor"),1.0d,
                            AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD).build())
            .component(DataComponents.DYED_COLOR, new DyedItemColor(-6265536,false)));
}

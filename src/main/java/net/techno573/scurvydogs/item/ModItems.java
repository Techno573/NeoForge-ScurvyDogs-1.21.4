package net.techno573.scurvydogs.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.techno573.scurvydogs.ScurvyDogsMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ScurvyDogsMod.MOD_ID);

    //Tricorn Hat
    public static final DeferredItem<Item> TRICORN_HAT = ITEMS.registerSimpleItem("tricorn_hat", new Item.Properties()
            .equippable(EquipmentSlot.HEAD)
            .durability(60)
            .enchantable(16)
            .attributes(ItemAttributeModifiers.builder().add(
                    Attributes.ARMOR,new AttributeModifier(ResourceLocation.withDefaultNamespace("armor"),1.0d,
                            AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD).build()));
    //Fancy Tricorn Hat
    public static final DeferredItem<Item> FANCY_TRICORN_HAT = ITEMS.registerSimpleItem("fancy_tricorn_hat", new Item.Properties()
            .equippable(EquipmentSlot.HEAD)
            .durability(60)
            .enchantable(16)
            .attributes(ItemAttributeModifiers.builder().add(
                    Attributes.ARMOR,new AttributeModifier(ResourceLocation.withDefaultNamespace("armor"),1.0d,
                            AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD).build()));
    //Bicorn Hat
    public static final DeferredItem<Item> BICORN_HAT = ITEMS.registerSimpleItem("bicorn_hat", new Item.Properties()
            .equippable(EquipmentSlot.HEAD)
            .durability(60)
            .enchantable(16)
            .attributes(ItemAttributeModifiers.builder().add(
                    Attributes.ARMOR,new AttributeModifier(ResourceLocation.withDefaultNamespace("armor"),1.0d,
                            AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD).build()));
    //Fancy Bicorn Hat
    public static final DeferredItem<Item> FANCY_BICORN_HAT = ITEMS.registerSimpleItem("fancy_bicorn_hat", new Item.Properties()
            .equippable(EquipmentSlot.HEAD)
            .durability(60)
            .enchantable(16)
            .attributes(ItemAttributeModifiers.builder().add(
                    Attributes.ARMOR,new AttributeModifier(ResourceLocation.withDefaultNamespace("armor"),1.0d,
                            AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD).build()));
    //Bandana
    public static final DeferredItem<Item> BANDANA = ITEMS.registerSimpleItem("bandana", new Item.Properties()
            .equippable(EquipmentSlot.HEAD)
            .durability(60)
            .enchantable(16)
            .attributes(ItemAttributeModifiers.builder().add(
                    Attributes.ARMOR,new AttributeModifier(ResourceLocation.withDefaultNamespace("armor"),1.0d,
                            AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD).build()));
}

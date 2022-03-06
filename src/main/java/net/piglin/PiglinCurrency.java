package net.piglin;


import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class PiglinCurrency implements ModInitializer {

    public static final Identifier MY_SOUND_ID = new Identifier("piglin:song");
    public static SoundEvent RICK = new SoundEvent(MY_SOUND_ID);

    public static final Item GOLD_COIN = new Coin(new Item.Settings().group(ItemGroup.MISC));
    public static final Item NETHERITE_COIN = new Coin(new Item.Settings().group(ItemGroup.MISC));
    public static final Item COMPRESSED_COIN = new Big(new Item.Settings().group(ItemGroup.MISC));
    public static final Item PIG_COIN = new Pig(new Item.Settings().group(ItemGroup.MISC).rarity(Rarity.EPIC).fireproof());
    

    @Override
    public void onInitialize() {
        Registry.register(Registry.SOUND_EVENT, MY_SOUND_ID, RICK);
        Registry.register(Registry.ITEM, new Identifier("piglin", "gold_coin"), GOLD_COIN);
        Registry.register(Registry.ITEM, new Identifier("piglin", "netherite_coin"), NETHERITE_COIN);
        Registry.register(Registry.ITEM, new Identifier("piglin", "compressed_coin"), COMPRESSED_COIN);
        Registry.register(Registry.ITEM, new Identifier("piglin", "pig_coin"), PIG_COIN);
    }

}

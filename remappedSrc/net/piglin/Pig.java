package net.piglin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Pig extends Item{

    public Pig(Settings settings) {
        super(settings);
        //TODO Auto-generated constructor stub
    }

    public static final Identifier MY_SOUND_ID = new Identifier("piglin:song");
    public static SoundEvent RICK = new SoundEvent(MY_SOUND_ID);
    
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity PlayerEntity, Hand hand){
        
        PlayerEntity.playSound(RICK, 1.0F, 1.0F);
        return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, PlayerEntity.getStackInHand(hand));
    }
}
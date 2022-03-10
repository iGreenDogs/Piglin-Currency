package net.piglin.mixin;

import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.mob.PiglinBrain;
import net.piglin.*;

@Mixin(PiglinBrain.class)
public abstract class PiglinGold {
    @Inject(method = "isGoldenItem", at = @At("HEAD"), cancellable = true)
    private static void injected(ItemStack stack, CallbackInfoReturnable ci) {
        if((stack.getItem() == PiglinCurrency.PIG_COIN)||(stack.getItem() == PiglinCurrency.GOLD_COIN)||(stack.getItem() == PiglinCurrency.NETHERITE_COIN)||(stack.getItem() == PiglinCurrency.COMPRESSED_COIN)) {
            ci.setReturnValue(true);
        }
    }

}

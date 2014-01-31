package net.minecraft.server;

public interface IDispenseBehavior {

    IDispenseBehavior a = new DispenseBehaviorNoop();

    ItemStack a(ISourceBlock isourceblock, ItemStack itemstack, int slot); // CraftBukkit - add the slot parameter

}

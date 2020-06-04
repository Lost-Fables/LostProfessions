package net.lostfables.lughgk.lostprofessions.items;

import net.lostfables.lughgk.lostprofessions.Lostprofessions;
import org.bukkit.Material;
import org.bukkit.block.Furnace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.inventory.ItemStack;

public class FurnaceEvents implements Listener {

    public FurnaceEvents() {
        Lostprofessions.get().getServer().getPluginManager().registerEvents(this, Lostprofessions.get());
    }

    @EventHandler(priority= EventPriority.HIGH)
    public void customBurnEvent(FurnaceBurnEvent e) {
        ItemStack source = ((Furnace) e.getBlock().getState()).getInventory().getSmelting();
        ItemStack fuel = ((Furnace) e.getBlock().getState()).getInventory().getFuel();
        if(source.getType() == Material.IRON_ORE) {
            if (LostProfessionItems.checkItem(source, "Iron Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        } else if(source.getType() == Material.COAL_ORE) {
            if (LostProfessionItems.checkItem(source, "Tungsten Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        } else if(source.getType() == Material.DIORITE) {
            if (LostProfessionItems.checkItem(source, "Silver Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        } else if(source.getType() == Material.GOLD_ORE) {
            if (LostProfessionItems.checkItem(source, "Gold Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        } else if(source.getType() == Material.MAGMA_BLOCK) {
            if (LostProfessionItems.checkItem(source, "Meteoric Metal Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        } else if(source.getType() == Material.IRON_BLOCK) {
            if (LostProfessionItems.checkItem(source, "Platinum Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        } else if(source.getType() == Material.LAPIS_ORE) {
            if (LostProfessionItems.checkItem(source, "Cobalt Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        } else if(source.getType() == Material.REDSTONE_ORE) {
            if (LostProfessionItems.checkItem(source, "Calamite Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        } else if(source.getType() == Material.SMOOTH_RED_SANDSTONE) {
            if (LostProfessionItems.checkItem(source, "Palladium Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        } else if(source.getType() == Material.PURPLE_GLAZED_TERRACOTTA) {
            if (LostProfessionItems.checkItem(source, "Lither Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        } else if(source.getType() == Material.SMOOTH_QUARTZ) {
            if (LostProfessionItems.checkItem(source, "Tin Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        } else if(source.getType() == Material.PRISMARINE) {
            if (LostProfessionItems.checkItem(source, "Luminide Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        } else if(source.getType() == Material.ORANGE_TERRACOTTA) {
            if (LostProfessionItems.checkItem(source, "Copper Ore", "Metal")) {
                return;
            }
            e.setCancelled(true);
            return;
        }

    }

    @EventHandler(priority= EventPriority.HIGH)
    public void customSmeltEvent(FurnaceSmeltEvent e) {
        ItemStack item;
        if(e.getSource().getType() == Material.IRON_ORE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Iron Ore", "Metal")) {
                item = LostProfessionItems.ironIngot();
                e.setResult(item);
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.COAL_ORE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Tungsten Ore", "Metal")) {
                e.setResult(LostProfessionItems.tungstenIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.DIORITE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Silver Ore", "Metal")) {
                e.setResult(LostProfessionItems.silverIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.GOLD_ORE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Gold Ore", "Metal")) {
                e.setResult(LostProfessionItems.goldIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.MAGMA_BLOCK) {
            if (LostProfessionItems.checkItem(e.getSource(), "Meteoric Metal Ore", "Metal")) {
                e.setResult(LostProfessionItems.meteoricMetalIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.IRON_BLOCK) {
            if (LostProfessionItems.checkItem(e.getSource(), "Platinum Ore", "Metal")) {
                e.setResult(LostProfessionItems.platinumIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.LAPIS_ORE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Cobalt Ore", "Metal")) {
                e.setResult(LostProfessionItems.cobaltIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.REDSTONE_ORE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Calamite Ore", "Metal")) {
                e.setResult(LostProfessionItems.calamiteIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.SMOOTH_RED_SANDSTONE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Palladium Ore", "Metal")) {
                e.setResult(LostProfessionItems.palladiumIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.PURPLE_GLAZED_TERRACOTTA) {
            if (LostProfessionItems.checkItem(e.getSource(), "Lither Ore", "Metal")) {
                e.setResult(LostProfessionItems.litherCoal());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.SMOOTH_QUARTZ) {
            if (LostProfessionItems.checkItem(e.getSource(), "Tin Ore", "Metal")) {
                e.setResult(LostProfessionItems.tinIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.PRISMARINE) {
            if (LostProfessionItems.checkItem(e.getSource(), "Luminide Ore", "Metal")) {
                e.setResult(LostProfessionItems.luminideIngot());
                return;
            }
            e.setCancelled(true);
            return;
        } else if(e.getSource().getType() == Material.ORANGE_TERRACOTTA) {
            if (LostProfessionItems.checkItem(e.getSource(), "Copper Ore", "Metal")) {
                e.setResult(LostProfessionItems.copperIngot());
                return;
            }
            e.setCancelled(true);
            return;
        }

    }
}

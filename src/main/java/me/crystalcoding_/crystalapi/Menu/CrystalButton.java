package me.crystalcoding_.crystalapi.Menu;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;
import java.util.function.Function;

public abstract class CrystalButton {

    private Function<Player, ItemStack> iconCreator;
    private Consumer<InventoryClickEvent> eventConsumer;

    public CrystalButton creator(Function<Player, ItemStack> iconCreator) {
        this.iconCreator = iconCreator;
        return this;
    }

    public CrystalButton consumer(Consumer<InventoryClickEvent> eventConsumer) {
        this.eventConsumer = eventConsumer;
        return this;
    }

    public Function<Player, ItemStack> getIconCreator() {
        return iconCreator;
    }

    public Consumer<InventoryClickEvent> getEventConsumer() {
        return eventConsumer;
    }
}

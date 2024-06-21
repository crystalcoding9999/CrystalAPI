package me.crystalcoding_.crystalapi.Menu;

public enum MenuSize {
    TINY(9),
    PETITE(18),
    MINI(27),
    SMALL(36),
    COMPACT(45),
    LARGE(54);

    public final int size;

    MenuSize(int size) {
        this.size = size;
    }
}

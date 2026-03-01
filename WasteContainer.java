
enum WasteType {
    ORGANIC,
    RECYCLABLE,
    HAZARDOUS
}

public class WasteContainer {
    private WasteType type;
    private int capacity;
    private int currentLevel;

    public WasteContainer(WasteType type, int capacity, int currentLevel) {
        this.type = type;
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public WasteType getType() {
        return type;
    }

    public boolean isFull() {
        return currentLevel >= capacity;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }
}
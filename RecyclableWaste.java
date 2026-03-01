

public class RecyclableWaste extends WasteCollector {

    protected boolean canHandle(WasteContainer container) {
        return container.getType() == WasteType.RECYCLABLE;
    }

    protected void dispose(WasteContainer container) {
        System.out.println("Recyclable waste collected. Sending to recycling plant.");
    }
}
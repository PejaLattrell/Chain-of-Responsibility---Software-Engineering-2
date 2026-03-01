

public class BiodegradableWaste extends WasteCollector {

    protected boolean canHandle(WasteContainer container) {
        return container.getType() == WasteType.ORGANIC;
    }

    protected void dispose(WasteContainer container) {
        System.out.println("Organic waste collected. Sending to compost facility.");
    }
}
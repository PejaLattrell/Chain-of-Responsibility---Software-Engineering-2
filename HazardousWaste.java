

public class HazardousWaste extends WasteCollector {

    protected boolean canHandle(WasteContainer container) {
        return container.getType() == WasteType.HAZARDOUS;
    }

    protected void dispose(WasteContainer container) {
        System.out.println("Hazardous waste collected. Sending to special disposal unit.");
    }
}
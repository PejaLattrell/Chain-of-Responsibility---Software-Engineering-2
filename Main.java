

public class Main {

    public static void main(String[] args) {

        
        WasteCollector organic = new BiodegradableWaste();
        WasteCollector recyclable = new RecyclableWaste();
        WasteCollector hazardous = new HazardousWaste();

        
        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);

        WasteContainer container1 = new WasteContainer(WasteType.ORGANIC, 100, 100);
        WasteContainer container2 = new WasteContainer(WasteType.HAZARDOUS, 50, 50);

        if (container1.isFull()) {
            organic.collectWaste(container1);
        }

        if (container2.isFull()) {
            organic.collectWaste(container2);
        }
    }
}
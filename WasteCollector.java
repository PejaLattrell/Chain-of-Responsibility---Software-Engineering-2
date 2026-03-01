

abstract class WasteCollector {
    protected WasteCollector nextCollector;

    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    public void collectWaste(WasteContainer container) {
        if (canHandle(container)) {
            dispose(container);
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println("No collector available for this waste type.");
        }
    }

    protected abstract boolean canHandle(WasteContainer container);
    protected abstract void dispose(WasteContainer container);
}
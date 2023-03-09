package Task04;

public class ResultDisplayFactoryManager {
    private final ArrayList<ResultDisplayFactory> factories = new ArrayList<>();

    public ResultDisplayFactoryManager() {
        factories.add(new TableResultDisplayFactory());
        factories.add(new ChartResultDisplayFactory());
    }

    public ArrayList<ResultDisplayFactory> getFactories() {
        return factories;
    }
}


package Task03;

/**
 *
 * @author LENOVO
 */
class ResultDisplay {
    public class TableResultDisplayFactory implements ResultDisplayFactory {
    @Override
    public ResultDisplay createResultDisplay(ResistanceResult result) {
        return new TableResultDisplay(result);
    }
    @Override
    public String getDisplayName() {
        return "Table Display";
    }
}

public class ChartResultDisplayFactory implements ResultDisplayFactory {
    @Override
    public ResultDisplay createResultDisplay(ResistanceResult result) {
        return new ChartResultDisplay(result);
    }
    @Override
    public String getDisplayName() {
        return "Chart Display";
    }
}

    
}

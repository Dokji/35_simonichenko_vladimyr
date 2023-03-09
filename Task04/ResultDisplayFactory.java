package Task04;

public interface ResultDisplayFactory {
    public ResultDisplay createResultDisplay(ResistanceResult result);
    public String getDisplayName();
}


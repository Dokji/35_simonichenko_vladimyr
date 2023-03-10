package Task04;

public class TableResultFactory implements FactoryMethod {
    @Override
    public ResultFormatter createResultFormatter() {
        return new TableResultFormatter();
    }
}


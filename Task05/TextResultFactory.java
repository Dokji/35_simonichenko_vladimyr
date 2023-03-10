package Task04;
public class TextResultFactory implements FactoryMethod {

    /**
     *
     * @return
     */
    @Override
    public ResultFormatter createResultFormatter() {
        return new TextResultFormatter();
    }
}


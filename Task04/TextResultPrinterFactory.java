package Task04;

/**
 *
 * @author LENOVO
 */
public class TextResultPrinterFactory implements ResultPrinterFactory {
    public ResultPrinter createSimpleTextPrinter() {
        return new SimpleTextResultPrinter();
    }
}

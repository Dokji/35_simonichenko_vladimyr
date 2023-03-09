package Task03;

/**
 *
 * @author LENOVO
 */
public class TextResultPrinterFactory implements ResultPrinterFactory {
    public ResultPrinter createSimpleTextPrinter() {
        return new SimpleTextResultPrinter();
    }
}

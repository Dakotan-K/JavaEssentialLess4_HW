package task2;

public class TXTHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("TXT Open");
    }

    @Override
    void create() {
        System.out.println("TXT Create");
    }

    @Override
    void change() {
        System.out.println("TXT Change");
    }

    @Override
    void save() {
        System.out.println("TXT Save");
    }
}

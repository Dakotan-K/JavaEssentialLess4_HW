package task2;

public class XMLHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("XML Open");
    }

    @Override
    void create() {
        System.out.println("XML Create");
    }

    @Override
    void change() {
        System.out.println("XML Change");
    }

    @Override
    void save() {
        System.out.println("XML Save");
    }
}

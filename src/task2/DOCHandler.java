package task2;

public class DOCHandler extends AbstractHandler {

    @Override
    void open() {
        System.out.println("DOC Open");
    }

    @Override
    void create() {
        System.out.println("DOC Create");
    }

    @Override
    void change() {
        System.out.println("DOC Change");
    }

    @Override
    void save() {
        System.out.println("DOC Save");
    }
}

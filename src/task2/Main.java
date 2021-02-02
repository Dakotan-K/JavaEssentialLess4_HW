package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите тип файла для обработки: doc, txt или xml: ");

        Scanner in = new Scanner(System.in);
        String file = in.next();

        if (file.equals("doc")) {
            AbstractHandler doc = new DOCHandler();
            doc.open();
            doc.create();
            doc.change();
            doc.save();
        } else {
            if (file.equals("txt")) {
                AbstractHandler txt = new TXTHandler();
                txt.open();
                txt.create();
                txt.change();
                txt.save();
            } else {
                if (file.equals("xml")) {
                    AbstractHandler xml = new XMLHandler();
                    xml.open();
                    xml.create();
                    xml.change();
                    xml.save();
                } else System.out.println("Вы ввели не верный тип файла");
            }
        }
    }
}

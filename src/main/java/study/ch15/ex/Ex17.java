package study.ch15.ex;

interface Printable{
    void print();
}

interface Scannable {
    void scan();
}

interface Faxable {
    void fax();
}

class AllInOnePrinter implements Printable, Scannable, Faxable {
    @Override
    public void fax() {
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println();
    }

    @Override
    public void scan() {

    }
}

public class Ex17 {
    public static void main(String[] args) {

    }
}

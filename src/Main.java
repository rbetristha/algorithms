public class Main {
    public static void main(String[] args) {

        MyArray massive = new MyArray(1000);

        massive.fillArray();
        massive.print();
        System.out.println();

        massive.search(856);
        System.out.println();

        massive.delete(52);
        System.out.println();

        massive.addEnd(85);
        massive.print();
        System.out.println();

        long startBubble = System.currentTimeMillis();
        massive.sortBubble();
        long stopBubble = System.currentTimeMillis();
        System.out.println("Сортировка пузырьком длилась " + (stopBubble - startBubble) + " миллисекунд.");

        long startSelect = System.currentTimeMillis();
        massive.sortSelect();
        long stopSelect = System.currentTimeMillis();
        System.out.println("Сортировка выбором длилась " + (stopSelect - startSelect) + " миллисекунд.");

        long startInsert = System.currentTimeMillis();
        massive.sortInsert();
        long stopInsert = System.currentTimeMillis();
        System.out.println("Сортировка вставкой длилась " + (stopInsert - startInsert) + " миллисекунд.");

    }
}

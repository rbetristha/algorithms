import java.util.Arrays;

public class MyArray {

    public int[] arr;
    public int size;

    public MyArray(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void fillArray() {
        for (int i = 0; i < size; i++) {
            arr[i] = (int) Math.round(Math.random() * 1001);
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            
        }
    }

    public void delete(int value) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == value) break;
        }
        if (i == size) System.out.println("Такого элемента нет в массиве.");
        for (int j = i; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }
        size--;
        System.out.println("Удалён элемент под номером: " + i);
    }

    public void addEnd(int value) {
        arr[size] = value;
        size++;
    }

    public void addSort(int value) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] > value) break;
        }
        for (int j = size; j > i; j--) {
            arr[j] = arr[j - 1];
        }
        arr[i] = value;
        size++;
    }

    public void search(int value) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == value) break;
        }
        if (i == size) System.out.println("Такого элемента нет в массиве.");
        else System.out.println("Номер запрашиваемого элемента в массиве: " + i);
    }

    // Сортировки

    public void sortBubble() {
        int out, in;
        for (out = size - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    int tmp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = tmp;
                }
            }
        }
        System.out.println("Сортировка пузырьком: " + "\n" + Arrays.toString(arr));
    }

    public void sortSelect() {
        int out, in, mark;
        for (out = 0; out < size; out++) {
            mark = out;
            for (in = out + 1; in < size; in++) {
                if (arr[in] < arr[mark]) {
                    mark = in;
                }
            }
            int tmp = arr[out];
            arr[out] = arr[mark];
            arr[mark] = tmp;
        }
        System.out.println("Сортировка выбором: " + "\n" + Arrays.toString(arr));
    }

    public void sortInsert() {
        int out, in;
        for (out = 1; out < size; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
        System.out.println("Сортировка вставкой: " + "\n" + Arrays.toString(arr));
    }
}

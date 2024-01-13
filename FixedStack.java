public class FixedStack implements DefStack {
    int stck[];//масив для зберігання елементів стеку
    int tos;//індекс вершини стеку
    String name;//ім'я стеку

    FixedStack(int size, String s) {
        stck = new int[size];
        name = s;
        tos = -1;
    }
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Стек заповнений");
        } else {
            stck[++tos] = item;
        }
    }
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек пустий");
            return 0;
        } else {
            return stck[tos--];
        }
    }
    public void defoult() {
        if (tos == stck.length - 1) {
            System.out.println("Стек заповнений");
        } else {
            stck[++tos] = 1;
        }
    }
    public boolean isEmpty() {//перевіряє чи порожній
        return tos < 0;
    }
}
public class Main {
    public static void main(String[] args) {
        // Створюємо новий стек розміром 5 з ім'ям "MyStack"
        FixedStack myStack = new FixedStack(5, "MyStack");

        // Додаємо елементи в стек
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        // Виводимо елементи стека
        System.out.println("Елементи стека:");
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }

        // Заповнюємо стек дефолтними значеннями
        myStack.defoult();
        System.out.println("Елементи стека після заповнення дефолтними значеннями:");
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}
public class Menu {
    public static void menu() {
        System.out.println("Выберите, с какими числами хотите работать:");
        System.out.println("1 - рациональные числа\n2 - комплексные числа\n0 - выход из программы\nваш выбор: ");
        int ch1 = TryInput.choice1();  // ввод с проверкой на корректность
        if (ch1 == 0) {
            System.out.print("Программа завершена, до свидания!");
            Logging.logWrite("Выход из программы");
            System.exit(0);
        }
        System.out.println("Какую операцию хотите выполнить?:\n1 - Сложение\n2 - Вычитание\n3 - Умножение\n4 - Деление\n0 - Возврат в предыдущее меню\nВаш выбор: ");
        int ch2 = TryInput.choice2();
        if (ch1 == 1) {
            Operations op = new Operations(ch2);  // Переход в блок работы с рациональными числами
        } else {
            OperationsComplexInterface op = new OperationsComplex(ch2);  // Переход в блок работы с комплексными числами
        }
    }
}

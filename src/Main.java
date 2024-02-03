//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int firstDep = 100;
        int secondDep = 1100;

        int BonusRuble;
        if (secondDep > 1000) {
            BonusRuble = secondDep / 100;
        } else {
            BonusRuble = 0;
        }
        int finalScore = firstDep + secondDep + BonusRuble;

        System.out.println("Итоговый счёт:" + finalScore);
        System.out.println("Количество бонусных рублей:" + BonusRuble);
    }
}
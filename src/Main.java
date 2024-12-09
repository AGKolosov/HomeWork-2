public class Main {
    public static void main(String[] args) {
        // Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задание 1");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        // Задание 2
        var result = dog + 4;
        var resultTwo = cat + 4;
        var resultThree = paper + 4;
        System.out.println("Задание 2");
        System.out.println("dog + 4 = " + result);
        System.out.println("cat + 4 = " + resultTwo);
        System.out.println("paper + 4 = " + resultThree);
        // Задание 3
        System.out.println("Задание 3");
        System.out.println("dog - 3.5 = " + (dog - 3.5));
        System.out.println("cat - 1.6 = " + (cat - 1.6));
        System.out.println("paper - 7639 = " + (paper - 7639));
        // Задание 4
        var friend = 19;
        System.out.println("Задание 4");
        System.out.println("Инициализация friend = " + friend);
        System.out.println("Добовляем 2 = " + (friend + 2));
        System.out.println("И все / 7 = " + (friend + 2) / 7);
        // Задание 5
        var frog = 3.5;
        System.out.println("Задание 5");
        System.out.println("Инициализация frog = " + frog);
        System.out.println("Увеличиваем в 10 раз = " + (frog * 10));
        System.out.println("И делим на 3.5 = " + (frog * 10) / 3.5);
        System.out.println("Добавляем к последнему 4 = " + (((frog * 10) / 3.5) + 4));
        // Задание 6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println("Задание 6");
        System.out.println("Общая масса двух бойцов = " + (boxerWeight1 + boxerWeight2) + " кг.");
        System.out.println("Разница между массами бойцов = " + (boxerWeight2 - boxerWeight1) + " кг.");
        // Задание 7
        var differenceWeight = boxerWeight2 % boxerWeight1;
        System.out.println("Задание 7");
        System.out.println("Остаток от деления между двумя весами = " + differenceWeight);
        // Задание 8
        var totalHours = 640;
        var oneEmployeeHours = 8;
        var allEmployee = totalHours / oneEmployeeHours;
        var plusEmployee = 94;
        var allPlusEmployee = allEmployee + plusEmployee;
        System.out.println("Задание 8");
        System.out.println("Всего работников в компании — " + allEmployee + " человек");
        System.out.println("Если в компании работает — " + allPlusEmployee + " человек, то всего " + (allPlusEmployee * oneEmployeeHours) + " часов работы может быть поделено между сотрудниками");
    }
}
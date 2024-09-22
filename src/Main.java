public class Main {
    public static void main(String[] args) {
//task1
        /*
        Напишите четыре строки:

С именем
firstName
 — для хранения имени.
С именем
middleName
 — для хранения отчества.
С именем
lastName
 — для хранения фамилии.
С именем
fullName
 — для хранения Ф. И. О. сотрудника в формате «Фамилия Имя Отчество».
Выведите в консоль фразу: «Ф. И. О. сотрудника — …».

В качестве данных для задачи используйте Ivanov Ivan Ivanovich.
         */
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф. И. О. сотрудника — %s",fullName);
//task2
        System.out.println();
        String fullNameToUpperCase = fullName.toUpperCase();
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета — %s",fullNameToUpperCase);
//task3
        System.out.println();
        fullName = "Иванов Семён Семёнович";
        String fullNameReplaceE = fullName.replace("ё","е");
        System.out.printf("Данные Ф. И. О. сотрудника — %s", fullNameReplaceE);
    }
}
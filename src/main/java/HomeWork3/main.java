package HomeWork3;
//На основе кода с семинара(см. прикрепленные файлы)
//        - Модифицировать класс УчебнаяГруппаСервис, добавив в него метод сортировки списка студентов по имени
//        - Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по имени и вызывать в нем созданный метод из УчебнаяГруппаСервис
//        - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
//        - Реализовать контракт compare () со сравнением по фамилии
//        - Модифицировать класс УчебнаяГруппаСервис, добавив в него метод сортировки списка студентов по фамилии
//        - Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по фамилии и вызывать в нем созданный метод из УчебнаяГруппаСервис
public class main {
    public static void main(String[] args) {

        StudentGroup group = new StudentGroup();
        StudentsRepository repository = new StudentsRepository(group);
        StudentGroupService service = new StudentGroupService(repository);
        controller controller = new controller(service);

        controller.addStudent(new Student("Ivan Morozov", 1L));
        controller.addStudent(new Student("Petr Vorobev",6L ));
        controller.addStudent(new Student("Sidor Sidorov",2L ));
        controller.addStudent(new Student("Elena Ivanova",1L ));
        controller.addStudent(new Student("Anna Morozova",8L ));
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.deleteStudent("Anna Morozova");
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.compareTo();
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.sortBySecondName();
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.sortByid();
        controller.printAll();

    }
}

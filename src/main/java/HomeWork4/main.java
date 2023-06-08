package HomeWork4;

import HomeWork4.controllers.StudentController;
import HomeWork4.controllers.TeacherController;
import HomeWork4.repository.StudentsRepository;
import HomeWork4.repository.TeacherRepository;
import HomeWork4.service.StudentService;
import HomeWork4.service.TeacherServise;
import HomeWork4.view.SortType;
import HomeWork4.view.StudentView;
import HomeWork4.view.TeacherView;

public class main {
    public static void main(String[] args) {

        TeacherView view = getTeacherView();
//----------------------------------------------------------------------

        view.create("Ivan Morozov", 18, "02");
        view.create("Petr Vorobev", 19, "03");
        view.create("Sidor Sidorov", 20, "112");
        view.sendOnConsole(SortType.NONE);
        view.create("Elena Ivanova", 19, "911");
        view.create("Anna Morozova", 17, "01");
        view.sendOnConsole(SortType.NONE);
        view.sendOnConsole(SortType.NAME);
        view.sendOnConsole(SortType.FAMILY);
        view.sendOnConsole(SortType.AGE);
        view.editTeacher(2L);
        view.sendOnConsole(SortType.NONE);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherServise service = new TeacherServise(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }


}



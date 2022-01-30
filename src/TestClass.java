import javax.swing.*;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;
import java.io.File;

enum LOAD_TYPE {
	HARDCODAT, KEYBOARD, FILE
}

enum DISPLAY_TYPE  {
	CONSOLA, FISIER, GUI
}

public class TestClass {
	public static void main(String[] args) {

		Set<Student> studenti = new HashSet<Student>();
		Student studentul1 = new Student("Popescu", "Andrei", 4777);
		Profesor profpj = new Profesor("Cataron", "Angel");
		Curs curs1 = new Curs("Programare Java", "PJ", profpj, studenti);
		curs1.AddStudent(studentul1);
		curs1.noteazaStudent(studentul1, 7);


		JFrame frame = new JFrame("Graphic user interface");
		ManagerCursuri Cursuri = new ManagerCursuri();
		Cursuri.AddCurs(curs1);
		LoginForm loginForm = new LoginForm(frame, Cursuri);
		frame.setContentPane(loginForm.getMainPanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		/* Scanner sc = new Scanner(System.in);
		System.out.println("Username = ");
		var username = sc.next();
		System.out.println("Password = ");
		var password = sc.next();

		try {
			Application.getInstance().login(new User(username, password));
			System.out.println(Application.getInstance().currentUser);
			System.out.println(Application.getInstance().currentUser.menuStrategy.getAccountHolderInformation());
			System.out.println(Application.getInstance().currentUser.menuStrategy.getAccountType());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/

	}
}

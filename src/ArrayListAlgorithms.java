import java.util.ArrayList;

public class ArrayListAlgorithms {
	public static void sortStudents(ArrayList<Student> toSort) {
		// inefficient sort bc its easier to write and no constraints were given
		for (int i = 0; i < toSort.size(); i++) {
			for (int j = i + 1; j < toSort.size(); j++) {
				int k = j - 1;
				Student kStud = toSort.get(k);
				Student jStud = toSort.get(j);
				if (
					kStud.getLastName().compareTo(jStud.getLastName()) >= 0 &&
					kStud.getFirstName().compareTo(jStud.getFirstName()) >= 0 &&
					kStud.getGpa() > jStud.getGpa()
				) {
					toSort.set(k, jStud);
					toSort.set(j, kStud);
				}
			}
		}
	}
}

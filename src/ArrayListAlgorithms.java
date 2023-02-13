import java.util.ArrayList;

public class ArrayListAlgorithms {
	public static boolean isGreater(Student a, Student b) {
		int lastCmp = a.getLastName().compareTo(b.getLastName());
		if (lastCmp > 0) return true;
		if (lastCmp < 0) return false;
		int firstCmp = a.getFirstName().compareTo(b.getFirstName());
		if (firstCmp > 0) return true;
		if (firstCmp < 0) return false;
		return a.getGpa() < b.getGpa();
	}

	public static void sortStudents(ArrayList<Student> toSort) {
		// inefficient sort bc its easier to write and no constraints were given
		for (int i = 0; i < toSort.size(); i++) {
			int k = i;
			Student iStud = toSort.get(i);
			Student kStud = toSort.get(i);
			for (int j = i + 1; j < toSort.size(); j++) {
				Student jStud = toSort.get(j);
				if (isGreater(kStud, jStud)) {
					kStud = jStud;
					k = j;
				}
			}
			toSort.set(i, kStud);
			toSort.set(k, iStud);
			System.out.println("Swapping " + i + " and " + k);
		}
	}
}

import java.util.Comparator;

public class CompareName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getLastName() != o2.getLastName()) {
			return o1.getLastName().compareTo(o2.getLastName());
		}
		else {
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
	}

}

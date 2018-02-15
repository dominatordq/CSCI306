
/**
 * @author dquintana, ztmills
 * Student class
 */
public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	/**
	 * compares scores of two students
	 */
	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return Integer.compare(this.score, student.score);
	}
	@Override
	public String toString() {
		return name + " " + score;
	}
	
}

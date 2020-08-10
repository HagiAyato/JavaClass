import human.Professor;
import human.Student;

/**
 *
 */

/**
 * @author hagirainbow
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("人生成");
		// オブジェクト生成
		Student student1 = new Student(165.2,60.2,"田中","材料工学");
		// 自己紹介
		System.out.println("\n学生1自己紹介");
		student1.Introduce();
		// オブジェクト生成
		Student student2 = new Student(145.3,50.2,"","");
		// 自己紹介
		System.out.println("\n学生2自己紹介");
		student2.Introduce();
		// オブジェクト生成
		Professor professor = new Professor(145.3,50.2,"大木","経済学・経営学");
		// 自己紹介
		System.out.println("\n教授自己紹介");
		// 要素3：多態性(ポリモーフィズム)
		// 同じメソッドを呼び出しても、サブクラスごとに処理が別
		// ※上記学生は得意科目を言っていたが、教授は研究分野を言っている。
		professor.Introduce();
	}

}

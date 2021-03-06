/**
 *
 */
package human;

/**
 * 要素2：継承
 * 人クラスを"継承"した学生クラス
 * 継承すれば、人クラスの機能をそのまま使用できる。
 * @author hagirainbow
 *
 */
public class Student extends Human {

	// サブクラス独自のメンバ
	private String favoriteSubject = "なし";

	/**
	 * 初期設定
	 * @param height
	 * @param weight
	 * @param name
	 * @param favoriteSubject
	 */
	public Student(double height, double weight, String name, String favoriteSubject) {
		super(height, weight, name);
		// TODO 自動生成されたコンストラクター・スタブ
		this.favoriteSubject = favoriteSubject;
	}

	/* (非 Javadoc)
	 * @see human.Human#Introduce()
	 * 学生の自己紹介
	 */
	@Override
	public void Introduce() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("身長：" + getHeight() + "cm 体重：" + getWeight() + "kg 氏名：" + getName());
		System.out.println("得意科目" + this.favoriteSubject);
	}

}

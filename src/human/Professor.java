/**
 *
 */
package human;

/**
 * 要素2：継承
 * 人クラスを"継承"した教授クラス
 * 継承すれば、人クラスの機能をそのまま使用できる。
 * @author hagirainbow
 *
 */
public class Professor extends Human {

	private String field = "秘密";

	/**
	 * @param height
	 * @param weight
	 * @param name
	 * @param field
	 */
	public Professor(double height, double weight, String name, String field) {
		super(height, weight, name);
		// TODO 自動生成されたコンストラクター・スタブ
		this.field = field;
	}

	/* (非 Javadoc)
	 * @see human.Human#Introduce()
	 * 教授の自己紹介
	 */
	@Override
	public void Introduce() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("身長：" + getHeight() + "cm 体重：" + getWeight() + "kg 氏名：" + getName());
		System.out.println("研究分野：" + this.field);
	}

}

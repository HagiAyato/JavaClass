/**
 * 人スーパークラス
 */
package human;

/**
 * @author hagirainbow
 *
 */
public abstract class Human {

	// 要素1：カプセル化・隠蔽
	// クラスのメンバをprivateにして、外部から直接いじれないようにする
	private double height = 160;
	private double weight = 60.0;
	private String name = "名無し";

	/**
	 * コンストラクタ
	 * @param height
	 * @param weight
	 * @param name
	 */
	public Human(double height,double weight,String name){
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	// 要素1：カプセル化・隠蔽
	// クラスのメンバをprivateにする代わりに、getter/setterでアクセスできるようにする。
	/**
	 * @return height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height セットする height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight セットする weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 抽象クラス自己紹介
	 */
	public abstract void Introduce();


}

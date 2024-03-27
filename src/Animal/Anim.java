/**
* @Description:
* @auther:墨瞳
* @date 2023年5月15日 下午4:13:11
*/
package Animal;

/**
 * @author 墨瞳
 *
 */
public class Anim {
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void info() {
		System.out.println("今年"+getAge()+"岁了!");
	}
	public static void main(String[] args) {
		Bird cin =new Bird();
		cin.setAge(4);
		cin.setColor("红色");
		cin.info();
		Fish xin =new Fish();
		xin.setAge(2);
		xin.setWeigth("5斤");
		xin.info();
	}
}
class Bird extends Anim{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void info() {
		System.out.println("我是一只"+getColor()+"的鸟!");
		System.out.println("今年"+getAge()+"岁了!");
	}
}
class Fish extends Anim{
	private String weigth;
	
	public String getWeigth() {
		return weigth;
	}
	public void setWeigth(String weigth) {
		this.weigth = weigth;
	}
	public void info() {
		System.out.println("我是一只"+getWeigth()+"的鱼!");
		System.out.println("今年"+getAge()+"岁了!");
	}
}
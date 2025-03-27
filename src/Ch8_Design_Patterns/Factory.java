package Ch8_Design_Patterns;


// 在這裏將物件建立，等在這個方法中先將完成API的呼叫
public class Factory {
	// 者裡用static方法可以比較方便呼叫
	public static Product getProduct() {
		System.out.println("Do Something");
		return new Product();
	}

}

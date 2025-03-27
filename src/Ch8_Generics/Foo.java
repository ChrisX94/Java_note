package Ch8_Generics;

import java.util.List;

//在class中宣告一個<T>作為泛型的表示, 
public class Foo<T> {
	//這裡意思是你傳入什麼類型的方法,這裡的資料型別就會是什麼 (T就是代表資料型別的代號)
	private T foo;

	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}

	//-----------------------------------------------------------------//
	
		//這裡意思是在使用這個class時,必須要先確認進來的型別一定要是繼承於List 或是 實作List介面 
//	public class Foo<T extends List>{
//		
//		private T foo;
//
//		public T getFoo() {
//			return foo;
//		}
//
//		public void setFoo(T foo) {
//			this.foo = foo;
//		}
	
	
}

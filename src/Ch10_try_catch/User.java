package Ch10_try_catch;

import java.util.Optional;

public class User {

	private String name;
	private Integer age;
	
	
	
	// 這裡用的檢查方式是用Optional<資料型別> (import java.util.Optional;), return Optional.ofNullable(參數)
	public Optional<String> getName() {
		// Optional.ofNullable(name); 允許空值但後面有操作可以補上空值的部分
		return Optional.ofNullable(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
	
}

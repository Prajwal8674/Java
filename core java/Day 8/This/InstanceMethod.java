class Person{
	private String name;
	private int age;
	
	 public void setName(String name){
		this.name = name;
	}
	 public  void setAge(int  age){
		this.age = age;
	}
	 public String getName(){
		return name;
	}
	 public int  getAge(){
		return age;
	}
}
class InstanceMethod{
	public static void main(String agrs[]){
		Person p1 = new Person();
		p1.setName("Manish");
		p1.setAge(23);
		System.out.println("Name= "+p1.getName());
		System.out.println("Age= "+ p1.getAge());
	}
}

import java.util.*;

/**MyStack繼承ArrayList，型態為Object*/
class MyStack extends ArrayList<Object>{

	//陣列是否為空值
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	//陣列大小
	public int getSize(){
		return super.getSize();
	}
	
	//取得陣列元素中的東西
	public Object peek(){
		return  super.get(getSize()-1);
	}

	//assign陣列元素中的東西進入o，然後移除那格陣列元素
	public Object pop(){
		Object o = super.get(getSize()-1);
		super.remove(getSize()-1);
		return o;
	}
	
	//傳值進入ArrayList
	public void push(Object o){
		super.add(o);
	}
	
	@Override
	public String toString(){
		return "stack: " + super.toString();
	}
}

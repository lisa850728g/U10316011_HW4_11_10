public class MyStack extends ArrayList{
	
	public static void main(String[] args) {
	
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	public int getSize(){
		return super.getSize();
	}
	
	public Object peek(){
		return  super.get(getSize()-1);
	}

	public Object pop(){
		Object o = super.get(getSize()-1);
		super.remove(getSize()-1);
		return 0;
	}
	
	public void push(Object o){
		super.add(o);
	}
	
	@Override
	public String toString(){
		return "stack: " + super.toString();
	}
}

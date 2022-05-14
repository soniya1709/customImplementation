package customarraylist;

import java.util.Arrays;

public class MyArrayList {
private static final int capacity=5;
private Object data[];
private int size;
private int index;
public MyArrayList()
{
	this.data=new Object[capacity];
	this.size=capacity;
	
}
public void add(Object obj)
{
	
	if(this.index==this.size-1)
	{
		increseSize();
	}
	data[this.index]=obj;
	this.index++;
}
public  void increseSize()
{
	this.size=this.size+capacity*2;
	Object newData[]=new Object[this.size];
	for(int i=0;i<data.length;i++)
	{
		newData[i]=data[i];
	}
	this.data=newData;
	
	
}
public Object get(int i)throws Exception
{
	if(i>this.index-1)
	{
		throw new Exception("ArrayIndexOutOfBoundsEception");
	}
	if(i<0)
	{
		throw new Exception("Negative value");
	}
	return this.data[i];
}
public void remove(int i)throws Exception
{
	if(i>this.index-1)
	{
		throw new Exception("ArrayIndexOutOfBoundsException");
	}
	if(i<0)
	{
		throw new Exception("Negative value");
	}
	System.out.println("object getting remove"+this.data[i]);
	for(int x=i;x<this.data.length-1;x++)
	{
		data[x]=data[x+1];
	}
	this.index--;
}

@Override
public String toString() {
	return "MyArrayList data=" + Arrays.toString(data) + ", size=" + size + ", index=" + index + "]";
}
public static void main(String[] args) throws Exception {
	MyArrayList m=new MyArrayList();
	m.add(10);
	m.add(20);
	m.add(30);
	m.add(50);
	m.add(60);
	m.add(70);
	System.out.println(m);
	System.out.println(m.get(2));
	m.remove(1);
	System.out.println(m);
}
}

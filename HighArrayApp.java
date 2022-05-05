class HighArray{
		int arr[];
		static int n;
	HighArray(int size)
	{
		arr=new int [size];

	}
	
	public void find (int key)
	{
		int i;
		for (i=0;i<n;i++)
		{
			if(arr[i]==key)
				break;
		}
		if(i==n)
			System.out.println("Element "+key+" Not Found in Array");
		else
			System.out.println("Element "+key+" Found in Array");;
	}
	
	public void insert (int value)
	{
		if(n<arr.length)
		{
		arr[n]=value;
		n++;
		System.out.println("Element "+value+" Added to Array");
		}
		else
		{
			System.out.println("Array is full");
		}
	}
	public void delete (int key)
	{
		int i;
		for (i=0;i<n;i++)
		{
			if(arr[i]==key)
				break;
		}
		if(i!=n)
		{
			for(int j=i;j<n-1;j++)//we are reducing one element
			{
				arr[j]=arr[j+1];
			}
			n--;
			System.out.println("Element "+key +" is deleted from array");
		}
		else
			System.out.println("Wrong Element Value");
	}
	
	public void display()
	{
		
		if(n!=0)
		{
			System.out.print("Array Elements are : ");
			for (int i=0;i<n;i++)
			{
			System.out.print(arr[i]+" ");
			
			}
			System.out.println(" ");
		}
		else 
			System.out.println("Array is Empty");
			
	}

}


class HighArrayApp{

	public static void main(String args[]){
	
		HighArray a1=new HighArray(10);
		
		a1.display();
		a1.insert(11);
		a1.insert(22);
		a1.insert(33);
		a1.insert(44);
		a1.insert(55);
		a1.display();
		a1.delete(50);
		a1.delete(33);
		a1.display();
		a1.insert(66);
		a1.insert(77);
		a1.insert(88);
		a1.insert(99);
		a1.insert(111);
		a1.insert(122);
		a1.insert(133);
		a1.display();
		a1.find(33);
		a1.find(99);
		a1.delete(60);
		a1.delete(66);
		a1.display();
	}



}
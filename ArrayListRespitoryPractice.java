import java.util.ArrayList;

public class ArrayListRespitoryPractice{
	public static void main(String[]args){

		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();

		for(int i=0;i<10;i++)
			a.add(i);
		for(int i=10;i<20;i++)
			b.add(i);

		System.out.println(newList(a, b));
	}
	public static ArrayList<Integer> newList(ArrayList<Integer> a, ArrayList<Integer> b){

		ArrayList<Integer> newList = new ArrayList<>();

		for(int i=0;i<a.size();i++)
			newList.add(a.get(i));

		for(int i=0;i<b.size();i++)
			newList.add(b.get(i));
		return newList;
	}
}

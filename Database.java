package Database;
import java.util.ArrayList;
public class Database {
	
	/*private ArrayList<CD> listCD=new ArrayList<CD>();
	private ArrayList<DVD> listDVD=new ArrayList<DVD>();*/
	private ArrayList<Item> listItem=new ArrayList<Item>();
	
	
	/*public void add(CD cd){
		listCD.add(cd); //����µ�CD����������
	}
	
	public void add(DVD dvd){ //����������  ������β�Ϊ DVD ����
		listDVD.add(dvd); //����µ�CD����������
	}*/
	
	public void add(Item item){ // itemΪ��̬����    ���洫�����Ŀ�����CD ������DVD  Ϊ��̬����   ������̽�java�Ķ�̬
		listItem.add(item); 
	}
	
	public void list(){
		/*for(CD cd:listCD)
		{
			cd.print();
		}
		
		for(DVD dvd:listDVD)
		{
			dvd.print();
		}*/
		for(Item item:listItem)
		{
			item.print();
			
		}
		
		
	}
	public static void main(String[] args) { //����Database
		Database db=new Database(); //newһ��database���� db
		db.add(new CD("����", "�ܽ���",72, 18,"�������������ն�����")); //���cd��db
		db.add(new CD("�������鷳", "�̽���",54, 13,"������Ȼ����������������"));
		db.add(new DVD("�������ֲ�", "����������", 136, "�ҽ��꿴����������ĵ�Ӱ"));//���dvd��db
		db.add(new DVD("����С˵", "��͡", 180, "��͡���Ǹ����ŵı�̬����"));
		db.add(new VedioGames("��������", 20,false,"����ķ���",2 ));
			
		
		db.list();
		
		

	}

}

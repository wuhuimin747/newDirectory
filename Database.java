package Database;
import java.util.ArrayList;
public class Database {
	
	/*private ArrayList<CD> listCD=new ArrayList<CD>();
	private ArrayList<DVD> listDVD=new ArrayList<DVD>();*/
	private ArrayList<Item> listItem=new ArrayList<Item>();
	
	
	/*public void add(CD cd){
		listCD.add(cd); //添加新的CD到容器里面
	}
	
	public void add(DVD dvd){ //函数的重载  载入的形参为 DVD 类型
		listDVD.add(dvd); //添加新的CD到容器里面
	}*/
	
	public void add(Item item){ // item为静态变量    下面传上来的可能是CD 可能是DVD  为动态变量   这个过程叫java的多态
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
	public static void main(String[] args) { //测试Database
		Database db=new Database(); //new一个database对象 db
		db.add(new CD("稻香", "周杰伦",72, 18,"余音绕梁，三日而不绝")); //添加cd到db
		db.add(new CD("别找我麻烦", "蔡健雅",54, 13,"清新自然，美丽动听好声音"));
		db.add(new DVD("搏击俱乐部", "大卫·芬奇", 136, "我今年看过的最优秀的电影"));//添加dvd到db
		db.add(new DVD("低俗小说", "昆汀", 180, "昆汀真是个优雅的变态导演"));
		db.add(new VedioGames("超级玛丽", 20,false,"好玩的飞起",2 ));
			
		
		db.list();
		
		

	}

}

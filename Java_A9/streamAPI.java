import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class fruit
{
	String name;
	int cal;
	int price;
	String color;
	public fruit(String name, int cal, int price, String color) {
		super();
		this.name = name;
		this.cal = cal;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}

class news
{
	int newsid;
	String postedbyUser;
	String commentByUser;
	String comment;
	public news(int newsid, String postedbyUser, String commentByUser, String comment) {
		super();
		this.newsid = newsid;
		this.postedbyUser = postedbyUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	public String getPostedbyUser() {
		return postedbyUser;
	}
	public void setPostedbyUser(String postedbyUser) {
		this.postedbyUser = postedbyUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
class trader
{
	String sname;
	String city;
	public trader(String sname, String city) {
		super();
		this.sname = sname;
		this.city = city;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
/////////////////////////MAIN CLASS////////////////////////

public class streamAPI 
{
	 
	public static void main(String[] args) 
	{
		 List<fruit> ft=new ArrayList<fruit>();
		 ft.add(new fruit("APPLE",120,90,"RED"));
		 ft.add(new fruit("MANGO",150,100,"YELLOW"));
		 ft.add(new fruit("ORANGE",80,40,"ORANGE"));
		 ft.add(new fruit("CHIKOO",50,50,"BROWN"));
		 ft.add(new fruit("PROMOGRANATE",150,150,"RED"));
		 System.out.println("Question 1st Output");
		 ft.stream().filter(n->n.cal<100).forEach(pr->System.out.println(pr.name));
		 System.out.println();
		 System.out.println("Question 3rd Output");
		 ft.stream().filter(n->n.color=="RED").forEach(pr->System.out.println(pr.name));
		 System.out.println();
		 System.out.println("Question 2nd Output");
		 ft.stream().forEach(pr->System.out.println(pr.name));
		 
		 List<news> nw=new ArrayList<news>();
		 nw.add(new news(1,"LAW","DEMAND","13"));
		 nw.add(new news(2,"BUDGET","MARKET","23"));
		 nw.add(new news(3,"LIFESTYLE","BOLLYWOOD","32"));
		 nw.add(new news(4,"ACCIDENT","STATE","45"));
		 System.out.println();
		 System.out.println("Question 4th Output");
		 nw.stream().filter(n->n.comment=="45").forEach(pr->System.out.println(pr.newsid));
		 System.out.println();
		 System.out.println("Question 5th Output");
		 nw.stream().filter(n->n.postedbyUser=="BUDGET").forEach(pr->System.out.println(pr.newsid));
		 System.out.println();
		 System.out.println("Question 6th Output");
		 nw.stream().filter(n->n.comment=="45").forEach(pr->System.out.println(pr.newsid));
		 
		 List<trader>td=new ArrayList<>();
		 td.add(new trader("AJAY","NAGPUR"));
		 td.add(new trader("VIJAY","INDORE"));
		 td.add(new trader("SANJAY","DELHI"));
		 td.add(new trader("AKSHAY","MUMBAI"));
		 System.out.println();
		 System.out.println("Question 12th Output");
		 td.stream().filter(n->n.city=="INDORE").forEach(pr->System.out.println(pr.sname));
		 System.out.println();
		 System.out.println("Question 9th Output");
		 td.stream().forEach(pr->System.out.println(pr.city));
		 td.stream().sorted(
                 Comparator.comparing(n->n.toString())).collect(Collectors.toList());
		  
		 
		 
		 
	}

}

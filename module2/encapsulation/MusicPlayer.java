class MusicPlayer{
	private int id;
	private String brand;
	private String make;
	private double price;
	MusicPlayer(int id ,String make,String brand,double price){
		this.id=id;
		this.brand=brand;
		this.make=make;
		this.price=price;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getMake(){
		return make;
	}
	public void setMake(String make){
		this.make=make;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public void displayMusicPlayerDetails(){
		System.out.println("musicplayer details");
		System.out.println("-------------------");
		System.out.println("MusicPlayer Id:"+id);
		System.out.println("MusicPlayer Brand"+brand);
		System.out.println("MusicPlayer amke"+make);
		System.out.println("MusicPlayer price"+price);
	}
}
class Car{
	private int id;
	private String brand;
	private String number;
	private double price;
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getNumber(){
		return number;
	}
	public void setNumber(String number){
		this.number=number;
	}
	public double getPrice(){

		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	private MusicPlayer musicplayer;
	
	public MusicPlayer getMusicPlayer(){
		return musicplayer;
	}
	public void setMusicPlayer(MusicPlayer musicplayer){
		this.musicplayer=musicplayer;
	}
	public void displayCarDetails(){
		System.out.println("car details");
		System.out.println("----------");
		System.out.println("Car Id:"+id);
		System.out.println("car Brand:"+brand);
		System.out.println("Car Number:"+number);
		System.out.println("Car price"+price);
	}
	
}
class MainDriver{
	public static void main(String[]args){
		Car car=new Car();
		car.setId(1);
		car.setBrand("creata");
		car.setNumber("TN-1234");
		car.setPrice(90000);
		car.displayCarDetails();
		car.setMusicPlayer(new MusicPlayer(1,"nokia","made in india",5000));
		car.getMusicPlayer().displayMusicPlayerDetails();
	}
}
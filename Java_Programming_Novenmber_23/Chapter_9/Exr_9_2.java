
public class Exr_9_2 {
	public static void main(String[]args){
		
		Stock stock=new Stock();
		System.out.println("Stock symbol:"+stock.symbol+"Stock name:"+stock.name);
		stock.previousClosingPrice=34.5;
		stock.currentPrice=34.35;
		
		System.out.println("Price-change:"+stock.getChangePercent());
	
	}
}

class Stock{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;


Stock(){
	previousClosingPrice=1;
	currentPrice=1;
}

Stock(double newPreviousClosingPrice, double newCurrentPrice){
	previousClosingPrice=newPreviousClosingPrice;
	currentPrice=newCurrentPrice;
}

double getChangePercent{
	return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
}
}


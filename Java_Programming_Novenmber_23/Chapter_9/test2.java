
public class test2 {
	public static void main(String[]args){
		Stock stock=new Stock("ORCL"+"oracle Coporation");
		stock.previousClosingPrice=34.5;
		stock.currentPrice=34.35;
		System.out.println("Stock name;"+ stock.name);
		System.out.println("Stock symbol:"+stock.symbol);
		System.out.printf("Price-change percentage : %2f%%\n" ,stock.getChangePercent());
	}

}

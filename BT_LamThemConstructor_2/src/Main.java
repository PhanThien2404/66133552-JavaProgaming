public class Main {
    public static void main(String[] args) {

        FutureOrder btcLong = new FutureOrder("BTC/USDT", "Long", 60000, 50, 100);
        

        System.out.println("Thị trường dump nhẹ...");
        btcLong.displayTradeStatus(59000);


        FutureOrder ethShort = new FutureOrder("ETH/USDT", "Short", 3500, 20, 500);
        

        System.out.println("Thị trường sập mạnh...");
        ethShort.displayTradeStatus(3200);

        ethShort.setClosed(true);
        System.out.println("Lệnh ETH đã đóng: " + ethShort.isClosed());
    }
}
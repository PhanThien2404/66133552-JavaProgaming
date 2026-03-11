public class FutureOrder {

    private String symbol;
    private String side; 
    private double entryPrice;
    private int leverage;
    private double amount;
    private boolean isClosed;

    public FutureOrder(String symbol, String side, double entryPrice, int leverage, double amount) {
        this.symbol = symbol;
        this.side = side.toUpperCase();
        this.entryPrice = entryPrice;
        this.leverage = (leverage > 0) ? leverage : 1; 
        this.amount = amount;
        this.isClosed = false;
    }


    public String getSymbol() { return symbol; }
    
    public boolean isClosed() { return isClosed; }
    public void setClosed(boolean closed) { isClosed = closed; }

    public void displayTradeStatus(double currentPrice) {

        double priceDiff = (currentPrice - entryPrice) / entryPrice;

        if (side.equals("SHORT")) {
            priceDiff *= -1;
        }

        double pnlPercent = priceDiff * leverage;
        double pnlUsdt = pnlPercent * amount;

        System.out.println("======= ORDER INFO =======");
        System.out.printf("Cặp tiền: %s | Vị thế: %s (x%d)\n", symbol, side, leverage);
        System.out.printf("Entry: %.2f | Current: %.2f\n", entryPrice, currentPrice);
        System.out.printf("PnL: %.2f USDT (%.2f%%)\n", pnlUsdt, pnlPercent * 100);
        

        if (pnlPercent <= -1.0) {
            System.err.println(">>> TRẠNG THÁI: ĐÃ CHÁY (LIQUIDATED) <<<");
        }
        System.out.println("==========================\n");
    }
}
// package tradingproj;

// import java.util.concurrent.*;
// import java.util.*;

// // A mocked class representing a market data handler for high-frequency trading
// class MarketDataHandler {
//   private ConcurrentLinkedQueue<Double> priceQueue = new ConcurrentLinkedQueue<>();

//   // This method simulates incoming price ticks from the market
//   public void onPriceTick(double price) {
//     priceQueue.add(price);
//   }

//   // Retrieve the next price if available
//   public Double getNextPrice() {
//     return priceQueue.poll();
//   }
// }

// // Strategy interface for trading
// interface TradingStrategy {
//   void execute(ConcurrentLinkedQueue<Double> tradesQueue, double price);
// }

// // A simple trading strategy based on price thresholds
// class SimpleThresholdStrategy implements TradingStrategy {
//   private double lowerThreshold;
//   private double upperThreshold;

//   public SimpleThresholdStrategy(double lowerThreshold, double upperThreshold) {
//       this.lowerThreshold = lowerThreshold;
//       this.upperThreshold = upperThreshold;
//   }

//   public void execute(ConcurrentLinkedQueue<Double> tradesQueue, double price) {
//     if (price < lowerThreshold) {
//       // Buy signal
//       tradesQueue.add(price);
//     } 
//     else if (price > upperThreshold) {
//       // Sell signal
//       tradesQueue.add(-price);
//     }
//   }
// }

// // Main trading engine which runs the high-frequency trading logic
// public class TradingEngine implements Runnable {
//   private MarketDataHandler dataHandler;
//   private TradingStrategy strategy;
//   private ConcurrentLinkedQueue<Double> tradesQueue = new ConcurrentLinkedQueue<>();

//   public TradingEngine(MarketDataHandler dataHandler, TradingStrategy strategy) {
//       this.dataHandler = dataHandler;
//       this.strategy = strategy;
//   }

//   public void run() {
//     Double price;
//     while (true) {
//       // Poll for the next available price
//       price = dataHandler.getNextPrice();
//       if (price != null) {
//           // Execute the trading strategy
//           strategy.execute(tradesQueue, price);
//       }

//       try {
//         TimeUnit.MILLISECONDS.sleep(1); // Small delay to mimic processing lag
//       }
//       catch (InterruptedException e) {
//         break;
//       }
//     }
//   }

//   // Get executed trades
//   public ConcurrentLinkedQueue<Double> getTrades() {
//     return tradesQueue;
//   }
// }

// // Example usage and main entry point
// public class HighFrequencyTrading {
//   public static void main(String[] args) throws InterruptedException {
//     MarketDataHandler dataHandler = new MarketDataHandler();
//     TradingStrategy strategy = new SimpleThresholdStrategy(100.00, 200.00);
//     TradingEngine engine = new TradingEngine(dataHandler, strategy);

//     // Simulating a separate thread for the trading engine
//     Thread engineThread = new Thread(engine);
//     engineThread.start();

//     // Mock price ticks
//     for (int i = 0; i < 1000; i++) {
//       dataHandler.onPriceTick(90.0 + Math.random() * 120.0); // Random price between 90 and 210
//       TimeUnit.MILLISECONDS.sleep(1); // Mock interval between price ticks
//     }

//     // Shut down the trading engine thread
//     engineThread.interrupt();
//     engineThread.join();

//     // Outputting the trading decisions
//     System.out.println('Trades Executed:');
//     for (Double trade : engine.getTrades()) {
//       if (trade > 0) {
//         System.out.printf('Bought at: %.2f
// ', trade);
//       }
//       else {
//         System.out.printf('Sold at: %.2f
// ', -trade);
//       }
//     }
//   }
// }
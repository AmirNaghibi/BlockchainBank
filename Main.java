import java.util.ArrayList;
import java.util.Arrays;

public class Main{

    // Create BlockChain
    ArrayList<Block> blockchain = new ArrayList<>();
    
    public static void main(String[] args) {
        // Hard Code Genesis Block
        String[] genesisTransactions = {"satoshi sent ivan 10 bitcoin","hal finney sent 10 bitcoins to ivan"};
        Block genesisBlock = new Block(0, genesisTransactions);
        
        String[] block2Transactions = {"Dean send 20 bitcoins to Bill", "Robert sent 40 bitcoins to Mark"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"Amy send 5 bitcoins to Chris","Danny send 17 bitcoins to Carolin","Ethan send 2 bitcoins to Bryan"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("Genesis block hash: "+genesisBlock.getBlockHash());
        System.out.println("Block 2 hash: "+block2.getBlockHash());
        System.out.println("Block 3 hash: "+block3.getBlockHash());

    }
}
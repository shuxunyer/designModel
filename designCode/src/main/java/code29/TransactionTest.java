package code29;

import javax.transaction.InvalidTransactionException;

public class TransactionTest {
    public void testExecute() throws InvalidTransactionException {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "456";
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId);
        boolean executedResult = transaction.execute();
        assertTrue(executedResult);
    }

    private void assertTrue(boolean executedResult) {
        assert executedResult == true;
    }
}


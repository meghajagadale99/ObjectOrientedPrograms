package com.bridgelabz.oops;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.oops.JsonUtil;
import com.bridgelabz.oops.QueueUsingLL;
import com.bridgelabz.oops.TransactionModel;
import com.bridgelabz.oops.Transactions;
import com.bridgelabz.oops.OOPsUtility;

public class StockAccountUsingQueueTransactions {
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        String pathOfTransactions = "src/main/resources/Transaction.json";

        TransactionModel model = new TransactionModel();

        model = (TransactionModel) JsonUtil.readMapper(pathOfTransactions, model);

        QueueUsingLL<Transactions> queue = new QueueUsingLL<Transactions>();

        queue.enQueueAll(model.getTransactions());

        System.out.println("Enter password");
        if (OOPsUtility.stringScanner().equals("admin")) {
            int size = queue.size();
            // System.out.println(size);
            System.out.println("Transactions time");
            for (int i = 0; i <size; i++) {
                System.out.println(queue.get(0).getDatetime());
                queue.deQueue();
            }
        } else
            System.out.println("Invalid password");
    }

}

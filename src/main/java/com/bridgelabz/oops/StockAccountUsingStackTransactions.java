package com.bridgelabz.oops;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.oops.JsonUtil;
import com.bridgelabz.oops.Stack;
import com.bridgelabz.oops.TransactionModel;
import com.bridgelabz.oops.Transactions;
import com.bridgelabz.oops.OOPsUtility;

public class StockAccountUsingStackTransactions {
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        String pathOfTransactions = "src/main/resources/Transaction.json";

        TransactionModel model = new TransactionModel();

        model = (TransactionModel) JsonUtil.readMapper(pathOfTransactions, model);

        Stack<Transactions> stack = new Stack<Transactions>();

        stack.pushAll(model.getTransactions());

        System.out.println("Enter password");
        if (OOPsUtility.stringScanner().equals("admin")) {
            System.out.println("Enter company symbol to see transactions of that company: ");
            int companySymbol = OOPsUtility.integerScanner();
            boolean isPrint = false;

            System.out.println("Validating...");
            int size = stack.size();
            for (int i = 0; i < size; i++) {

                if (companySymbol == Integer.parseInt(stack.peek().getTransaction_id().substring(7, 11).toString())) {
                    if (!isPrint) {
                        if (i == 0) {
                            System.out.print("Transaction_ID\t");
                            System.out.print("Buyer\t\t");
                            System.out.print("Seller\t\t\t");
                            System.out.print("Trans_Amt\t");
                            System.out.println("DateTime\t");
                        }
                        isPrint = true;
                    }
                    System.out.print(stack.peek().getTransaction_id() + "\t");
                    System.out.print(stack.peek().getBuyer() + "\t\t");
                    System.out.print(stack.peek().getSeller() + "\t\t");
                    System.out.print(stack.peek().getTransaction_amount() + "\t");
                    System.out.println(stack.peek().getDatetime() + "\t");
                }

                stack.pop();
            }
            if (!isPrint) {
                System.out.println("No transaction for this company");
            }
        } else
            System.out.println("Password incorrect");

    }
}

package com.bridgelabz.oops;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.oops.JsonUtil;
import com.bridgelabz.oops.TransactionModel;

public class StockAccountUtility {

    public static Object stockAccount(String fileName, Object object)
            throws JsonParseException, JsonMappingException, IOException {
        return JsonUtil.readMapper(fileName, object.getClass());
    }

    public static double valueOf() {
        return 0;

    }


    public static Object buyShare(TransactionModel model, int customerId, int companySymbol,
                                  int numOfCompanyShareToBuy) {



        return model;
    }

    public static void sellShare() {

    }


    public static String save(String filename, Object object)
            throws JsonParseException, JsonMappingException, IOException {
        JsonUtil.writeMapper(filename, object);
        return "Saving successful";
    }
}

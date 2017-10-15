package com.londonappbrewery.bitcointicker;

import org.json.JSONObject;

/**
 * Created by georgebentes on 15/10/17.
 */

public class BitcoinTickerModel {

    private String value;

    public static BitcoinTickerModel fromJson(JSONObject jsonObject){
        BitcoinTickerModel bitcoin = new BitcoinTickerModel();



        return bitcoin;
    }


    public String getValue() {
        return value;
    }
}

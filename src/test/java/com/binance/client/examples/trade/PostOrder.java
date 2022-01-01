package com.binance.client.examples.trade;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;

import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.enums.*;

public class PostOrder {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        options.setUrl("https://testnet.binancefuture.com");

        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
//        System.out.println(syncRequestClient.postOrder("BTCUSDT", OrderSide.SELL, PositionSide.BOTH, OrderType.LIMIT, TimeInForce.GTC,
//                "1", "1", null, null, null, null));

        // place dual position side order.
        // Switch between dual or both position side, call: com.binance.client.examples.trade.ChangePositionSide

        System.out.println(syncRequestClient.postOrder("C98USDT", OrderSide.BUY, PositionSide.BOTH, OrderType.LIMIT,
                TimeInForce.GTC,
                "20055.1", "2.52", null, null, null, null, null, NewOrderRespType.RESULT));
//        System.out.println(syncRequestClient.cancelOrder("MATICUSDT", new Long(35906220), "qTjxMft8Y8cpWF3G5DI3nj"));
    }
}
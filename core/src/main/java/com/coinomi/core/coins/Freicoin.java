package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;
import com.coinomi.core.coins.families.FrcFamily;

/**
 * @author Hendrik Richter
 */
public class FreicoinMain extends FrcFamily {
    private FreicoinMain() {
        id = "freicoin.main";

        addressHeader = 0;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 128;

        name = "Freicoin";
        symbol = "FRC";
        uriScheme = "freicoin";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(12000);
        minNonDust = value(5460);
        softDustLimit = value(10000); // 0.0001 FRC
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Bitcoin Signed Message:\n");
    }

    private static WorldleadcurrencyMain instance = new WorldleadcurrencyMain();
    public static synchronized CoinType get() {
        return instance;
    }
}

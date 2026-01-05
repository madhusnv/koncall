package com.razorpay;

/* loaded from: classes6.dex */
enum NetworkType {
    WIFI("wifi"),
    CELLULAR("cellular"),
    BLUETOOTH("bluetooth"),
    UNKNOWN("unknown");

    private String mNetworkTypeName;

    NetworkType(String str) {
        this.mNetworkTypeName = str;
    }

    public final String getNetworkTypeName() {
        return this.mNetworkTypeName;
    }
}

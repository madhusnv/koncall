package com.razorpay;

import java.io.Serializable;

/* loaded from: classes6.dex */
class CacheEntry implements Serializable {
    String data;
    long expiryTime;

    public CacheEntry(String str, long j) {
        this.data = str;
        this.expiryTime = j;
    }
}

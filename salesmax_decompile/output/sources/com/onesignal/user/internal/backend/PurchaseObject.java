package com.onesignal.user.internal.backend;

import java.math.BigDecimal;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class PurchaseObject {
    private final BigDecimal amount;
    private final String iso;
    private final String sku;

    public PurchaseObject(String str, String str2, BigDecimal bigDecimal) {
        sq8.m48649h(str, "sku");
        sq8.m48649h(str2, "iso");
        sq8.m48649h(bigDecimal, "amount");
        this.sku = str;
        this.iso = str2;
        this.amount = bigDecimal;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getIso() {
        return this.iso;
    }

    public final String getSku() {
        return this.sku;
    }
}

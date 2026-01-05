package com.onesignal.user.internal.backend;

import java.math.BigDecimal;
import java.util.List;
import p001o.id5;

/* loaded from: classes6.dex */
public final class PropertiesDeltasObject {
    private final BigDecimal amountSpent;
    private final List<PurchaseObject> purchases;
    private final Integer sessionCount;
    private final Long sessionTime;

    public PropertiesDeltasObject() {
        this(null, null, null, null, 15, null);
    }

    public final BigDecimal getAmountSpent() {
        return this.amountSpent;
    }

    public final boolean getHasAtLeastOnePropertySet() {
        return (this.sessionTime == null && this.sessionCount == null && this.amountSpent == null && this.purchases == null) ? false : true;
    }

    public final List<PurchaseObject> getPurchases() {
        return this.purchases;
    }

    public final Integer getSessionCount() {
        return this.sessionCount;
    }

    public final Long getSessionTime() {
        return this.sessionTime;
    }

    public PropertiesDeltasObject(Long l, Integer num, BigDecimal bigDecimal, List<PurchaseObject> list) {
        this.sessionTime = l;
        this.sessionCount = num;
        this.amountSpent = bigDecimal;
        this.purchases = list;
    }

    public /* synthetic */ PropertiesDeltasObject(Long l, Integer num, BigDecimal bigDecimal, List list, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bigDecimal, (i & 8) != 0 ? null : list);
    }
}

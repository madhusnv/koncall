package ai.salesmax.model;

import p001o.f9g;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadFilter$getSearchableContactFilterInputFromSavedViews$1$1 extends kf9 implements xk7 {
    public static final LeadFilter$getSearchableContactFilterInputFromSavedViews$1$1 INSTANCE = new LeadFilter$getSearchableContactFilterInputFromSavedViews$1$1();

    public LeadFilter$getSearchableContactFilterInputFromSavedViews$1$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final Boolean invoke(String str) {
        sq8.m48646e(str);
        return Boolean.valueOf(!f9g.d0(str));
    }
}

package ai.salesmax.model;

import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import type.SearchableContactFilterInput;

/* loaded from: classes.dex */
public final class LeadFilter$getSearchableContactFilterInputFromSavedViews$1$2 extends kf9 implements xk7 {
    final /* synthetic */ LeadFilter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadFilter$getSearchableContactFilterInputFromSavedViews$1$2(LeadFilter leadFilter) {
        super(1);
        this.this$0 = leadFilter;
    }

    @Override // p001o.xk7
    public final SearchableContactFilterInput invoke(String str) {
        LeadFilter leadFilter = this.this$0;
        sq8.m48646e(str);
        return leadFilter.searchableContactFilterInputForInputSearchText(str);
    }
}

package ai.salesmax.model;

import java.util.List;
import p001o.gge;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;
import type.SearchableContactFilterInput;

/* loaded from: classes.dex */
public final class LeadFilter$getSearchableContactFilterInputFromSavedViews$1$3 extends kf9 implements xk7 {
    final /* synthetic */ gge $andConditions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadFilter$getSearchableContactFilterInputFromSavedViews$1$3(gge ggeVar) {
        super(1);
        this.$andConditions = ggeVar;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SearchableContactFilterInput) obj);
        return y3i.f54824a;
    }

    public final void invoke(SearchableContactFilterInput searchableContactFilterInput) {
        sq8.m48649h(searchableContactFilterInput, "it");
        ((List) this.$andConditions.f25106a).add(searchableContactFilterInput);
    }
}

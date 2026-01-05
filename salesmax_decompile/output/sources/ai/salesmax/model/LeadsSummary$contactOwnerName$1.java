package ai.salesmax.model;

import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsSummary$contactOwnerName$1 extends kf9 implements xk7 {
    public static final LeadsSummary$contactOwnerName$1 INSTANCE = new LeadsSummary$contactOwnerName$1();

    public LeadsSummary$contactOwnerName$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(LeadsUser leadsUser) {
        sq8.m48649h(leadsUser, "user");
        return leadsUser.getName();
    }
}

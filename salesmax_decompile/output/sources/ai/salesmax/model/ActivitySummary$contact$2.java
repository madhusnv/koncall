package ai.salesmax.model;

import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class ActivitySummary$contact$2 extends kf9 implements xk7 {
    public static final ActivitySummary$contact$2 INSTANCE = new ActivitySummary$contact$2();

    public ActivitySummary$contact$2() {
        super(1);
    }

    @Override // p001o.xk7
    public final Leads invoke(LeadsSummary leadsSummary) {
        sq8.m48649h(leadsSummary, "obj");
        return leadsSummary.toLeads();
    }
}

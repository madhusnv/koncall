package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Engagement;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class MissedOpportunitiesSummary$engagementSummary$1 extends kf9 implements xk7 {
    public static final MissedOpportunitiesSummary$engagementSummary$1 INSTANCE = new MissedOpportunitiesSummary$engagementSummary$1();

    public MissedOpportunitiesSummary$engagementSummary$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final EngagementSummary invoke(Engagement engagement) {
        sq8.m48646e(engagement);
        return new EngagementSummary(engagement);
    }
}

package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Engagement;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class MissedOpportunitiesSummary$engagementId$1 extends kf9 implements xk7 {
    public static final MissedOpportunitiesSummary$engagementId$1 INSTANCE = new MissedOpportunitiesSummary$engagementId$1();

    public MissedOpportunitiesSummary$engagementId$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(Engagement engagement) {
        sq8.m48649h(engagement, "engagement");
        return engagement.getId();
    }
}

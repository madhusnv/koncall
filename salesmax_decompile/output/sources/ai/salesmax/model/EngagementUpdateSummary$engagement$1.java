package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Engagement;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class EngagementUpdateSummary$engagement$1 extends kf9 implements xk7 {
    public static final EngagementUpdateSummary$engagement$1 INSTANCE = new EngagementUpdateSummary$engagement$1();

    public EngagementUpdateSummary$engagement$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final EngagementSummary invoke(Engagement engagement) {
        sq8.m48646e(engagement);
        return new EngagementSummary(engagement);
    }
}

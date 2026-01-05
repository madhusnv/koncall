package ai.salesmax.model;

import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class EngagementUpdateSummary$updatedBy$2 extends kf9 implements xk7 {
    public static final EngagementUpdateSummary$updatedBy$2 INSTANCE = new EngagementUpdateSummary$updatedBy$2();

    public EngagementUpdateSummary$updatedBy$2() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(LeadsUser leadsUser) {
        return leadsUser.getId();
    }
}

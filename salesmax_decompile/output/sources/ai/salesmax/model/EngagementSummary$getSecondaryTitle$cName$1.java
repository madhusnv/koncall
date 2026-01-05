package ai.salesmax.model;

import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class EngagementSummary$getSecondaryTitle$cName$1 extends kf9 implements xk7 {
    public static final EngagementSummary$getSecondaryTitle$cName$1 INSTANCE = new EngagementSummary$getSecondaryTitle$cName$1();

    public EngagementSummary$getSecondaryTitle$cName$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(LeadsBusiness leadsBusiness) {
        return leadsBusiness.getCompanyName();
    }
}

package ai.salesmax.model;

import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsSummary$secondaryTitle$cName$1 extends kf9 implements xk7 {
    public static final LeadsSummary$secondaryTitle$cName$1 INSTANCE = new LeadsSummary$secondaryTitle$cName$1();

    public LeadsSummary$secondaryTitle$cName$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(LeadsBusiness leadsBusiness) {
        return leadsBusiness.getCompanyName();
    }
}

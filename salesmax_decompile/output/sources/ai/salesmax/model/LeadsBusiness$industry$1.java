package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Business;
import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsBusiness$industry$1 extends kf9 implements xk7 {
    public static final LeadsBusiness$industry$1 INSTANCE = new LeadsBusiness$industry$1();

    public LeadsBusiness$industry$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final String invoke(Business business) {
        return business.getIndustry();
    }
}

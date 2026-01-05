package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.BusinessDetail;
import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsSummary$company$2 extends kf9 implements xk7 {
    public static final LeadsSummary$company$2 INSTANCE = new LeadsSummary$company$2();

    public LeadsSummary$company$2() {
        super(1);
    }

    @Override // p001o.xk7
    public final LeadsBusiness invoke(BusinessDetail businessDetail) {
        return new LeadsBusiness(null, businessDetail, 1, null);
    }
}

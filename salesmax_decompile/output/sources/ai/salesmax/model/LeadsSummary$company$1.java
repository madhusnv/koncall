package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.ContactBusinessMembership;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsSummary$company$1 extends kf9 implements xk7 {
    public static final LeadsSummary$company$1 INSTANCE = new LeadsSummary$company$1();

    public LeadsSummary$company$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final LeadsBusiness invoke(ContactBusinessMembership contactBusinessMembership) {
        sq8.m48646e(contactBusinessMembership);
        return new LeadsBusiness(contactBusinessMembership, null);
    }
}

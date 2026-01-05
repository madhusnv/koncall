package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Address;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsSummary$primaryAddress$3 extends kf9 implements xk7 {
    public static final LeadsSummary$primaryAddress$3 INSTANCE = new LeadsSummary$primaryAddress$3();

    public LeadsSummary$primaryAddress$3() {
        super(1);
    }

    @Override // p001o.xk7
    public final LeadsAddress invoke(Address address) {
        sq8.m48646e(address);
        return new LeadsAddress(address);
    }
}

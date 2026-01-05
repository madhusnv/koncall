package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.DealAssociation;
import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsDeal$leads$1 extends kf9 implements xk7 {
    public static final LeadsDeal$leads$1 INSTANCE = new LeadsDeal$leads$1();

    public LeadsDeal$leads$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final Boolean invoke(DealAssociation dealAssociation) {
        return Boolean.valueOf(dealAssociation.getContact() != null);
    }
}

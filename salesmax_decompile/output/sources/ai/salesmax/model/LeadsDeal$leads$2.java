package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Contact;
import com.amplifyframework.datastore.generated.model.DealAssociation;
import p001o.kf9;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsDeal$leads$2 extends kf9 implements xk7 {
    public static final LeadsDeal$leads$2 INSTANCE = new LeadsDeal$leads$2();

    public LeadsDeal$leads$2() {
        super(1);
    }

    @Override // p001o.xk7
    public final Contact invoke(DealAssociation dealAssociation) {
        return dealAssociation.getContact();
    }
}

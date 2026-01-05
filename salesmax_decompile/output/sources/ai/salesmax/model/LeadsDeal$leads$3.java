package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Contact;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class LeadsDeal$leads$3 extends kf9 implements xk7 {
    public static final LeadsDeal$leads$3 INSTANCE = new LeadsDeal$leads$3();

    public LeadsDeal$leads$3() {
        super(1);
    }

    @Override // p001o.xk7
    public final LeadsSummary invoke(Contact contact) {
        sq8.m48646e(contact);
        return new LeadsSummary(contact);
    }
}

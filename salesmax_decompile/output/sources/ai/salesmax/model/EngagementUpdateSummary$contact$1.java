package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Contact;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;

/* loaded from: classes.dex */
public final class EngagementUpdateSummary$contact$1 extends kf9 implements xk7 {
    public static final EngagementUpdateSummary$contact$1 INSTANCE = new EngagementUpdateSummary$contact$1();

    public EngagementUpdateSummary$contact$1() {
        super(1);
    }

    @Override // p001o.xk7
    public final LeadsSummary invoke(Contact contact) {
        sq8.m48646e(contact);
        return new LeadsSummary(contact);
    }
}

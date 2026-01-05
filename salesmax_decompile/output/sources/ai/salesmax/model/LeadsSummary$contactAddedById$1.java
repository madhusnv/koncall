package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.Contact;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes.dex */
public final class LeadsSummary$contactAddedById$1 extends kf9 implements xk7 {
    final /* synthetic */ LeadsSummary this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeadsSummary$contactAddedById$1(LeadsSummary leadsSummary) {
        super(1);
        this.this$0 = leadsSummary;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return y3i.f54824a;
    }

    public final void invoke(String str) {
        sq8.m48649h(str, "v");
        LeadsSummary leadsSummary = this.this$0;
        Contact contactBuild = leadsSummary.getUnderlyingContact().copyOfBuilder().addedById(str).build();
        sq8.m48648g(contactBuild, "build(...)");
        leadsSummary.setUnderlyingContact(contactBuild);
    }
}

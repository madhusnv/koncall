package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.PaymentData;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes.dex */
public final class PaymentDataSummary$updatedBy$1 extends kf9 implements xk7 {
    final /* synthetic */ PaymentDataSummary this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDataSummary$updatedBy$1(PaymentDataSummary paymentDataSummary) {
        super(1);
        this.this$0 = paymentDataSummary;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LeadsUser) obj);
        return y3i.f54824a;
    }

    public final void invoke(LeadsUser leadsUser) {
        sq8.m48649h(leadsUser, "v");
        PaymentDataSummary paymentDataSummary = this.this$0;
        PaymentData paymentDataBuild = paymentDataSummary.getUnderlyingPaymentData().copyOfBuilder().updatedById(leadsUser.getId()).build();
        sq8.m48648g(paymentDataBuild, "build(...)");
        paymentDataSummary.setUnderlyingPaymentData(paymentDataBuild);
    }
}

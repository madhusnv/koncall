package ai.salesmax.model;

import com.amplifyframework.datastore.generated.model.PaymentOrder;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes.dex */
public final class PaymentOrderSummary$updatedBy$1 extends kf9 implements xk7 {
    final /* synthetic */ PaymentOrderSummary this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOrderSummary$updatedBy$1(PaymentOrderSummary paymentOrderSummary) {
        super(1);
        this.this$0 = paymentOrderSummary;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LeadsUser) obj);
        return y3i.f54824a;
    }

    public final void invoke(LeadsUser leadsUser) {
        sq8.m48649h(leadsUser, "v");
        PaymentOrderSummary paymentOrderSummary = this.this$0;
        PaymentOrder paymentOrderBuild = paymentOrderSummary.getUnderlyingPaymentOrder().copyOfBuilder().updatedById(leadsUser.getId()).build();
        sq8.m48648g(paymentOrderBuild, "build(...)");
        paymentOrderSummary.setUnderlyingPaymentOrder(paymentOrderBuild);
    }
}

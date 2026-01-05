package p001o;

import ai.salesmax.model.PaginatedTokenResults;
import ai.salesmax.model.PaymentDataSummary;
import com.amplifyframework.datastore.generated.model.PaymentData;
import java.util.Optional;
import java.util.function.Function;

/* loaded from: classes.dex */
public abstract class x2d {
    /* renamed from: e */
    public static s47 m55598e() {
        return uni.LB().d0(new gd()).d0(new hd()).C0(la1.BUFFER);
    }

    /* renamed from: f */
    public static x6c m55599f(final PaymentDataSummary paymentDataSummary) {
        return m55598e().h0().m55717M(new rl7() { // from class: o.u2d
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return x2d.m55600g(paymentDataSummary, (l1) obj);
            }
        }).d0(new v2d());
    }

    /* renamed from: g */
    public static /* synthetic */ x8c m55600g(PaymentDataSummary paymentDataSummary, l1 l1Var) {
        return l1Var.Lt(paymentDataSummary.getUnderlyingPaymentData());
    }

    /* renamed from: h */
    public static /* synthetic */ x8c m55601h(PaymentDataSummary paymentDataSummary, String str, l1 l1Var) {
        return l1Var.B8(paymentDataSummary, str);
    }

    /* renamed from: i */
    public static /* synthetic */ g3e m55602i(Optional optional, Optional optional2, int i, l1 l1Var) {
        return l1Var.k8(optional, optional2, i);
    }

    /* renamed from: j */
    public static /* synthetic */ PaginatedTokenResults m55603j(PaginatedTokenResults paginatedTokenResults) {
        return paginatedTokenResults.map(new Function() { // from class: o.t2d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new PaymentDataSummary((PaymentData) obj);
            }
        });
    }

    /* renamed from: k */
    public static x6c m55604k(final PaymentDataSummary paymentDataSummary, final String str) {
        return m55598e().h0().m55717M(new rl7() { // from class: o.w2d
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return x2d.m55601h(paymentDataSummary, str, (l1) obj);
            }
        }).d0(new v2d());
    }

    /* renamed from: l */
    public static s47 m55605l(final Optional optional, final Optional optional2, final int i) {
        return m55598e().m47684F(new rl7() { // from class: o.r2d
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return x2d.m55602i(optional, optional2, i, (l1) obj);
            }
        }).m47686M(new rl7() { // from class: o.s2d
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return x2d.m55603j((PaginatedTokenResults) obj);
            }
        });
    }
}

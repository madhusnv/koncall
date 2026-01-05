package p001o;

import ai.salesmax.model.ProductServiceSummary;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public abstract class ald {
    /* renamed from: c */
    public static x6c m17380c() {
        return uni.LB().d0(new gd()).d0(new hd());
    }

    /* renamed from: d */
    public static /* synthetic */ g3e m17381d(String str, l1 l1Var) {
        return l1Var.El(str);
    }

    /* renamed from: e */
    public static /* synthetic */ x8c m17382e(ProductServiceSummary productServiceSummary, l1 l1Var) {
        return l1Var.G6(productServiceSummary.getUnderlyerProductService());
    }

    /* renamed from: f */
    public static x6c m17383f() {
        return m17380c().C0(la1.BUFFER).m47684F(new rl7() { // from class: o.ykd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ((l1) obj).wk();
            }
        }).m47686M(new xkd()).m47705m(Collectors.toList()).m55027y();
    }

    /* renamed from: g */
    public static x6c m17384g(final String str) {
        return m17380c().C0(la1.BUFFER).m47684F(new rl7() { // from class: o.wkd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ald.m17381d(str, (l1) obj);
            }
        }).m47686M(new xkd()).m47705m(Collectors.toList()).m55027y();
    }

    /* renamed from: h */
    public static x6c m17385h(final ProductServiceSummary productServiceSummary) {
        return m17380c().m55717M(new rl7() { // from class: o.zkd
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return ald.m17382e(productServiceSummary, (l1) obj);
            }
        }).d0(new xkd());
    }
}

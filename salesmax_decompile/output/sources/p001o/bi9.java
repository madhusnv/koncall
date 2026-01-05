package p001o;

import p001o.alb;
import p001o.oc2;

/* loaded from: classes2.dex */
public final class bi9 implements zl5, w14 {

    /* renamed from: a */
    public final oc2 f16380a;

    /* renamed from: b */
    public yx5 f16381b;

    public bi9(oc2 oc2Var) {
        sq8.m48649h(oc2Var, "canvasDrawScope");
        this.f16380a = oc2Var;
    }

    @Override // p001o.zl5
    /* renamed from: A */
    public float mo19172A(float f) {
        return this.f16380a.mo19172A(f);
    }

    @Override // p001o.zl5
    /* renamed from: E */
    public long mo19173E(long j) {
        return this.f16380a.mo19173E(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [o.alb$c] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* renamed from: a */
    public final void m19174a(mc2 mc2Var, long j, xzb xzbVar, alb.AbstractC12216c abstractC12216c) {
        sq8.m48649h(mc2Var, "canvas");
        sq8.m48649h(xzbVar, "coordinator");
        sq8.m48649h(abstractC12216c, "drawNode");
        int iM60153a = zzb.m60153a(4);
        for (yx5 yx5VarM48434f = abstractC12216c; yx5VarM48434f != 0; yx5VarM48434f = sk5.m48434f(null)) {
            if (yx5VarM48434f instanceof yx5) {
                m19175b(mc2Var, j, xzbVar, yx5VarM48434f);
            } else if ((yx5VarM48434f.m17356E() & iM60153a) != 0) {
            }
        }
    }

    /* renamed from: b */
    public final void m19175b(mc2 mc2Var, long j, xzb xzbVar, yx5 yx5Var) {
        sq8.m48649h(mc2Var, "canvas");
        sq8.m48649h(xzbVar, "coordinator");
        sq8.m48649h(yx5Var, "drawNode");
        yx5 yx5Var2 = this.f16381b;
        this.f16381b = yx5Var;
        oc2 oc2Var = this.f16380a;
        qh9 layoutDirection = xzbVar.getLayoutDirection();
        oc2.C15759a c15759aM41951a = oc2Var.m41951a();
        zl5 zl5VarM41952a = c15759aM41951a.m41952a();
        qh9 qh9VarM41953b = c15759aM41951a.m41953b();
        mc2 mc2VarM41954c = c15759aM41951a.m41954c();
        long jM41955d = c15759aM41951a.m41955d();
        oc2.C15759a c15759aM41951a2 = oc2Var.m41951a();
        c15759aM41951a2.m41958g(xzbVar);
        c15759aM41951a2.m41959h(layoutDirection);
        c15759aM41951a2.m41957f(mc2Var);
        c15759aM41951a2.m41960i(j);
        mc2Var.mo20336g();
        yx5Var.mo40258k(this);
        mc2Var.mo20334d();
        oc2.C15759a c15759aM41951a3 = oc2Var.m41951a();
        c15759aM41951a3.m41958g(zl5VarM41952a);
        c15759aM41951a3.m41959h(qh9VarM41953b);
        c15759aM41951a3.m41957f(mc2VarM41954c);
        c15759aM41951a3.m41960i(jM41955d);
        this.f16381b = yx5Var2;
    }

    @Override // p001o.zl5
    public float getDensity() {
        return this.f16380a.getDensity();
    }

    @Override // p001o.zl5
    /* renamed from: o */
    public float mo19176o(long j) {
        return this.f16380a.mo19176o(j);
    }

    @Override // p001o.zl5
    /* renamed from: x */
    public float mo17436x() {
        return this.f16380a.mo17436x();
    }

    public /* synthetic */ bi9(oc2 oc2Var, int i, id5 id5Var) {
        this((i & 1) != 0 ? new oc2() : oc2Var);
    }
}

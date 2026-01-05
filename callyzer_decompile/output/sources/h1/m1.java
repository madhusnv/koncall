package h1;

import ex.InterfaceC2139c;
import k2.C3953b;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a */
    public final x1 f15515a;

    /* renamed from: b */
    public final k2.e1 f15516b = C3953b.m8517t(null);

    /* renamed from: c */
    public final /* synthetic */ s1 f15517c;

    public m1(s1 s1Var, x1 x1Var, String str) {
        this.f15517c = s1Var;
        this.f15515a = x1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final l1 m6838a(InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2) {
        k2.e1 e1Var = this.f15516b;
        l1 l1Var = (l1) e1Var.getValue();
        s1 s1Var = this.f15517c;
        if (l1Var == null) {
            Object objInvoke = interfaceC2139c2.invoke(s1Var.f15588a.mo345y());
            Object objInvoke2 = interfaceC2139c2.invoke(s1Var.f15588a.mo345y());
            x1 x1Var = this.f15515a;
            AbstractC2785p abstractC2785p = (AbstractC2785p) x1Var.f15661a.invoke(objInvoke2);
            abstractC2785p.mo6834d();
            p1 p1Var = new p1(s1Var, objInvoke, abstractC2785p, x1Var);
            l1Var = new l1(this, p1Var, interfaceC2139c, interfaceC2139c2);
            e1Var.setValue(l1Var);
            s1Var.f15596i.add(p1Var);
        }
        l1Var.f15509c = (AbstractC4155m) interfaceC2139c2;
        l1Var.f15508b = interfaceC2139c;
        l1Var.m6836b(s1Var.m6857f());
        return l1Var;
    }
}

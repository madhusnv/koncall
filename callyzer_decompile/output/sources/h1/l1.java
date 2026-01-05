package h1;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l1 implements k2.h2 {

    /* renamed from: a */
    public final p1 f15507a;

    /* renamed from: b */
    public InterfaceC2139c f15508b;

    /* renamed from: c */
    public AbstractC4155m f15509c;

    /* renamed from: d */
    public final /* synthetic */ m1 f15510d;

    /* JADX WARN: Multi-variable type inference failed */
    public l1(m1 m1Var, p1 p1Var, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2) {
        this.f15510d = m1Var;
        this.f15507a = p1Var;
        this.f15508b = interfaceC2139c;
        this.f15509c = (AbstractC4155m) interfaceC2139c2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ex.c, kotlin.jvm.internal.m] */
    /* renamed from: b */
    public final void m6836b(n1 n1Var) {
        Object objInvoke = this.f15509c.invoke(n1Var.mo6100c());
        boolean zM6858g = this.f15510d.f15517c.m6858g();
        p1 p1Var = this.f15507a;
        if (zM6858g) {
            p1Var.m6847h(this.f15509c.invoke(n1Var.mo6099a()), objInvoke, (InterfaceC2794y) this.f15508b.invoke(n1Var));
        } else {
            p1Var.m6848i(objInvoke, (InterfaceC2794y) this.f15508b.invoke(n1Var));
        }
    }

    @Override // k2.h2
    public final Object getValue() {
        m6836b(this.f15510d.f15517c.m6857f());
        return this.f15507a.f15544k.getValue();
    }
}

package p004e;

import kotlin.jvm.internal.AbstractC4154l;
import rw.C6661k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 implements InterfaceC1867b {

    /* renamed from: a */
    public final AbstractC1887v f8863a;

    /* renamed from: b */
    public final /* synthetic */ c0 f8864b;

    public b0(c0 c0Var, AbstractC1887v onBackPressedCallback) {
        AbstractC4154l.m8923f(onBackPressedCallback, "onBackPressedCallback");
        this.f8864b = c0Var;
        this.f8863a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ex.a, kotlin.jvm.internal.j] */
    @Override // p004e.InterfaceC1867b
    public final void cancel() {
        c0 c0Var = this.f8864b;
        C6661k c6661k = c0Var.f8868b;
        AbstractC1887v abstractC1887v = this.f8863a;
        c6661k.remove(abstractC1887v);
        if (AbstractC4154l.m8918a(c0Var.f8869c, abstractC1887v)) {
            abstractC1887v.mo1275a();
            c0Var.f8869c = null;
        }
        abstractC1887v.f8902b.remove(this);
        ?? r02 = abstractC1887v.f8903c;
        if (r02 != 0) {
            r02.invoke();
        }
        abstractC1887v.f8903c = null;
    }
}

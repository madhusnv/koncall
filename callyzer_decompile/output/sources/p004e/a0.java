package p004e;

import b3.C0575g;
import d7.AbstractC1646r;
import d7.EnumC1644p;
import d7.InterfaceC1647s;
import d7.InterfaceC1649u;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 implements InterfaceC1647s, InterfaceC1867b {

    /* renamed from: a */
    public final AbstractC1646r f8859a;

    /* renamed from: b */
    public final AbstractC1887v f8860b;

    /* renamed from: c */
    public b0 f8861c;

    /* renamed from: d */
    public final /* synthetic */ c0 f8862d;

    public a0(c0 c0Var, AbstractC1646r abstractC1646r, AbstractC1887v onBackPressedCallback) {
        AbstractC4154l.m8923f(onBackPressedCallback, "onBackPressedCallback");
        this.f8862d = c0Var;
        this.f8859a = abstractC1646r;
        this.f8860b = onBackPressedCallback;
        abstractC1646r.mo5343a(this);
    }

    @Override // p004e.InterfaceC1867b
    public final void cancel() {
        this.f8859a.mo5346d(this);
        this.f8860b.f8902b.remove(this);
        b0 b0Var = this.f8861c;
        if (b0Var != null) {
            b0Var.cancel();
        }
        this.f8861c = null;
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        if (enumC1644p != EnumC1644p.ON_START) {
            if (enumC1644p != EnumC1644p.ON_STOP) {
                if (enumC1644p == EnumC1644p.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                b0 b0Var = this.f8861c;
                if (b0Var != null) {
                    b0Var.cancel();
                    return;
                }
                return;
            }
        }
        c0 c0Var = this.f8862d;
        c0Var.getClass();
        AbstractC1887v onBackPressedCallback = this.f8860b;
        AbstractC4154l.m8923f(onBackPressedCallback, "onBackPressedCallback");
        c0Var.f8868b.addLast(onBackPressedCallback);
        b0 b0Var2 = new b0(c0Var, onBackPressedCallback);
        onBackPressedCallback.f8902b.add(b0Var2);
        c0Var.m5504e();
        onBackPressedCallback.f8903c = new C0575g(0, c0Var, c0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3);
        this.f8861c = b0Var2;
    }
}

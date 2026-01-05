package a3;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import og.ze;
import p020v.a1;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import v3.AbstractC7634f;
import v3.InterfaceC7644p;
import v3.i0;
import v3.l1;
import w2.AbstractC7878q;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a3.c */
/* loaded from: classes.dex */
public final class C0044c extends AbstractC7878q implements l1, InterfaceC0042a, InterfaceC7644p {

    /* renamed from: q */
    public final C0046e f196q;

    /* renamed from: r */
    public boolean f197r;

    /* renamed from: s */
    public InterfaceC2139c f198s;

    public C0044c(C0046e c0046e, InterfaceC2139c interfaceC2139c) {
        this.f196q = c0046e;
        this.f198s = interfaceC2139c;
        c0046e.f201a = this;
    }

    @Override // v3.InterfaceC7644p
    /* renamed from: C */
    public final void mo151C() {
        L0();
    }

    @Override // v3.InterfaceC7641m
    /* renamed from: I */
    public final void mo152I() {
        L0();
    }

    public final void L0() {
        this.f197r = false;
        this.f196q.f202b = null;
        AbstractC7634f.m14552m(this);
    }

    @Override // a3.InterfaceC0042a
    /* renamed from: a */
    public final InterfaceC6747c mo149a() {
        return AbstractC7634f.m14563x(this).f36825C;
    }

    @Override // v3.InterfaceC7641m
    /* renamed from: c */
    public final void mo153c() {
        L0();
    }

    @Override // v3.l1
    public final void c0() {
        L0();
    }

    @Override // a3.InterfaceC0042a
    /* renamed from: e */
    public final long mo150e() {
        return ze.m11098d(AbstractC7634f.m14561v(this, 128).f34032c);
    }

    @Override // a3.InterfaceC0042a
    public final EnumC6757m getLayoutDirection() {
        return AbstractC7634f.m14563x(this).f36826D;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ex.c, kotlin.jvm.internal.m] */
    @Override // v3.InterfaceC7644p
    public final void h0(i0 i0Var) {
        boolean z6 = this.f197r;
        C0046e c0046e = this.f196q;
        if (!z6) {
            c0046e.f202b = null;
            AbstractC7634f.m14559t(this, new C0043b(0, this, c0046e));
            if (c0046e.f202b == null) {
                throw a1.m14342v("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f197r = true;
        }
        C8986c c8986c = c0046e.f202b;
        AbstractC4154l.m8920c(c8986c);
        ((AbstractC4155m) c8986c.f43336b).invoke(i0Var);
    }

    @Override // w2.AbstractC7878q
    public final void E0() {
    }
}

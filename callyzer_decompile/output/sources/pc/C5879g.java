package pc;

import b00.AbstractC0517b;
import b00.InterfaceC0527l;
import b00.c0;
import ec.C2005c;
import iz.C3393z;
import iz.i0;
import kotlin.jvm.internal.AbstractC4154l;
import pd.C5897c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.g */
/* loaded from: classes.dex */
public final class C5879g extends i0 {

    /* renamed from: b */
    public final i0 f28677b;

    /* renamed from: c */
    public final C5897c f28678c;

    /* renamed from: d */
    public final C2005c f28679d;

    public C5879g(i0 delegate, C5897c counter, C2005c c2005c) {
        AbstractC4154l.m8923f(delegate, "delegate");
        AbstractC4154l.m8923f(counter, "counter");
        this.f28677b = delegate;
        this.f28678c = counter;
        this.f28679d = c2005c;
    }

    @Override // iz.i0
    /* renamed from: a */
    public final long mo7445a() {
        return this.f28677b.mo7445a();
    }

    @Override // iz.i0
    /* renamed from: b */
    public final C3393z mo7446b() {
        return this.f28677b.mo7446b();
    }

    @Override // iz.i0
    /* renamed from: c */
    public final boolean mo7730c() {
        return this.f28677b.mo7730c();
    }

    @Override // iz.i0
    /* renamed from: d */
    public final boolean mo7727d() {
        return this.f28677b.mo7727d();
    }

    @Override // iz.i0
    /* renamed from: e */
    public final void mo7447e(InterfaceC0527l interfaceC0527l) {
        c0 c0VarM1523b = AbstractC0517b.m1523b(new C5881i(interfaceC0527l, this.f28678c, this.f28679d));
        this.f28677b.mo7447e(c0VarM1523b);
        if (c0VarM1523b.f3597c) {
            return;
        }
        c0VarM1523b.mo1537c();
    }
}

package tx;

import kotlinx.coroutines.CompletionHandlerException;
import qw.C6364n;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tx.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7241a extends k1 implements InterfaceC7559c, InterfaceC7266z {

    /* renamed from: c */
    public final InterfaceC7564h f34593c;

    public AbstractC7241a(InterfaceC7564h interfaceC7564h, boolean z6) {
        super(z6);
        m13554M((e1) interfaceC7564h.o0(C7263w.f34689b));
        this.f34593c = interfaceC7564h.t0(this);
    }

    @Override // tx.k1
    /* renamed from: L */
    public final void mo13458L(CompletionHandlerException completionHandlerException) {
        c0.m13497t(completionHandlerException, this.f34593c);
    }

    @Override // tx.k1
    /* renamed from: Y */
    public final void mo13459Y(Object obj) {
        if (!(obj instanceof C7260t)) {
            j0(obj);
        } else {
            C7260t c7260t = (C7260t) obj;
            i0(c7260t.f34677a, C7260t.f34676b.get(c7260t) == 1);
        }
    }

    @Override // uw.InterfaceC7559c
    public final InterfaceC7564h getContext() {
        return this.f34593c;
    }

    @Override // uw.InterfaceC7559c
    public final void resumeWith(Object obj) {
        Throwable thM12363a = C6364n.m12363a(obj);
        if (thM12363a != null) {
            obj = new C7260t(thM12363a, false);
        }
        Object objM13559T = m13559T(obj);
        if (objM13559T == c0.f34609e) {
            return;
        }
        mo13504l(objM13559T);
    }

    @Override // tx.k1
    /* renamed from: t */
    public final String mo13460t() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // tx.InterfaceC7266z
    /* renamed from: w */
    public final InterfaceC7564h mo1865w() {
        return this.f34593c;
    }

    public void j0(Object obj) {
    }

    public void i0(Throwable th2, boolean z6) {
    }
}

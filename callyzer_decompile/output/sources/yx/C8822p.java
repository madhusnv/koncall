package yx;

import kotlinx.coroutines.DispatchException;
import pg.n6;
import tx.AbstractC7241a;
import tx.c0;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import ww.InterfaceC8194d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.p */
/* loaded from: classes3.dex */
public class C8822p extends AbstractC7241a implements InterfaceC8194d {

    /* renamed from: d */
    public final InterfaceC7559c f42516d;

    public C8822p(InterfaceC7559c interfaceC7559c, InterfaceC7564h interfaceC7564h) {
        super(interfaceC7564h, true);
        this.f42516d = interfaceC7559c;
    }

    @Override // tx.k1
    /* renamed from: Q */
    public final boolean mo13557Q() {
        return true;
    }

    @Override // ww.InterfaceC8194d
    public final InterfaceC8194d getCallerFrame() {
        InterfaceC7559c interfaceC7559c = this.f42516d;
        if (interfaceC7559c instanceof InterfaceC8194d) {
            return (InterfaceC8194d) interfaceC7559c;
        }
        return null;
    }

    @Override // tx.k1
    /* renamed from: k */
    public void mo13511k(Object obj) throws DispatchException {
        AbstractC8808b.m16250j(c0.m13466B(obj), n6.m11797c(this.f42516d));
    }

    @Override // tx.k1
    /* renamed from: l */
    public void mo13504l(Object obj) {
        this.f42516d.resumeWith(c0.m13466B(obj));
    }

    public void k0() {
    }
}

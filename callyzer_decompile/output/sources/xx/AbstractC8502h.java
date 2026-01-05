package xx;

import qw.a0;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import vx.EnumC7799a;
import vx.InterfaceC7819u;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.h */
/* loaded from: classes3.dex */
public abstract class AbstractC8502h extends AbstractC8499e {

    /* renamed from: d */
    public final InterfaceC8209j f41413d;

    public AbstractC8502h(InterfaceC8209j interfaceC8209j, InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        super(interfaceC7564h, i10, enumC7799a);
        this.f41413d = interfaceC8209j;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    @Override // xx.AbstractC8499e, wx.InterfaceC8209j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(wx.InterfaceC8210k r5, uw.InterfaceC7559c r6) {
        /*
            r4 = this;
            int r0 = r4.f41404b
            r1 = -3
            if (r0 != r1) goto L56
            uw.h r0 = r6.getContext()
            uw.h r1 = r4.f41403a
            uw.h r1 = tx.c0.m13465A(r0, r1)
            boolean r2 = kotlin.jvm.internal.AbstractC4154l.m8918a(r1, r0)
            if (r2 == 0) goto L1e
            java.lang.Object r5 = r4.mo15790i(r5, r6)
            vw.a r6 = vw.EnumC7794a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L5f
            return r5
        L1e:
            uw.d r2 = uw.C7560d.f36439a
            uw.f r3 = r1.o0(r2)
            uw.f r0 = r0.o0(r2)
            boolean r0 = kotlin.jvm.internal.AbstractC4154l.m8918a(r3, r0)
            if (r0 == 0) goto L56
            uw.h r0 = r6.getContext()
            boolean r2 = r5 instanceof xx.C8516v
            if (r2 != 0) goto L41
            boolean r2 = r5 instanceof xx.C8512r
            if (r2 == 0) goto L3b
            goto L41
        L3b:
            b8.i r2 = new b8.i
            r2.<init>(r5, r0)
            r5 = r2
        L41:
            xm.h3 r0 = new xm.h3
            r2 = 0
            r3 = 24
            r0.<init>(r4, r2, r3)
            java.lang.Object r2 = yx.AbstractC8808b.m16255o(r1)
            java.lang.Object r5 = xx.AbstractC8496b.m15789b(r1, r5, r2, r0, r6)
            vw.a r6 = vw.EnumC7794a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L5f
            return r5
        L56:
            java.lang.Object r5 = super.collect(r5, r6)
            vw.a r6 = vw.EnumC7794a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L5f
            return r5
        L5f:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xx.AbstractC8502h.collect(wx.k, uw.c):java.lang.Object");
    }

    @Override // xx.AbstractC8499e
    /* renamed from: e */
    public final Object mo15368e(InterfaceC7819u interfaceC7819u, InterfaceC7559c interfaceC7559c) {
        Object objMo15790i = mo15790i(new C8516v(interfaceC7819u), interfaceC7559c);
        return objMo15790i == EnumC7794a.COROUTINE_SUSPENDED ? objMo15790i : a0.f30746a;
    }

    /* renamed from: i */
    public abstract Object mo15790i(InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c);

    @Override // xx.AbstractC8499e
    public final String toString() {
        return this.f41413d + " -> " + super.toString();
    }
}

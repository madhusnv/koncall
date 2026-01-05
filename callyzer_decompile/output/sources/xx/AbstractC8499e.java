package xx;

import a2.AbstractC0030c;
import java.util.ArrayList;
import pg.o6;
import qw.a0;
import rw.AbstractC6663m;
import tx.InterfaceC7266z;
import tx.b0;
import tx.c0;
import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import vx.C7818t;
import vx.EnumC7799a;
import vx.InterfaceC7819u;
import vx.InterfaceC7821w;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;
import xm.h3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.e */
/* loaded from: classes3.dex */
public abstract class AbstractC8499e implements InterfaceC8510p {

    /* renamed from: a */
    public final InterfaceC7564h f41403a;

    /* renamed from: b */
    public final int f41404b;

    /* renamed from: c */
    public final EnumC7799a f41405c;

    public AbstractC8499e(InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        this.f41403a = interfaceC7564h;
        this.f41404b = i10;
        this.f41405c = enumC7799a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // xx.InterfaceC8510p
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final wx.InterfaceC8209j mo15353c(uw.InterfaceC7564h r5, int r6, vx.EnumC7799a r7) {
        /*
            r4 = this;
            uw.h r0 = r4.f41403a
            uw.h r5 = r5.t0(r0)
            vx.a r1 = vx.EnumC7799a.SUSPEND
            vx.a r2 = r4.f41405c
            int r3 = r4.f41404b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.AbstractC4154l.m8918a(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            xx.e r5 = r4.mo15369f(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xx.AbstractC8499e.mo15353c(uw.h, int, vx.a):wx.j");
    }

    @Override // wx.InterfaceC8209j
    public Object collect(InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) {
        Object objM13488k = c0.m13488k(new C8498d(interfaceC8210k, this, null, 0), interfaceC7559c);
        return objM13488k == EnumC7794a.COROUTINE_SUSPENDED ? objM13488k : a0.f30746a;
    }

    /* renamed from: d */
    public String mo15391d() {
        return null;
    }

    /* renamed from: e */
    public abstract Object mo15368e(InterfaceC7819u interfaceC7819u, InterfaceC7559c interfaceC7559c);

    /* renamed from: f */
    public abstract AbstractC8499e mo15369f(InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a);

    /* renamed from: g */
    public InterfaceC8209j mo15392g() {
        return null;
    }

    /* renamed from: h */
    public InterfaceC7821w mo15393h(InterfaceC7266z interfaceC7266z) {
        int i10 = this.f41404b;
        if (i10 == -3) {
            i10 = -2;
        }
        b0 b0Var = b0.ATOMIC;
        h3 h3Var = new h3(this, null, 23);
        C7818t c7818t = new C7818t(c0.m13503z(interfaceC7266z, this.f41403a), o6.m11805a(i10, this.f41405c, null, 4));
        b0Var.invoke(h3Var, c7818t, c7818t);
        return c7818t;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo15391d = mo15391d();
        if (strMo15391d != null) {
            arrayList.add(strMo15391d);
        }
        C7565i c7565i = C7565i.f36440a;
        InterfaceC7564h interfaceC7564h = this.f41403a;
        if (interfaceC7564h != c7565i) {
            arrayList.add("context=" + interfaceC7564h);
        }
        int i10 = this.f41404b;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        EnumC7799a enumC7799a = EnumC7799a.SUSPEND;
        EnumC7799a enumC7799a2 = this.f41405c;
        if (enumC7799a2 != enumC7799a) {
            arrayList.add("onBufferOverflow=" + enumC7799a2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return AbstractC0030c.m123n(sb2, AbstractC6663m.m12748L(arrayList, ", ", null, null, null, 62), ']');
    }
}

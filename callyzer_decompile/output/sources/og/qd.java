package og;

import d7.AbstractC1646r;
import d7.EnumC1645q;
import d7.InterfaceC1649u;
import e7.AbstractC1967c;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.Arrays;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import qx.InterfaceC6378b;
import qx.InterfaceC6379c;
import rx.AbstractC6677a;
import rx.C6680d;
import rx.C6683g;
import uw.C7565i;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class qd {
    /* renamed from: a */
    public static final k2.w0 m10853a(wx.k1 k1Var, InterfaceC3962k interfaceC3962k) {
        InterfaceC1649u interfaceC1649u = (InterfaceC1649u) ((C3966o) interfaceC3962k).m8618k(AbstractC1967c.f9212a);
        EnumC1645q enumC1645q = EnumC1645q.STARTED;
        Object value = k1Var.getValue();
        AbstractC1646r lifecycle = interfaceC1649u.getLifecycle();
        C7565i c7565i = C7565i.f36440a;
        Object[] objArr = {k1Var, lifecycle, enumC1645q, c7565i};
        C3966o c3966o = (C3966o) interfaceC3962k;
        boolean zM8616i = c3966o.m8616i(lifecycle) | c3966o.m8612e(enumC1645q.ordinal()) | c3966o.m8616i(c7565i) | c3966o.m8616i(k1Var);
        Object objM8596M = c3966o.m8596M();
        k2.s0 s0Var = C3961j.f20408a;
        if (zM8616i || objM8596M == s0Var) {
            aw.d0 d0Var = new aw.d0(lifecycle, enumC1645q, c7565i, k1Var, null, 2);
            c3966o.j0(d0Var);
            objM8596M = d0Var;
        }
        InterfaceC2141e interfaceC2141e = (InterfaceC2141e) objM8596M;
        Object objM8596M2 = c3966o.m8596M();
        if (objM8596M2 == s0Var) {
            objM8596M2 = C3953b.m8517t(value);
            c3966o.j0(objM8596M2);
        }
        k2.w0 w0Var = (k2.w0) objM8596M2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zM8616i2 = c3966o.m8616i(interfaceC2141e);
        Object objM8596M3 = c3966o.m8596M();
        if (zM8616i2 || objM8596M3 == s0Var) {
            objM8596M3 = new k2.f2(interfaceC2141e, w0Var, null, 2);
            c3966o.j0(objM8596M3);
        }
        InterfaceC2141e interfaceC2141e2 = (InterfaceC2141e) objM8596M3;
        InterfaceC7564h interfaceC7564hMo8563h = c3966o.f20465b.mo8563h();
        boolean zM8614g = false;
        for (Object obj : Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)) {
            zM8614g |= c3966o.m8614g(obj);
        }
        Object objM8596M4 = c3966o.m8596M();
        if (!zM8614g && objM8596M4 != s0Var) {
            return w0Var;
        }
        c3966o.j0(new k2.q0(interfaceC7564hMo8563h, interfaceC2141e2));
        return w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final InterfaceC6378b m10854b(ArrayList arrayList) {
        InterfaceC6378b interfaceC6378b = arrayList instanceof InterfaceC6378b ? (InterfaceC6378b) arrayList : null;
        if (interfaceC6378b != null) {
            return interfaceC6378b;
        }
        InterfaceC6379c interfaceC6379c = arrayList instanceof InterfaceC6379c ? (InterfaceC6379c) arrayList : null;
        AbstractC6677a abstractC6677aM12808j = interfaceC6379c != null ? ((C6680d) interfaceC6379c).m12808j() : null;
        if (abstractC6677aM12808j != null) {
            return abstractC6677aM12808j;
        }
        C6683g c6683g = C6683g.f31970b;
        AbstractC4154l.m8923f(c6683g, "<this>");
        Object[] objArr = c6683g.f31971a;
        if (arrayList.isEmpty()) {
            return c6683g;
        }
        if (arrayList.size() + objArr.length > 32) {
            c6683g.getClass();
            C6680d c6680d = new C6680d(c6683g, null, c6683g.f31971a, 0);
            c6680d.addAll(arrayList);
            return c6680d.m12808j();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, arrayList.size() + objArr.length);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            objArrCopyOf[length] = obj;
            length++;
        }
        return new C6683g(objArrCopyOf);
    }
}

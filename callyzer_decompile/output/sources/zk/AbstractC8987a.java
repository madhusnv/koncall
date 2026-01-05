package zk;

import ex.InterfaceC2139c;
import l7.AbstractC4422v;
import l7.c0;
import l7.d0;
import l7.e0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zk.a */
/* loaded from: classes.dex */
public abstract class AbstractC8987a {
    /* renamed from: a */
    public static final d0 m16464a(InterfaceC2139c interfaceC2139c) {
        e0 e0Var = new e0();
        interfaceC2139c.invoke(e0Var);
        boolean z6 = e0Var.f22027b;
        boolean z10 = e0Var.f22028c;
        String str = e0Var.f22030e;
        c0 c0Var = e0Var.f22026a;
        if (str != null) {
            boolean z11 = e0Var.f22031f;
            boolean z12 = e0Var.f22032g;
            c0Var.f22010b = str;
            c0Var.f22009a = -1;
            c0Var.f22011c = z11;
            c0Var.f22012d = z12;
        } else {
            int i10 = e0Var.f22029d;
            boolean z13 = e0Var.f22031f;
            boolean z14 = e0Var.f22032g;
            c0Var.f22009a = i10;
            c0Var.f22010b = null;
            c0Var.f22011c = z13;
            c0Var.f22012d = z14;
        }
        String str2 = c0Var.f22010b;
        if (str2 == null) {
            return new d0(z6, z10, c0Var.f22009a, c0Var.f22011c, c0Var.f22012d, c0Var.f22013e, c0Var.f22014f, -1, -1);
        }
        boolean z15 = c0Var.f22011c;
        boolean z16 = c0Var.f22012d;
        int i11 = c0Var.f22013e;
        int i12 = c0Var.f22014f;
        int i13 = AbstractC4422v.f22133f;
        d0 d0Var = new d0(z6, z10, "android-app://androidx.navigation/".concat(str2).hashCode(), z15, z16, i11, i12, -1, -1);
        d0Var.f22025j = str2;
        return d0Var;
    }
}

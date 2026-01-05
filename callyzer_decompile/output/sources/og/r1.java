package og;

import androidx.compose.animation.AbstractC0234a;
import ao.C0381t;
import com.amplifyframework.auth.cognito.C1139f;
import com.skydoves.balloon.internals.DefinitionKt;
import d7.InterfaceC1649u;
import e7.AbstractC1967c;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g1.C2438r;
import g1.u0;
import g1.v0;
import h7.AbstractC2868a;
import hp.C2995b;
import hq.C2996a;
import hq.C3009n;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import l7.AbstractC4422v;
import l7.C4409i;
import l7.C4423w;
import l7.C4424x;
import n7.C4964i;
import n7.C4970o;
import n7.C4974s;
import og.r1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import q7.C6138e;
import qw.a0;
import rw.AbstractC6663m;
import s2.AbstractC6740i;
import t2.C7006e;
import uw.InterfaceC7559c;
import w2.C7864c;
import w2.C7871j;
import w2.C7876o;
import w2.InterfaceC7866e;
import w2.InterfaceC7879r;
import zh.AbstractC8954a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class r1 {
    /* renamed from: a */
    public static final void m10867a(final l7.a0 a0Var, final String str, InterfaceC7879r interfaceC7879r, InterfaceC7866e interfaceC7866e, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2139c interfaceC2139c3, InterfaceC2139c interfaceC2139c4, final InterfaceC2139c interfaceC2139c5, InterfaceC3962k interfaceC3962k, final int i10) {
        int i11;
        InterfaceC2139c interfaceC2139c6;
        int i12;
        InterfaceC7866e interfaceC7866e2;
        char c2;
        InterfaceC7879r interfaceC7879r2;
        InterfaceC2139c interfaceC2139c7;
        InterfaceC2139c interfaceC2139c8;
        InterfaceC2139c interfaceC2139c9;
        C3966o c3966o;
        final InterfaceC2139c interfaceC2139c10;
        final InterfaceC2139c interfaceC2139c11;
        final InterfaceC2139c interfaceC2139c12;
        final InterfaceC2139c interfaceC2139c13;
        final InterfaceC7866e interfaceC7866e3;
        final InterfaceC7879r interfaceC7879r3;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(1840250294);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c3966o2.m8616i(a0Var) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o2.m8614g(str) ? 32 : 16;
        }
        int i13 = 1797504 | i11;
        if ((i10 & 12582912) == 0) {
            i13 = 5991808 | i11;
        }
        if ((i10 & 100663296) == 0) {
            i13 |= 33554432;
        }
        int i14 = 805306368 | i13;
        char c10 = c3966o2.m8616i(interfaceC2139c5) ? (char) 4 : (char) 2;
        if ((306783379 & i14) == 306783378 && (c10 & 3) == 2 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            interfaceC7879r3 = interfaceC7879r;
            interfaceC7866e3 = interfaceC7866e;
            interfaceC2139c13 = interfaceC2139c;
            interfaceC2139c12 = interfaceC2139c2;
            interfaceC2139c11 = interfaceC2139c3;
            c3966o = c3966o2;
            interfaceC2139c10 = interfaceC2139c4;
        } else {
            c3966o2.m8603U();
            int i15 = i10 & 1;
            k2.s0 s0Var = C3961j.f20408a;
            if (i15 == 0 || c3966o2.m8584A()) {
                C7871j c7871j = C7864c.f37642a;
                Object objM8596M = c3966o2.m8596M();
                if (objM8596M == s0Var) {
                    objM8596M = new hq.d0(22);
                    c3966o2.j0(objM8596M);
                }
                InterfaceC2139c interfaceC2139c14 = (InterfaceC2139c) objM8596M;
                Object objM8596M2 = c3966o2.m8596M();
                if (objM8596M2 == s0Var) {
                    objM8596M2 = new hq.d0(24);
                    c3966o2.j0(objM8596M2);
                }
                interfaceC2139c6 = (InterfaceC2139c) objM8596M2;
                i12 = i14 & (-264241153);
                interfaceC7866e2 = c7871j;
                c2 = c10;
                interfaceC7879r2 = C7876o.f37669a;
                interfaceC2139c7 = interfaceC2139c14;
                interfaceC2139c8 = interfaceC2139c7;
                interfaceC2139c9 = interfaceC2139c6;
            } else {
                c3966o2.m8601S();
                interfaceC7879r2 = interfaceC7879r;
                interfaceC2139c6 = interfaceC2139c2;
                interfaceC2139c8 = interfaceC2139c3;
                interfaceC2139c9 = interfaceC2139c4;
                i12 = i14 & (-264241153);
                c2 = c10;
                interfaceC7866e2 = interfaceC7866e;
                interfaceC2139c7 = interfaceC2139c;
            }
            c3966o2.m8624q();
            boolean z6 = ((i12 & 57344) == 16384) | ((i12 & 112) == 32) | ((c2 & 14) == 4);
            Object objM8596M3 = c3966o2.m8596M();
            if (z6 || objM8596M3 == s0Var) {
                C4424x c4424x = new C4424x(a0Var.f21996b.f29925s, str);
                interfaceC2139c5.invoke(c4424x);
                objM8596M3 = c4424x.m9256g();
                c3966o2.j0(objM8596M3);
            }
            C4423w c4423w = (C4423w) objM8596M3;
            int i16 = i12 >> 3;
            int i17 = (i12 & 8078) | (i16 & 57344) | (458752 & i16) | (i16 & 234881024);
            InterfaceC2139c interfaceC2139c15 = interfaceC2139c9;
            InterfaceC7866e interfaceC7866e4 = interfaceC7866e2;
            InterfaceC2139c interfaceC2139c16 = interfaceC2139c6;
            m10868b(a0Var, c4423w, interfaceC7879r2, interfaceC7866e4, interfaceC2139c7, interfaceC2139c16, interfaceC2139c8, interfaceC2139c15, c3966o2, i17);
            c3966o = c3966o2;
            interfaceC2139c10 = interfaceC2139c15;
            interfaceC2139c11 = interfaceC2139c8;
            interfaceC2139c12 = interfaceC2139c16;
            interfaceC2139c13 = interfaceC2139c7;
            interfaceC7866e3 = interfaceC7866e4;
            interfaceC7879r3 = interfaceC7879r2;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new InterfaceC2141e() { // from class: n7.q
                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r1.m10867a(a0Var, str, interfaceC7879r3, interfaceC7866e3, interfaceC2139c13, interfaceC2139c12, interfaceC2139c11, interfaceC2139c10, interfaceC2139c5, (InterfaceC3962k) obj, C3953b.m8496A(i10 | 1));
                    return a0.f30746a;
                }
            };
        }
    }

    /* renamed from: b */
    public static final void m10868b(final l7.a0 a0Var, final C4423w graph, final InterfaceC7879r interfaceC7879r, final InterfaceC7866e interfaceC7866e, final InterfaceC2139c interfaceC2139c, final InterfaceC2139c interfaceC2139c2, final InterfaceC2139c interfaceC2139c3, final InterfaceC2139c interfaceC2139c4, InterfaceC3962k interfaceC3962k, final int i10) {
        int i11;
        final InterfaceC7879r interfaceC7879r2;
        final InterfaceC7866e interfaceC7866e2;
        final InterfaceC2139c interfaceC2139c5;
        InterfaceC2139c interfaceC2139c6;
        final C4964i c4964i;
        k2.w0 w0Var;
        Object obj;
        C3966o c3966o;
        C4970o c4970o;
        int i12;
        C7006e c7006e;
        e1.c0 c0Var;
        C4409i c4409i;
        boolean z6;
        InterfaceC2139c interfaceC2139c7;
        h1.s1 s1Var;
        h1.x0 x0Var;
        k2.h2 h2Var;
        C4964i c4964i2;
        Object obj2;
        h1.x0 x0Var2;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-1964664536);
        if ((i10 & 6) == 0) {
            i11 = (c3966o2.m8616i(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o2.m8616i(graph) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            interfaceC7879r2 = interfaceC7879r;
            i11 |= c3966o2.m8614g(interfaceC7879r2) ? 256 : 128;
        } else {
            interfaceC7879r2 = interfaceC7879r;
        }
        if ((i10 & 3072) == 0) {
            interfaceC7866e2 = interfaceC7866e;
            i11 |= c3966o2.m8614g(interfaceC7866e2) ? NewHope.SENDB_BYTES : 1024;
        } else {
            interfaceC7866e2 = interfaceC7866e;
        }
        if ((i10 & 24576) == 0) {
            interfaceC2139c5 = interfaceC2139c;
            i11 |= c3966o2.m8616i(interfaceC2139c5) ? 16384 : 8192;
        } else {
            interfaceC2139c5 = interfaceC2139c;
        }
        if ((196608 & i10) == 0) {
            interfaceC2139c6 = interfaceC2139c2;
            i11 |= c3966o2.m8616i(interfaceC2139c6) ? 131072 : 65536;
        } else {
            interfaceC2139c6 = interfaceC2139c2;
        }
        if ((i10 & 1572864) == 0) {
            i11 |= c3966o2.m8616i(interfaceC2139c3) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i11 |= c3966o2.m8616i(interfaceC2139c4) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i11 |= c3966o2.m8616i(null) ? 67108864 : 33554432;
        }
        if ((i11 & 38347923) == 38347922 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            c3966o = c3966o2;
        } else {
            c3966o2.m8603U();
            if ((i10 & 1) != 0 && !c3966o2.m8584A()) {
                c3966o2.m8601S();
            }
            c3966o2.m8624q();
            InterfaceC1649u interfaceC1649u = (InterfaceC1649u) c3966o2.m8618k(AbstractC1967c.f9212a);
            d7.c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o2);
            if (c1VarM6992a == null) {
                throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
            }
            a0Var.m9192l(c1VarM6992a.getViewModelStore());
            C6138e c6138e = a0Var.f21996b;
            AbstractC4154l.m8923f(graph, "graph");
            c6138e.getClass();
            l7.o0 o0Var = c6138e.f29925s;
            c6138e.m12186v(graph, null);
            l7.n0 n0VarM9233b = o0Var.m9233b("composable");
            C4964i c4964i3 = n0VarM9233b instanceof C4964i ? (C4964i) n0VarM9233b : null;
            if (c4964i3 == null) {
                k2.n1 n1VarM8628u = c3966o2.m8628u();
                if (n1VarM8628u != null) {
                    final int i13 = 2;
                    final InterfaceC2139c interfaceC2139c8 = interfaceC2139c6;
                    n1VarM8628u.f20443d = new InterfaceC2141e() { // from class: n7.r
                        @Override // ex.InterfaceC2141e
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i13) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    r1.m10868b(a0Var, graph, interfaceC7879r2, interfaceC7866e2, interfaceC2139c5, interfaceC2139c8, interfaceC2139c3, interfaceC2139c4, (InterfaceC3962k) obj3, C3953b.m8496A(i10 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj4).getClass();
                                    r1.m10868b(a0Var, graph, interfaceC7879r2, interfaceC7866e2, interfaceC2139c5, interfaceC2139c8, interfaceC2139c3, interfaceC2139c4, (InterfaceC3962k) obj3, C3953b.m8496A(i10 | 1));
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    r1.m10868b(a0Var, graph, interfaceC7879r2, interfaceC7866e2, interfaceC2139c5, interfaceC2139c8, interfaceC2139c3, interfaceC2139c4, (InterfaceC3962k) obj3, C3953b.m8496A(i10 | 1));
                                    break;
                            }
                            return a0.f30746a;
                        }
                    };
                    return;
                }
                return;
            }
            k2.w0 w0VarM8509l = C3953b.m8509l(c4964i3.m9225b().f22080e, c3966o2);
            Object objM8596M = c3966o2.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            Object obj3 = objM8596M;
            if (objM8596M == s0Var) {
                k2.a1 a1Var = new k2.a1(DefinitionKt.NO_Float_VALUE);
                c3966o2.j0(a1Var);
                obj3 = a1Var;
            }
            k2.a1 a1Var2 = (k2.a1) obj3;
            Object objM8596M2 = c3966o2.m8596M();
            Object obj4 = objM8596M2;
            if (objM8596M2 == s0Var) {
                k2.e1 e1VarM8517t = C3953b.m8517t(Boolean.FALSE);
                c3966o2.j0(e1VarM8517t);
                obj4 = e1VarM8517t;
            }
            final k2.w0 w0Var2 = (k2.w0) obj4;
            boolean z10 = ((List) w0VarM8509l.getValue()).size() > 1;
            boolean zM8614g = c3966o2.m8614g(w0VarM8509l) | c3966o2.m8616i(c4964i3);
            Object objM8596M3 = c3966o2.m8596M();
            if (zM8614g || objM8596M3 == s0Var) {
                C4964i c4964i4 = c4964i3;
                objM8596M3 = new aw.d0(c4964i4, w0VarM8509l, a1Var2, w0Var2, null, 12);
                c4964i = c4964i4;
                w0Var = w0VarM8509l;
                c3966o2.j0(objM8596M3);
            } else {
                C4964i c4964i5 = c4964i3;
                w0Var = w0VarM8509l;
                c4964i = c4964i5;
            }
            na.m10773a(z10, (InterfaceC2141e) objM8596M3, c3966o2, 0);
            boolean zM8616i = c3966o2.m8616i(a0Var) | c3966o2.m8616i(interfaceC1649u);
            Object objM8596M4 = c3966o2.m8596M();
            Object obj5 = objM8596M4;
            if (zM8616i || objM8596M4 == s0Var) {
                C3009n c3009n = new C3009n(13, a0Var, interfaceC1649u);
                c3966o2.j0(c3009n);
                obj5 = c3009n;
            }
            C3953b.m8500c(interfaceC1649u, (InterfaceC2139c) obj5, c3966o2);
            C7006e c7006eM10702a = ig.m10702a(c3966o2);
            k2.w0 w0VarM8509l2 = C3953b.m8509l(c6138e.f29915i, c3966o2);
            Object objM8596M5 = c3966o2.m8596M();
            if (objM8596M5 == s0Var) {
                k2.c0 c0VarM8512o = C3953b.m8512o(new C2996a(w0VarM8509l2, 1));
                c3966o2.j0(c0VarM8512o);
                obj = c0VarM8512o;
            } else {
                obj = objM8596M5;
            }
            k2.h2 h2Var2 = (k2.h2) obj;
            C4409i c4409i2 = (C4409i) AbstractC6663m.m12751O((List) h2Var2.getValue());
            Object objM8596M6 = c3966o2.m8596M();
            Object obj6 = objM8596M6;
            if (objM8596M6 == s0Var) {
                int i14 = e1.n0.f9031a;
                e1.c0 c0Var2 = new e1.c0();
                c3966o2.j0(c0Var2);
                obj6 = c0Var2;
            }
            e1.c0 c0Var3 = (e1.c0) obj6;
            if (c4409i2 != null) {
                c3966o2.m8607Y(-1797897781);
                boolean zM8616i2 = c3966o2.m8616i(c4964i) | ((((3670016 & i11) ^ 1572864) > 1048576 && c3966o2.m8614g(interfaceC2139c3)) || (i11 & 1572864) == 1048576) | ((57344 & i11) == 16384);
                Object objM8596M7 = c3966o2.m8596M();
                if (zM8616i2 || objM8596M7 == s0Var) {
                    final int i15 = 1;
                    i12 = i11;
                    c7006e = c7006eM10702a;
                    c0Var = c0Var3;
                    c4409i = c4409i2;
                    z6 = true;
                    InterfaceC2139c interfaceC2139c9 = new InterfaceC2139c() { // from class: n7.p
                        @Override // ex.InterfaceC2139c
                        public final Object invoke(Object obj7) {
                            int i16 = i15;
                            w0 w0Var3 = w0Var2;
                            InterfaceC2139c interfaceC2139c10 = interfaceC2139c;
                            InterfaceC2139c interfaceC2139c11 = interfaceC2139c3;
                            C4964i c4964i6 = c4964i;
                            C2438r c2438r = (C2438r) obj7;
                            switch (i16) {
                                case 0:
                                    AbstractC4422v abstractC4422v = ((C4409i) c2438r.mo6099a()).f22046b;
                                    AbstractC4154l.m8921d(abstractC4422v, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    C4963h c4963h = (C4963h) abstractC4422v;
                                    if (((Boolean) c4964i6.f24651c.getValue()).booleanValue() || ((Boolean) w0Var3.getValue()).booleanValue()) {
                                        int i17 = AbstractC4422v.f22133f;
                                        for (AbstractC4422v abstractC4422v2 : AbstractC8954a.m16436b(c4963h)) {
                                        }
                                        return (v0) interfaceC2139c11.invoke(c2438r);
                                    }
                                    int i18 = AbstractC4422v.f22133f;
                                    for (AbstractC4422v abstractC4422v3 : AbstractC8954a.m16436b(c4963h)) {
                                    }
                                    return (v0) interfaceC2139c10.invoke(c2438r);
                                default:
                                    AbstractC4422v abstractC4422v4 = ((C4409i) c2438r.mo6100c()).f22046b;
                                    AbstractC4154l.m8921d(abstractC4422v4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    C4963h c4963h2 = (C4963h) abstractC4422v4;
                                    if (((Boolean) c4964i6.f24651c.getValue()).booleanValue() || ((Boolean) w0Var3.getValue()).booleanValue()) {
                                        int i19 = AbstractC4422v.f22133f;
                                        for (AbstractC4422v abstractC4422v5 : AbstractC8954a.m16436b(c4963h2)) {
                                        }
                                        return (u0) interfaceC2139c11.invoke(c2438r);
                                    }
                                    int i20 = AbstractC4422v.f22133f;
                                    for (AbstractC4422v abstractC4422v6 : AbstractC8954a.m16436b(c4963h2)) {
                                    }
                                    return (u0) interfaceC2139c10.invoke(c2438r);
                            }
                        }
                    };
                    c3966o2.j0(interfaceC2139c9);
                    objM8596M7 = interfaceC2139c9;
                } else {
                    i12 = i11;
                    c7006e = c7006eM10702a;
                    c0Var = c0Var3;
                    c4409i = c4409i2;
                    z6 = true;
                }
                InterfaceC2139c interfaceC2139c10 = (InterfaceC2139c) objM8596M7;
                boolean zM8616i3 = c3966o2.m8616i(c4964i) | (((((29360128 & i12) ^ 12582912) <= 8388608 || !c3966o2.m8614g(interfaceC2139c4)) && (i12 & 12582912) != 8388608) ? false : z6) | ((458752 & i12) == 131072 ? z6 : false);
                Object objM8596M8 = c3966o2.m8596M();
                if (zM8616i3 || objM8596M8 == s0Var) {
                    final int i16 = 0;
                    interfaceC2139c7 = interfaceC2139c10;
                    InterfaceC2139c interfaceC2139c11 = new InterfaceC2139c() { // from class: n7.p
                        @Override // ex.InterfaceC2139c
                        public final Object invoke(Object obj7) {
                            int i162 = i16;
                            w0 w0Var3 = w0Var2;
                            InterfaceC2139c interfaceC2139c102 = interfaceC2139c2;
                            InterfaceC2139c interfaceC2139c112 = interfaceC2139c4;
                            C4964i c4964i6 = c4964i;
                            C2438r c2438r = (C2438r) obj7;
                            switch (i162) {
                                case 0:
                                    AbstractC4422v abstractC4422v = ((C4409i) c2438r.mo6099a()).f22046b;
                                    AbstractC4154l.m8921d(abstractC4422v, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    C4963h c4963h = (C4963h) abstractC4422v;
                                    if (((Boolean) c4964i6.f24651c.getValue()).booleanValue() || ((Boolean) w0Var3.getValue()).booleanValue()) {
                                        int i17 = AbstractC4422v.f22133f;
                                        for (AbstractC4422v abstractC4422v2 : AbstractC8954a.m16436b(c4963h)) {
                                        }
                                        return (v0) interfaceC2139c112.invoke(c2438r);
                                    }
                                    int i18 = AbstractC4422v.f22133f;
                                    for (AbstractC4422v abstractC4422v3 : AbstractC8954a.m16436b(c4963h)) {
                                    }
                                    return (v0) interfaceC2139c102.invoke(c2438r);
                                default:
                                    AbstractC4422v abstractC4422v4 = ((C4409i) c2438r.mo6100c()).f22046b;
                                    AbstractC4154l.m8921d(abstractC4422v4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                    C4963h c4963h2 = (C4963h) abstractC4422v4;
                                    if (((Boolean) c4964i6.f24651c.getValue()).booleanValue() || ((Boolean) w0Var3.getValue()).booleanValue()) {
                                        int i19 = AbstractC4422v.f22133f;
                                        for (AbstractC4422v abstractC4422v5 : AbstractC8954a.m16436b(c4963h2)) {
                                        }
                                        return (u0) interfaceC2139c112.invoke(c2438r);
                                    }
                                    int i20 = AbstractC4422v.f22133f;
                                    for (AbstractC4422v abstractC4422v6 : AbstractC8954a.m16436b(c4963h2)) {
                                    }
                                    return (u0) interfaceC2139c102.invoke(c2438r);
                            }
                        }
                    };
                    c3966o2.j0(interfaceC2139c11);
                    objM8596M8 = interfaceC2139c11;
                } else {
                    interfaceC2139c7 = interfaceC2139c10;
                }
                InterfaceC2139c interfaceC2139c12 = (InterfaceC2139c) objM8596M8;
                boolean z11 = (234881024 & i12) == 67108864 ? z6 : false;
                Object objM8596M9 = c3966o2.m8596M();
                Object obj7 = objM8596M9;
                if (z11 || objM8596M9 == s0Var) {
                    hq.d0 d0Var = new hq.d0(23);
                    c3966o2.j0(d0Var);
                    obj7 = d0Var;
                }
                InterfaceC2139c interfaceC2139c13 = (InterfaceC2139c) obj7;
                Boolean bool = Boolean.TRUE;
                boolean zM8616i4 = c3966o2.m8616i(c4964i);
                k2.w0 w0Var3 = w0Var2;
                Object objM8596M10 = c3966o2.m8596M();
                Object obj8 = objM8596M10;
                if (zM8616i4 || objM8596M10 == s0Var) {
                    C3009n c3009n2 = new C3009n(12, h2Var2, c4964i);
                    c3966o2.j0(c3009n2);
                    obj8 = c3009n2;
                }
                C3953b.m8500c(bool, (InterfaceC2139c) obj8, c3966o2);
                Object objM8596M11 = c3966o2.m8596M();
                Object obj9 = objM8596M11;
                if (objM8596M11 == s0Var) {
                    h1.x0 x0Var3 = new h1.x0(c4409i);
                    c3966o2.j0(x0Var3);
                    obj9 = x0Var3;
                }
                h1.x0 x0Var4 = (h1.x0) obj9;
                h1.s1 s1VarM6871d = h1.v1.m6871d(x0Var4, "entry", c3966o2, 56);
                if (((Boolean) w0Var3.getValue()).booleanValue()) {
                    c3966o2.m8607Y(-1795663766);
                    Float fValueOf = Float.valueOf(a1Var2.m8490f());
                    boolean zM8614g2 = c3966o2.m8614g(w0Var) | c3966o2.m8616i(x0Var4);
                    Object objM8596M12 = c3966o2.m8596M();
                    if (zM8614g2 || objM8596M12 == s0Var) {
                        c4970o = null;
                        objM8596M12 = new C2995b(x0Var4, w0Var, a1Var2, false ? 1 : 0, 25);
                        x0Var2 = x0Var4;
                        c3966o2.j0(objM8596M12);
                    } else {
                        x0Var2 = x0Var4;
                        c4970o = null;
                    }
                    C3953b.m8503f((InterfaceC2141e) objM8596M12, fValueOf, c3966o2);
                    c3966o2.m8623p(false);
                    s1Var = s1VarM6871d;
                    x0Var = x0Var2;
                } else {
                    c4970o = null;
                    boolean z12 = false;
                    c3966o2.m8607Y(-1795408729);
                    boolean zM8616i5 = c3966o2.m8616i(x0Var4) | c3966o2.m8616i(c4409i) | c3966o2.m8614g(s1VarM6871d);
                    Object objM8596M13 = c3966o2.m8596M();
                    if (zM8616i5 || objM8596M13 == s0Var) {
                        s1Var = s1VarM6871d;
                        x0Var = x0Var4;
                        objM8596M13 = new C0381t((Object) x0Var, (Object) c4409i, (Object) s1Var, (InterfaceC7559c) (z12 ? 1 : 0), 19);
                        c3966o2.j0(objM8596M13);
                    } else {
                        s1Var = s1VarM6871d;
                        x0Var = x0Var4;
                    }
                    C3953b.m8503f((InterfaceC2141e) objM8596M13, c4409i, c3966o2);
                    c3966o2.m8623p(false);
                }
                boolean zM8616i6 = c3966o2.m8616i(c0Var) | c3966o2.m8616i(c4964i) | c3966o2.m8614g(interfaceC2139c7) | c3966o2.m8614g(interfaceC2139c12) | c3966o2.m8614g(interfaceC2139c13);
                Object objM8596M14 = c3966o2.m8596M();
                if (zM8616i6 || objM8596M14 == s0Var) {
                    C4964i c4964i6 = c4964i;
                    h2Var = h2Var2;
                    objM8596M14 = new C1139f(c0Var, c4964i6, interfaceC2139c7, interfaceC2139c12, interfaceC2139c13, h2Var, w0Var3, 2);
                    c4964i2 = c4964i6;
                    w0Var3 = w0Var3;
                    c3966o2.j0(objM8596M14);
                } else {
                    c4964i2 = c4964i;
                    h2Var = h2Var2;
                }
                InterfaceC2139c interfaceC2139c14 = (InterfaceC2139c) objM8596M14;
                Object objM8596M15 = c3966o2.m8596M();
                Object obj10 = objM8596M15;
                if (objM8596M15 == s0Var) {
                    hq.d0 d0Var2 = new hq.d0(25);
                    c3966o2.j0(d0Var2);
                    obj10 = d0Var2;
                }
                C7006e c7006e2 = c7006e;
                k2.h2 h2Var3 = h2Var;
                h1.s1 s1Var2 = s1Var;
                AbstractC0234a.m624b(s1Var2, interfaceC7879r, interfaceC2139c14, interfaceC7866e, (InterfaceC2139c) obj10, AbstractC6740i.m12902d(820763100, new C4974s(x0Var, c4409i, c7006e2, w0Var3, h2Var3), c3966o2), c3966o2, ((i12 >> 3) & 112) | 221184 | (i12 & 7168));
                c3966o = c3966o2;
                Object objMo345y = s1Var2.f15588a.mo345y();
                Object value = s1Var2.f15591d.getValue();
                boolean zM8614g3 = c3966o.m8614g(s1Var2) | c3966o.m8616i(a0Var) | c3966o.m8616i(c4409i) | c3966o.m8616i(c4964i2) | c3966o.m8616i(c0Var);
                Object objM8596M16 = c3966o.m8596M();
                if (zM8614g3 || objM8596M16 == s0Var) {
                    obj2 = value;
                    gm.e0 e0Var = new gm.e0(s1Var2, a0Var, c4409i, c0Var, h2Var3, c4964i2, null, 2);
                    c3966o.j0(e0Var);
                    objM8596M16 = e0Var;
                } else {
                    obj2 = value;
                }
                C3953b.m8504g(objMo345y, obj2, (InterfaceC2141e) objM8596M16, c3966o);
                c3966o.m8623p(false);
            } else {
                c3966o = c3966o2;
                c4970o = null;
                c3966o.m8607Y(-1790256870);
                c3966o.m8623p(false);
            }
            l7.n0 n0VarM9233b2 = o0Var.m9233b("dialog");
            C4970o c4970o2 = n0VarM9233b2 instanceof C4970o ? (C4970o) n0VarM9233b2 : c4970o;
            if (c4970o2 == null) {
                k2.n1 n1VarM8628u2 = c3966o.m8628u();
                if (n1VarM8628u2 != null) {
                    final int i17 = 0;
                    n1VarM8628u2.f20443d = new InterfaceC2141e() { // from class: n7.r
                        @Override // ex.InterfaceC2141e
                        public final Object invoke(Object obj32, Object obj42) {
                            switch (i17) {
                                case 0:
                                    ((Integer) obj42).getClass();
                                    r1.m10868b(a0Var, graph, interfaceC7879r, interfaceC7866e, interfaceC2139c, interfaceC2139c2, interfaceC2139c3, interfaceC2139c4, (InterfaceC3962k) obj32, C3953b.m8496A(i10 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj42).getClass();
                                    r1.m10868b(a0Var, graph, interfaceC7879r, interfaceC7866e, interfaceC2139c, interfaceC2139c2, interfaceC2139c3, interfaceC2139c4, (InterfaceC3962k) obj32, C3953b.m8496A(i10 | 1));
                                    break;
                                default:
                                    ((Integer) obj42).getClass();
                                    r1.m10868b(a0Var, graph, interfaceC7879r, interfaceC7866e, interfaceC2139c, interfaceC2139c2, interfaceC2139c3, interfaceC2139c4, (InterfaceC3962k) obj32, C3953b.m8496A(i10 | 1));
                                    break;
                            }
                            return a0.f30746a;
                        }
                    };
                    return;
                }
                return;
            }
            m1.m10757a(c4970o2, c3966o, 0);
        }
        k2.n1 n1VarM8628u3 = c3966o.m8628u();
        if (n1VarM8628u3 != null) {
            final int i18 = 1;
            n1VarM8628u3.f20443d = new InterfaceC2141e() { // from class: n7.r
                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj32, Object obj42) {
                    switch (i18) {
                        case 0:
                            ((Integer) obj42).getClass();
                            r1.m10868b(a0Var, graph, interfaceC7879r, interfaceC7866e, interfaceC2139c, interfaceC2139c2, interfaceC2139c3, interfaceC2139c4, (InterfaceC3962k) obj32, C3953b.m8496A(i10 | 1));
                            break;
                        case 1:
                            ((Integer) obj42).getClass();
                            r1.m10868b(a0Var, graph, interfaceC7879r, interfaceC7866e, interfaceC2139c, interfaceC2139c2, interfaceC2139c3, interfaceC2139c4, (InterfaceC3962k) obj32, C3953b.m8496A(i10 | 1));
                            break;
                        default:
                            ((Integer) obj42).getClass();
                            r1.m10868b(a0Var, graph, interfaceC7879r, interfaceC7866e, interfaceC2139c, interfaceC2139c2, interfaceC2139c3, interfaceC2139c4, (InterfaceC3962k) obj32, C3953b.m8496A(i10 | 1));
                            break;
                    }
                    return a0.f30746a;
                }
            };
        }
    }
}

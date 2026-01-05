package androidx.datastore.preferences.protobuf;

import a1.C0005d;
import android.graphics.Paint;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.draw.AbstractC0258a;
import androidx.datastore.preferences.protobuf.o1;
import aw.C0467g;
import bt.C0765j;
import c3.C0846a;
import c3.C0847b;
import c9.AbstractC0911f;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.AbstractC1452a;
import d3.AbstractC1558l;
import d3.C1555i;
import d3.InterfaceC1563q;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2143g;
import f3.C2196b;
import f3.C2202h;
import f3.InterfaceC2198d;
import g2.v1;
import g2.y1;
import h1.AbstractC2774e;
import h1.AbstractC2793x;
import h1.C2772c;
import h1.InterfaceC2779j;
import h1.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.h2;
import kotlin.jvm.internal.AbstractC4154l;
import kw.EnumC4256a;
import lw.AbstractC4541f;
import lw.C4537b;
import lw.C4543h;
import lw.C4551p;
import lw.C4555t;
import lw.C4561z;
import m1.C4625g;
import m1.InterfaceC4630l;
import mw.C4896d;
import mw.InterfaceC4893a;
import mw.InterfaceC4900h;
import o1.AbstractC5244c;
import o1.AbstractC5256o;
import of.C5359n;
import og.pe;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import qw.C6366p;
import s2.AbstractC6740i;
import s2.C6734c;
import s4.C6750f;
import sq.n2;
import sw.C6959c;
import uw.InterfaceC7559c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a */
    public final /* synthetic */ int f2388a;

    public /* synthetic */ o1(int i10) {
        this.f2388a = i10;
    }

    /* renamed from: a */
    public static final void m1023a(final lw.h0 DefaultSlice, final long j6, InterfaceC7879r interfaceC7879r, float f6, InterfaceC2141e interfaceC2141e, InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k, final int i10) {
        int i11;
        InterfaceC2141e interfaceC2141e2;
        InterfaceC2137a interfaceC2137a2;
        InterfaceC7879r interfaceC7879r2;
        final float f10;
        AbstractC4154l.m8923f(DefaultSlice, "$this$DefaultSlice");
        lw.g0 g0Var = DefaultSlice.f22591a;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(982425115);
        if ((i10 & 6) == 0) {
            i11 = i10 | ((i10 & 8) == 0 ? c3966o.m8614g(DefaultSlice) : c3966o.m8616i(DefaultSlice) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8613f(j6) ? 32 : 16;
        }
        int i12 = i11 | 920350080;
        if ((306783379 & i12) == 306783378 && c3966o.m8586C()) {
            c3966o.m8601S();
            interfaceC7879r2 = interfaceC7879r;
            f10 = f6;
            interfaceC2141e2 = interfaceC2141e;
            interfaceC2137a2 = interfaceC2137a;
        } else {
            interfaceC2141e2 = AbstractC4541f.f22578c;
            c3966o.m8607Y(1849434622);
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = new n2(16);
                c3966o.j0(objM8596M);
            }
            interfaceC2137a2 = (InterfaceC2137a) objM8596M;
            c3966o.m8623p(false);
            c3966o.m8607Y(1849434622);
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == s0Var) {
                objM8596M2 = i0.m0.m7389v(c3966o);
            }
            InterfaceC4630l interfaceC4630l = (InterfaceC4630l) objM8596M2;
            c3966o.m8623p(false);
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == s0Var) {
                objM8596M3 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M3);
            }
            k2.w0 w0Var = (k2.w0) objM8596M3;
            Object objM8596M4 = c3966o.m8596M();
            InterfaceC7559c interfaceC7559c = null;
            if (objM8596M4 == s0Var) {
                objM8596M4 = new C4625g(interfaceC4630l, w0Var, interfaceC7559c, 1);
                c3966o.j0(objM8596M4);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M4, interfaceC4630l, c3966o);
            ((Boolean) w0Var.getValue()).getClass();
            final C0846a c0846a = new C0846a(((float) og.e1.m10621c(g0Var.f22585a)) + DefinitionKt.NO_Float_VALUE, ((float) og.e1.m10621c(g0Var.f22586b)) - (2 * DefinitionKt.NO_Float_VALUE), DefaultSlice.f22592b, ((Number) AbstractC2774e.m6799b(0.95f, null, c3966o, 0, 30).getValue()).floatValue());
            FillElement fillElement = AbstractC0245d.f1971c;
            c3966o.m8607Y(-1224400529);
            boolean zM8614g = ((i12 & 7168) == 2048) | c3966o.m8614g(c0846a) | ((29360128 & i12) == 8388608) | ((i12 & 112) == 32);
            Object objM8596M5 = c3966o.m8596M();
            if (zM8614g || objM8596M5 == s0Var) {
                objM8596M5 = new InterfaceC2139c() { // from class: lw.k
                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj) {
                        v3.i0 drawWithContent = (v3.i0) obj;
                        AbstractC4154l.m8923f(drawWithContent, "$this$drawWithContent");
                        C2196b c2196b = drawWithContent.f36917a;
                        InterfaceC1563q interfaceC1563qM75t = c2196b.f10124b.m75t();
                        d3.g0 g0Var2 = ((d3.c0) c0846a.mo399i(c2196b.mo5913e(), drawWithContent.getLayoutDirection(), drawWithContent)).f7736e;
                        C5359n c5359nM5135g = d3.h0.m5135g();
                        ((Paint) c5359nM5135g.f26304b).setAntiAlias(false);
                        c5359nM5135g.m10514u(j6);
                        interfaceC1563qM75t.mo5115q(g0Var2, c5359nM5135g);
                        drawWithContent.m14622b();
                        return qw.a0.f30746a;
                    }
                };
                c3966o.j0(objM8596M5);
            }
            c3966o.m8623p(false);
            InterfaceC7879r interfaceC7879rM2617a = AbstractC0911f.m2617a(AbstractC0258a.m709c(fillElement, (InterfaceC2139c) objM8596M5), c0846a);
            interfaceC7879r2 = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM641i = AbstractC0237a.m641i(DefaultSlice.mo9399a(interfaceC7879rM2617a.mo14852e(interfaceC7879r2), interfaceC2141e2), interfaceC4630l);
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM641i);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            c3966o.m8623p(true);
            f10 = 1.0f;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            final InterfaceC7879r interfaceC7879r3 = interfaceC7879r2;
            final InterfaceC2141e interfaceC2141e3 = interfaceC2141e2;
            final InterfaceC2137a interfaceC2137a3 = interfaceC2137a2;
            n1VarM8628u.f20443d = new InterfaceC2141e() { // from class: lw.l
                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o1.m1023a(DefaultSlice, j6, interfaceC7879r3, f10, interfaceC2141e3, interfaceC2137a3, (InterfaceC3962k) obj, C3953b.m8496A(i10 | 1));
                    return qw.a0.f30746a;
                }
            };
        }
    }

    /* renamed from: b */
    public static final void m1024b(final InterfaceC4900h interfaceC4900h, final List list, final C6734c c6734c, final float f6, InterfaceC3962k interfaceC3962k, final int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(284635263);
        int i11 = (c3966o.m8614g(interfaceC4900h) ? 4 : 2) | i10 | (c3966o.m8616i(list) ? 32 : 16) | (c3966o.m8616i(c6734c) ? 256 : 128) | (c3966o.m8611d(f6) ? 2048 : 1024);
        if ((i11 & 1171) == 1170 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            c3966o.m8607Y(-1633490746);
            boolean zM8614g = ((i11 & 7168) == 2048) | c3966o.m8614g(list);
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (zM8614g || objM8596M == s0Var) {
                C6959c c6959cM10829d = pe.m10829d();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c6959cM10829d.add(new lw.h0((lw.g0) it.next(), f6, interfaceC4900h));
                }
                objM8596M = pe.m10828c(c6959cM10829d);
                c3966o.j0(objM8596M);
            }
            List list2 = (List) objM8596M;
            c3966o.m8623p(false);
            c3966o.m8607Y(1849434622);
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == s0Var) {
                objM8596M2 = C4555t.f22663a;
                c3966o.j0(objM8596M2);
            }
            t3.j0 j0Var = (t3.j0) objM8596M2;
            c3966o.m8623p(false);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, C7876o.f37669a);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0Var, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            AbstractC5244c.m10317a(null, null, AbstractC6740i.m12902d(-1203872756, new kr.a0(list, list2, c6734c, 1), c3966o), c3966o, 3072, 7);
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new InterfaceC2141e(list, c6734c, f6, i10) { // from class: lw.r

                /* renamed from: b */
                public final /* synthetic */ List f22658b;

                /* renamed from: c */
                public final /* synthetic */ C6734c f22659c;

                /* renamed from: d */
                public final /* synthetic */ float f22660d;

                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM8496A = C3953b.m8496A(1);
                    o1.m1024b(this.f22657a, this.f22658b, this.f22659c, this.f22660d, (InterfaceC3962k) obj, iM8496A);
                    return qw.a0.f30746a;
                }
            };
        }
    }

    /* renamed from: c */
    public static final void m1025c(final ArrayList arrayList, final InterfaceC7879r interfaceC7879r, final C6734c c6734c, final C6734c c6734c2, InterfaceC2143g interfaceC2143g, float f6, final float f10, InterfaceC2143g interfaceC2143g2, float f11, float f12, final InterfaceC2779j interfaceC2779j, InterfaceC2779j interfaceC2779j2, InterfaceC3962k interfaceC3962k, final int i10) {
        InterfaceC2779j w1Var;
        InterfaceC2143g interfaceC2143g3;
        InterfaceC2143g interfaceC2143g4;
        float f13;
        float f14;
        float f15;
        C3966o c3966o;
        final InterfaceC2779j interfaceC2779j3;
        final InterfaceC2143g interfaceC2143g5;
        final float f16;
        final InterfaceC2143g interfaceC2143g6;
        final float f17;
        final float f18;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(981403619);
        int i11 = i10 | (c3966o2.m8616i(arrayList) ? 4 : 2) | (c3966o2.m8614g(interfaceC7879r) ? 32 : 16) | 918773760;
        int i12 = (c3966o2.m8616i(interfaceC2779j) ? ' ' : (char) 16) | 134;
        if ((306783379 & i11) == 306783378 && (i12 & 147) == 146 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            interfaceC2143g5 = interfaceC2143g;
            f16 = f6;
            interfaceC2143g6 = interfaceC2143g2;
            f17 = f11;
            f18 = f12;
            interfaceC2779j3 = interfaceC2779j2;
            c3966o = c3966o2;
        } else {
            c3966o2.m8603U();
            if ((i10 & 1) == 0 || c3966o2.m8584A()) {
                C6734c c6734c3 = AbstractC4541f.f22576a;
                C6734c c6734c4 = AbstractC4541f.f22577b;
                w1Var = new w1(IMAPStore.RESPONSE, 0, AbstractC2793x.f15640b);
                interfaceC2143g3 = c6734c3;
                interfaceC2143g4 = c6734c4;
                f13 = 100;
                f14 = 300;
                f15 = 1.1f;
            } else {
                c3966o2.m8601S();
                interfaceC2143g3 = interfaceC2143g;
                f15 = f6;
                interfaceC2143g4 = interfaceC2143g2;
                f13 = f11;
                f14 = f12;
                w1Var = interfaceC2779j2;
            }
            c3966o2.m8624q();
            c3966o = c3966o2;
            m1026d(arrayList, interfaceC7879r, c6734c, c6734c2, interfaceC2143g3, f15, f10, interfaceC2143g4, f13, f14, new C0005d(EnumC4256a.Default, new InterfaceC2779j[]{interfaceC2779j, w1Var}), c3966o, i11 & 2147483646, 6);
            interfaceC2779j3 = w1Var;
            interfaceC2143g5 = interfaceC2143g3;
            f16 = f15;
            interfaceC2143g6 = interfaceC2143g4;
            f17 = f13;
            f18 = f14;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new InterfaceC2141e(arrayList, interfaceC7879r, c6734c, c6734c2, interfaceC2143g5, f16, f10, interfaceC2143g6, f17, f18, interfaceC2779j, interfaceC2779j3, i10) { // from class: lw.m

                /* renamed from: a */
                public final /* synthetic */ ArrayList f22608a;

                /* renamed from: b */
                public final /* synthetic */ InterfaceC7879r f22609b;

                /* renamed from: c */
                public final /* synthetic */ C6734c f22610c;

                /* renamed from: d */
                public final /* synthetic */ C6734c f22611d;

                /* renamed from: e */
                public final /* synthetic */ InterfaceC2143g f22612e;

                /* renamed from: f */
                public final /* synthetic */ float f22613f;

                /* renamed from: g */
                public final /* synthetic */ float f22614g;

                /* renamed from: h */
                public final /* synthetic */ InterfaceC2143g f22615h;

                /* renamed from: j */
                public final /* synthetic */ float f22616j;

                /* renamed from: k */
                public final /* synthetic */ float f22617k;

                /* renamed from: l */
                public final /* synthetic */ InterfaceC2779j f22618l;

                /* renamed from: m */
                public final /* synthetic */ InterfaceC2779j f22619m;

                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o1.m1025c(this.f22608a, this.f22609b, this.f22610c, this.f22611d, this.f22612e, this.f22613f, this.f22614g, this.f22615h, this.f22616j, this.f22617k, this.f22618l, this.f22619m, (InterfaceC3962k) obj, C3953b.m8496A(1576321));
                    return qw.a0.f30746a;
                }
            };
        }
    }

    /* renamed from: d */
    public static final void m1026d(final ArrayList arrayList, final InterfaceC7879r interfaceC7879r, final C6734c c6734c, final C6734c c6734c2, final InterfaceC2143g interfaceC2143g, final float f6, final float f10, final InterfaceC2143g interfaceC2143g2, final float f11, final float f12, final C0005d c0005d, InterfaceC3962k interfaceC3962k, final int i10, final int i11) {
        int i12;
        C6734c c6734c3;
        C6734c c6734c4;
        InterfaceC2143g interfaceC2143g3;
        float f13;
        InterfaceC2143g interfaceC2143g4;
        int i13;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1713915520);
        if ((i10 & 6) == 0) {
            i12 = (c3966o.m8616i(arrayList) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c3966o.m8614g(interfaceC7879r) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            c6734c3 = c6734c;
            i12 |= c3966o.m8616i(c6734c3) ? 256 : 128;
        } else {
            c6734c3 = c6734c;
        }
        if ((i10 & 3072) == 0) {
            c6734c4 = c6734c2;
            i12 |= c3966o.m8616i(c6734c4) ? NewHope.SENDB_BYTES : 1024;
        } else {
            c6734c4 = c6734c2;
        }
        if ((i10 & 24576) == 0) {
            interfaceC2143g3 = interfaceC2143g;
            i12 |= c3966o.m8616i(interfaceC2143g3) ? 16384 : 8192;
        } else {
            interfaceC2143g3 = interfaceC2143g;
        }
        if ((196608 & i10) == 0) {
            i12 |= c3966o.m8611d(f6) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            f13 = f10;
            i12 |= c3966o.m8611d(f13) ? 1048576 : 524288;
        } else {
            f13 = f10;
        }
        if ((12582912 & i10) == 0) {
            interfaceC2143g4 = interfaceC2143g2;
            i12 |= c3966o.m8616i(interfaceC2143g4) ? 8388608 : 4194304;
        } else {
            interfaceC2143g4 = interfaceC2143g2;
        }
        if ((100663296 & i10) == 0) {
            i12 |= c3966o.m8611d(f11) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c3966o.m8611d(f12) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c3966o.m8615h(false) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c3966o.m8616i(c0005d) ? 32 : 16;
        }
        if ((306783379 & i12) == 306783378 && (i13 & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            c3966o.m8603U();
            if ((i10 & 1) != 0 && !c3966o.m8584A()) {
                c3966o.m8601S();
            }
            c3966o.m8624q();
            if (f6 < 1.0f) {
                throw new IllegalArgumentException("labelSpacing must be greater than 1");
            }
            int i14 = i12 << 3;
            m1027e(arrayList, new C4537b(f6), interfaceC7879r, c6734c3, c6734c4, interfaceC2143g3, f13, interfaceC2143g4, f11, f12, c0005d, null, null, c3966o, (i12 & 14) | (i14 & 896) | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), i13 & 126);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new InterfaceC2141e() { // from class: lw.n
                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o1.m1026d(arrayList, interfaceC7879r, c6734c, c6734c2, interfaceC2143g, f6, f10, interfaceC2143g2, f11, f12, c0005d, (InterfaceC3962k) obj, C3953b.m8496A(i10 | 1), C3953b.m8496A(i11));
                    return qw.a0.f30746a;
                }
            };
        }
    }

    /* renamed from: e */
    public static final void m1027e(final ArrayList arrayList, final C4537b c4537b, final InterfaceC7879r interfaceC7879r, final C6734c c6734c, final C6734c c6734c2, final InterfaceC2143g interfaceC2143g, final float f6, final InterfaceC2143g interfaceC2143g2, final float f10, final float f11, final C0005d c0005d, InterfaceC4893a interfaceC4893a, InterfaceC4893a interfaceC4893a2, InterfaceC3962k interfaceC3962k, final int i10, final int i11) {
        int i12;
        C6734c c6734c3;
        C6734c c6734c4;
        int i13;
        int i14;
        InterfaceC4893a c4896d;
        int i15;
        boolean z6;
        InterfaceC4893a interfaceC4893a3;
        InterfaceC4893a interfaceC4893a4;
        k2.w0 w0Var;
        Object objM8512o;
        C3966o c3966o;
        final InterfaceC4893a interfaceC4893a5;
        final InterfaceC4893a interfaceC4893a6;
        C6366p c6366p = (C6366p) c0005d.f26d;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-323834318);
        if ((i10 & 6) == 0) {
            i12 = (c3966o2.m8616i(arrayList) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? c3966o2.m8614g(c4537b) : c3966o2.m8616i(c4537b) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= c3966o2.m8614g(interfaceC7879r) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            c6734c3 = c6734c;
            i12 |= c3966o2.m8616i(c6734c3) ? NewHope.SENDB_BYTES : 1024;
        } else {
            c6734c3 = c6734c;
        }
        if ((i10 & 24576) == 0) {
            c6734c4 = c6734c2;
            i12 |= c3966o2.m8616i(c6734c4) ? 16384 : 8192;
        } else {
            c6734c4 = c6734c2;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c3966o2.m8616i(interfaceC2143g) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c3966o2.m8611d(f6) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c3966o2.m8616i(interfaceC2143g2) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c3966o2.m8611d(f10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c3966o2.m8611d(f11) ? 536870912 : 268435456;
        }
        int i16 = i12;
        if ((i11 & 6) == 0) {
            i13 = (c3966o2.m8615h(false) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c3966o2.m8616i(c0005d) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= 1024;
        }
        if ((i16 & 306783379) == 306783378 && (i13 & 1171) == 1170 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            interfaceC4893a5 = interfaceC4893a;
            interfaceC4893a6 = interfaceC4893a2;
            c3966o = c3966o2;
        } else {
            c3966o2.m8603U();
            if ((i10 & 1) == 0 || c3966o2.m8584A()) {
                interfaceC4893a = new C4896d(-90.0f);
                i14 = i13 & (-8065);
                c4896d = new C4896d(360.0f);
            } else {
                c3966o2.m8601S();
                i14 = i13 & (-8065);
                c4896d = interfaceC4893a2;
            }
            InterfaceC4893a interfaceC4893a7 = interfaceC4893a;
            c3966o2.m8624q();
            if (!(DefinitionKt.NO_Float_VALUE <= f6 && f6 <= 1.0f)) {
                throw new IllegalArgumentException("holeSize must be between 0 and 1");
            }
            if (C6750f.m12935a(f11, Float.NaN)) {
                throw new IllegalArgumentException("maxPieDiameter cannot be Unspecified");
            }
            if (!(og.e1.m10621c(c4896d) > 0.0d && og.e1.m10621c(c4896d) <= 360.0d)) {
                throw new IllegalArgumentException("pieExtendAngle must be between 0 and 360, exclusive of 0");
            }
            if (!(((List) c6366p.getValue()).size() == 2)) {
                throw new IllegalArgumentException("startAnimationUseCase must have 2 animatables");
            }
            int i17 = i16 & 14;
            k2.w0 w0VarM8520w = C3953b.m8520w(arrayList, c3966o2);
            c3966o2.m8607Y(5004770);
            boolean zM8614g = c3966o2.m8614g(arrayList);
            Object objM8596M = c3966o2.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (zM8614g || objM8596M == s0Var) {
                i15 = i14;
                z6 = false;
                objM8596M = (C2772c) ((List) c6366p.getValue()).get(0);
                c3966o2.j0(objM8596M);
            } else {
                i15 = i14;
                z6 = false;
            }
            C2772c c2772c = (C2772c) objM8596M;
            c3966o2.m8623p(z6);
            c3966o2.m8607Y(5004770);
            boolean zM8614g2 = c3966o2.m8614g(arrayList);
            Object objM8596M2 = c3966o2.m8596M();
            if (zM8614g2 || objM8596M2 == s0Var) {
                objM8596M2 = (C2772c) ((List) c6366p.getValue()).get(1);
                c3966o2.j0(objM8596M2);
            }
            C2772c c2772c2 = (C2772c) objM8596M2;
            c3966o2.m8623p(false);
            c0005d.m36C(arrayList, c3966o2, (i15 & 112) | i17);
            float fFloatValue = ((Number) c2772c.m6775d()).floatValue();
            c3966o2.m8607Y(5004770);
            boolean zM8611d = c3966o2.m8611d(fFloatValue);
            Object objM8596M3 = c3966o2.m8596M();
            if (zM8611d || objM8596M3 == s0Var) {
                interfaceC4893a3 = interfaceC4893a7;
                interfaceC4893a4 = c4896d;
                w0Var = w0VarM8520w;
                objM8512o = C3953b.m8512o(new C0765j(c2772c, interfaceC4893a7, c4896d, w0VarM8520w, 5));
                c3966o2.j0(objM8512o);
            } else {
                objM8512o = objM8596M3;
                interfaceC4893a3 = interfaceC4893a7;
                interfaceC4893a4 = c4896d;
                w0Var = w0VarM8520w;
            }
            h2 h2Var = (h2) objM8512o;
            c3966o2.m8623p(false);
            c3966o2.m8607Y(1849434622);
            Object objM8596M4 = c3966o2.m8596M();
            if (objM8596M4 == s0Var) {
                objM8596M4 = C3953b.m8512o(new C0467g(13, interfaceC4893a3, interfaceC4893a4, w0Var));
                c3966o2.j0(objM8596M4);
            }
            h2 h2Var2 = (h2) objM8596M4;
            c3966o2.m8623p(false);
            c3966o = c3966o2;
            og.f1.m10637a(interfaceC7879r, AbstractC6740i.m12902d(-809804474, new C4561z(f6, c4537b, h2Var, c6734c3, c2772c2, c6734c4, f10, f11, interfaceC2143g2, interfaceC2143g, h2Var2), c3966o), c3966o, ((i16 >> 6) & 14) | 48);
            interfaceC4893a5 = interfaceC4893a3;
            interfaceC4893a6 = interfaceC4893a4;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new InterfaceC2141e() { // from class: lw.q
                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM8496A = C3953b.m8496A(i10 | 1);
                    int iM8496A2 = C3953b.m8496A(i11);
                    o1.m1027e(arrayList, c4537b, interfaceC7879r, c6734c, c6734c2, interfaceC2143g, f6, interfaceC2143g2, f10, f11, c0005d, interfaceC4893a5, interfaceC4893a6, (InterfaceC3962k) obj, iM8496A, iM8496A2);
                    return qw.a0.f30746a;
                }
            };
        }
    }

    /* renamed from: f */
    public static final void m1028f(C4543h StraightLineConnector, InterfaceC7879r interfaceC7879r, final long j6, final C2202h c2202h, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        AbstractC4154l.m8923f(StraightLineConnector, "$this$StraightLineConnector");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-683767079);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c3966o.m8614g(StraightLineConnector) : c3966o.m8616i(StraightLineConnector) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | 48;
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i12 = i11 | 176;
        }
        if ((i10 & 3072) == 0) {
            i12 |= 1024;
        }
        if ((i12 & 1171) == 1170 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            c3966o.m8603U();
            if ((i10 & 1) == 0 || c3966o.m8584A()) {
                j6 = ((v1) c3966o.m8618k(y1.f13286a)).f12968o;
                C2202h c2202h2 = new C2202h(1.0f, DefinitionKt.NO_Float_VALUE, 0, 0, 30);
                interfaceC7879r = C7876o.f37669a;
                c2202h = c2202h2;
            } else {
                c3966o.m8601S();
            }
            c3966o.m8624q();
            final C1555i c1555iM5178a = AbstractC1558l.m5178a();
            long j10 = ((C0847b) StraightLineConnector.f22587a.getValue()).f5352a;
            c1555iM5178a.f7752a.moveTo(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            og.e1.m10619a(c1555iM5178a, ((C0847b) StraightLineConnector.f22588b.getValue()).f5352a);
            InterfaceC7879r interfaceC7879rMo14852e = interfaceC7879r.mo14852e(AbstractC0245d.f1971c);
            c3966o.m8607Y(-1746271574);
            boolean zM8616i = c3966o.m8616i(c1555iM5178a) | c3966o.m8613f(j6) | c3966o.m8616i(c2202h);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new InterfaceC2139c() { // from class: lw.o
                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj) {
                        InterfaceC2198d drawBehind = (InterfaceC2198d) obj;
                        AbstractC4154l.m8923f(drawBehind, "$this$drawBehind");
                        InterfaceC2198d.w0(drawBehind, c1555iM5178a, j6, DefinitionKt.NO_Float_VALUE, c2202h, 52);
                        return qw.a0.f30746a;
                    }
                };
                c3966o.j0(objM8596M);
            }
            c3966o.m8623p(false);
            InterfaceC7879r interfaceC7879rM707a = AbstractC0258a.m707a(interfaceC7879rMo14852e, (InterfaceC2139c) objM8596M);
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM707a);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            c3966o.m8623p(true);
        }
        InterfaceC7879r interfaceC7879r2 = interfaceC7879r;
        long j11 = j6;
        C2202h c2202h3 = c2202h;
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C4551p(StraightLineConnector, interfaceC7879r2, j11, c2202h3, i10);
        }
    }

    /* renamed from: i */
    public static final C6959c m1029i(List list, float f6, InterfaceC4893a interfaceC4893a, InterfaceC4893a interfaceC4893a2) {
        double dFloatValue = 0.0d;
        while (list.iterator().hasNext()) {
            dFloatValue += ((Number) r0.next()).floatValue();
        }
        float f10 = (float) dFloatValue;
        if (f10 == DefinitionKt.NO_Float_VALUE) {
            f10 = 1.0f;
        }
        C6959c c6959cM10829d = pe.m10829d();
        double dM10621c = og.e1.m10621c(interfaceC4893a);
        double dM10621c2 = og.e1.m10621c(interfaceC4893a2);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            double dFloatValue2 = (((Number) list.get(i10)).floatValue() / f10) * dM10621c2 * f6;
            c6959cM10829d.add(new lw.g0(new C4896d(dM10621c), new C4896d(dFloatValue2)));
            dM10621c += dFloatValue2;
        }
        return pe.m10828c(c6959cM10829d);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m1030g(int r11, int r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o1.m1030g(int, int, byte[]):java.lang.String");
    }

    /* renamed from: h */
    public final int m1031h(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        long j6;
        char c2;
        long j10;
        long j11;
        char c10;
        int i14;
        char cCharAt2;
        switch (this.f2388a) {
            case 0:
                int length = str.length();
                int i15 = i11 + i10;
                int i16 = 0;
                while (i16 < length && (i13 = i16 + i10) < i15 && (cCharAt = str.charAt(i16)) < 128) {
                    bArr[i13] = (byte) cCharAt;
                    i16++;
                }
                if (i16 == length) {
                    return i10 + length;
                }
                int i17 = i10 + i16;
                while (i16 < length) {
                    char cCharAt3 = str.charAt(i16);
                    if (cCharAt3 < 128 && i17 < i15) {
                        bArr[i17] = (byte) cCharAt3;
                        i17++;
                    } else if (cCharAt3 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt3 >>> 6) | 960);
                        i17 += 2;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i12)))) {
                                    throw new p1(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != str.length()) {
                                char cCharAt4 = str.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i20 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i17 += 4;
                                    bArr[i20] = (byte) ((codePoint & 63) | 128);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new p1(i16 - 1, length);
                        }
                        bArr[i17] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i21 = i17 + 2;
                        bArr[i17 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i17 += 3;
                        bArr[i21] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i16++;
                }
                return i17;
            default:
                long j12 = i10;
                long j13 = i11 + j12;
                int length2 = str.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i22 = 0;
                while (true) {
                    j6 = 1;
                    c2 = 128;
                    if (i22 < length2 && (cCharAt2 = str.charAt(i22)) < 128) {
                        n1.m1016j(bArr, j12, (byte) cCharAt2);
                        i22++;
                        j12 = 1 + j12;
                    }
                }
                if (i22 == length2) {
                    return (int) j12;
                }
                while (i22 < length2) {
                    char cCharAt5 = str.charAt(i22);
                    if (cCharAt5 < c2 && j12 < j13) {
                        n1.m1016j(bArr, j12, (byte) cCharAt5);
                        c10 = c2;
                        j10 = j6;
                        j11 = j12 + j6;
                    } else if (cCharAt5 >= 2048 || j12 > j13 - 2) {
                        j10 = j6;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j12 > j13 - 3) {
                            long j14 = j12;
                            if (j14 > j13 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                    throw new p1(i22, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j14);
                            }
                            int i23 = i22 + 1;
                            if (i23 != length2) {
                                char cCharAt6 = str.charAt(i23);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    n1.m1016j(bArr, j14, (byte) ((codePoint2 >>> 18) | 240));
                                    c10 = 128;
                                    n1.m1016j(bArr, j14 + j10, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    n1.m1016j(bArr, j14 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    n1.m1016j(bArr, j14 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j11 = j14 + 4;
                                    i22 = i23;
                                } else {
                                    i22 = i23;
                                }
                            }
                            throw new p1(i22 - 1, length2);
                        }
                        n1.m1016j(bArr, j12, (byte) ((cCharAt5 >>> '\f') | 480));
                        long j15 = j12;
                        n1.m1016j(bArr, j12 + j10, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j11 = j15 + 3;
                        n1.m1016j(bArr, j15 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c10 = 128;
                    } else {
                        j10 = j6;
                        n1.m1016j(bArr, j12, (byte) ((cCharAt5 >>> 6) | 960));
                        n1.m1016j(bArr, j12 + j10, (byte) ((cCharAt5 & '?') | c2));
                        j11 = j12 + 2;
                        c10 = c2;
                    }
                    i22++;
                    c2 = c10;
                    j12 = j11;
                    j6 = j10;
                }
                return (int) j12;
        }
    }
}

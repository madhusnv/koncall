package g2;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import er.C2119s;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import h2.AbstractC2808m;
import h2.AbstractC2812q;
import h2.C2811p;
import java.util.Locale;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import o1.AbstractC5251j;
import o1.C5243b;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p1.AbstractC5788a;
import s2.AbstractC6740i;
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
public abstract class j4 {

    /* renamed from: a */
    public static final float f11848a = 8;

    /* renamed from: a */
    public static final void m6176a(Long l9, Long l10, InterfaceC2141e interfaceC2141e, AbstractC2808m abstractC2808m, C4266h c4266h, z2 z2Var, z9 z9Var, u2 u2Var, InterfaceC3962k interfaceC3962k, int i10) {
        C2811p c2811p;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-607499086);
        int i11 = i10 | (c3966o.m8614g(l9) ? 4 : 2) | (c3966o.m8614g(l10) ? 32 : 16) | (c3966o.m8616i(interfaceC2141e) ? 256 : 128) | (c3966o.m8616i(abstractC2808m) ? NewHope.SENDB_BYTES : 1024) | (c3966o.m8616i(c4266h) ? 16384 : 8192) | (c3966o.m8614g(z2Var) ? 131072 : 65536) | (c3966o.m8614g(z9Var) ? 1048576 : 524288) | (c3966o.m8614g(u2Var) ? 8388608 : 4194304);
        if ((4793491 & i11) == 4793490 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            Locale localeM6258v = p9.m6258v(c3966o);
            boolean zM8614g = c3966o.m8614g(localeM6258v);
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (zM8614g || objM8596M == s0Var) {
                objM8596M = abstractC2808m.mo6899c(localeM6258v);
                c3966o.j0(objM8596M);
            }
            C2811p c2811p2 = (C2811p) objM8596M;
            String strM6916h = AbstractC2812q.m6916h(c3966o, R.string.m3c_date_input_invalid_for_pattern);
            String strM6916h2 = AbstractC2812q.m6916h(c3966o, R.string.m3c_date_input_invalid_year_range);
            String strM6916h3 = AbstractC2812q.m6916h(c3966o, R.string.m3c_date_input_invalid_not_allowed);
            String strM6916h4 = AbstractC2812q.m6916h(c3966o, R.string.m3c_date_range_input_invalid_range_input);
            boolean zM8614g2 = c3966o.m8614g(c2811p2) | ((i11 & 458752) == 131072);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8614g2 || objM8596M2 == s0Var) {
                objM8596M2 = new t2(c4266h, z9Var, c2811p2, z2Var, strM6916h, strM6916h2, strM6916h3, strM6916h4);
                c2811p = c2811p2;
                c3966o.j0(objM8596M2);
            } else {
                c2811p = c2811p2;
            }
            t2 t2Var = (t2) objM8596M2;
            t2Var.f12738i = l9;
            t2Var.f12739j = l10;
            InterfaceC7879r interfaceC7879rM655i = AbstractC0242a.m655i(C7876o.f37669a, s2.f12653a);
            C5243b c5243b = AbstractC5251j.f25757a;
            o1.n1 n1VarM10357a = o1.m1.m10357a(AbstractC5251j.m10351g(f11848a), C7864c.f37651k, c3966o, 6);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM655i);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            String upperCase = c2811p.f15757a.toUpperCase(Locale.ROOT);
            AbstractC4154l.m8922e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String strM6916h5 = AbstractC2812q.m6916h(c3966o, R.string.m3c_date_range_picker_start_headline);
            if (0.5f <= 0.0d) {
                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true);
            int i13 = i11 & 896;
            int i14 = i11 & 112;
            boolean z6 = (i14 == 32) | (i13 == 256);
            Object objM8596M3 = c3966o.m8596M();
            if (z6 || objM8596M3 == s0Var) {
                objM8596M3 = new i4(interfaceC2141e, l10, 0);
                c3966o.j0(objM8596M3);
            }
            int i15 = i11 & 7168;
            int i16 = (i11 >> 21) & 14;
            s2.m6301b(layoutWeightElement, l9, (InterfaceC2139c) objM8596M3, abstractC2808m, AbstractC6740i.m12902d(801434508, new m2(strM6916h5, upperCase, 1), c3966o), AbstractC6740i.m12902d(665407211, new n2(upperCase, 3), c3966o), 1, t2Var, c2811p, localeM6258v, u2Var, c3966o, ((i11 << 3) & 112) | 1794048 | i15, i16);
            String strM6916h6 = AbstractC2812q.m6916h(c3966o, R.string.m3c_date_range_picker_end_headline);
            if (0.5f <= 0.0d) {
                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(0.5f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.5f, true);
            int i17 = 4;
            boolean z10 = (i13 == 256) | ((i11 & 14) == 4);
            Object objM8596M4 = c3966o.m8596M();
            if (z10 || objM8596M4 == s0Var) {
                objM8596M4 = new i4(interfaceC2141e, l9, 1);
                c3966o.j0(objM8596M4);
            }
            s2.m6301b(layoutWeightElement2, l10, (InterfaceC2139c) objM8596M4, abstractC2808m, AbstractC6740i.m12902d(911487285, new m2(strM6916h6, upperCase, 2), c3966o), AbstractC6740i.m12902d(-961726252, new n2(upperCase, i17), c3966o), 2, t2Var, c2811p, localeM6258v, u2Var, c3966o, i14 | 1794048 | i15, i16);
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2119s(l9, l10, interfaceC2141e, abstractC2808m, c4266h, z2Var, z9Var, u2Var, i10);
        }
    }
}

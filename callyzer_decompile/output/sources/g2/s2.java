package g2;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import er.C2118r;
import ex.InterfaceC2139c;
import h2.AbstractC2808m;
import h2.AbstractC2812q;
import h2.C2811p;
import java.util.Locale;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s2.AbstractC6740i;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class s2 {

    /* renamed from: a */
    public static final o1.i1 f12653a;

    /* renamed from: b */
    public static final float f12654b = 16;

    static {
        float f6 = 24;
        f12653a = AbstractC0242a.m649c(f6, 10, f6, DefinitionKt.NO_Float_VALUE, 8);
    }

    /* renamed from: a */
    public static final void m6300a(Long l9, InterfaceC2139c interfaceC2139c, AbstractC2808m abstractC2808m, C4266h c4266h, z2 z2Var, z9 z9Var, u2 u2Var, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(643325609);
        int i11 = i10 | (c3966o.m8614g(l9) ? 4 : 2) | (c3966o.m8616i(interfaceC2139c) ? 32 : 16) | (c3966o.m8616i(abstractC2808m) ? 256 : 128) | (c3966o.m8616i(c4266h) ? NewHope.SENDB_BYTES : 1024) | (c3966o.m8614g(z2Var) ? 16384 : 8192) | (c3966o.m8614g(z9Var) ? 131072 : 65536) | (c3966o.m8614g(u2Var) ? 1048576 : 524288);
        if ((599187 & i11) == 599186 && c3966o.m8586C()) {
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
            C2811p c2811p = (C2811p) objM8596M;
            String strM6916h = AbstractC2812q.m6916h(c3966o, R.string.m3c_date_input_invalid_for_pattern);
            String strM6916h2 = AbstractC2812q.m6916h(c3966o, R.string.m3c_date_input_invalid_year_range);
            String strM6916h3 = AbstractC2812q.m6916h(c3966o, R.string.m3c_date_input_invalid_not_allowed);
            boolean zM8614g2 = c3966o.m8614g(c2811p) | ((57344 & i11) == 16384);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8614g2 || objM8596M2 == s0Var) {
                t2 t2Var = new t2(c4266h, z9Var, c2811p, z2Var, strM6916h, strM6916h2, strM6916h3, "");
                c3966o.j0(t2Var);
                objM8596M2 = t2Var;
            }
            t2 t2Var2 = (t2) objM8596M2;
            String upperCase = c2811p.f15757a.toUpperCase(Locale.ROOT);
            AbstractC4154l.m8922e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String strM6916h4 = AbstractC2812q.m6916h(c3966o, R.string.m3c_date_input_label);
            InterfaceC7879r interfaceC7879rM655i = AbstractC0242a.m655i(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), f12653a);
            t2Var2.f12738i = l9;
            int i12 = 0;
            int i13 = i11 << 3;
            m6301b(interfaceC7879rM655i, l9, interfaceC2139c, abstractC2808m, AbstractC6740i.m12902d(-1819015125, new m2(strM6916h4, upperCase, i12), c3966o), AbstractC6740i.m12902d(-564233108, new n2(upperCase, i12), c3966o), 0, t2Var2, c2811p, localeM6258v, u2Var, c3966o, (i13 & 7168) | (i13 & 112) | 1794054 | (i13 & 896), (i11 >> 18) & 14);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2118r(l9, interfaceC2139c, abstractC2808m, c4266h, z2Var, z9Var, u2Var, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x024e  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6301b(w2.InterfaceC7879r r41, java.lang.Long r42, ex.InterfaceC2139c r43, h2.AbstractC2808m r44, s2.C6734c r45, s2.C6734c r46, int r47, g2.t2 r48, h2.C2811p r49, java.util.Locale r50, g2.u2 r51, k2.InterfaceC3962k r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.s2.m6301b(w2.r, java.lang.Long, ex.c, h2.m, s2.c, s2.c, int, g2.t2, h2.p, java.util.Locale, g2.u2, k2.k, int, int):void");
    }
}

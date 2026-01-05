package x1;

import androidx.compose.foundation.layout.AbstractC0245d;
import ex.InterfaceC2142f;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.h2;
import k4.AbstractC3988i;
import k4.C3989j;
import k4.C3994o;
import k4.C3995p;
import k4.C3998s;
import k4.InterfaceC3987h;
import kotlin.jvm.internal.AbstractC4155m;
import og.zf;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 extends AbstractC4155m implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f39584a;

    /* renamed from: b */
    public final /* synthetic */ int f39585b;

    /* renamed from: c */
    public final /* synthetic */ g4.o0 f39586c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i10, int i11, g4.o0 o0Var) {
        super(3);
        this.f39584a = i10;
        this.f39585b = i11;
        this.f39586c = o0Var;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        C3966o c3966o = (C3966o) ((InterfaceC3962k) obj2);
        c3966o.m8607Y(408240218);
        int i10 = this.f39584a;
        int i11 = this.f39585b;
        r0.m15464x(i10, i11);
        C7876o c7876o = C7876o.f37669a;
        if (i10 == 1 && i11 == Integer.MAX_VALUE) {
            c3966o.m8623p(false);
            return c7876o;
        }
        InterfaceC6747c interfaceC6747c = (InterfaceC6747c) c3966o.m8618k(w3.k1.f37836h);
        InterfaceC3987h interfaceC3987h = (InterfaceC3987h) c3966o.m8618k(w3.k1.f37839k);
        EnumC6757m enumC6757m = (EnumC6757m) c3966o.m8618k(w3.k1.f37842n);
        g4.o0 o0Var = this.f39586c;
        boolean zM8614g = c3966o.m8614g(o0Var) | c3966o.m8614g(enumC6757m);
        Object objM8596M = c3966o.m8596M();
        k2.s0 s0Var = C3961j.f20408a;
        if (zM8614g || objM8596M == s0Var) {
            objM8596M = zf.m11101c(o0Var, enumC6757m);
            c3966o.j0(objM8596M);
        }
        g4.o0 o0Var2 = (g4.o0) objM8596M;
        boolean zM8614g2 = c3966o.m8614g(interfaceC3987h) | c3966o.m8614g(o0Var2);
        Object objM8596M2 = c3966o.m8596M();
        if (zM8614g2 || objM8596M2 == s0Var) {
            g4.g0 g0Var = o0Var2.f13688a;
            AbstractC3988i abstractC3988i = g0Var.f13608f;
            C3998s c3998s = g0Var.f13605c;
            if (c3998s == null) {
                c3998s = C3998s.f20695e;
            }
            C3994o c3994o = g0Var.f13606d;
            int i12 = c3994o != null ? c3994o.f20689a : 0;
            C3995p c3995p = g0Var.f13607e;
            objM8596M2 = ((C3989j) interfaceC3987h).m8762b(abstractC3988i, c3998s, i12, c3995p != null ? c3995p.f20690a : Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            c3966o.j0(objM8596M2);
        }
        h2 h2Var = (h2) objM8596M2;
        boolean zM8614g3 = c3966o.m8614g(h2Var.getValue()) | c3966o.m8614g(interfaceC6747c) | c3966o.m8614g(interfaceC3987h) | c3966o.m8614g(o0Var) | c3966o.m8614g(enumC6757m);
        Object objM8596M3 = c3966o.m8596M();
        if (zM8614g3 || objM8596M3 == s0Var) {
            objM8596M3 = Integer.valueOf((int) (f1.m15434a(o0Var2, interfaceC6747c, interfaceC3987h, f1.f39494a, 1) & 4294967295L));
            c3966o.j0(objM8596M3);
        }
        int iIntValue = ((Number) objM8596M3).intValue();
        boolean zM8614g4 = c3966o.m8614g(h2Var.getValue()) | c3966o.m8614g(interfaceC6747c) | c3966o.m8614g(interfaceC3987h) | c3966o.m8614g(o0Var) | c3966o.m8614g(enumC6757m);
        Object objM8596M4 = c3966o.m8596M();
        if (zM8614g4 || objM8596M4 == s0Var) {
            StringBuilder sb2 = new StringBuilder();
            String str = f1.f39494a;
            sb2.append(str);
            sb2.append('\n');
            sb2.append(str);
            objM8596M4 = Integer.valueOf((int) (f1.m15434a(o0Var2, interfaceC6747c, interfaceC3987h, sb2.toString(), 2) & 4294967295L));
            c3966o.j0(objM8596M4);
        }
        int iIntValue2 = ((Number) objM8596M4).intValue() - iIntValue;
        Integer numValueOf = i10 == 1 ? null : Integer.valueOf(((i10 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i11 != Integer.MAX_VALUE ? Integer.valueOf(((i11 - 1) * iIntValue2) + iIntValue) : null;
        InterfaceC7879r interfaceC7879rM671h = AbstractC0245d.m671h(c7876o, numValueOf != null ? interfaceC6747c.mo8433F(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? interfaceC6747c.mo8433F(numValueOf2.intValue()) : Float.NaN);
        c3966o.m8623p(false);
        return interfaceC7879rM671h;
    }
}

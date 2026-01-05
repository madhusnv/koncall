package a2;

import g4.o0;
import k4.InterfaceC3987h;
import og.xf;
import og.zf;
import s4.AbstractC6746b;
import s4.C6745a;
import s4.C6748d;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a2.b */
/* loaded from: classes.dex */
public final class C0029b {

    /* renamed from: h */
    public static C0029b f105h;

    /* renamed from: a */
    public final EnumC6757m f106a;

    /* renamed from: b */
    public final o0 f107b;

    /* renamed from: c */
    public final C6748d f108c;

    /* renamed from: d */
    public final InterfaceC3987h f109d;

    /* renamed from: e */
    public final o0 f110e;

    /* renamed from: f */
    public float f111f = Float.NaN;

    /* renamed from: g */
    public float f112g = Float.NaN;

    public C0029b(EnumC6757m enumC6757m, o0 o0Var, C6748d c6748d, InterfaceC3987h interfaceC3987h) {
        this.f106a = enumC6757m;
        this.f107b = o0Var;
        this.f108c = c6748d;
        this.f109d = interfaceC3987h;
        this.f110e = zf.m11101c(o0Var, enumC6757m);
    }

    /* renamed from: a */
    public final long m105a(int i10, long j6) {
        int iM12919j;
        float f6 = this.f112g;
        float f10 = this.f111f;
        if (Float.isNaN(f6) || Float.isNaN(f10)) {
            String str = AbstractC0031d.f113a;
            long jM12924b = AbstractC6746b.m12924b(0, 0, 15);
            o0 o0Var = this.f110e;
            C6748d c6748d = this.f108c;
            float fM6414b = xf.m11049a(str, o0Var, jM12924b, c6748d, this.f109d, 1, 96).m6414b();
            float fM6414b2 = xf.m11049a(AbstractC0031d.f114b, this.f110e, AbstractC6746b.m12924b(0, 0, 15), c6748d, this.f109d, 2, 96).m6414b() - fM6414b;
            this.f112g = fM6414b;
            this.f111f = fM6414b2;
            f10 = fM6414b2;
            f6 = fM6414b;
        }
        if (i10 != 1) {
            int iRound = Math.round((f10 * (i10 - 1)) + f6);
            iM12919j = iRound >= 0 ? iRound : 0;
            int iM12917h = C6745a.m12917h(j6);
            if (iM12919j > iM12917h) {
                iM12919j = iM12917h;
            }
        } else {
            iM12919j = C6745a.m12919j(j6);
        }
        return AbstractC6746b.m12923a(C6745a.m12920k(j6), C6745a.m12918i(j6), iM12919j, C6745a.m12917h(j6));
    }
}

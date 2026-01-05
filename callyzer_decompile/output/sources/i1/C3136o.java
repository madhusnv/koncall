package i1;

import a1.C0005d;
import d3.AbstractC1561o;
import ex.InterfaceC2139c;
import f3.C2196b;
import f3.C2202h;
import f3.InterfaceC2198d;
import kotlin.jvm.internal.AbstractC4155m;
import nf.C5047i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.o */
/* loaded from: classes.dex */
public final class C3136o extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ boolean f16936a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1561o f16937b;

    /* renamed from: c */
    public final /* synthetic */ long f16938c;

    /* renamed from: d */
    public final /* synthetic */ float f16939d;

    /* renamed from: e */
    public final /* synthetic */ float f16940e;

    /* renamed from: f */
    public final /* synthetic */ long f16941f;

    /* renamed from: g */
    public final /* synthetic */ long f16942g;

    /* renamed from: h */
    public final /* synthetic */ C2202h f16943h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3136o(boolean z6, d3.n0 n0Var, long j6, float f6, float f10, long j10, long j11, C2202h c2202h) {
        super(1);
        this.f16936a = z6;
        this.f16937b = n0Var;
        this.f16938c = j6;
        this.f16939d = f6;
        this.f16940e = f10;
        this.f16941f = j10;
        this.f16942g = j11;
        this.f16943h = c2202h;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        v3.i0 i0Var = (v3.i0) obj;
        i0Var.m14622b();
        C2196b c2196b = i0Var.f36917a;
        if (this.f16936a) {
            InterfaceC2198d.m5909Y(i0Var, this.f16937b, 0L, 0L, this.f16938c, null, 246);
        } else {
            long j6 = this.f16938c;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
            float f6 = this.f16939d;
            if (fIntBitsToFloat < f6) {
                float f10 = this.f16940e;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2196b.mo5913e() >> 32));
                float f11 = this.f16940e;
                float f12 = fIntBitsToFloat2 - f11;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c2196b.mo5913e() & 4294967295L)) - f11;
                AbstractC1561o abstractC1561o = this.f16937b;
                long j10 = this.f16938c;
                C0005d c0005d = c2196b.f10124b;
                long jM81z = c0005d.m81z();
                c0005d.m75t().mo5107i();
                try {
                    ((C0005d) ((C5047i) c0005d.f24b).f24823b).m75t().mo5111m(f10, f10, f12, fIntBitsToFloat3, 0);
                    InterfaceC2198d.m5909Y(i0Var, abstractC1561o, 0L, 0L, j10, null, 246);
                } finally {
                    i0.m0.m7392y(c0005d, jM81z);
                }
            } else {
                InterfaceC2198d.m5909Y(i0Var, this.f16937b, this.f16941f, this.f16942g, pg.c0.m11562c(f6, j6), this.f16943h, 208);
            }
        }
        return qw.a0.f30746a;
    }
}

package g5;

import h5.C2843a;
import y4.C8552m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g5.o */
/* loaded from: classes.dex */
public abstract class AbstractC2525o extends AbstractC2523m {

    /* renamed from: i0, reason: collision with root package name */
    public int f44277i0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public int f44278j0 = 0;

    /* renamed from: k0, reason: collision with root package name */
    public int f44279k0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    public int f44280l0 = 0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f44281m0 = false;

    /* renamed from: n0, reason: collision with root package name */
    public int f44282n0 = 0;

    /* renamed from: o0, reason: collision with root package name */
    public int f44283o0 = 0;

    /* renamed from: p0, reason: collision with root package name */
    public final C2843a f44284p0 = new C2843a();

    /* renamed from: q0, reason: collision with root package name */
    public C8552m f44285q0 = null;

    /* renamed from: K */
    public abstract void mo5916K(int i10, int i11, int i12, int i13);

    /* renamed from: L */
    public final void m6549L(C2517g c2517g, EnumC2516f enumC2516f, int i10, EnumC2516f enumC2516f2, int i11) {
        C8552m c8552m;
        C2518h c2518h;
        while (true) {
            c8552m = this.f44285q0;
            if (c8552m != null || (c2518h = this.f13773M) == null) {
                break;
            } else {
                this.f44285q0 = c2518h.f44248k0;
            }
        }
        C2843a c2843a = this.f44284p0;
        c2843a.f15846a = enumC2516f;
        c2843a.f15847b = enumC2516f2;
        c2843a.f15848c = i10;
        c2843a.f15849d = i11;
        c8552m.m15816b(c2517g, c2843a);
        c2517g.m6508H(c2843a.f15850e);
        c2517g.m6505E(c2843a.f15851f);
        c2517g.f13812z = c2843a.f15853h;
        c2517g.m6502B(c2843a.f15852g);
    }
}

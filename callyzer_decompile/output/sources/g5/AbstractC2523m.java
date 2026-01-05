package g5;

import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g5.m */
/* loaded from: classes.dex */
public abstract class AbstractC2523m extends C2517g {

    /* renamed from: g0, reason: collision with root package name */
    public C2517g[] f44275g0 = new C2517g[4];

    /* renamed from: h0, reason: collision with root package name */
    public int f44276h0 = 0;

    /* renamed from: J */
    public final void m6546J(C2517g c2517g) {
        if (c2517g == this || c2517g == null) {
            return;
        }
        int i10 = this.f44276h0 + 1;
        C2517g[] c2517gArr = this.f44275g0;
        if (i10 > c2517gArr.length) {
            this.f44275g0 = (C2517g[]) Arrays.copyOf(c2517gArr, c2517gArr.length * 2);
        }
        C2517g[] c2517gArr2 = this.f44275g0;
        int i11 = this.f44276h0;
        c2517gArr2[i11] = c2517g;
        this.f44276h0 = i11 + 1;
    }
}

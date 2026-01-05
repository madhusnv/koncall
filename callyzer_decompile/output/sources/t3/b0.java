package t3;

import ex.InterfaceC2139c;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 implements k0 {

    /* renamed from: a */
    public final /* synthetic */ int f33957a;

    /* renamed from: b */
    public final /* synthetic */ k0 f33958b;

    /* renamed from: c */
    public final /* synthetic */ f0 f33959c;

    /* renamed from: d */
    public final /* synthetic */ int f33960d;

    /* renamed from: e */
    public final /* synthetic */ k0 f33961e;

    public /* synthetic */ b0(k0 k0Var, f0 f0Var, int i10, k0 k0Var2, int i11) {
        this.f33957a = i11;
        this.f33959c = f0Var;
        this.f33960d = i10;
        this.f33961e = k0Var2;
        this.f33958b = k0Var;
    }

    @Override // t3.k0
    /* renamed from: b */
    public final int mo12108b() {
        switch (this.f33957a) {
        }
        return this.f33958b.mo12108b();
    }

    @Override // t3.k0
    /* renamed from: c */
    public final Map mo12109c() {
        switch (this.f33957a) {
        }
        return this.f33958b.mo12109c();
    }

    @Override // t3.k0
    /* renamed from: d */
    public final void mo12110d() {
        switch (this.f33957a) {
            case 0:
                int i10 = this.f33960d;
                f0 f0Var = this.f33959c;
                f0Var.f33983e = i10;
                this.f33961e.mo12110d();
                e1.j0 j0Var = f0Var.f33990m;
                long[] jArr = j0Var.f8998a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j6 = jArr[i11];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j6) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    Object obj = j0Var.f8999b[i14];
                                    d1 d1Var = (d1) j0Var.f9000c[i14];
                                    int iM9513k = f0Var.f33991n.m9513k(obj);
                                    if (iM9513k < 0 || iM9513k >= f0Var.f33983e) {
                                        d1Var.dispose();
                                        j0Var.m5578k(i14);
                                    }
                                }
                                j6 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                break;
            default:
                int i15 = this.f33960d;
                f0 f0Var2 = this.f33959c;
                f0Var2.f33982d = i15;
                this.f33961e.mo12110d();
                f0Var2.m13286c(f0Var2.f33982d);
                break;
        }
    }

    @Override // t3.k0
    /* renamed from: e */
    public final InterfaceC2139c mo12111e() {
        switch (this.f33957a) {
        }
        return this.f33958b.mo12111e();
    }

    @Override // t3.k0
    public final int getHeight() {
        switch (this.f33957a) {
        }
        return this.f33958b.getHeight();
    }
}

package rf;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.h0;
import pf.C5902b;
import sf.AbstractC6819e;
import sf.C6820f;
import sf.C6825k;
import sf.C6826l;
import sf.C6827m;
import yg.C8656m;
import yg.InterfaceC8646c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.u */
/* loaded from: classes.dex */
public final class C6516u implements InterfaceC8646c {

    /* renamed from: a */
    public final C6500e f31274a;

    /* renamed from: b */
    public final int f31275b;

    /* renamed from: c */
    public final C6496a f31276c;

    /* renamed from: d */
    public final long f31277d;

    /* renamed from: e */
    public final long f31278e;

    public C6516u(C6500e c6500e, int i10, C6496a c6496a, long j6, long j10) {
        this.f31274a = c6500e;
        this.f31275b = i10;
        this.f31276c = c6496a;
        this.f31277d = j6;
        this.f31278e = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static sf.C6820f m12545a(rf.C6511p r4, sf.AbstractC6819e r5, int r6) {
        /*
            sf.f0 r5 = r5.f32401y
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            sf.f r5 = r5.f32413d
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.f32405b
            if (r1 == 0) goto L35
            int[] r1 = r5.f32407d
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f32409f
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.f31266p
            int r6 = r5.f32408e
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.C6516u.m12545a(rf.p, sf.e, int):sf.f");
    }

    @Override // yg.InterfaceC8646c
    /* renamed from: j */
    public final void mo22j(C8656m c8656m) {
        int i10;
        int i11;
        int i12;
        int i13;
        long j6;
        long j10;
        if (this.f31274a.m12517c()) {
            C6827m c6827m = (C6827m) C6826l.m13020b().f32467a;
            if (c6827m == null || c6827m.f32470b) {
                C6511p c6511p = (C6511p) this.f31274a.f31232k.get(this.f31276c);
                if (c6511p != null) {
                    Object obj = c6511p.f31256f;
                    if (obj instanceof AbstractC6819e) {
                        AbstractC6819e abstractC6819e = (AbstractC6819e) obj;
                        int i14 = 0;
                        boolean z6 = this.f31277d > 0;
                        int i15 = abstractC6819e.f32396s;
                        int i16 = 100;
                        if (c6827m != null) {
                            z6 &= c6827m.f32471c;
                            int i17 = c6827m.f32472d;
                            int i18 = c6827m.f32473e;
                            i10 = c6827m.f32469a;
                            if (abstractC6819e.f32401y != null && !abstractC6819e.m12997c()) {
                                C6820f c6820fM12545a = m12545a(c6511p, abstractC6819e, this.f31275b);
                                if (c6820fM12545a == null) {
                                    return;
                                }
                                boolean z10 = c6820fM12545a.f32406c && this.f31277d > 0;
                                i18 = c6820fM12545a.f32408e;
                                z6 = z10;
                            }
                            i12 = i17;
                            i11 = i18;
                        } else {
                            i10 = 0;
                            i11 = 100;
                            i12 = 5000;
                        }
                        C6500e c6500e = this.f31274a;
                        int iElapsedRealtime = -1;
                        if (c8656m.m15985l()) {
                            i13 = 0;
                        } else if (c8656m.f41952d) {
                            i13 = i16;
                            i14 = -1;
                        } else {
                            Exception excM15982i = c8656m.m15982i();
                            if (excM15982i instanceof ApiException) {
                                Status status = ((ApiException) excM15982i).f5997a;
                                i16 = status.f6007a;
                                C5902b c5902b = status.f6010d;
                                if (c5902b != null) {
                                    i14 = c5902b.f28736b;
                                    i13 = i16;
                                }
                                i13 = i16;
                                i14 = -1;
                            } else {
                                i13 = 101;
                                i14 = -1;
                            }
                        }
                        if (z6) {
                            long j11 = this.f31277d;
                            long j12 = this.f31278e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j12);
                            j10 = jCurrentTimeMillis;
                            j6 = j11;
                        } else {
                            j6 = 0;
                            j10 = 0;
                        }
                        C6517v c6517v = new C6517v(new C6825k(this.f31275b, i13, i14, j6, j10, null, null, i15, iElapsedRealtime), i10, i12, i11);
                        h0 h0Var = c6500e.f31236p;
                        h0Var.sendMessage(h0Var.obtainMessage(18, c6517v));
                    }
                }
            }
        }
    }
}

package g5;

import a1.C0005d;
import com.skydoves.balloon.internals.DefinitionKt;
import h5.C2843a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import ug.C7439j;
import y4.C8552m;
import yk.C8687a;
import z4.C8864b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g5.h */
/* loaded from: classes.dex */
public final class C2518h extends C2517g {

    /* renamed from: g0, reason: collision with root package name */
    public ArrayList f44244g0;

    /* renamed from: h0, reason: collision with root package name */
    public C0005d f44245h0;

    /* renamed from: i0, reason: collision with root package name */
    public C8687a f44246i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f44247j0;

    /* renamed from: k0, reason: collision with root package name */
    public C8552m f44248k0;

    /* renamed from: l0, reason: collision with root package name */
    public C8864b f44249l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f44250m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f44251n0;

    /* renamed from: o0, reason: collision with root package name */
    public C2512b[] f44252o0;

    /* renamed from: p0, reason: collision with root package name */
    public C2512b[] f44253p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f44254q0;

    /* renamed from: r0, reason: collision with root package name */
    public WeakReference f44255r0;

    /* renamed from: s0, reason: collision with root package name */
    public WeakReference f44256s0;

    /* renamed from: t0, reason: collision with root package name */
    public WeakReference f44257t0;

    /* renamed from: u0, reason: collision with root package name */
    public WeakReference f44258u0;

    /* renamed from: v0, reason: collision with root package name */
    public HashSet f44259v0;

    /* renamed from: M */
    public static void m6532M(C2517g c2517g, C8552m c8552m, C2843a c2843a) {
        int i10;
        int i11;
        if (c8552m == null) {
            return;
        }
        int i12 = c2517g.f13786Z;
        int[] iArr = c2517g.f13801o;
        if (i12 == 8 || (c2517g instanceof C2522l) || (c2517g instanceof C2511a)) {
            c2843a.f15850e = 0;
            c2843a.f15851f = 0;
            return;
        }
        EnumC2516f[] enumC2516fArr = c2517g.f13772L;
        c2843a.f15846a = enumC2516fArr[0];
        c2843a.f15847b = enumC2516fArr[1];
        c2843a.f15848c = c2517g.m6519l();
        c2843a.f15849d = c2517g.m6518k();
        c2843a.f15854i = false;
        c2843a.f15855j = 0;
        EnumC2516f enumC2516f = c2843a.f15846a;
        EnumC2516f enumC2516f2 = EnumC2516f.MATCH_CONSTRAINT;
        boolean z6 = enumC2516f == enumC2516f2;
        boolean z10 = c2843a.f15847b == enumC2516f2;
        boolean z11 = z6 && c2517g.f13776P > DefinitionKt.NO_Float_VALUE;
        boolean z12 = z10 && c2517g.f13776P > DefinitionKt.NO_Float_VALUE;
        if (z6 && c2517g.m6522o(0) && c2517g.f13799m == 0 && !z11) {
            c2843a.f15846a = EnumC2516f.WRAP_CONTENT;
            if (z10 && c2517g.f13800n == 0) {
                c2843a.f15846a = EnumC2516f.FIXED;
            }
            z6 = false;
        }
        if (z10 && c2517g.m6522o(1) && c2517g.f13800n == 0 && !z12) {
            c2843a.f15847b = EnumC2516f.WRAP_CONTENT;
            if (z6 && c2517g.f13799m == 0) {
                c2843a.f15847b = EnumC2516f.FIXED;
            }
            z10 = false;
        }
        if (c2517g.mo6488v()) {
            c2843a.f15846a = EnumC2516f.FIXED;
            z6 = false;
        }
        if (c2517g.mo6489w()) {
            c2843a.f15847b = EnumC2516f.FIXED;
            z10 = false;
        }
        if (z11) {
            if (iArr[0] == 4) {
                c2843a.f15846a = EnumC2516f.FIXED;
            } else if (!z10) {
                EnumC2516f enumC2516f3 = c2843a.f15847b;
                EnumC2516f enumC2516f4 = EnumC2516f.FIXED;
                if (enumC2516f3 == enumC2516f4) {
                    i11 = c2843a.f15849d;
                } else {
                    c2843a.f15846a = EnumC2516f.WRAP_CONTENT;
                    c8552m.m15816b(c2517g, c2843a);
                    i11 = c2843a.f15851f;
                }
                c2843a.f15846a = enumC2516f4;
                c2843a.f15848c = (int) (c2517g.f13776P * i11);
            }
        }
        if (z12) {
            if (iArr[1] == 4) {
                c2843a.f15847b = EnumC2516f.FIXED;
            } else if (!z6) {
                EnumC2516f enumC2516f5 = c2843a.f15846a;
                EnumC2516f enumC2516f6 = EnumC2516f.FIXED;
                if (enumC2516f5 == enumC2516f6) {
                    i10 = c2843a.f15848c;
                } else {
                    c2843a.f15847b = EnumC2516f.WRAP_CONTENT;
                    c8552m.m15816b(c2517g, c2843a);
                    i10 = c2843a.f15850e;
                }
                c2843a.f15847b = enumC2516f6;
                if (c2517g.f13777Q == -1) {
                    c2843a.f15849d = (int) (i10 / c2517g.f13776P);
                } else {
                    c2843a.f15849d = (int) (c2517g.f13776P * i10);
                }
            }
        }
        c8552m.m15816b(c2517g, c2843a);
        c2517g.m6508H(c2843a.f15850e);
        c2517g.m6505E(c2843a.f15851f);
        c2517g.f13812z = c2843a.f15853h;
        c2517g.m6502B(c2843a.f15852g);
        c2843a.f15855j = 0;
    }

    @Override // g5.C2517g
    /* renamed from: A */
    public final void mo6501A(C7439j c7439j) {
        super.mo6501A(c7439j);
        int size = this.f44244g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C2517g) this.f44244g0.get(i10)).mo6501A(c7439j);
        }
    }

    /* renamed from: J */
    public final void m6533J(C2517g c2517g, int i10) {
        if (i10 == 0) {
            int i11 = this.f44250m0 + 1;
            C2512b[] c2512bArr = this.f44253p0;
            if (i11 >= c2512bArr.length) {
                this.f44253p0 = (C2512b[]) Arrays.copyOf(c2512bArr, c2512bArr.length * 2);
            }
            C2512b[] c2512bArr2 = this.f44253p0;
            int i12 = this.f44250m0;
            c2512bArr2[i12] = new C2512b(c2517g, 0);
            this.f44250m0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.f44251n0 + 1;
            C2512b[] c2512bArr3 = this.f44252o0;
            if (i13 >= c2512bArr3.length) {
                this.f44252o0 = (C2512b[]) Arrays.copyOf(c2512bArr3, c2512bArr3.length * 2);
            }
            C2512b[] c2512bArr4 = this.f44252o0;
            int i14 = this.f44251n0;
            c2512bArr4[i14] = new C2512b(c2517g, 1);
            this.f44251n0 = i14 + 1;
        }
    }

    /* renamed from: K */
    public final void m6534K(C8864b c8864b) {
        C2518h c2518h;
        C8864b c8864b2;
        HashSet hashSet = this.f44259v0;
        boolean zM6536N = m6536N(64);
        mo5926c(c8864b, zM6536N);
        int size = this.f44244g0.size();
        boolean z6 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C2517g c2517g = (C2517g) this.f44244g0.get(i10);
            boolean[] zArr = c2517g.f13771K;
            zArr[0] = false;
            zArr[1] = false;
            if (c2517g instanceof C2511a) {
                z6 = true;
            }
        }
        if (z6) {
            for (int i11 = 0; i11 < size; i11++) {
                C2517g c2517g2 = (C2517g) this.f44244g0.get(i11);
                if (c2517g2 instanceof C2511a) {
                    C2511a c2511a = (C2511a) c2517g2;
                    for (int i12 = 0; i12 < c2511a.f44276h0; i12++) {
                        C2517g c2517g3 = c2511a.f44275g0[i12];
                        if (c2511a.f44235j0 || c2517g3.mo6487d()) {
                            int i13 = c2511a.f44234i0;
                            if (i13 == 0 || i13 == 1) {
                                c2517g3.f13771K[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                c2517g3.f13771K[1] = true;
                            }
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            C2517g c2517g4 = (C2517g) this.f44244g0.get(i14);
            c2517g4.getClass();
            boolean z10 = c2517g4 instanceof AbstractC2525o;
            if (z10 || (c2517g4 instanceof C2522l)) {
                if (z10) {
                    hashSet.add(c2517g4);
                } else {
                    c2517g4.mo5926c(c8864b, zM6536N);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC2525o abstractC2525o = (AbstractC2525o) ((C2517g) it.next());
                for (int i15 = 0; i15 < abstractC2525o.f44276h0; i15++) {
                    if (hashSet.contains(abstractC2525o.f44275g0[i15])) {
                        abstractC2525o.mo5926c(c8864b, zM6536N);
                        hashSet.remove(abstractC2525o);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C2517g) it2.next()).mo5926c(c8864b, zM6536N);
                }
                hashSet.clear();
            }
        }
        if (C8864b.f42649q) {
            HashSet hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                C2517g c2517g5 = (C2517g) this.f44244g0.get(i16);
                c2517g5.getClass();
                if (!(c2517g5 instanceof AbstractC2525o) && !(c2517g5 instanceof C2522l)) {
                    hashSet2.add(c2517g5);
                }
            }
            c2518h = this;
            c8864b2 = c8864b;
            c2518h.m6511b(this, c8864b2, hashSet2, this.f13772L[0] == EnumC2516f.WRAP_CONTENT ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C2517g c2517g6 = (C2517g) it3.next();
                AbstractC2524n.m6548b(this, c8864b2, c2517g6);
                c2517g6.mo5926c(c8864b2, zM6536N);
            }
        } else {
            c2518h = this;
            c8864b2 = c8864b;
            for (int i17 = 0; i17 < size; i17++) {
                C2517g c2517g7 = (C2517g) c2518h.f44244g0.get(i17);
                if (c2517g7 instanceof C2518h) {
                    EnumC2516f[] enumC2516fArr = c2517g7.f13772L;
                    EnumC2516f enumC2516f = enumC2516fArr[0];
                    EnumC2516f enumC2516f2 = enumC2516fArr[1];
                    EnumC2516f enumC2516f3 = EnumC2516f.WRAP_CONTENT;
                    if (enumC2516f == enumC2516f3) {
                        c2517g7.m6506F(EnumC2516f.FIXED);
                    }
                    if (enumC2516f2 == enumC2516f3) {
                        c2517g7.m6507G(EnumC2516f.FIXED);
                    }
                    c2517g7.mo5926c(c8864b2, zM6536N);
                    if (enumC2516f == enumC2516f3) {
                        c2517g7.m6506F(enumC2516f);
                    }
                    if (enumC2516f2 == enumC2516f3) {
                        c2517g7.m6507G(enumC2516f2);
                    }
                } else {
                    AbstractC2524n.m6548b(this, c8864b2, c2517g7);
                    if (!(c2517g7 instanceof AbstractC2525o) && !(c2517g7 instanceof C2522l)) {
                        c2517g7.mo5926c(c8864b2, zM6536N);
                    }
                }
            }
        }
        if (c2518h.f44250m0 > 0) {
            AbstractC2524n.m6547a(this, c8864b2, null, 0);
        }
        if (c2518h.f44251n0 > 0) {
            AbstractC2524n.m6547a(this, c8864b2, null, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04eb A[PHI: r7 r16
      0x04eb: PHI (r7v8 boolean) = (r7v7 boolean), (r7v12 boolean), (r7v12 boolean), (r7v12 boolean) binds: [B:265:0x04b5, B:273:0x04d5, B:274:0x04d7, B:276:0x04dd] A[DONT_GENERATE, DONT_INLINE]
      0x04eb: PHI (r16v9 boolean) = (r16v8 boolean), (r16v13 boolean), (r16v13 boolean), (r16v13 boolean) binds: [B:265:0x04b5, B:273:0x04d5, B:274:0x04d7, B:276:0x04dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6535L() {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C2518h.m6535L():void");
    }

    /* renamed from: N */
    public final boolean m6536N(int i10) {
        return (this.f44254q0 & i10) == i10;
    }

    @Override // g5.C2517g
    /* renamed from: x */
    public final void mo6529x() {
        this.f44249l0.m16366s();
        this.f44244g0.clear();
        super.mo6529x();
    }
}

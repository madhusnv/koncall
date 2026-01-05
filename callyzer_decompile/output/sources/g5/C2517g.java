package g5;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d5.C1610n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import t3.i0;
import ug.C7439j;
import z4.C8864b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g5.g */
/* loaded from: classes.dex */
public class C2517g {

    /* renamed from: A */
    public final C2514d f13761A;

    /* renamed from: B */
    public final C2514d f13762B;

    /* renamed from: C */
    public final C2514d f13763C;

    /* renamed from: D */
    public final C2514d f13764D;

    /* renamed from: E */
    public final C2514d f13765E;

    /* renamed from: F */
    public final C2514d f13766F;

    /* renamed from: G */
    public final C2514d f13767G;

    /* renamed from: H */
    public final C2514d f13768H;

    /* renamed from: I */
    public final C2514d[] f13769I;

    /* renamed from: J */
    public final ArrayList f13770J;

    /* renamed from: K */
    public final boolean[] f13771K;

    /* renamed from: L */
    public final EnumC2516f[] f13772L;

    /* renamed from: M */
    public C2518h f13773M;

    /* renamed from: N */
    public int f13774N;

    /* renamed from: O */
    public int f13775O;

    /* renamed from: P */
    public float f13776P;

    /* renamed from: Q */
    public int f13777Q;

    /* renamed from: R */
    public int f13778R;

    /* renamed from: S */
    public int f13779S;

    /* renamed from: T */
    public int f13780T;

    /* renamed from: U */
    public int f13781U;

    /* renamed from: V */
    public int f13782V;

    /* renamed from: W */
    public float f13783W;

    /* renamed from: X */
    public float f13784X;

    /* renamed from: Y */
    public i0 f13785Y;

    /* renamed from: Z */
    public int f13786Z;

    /* renamed from: a */
    public final boolean[] f13787a;

    /* renamed from: a0, reason: collision with root package name */
    public String f44238a0;

    /* renamed from: b */
    public boolean f13788b;

    /* renamed from: b0, reason: collision with root package name */
    public int f44239b0;

    /* renamed from: c */
    public int f13789c;

    /* renamed from: c0, reason: collision with root package name */
    public int f44240c0;

    /* renamed from: d */
    public int f13790d;

    /* renamed from: d0, reason: collision with root package name */
    public final float[] f44241d0;

    /* renamed from: e */
    public final C1610n f13791e;

    /* renamed from: e0, reason: collision with root package name */
    public final C2517g[] f44242e0;

    /* renamed from: f */
    public String f13792f;

    /* renamed from: f0, reason: collision with root package name */
    public final C2517g[] f44243f0;

    /* renamed from: g */
    public boolean f13793g;

    /* renamed from: h */
    public boolean f13794h;

    /* renamed from: i */
    public boolean f13795i;

    /* renamed from: j */
    public boolean f13796j;

    /* renamed from: k */
    public int f13797k;

    /* renamed from: l */
    public int f13798l;

    /* renamed from: m */
    public int f13799m;

    /* renamed from: n */
    public int f13800n;

    /* renamed from: o */
    public final int[] f13801o;

    /* renamed from: p */
    public int f13802p;

    /* renamed from: q */
    public int f13803q;

    /* renamed from: r */
    public float f13804r;

    /* renamed from: s */
    public int f13805s;

    /* renamed from: t */
    public int f13806t;

    /* renamed from: u */
    public float f13807u;

    /* renamed from: v */
    public int f13808v;

    /* renamed from: w */
    public float f13809w;

    /* renamed from: x */
    public final int[] f13810x;

    /* renamed from: y */
    public float f13811y;

    /* renamed from: z */
    public boolean f13812z;

    public C2517g() {
        this.f13787a = new boolean[]{true, true};
        this.f13788b = true;
        this.f13789c = -1;
        this.f13790d = -1;
        this.f13791e = new C1610n(this);
        this.f13793g = false;
        this.f13794h = false;
        this.f13795i = false;
        this.f13796j = false;
        this.f13797k = -1;
        this.f13798l = -1;
        this.f13799m = 0;
        this.f13800n = 0;
        this.f13801o = new int[2];
        this.f13802p = 0;
        this.f13803q = 0;
        this.f13804r = 1.0f;
        this.f13805s = 0;
        this.f13806t = 0;
        this.f13807u = 1.0f;
        this.f13808v = -1;
        this.f13809w = 1.0f;
        this.f13810x = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f13811y = Float.NaN;
        this.f13812z = false;
        C2514d c2514d = new C2514d(this, EnumC2513c.LEFT);
        this.f13761A = c2514d;
        C2514d c2514d2 = new C2514d(this, EnumC2513c.TOP);
        this.f13762B = c2514d2;
        C2514d c2514d3 = new C2514d(this, EnumC2513c.RIGHT);
        this.f13763C = c2514d3;
        C2514d c2514d4 = new C2514d(this, EnumC2513c.BOTTOM);
        this.f13764D = c2514d4;
        C2514d c2514d5 = new C2514d(this, EnumC2513c.BASELINE);
        this.f13765E = c2514d5;
        this.f13766F = new C2514d(this, EnumC2513c.CENTER_X);
        this.f13767G = new C2514d(this, EnumC2513c.CENTER_Y);
        C2514d c2514d6 = new C2514d(this, EnumC2513c.CENTER);
        this.f13768H = c2514d6;
        this.f13769I = new C2514d[]{c2514d, c2514d3, c2514d2, c2514d4, c2514d5, c2514d6};
        this.f13770J = new ArrayList();
        this.f13771K = new boolean[2];
        EnumC2516f enumC2516f = EnumC2516f.FIXED;
        this.f13772L = new EnumC2516f[]{enumC2516f, enumC2516f};
        this.f13773M = null;
        this.f13774N = 0;
        this.f13775O = 0;
        this.f13776P = DefinitionKt.NO_Float_VALUE;
        this.f13777Q = -1;
        this.f13778R = 0;
        this.f13779S = 0;
        this.f13780T = 0;
        this.f13783W = 0.5f;
        this.f13784X = 0.5f;
        this.f13786Z = 0;
        this.f44238a0 = null;
        this.f44239b0 = 0;
        this.f44240c0 = 0;
        this.f44241d0 = new float[]{-1.0f, -1.0f};
        this.f44242e0 = new C2517g[]{null, null};
        this.f44243f0 = new C2517g[]{null, null};
        m6510a();
    }

    /* renamed from: A */
    public void mo6501A(C7439j c7439j) {
        this.f13761A.m6499j();
        this.f13762B.m6499j();
        this.f13763C.m6499j();
        this.f13764D.m6499j();
        this.f13765E.m6499j();
        this.f13768H.m6499j();
        this.f13766F.m6499j();
        this.f13767G.m6499j();
    }

    /* renamed from: B */
    public final void m6502B(int i10) {
        this.f13780T = i10;
        this.f13812z = i10 > 0;
    }

    /* renamed from: C */
    public final void m6503C(int i10, int i11) {
        if (this.f13793g) {
            return;
        }
        this.f13761A.m6500k(i10);
        this.f13763C.m6500k(i11);
        this.f13778R = i10;
        this.f13774N = i11 - i10;
        this.f13793g = true;
    }

    /* renamed from: D */
    public final void m6504D(int i10, int i11) {
        if (this.f13794h) {
            return;
        }
        this.f13762B.m6500k(i10);
        this.f13764D.m6500k(i11);
        this.f13779S = i10;
        this.f13775O = i11 - i10;
        if (this.f13812z) {
            this.f13765E.m6500k(i10 + this.f13780T);
        }
        this.f13794h = true;
    }

    /* renamed from: E */
    public final void m6505E(int i10) {
        this.f13775O = i10;
        int i11 = this.f13782V;
        if (i10 < i11) {
            this.f13775O = i11;
        }
    }

    /* renamed from: F */
    public final void m6506F(EnumC2516f enumC2516f) {
        this.f13772L[0] = enumC2516f;
    }

    /* renamed from: G */
    public final void m6507G(EnumC2516f enumC2516f) {
        this.f13772L[1] = enumC2516f;
    }

    /* renamed from: H */
    public final void m6508H(int i10) {
        this.f13774N = i10;
        int i11 = this.f13781U;
        if (i10 < i11) {
            this.f13774N = i11;
        }
    }

    /* renamed from: I */
    public void mo6509I(C8864b c8864b, boolean z6) {
        int i10;
        int i11;
        c8864b.getClass();
        int iM16348n = C8864b.m16348n(this.f13761A);
        int iM16348n2 = C8864b.m16348n(this.f13762B);
        int iM16348n3 = C8864b.m16348n(this.f13763C);
        int iM16348n4 = C8864b.m16348n(this.f13764D);
        int i12 = iM16348n4 - iM16348n2;
        if (iM16348n3 - iM16348n < 0 || i12 < 0 || iM16348n == Integer.MIN_VALUE || iM16348n == Integer.MAX_VALUE || iM16348n2 == Integer.MIN_VALUE || iM16348n2 == Integer.MAX_VALUE || iM16348n3 == Integer.MIN_VALUE || iM16348n3 == Integer.MAX_VALUE || iM16348n4 == Integer.MIN_VALUE || iM16348n4 == Integer.MAX_VALUE) {
            iM16348n = 0;
            iM16348n2 = 0;
            iM16348n3 = 0;
            iM16348n4 = 0;
        }
        int i13 = iM16348n3 - iM16348n;
        int i14 = iM16348n4 - iM16348n2;
        this.f13778R = iM16348n;
        this.f13779S = iM16348n2;
        if (this.f13786Z == 8) {
            this.f13774N = 0;
            this.f13775O = 0;
            return;
        }
        EnumC2516f[] enumC2516fArr = this.f13772L;
        EnumC2516f enumC2516f = enumC2516fArr[0];
        EnumC2516f enumC2516f2 = EnumC2516f.FIXED;
        if (enumC2516f == enumC2516f2 && i13 < (i11 = this.f13774N)) {
            i13 = i11;
        }
        if (enumC2516fArr[1] == enumC2516f2 && i14 < (i10 = this.f13775O)) {
            i14 = i10;
        }
        this.f13774N = i13;
        this.f13775O = i14;
        int i15 = this.f13782V;
        if (i14 < i15) {
            this.f13775O = i15;
        }
        int i16 = this.f13781U;
        if (i13 < i16) {
            this.f13774N = i16;
        }
        int i17 = this.f13803q;
        if (i17 > 0 && enumC2516f == EnumC2516f.MATCH_CONSTRAINT) {
            this.f13774N = Math.min(this.f13774N, i17);
        }
        int i18 = this.f13806t;
        if (i18 > 0 && enumC2516fArr[1] == EnumC2516f.MATCH_CONSTRAINT) {
            this.f13775O = Math.min(this.f13775O, i18);
        }
        int i19 = this.f13774N;
        if (i13 != i19) {
            this.f13789c = i19;
        }
        int i20 = this.f13775O;
        if (i14 != i20) {
            this.f13790d = i20;
        }
    }

    /* renamed from: a */
    public final void m6510a() {
        C2514d c2514d = this.f13761A;
        ArrayList arrayList = this.f13770J;
        arrayList.add(c2514d);
        arrayList.add(this.f13762B);
        arrayList.add(this.f13763C);
        arrayList.add(this.f13764D);
        arrayList.add(this.f13766F);
        arrayList.add(this.f13767G);
        arrayList.add(this.f13768H);
        arrayList.add(this.f13765E);
    }

    /* renamed from: b */
    public final void m6511b(C2518h c2518h, C8864b c8864b, HashSet hashSet, int i10, boolean z6) {
        if (z6) {
            if (!hashSet.contains(this)) {
                return;
            }
            AbstractC2524n.m6548b(c2518h, c8864b, this);
            hashSet.remove(this);
            mo5926c(c8864b, c2518h.m6536N(64));
        }
        if (i10 == 0) {
            HashSet hashSet2 = this.f13761A.f13751a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C2514d) it.next()).f13754d.m6511b(c2518h, c8864b, hashSet, i10, true);
                }
            }
            HashSet hashSet3 = this.f13763C.f13751a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C2514d) it2.next()).f13754d.m6511b(c2518h, c8864b, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f13762B.f13751a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C2514d) it3.next()).f13754d.m6511b(c2518h, c8864b, hashSet, i10, true);
            }
        }
        HashSet hashSet5 = this.f13764D.f13751a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C2514d) it4.next()).f13754d.m6511b(c2518h, c8864b, hashSet, i10, true);
            }
        }
        HashSet hashSet6 = this.f13765E.f13751a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C2514d) it5.next()).f13754d.m6511b(c2518h, c8864b, hashSet, i10, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0597  */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42, types: [int] */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r14v38, types: [g5.h] */
    /* JADX WARN: Type inference failed for: r58v0, types: [g5.g] */
    /* JADX WARN: Type inference failed for: r60v1 */
    /* JADX WARN: Type inference failed for: r60v2 */
    /* JADX WARN: Type inference failed for: r60v4 */
    /* JADX WARN: Type inference failed for: r60v5 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo5926c(z4.C8864b r59, boolean r60) {
        /*
            Method dump skipped, instructions count: 1614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C2517g.mo5926c(z4.b, boolean):void");
    }

    /* renamed from: d */
    public boolean mo6487d() {
        return this.f13786Z != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x03b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0490 A[PHI: r3
      0x0490: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:281:0x0480, B:283:0x0486, B:284:0x0488, B:286:0x048c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:346:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6512e(z4.C8864b r30, boolean r31, boolean r32, boolean r33, boolean r34, z4.C8867e r35, z4.C8867e r36, g5.EnumC2516f r37, boolean r38, g5.C2514d r39, g5.C2514d r40, int r41, int r42, int r43, int r44, float r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, int r51, int r52, int r53, int r54, float r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C2517g.m6512e(z4.b, boolean, boolean, boolean, boolean, z4.e, z4.e, g5.f, boolean, g5.d, g5.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: f */
    public final void m6513f(EnumC2513c enumC2513c, C2517g c2517g, EnumC2513c enumC2513c2, int i10) {
        EnumC2513c enumC2513c3;
        EnumC2513c enumC2513c4;
        boolean z6;
        EnumC2513c enumC2513c5 = EnumC2513c.CENTER;
        if (enumC2513c == enumC2513c5) {
            if (enumC2513c2 != enumC2513c5) {
                EnumC2513c enumC2513c6 = EnumC2513c.LEFT;
                if (enumC2513c2 == enumC2513c6 || enumC2513c2 == EnumC2513c.RIGHT) {
                    m6513f(enumC2513c6, c2517g, enumC2513c2, 0);
                    m6513f(EnumC2513c.RIGHT, c2517g, enumC2513c2, 0);
                    mo6516i(enumC2513c5).m6490a(c2517g.mo6516i(enumC2513c2), 0);
                    return;
                }
                EnumC2513c enumC2513c7 = EnumC2513c.TOP;
                if (enumC2513c2 == enumC2513c7 || enumC2513c2 == EnumC2513c.BOTTOM) {
                    m6513f(enumC2513c7, c2517g, enumC2513c2, 0);
                    m6513f(EnumC2513c.BOTTOM, c2517g, enumC2513c2, 0);
                    mo6516i(enumC2513c5).m6490a(c2517g.mo6516i(enumC2513c2), 0);
                    return;
                }
                return;
            }
            EnumC2513c enumC2513c8 = EnumC2513c.LEFT;
            C2514d c2514dMo6516i = mo6516i(enumC2513c8);
            EnumC2513c enumC2513c9 = EnumC2513c.RIGHT;
            C2514d c2514dMo6516i2 = mo6516i(enumC2513c9);
            EnumC2513c enumC2513c10 = EnumC2513c.TOP;
            C2514d c2514dMo6516i3 = mo6516i(enumC2513c10);
            EnumC2513c enumC2513c11 = EnumC2513c.BOTTOM;
            C2514d c2514dMo6516i4 = mo6516i(enumC2513c11);
            boolean z10 = true;
            if ((c2514dMo6516i == null || !c2514dMo6516i.m6496g()) && (c2514dMo6516i2 == null || !c2514dMo6516i2.m6496g())) {
                m6513f(enumC2513c8, c2517g, enumC2513c8, 0);
                m6513f(enumC2513c9, c2517g, enumC2513c9, 0);
                z6 = true;
            } else {
                z6 = false;
            }
            if ((c2514dMo6516i3 == null || !c2514dMo6516i3.m6496g()) && (c2514dMo6516i4 == null || !c2514dMo6516i4.m6496g())) {
                m6513f(enumC2513c10, c2517g, enumC2513c10, 0);
                m6513f(enumC2513c11, c2517g, enumC2513c11, 0);
            } else {
                z10 = false;
            }
            if (z6 && z10) {
                mo6516i(enumC2513c5).m6490a(c2517g.mo6516i(enumC2513c5), 0);
                return;
            }
            if (z6) {
                EnumC2513c enumC2513c12 = EnumC2513c.CENTER_X;
                mo6516i(enumC2513c12).m6490a(c2517g.mo6516i(enumC2513c12), 0);
                return;
            } else {
                if (z10) {
                    EnumC2513c enumC2513c13 = EnumC2513c.CENTER_Y;
                    mo6516i(enumC2513c13).m6490a(c2517g.mo6516i(enumC2513c13), 0);
                    return;
                }
                return;
            }
        }
        EnumC2513c enumC2513c14 = EnumC2513c.CENTER_X;
        if (enumC2513c == enumC2513c14 && (enumC2513c2 == (enumC2513c4 = EnumC2513c.LEFT) || enumC2513c2 == EnumC2513c.RIGHT)) {
            C2514d c2514dMo6516i5 = mo6516i(enumC2513c4);
            C2514d c2514dMo6516i6 = c2517g.mo6516i(enumC2513c2);
            C2514d c2514dMo6516i7 = mo6516i(EnumC2513c.RIGHT);
            c2514dMo6516i5.m6490a(c2514dMo6516i6, 0);
            c2514dMo6516i7.m6490a(c2514dMo6516i6, 0);
            mo6516i(enumC2513c14).m6490a(c2514dMo6516i6, 0);
            return;
        }
        EnumC2513c enumC2513c15 = EnumC2513c.CENTER_Y;
        if (enumC2513c == enumC2513c15 && (enumC2513c2 == (enumC2513c3 = EnumC2513c.TOP) || enumC2513c2 == EnumC2513c.BOTTOM)) {
            C2514d c2514dMo6516i8 = c2517g.mo6516i(enumC2513c2);
            mo6516i(enumC2513c3).m6490a(c2514dMo6516i8, 0);
            mo6516i(EnumC2513c.BOTTOM).m6490a(c2514dMo6516i8, 0);
            mo6516i(enumC2513c15).m6490a(c2514dMo6516i8, 0);
            return;
        }
        if (enumC2513c == enumC2513c14 && enumC2513c2 == enumC2513c14) {
            EnumC2513c enumC2513c16 = EnumC2513c.LEFT;
            mo6516i(enumC2513c16).m6490a(c2517g.mo6516i(enumC2513c16), 0);
            EnumC2513c enumC2513c17 = EnumC2513c.RIGHT;
            mo6516i(enumC2513c17).m6490a(c2517g.mo6516i(enumC2513c17), 0);
            mo6516i(enumC2513c14).m6490a(c2517g.mo6516i(enumC2513c2), 0);
            return;
        }
        if (enumC2513c == enumC2513c15 && enumC2513c2 == enumC2513c15) {
            EnumC2513c enumC2513c18 = EnumC2513c.TOP;
            mo6516i(enumC2513c18).m6490a(c2517g.mo6516i(enumC2513c18), 0);
            EnumC2513c enumC2513c19 = EnumC2513c.BOTTOM;
            mo6516i(enumC2513c19).m6490a(c2517g.mo6516i(enumC2513c19), 0);
            mo6516i(enumC2513c15).m6490a(c2517g.mo6516i(enumC2513c2), 0);
            return;
        }
        C2514d c2514dMo6516i9 = mo6516i(enumC2513c);
        C2514d c2514dMo6516i10 = c2517g.mo6516i(enumC2513c2);
        if (c2514dMo6516i9.m6497h(c2514dMo6516i10)) {
            EnumC2513c enumC2513c20 = EnumC2513c.BASELINE;
            if (enumC2513c == enumC2513c20) {
                C2514d c2514dMo6516i11 = mo6516i(EnumC2513c.TOP);
                C2514d c2514dMo6516i12 = mo6516i(EnumC2513c.BOTTOM);
                if (c2514dMo6516i11 != null) {
                    c2514dMo6516i11.m6498i();
                }
                if (c2514dMo6516i12 != null) {
                    c2514dMo6516i12.m6498i();
                }
            } else if (enumC2513c == EnumC2513c.TOP || enumC2513c == EnumC2513c.BOTTOM) {
                C2514d c2514dMo6516i13 = mo6516i(enumC2513c20);
                if (c2514dMo6516i13 != null) {
                    c2514dMo6516i13.m6498i();
                }
                C2514d c2514dMo6516i14 = mo6516i(enumC2513c5);
                if (c2514dMo6516i14.f13756f != c2514dMo6516i10) {
                    c2514dMo6516i14.m6498i();
                }
                C2514d c2514dM6494e = mo6516i(enumC2513c).m6494e();
                C2514d c2514dMo6516i15 = mo6516i(enumC2513c15);
                if (c2514dMo6516i15.m6496g()) {
                    c2514dM6494e.m6498i();
                    c2514dMo6516i15.m6498i();
                }
            } else if (enumC2513c == EnumC2513c.LEFT || enumC2513c == EnumC2513c.RIGHT) {
                C2514d c2514dMo6516i16 = mo6516i(enumC2513c5);
                if (c2514dMo6516i16.f13756f != c2514dMo6516i10) {
                    c2514dMo6516i16.m6498i();
                }
                C2514d c2514dM6494e2 = mo6516i(enumC2513c).m6494e();
                C2514d c2514dMo6516i17 = mo6516i(enumC2513c14);
                if (c2514dMo6516i17.m6496g()) {
                    c2514dM6494e2.m6498i();
                    c2514dMo6516i17.m6498i();
                }
            }
            c2514dMo6516i9.m6490a(c2514dMo6516i10, i10);
        }
    }

    /* renamed from: g */
    public final void m6514g(C2514d c2514d, C2514d c2514d2, int i10) {
        if (c2514d.f13754d == this) {
            m6513f(c2514d.f13755e, c2514d2.f13754d, c2514d2.f13755e, i10);
        }
    }

    /* renamed from: h */
    public final void m6515h(C8864b c8864b) {
        c8864b.m16359k(this.f13761A);
        c8864b.m16359k(this.f13762B);
        c8864b.m16359k(this.f13763C);
        c8864b.m16359k(this.f13764D);
        if (this.f13780T > 0) {
            c8864b.m16359k(this.f13765E);
        }
    }

    /* renamed from: i */
    public C2514d mo6516i(EnumC2513c enumC2513c) {
        switch (AbstractC2515e.f13760a[enumC2513c.ordinal()]) {
            case 1:
                return this.f13761A;
            case 2:
                return this.f13762B;
            case 3:
                return this.f13763C;
            case 4:
                return this.f13764D;
            case 5:
                return this.f13765E;
            case 6:
                return this.f13768H;
            case 7:
                return this.f13766F;
            case 8:
                return this.f13767G;
            case 9:
                return null;
            default:
                throw new AssertionError(enumC2513c.name());
        }
    }

    /* renamed from: j */
    public final EnumC2516f m6517j(int i10) {
        EnumC2516f[] enumC2516fArr = this.f13772L;
        if (i10 == 0) {
            return enumC2516fArr[0];
        }
        if (i10 == 1) {
            return enumC2516fArr[1];
        }
        return null;
    }

    /* renamed from: k */
    public final int m6518k() {
        if (this.f13786Z == 8) {
            return 0;
        }
        return this.f13775O;
    }

    /* renamed from: l */
    public final int m6519l() {
        if (this.f13786Z == 8) {
            return 0;
        }
        return this.f13774N;
    }

    /* renamed from: m */
    public final int m6520m() {
        C2518h c2518h = this.f13773M;
        return (c2518h == null || !(c2518h instanceof C2518h)) ? this.f13778R : this.f13778R;
    }

    /* renamed from: n */
    public final int m6521n() {
        C2518h c2518h = this.f13773M;
        return (c2518h == null || !(c2518h instanceof C2518h)) ? this.f13779S : this.f13779S;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[RETURN] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m6522o(int r5) {
        /*
            r4 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L1b
            g5.d r5 = r4.f13761A
            g5.d r5 = r5.f13756f
            if (r5 == 0) goto Ld
            r5 = r2
            goto Le
        Ld:
            r5 = r1
        Le:
            g5.d r3 = r4.f13763C
            g5.d r3 = r3.f13756f
            if (r3 == 0) goto L16
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
            goto L3a
        L1b:
            g5.d r5 = r4.f13762B
            g5.d r5 = r5.f13756f
            if (r5 == 0) goto L23
            r5 = r2
            goto L24
        L23:
            r5 = r1
        L24:
            g5.d r3 = r4.f13764D
            g5.d r3 = r3.f13756f
            if (r3 == 0) goto L2c
            r3 = r2
            goto L2d
        L2c:
            r3 = r1
        L2d:
            int r5 = r5 + r3
            g5.d r3 = r4.f13765E
            g5.d r3 = r3.f13756f
            if (r3 == 0) goto L36
            r3 = r2
            goto L37
        L36:
            r3 = r1
        L37:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3b
        L3a:
            return r2
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.C2517g.m6522o(int):boolean");
    }

    /* renamed from: p */
    public final boolean m6523p(int i10, int i11) {
        C2514d c2514d;
        C2514d c2514d2;
        C2514d c2514d3;
        C2514d c2514d4;
        if (i10 == 0) {
            C2514d c2514d5 = this.f13761A;
            C2514d c2514d6 = c2514d5.f13756f;
            if (c2514d6 == null || !c2514d6.f13753c || (c2514d4 = (c2514d3 = this.f13763C).f13756f) == null || !c2514d4.f13753c) {
                return false;
            }
            return (c2514d4.m6492c() - c2514d3.m6493d()) - (c2514d5.m6493d() + c2514d5.f13756f.m6492c()) >= i11;
        }
        C2514d c2514d7 = this.f13762B;
        C2514d c2514d8 = c2514d7.f13756f;
        if (c2514d8 == null || !c2514d8.f13753c || (c2514d2 = (c2514d = this.f13764D).f13756f) == null || !c2514d2.f13753c) {
            return false;
        }
        return (c2514d2.m6492c() - c2514d.m6493d()) - (c2514d7.m6493d() + c2514d7.f13756f.m6492c()) >= i11;
    }

    /* renamed from: q */
    public final void m6524q(EnumC2513c enumC2513c, C2517g c2517g, EnumC2513c enumC2513c2, int i10, int i11) {
        mo6516i(enumC2513c).m6491b(c2517g.mo6516i(enumC2513c2), i10, i11, true);
    }

    /* renamed from: r */
    public final boolean m6525r(int i10) {
        C2514d c2514d;
        C2514d c2514d2;
        int i11 = i10 * 2;
        C2514d[] c2514dArr = this.f13769I;
        C2514d c2514d3 = c2514dArr[i11];
        C2514d c2514d4 = c2514d3.f13756f;
        return (c2514d4 == null || c2514d4.f13756f == c2514d3 || (c2514d2 = (c2514d = c2514dArr[i11 + 1]).f13756f) == null || c2514d2.f13756f != c2514d) ? false : true;
    }

    /* renamed from: s */
    public final boolean m6526s() {
        C2514d c2514d = this.f13761A;
        C2514d c2514d2 = c2514d.f13756f;
        if (c2514d2 != null && c2514d2.f13756f == c2514d) {
            return true;
        }
        C2514d c2514d3 = this.f13763C;
        C2514d c2514d4 = c2514d3.f13756f;
        return c2514d4 != null && c2514d4.f13756f == c2514d3;
    }

    /* renamed from: t */
    public final boolean m6527t() {
        C2514d c2514d = this.f13762B;
        C2514d c2514d2 = c2514d.f13756f;
        if (c2514d2 != null && c2514d2.f13756f == c2514d) {
            return true;
        }
        C2514d c2514d3 = this.f13764D;
        C2514d c2514d4 = c2514d3.f13756f;
        return c2514d4 != null && c2514d4.f13756f == c2514d3;
    }

    public String toString() {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("");
        sbM4568o.append(this.f44238a0 != null ? AbstractC1452a.m4564k(new StringBuilder("id: "), this.f44238a0, " ") : "");
        sbM4568o.append("(");
        sbM4568o.append(this.f13778R);
        sbM4568o.append(", ");
        sbM4568o.append(this.f13779S);
        sbM4568o.append(") - (");
        sbM4568o.append(this.f13774N);
        sbM4568o.append(" x ");
        return AbstractC5601a.m11233d(this.f13775O, ")", sbM4568o);
    }

    /* renamed from: u */
    public final boolean m6528u() {
        return this.f13788b && this.f13786Z != 8;
    }

    /* renamed from: v */
    public boolean mo6488v() {
        if (this.f13793g) {
            return true;
        }
        return this.f13761A.f13753c && this.f13763C.f13753c;
    }

    /* renamed from: w */
    public boolean mo6489w() {
        if (this.f13794h) {
            return true;
        }
        return this.f13762B.f13753c && this.f13764D.f13753c;
    }

    /* renamed from: x */
    public void mo6529x() {
        this.f13761A.m6498i();
        this.f13762B.m6498i();
        this.f13763C.m6498i();
        this.f13764D.m6498i();
        this.f13765E.m6498i();
        this.f13766F.m6498i();
        this.f13767G.m6498i();
        this.f13768H.m6498i();
        this.f13773M = null;
        this.f13811y = Float.NaN;
        this.f13774N = 0;
        this.f13775O = 0;
        this.f13776P = DefinitionKt.NO_Float_VALUE;
        this.f13777Q = -1;
        this.f13778R = 0;
        this.f13779S = 0;
        this.f13780T = 0;
        this.f13781U = 0;
        this.f13782V = 0;
        this.f13783W = 0.5f;
        this.f13784X = 0.5f;
        EnumC2516f enumC2516f = EnumC2516f.FIXED;
        EnumC2516f[] enumC2516fArr = this.f13772L;
        enumC2516fArr[0] = enumC2516f;
        enumC2516fArr[1] = enumC2516f;
        this.f13785Y = null;
        this.f13786Z = 0;
        this.f44239b0 = 0;
        this.f44240c0 = 0;
        float[] fArr = this.f44241d0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f13797k = -1;
        this.f13798l = -1;
        int[] iArr = this.f13810x;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f13799m = 0;
        this.f13800n = 0;
        this.f13804r = 1.0f;
        this.f13807u = 1.0f;
        this.f13803q = Integer.MAX_VALUE;
        this.f13806t = Integer.MAX_VALUE;
        this.f13802p = 0;
        this.f13805s = 0;
        this.f13808v = -1;
        this.f13809w = 1.0f;
        boolean[] zArr = this.f13787a;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.f13771K;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f13788b = true;
        int[] iArr2 = this.f13801o;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f13789c = -1;
        this.f13790d = -1;
    }

    /* renamed from: y */
    public final void m6530y() {
        ArrayList arrayList = this.f13770J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C2514d) arrayList.get(i10)).m6498i();
        }
    }

    /* renamed from: z */
    public final void m6531z() {
        this.f13793g = false;
        this.f13794h = false;
        this.f13795i = false;
        this.f13796j = false;
        ArrayList arrayList = this.f13770J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2514d c2514d = (C2514d) arrayList.get(i10);
            c2514d.f13753c = false;
            c2514d.f13752b = 0;
        }
    }

    public C2517g(int i10, int i11) {
        this.f13787a = new boolean[]{true, true};
        this.f13788b = true;
        this.f13789c = -1;
        this.f13790d = -1;
        this.f13791e = new C1610n(this);
        this.f13793g = false;
        this.f13794h = false;
        this.f13795i = false;
        this.f13796j = false;
        this.f13797k = -1;
        this.f13798l = -1;
        this.f13799m = 0;
        this.f13800n = 0;
        this.f13801o = new int[2];
        this.f13802p = 0;
        this.f13803q = 0;
        this.f13804r = 1.0f;
        this.f13805s = 0;
        this.f13806t = 0;
        this.f13807u = 1.0f;
        this.f13808v = -1;
        this.f13809w = 1.0f;
        this.f13810x = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f13811y = Float.NaN;
        this.f13812z = false;
        C2514d c2514d = new C2514d(this, EnumC2513c.LEFT);
        this.f13761A = c2514d;
        C2514d c2514d2 = new C2514d(this, EnumC2513c.TOP);
        this.f13762B = c2514d2;
        C2514d c2514d3 = new C2514d(this, EnumC2513c.RIGHT);
        this.f13763C = c2514d3;
        C2514d c2514d4 = new C2514d(this, EnumC2513c.BOTTOM);
        this.f13764D = c2514d4;
        C2514d c2514d5 = new C2514d(this, EnumC2513c.BASELINE);
        this.f13765E = c2514d5;
        this.f13766F = new C2514d(this, EnumC2513c.CENTER_X);
        this.f13767G = new C2514d(this, EnumC2513c.CENTER_Y);
        C2514d c2514d6 = new C2514d(this, EnumC2513c.CENTER);
        this.f13768H = c2514d6;
        this.f13769I = new C2514d[]{c2514d, c2514d3, c2514d2, c2514d4, c2514d5, c2514d6};
        this.f13770J = new ArrayList();
        this.f13771K = new boolean[2];
        EnumC2516f enumC2516f = EnumC2516f.FIXED;
        this.f13772L = new EnumC2516f[]{enumC2516f, enumC2516f};
        this.f13773M = null;
        this.f13776P = DefinitionKt.NO_Float_VALUE;
        this.f13777Q = -1;
        this.f13780T = 0;
        this.f13783W = 0.5f;
        this.f13784X = 0.5f;
        this.f13786Z = 0;
        this.f44238a0 = null;
        this.f44239b0 = 0;
        this.f44240c0 = 0;
        this.f44241d0 = new float[]{-1.0f, -1.0f};
        this.f44242e0 = new C2517g[]{null, null};
        this.f44243f0 = new C2517g[]{null, null};
        this.f13778R = 0;
        this.f13779S = 0;
        this.f13774N = i10;
        this.f13775O = i11;
        m6510a();
    }
}

package k5;

import android.view.View;
import c9.C0919n;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import j5.C3588e;
import java.util.ArrayList;
import l5.C4384c;
import l5.C4387f;
import l5.C4392k;
import l5.C4395n;
import l5.EnumC4386e;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k5.h */
/* loaded from: classes.dex */
public class C4013h {

    /* renamed from: A */
    public final C4010e f20733A;

    /* renamed from: B */
    public final C4010e f20734B;

    /* renamed from: C */
    public final C4010e f20735C;

    /* renamed from: D */
    public final C4010e f20736D;

    /* renamed from: E */
    public final C4010e f20737E;

    /* renamed from: F */
    public final C4010e[] f20738F;

    /* renamed from: G */
    public final ArrayList f20739G;

    /* renamed from: H */
    public final boolean[] f20740H;

    /* renamed from: I */
    public final EnumC4012g[] f20741I;

    /* renamed from: J */
    public C4013h f20742J;

    /* renamed from: K */
    public int f20743K;

    /* renamed from: L */
    public int f20744L;

    /* renamed from: M */
    public float f20745M;

    /* renamed from: N */
    public int f20746N;

    /* renamed from: O */
    public int f20747O;

    /* renamed from: P */
    public int f20748P;

    /* renamed from: Q */
    public int f20749Q;

    /* renamed from: R */
    public int f20750R;

    /* renamed from: S */
    public int f20751S;

    /* renamed from: T */
    public float f20752T;

    /* renamed from: U */
    public float f20753U;

    /* renamed from: V */
    public View f20754V;

    /* renamed from: W */
    public int f20755W;

    /* renamed from: X */
    public String f20756X;

    /* renamed from: Y */
    public int f20757Y;

    /* renamed from: Z */
    public int f20758Z;

    /* renamed from: a */
    public boolean f20759a = false;

    /* renamed from: a0, reason: collision with root package name */
    public final float[] f44386a0;

    /* renamed from: b */
    public C4384c f20760b;

    /* renamed from: b0, reason: collision with root package name */
    public final C4013h[] f44387b0;

    /* renamed from: c */
    public C4384c f20761c;

    /* renamed from: c0, reason: collision with root package name */
    public final C4013h[] f44388c0;

    /* renamed from: d */
    public final C4392k f20762d;

    /* renamed from: e */
    public final C4395n f20763e;

    /* renamed from: f */
    public final boolean[] f20764f;

    /* renamed from: g */
    public final int[] f20765g;

    /* renamed from: h */
    public int f20766h;

    /* renamed from: i */
    public int f20767i;

    /* renamed from: j */
    public int f20768j;

    /* renamed from: k */
    public int f20769k;

    /* renamed from: l */
    public final int[] f20770l;

    /* renamed from: m */
    public int f20771m;

    /* renamed from: n */
    public int f20772n;

    /* renamed from: o */
    public float f20773o;

    /* renamed from: p */
    public int f20774p;

    /* renamed from: q */
    public int f20775q;

    /* renamed from: r */
    public float f20776r;

    /* renamed from: s */
    public int f20777s;

    /* renamed from: t */
    public float f20778t;

    /* renamed from: u */
    public final int[] f20779u;

    /* renamed from: v */
    public float f20780v;

    /* renamed from: w */
    public boolean f20781w;

    /* renamed from: x */
    public final C4010e f20782x;

    /* renamed from: y */
    public final C4010e f20783y;

    /* renamed from: z */
    public final C4010e f20784z;

    public C4013h() {
        C4392k c4392k = new C4392k(this);
        c4392k.f21988h.f21964e = EnumC4386e.LEFT;
        c4392k.f21989i.f21964e = EnumC4386e.RIGHT;
        c4392k.f21986f = 0;
        this.f20762d = c4392k;
        C4395n c4395n = new C4395n(this);
        C4387f c4387f = new C4387f(c4395n);
        c4395n.f21978k = c4387f;
        c4395n.f21979l = null;
        c4395n.f21988h.f21964e = EnumC4386e.TOP;
        c4395n.f21989i.f21964e = EnumC4386e.BOTTOM;
        c4387f.f21964e = EnumC4386e.BASELINE;
        c4395n.f21986f = 1;
        this.f20763e = c4395n;
        this.f20764f = new boolean[]{true, true};
        this.f20765g = new int[]{0, 0, 0, 0};
        this.f20766h = -1;
        this.f20767i = -1;
        this.f20768j = 0;
        this.f20769k = 0;
        this.f20770l = new int[2];
        this.f20771m = 0;
        this.f20772n = 0;
        this.f20773o = 1.0f;
        this.f20774p = 0;
        this.f20775q = 0;
        this.f20776r = 1.0f;
        this.f20777s = -1;
        this.f20778t = 1.0f;
        this.f20779u = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f20780v = DefinitionKt.NO_Float_VALUE;
        this.f20781w = false;
        C4010e c4010e = new C4010e(this, EnumC4009d.LEFT);
        this.f20782x = c4010e;
        C4010e c4010e2 = new C4010e(this, EnumC4009d.TOP);
        this.f20783y = c4010e2;
        C4010e c4010e3 = new C4010e(this, EnumC4009d.RIGHT);
        this.f20784z = c4010e3;
        C4010e c4010e4 = new C4010e(this, EnumC4009d.BOTTOM);
        this.f20733A = c4010e4;
        C4010e c4010e5 = new C4010e(this, EnumC4009d.BASELINE);
        this.f20734B = c4010e5;
        C4010e c4010e6 = new C4010e(this, EnumC4009d.CENTER_X);
        this.f20735C = c4010e6;
        C4010e c4010e7 = new C4010e(this, EnumC4009d.CENTER_Y);
        this.f20736D = c4010e7;
        C4010e c4010e8 = new C4010e(this, EnumC4009d.CENTER);
        this.f20737E = c4010e8;
        this.f20738F = new C4010e[]{c4010e, c4010e3, c4010e2, c4010e4, c4010e5, c4010e8};
        ArrayList arrayList = new ArrayList();
        this.f20739G = arrayList;
        this.f20740H = new boolean[2];
        EnumC4012g enumC4012g = EnumC4012g.FIXED;
        this.f20741I = new EnumC4012g[]{enumC4012g, enumC4012g};
        this.f20742J = null;
        this.f20743K = 0;
        this.f20744L = 0;
        this.f20745M = DefinitionKt.NO_Float_VALUE;
        this.f20746N = -1;
        this.f20747O = 0;
        this.f20748P = 0;
        this.f20749Q = 0;
        this.f20752T = 0.5f;
        this.f20753U = 0.5f;
        this.f20755W = 0;
        this.f20756X = null;
        this.f20757Y = 0;
        this.f20758Z = 0;
        this.f44386a0 = new float[]{-1.0f, -1.0f};
        this.f44387b0 = new C4013h[]{null, null};
        this.f44388c0 = new C4013h[]{null, null};
        arrayList.add(c4010e);
        arrayList.add(c4010e2);
        arrayList.add(c4010e3);
        arrayList.add(c4010e4);
        arrayList.add(c4010e6);
        arrayList.add(c4010e7);
        arrayList.add(c4010e8);
        arrayList.add(c4010e5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:307:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8785a(j5.C3588e r59) {
        /*
            Method dump skipped, instructions count: 1573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.C4013h.mo8785a(j5.e):void");
    }

    /* renamed from: b */
    public boolean mo8786b() {
        return this.f20755W != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0187 A[ADDED_TO_REGION] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8793c(j5.C3588e r27, boolean r28, boolean r29, boolean r30, boolean r31, j5.C3592i r32, j5.C3592i r33, k5.EnumC4012g r34, boolean r35, k5.C4010e r36, k5.C4010e r37, int r38, int r39, int r40, int r41, float r42, boolean r43, boolean r44, boolean r45, boolean r46, int r47, int r48, int r49, int r50, float r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.C4013h.m8793c(j5.e, boolean, boolean, boolean, boolean, j5.i, j5.i, k5.g, boolean, k5.e, k5.e, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: d */
    public final void m8794d(C3588e c3588e) {
        c3588e.m8141j(this.f20782x);
        c3588e.m8141j(this.f20783y);
        c3588e.m8141j(this.f20784z);
        c3588e.m8141j(this.f20733A);
        if (this.f20749Q > 0) {
            c3588e.m8141j(this.f20734B);
        }
    }

    /* renamed from: e */
    public C4010e mo8795e(EnumC4009d enumC4009d) {
        switch (AbstractC4011f.f20731a[enumC4009d.ordinal()]) {
            case 1:
                return this.f20782x;
            case 2:
                return this.f20783y;
            case 3:
                return this.f20784z;
            case 4:
                return this.f20733A;
            case 5:
                return this.f20734B;
            case 6:
                return this.f20737E;
            case 7:
                return this.f20735C;
            case 8:
                return this.f20736D;
            case 9:
                return null;
            default:
                throw new AssertionError(enumC4009d.name());
        }
    }

    /* renamed from: f */
    public final EnumC4012g m8796f(int i10) {
        EnumC4012g[] enumC4012gArr = this.f20741I;
        if (i10 == 0) {
            return enumC4012gArr[0];
        }
        if (i10 == 1) {
            return enumC4012gArr[1];
        }
        return null;
    }

    /* renamed from: g */
    public final int m8797g() {
        if (this.f20755W == 8) {
            return 0;
        }
        return this.f20744L;
    }

    /* renamed from: h */
    public final C4013h m8798h(int i10) {
        C4010e c4010e;
        C4010e c4010e2;
        if (i10 != 0) {
            if (i10 == 1 && (c4010e2 = (c4010e = this.f20733A).f20727d) != null && c4010e2.f20727d == c4010e) {
                return c4010e2.f20725b;
            }
            return null;
        }
        C4010e c4010e3 = this.f20784z;
        C4010e c4010e4 = c4010e3.f20727d;
        if (c4010e4 == null || c4010e4.f20727d != c4010e3) {
            return null;
        }
        return c4010e4.f20725b;
    }

    /* renamed from: i */
    public final C4013h m8799i(int i10) {
        C4010e c4010e;
        C4010e c4010e2;
        if (i10 != 0) {
            if (i10 == 1 && (c4010e2 = (c4010e = this.f20783y).f20727d) != null && c4010e2.f20727d == c4010e) {
                return c4010e2.f20725b;
            }
            return null;
        }
        C4010e c4010e3 = this.f20782x;
        C4010e c4010e4 = c4010e3.f20727d;
        if (c4010e4 == null || c4010e4.f20727d != c4010e3) {
            return null;
        }
        return c4010e4.f20725b;
    }

    /* renamed from: j */
    public final int m8800j() {
        if (this.f20755W == 8) {
            return 0;
        }
        return this.f20743K;
    }

    /* renamed from: k */
    public final int m8801k() {
        C4013h c4013h = this.f20742J;
        return (c4013h == null || !(c4013h instanceof C4014i)) ? this.f20747O : ((C4014i) c4013h).f44395j0 + this.f20747O;
    }

    /* renamed from: l */
    public final int m8802l() {
        C4013h c4013h = this.f20742J;
        return (c4013h == null || !(c4013h instanceof C4014i)) ? this.f20748P : ((C4014i) c4013h).f44396k0 + this.f20748P;
    }

    /* renamed from: m */
    public final void m8803m(EnumC4009d enumC4009d, C4013h c4013h, EnumC4009d enumC4009d2, int i10, int i11) {
        mo8795e(enumC4009d).m8787a(c4013h.mo8795e(enumC4009d2), i10, i11);
    }

    /* renamed from: n */
    public final boolean m8804n(int i10) {
        C4010e c4010e;
        C4010e c4010e2;
        int i11 = i10 * 2;
        C4010e[] c4010eArr = this.f20738F;
        C4010e c4010e3 = c4010eArr[i11];
        C4010e c4010e4 = c4010e3.f20727d;
        return (c4010e4 == null || c4010e4.f20727d == c4010e3 || (c4010e2 = (c4010e = c4010eArr[i11 + 1]).f20727d) == null || c4010e2.f20727d != c4010e) ? false : true;
    }

    /* renamed from: o */
    public final boolean m8805o() {
        C4010e c4010e = this.f20782x;
        C4010e c4010e2 = c4010e.f20727d;
        if (c4010e2 != null && c4010e2.f20727d == c4010e) {
            return true;
        }
        C4010e c4010e3 = this.f20784z;
        C4010e c4010e4 = c4010e3.f20727d;
        return c4010e4 != null && c4010e4.f20727d == c4010e3;
    }

    /* renamed from: p */
    public final boolean m8806p() {
        C4010e c4010e = this.f20783y;
        C4010e c4010e2 = c4010e.f20727d;
        if (c4010e2 != null && c4010e2.f20727d == c4010e) {
            return true;
        }
        C4010e c4010e3 = this.f20733A;
        C4010e c4010e4 = c4010e3.f20727d;
        return c4010e4 != null && c4010e4.f20727d == c4010e3;
    }

    /* renamed from: q */
    public void mo8807q() {
        this.f20782x.m8791e();
        this.f20783y.m8791e();
        this.f20784z.m8791e();
        this.f20733A.m8791e();
        this.f20734B.m8791e();
        this.f20735C.m8791e();
        this.f20736D.m8791e();
        this.f20737E.m8791e();
        this.f20742J = null;
        this.f20780v = DefinitionKt.NO_Float_VALUE;
        this.f20743K = 0;
        this.f20744L = 0;
        this.f20745M = DefinitionKt.NO_Float_VALUE;
        this.f20746N = -1;
        this.f20747O = 0;
        this.f20748P = 0;
        this.f20749Q = 0;
        this.f20750R = 0;
        this.f20751S = 0;
        this.f20752T = 0.5f;
        this.f20753U = 0.5f;
        EnumC4012g enumC4012g = EnumC4012g.FIXED;
        EnumC4012g[] enumC4012gArr = this.f20741I;
        enumC4012gArr[0] = enumC4012g;
        enumC4012gArr[1] = enumC4012g;
        this.f20754V = null;
        this.f20755W = 0;
        this.f20757Y = 0;
        this.f20758Z = 0;
        float[] fArr = this.f44386a0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f20766h = -1;
        this.f20767i = -1;
        int[] iArr = this.f20779u;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f20768j = 0;
        this.f20769k = 0;
        this.f20773o = 1.0f;
        this.f20776r = 1.0f;
        this.f20772n = Integer.MAX_VALUE;
        this.f20775q = Integer.MAX_VALUE;
        this.f20771m = 0;
        this.f20774p = 0;
        this.f20777s = -1;
        this.f20778t = 1.0f;
        boolean[] zArr = this.f20764f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.f20740H;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    /* renamed from: r */
    public void mo8808r(C0919n c0919n) {
        this.f20782x.m8792f();
        this.f20783y.m8792f();
        this.f20784z.m8792f();
        this.f20733A.m8792f();
        this.f20734B.m8792f();
        this.f20737E.m8792f();
        this.f20735C.m8792f();
        this.f20736D.m8792f();
    }

    /* renamed from: s */
    public final void m8809s(int i10) {
        this.f20744L = i10;
        int i11 = this.f20751S;
        if (i10 < i11) {
            this.f20744L = i11;
        }
    }

    /* renamed from: t */
    public final void m8810t(EnumC4012g enumC4012g) {
        this.f20741I[0] = enumC4012g;
    }

    public String toString() {
        StringBuilder sbM4568o = AbstractC1452a.m4568o("");
        sbM4568o.append(this.f20756X != null ? AbstractC1452a.m4564k(new StringBuilder("id: "), this.f20756X, " ") : "");
        sbM4568o.append("(");
        sbM4568o.append(this.f20747O);
        sbM4568o.append(", ");
        sbM4568o.append(this.f20748P);
        sbM4568o.append(") - (");
        sbM4568o.append(this.f20743K);
        sbM4568o.append(" x ");
        return AbstractC5601a.m11233d(this.f20744L, ")", sbM4568o);
    }

    /* renamed from: u */
    public final void m8811u(EnumC4012g enumC4012g) {
        this.f20741I[1] = enumC4012g;
    }

    /* renamed from: v */
    public final void m8812v(int i10) {
        this.f20743K = i10;
        int i11 = this.f20750R;
        if (i10 < i11) {
            this.f20743K = i11;
        }
    }

    /* renamed from: w */
    public void mo8813w(boolean z6, boolean z10) {
        int i10;
        int i11;
        C4392k c4392k = this.f20762d;
        boolean z11 = z6 & c4392k.f21987g;
        C4395n c4395n = this.f20763e;
        boolean z12 = z10 & c4395n.f21987g;
        int i12 = c4392k.f21988h.f21966g;
        int i13 = c4395n.f21988h.f21966g;
        int i14 = c4392k.f21989i.f21966g;
        int i15 = c4395n.f21989i.f21966g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z11) {
            this.f20747O = i12;
        }
        if (z12) {
            this.f20748P = i13;
        }
        if (this.f20755W == 8) {
            this.f20743K = 0;
            this.f20744L = 0;
            return;
        }
        EnumC4012g[] enumC4012gArr = this.f20741I;
        if (z11) {
            if (enumC4012gArr[0] == EnumC4012g.FIXED && i17 < (i11 = this.f20743K)) {
                i17 = i11;
            }
            this.f20743K = i17;
            int i19 = this.f20750R;
            if (i17 < i19) {
                this.f20743K = i19;
            }
        }
        if (z12) {
            if (enumC4012gArr[1] == EnumC4012g.FIXED && i18 < (i10 = this.f20744L)) {
                i18 = i10;
            }
            this.f20744L = i18;
            int i20 = this.f20751S;
            if (i18 < i20) {
                this.f20744L = i20;
            }
        }
    }

    /* renamed from: x */
    public void mo8814x(C3588e c3588e) {
        int i10;
        int i11;
        c3588e.getClass();
        int iM8131m = C3588e.m8131m(this.f20782x);
        int iM8131m2 = C3588e.m8131m(this.f20783y);
        int iM8131m3 = C3588e.m8131m(this.f20784z);
        int iM8131m4 = C3588e.m8131m(this.f20733A);
        C4392k c4392k = this.f20762d;
        C4387f c4387f = c4392k.f21988h;
        if (c4387f.f21969j) {
            C4387f c4387f2 = c4392k.f21989i;
            if (c4387f2.f21969j) {
                iM8131m = c4387f.f21966g;
                iM8131m3 = c4387f2.f21966g;
            }
        }
        C4395n c4395n = this.f20763e;
        C4387f c4387f3 = c4395n.f21988h;
        if (c4387f3.f21969j) {
            C4387f c4387f4 = c4395n.f21989i;
            if (c4387f4.f21969j) {
                iM8131m2 = c4387f3.f21966g;
                iM8131m4 = c4387f4.f21966g;
            }
        }
        int i12 = iM8131m4 - iM8131m2;
        if (iM8131m3 - iM8131m < 0 || i12 < 0 || iM8131m == Integer.MIN_VALUE || iM8131m == Integer.MAX_VALUE || iM8131m2 == Integer.MIN_VALUE || iM8131m2 == Integer.MAX_VALUE || iM8131m3 == Integer.MIN_VALUE || iM8131m3 == Integer.MAX_VALUE || iM8131m4 == Integer.MIN_VALUE || iM8131m4 == Integer.MAX_VALUE) {
            iM8131m = 0;
            iM8131m2 = 0;
            iM8131m3 = 0;
            iM8131m4 = 0;
        }
        int i13 = iM8131m3 - iM8131m;
        int i14 = iM8131m4 - iM8131m2;
        this.f20747O = iM8131m;
        this.f20748P = iM8131m2;
        if (this.f20755W == 8) {
            this.f20743K = 0;
            this.f20744L = 0;
            return;
        }
        EnumC4012g[] enumC4012gArr = this.f20741I;
        EnumC4012g enumC4012g = enumC4012gArr[0];
        EnumC4012g enumC4012g2 = EnumC4012g.FIXED;
        if (enumC4012g == enumC4012g2 && i13 < (i11 = this.f20743K)) {
            i13 = i11;
        }
        if (enumC4012gArr[1] == enumC4012g2 && i14 < (i10 = this.f20744L)) {
            i14 = i10;
        }
        this.f20743K = i13;
        this.f20744L = i14;
        int i15 = this.f20751S;
        if (i14 < i15) {
            this.f20744L = i15;
        }
        int i16 = this.f20750R;
        if (i13 < i16) {
            this.f20743K = i16;
        }
    }
}

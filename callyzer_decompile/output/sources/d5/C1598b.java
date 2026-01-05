package d5;

import a5.C0052a;
import e5.InterfaceC1950e;
import g5.C2517g;
import g5.EnumC2513c;
import java.util.HashMap;
import org.bouncycastle.iana.AEADAlgorithm;
import t3.i0;
import y4.C8553n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d5.b */
/* loaded from: classes.dex */
public class C1598b implements InterfaceC1604h {

    /* renamed from: a */
    public Object f7975a;

    /* renamed from: b */
    public final C8553n f7976b;

    /* renamed from: b0, reason: collision with root package name */
    public float f44171b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f44172c0;

    /* renamed from: e0, reason: collision with root package name */
    public C1602f f44174e0;

    /* renamed from: f0, reason: collision with root package name */
    public C1602f f44175f0;

    /* renamed from: g0, reason: collision with root package name */
    public i0 f44176g0;

    /* renamed from: h0, reason: collision with root package name */
    public C2517g f44177h0;

    /* renamed from: i0, reason: collision with root package name */
    public final HashMap f44178i0;

    /* renamed from: j0, reason: collision with root package name */
    public HashMap f44179j0;

    /* renamed from: c */
    public Object f7977c = null;

    /* renamed from: d */
    public int f7978d = 0;

    /* renamed from: e */
    public int f7979e = 0;

    /* renamed from: f */
    public float f7980f = -1.0f;

    /* renamed from: g */
    public float f7981g = -1.0f;

    /* renamed from: h */
    public float f7982h = 0.5f;

    /* renamed from: i */
    public float f7983i = 0.5f;

    /* renamed from: j */
    public int f7984j = 0;

    /* renamed from: k */
    public int f7985k = 0;

    /* renamed from: l */
    public int f7986l = 0;

    /* renamed from: m */
    public int f7987m = 0;

    /* renamed from: n */
    public int f7988n = 0;

    /* renamed from: o */
    public int f7989o = 0;

    /* renamed from: p */
    public int f7990p = 0;

    /* renamed from: q */
    public int f7991q = 0;

    /* renamed from: r */
    public int f7992r = 0;

    /* renamed from: s */
    public int f7993s = 0;

    /* renamed from: t */
    public int f7994t = 0;

    /* renamed from: u */
    public int f7995u = 0;

    /* renamed from: v */
    public int f7996v = 0;

    /* renamed from: w */
    public int f7997w = 0;

    /* renamed from: x */
    public float f7998x = Float.NaN;

    /* renamed from: y */
    public float f7999y = Float.NaN;

    /* renamed from: z */
    public float f8000z = Float.NaN;

    /* renamed from: A */
    public float f7949A = Float.NaN;

    /* renamed from: B */
    public float f7950B = Float.NaN;

    /* renamed from: C */
    public float f7951C = Float.NaN;

    /* renamed from: D */
    public float f7952D = Float.NaN;

    /* renamed from: E */
    public float f7953E = Float.NaN;

    /* renamed from: F */
    public float f7954F = Float.NaN;

    /* renamed from: G */
    public float f7955G = Float.NaN;

    /* renamed from: H */
    public float f7956H = Float.NaN;

    /* renamed from: I */
    public int f7957I = 0;

    /* renamed from: J */
    public Object f7958J = null;

    /* renamed from: K */
    public Object f7959K = null;

    /* renamed from: L */
    public Object f7960L = null;

    /* renamed from: M */
    public Object f7961M = null;

    /* renamed from: N */
    public Object f7962N = null;

    /* renamed from: O */
    public Object f7963O = null;

    /* renamed from: P */
    public Object f7964P = null;

    /* renamed from: Q */
    public Object f7965Q = null;

    /* renamed from: R */
    public Object f7966R = null;

    /* renamed from: S */
    public Object f7967S = null;

    /* renamed from: T */
    public C1598b f7968T = null;

    /* renamed from: U */
    public Object f7969U = null;

    /* renamed from: V */
    public Object f7970V = null;

    /* renamed from: W */
    public C1598b f7971W = null;

    /* renamed from: X */
    public Object f7972X = null;

    /* renamed from: Y */
    public Object f7973Y = null;

    /* renamed from: Z */
    public Object f7974Z = null;

    /* renamed from: a0, reason: collision with root package name */
    public Object f44170a0 = null;

    /* renamed from: d0, reason: collision with root package name */
    public EnumC1606j f44173d0 = null;

    public C1598b(C8553n c8553n) {
        String str = C1602f.f8008h;
        C1602f c1602f = new C1602f(str);
        String str2 = C1602f.f8009i;
        c1602f.f8019f = str2;
        this.f44174e0 = c1602f;
        C1602f c1602f2 = new C1602f(str);
        c1602f2.f8019f = str2;
        this.f44175f0 = c1602f2;
        this.f44178i0 = new HashMap();
        this.f44179j0 = new HashMap();
        this.f7976b = c8553n;
    }

    @Override // d5.InterfaceC1604h
    /* renamed from: a */
    public final void mo5237a(C2517g c2517g) {
        if (c2517g == null) {
            return;
        }
        this.f44177h0 = c2517g;
        c2517g.f13785Y = this.f44176g0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e5.e, java.lang.Object] */
    @Override // d5.InterfaceC1604h
    public void apply() throws NumberFormatException {
        if (this.f44177h0 == null) {
            return;
        }
        ?? r02 = this.f7977c;
        if (r02 != 0) {
            r02.apply();
        }
        this.f44174e0.m5255a(this.f44177h0, 0);
        this.f44175f0.m5255a(this.f44177h0, 1);
        this.f7958J = m5246j(this.f7958J);
        this.f7959K = m5246j(this.f7959K);
        this.f7960L = m5246j(this.f7960L);
        this.f7961M = m5246j(this.f7961M);
        this.f7962N = m5246j(this.f7962N);
        this.f7963O = m5246j(this.f7963O);
        this.f7964P = m5246j(this.f7964P);
        this.f7965Q = m5246j(this.f7965Q);
        this.f7966R = m5246j(this.f7966R);
        this.f7967S = m5246j(this.f7967S);
        this.f7969U = m5246j(this.f7969U);
        this.f7970V = m5246j(this.f7970V);
        this.f7972X = m5246j(this.f7972X);
        this.f7973Y = m5246j(this.f7973Y);
        this.f7974Z = m5246j(this.f7974Z);
        m5240d(this.f44177h0, this.f7958J, EnumC1606j.LEFT_TO_LEFT);
        m5240d(this.f44177h0, this.f7959K, EnumC1606j.LEFT_TO_RIGHT);
        m5240d(this.f44177h0, this.f7960L, EnumC1606j.RIGHT_TO_LEFT);
        m5240d(this.f44177h0, this.f7961M, EnumC1606j.RIGHT_TO_RIGHT);
        m5240d(this.f44177h0, this.f7962N, EnumC1606j.START_TO_START);
        m5240d(this.f44177h0, this.f7963O, EnumC1606j.START_TO_END);
        m5240d(this.f44177h0, this.f7964P, EnumC1606j.END_TO_START);
        m5240d(this.f44177h0, this.f7965Q, EnumC1606j.END_TO_END);
        m5240d(this.f44177h0, this.f7966R, EnumC1606j.TOP_TO_TOP);
        m5240d(this.f44177h0, this.f7967S, EnumC1606j.TOP_TO_BOTTOM);
        m5240d(this.f44177h0, this.f7968T, EnumC1606j.TOP_TO_BASELINE);
        m5240d(this.f44177h0, this.f7969U, EnumC1606j.BOTTOM_TO_TOP);
        m5240d(this.f44177h0, this.f7970V, EnumC1606j.BOTTOM_TO_BOTTOM);
        m5240d(this.f44177h0, this.f7971W, EnumC1606j.BOTTOM_TO_BASELINE);
        m5240d(this.f44177h0, this.f7972X, EnumC1606j.BASELINE_TO_BASELINE);
        m5240d(this.f44177h0, this.f7973Y, EnumC1606j.BASELINE_TO_TOP);
        m5240d(this.f44177h0, this.f7974Z, EnumC1606j.BASELINE_TO_BOTTOM);
        m5240d(this.f44177h0, this.f44170a0, EnumC1606j.CIRCULAR_CONSTRAINT);
        int i10 = this.f7978d;
        if (i10 != 0) {
            this.f44177h0.f44239b0 = i10;
        }
        int i11 = this.f7979e;
        if (i11 != 0) {
            this.f44177h0.f44240c0 = i11;
        }
        float f6 = this.f7980f;
        if (f6 != -1.0f) {
            this.f44177h0.f44241d0[0] = f6;
        }
        float f10 = this.f7981g;
        if (f10 != -1.0f) {
            this.f44177h0.f44241d0[1] = f10;
        }
        C2517g c2517g = this.f44177h0;
        c2517g.f13783W = this.f7982h;
        c2517g.f13784X = this.f7983i;
        C1610n c1610n = c2517g.f13791e;
        c1610n.f8026f = this.f7998x;
        c1610n.f8027g = this.f7999y;
        c1610n.f8028h = this.f8000z;
        c1610n.f8029i = this.f7949A;
        c1610n.f8030j = this.f7950B;
        c1610n.f8031k = this.f7951C;
        c1610n.f8032l = this.f7952D;
        c1610n.f8033m = this.f7953E;
        c1610n.f8034n = this.f7955G;
        c1610n.f8035o = this.f7956H;
        c1610n.f8036p = this.f7954F;
        int i12 = this.f7957I;
        c1610n.f8037q = i12;
        c2517g.f13786Z = i12;
        HashMap map = this.f44178i0;
        if (map != null) {
            for (String str : map.keySet()) {
                Integer num = (Integer) map.get(str);
                C1610n c1610n2 = this.f44177h0.f13791e;
                int iIntValue = num.intValue();
                HashMap map2 = c1610n2.f8038r;
                if (map2.containsKey(str)) {
                    ((C0052a) map2.get(str)).f216c = iIntValue;
                } else {
                    C0052a c0052a = new C0052a();
                    c0052a.f217d = Float.NaN;
                    c0052a.f214a = str;
                    c0052a.f215b = 902;
                    c0052a.f216c = iIntValue;
                    map2.put(str, c0052a);
                }
            }
        }
        HashMap map3 = this.f44179j0;
        if (map3 != null) {
            for (String str2 : map3.keySet()) {
                float fFloatValue = ((Float) this.f44179j0.get(str2)).floatValue();
                HashMap map4 = this.f44177h0.f13791e.f8038r;
                if (map4.containsKey(str2)) {
                    ((C0052a) map4.get(str2)).f217d = fFloatValue;
                } else {
                    C0052a c0052a2 = new C0052a();
                    c0052a2.f216c = Integer.MIN_VALUE;
                    c0052a2.f214a = str2;
                    c0052a2.f215b = 901;
                    c0052a2.f217d = fFloatValue;
                    map4.put(str2, c0052a2);
                }
            }
        }
    }

    @Override // d5.InterfaceC1604h
    /* renamed from: b */
    public C2517g mo5238b() {
        if (this.f44177h0 == null) {
            C2517g c2517g = new C2517g(this.f44174e0.f8017d, this.f44175f0.f8017d);
            this.f44177h0 = c2517g;
            c2517g.f13785Y = this.f44176g0;
        }
        return this.f44177h0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e5.e, java.lang.Object] */
    @Override // d5.InterfaceC1604h
    /* renamed from: c */
    public final InterfaceC1950e mo5239c() {
        return this.f7977c;
    }

    /* renamed from: d */
    public final void m5240d(C2517g c2517g, Object obj, EnumC1606j enumC1606j) {
        C2517g c2517gMo5238b = obj instanceof InterfaceC1604h ? ((InterfaceC1604h) obj).mo5238b() : null;
        if (c2517gMo5238b == null) {
            return;
        }
        int[] iArr = AbstractC1597a.f7948a;
        int i10 = iArr[enumC1606j.ordinal()];
        switch (iArr[enumC1606j.ordinal()]) {
            case 1:
                EnumC2513c enumC2513c = EnumC2513c.LEFT;
                c2517g.mo6516i(enumC2513c).m6491b(c2517gMo5238b.mo6516i(enumC2513c), this.f7984j, this.f7990p, false);
                break;
            case 2:
                c2517g.mo6516i(EnumC2513c.LEFT).m6491b(c2517gMo5238b.mo6516i(EnumC2513c.RIGHT), this.f7984j, this.f7990p, false);
                break;
            case 3:
                c2517g.mo6516i(EnumC2513c.RIGHT).m6491b(c2517gMo5238b.mo6516i(EnumC2513c.LEFT), this.f7985k, this.f7991q, false);
                break;
            case 4:
                EnumC2513c enumC2513c2 = EnumC2513c.RIGHT;
                c2517g.mo6516i(enumC2513c2).m6491b(c2517gMo5238b.mo6516i(enumC2513c2), this.f7985k, this.f7991q, false);
                break;
            case 5:
                EnumC2513c enumC2513c3 = EnumC2513c.LEFT;
                c2517g.mo6516i(enumC2513c3).m6491b(c2517gMo5238b.mo6516i(enumC2513c3), this.f7986l, this.f7992r, false);
                break;
            case 6:
                c2517g.mo6516i(EnumC2513c.LEFT).m6491b(c2517gMo5238b.mo6516i(EnumC2513c.RIGHT), this.f7986l, this.f7992r, false);
                break;
            case 7:
                c2517g.mo6516i(EnumC2513c.RIGHT).m6491b(c2517gMo5238b.mo6516i(EnumC2513c.LEFT), this.f7987m, this.f7993s, false);
                break;
            case 8:
                EnumC2513c enumC2513c4 = EnumC2513c.RIGHT;
                c2517g.mo6516i(enumC2513c4).m6491b(c2517gMo5238b.mo6516i(enumC2513c4), this.f7987m, this.f7993s, false);
                break;
            case 9:
                EnumC2513c enumC2513c5 = EnumC2513c.TOP;
                c2517g.mo6516i(enumC2513c5).m6491b(c2517gMo5238b.mo6516i(enumC2513c5), this.f7988n, this.f7994t, false);
                break;
            case 10:
                c2517g.mo6516i(EnumC2513c.TOP).m6491b(c2517gMo5238b.mo6516i(EnumC2513c.BOTTOM), this.f7988n, this.f7994t, false);
                break;
            case 11:
                c2517g.m6524q(EnumC2513c.TOP, c2517gMo5238b, EnumC2513c.BASELINE, this.f7988n, this.f7994t);
                break;
            case 12:
                c2517g.mo6516i(EnumC2513c.BOTTOM).m6491b(c2517gMo5238b.mo6516i(EnumC2513c.TOP), this.f7989o, this.f7995u, false);
                break;
            case 13:
                EnumC2513c enumC2513c6 = EnumC2513c.BOTTOM;
                c2517g.mo6516i(enumC2513c6).m6491b(c2517gMo5238b.mo6516i(enumC2513c6), this.f7989o, this.f7995u, false);
                break;
            case 14:
                c2517g.m6524q(EnumC2513c.BOTTOM, c2517gMo5238b, EnumC2513c.BASELINE, this.f7989o, this.f7995u);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                c2517g.m6524q(EnumC2513c.BASELINE, c2517gMo5238b, EnumC2513c.BOTTOM, this.f7996v, this.f7997w);
                break;
            case 16:
                c2517g.m6524q(EnumC2513c.BASELINE, c2517gMo5238b, EnumC2513c.TOP, this.f7996v, this.f7997w);
                break;
            case 17:
                EnumC2513c enumC2513c7 = EnumC2513c.BASELINE;
                c2517g.m6524q(enumC2513c7, c2517gMo5238b, enumC2513c7, this.f7996v, this.f7997w);
                break;
            case 18:
                float f6 = this.f44171b0;
                int i11 = (int) this.f44172c0;
                c2517g.getClass();
                EnumC2513c enumC2513c8 = EnumC2513c.CENTER;
                c2517g.m6524q(enumC2513c8, c2517gMo5238b, enumC2513c8, i11, 0);
                c2517g.f13811y = f6;
                break;
        }
    }

    /* renamed from: e */
    public final void m5241e(Object obj) {
        this.f44173d0 = EnumC1606j.BOTTOM_TO_BOTTOM;
        this.f7970V = obj;
    }

    /* renamed from: f */
    public final void m5242f() {
        EnumC1606j enumC1606j = this.f44173d0;
        if (enumC1606j == null) {
            this.f7958J = null;
            this.f7959K = null;
            this.f7984j = 0;
            this.f7960L = null;
            this.f7961M = null;
            this.f7985k = 0;
            this.f7962N = null;
            this.f7963O = null;
            this.f7986l = 0;
            this.f7964P = null;
            this.f7965Q = null;
            this.f7987m = 0;
            this.f7966R = null;
            this.f7967S = null;
            this.f7988n = 0;
            this.f7969U = null;
            this.f7970V = null;
            this.f7989o = 0;
            this.f7972X = null;
            this.f44170a0 = null;
            this.f7982h = 0.5f;
            this.f7983i = 0.5f;
            this.f7990p = 0;
            this.f7991q = 0;
            this.f7992r = 0;
            this.f7993s = 0;
            this.f7994t = 0;
            this.f7995u = 0;
            return;
        }
        switch (AbstractC1597a.f7948a[enumC1606j.ordinal()]) {
            case 1:
            case 2:
                this.f7958J = null;
                this.f7959K = null;
                this.f7984j = 0;
                this.f7990p = 0;
                break;
            case 3:
            case 4:
                this.f7960L = null;
                this.f7961M = null;
                this.f7985k = 0;
                this.f7991q = 0;
                break;
            case 5:
            case 6:
                this.f7962N = null;
                this.f7963O = null;
                this.f7986l = 0;
                this.f7992r = 0;
                break;
            case 7:
            case 8:
                this.f7964P = null;
                this.f7965Q = null;
                this.f7987m = 0;
                this.f7993s = 0;
                break;
            case 9:
            case 10:
            case 11:
                this.f7966R = null;
                this.f7967S = null;
                this.f7968T = null;
                this.f7988n = 0;
                this.f7994t = 0;
                break;
            case 12:
            case 13:
            case 14:
                this.f7969U = null;
                this.f7970V = null;
                this.f7971W = null;
                this.f7989o = 0;
                this.f7995u = 0;
                break;
            case 17:
                this.f7972X = null;
                break;
            case 18:
                this.f44170a0 = null;
                break;
        }
    }

    /* renamed from: g */
    public final void m5243g() {
        if (this.f7962N != null) {
            this.f44173d0 = EnumC1606j.START_TO_START;
        } else {
            this.f44173d0 = EnumC1606j.START_TO_END;
        }
        m5242f();
        if (this.f7964P != null) {
            this.f44173d0 = EnumC1606j.END_TO_START;
        } else {
            this.f44173d0 = EnumC1606j.END_TO_END;
        }
        m5242f();
        if (this.f7958J != null) {
            this.f44173d0 = EnumC1606j.LEFT_TO_LEFT;
        } else {
            this.f44173d0 = EnumC1606j.LEFT_TO_RIGHT;
        }
        m5242f();
        if (this.f7960L != null) {
            this.f44173d0 = EnumC1606j.RIGHT_TO_LEFT;
        } else {
            this.f44173d0 = EnumC1606j.RIGHT_TO_RIGHT;
        }
        m5242f();
    }

    @Override // d5.InterfaceC1604h
    public final Object getKey() {
        return this.f7975a;
    }

    /* renamed from: h */
    public final void m5244h() {
        if (this.f7966R != null) {
            this.f44173d0 = EnumC1606j.TOP_TO_TOP;
        } else {
            this.f44173d0 = EnumC1606j.TOP_TO_BOTTOM;
        }
        m5242f();
        this.f44173d0 = EnumC1606j.BASELINE_TO_BASELINE;
        m5242f();
        if (this.f7969U != null) {
            this.f44173d0 = EnumC1606j.BOTTOM_TO_TOP;
        } else {
            this.f44173d0 = EnumC1606j.BOTTOM_TO_BOTTOM;
        }
        m5242f();
    }

    /* renamed from: i */
    public final void m5245i(Object obj) {
        this.f44173d0 = EnumC1606j.END_TO_END;
        this.f7965Q = obj;
    }

    /* renamed from: j */
    public final Object m5246j(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof C1598b) ? (InterfaceC1604h) this.f7976b.f41521c.get(obj) : obj;
    }

    /* renamed from: k */
    public C1598b mo5247k(int i10) {
        EnumC1606j enumC1606j = this.f44173d0;
        if (enumC1606j == null) {
            this.f7984j = i10;
            this.f7985k = i10;
            this.f7986l = i10;
            this.f7987m = i10;
            this.f7988n = i10;
            this.f7989o = i10;
            return this;
        }
        switch (AbstractC1597a.f7948a[enumC1606j.ordinal()]) {
            case 1:
            case 2:
                this.f7984j = i10;
                break;
            case 3:
            case 4:
                this.f7985k = i10;
                break;
            case 5:
            case 6:
                this.f7986l = i10;
                break;
            case 7:
            case 8:
                this.f7987m = i10;
                break;
            case 9:
            case 10:
            case 11:
                this.f7988n = i10;
                break;
            case 12:
            case 13:
            case 14:
                this.f7989o = i10;
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
            case 16:
            case 17:
                this.f7996v = i10;
                break;
            case 18:
                this.f44172c0 = i10;
                break;
        }
        return this;
    }

    /* renamed from: l */
    public C1598b mo5248l(Float f6) {
        return mo5247k(this.f7976b.m15822c(f6));
    }

    /* renamed from: m */
    public final void m5249m(int i10) {
        EnumC1606j enumC1606j = this.f44173d0;
        if (enumC1606j == null) {
            this.f7990p = i10;
            this.f7991q = i10;
            this.f7992r = i10;
            this.f7993s = i10;
            this.f7994t = i10;
            this.f7995u = i10;
            return;
        }
        switch (AbstractC1597a.f7948a[enumC1606j.ordinal()]) {
            case 1:
            case 2:
                this.f7990p = i10;
                break;
            case 3:
            case 4:
                this.f7991q = i10;
                break;
            case 5:
            case 6:
                this.f7992r = i10;
                break;
            case 7:
            case 8:
                this.f7993s = i10;
                break;
            case 9:
            case 10:
            case 11:
                this.f7994t = i10;
                break;
            case 12:
            case 13:
            case 14:
                this.f7995u = i10;
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
            case 16:
            case 17:
                this.f7997w = i10;
                break;
        }
    }

    /* renamed from: n */
    public final void m5250n(Float f6) {
        m5249m(this.f7976b.m15822c(f6));
    }

    /* renamed from: o */
    public final void m5251o(Object obj) {
        this.f44173d0 = EnumC1606j.START_TO_START;
        this.f7962N = obj;
    }

    /* renamed from: p */
    public final void m5252p(Object obj) {
        this.f44173d0 = EnumC1606j.TOP_TO_TOP;
        this.f7966R = obj;
    }
}

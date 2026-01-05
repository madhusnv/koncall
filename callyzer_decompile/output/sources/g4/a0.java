package g4;

import c3.C0847b;
import c9.C0917l;
import d3.C1565s;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.List;
import k4.C3994o;
import k4.C3995p;
import k4.C3998s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import n4.C4952a;
import n4.C4953b;
import og.pe;
import org.bouncycastle.iana.AEADAlgorithm;
import r4.C6446a;
import r4.C6449d;
import r4.C6450e;
import r4.C6451f;
import r4.C6452g;
import r4.C6453h;
import r4.C6454i;
import r4.C6456k;
import r4.C6457l;
import r4.C6458m;
import r4.C6462q;
import r4.C6463r;
import r4.C6464s;
import r4.C6465t;
import s4.C6759o;
import s4.C6760p;
import t2.C7002a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: B */
    public static final a0 f13528B;

    /* renamed from: C */
    public static final a0 f13529C;

    /* renamed from: D */
    public static final a0 f13530D;

    /* renamed from: E */
    public static final a0 f13531E;

    /* renamed from: b */
    public static final a0 f13532b;

    /* renamed from: c */
    public static final a0 f13533c;

    /* renamed from: d */
    public static final a0 f13534d;

    /* renamed from: e */
    public static final a0 f13535e;

    /* renamed from: f */
    public static final a0 f13536f;

    /* renamed from: g */
    public static final a0 f13537g;

    /* renamed from: h */
    public static final a0 f13538h;

    /* renamed from: j */
    public static final a0 f13539j;

    /* renamed from: k */
    public static final a0 f13540k;

    /* renamed from: l */
    public static final a0 f13541l;

    /* renamed from: m */
    public static final a0 f13542m;

    /* renamed from: n */
    public static final a0 f13543n;

    /* renamed from: p */
    public static final a0 f13544p;

    /* renamed from: q */
    public static final a0 f13545q;

    /* renamed from: r */
    public static final a0 f13546r;

    /* renamed from: s */
    public static final a0 f13547s;

    /* renamed from: t */
    public static final a0 f13548t;

    /* renamed from: v */
    public static final a0 f13549v;

    /* renamed from: w */
    public static final a0 f13550w;

    /* renamed from: x */
    public static final a0 f13551x;

    /* renamed from: y */
    public static final a0 f13552y;

    /* renamed from: z */
    public static final a0 f13553z;

    /* renamed from: a */
    public final /* synthetic */ int f13554a;

    static {
        int i10 = 2;
        f13532b = new a0(i10, 0);
        f13533c = new a0(i10, 1);
        f13534d = new a0(i10, 2);
        f13535e = new a0(i10, 3);
        f13536f = new a0(i10, 4);
        f13537g = new a0(i10, 5);
        f13538h = new a0(i10, 6);
        f13539j = new a0(i10, 7);
        f13540k = new a0(i10, 8);
        f13541l = new a0(i10, 9);
        f13542m = new a0(i10, 10);
        f13543n = new a0(i10, 11);
        f13544p = new a0(i10, 12);
        f13545q = new a0(i10, 13);
        f13546r = new a0(i10, 14);
        f13547s = new a0(i10, 15);
        f13548t = new a0(i10, 16);
        f13549v = new a0(i10, 17);
        f13550w = new a0(i10, 18);
        f13551x = new a0(i10, 19);
        f13552y = new a0(i10, 20);
        f13553z = new a0(i10, 21);
        f13528B = new a0(i10, 22);
        f13529C = new a0(i10, 23);
        f13530D = new a0(i10, 24);
        f13531E = new a0(i10, 25);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i10, int i11) {
        super(i10);
        this.f13554a = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        EnumC2495k enumC2495k;
        Object objM6429a;
        int i10 = 0;
        switch (this.f13554a) {
            case 0:
                C2492h c2492h = (C2492h) obj2;
                String str = c2492h.f13620b;
                C0917l c0917l = e0.f13572a;
                return pe.m10826a(str, e0.m6429a(c2492h.f13619a, e0.f13573b, (C7002a) obj));
            case 1:
                C7002a c7002a = (C7002a) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i10 < size) {
                    arrayList.add(e0.m6429a((C2490f) list.get(i10), e0.f13574c, c7002a));
                    i10++;
                }
                return arrayList;
            case 2:
                C7002a c7002a2 = (C7002a) obj;
                C2490f c2490f = (C2490f) obj2;
                Object obj3 = c2490f.f13595a;
                if (obj3 instanceof C2506v) {
                    enumC2495k = EnumC2495k.Paragraph;
                } else if (obj3 instanceof g0) {
                    enumC2495k = EnumC2495k.Span;
                } else if (obj3 instanceof r0) {
                    enumC2495k = EnumC2495k.VerbatimTts;
                } else if (obj3 instanceof q0) {
                    enumC2495k = EnumC2495k.Url;
                } else if (obj3 instanceof C2498n) {
                    enumC2495k = EnumC2495k.Link;
                } else if (obj3 instanceof C2497m) {
                    enumC2495k = EnumC2495k.Clickable;
                } else {
                    if (!(obj3 instanceof i0)) {
                        throw new UnsupportedOperationException();
                    }
                    enumC2495k = EnumC2495k.String;
                }
                switch (b0.f13561a[enumC2495k.ordinal()]) {
                    case 1:
                        AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objM6429a = e0.m6429a((C2506v) obj3, e0.f13579h, c7002a2);
                        break;
                    case 2:
                        AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objM6429a = e0.m6429a((g0) obj3, e0.f13580i, c7002a2);
                        break;
                    case 3:
                        AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objM6429a = e0.m6429a((r0) obj3, e0.f13575d, c7002a2);
                        break;
                    case 4:
                        AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objM6429a = e0.m6429a((q0) obj3, e0.f13576e, c7002a2);
                        break;
                    case 5:
                        AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objM6429a = e0.m6429a((C2498n) obj3, e0.f13577f, c7002a2);
                        break;
                    case 6:
                        AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objM6429a = e0.m6429a((C2497m) obj3, e0.f13578g, c7002a2);
                        break;
                    case 7:
                        AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objM6429a = ((i0) obj3).f13656a;
                        C0917l c0917l2 = e0.f13572a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return pe.m10826a(enumC2495k, objM6429a, Integer.valueOf(c2490f.f13596b), Integer.valueOf(c2490f.f13597c), c2490f.f13598d);
            case 3:
                return Float.valueOf(((C6446a) obj2).f31100a);
            case 4:
                C2497m c2497m = (C2497m) obj2;
                String str2 = c2497m.f13676a;
                C0917l c0917l3 = e0.f13572a;
                return pe.m10826a(str2, e0.m6429a(c2497m.f13677b, e0.f13581j, (C7002a) obj));
            case 5:
                long j6 = ((C1565s) obj2).f7819a;
                return j6 == 16 ? Boolean.FALSE : Integer.valueOf(d3.h0.m5149u(j6));
            case 6:
                return Integer.valueOf(((C3998s) obj2).f20701a);
            case 7:
                C6454i c6454i = (C6454i) obj2;
                C6451f c6451f = new C6451f(c6454i.f31113a);
                C0917l c0917l4 = e0.f13572a;
                return pe.m10826a(c6451f, new C6453h(c6454i.f31114b), new C6452g());
            case 8:
                C2498n c2498n = (C2498n) obj2;
                String str3 = c2498n.f13682a;
                C0917l c0917l5 = e0.f13572a;
                return pe.m10826a(str3, e0.m6429a(c2498n.f13683b, e0.f13581j, (C7002a) obj));
            case 9:
                C7002a c7002a3 = (C7002a) obj;
                List list2 = ((C4953b) obj2).f24639a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i10 < size2) {
                    arrayList2.add(e0.m6429a((C4952a) list2.get(i10), e0.f13593v, c7002a3));
                    i10++;
                }
                return arrayList2;
            case 10:
                return ((C4952a) obj2).f24637a.toLanguageTag();
            case 11:
                long j10 = ((C0847b) obj2).f5352a;
                if (C0847b.m2271b(j10, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float fValueOf = Float.valueOf(Float.intBitsToFloat((int) (j10 >> 32)));
                C0917l c0917l6 = e0.f13572a;
                return pe.m10826a(fValueOf, Float.valueOf(Float.intBitsToFloat((int) (j10 & 4294967295L))));
            case 12:
                C7002a c7002a4 = (C7002a) obj;
                C2506v c2506v = (C2506v) obj2;
                C6456k c6456k = new C6456k(c2506v.f13719a);
                C0917l c0917l7 = e0.f13572a;
                C6458m c6458m = new C6458m(c2506v.f13720b);
                Object objM6429a2 = e0.m6429a(new C6759o(c2506v.f13721c), e0.f13590s, c7002a4);
                C6463r c6463r = c2506v.f13722d;
                C6463r c6463r2 = C6463r.f31127c;
                Object objM6429a3 = e0.m6429a(c6463r, e0.f13584m, c7002a4);
                Object objM6429a4 = e0.m6429a(c2506v.f13723e, f0.f13599a, c7002a4);
                C6454i c6454i2 = c2506v.f13724f;
                C6454i c6454i3 = C6454i.f31112c;
                return pe.m10826a(c6456k, c6458m, objM6429a2, objM6429a3, objM6429a4, e0.m6429a(c6454i2, e0.f13594w, c7002a4), e0.m6429a(new C6450e(c2506v.f13725g), f0.f13600b, c7002a4), new C6449d(c2506v.f13726h), e0.m6429a(c2506v.f13727i, f0.f13601c, c7002a4));
            case 13:
                C7002a c7002a5 = (C7002a) obj;
                d3.k0 k0Var = (d3.k0) obj2;
                return pe.m10826a(e0.m6429a(new C1565s(k0Var.f7782a), e0.f13589r, c7002a5), e0.m6429a(new C0847b(k0Var.f7783b), e0.f13591t, c7002a5), Float.valueOf(k0Var.f7784c));
            case 14:
                C7002a c7002a6 = (C7002a) obj;
                g0 g0Var = (g0) obj2;
                C1565s c1565s = new C1565s(g0Var.f13603a.mo12438b());
                d0 d0Var = e0.f13589r;
                Object objM6429a5 = e0.m6429a(c1565s, d0Var, c7002a6);
                C6759o c6759o = new C6759o(g0Var.f13604b);
                d0 d0Var2 = e0.f13590s;
                Object objM6429a6 = e0.m6429a(c6759o, d0Var2, c7002a6);
                C3998s c3998s = g0Var.f13605c;
                C3998s c3998s2 = C3998s.f20692b;
                Object objM6429a7 = e0.m6429a(c3998s, e0.f13585n, c7002a6);
                C3994o c3994o = g0Var.f13606d;
                C3995p c3995p = g0Var.f13607e;
                String str4 = g0Var.f13609g;
                Object objM6429a8 = e0.m6429a(new C6759o(g0Var.f13610h), d0Var2, c7002a6);
                Object objM6429a9 = e0.m6429a(g0Var.f13611i, e0.f13586o, c7002a6);
                Object objM6429a10 = e0.m6429a(g0Var.f13612j, e0.f13583l, c7002a6);
                C4953b c4953b = g0Var.f13613k;
                C4953b c4953b2 = C4953b.f24638c;
                Object objM6429a11 = e0.m6429a(c4953b, e0.f13592u, c7002a6);
                Object objM6429a12 = e0.m6429a(new C1565s(g0Var.f13614l), d0Var, c7002a6);
                Object objM6429a13 = e0.m6429a(g0Var.f13615m, e0.f13582k, c7002a6);
                d3.k0 k0Var2 = g0Var.f13616n;
                d3.k0 k0Var3 = d3.k0.f7781d;
                return pe.m10826a(objM6429a5, objM6429a6, objM6429a7, c3994o, c3995p, -1, str4, objM6429a8, objM6429a9, objM6429a10, objM6429a11, objM6429a12, objM6429a13, e0.m6429a(k0Var2, e0.f13588q, c7002a6));
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return Integer.valueOf(((C6457l) obj2).f31119a);
            case 16:
                C6462q c6462q = (C6462q) obj2;
                return pe.m10826a(Float.valueOf(c6462q.f31125a), Float.valueOf(c6462q.f31126b));
            case 17:
                C7002a c7002a7 = (C7002a) obj;
                C6463r c6463r3 = (C6463r) obj2;
                C6759o c6759o2 = new C6759o(c6463r3.f31128a);
                d0 d0Var3 = e0.f13590s;
                return pe.m10826a(e0.m6429a(c6759o2, d0Var3, c7002a7), e0.m6429a(new C6759o(c6463r3.f31129b), d0Var3, c7002a7));
            case 18:
                C7002a c7002a8 = (C7002a) obj;
                m0 m0Var = (m0) obj2;
                g0 g0Var2 = m0Var.f13678a;
                C0917l c0917l8 = e0.f13580i;
                return pe.m10826a(e0.m6429a(g0Var2, c0917l8, c7002a8), e0.m6429a(m0Var.f13679b, c0917l8, c7002a8), e0.m6429a(m0Var.f13680c, c0917l8, c7002a8), e0.m6429a(m0Var.f13681d, c0917l8, c7002a8));
            case 19:
                long j11 = ((n0) obj2).f13686a;
                int i11 = n0.f13685c;
                Integer numValueOf = Integer.valueOf((int) (j11 >> 32));
                C0917l c0917l9 = e0.f13572a;
                return pe.m10826a(numValueOf, Integer.valueOf((int) (j11 & 4294967295L)));
            case 20:
                long j12 = ((C6759o) obj2).f32214a;
                if (C6759o.m12952a(j12, C6759o.f32213c)) {
                    return Boolean.FALSE;
                }
                Float fValueOf2 = Float.valueOf(C6759o.m12954c(j12));
                C0917l c0917l10 = e0.f13572a;
                return pe.m10826a(fValueOf2, new C6760p(C6759o.m12953b(j12)));
            case 21:
                String str5 = ((q0) obj2).f13705a;
                C0917l c0917l11 = e0.f13572a;
                return str5;
            case 22:
                String str6 = ((r0) obj2).f13708a;
                C0917l c0917l12 = e0.f13572a;
                return str6;
            case 23:
                return Integer.valueOf(((C6450e) obj2).f31106a);
            case 24:
                Boolean boolValueOf = Boolean.valueOf(((C2508x) obj2).f13731a);
                C0917l c0917l13 = e0.f13572a;
                return pe.m10826a(boolValueOf, new C2496l());
            default:
                C6465t c6465t = (C6465t) obj2;
                C6464s c6464s = new C6464s(c6465t.f31133a);
                C0917l c0917l14 = e0.f13572a;
                return pe.m10826a(c6464s, Boolean.valueOf(c6465t.f31134b));
        }
    }
}

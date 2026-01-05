package y4;

import a1.C0005d;
import a5.C0052a;
import androidx.compose.ui.layout.AbstractC0264a;
import com.skydoves.balloon.internals.DefinitionKt;
import d5.C1610n;
import e1.C1908j;
import g5.AbstractC2525o;
import g5.C2512b;
import g5.C2514d;
import g5.C2517g;
import g5.C2518h;
import g5.C2522l;
import g5.EnumC2513c;
import g5.EnumC2516f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import og.xe;
import p020v.a1;
import pg.f8;
import pg.g8;
import s1.C6725t;
import s4.C6745a;
import s4.InterfaceC6747c;
import t3.i0;
import t3.v0;
import t3.w0;
import yk.C8687a;
import z4.C8864b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y4.m */
/* loaded from: classes.dex */
public final class C8552m {

    /* renamed from: a */
    public final C2518h f41511a;

    /* renamed from: b */
    public Map f41512b;

    /* renamed from: c */
    public final LinkedHashMap f41513c;

    /* renamed from: d */
    public final LinkedHashMap f41514d;

    /* renamed from: e */
    public final C8553n f41515e;

    /* renamed from: f */
    public final int[] f41516f;

    /* renamed from: g */
    public final int[] f41517g;

    /* renamed from: h */
    public float f41518h;

    public C8552m(InterfaceC6747c interfaceC6747c) {
        C2518h c2518h = new C2518h(0, 0);
        c2518h.f44244g0 = new ArrayList();
        c2518h.f44245h0 = new C0005d(c2518h);
        C8687a c8687a = new C8687a(16);
        new ArrayList();
        new ArrayList();
        new ArrayList();
        c2518h.f44246i0 = c8687a;
        c2518h.f44248k0 = null;
        c2518h.f44249l0 = new C8864b();
        c2518h.f44250m0 = 0;
        c2518h.f44251n0 = 0;
        c2518h.f44252o0 = new C2512b[4];
        c2518h.f44253p0 = new C2512b[4];
        c2518h.f44254q0 = 257;
        c2518h.f44255r0 = null;
        c2518h.f44256s0 = null;
        c2518h.f44257t0 = null;
        c2518h.f44258u0 = null;
        c2518h.f44259v0 = new HashSet();
        c2518h.f44248k0 = this;
        this.f41511a = c2518h;
        this.f41512b = new LinkedHashMap();
        this.f41513c = new LinkedHashMap();
        this.f41514d = new LinkedHashMap();
        this.f41515e = new C8553n(interfaceC6747c);
        this.f41516f = new int[2];
        this.f41517g = new int[2];
        this.f41518h = Float.NaN;
    }

    /* renamed from: d */
    public static void m15814d(EnumC2516f enumC2516f, int i10, int i11, int i12, boolean z6, boolean z10, int i13, int[] iArr) {
        int i14 = AbstractC8551l.f41510a[enumC2516f.ordinal()];
        if (i14 == 1) {
            iArr[0] = i10;
            iArr[1] = i10;
            return;
        }
        if (i14 == 2) {
            iArr[0] = 0;
            iArr[1] = i13;
            return;
        }
        if (i14 == 3) {
            boolean z11 = z10 || ((i12 == 1 || i12 == 2) && (i12 == 2 || i11 != 1 || z6));
            iArr[0] = z11 ? i10 : 0;
            if (!z11) {
                i10 = i13;
            }
            iArr[1] = i10;
            return;
        }
        if (i14 == 4) {
            iArr[0] = i13;
            iArr[1] = i13;
        } else {
            throw new IllegalStateException((enumC2516f + " is not supported").toString());
        }
    }

    /* renamed from: a */
    public final float m15815a() {
        return this.f41518h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0199  */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15816b(g5.C2517g r28, h5.C2843a r29) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.C8552m.m15816b(g5.g, h5.a):void");
    }

    /* renamed from: c */
    public final long m15817c(C2517g c2517g, long j6) {
        i0 i0Var = c2517g.f13785Y;
        int i10 = 0;
        if (!(c2517g instanceof AbstractC2525o)) {
            if (i0Var == null) {
                return C1908j.m5567a(0, 0);
            }
            w0 w0VarMo13314z = i0Var.mo13314z(j6);
            this.f41512b.put(i0Var, w0VarMo13314z);
            return C1908j.m5567a(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b);
        }
        int i11 = C6745a.m12916g(j6) ? 1073741824 : C6745a.m12914e(j6) ? Integer.MIN_VALUE : 0;
        if (C6745a.m12915f(j6)) {
            i10 = 1073741824;
        } else if (C6745a.m12913d(j6)) {
            i10 = Integer.MIN_VALUE;
        }
        AbstractC2525o abstractC2525o = (AbstractC2525o) c2517g;
        abstractC2525o.mo5916K(i11, C6745a.m12918i(j6), i10, C6745a.m12917h(j6));
        return C1908j.m5567a(abstractC2525o.f44282n0, abstractC2525o.f44283o0);
    }

    /* renamed from: e */
    public final void m15818e(v0 v0Var, List list, Map map) {
        C2517g c2517g;
        w0 w0Var;
        this.f41512b = map;
        LinkedHashMap linkedHashMap = this.f41514d;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        C2518h c2518h = this.f41511a;
        if (zIsEmpty) {
            ArrayList arrayList = c2518h.f44244g0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2517g c2517g2 = (C2517g) arrayList.get(i10);
                i0 i0Var = c2517g2.f13785Y;
                if (i0Var != null) {
                    C1610n c1610n = c2517g2.f13791e;
                    C2517g c2517g3 = c1610n.f8021a;
                    if (c2517g3 != null) {
                        c1610n.f8022b = c2517g3.m6520m();
                        c1610n.f8023c = c2517g3.m6521n();
                        c1610n.f8024d = c2517g3.m6520m() + c2517g3.f13774N;
                        c1610n.f8025e = c2517g3.m6521n() + c2517g3.f13775O;
                        c1610n.m5261c(c2517g3.f13791e);
                    }
                    linkedHashMap.put(g8.m11660b(i0Var), new C1610n(c1610n));
                }
            }
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            i0 i0Var2 = (i0) list.get(i11);
            C1610n c1610n2 = (C1610n) linkedHashMap.get(g8.m11660b(i0Var2));
            if (c1610n2 != null && (w0Var = (w0) this.f41512b.get(i0Var2)) != null && c1610n2.f8037q != 8) {
                if (Float.isNaN(c1610n2.f8028h) && Float.isNaN(c1610n2.f8029i) && Float.isNaN(c1610n2.f8030j) && Float.isNaN(c1610n2.f8031k) && Float.isNaN(c1610n2.f8032l) && Float.isNaN(c1610n2.f8033m) && Float.isNaN(c1610n2.f8034n) && Float.isNaN(c1610n2.f8035o) && Float.isNaN(c1610n2.f8036p)) {
                    int i12 = (int) 0;
                    v0.m13318f(v0Var, w0Var, xe.m11044a(c1610n2.f8022b - i12, c1610n2.f8023c - i12));
                } else {
                    int i13 = (int) 0;
                    v0Var.m13325j(w0Var, c1610n2.f8022b - i13, c1610n2.f8023c - i13, Float.isNaN(c1610n2.f8033m) ? DefinitionKt.NO_Float_VALUE : c1610n2.f8033m, new C6725t(18, c1610n2));
                }
            }
        }
        if (EnumC8548i.BOUNDS == null) {
            StringBuilder sb2 = new StringBuilder("{   root: {interpolated: { left:  0,  top:  0,");
            sb2.append("  right:   " + c2518h.m6519l() + " ,");
            sb2.append("  bottom:  " + c2518h.m6518k() + " ,");
            sb2.append(" } }");
            ArrayList arrayList2 = c2518h.f44244g0;
            int size3 = arrayList2.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj = arrayList2.get(i14);
                i14++;
                C2517g c2517g4 = (C2517g) obj;
                i0 i0Var3 = c2517g4.f13785Y;
                if (i0Var3 != null) {
                    if (c2517g4.f13792f == null) {
                        Object objM720a = AbstractC0264a.m720a(i0Var3);
                        if (objM720a == null) {
                            objM720a = f8.m11620a(i0Var3);
                        }
                        c2517g4.f13792f = objM720a != null ? objM720a.toString() : null;
                    }
                    C1610n c1610n3 = (C1610n) linkedHashMap.get(g8.m11660b(i0Var3));
                    C1610n c1610n4 = (c1610n3 == null || (c2517g = c1610n3.f8021a) == null) ? null : c2517g.f13791e;
                    if (c1610n4 != null) {
                        sb2.append(" " + c2517g4.f13792f + ": {");
                        sb2.append(" interpolated : ");
                        HashMap map2 = c1610n4.f8038r;
                        sb2.append("{\n");
                        C1610n.m5259a(c1610n4.f8022b, "left", sb2);
                        C1610n.m5259a(c1610n4.f8023c, "top", sb2);
                        C1610n.m5259a(c1610n4.f8024d, "right", sb2);
                        C1610n.m5259a(c1610n4.f8025e, "bottom", sb2);
                        C1610n.m5260b(sb2, "pivotX", c1610n4.f8026f);
                        C1610n.m5260b(sb2, "pivotY", c1610n4.f8027g);
                        C1610n.m5260b(sb2, "rotationX", c1610n4.f8028h);
                        C1610n.m5260b(sb2, "rotationY", c1610n4.f8029i);
                        C1610n.m5260b(sb2, "rotationZ", c1610n4.f8030j);
                        C1610n.m5260b(sb2, "translationX", c1610n4.f8031k);
                        C1610n.m5260b(sb2, "translationY", c1610n4.f8032l);
                        C1610n.m5260b(sb2, "translationZ", c1610n4.f8033m);
                        C1610n.m5260b(sb2, "scaleX", c1610n4.f8034n);
                        C1610n.m5260b(sb2, "scaleY", c1610n4.f8035o);
                        C1610n.m5260b(sb2, "alpha", c1610n4.f8036p);
                        C1610n.m5259a(c1610n4.f8037q, "visibility", sb2);
                        C1610n.m5260b(sb2, "interpolatedPos", Float.NaN);
                        C2517g c2517g5 = c1610n4.f8021a;
                        if (c2517g5 != null) {
                            for (EnumC2513c enumC2513c : EnumC2513c.values()) {
                                C2514d c2514dMo6516i = c2517g5.mo6516i(enumC2513c);
                                if (c2514dMo6516i != null && c2514dMo6516i.f13756f != null) {
                                    sb2.append("Anchor");
                                    sb2.append(enumC2513c.name());
                                    sb2.append(": ['");
                                    String str = c2514dMo6516i.f13756f.f13754d.f13792f;
                                    if (str == null) {
                                        str = "#PARENT";
                                    }
                                    sb2.append(str);
                                    sb2.append("', '");
                                    sb2.append(c2514dMo6516i.f13756f.f13755e.name());
                                    sb2.append("', '");
                                    sb2.append(c2514dMo6516i.f13757g);
                                    sb2.append("'],\n");
                                }
                            }
                        }
                        C1610n.m5260b(sb2, "phone_orientation", Float.NaN);
                        C1610n.m5260b(sb2, "phone_orientation", Float.NaN);
                        if (map2.size() != 0) {
                            sb2.append("custom : {\n");
                            for (String str2 : map2.keySet()) {
                                C0052a c0052a = (C0052a) map2.get(str2);
                                sb2.append(str2);
                                sb2.append(": ");
                                switch (c0052a.f215b) {
                                    case 900:
                                        sb2.append(c0052a.f216c);
                                        sb2.append(",\n");
                                        break;
                                    case 901:
                                        sb2.append(c0052a.f217d);
                                        sb2.append(",\n");
                                        break;
                                    case 902:
                                        sb2.append("'");
                                        sb2.append(C0052a.m157a(c0052a.f216c));
                                        sb2.append("',\n");
                                        break;
                                    case 903:
                                        a1.m14318A(sb2, "'", null, "',\n");
                                        break;
                                }
                            }
                            sb2.append("}\n");
                        }
                        sb2.append("}\n");
                        sb2.append("}, ");
                    }
                } else if (c2517g4 instanceof C2522l) {
                    sb2.append(" " + c2517g4.f13792f + ": {");
                    C2522l c2522l = (C2522l) c2517g4;
                    if (c2522l.f44273k0 == 0) {
                        sb2.append(" type: 'hGuideline', ");
                    } else {
                        sb2.append(" type: 'vGuideline', ");
                    }
                    sb2.append(" interpolated: ");
                    sb2.append(" { left: " + c2522l.m6520m() + ", top: " + c2522l.m6521n() + ", right: " + (c2522l.m6519l() + c2522l.m6520m()) + ", bottom: " + (c2522l.m6518k() + c2522l.m6521n()) + " }");
                    sb2.append("}, ");
                }
            }
            sb2.append(" }");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x038b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m15819f(long r19, s4.EnumC6757m r21, y4.C8547h r22, java.util.List r23, java.util.LinkedHashMap r24) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.C8552m.m15819f(long, s4.m, y4.h, java.util.List, java.util.LinkedHashMap):long");
    }
}

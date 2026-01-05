package d5;

import a5.C0052a;
import com.sun.mail.util.AbstractC1452a;
import g5.C2517g;
import java.util.HashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d5.n */
/* loaded from: classes.dex */
public final class C1610n {

    /* renamed from: a */
    public final C2517g f8021a;

    /* renamed from: b */
    public int f8022b;

    /* renamed from: c */
    public int f8023c;

    /* renamed from: d */
    public int f8024d;

    /* renamed from: e */
    public int f8025e;

    /* renamed from: f */
    public float f8026f;

    /* renamed from: g */
    public float f8027g;

    /* renamed from: h */
    public float f8028h;

    /* renamed from: i */
    public float f8029i;

    /* renamed from: j */
    public float f8030j;

    /* renamed from: k */
    public float f8031k;

    /* renamed from: l */
    public float f8032l;

    /* renamed from: m */
    public float f8033m;

    /* renamed from: n */
    public float f8034n;

    /* renamed from: o */
    public float f8035o;

    /* renamed from: p */
    public float f8036p;

    /* renamed from: q */
    public int f8037q;

    /* renamed from: r */
    public final HashMap f8038r;

    public C1610n(C2517g c2517g) {
        this.f8021a = null;
        this.f8022b = 0;
        this.f8023c = 0;
        this.f8024d = 0;
        this.f8025e = 0;
        this.f8026f = Float.NaN;
        this.f8027g = Float.NaN;
        this.f8028h = Float.NaN;
        this.f8029i = Float.NaN;
        this.f8030j = Float.NaN;
        this.f8031k = Float.NaN;
        this.f8032l = Float.NaN;
        this.f8033m = Float.NaN;
        this.f8034n = Float.NaN;
        this.f8035o = Float.NaN;
        this.f8036p = Float.NaN;
        this.f8037q = 0;
        this.f8038r = new HashMap();
        this.f8021a = c2517g;
    }

    /* renamed from: a */
    public static void m5259a(int i10, String str, StringBuilder sb2) {
        AbstractC1452a.m4551B(sb2, str, ": ", i10, ",\n");
    }

    /* renamed from: b */
    public static void m5260b(StringBuilder sb2, String str, float f6) {
        if (Float.isNaN(f6)) {
            return;
        }
        sb2.append(str);
        sb2.append(": ");
        sb2.append(f6);
        sb2.append(",\n");
    }

    /* renamed from: c */
    public final void m5261c(C1610n c1610n) {
        if (c1610n == null) {
            return;
        }
        this.f8026f = c1610n.f8026f;
        this.f8027g = c1610n.f8027g;
        this.f8028h = c1610n.f8028h;
        this.f8029i = c1610n.f8029i;
        this.f8030j = c1610n.f8030j;
        this.f8031k = c1610n.f8031k;
        this.f8032l = c1610n.f8032l;
        this.f8033m = c1610n.f8033m;
        this.f8034n = c1610n.f8034n;
        this.f8035o = c1610n.f8035o;
        this.f8036p = c1610n.f8036p;
        this.f8037q = c1610n.f8037q;
        HashMap map = this.f8038r;
        map.clear();
        for (C0052a c0052a : c1610n.f8038r.values()) {
            String str = c0052a.f214a;
            C0052a c0052a2 = new C0052a();
            c0052a2.f216c = Integer.MIN_VALUE;
            c0052a2.f217d = Float.NaN;
            c0052a2.f214a = str;
            c0052a2.f215b = c0052a.f215b;
            c0052a2.f216c = c0052a.f216c;
            c0052a2.f217d = c0052a.f217d;
            map.put(str, c0052a2);
        }
    }

    public C1610n(C1610n c1610n) {
        this.f8021a = null;
        this.f8022b = 0;
        this.f8023c = 0;
        this.f8024d = 0;
        this.f8025e = 0;
        this.f8026f = Float.NaN;
        this.f8027g = Float.NaN;
        this.f8028h = Float.NaN;
        this.f8029i = Float.NaN;
        this.f8030j = Float.NaN;
        this.f8031k = Float.NaN;
        this.f8032l = Float.NaN;
        this.f8033m = Float.NaN;
        this.f8034n = Float.NaN;
        this.f8035o = Float.NaN;
        this.f8036p = Float.NaN;
        this.f8037q = 0;
        this.f8038r = new HashMap();
        this.f8021a = c1610n.f8021a;
        this.f8022b = c1610n.f8022b;
        this.f8023c = c1610n.f8023c;
        this.f8024d = c1610n.f8024d;
        this.f8025e = c1610n.f8025e;
        m5261c(c1610n);
    }
}

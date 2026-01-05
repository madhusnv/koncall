package dd;

import ed.EnumC2030f;
import ox.C5770a;
import ox.C5774e;
import ox.C5775f;
import ox.EnumC5772c;
import ox.InterfaceC5776g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dd.g */
/* loaded from: classes.dex */
public final class C1689g {

    /* renamed from: a */
    public final C1684b f8265a;

    /* renamed from: b */
    public final InterfaceC5776g f8266b;

    /* renamed from: c */
    public double f8267c;

    /* renamed from: d */
    public C5774e f8268d;

    /* renamed from: e */
    public boolean f8269e;

    /* renamed from: f */
    public double f8270f;

    public C1689g(C1684b c1684b) {
        C5775f c5775f = C5775f.f28341a;
        C5774e c5774eMo11308a = c5775f.mo11308a();
        this.f8265a = c1684b;
        this.f8266b = c5775f;
        this.f8267c = 0.0d;
        this.f8268d = c5774eMo11308a;
        this.f8270f = Math.cbrt(((1 - 0.7d) * 0.0d) / c1684b.f8237d);
    }

    /* renamed from: a */
    public final double m5388a(EnumC2030f enumC2030f, double d2, double d10) {
        EnumC2030f enumC2030f2 = EnumC2030f.Throttling;
        C1684b c1684b = this.f8265a;
        if (enumC2030f != enumC2030f2) {
            return (Math.pow(C5770a.m11301l(C5774e.m11306a(this.f8268d.f28340a), EnumC5772c.SECONDS) - this.f8270f, 3) * c1684b.f8237d) + this.f8267c;
        }
        if (this.f8269e) {
            d2 = Math.min(d2, d10);
        }
        this.f8267c = d2;
        c1684b.getClass();
        this.f8270f = Math.cbrt(((1 - 0.7d) * d2) / c1684b.f8237d);
        this.f8268d = this.f8266b.mo11308a();
        this.f8269e = true;
        double d11 = this.f8267c;
        c1684b.getClass();
        return d11 * 0.7d;
    }
}

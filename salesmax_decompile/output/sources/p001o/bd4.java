package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.fmh;
import p001o.wv;

/* loaded from: classes3.dex */
public final class bd4 {

    /* renamed from: a */
    public final wv.C17966b f15947a;

    /* renamed from: b */
    public final fmh f15948b;

    /* renamed from: c */
    public double f15949c;

    /* renamed from: d */
    public ulh f15950d;

    /* renamed from: e */
    public boolean f15951e;

    /* renamed from: f */
    public double f15952f;

    public bd4(wv.C17966b c17966b, fmh fmhVar, double d, ulh ulhVar) {
        sq8.m48649h(c17966b, "config");
        sq8.m48649h(fmhVar, "timeSource");
        sq8.m48649h(ulhVar, "lastThrottleTime");
        this.f15947a = c17966b;
        this.f15948b = fmhVar;
        this.f15949c = d;
        this.f15950d = ulhVar;
        this.f15952f = m18631b();
    }

    /* renamed from: a */
    public final double m18630a(fse fseVar, double d, double d2) {
        if (fseVar != fse.Throttling) {
            return m18632c();
        }
        if (this.f15951e) {
            d = Math.min(d, d2);
        }
        this.f15949c = d;
        this.f15952f = m18631b();
        this.f15950d = this.f15948b.mo27091a();
        this.f15951e = true;
        return m18633d(this.f15949c);
    }

    /* renamed from: b */
    public final double m18631b() {
        return Math.cbrt((this.f15949c * (1 - this.f15947a.m55059c())) / this.f15947a.m55063g());
    }

    /* renamed from: c */
    public final double m18632c() {
        return (this.f15947a.m55063g() * Math.pow(k16.m34873S(this.f15950d.mo27104a(), o16.SECONDS) - this.f15952f, 3)) + this.f15949c;
    }

    /* renamed from: d */
    public final double m18633d(double d) {
        return d * this.f15947a.m55059c();
    }

    /* renamed from: e */
    public final boolean m18634e() {
        return this.f15951e;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bd4(wv.C17966b c17966b, fmh fmhVar, double d, ulh ulhVar, int i, id5 id5Var) {
        fmh fmhVar2 = (i & 2) != 0 ? fmh.C13489a.f23681a : fmhVar;
        this(c17966b, fmhVar2, (i & 4) != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : d, (i & 8) != 0 ? fmhVar2.mo27091a() : ulhVar);
    }
}

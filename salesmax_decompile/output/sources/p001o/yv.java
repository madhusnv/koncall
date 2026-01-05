package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.wv;

/* loaded from: classes3.dex */
public final class yv {

    /* renamed from: a */
    public final wv.C17966b f56080a;

    /* renamed from: b */
    public final fmh f56081b;

    /* renamed from: c */
    public ulh f56082c;

    /* renamed from: d */
    public double f56083d;

    /* renamed from: e */
    public int f56084e;

    /* renamed from: f */
    public final double f56085f;

    public yv(wv.C17966b c17966b, fmh fmhVar, ulh ulhVar, double d, int i) {
        sq8.m48649h(c17966b, "config");
        sq8.m48649h(fmhVar, "timeSource");
        sq8.m48649h(ulhVar, "lastTxBucketMark");
        this.f56080a = c17966b;
        this.f56081b = fmhVar;
        this.f56082c = ulhVar;
        this.f56083d = d;
        this.f56084e = i;
        this.f56085f = 1 / k16.m34873S(c17966b.m55060d(), o16.SECONDS);
    }

    /* renamed from: a */
    public final double m58353a() {
        this.f56084e++;
        double dFloor = Math.floor(k16.m34886o(this.f56082c.mo27104a(), this.f56080a.m55060d()));
        if (dFloor >= 1.0d) {
            this.f56083d = ((this.f56084e / dFloor) * this.f56085f * this.f56080a.m55064h()) + (this.f56083d * (1 - this.f56080a.m55064h()));
            this.f56082c = this.f56082c.mo23355b(k16.m34871Q(this.f56080a.m55060d(), dFloor));
            this.f56084e = 0;
        }
        return this.f56083d;
    }

    public /* synthetic */ yv(wv.C17966b c17966b, fmh fmhVar, ulh ulhVar, double d, int i, int i2, id5 id5Var) {
        this(c17966b, fmhVar, (i2 & 4) != 0 ? fmhVar.mo27091a() : ulhVar, (i2 & 8) != 0 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : d, (i2 & 16) != 0 ? 0 : i);
    }
}

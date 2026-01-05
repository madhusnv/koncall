package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes3.dex */
public final class t64 {

    /* renamed from: a */
    public final double f46486a;

    /* renamed from: b */
    public final double f46487b;

    /* renamed from: c */
    public final double f46488c;

    /* renamed from: d */
    public final double f46489d;

    public t64(double d, double d2, double d3, double d4) {
        this.f46486a = d;
        this.f46487b = d2;
        this.f46488c = d3;
        this.f46489d = d4;
    }

    /* renamed from: a */
    public double m49426a(double d) {
        return d <= -1.0d ? this.f46486a : d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? nza.m41316d(this.f46486a, this.f46487b, (d - (-1.0d)) / 1.0d) : d < 0.5d ? nza.m41316d(this.f46487b, this.f46488c, (d - FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) / 0.5d) : d < 1.0d ? nza.m41316d(this.f46488c, this.f46489d, (d - 0.5d) / 0.5d) : this.f46489d;
    }
}

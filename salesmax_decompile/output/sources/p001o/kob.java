package p001o;

import android.content.res.Configuration;

/* loaded from: classes2.dex */
public final class kob {

    /* renamed from: a */
    public final boolean f32506a;

    /* renamed from: b */
    public Configuration f32507b;

    public kob(boolean z) {
        this.f32506a = z;
    }

    /* renamed from: a */
    public final boolean m35984a() {
        return this.f32506a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kob(boolean z, Configuration configuration) {
        this(z);
        sq8.m48649h(configuration, "newConfig");
        this.f32507b = configuration;
    }
}

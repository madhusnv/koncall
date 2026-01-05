package p001o;

import android.content.res.Configuration;

/* loaded from: classes2.dex */
public final class s7d {

    /* renamed from: a */
    public final boolean f44904a;

    /* renamed from: b */
    public Configuration f44905b;

    public s7d(boolean z) {
        this.f44904a = z;
    }

    /* renamed from: a */
    public final boolean m47950a() {
        return this.f44904a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s7d(boolean z, Configuration configuration) {
        this(z);
        sq8.m48649h(configuration, "newConfig");
        this.f44905b = configuration;
    }
}

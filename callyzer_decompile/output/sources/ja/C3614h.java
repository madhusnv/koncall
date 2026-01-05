package ja;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.h */
/* loaded from: classes.dex */
public final class C3614h {

    /* renamed from: a */
    public final String f19248a;

    /* renamed from: b */
    public final String f19249b;

    /* renamed from: c */
    public final String f19250c;

    public C3614h(String str, String configPath, String credentialsPath) {
        AbstractC4154l.m8923f(configPath, "configPath");
        AbstractC4154l.m8923f(credentialsPath, "credentialsPath");
        this.f19248a = str;
        this.f19249b = configPath;
        this.f19250c = credentialsPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3614h)) {
            return false;
        }
        C3614h c3614h = (C3614h) obj;
        return AbstractC4154l.m8918a(this.f19248a, c3614h.f19248a) && AbstractC4154l.m8918a(this.f19249b, c3614h.f19249b) && AbstractC4154l.m8918a(this.f19250c, c3614h.f19250c);
    }

    public final int hashCode() {
        return this.f19250c.hashCode() + AbstractC0030c.m113d(this.f19248a.hashCode() * 31, 31, this.f19249b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AwsConfigurationSource(profile=");
        sb2.append(this.f19248a);
        sb2.append(", configPath=");
        sb2.append(this.f19249b);
        sb2.append(", credentialsPath=");
        return AbstractC0030c.m123n(sb2, this.f19250c, ')');
    }
}

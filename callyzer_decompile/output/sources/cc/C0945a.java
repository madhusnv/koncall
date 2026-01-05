package cc;

import a2.AbstractC0030c;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cc.a */
/* loaded from: classes.dex */
public final class C0945a {

    /* renamed from: a */
    public final String f5707a;

    /* renamed from: b */
    public final String f5708b;

    /* renamed from: c */
    public final String f5709c;

    /* renamed from: d */
    public final String f5710d;

    /* renamed from: e */
    public final boolean f5711e;

    public C0945a(String scheme, String authority, String str, String normalizedPath, boolean z6) {
        AbstractC4154l.m8923f(scheme, "scheme");
        AbstractC4154l.m8923f(authority, "authority");
        AbstractC4154l.m8923f(normalizedPath, "normalizedPath");
        this.f5707a = scheme;
        this.f5708b = authority;
        this.f5709c = str;
        this.f5710d = normalizedPath;
        this.f5711e = z6;
    }

    /* renamed from: a */
    public final String m2710a() {
        return this.f5708b;
    }

    /* renamed from: b */
    public final String m2711b() {
        return this.f5710d;
    }

    /* renamed from: c */
    public final String m2712c() {
        return this.f5709c;
    }

    /* renamed from: d */
    public final String m2713d() {
        return this.f5707a;
    }

    /* renamed from: e */
    public final boolean m2714e() {
        return this.f5711e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0945a)) {
            return false;
        }
        C0945a c0945a = (C0945a) obj;
        return AbstractC4154l.m8918a(this.f5707a, c0945a.f5707a) && AbstractC4154l.m8918a(this.f5708b, c0945a.f5708b) && AbstractC4154l.m8918a(this.f5709c, c0945a.f5709c) && AbstractC4154l.m8918a(this.f5710d, c0945a.f5710d) && this.f5711e == c0945a.f5711e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5711e) + AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(this.f5707a.hashCode() * 31, 31, this.f5708b), 31, this.f5709c), 31, this.f5710d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Url(scheme=");
        sb2.append(this.f5707a);
        sb2.append(", authority=");
        sb2.append(this.f5708b);
        sb2.append(", path=");
        sb2.append(this.f5709c);
        sb2.append(", normalizedPath=");
        sb2.append(this.f5710d);
        sb2.append(", isIp=");
        return m0.m7382o(sb2, this.f5711e, ')');
    }
}

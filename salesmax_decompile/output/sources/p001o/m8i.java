package p001o;

import org.apache.http.cookie.ClientCookie;

/* loaded from: classes3.dex */
public final class m8i {

    /* renamed from: a */
    public final String f34994a;

    /* renamed from: b */
    public final String f34995b;

    /* renamed from: c */
    public final String f34996c;

    /* renamed from: d */
    public final String f34997d;

    /* renamed from: e */
    public final boolean f34998e;

    public m8i(String str, String str2, String str3, String str4, boolean z) {
        sq8.m48649h(str, "scheme");
        sq8.m48649h(str2, "authority");
        sq8.m48649h(str3, ClientCookie.PATH_ATTR);
        sq8.m48649h(str4, "normalizedPath");
        this.f34994a = str;
        this.f34995b = str2;
        this.f34996c = str3;
        this.f34997d = str4;
        this.f34998e = z;
    }

    /* renamed from: a */
    public final String m38572a() {
        return this.f34995b;
    }

    /* renamed from: b */
    public final String m38573b() {
        return this.f34997d;
    }

    /* renamed from: c */
    public final String m38574c() {
        return this.f34996c;
    }

    /* renamed from: d */
    public final String m38575d() {
        return this.f34994a;
    }

    /* renamed from: e */
    public final boolean m38576e() {
        return this.f34998e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8i)) {
            return false;
        }
        m8i m8iVar = (m8i) obj;
        return sq8.m48644c(this.f34994a, m8iVar.f34994a) && sq8.m48644c(this.f34995b, m8iVar.f34995b) && sq8.m48644c(this.f34996c, m8iVar.f34996c) && sq8.m48644c(this.f34997d, m8iVar.f34997d) && this.f34998e == m8iVar.f34998e;
    }

    public int hashCode() {
        return (((((((this.f34994a.hashCode() * 31) + this.f34995b.hashCode()) * 31) + this.f34996c.hashCode()) * 31) + this.f34997d.hashCode()) * 31) + Boolean.hashCode(this.f34998e);
    }

    public String toString() {
        return "Url(scheme=" + this.f34994a + ", authority=" + this.f34995b + ", path=" + this.f34996c + ", normalizedPath=" + this.f34997d + ", isIp=" + this.f34998e + ')';
    }
}

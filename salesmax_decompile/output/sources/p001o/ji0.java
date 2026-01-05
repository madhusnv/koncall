package p001o;

import java.util.Locale;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class ji0 {

    /* renamed from: a */
    public final String f30471a;

    /* renamed from: b */
    public final String f30472b;

    public ji0(String str, String str2) {
        sq8.m48649h(str, "serviceId");
        sq8.m48649h(str2, ClientCookie.VERSION_ATTR);
        this.f30471a = str;
        this.f30472b = str2;
    }

    /* renamed from: a */
    public final String m33844a() {
        return this.f30472b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji0)) {
            return false;
        }
        ji0 ji0Var = (ji0) obj;
        return sq8.m48644c(this.f30471a, ji0Var.f30471a) && sq8.m48644c(this.f30472b, ji0Var.f30472b);
    }

    public int hashCode() {
        return (this.f30471a.hashCode() * 31) + this.f30472b.hashCode();
    }

    public String toString() {
        String lowerCase = e9g.m24593G(this.f30471a, " ", "-", false, 4, null).toLowerCase(Locale.ROOT);
        sq8.m48648g(lowerCase, "toLowerCase(...)");
        return i91.m31759d("api", lowerCase, this.f30472b);
    }
}

package p001o;

import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class s7f {

    /* renamed from: a */
    public final String f44906a;

    /* renamed from: b */
    public final String f44907b;

    public s7f(String str, String str2) {
        sq8.m48649h(str, "name");
        sq8.m48649h(str2, ClientCookie.VERSION_ATTR);
        this.f44906a = str;
        this.f44907b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7f)) {
            return false;
        }
        s7f s7fVar = (s7f) obj;
        return sq8.m48644c(this.f44906a, s7fVar.f44906a) && sq8.m48644c(this.f44907b, s7fVar.f44907b);
    }

    public int hashCode() {
        return (this.f44906a.hashCode() * 31) + this.f44907b.hashCode();
    }

    public String toString() {
        return i91.m31760e("aws-sdk-" + this.f44906a, this.f44907b, null, 4, null);
    }
}

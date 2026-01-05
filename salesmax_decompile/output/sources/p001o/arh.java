package p001o;

import java.util.Arrays;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class arh {

    /* renamed from: a */
    public final byte[] f15175a;

    /* renamed from: b */
    public final gk8 f15176b;

    public arh(byte[] bArr, gk8 gk8Var) {
        sq8.m48649h(bArr, "value");
        sq8.m48649h(gk8Var, ClientCookie.EXPIRES_ATTR);
        this.f15175a = bArr;
        this.f15176b = gk8Var;
    }

    /* renamed from: a */
    public final gk8 m17725a() {
        return this.f15176b;
    }

    /* renamed from: b */
    public final byte[] m17726b() {
        return this.f15175a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || arh.class != obj.getClass()) {
            return false;
        }
        arh arhVar = (arh) obj;
        return Arrays.equals(this.f15175a, arhVar.f15175a) && sq8.m48644c(this.f15176b, arhVar.f15176b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f15175a) * 31) + this.f15176b.hashCode();
    }

    public String toString() {
        return "Token(value=" + Arrays.toString(this.f15175a) + ", expires=" + this.f15176b + ')';
    }
}

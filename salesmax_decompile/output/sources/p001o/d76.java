package p001o;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class d76 {

    /* renamed from: a */
    public final n76 f19177a;

    /* renamed from: b */
    public final byte[] f19178b;

    public d76(n76 n76Var, byte[] bArr) {
        if (n76Var == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f19177a = n76Var;
        this.f19178b = bArr;
    }

    /* renamed from: a */
    public byte[] m22405a() {
        return this.f19178b;
    }

    /* renamed from: b */
    public n76 m22406b() {
        return this.f19177a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d76)) {
            return false;
        }
        d76 d76Var = (d76) obj;
        if (this.f19177a.equals(d76Var.f19177a)) {
            return Arrays.equals(this.f19178b, d76Var.f19178b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f19177a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19178b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f19177a + ", bytes=[...]}";
    }
}

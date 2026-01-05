package p001o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a91 {

    /* renamed from: a */
    public final Object f14304a;

    /* renamed from: b */
    public final byte[] f14305b;

    public a91(Object obj, byte[] bArr) {
        sq8.m48649h(bArr, "signature");
        this.f14304a = obj;
        this.f14305b = bArr;
    }

    /* renamed from: a */
    public final Object m16689a() {
        return this.f14304a;
    }

    /* renamed from: b */
    public final byte[] m16690b() {
        return this.f14305b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a91.class != obj.getClass()) {
            return false;
        }
        a91 a91Var = (a91) obj;
        return sq8.m48644c(this.f14304a, a91Var.f14304a) && Arrays.equals(this.f14305b, a91Var.f14305b);
    }

    public int hashCode() {
        Object obj = this.f14304a;
        return ((obj != null ? obj.hashCode() : 0) * 31) + Arrays.hashCode(this.f14305b);
    }

    public String toString() {
        return "AwsSigningResult(output=" + this.f14304a + ", signature=" + Arrays.toString(this.f14305b) + ')';
    }
}

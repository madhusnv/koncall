package p001o;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public final class coe implements ic9 {

    /* renamed from: j */
    public static final wma f18461j = new wma(50);

    /* renamed from: b */
    public final wo0 f18462b;

    /* renamed from: c */
    public final ic9 f18463c;

    /* renamed from: d */
    public final ic9 f18464d;

    /* renamed from: e */
    public final int f18465e;

    /* renamed from: f */
    public final int f18466f;

    /* renamed from: g */
    public final Class f18467g;

    /* renamed from: h */
    public final rec f18468h;

    /* renamed from: i */
    public final xuh f18469i;

    public coe(wo0 wo0Var, ic9 ic9Var, ic9 ic9Var2, int i, int i2, xuh xuhVar, Class cls, rec recVar) {
        this.f18462b = wo0Var;
        this.f18463c = ic9Var;
        this.f18464d = ic9Var2;
        this.f18465e = i;
        this.f18466f = i2;
        this.f18469i = xuhVar;
        this.f18467g = cls;
        this.f18468h = recVar;
    }

    @Override // p001o.ic9
    /* renamed from: a */
    public void mo19806a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f18462b.mo46965d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f18465e).putInt(this.f18466f).array();
        this.f18464d.mo19806a(messageDigest);
        this.f18463c.mo19806a(messageDigest);
        messageDigest.update(bArr);
        xuh xuhVar = this.f18469i;
        if (xuhVar != null) {
            xuhVar.mo19806a(messageDigest);
        }
        this.f18468h.mo19806a(messageDigest);
        messageDigest.update(m21557c());
        this.f18462b.mo46966e(bArr);
    }

    /* renamed from: c */
    public final byte[] m21557c() {
        wma wmaVar = f18461j;
        byte[] bArr = (byte[]) wmaVar.m54708g(this.f18467g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f18467g.getName().getBytes(ic9.f28450a);
        wmaVar.m54710k(this.f18467g, bytes);
        return bytes;
    }

    @Override // p001o.ic9
    public boolean equals(Object obj) {
        if (!(obj instanceof coe)) {
            return false;
        }
        coe coeVar = (coe) obj;
        return this.f18466f == coeVar.f18466f && this.f18465e == coeVar.f18465e && uqi.m51922c(this.f18469i, coeVar.f18469i) && this.f18467g.equals(coeVar.f18467g) && this.f18463c.equals(coeVar.f18463c) && this.f18464d.equals(coeVar.f18464d) && this.f18468h.equals(coeVar.f18468h);
    }

    @Override // p001o.ic9
    public int hashCode() {
        int iHashCode = (((((this.f18463c.hashCode() * 31) + this.f18464d.hashCode()) * 31) + this.f18465e) * 31) + this.f18466f;
        xuh xuhVar = this.f18469i;
        if (xuhVar != null) {
            iHashCode = (iHashCode * 31) + xuhVar.hashCode();
        }
        return (((iHashCode * 31) + this.f18467g.hashCode()) * 31) + this.f18468h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f18463c + ", signature=" + this.f18464d + ", width=" + this.f18465e + ", height=" + this.f18466f + ", decodedResourceClass=" + this.f18467g + ", transformation='" + this.f18469i + "', options=" + this.f18468h + '}';
    }
}

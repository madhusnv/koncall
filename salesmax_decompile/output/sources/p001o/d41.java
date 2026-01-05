package p001o;

import p001o.za2;

/* loaded from: classes2.dex */
public final class d41 extends za2.AbstractC18596b {

    /* renamed from: a */
    public final String f19080a;

    /* renamed from: b */
    public final cb8 f19081b;

    public d41(String str, cb8 cb8Var) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f19080a = str;
        if (cb8Var == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.f19081b = cb8Var;
    }

    @Override // p001o.za2.AbstractC18596b
    /* renamed from: b */
    public cb8 mo22315b() {
        return this.f19081b;
    }

    @Override // p001o.za2.AbstractC18596b
    /* renamed from: c */
    public String mo22316c() {
        return this.f19080a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof za2.AbstractC18596b)) {
            return false;
        }
        za2.AbstractC18596b abstractC18596b = (za2.AbstractC18596b) obj;
        return this.f19080a.equals(abstractC18596b.mo22316c()) && this.f19081b.equals(abstractC18596b.mo22315b());
    }

    public int hashCode() {
        return ((this.f19080a.hashCode() ^ 1000003) * 1000003) ^ this.f19081b.hashCode();
    }

    public String toString() {
        return "CameraId{cameraIdString=" + this.f19080a + ", cameraConfigId=" + this.f19081b + "}";
    }
}

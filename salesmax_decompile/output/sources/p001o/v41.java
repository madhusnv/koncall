package p001o;

import p001o.sca;
import p001o.za2;

/* loaded from: classes2.dex */
public final class v41 extends sca.AbstractC16807a {

    /* renamed from: a */
    public final xca f49837a;

    /* renamed from: b */
    public final za2.AbstractC18596b f49838b;

    public v41(xca xcaVar, za2.AbstractC18596b abstractC18596b) {
        if (xcaVar == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f49837a = xcaVar;
        if (abstractC18596b == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f49838b = abstractC18596b;
    }

    @Override // p001o.sca.AbstractC16807a
    /* renamed from: b */
    public za2.AbstractC18596b mo48203b() {
        return this.f49838b;
    }

    @Override // p001o.sca.AbstractC16807a
    /* renamed from: c */
    public xca mo48204c() {
        return this.f49837a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sca.AbstractC16807a)) {
            return false;
        }
        sca.AbstractC16807a abstractC16807a = (sca.AbstractC16807a) obj;
        return this.f49837a.equals(abstractC16807a.mo48204c()) && this.f49838b.equals(abstractC16807a.mo48203b());
    }

    public int hashCode() {
        return ((this.f49837a.hashCode() ^ 1000003) * 1000003) ^ this.f49838b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f49837a + ", cameraId=" + this.f49838b + "}";
    }
}

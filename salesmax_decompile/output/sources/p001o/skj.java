package p001o;

/* loaded from: classes3.dex */
public final class skj extends en0 {

    /* renamed from: a */
    public final int f45534a;

    /* renamed from: b */
    public final boolean f45535b;

    public /* synthetic */ skj(int i, boolean z, qkj qkjVar) {
        this.f45534a = i;
        this.f45535b = z;
    }

    @Override // p001o.en0
    /* renamed from: a */
    public final boolean mo25344a() {
        return this.f45535b;
    }

    @Override // p001o.en0
    /* renamed from: b */
    public final int mo25345b() {
        return this.f45534a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof en0) {
            en0 en0Var = (en0) obj;
            if (this.f45534a == en0Var.mo25345b() && this.f45535b == en0Var.mo25344a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45534a ^ 1000003) * 1000003) ^ (true != this.f45535b ? 1237 : 1231);
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.f45534a + ", allowAssetPackDeletion=" + this.f45535b + "}";
    }
}

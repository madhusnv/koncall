package we;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: we.o */
/* loaded from: classes.dex */
public final class C8013o extends a0 {

    /* renamed from: a */
    public final C8016r f38517a;

    /* renamed from: b */
    public final EnumC8024z f38518b;

    public C8013o(C8016r c8016r, EnumC8024z enumC8024z) {
        this.f38517a = c8016r;
        this.f38518b = enumC8024z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!this.f38517a.equals(((C8013o) a0Var).f38517a)) {
            return false;
        }
        EnumC8024z enumC8024z = this.f38518b;
        return enumC8024z == null ? ((C8013o) a0Var).f38518b == null : enumC8024z.equals(((C8013o) a0Var).f38518b);
    }

    public final int hashCode() {
        int iHashCode = (this.f38517a.hashCode() ^ 1000003) * 1000003;
        EnumC8024z enumC8024z = this.f38518b;
        return iHashCode ^ (enumC8024z == null ? 0 : enumC8024z.hashCode());
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f38517a + ", productIdOrigin=" + this.f38518b + "}";
    }
}

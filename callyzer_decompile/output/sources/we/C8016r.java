package we;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: we.r */
/* loaded from: classes.dex */
public final class C8016r extends d0 {

    /* renamed from: a */
    public final C8015q f38522a;

    public C8016r(C8015q c8015q) {
        this.f38522a = c8015q;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return this.f38522a.equals(((C8016r) ((d0) obj)).f38522a);
    }

    public final int hashCode() {
        return this.f38522a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f38522a + "}";
    }
}

package we;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: we.q */
/* loaded from: classes.dex */
public final class C8015q extends c0 {

    /* renamed from: a */
    public final Integer f38521a;

    public C8015q(Integer num) {
        this.f38521a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        Integer num = this.f38521a;
        C8015q c8015q = (C8015q) ((c0) obj);
        return num == null ? c8015q.f38521a == null : num.equals(c8015q.f38521a);
    }

    public final int hashCode() {
        Integer num = this.f38521a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f38521a + "}";
    }
}

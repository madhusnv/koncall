package sq;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class w2 extends z2 {

    /* renamed from: a */
    public final RuntimeException f33342a;

    public w2(RuntimeException runtimeException) {
        this.f33342a = runtimeException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2) && this.f33342a.equals(((w2) obj).f33342a);
    }

    public final int hashCode() {
        return this.f33342a.hashCode();
    }

    public final String toString() {
        return "FolderErrorException(ex=" + this.f33342a + ")";
    }
}

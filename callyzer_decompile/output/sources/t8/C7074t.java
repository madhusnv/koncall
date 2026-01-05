package t8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.t */
/* loaded from: classes.dex */
public final class C7074t extends AbstractC7075u {

    /* renamed from: a */
    public final C7064j f34171a;

    public C7074t(C7064j c7064j) {
        this.f34171a = c7064j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7074t.class != obj.getClass()) {
            return false;
        }
        return this.f34171a.equals(((C7074t) obj).f34171a);
    }

    public final int hashCode() {
        return this.f34171a.hashCode() + (C7074t.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f34171a + '}';
    }
}

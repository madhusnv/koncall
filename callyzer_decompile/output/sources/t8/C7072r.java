package t8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.r */
/* loaded from: classes.dex */
public final class C7072r extends AbstractC7075u {

    /* renamed from: a */
    public final C7064j f34170a;

    public C7072r(C7064j c7064j) {
        this.f34170a = c7064j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7072r.class != obj.getClass()) {
            return false;
        }
        return this.f34170a.equals(((C7072r) obj).f34170a);
    }

    public final int hashCode() {
        return this.f34170a.hashCode() + (C7072r.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f34170a + '}';
    }

    public C7072r() {
        this(C7064j.f34159b);
    }
}

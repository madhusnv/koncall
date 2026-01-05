package qi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qi.j */
/* loaded from: classes.dex */
public final class C6227j {

    /* renamed from: a */
    public final C6234q f30236a;

    /* renamed from: b */
    public final boolean f30237b;

    public C6227j(C6234q c6234q, boolean z6) {
        this.f30236a = c6234q;
        this.f30237b = z6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6227j) {
            C6227j c6227j = (C6227j) obj;
            if (c6227j.f30236a.equals(this.f30236a) && c6227j.f30237b == this.f30237b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f30236a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f30237b).hashCode();
    }
}

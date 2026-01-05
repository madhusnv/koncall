package iu;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iu.g */
/* loaded from: classes3.dex */
public final class C3355g {

    /* renamed from: a */
    public final String f17736a;

    /* renamed from: b */
    public final boolean f17737b;

    public C3355g(String str, boolean z6) {
        this.f17736a = str;
        this.f17737b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3355g)) {
            return false;
        }
        C3355g c3355g = (C3355g) obj;
        return this.f17736a.equals(c3355g.f17736a) && this.f17737b == c3355g.f17737b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17737b) + (this.f17736a.hashCode() * 31);
    }

    public final String toString() {
        return "ReSyncDownloadState(msg=" + this.f17736a + ", canStartProcess=" + this.f17737b + ")";
    }
}

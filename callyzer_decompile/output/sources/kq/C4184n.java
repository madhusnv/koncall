package kq;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kq.n */
/* loaded from: classes3.dex */
public final class C4184n {

    /* renamed from: a */
    public final boolean f21221a;

    /* renamed from: b */
    public final int f21222b;

    public C4184n(boolean z6, int i10) {
        this.f21221a = z6;
        this.f21222b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4184n)) {
            return false;
        }
        C4184n c4184n = (C4184n) obj;
        return this.f21221a == c4184n.f21221a && this.f21222b == c4184n.f21222b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21222b) + (Boolean.hashCode(this.f21221a) * 31);
    }

    public final String toString() {
        return "DownloadDialogState(isDialogShowing=" + this.f21221a + ", showingForWhichId=" + this.f21222b + ")";
    }
}

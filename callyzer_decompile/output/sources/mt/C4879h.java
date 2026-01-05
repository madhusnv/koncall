package mt;

import og.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mt.h */
/* loaded from: classes3.dex */
public final class C4879h extends c1 {

    /* renamed from: a */
    public final boolean f24391a;

    /* renamed from: b */
    public final boolean f24392b;

    public C4879h(boolean z6, boolean z10) {
        this.f24391a = z6;
        this.f24392b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4879h)) {
            return false;
        }
        C4879h c4879h = (C4879h) obj;
        return this.f24391a == c4879h.f24391a && this.f24392b == c4879h.f24392b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24392b) + (Boolean.hashCode(this.f24391a) * 31);
    }

    public final String toString() {
        return "SendFileConfirmation(cancel=" + this.f24391a + ", okay=" + this.f24392b + ")";
    }
}

package dr;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.z */
/* loaded from: classes3.dex */
public final class C1776z extends b0 {

    /* renamed from: a */
    public final int f8644a;

    public C1776z(int i10) {
        this.f8644a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1776z) && this.f8644a == ((C1776z) obj).f8644a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8644a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f8644a, "NotePopupClick(id=", ")");
    }
}

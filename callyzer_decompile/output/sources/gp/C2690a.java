package gp;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gp.a */
/* loaded from: classes3.dex */
public final class C2690a extends AbstractC2692c {

    /* renamed from: a */
    public final int f15027a;

    public C2690a(int i10) {
        this.f15027a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2690a) && this.f15027a == ((C2690a) obj).f15027a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15027a);
    }

    public final String toString() {
        return AbstractC5601a.m11232c(this.f15027a, "NotePopupClick(id=", ")");
    }
}

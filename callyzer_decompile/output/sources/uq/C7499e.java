package uq;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uq.e */
/* loaded from: classes3.dex */
public final class C7499e extends AbstractC7507m {

    /* renamed from: a */
    public final ArrayList f36191a;

    public C7499e(ArrayList arrayList) {
        this.f36191a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7499e) && this.f36191a.equals(((C7499e) obj).f36191a);
    }

    public final int hashCode() {
        return this.f36191a.hashCode();
    }

    public final String toString() {
        return "OnCancelSelection(selection=" + this.f36191a + ")";
    }
}

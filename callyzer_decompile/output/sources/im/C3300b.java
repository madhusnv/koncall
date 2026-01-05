package im;

import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.b */
/* loaded from: classes3.dex */
public final class C3300b {

    /* renamed from: a */
    public final ArrayList f17537a;

    public C3300b(ArrayList arrayList) {
        this.f17537a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3300b) && this.f17537a.equals(((C3300b) obj).f17537a);
    }

    public final int hashCode() {
        return this.f17537a.hashCode();
    }

    public final String toString() {
        return "CSVTableData(csvRows=" + this.f17537a + ")";
    }
}

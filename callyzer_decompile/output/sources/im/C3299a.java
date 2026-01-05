package im;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.a */
/* loaded from: classes3.dex */
public final class C3299a {

    /* renamed from: a */
    public final List f17534a;

    public C3299a(List list) {
        this.f17534a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3299a) && AbstractC4154l.m8918a(this.f17534a, ((C3299a) obj).f17534a);
    }

    public final int hashCode() {
        return this.f17534a.hashCode();
    }

    public final String toString() {
        return i0.m0.m7380m("CSVRow(rowData=", ")", this.f17534a);
    }
}

package rt;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import qm.C6246b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rt.e */
/* loaded from: classes3.dex */
public final class C6621e {

    /* renamed from: a */
    public final C6246b f31806a;

    /* renamed from: b */
    public final ArrayList f31807b;

    /* renamed from: c */
    public final List f31808c;

    /* renamed from: d */
    public final ArrayList f31809d;

    public C6621e(C6246b c6246b, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f31806a = c6246b;
        this.f31807b = arrayList;
        this.f31808c = arrayList2;
        this.f31809d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6621e)) {
            return false;
        }
        C6621e c6621e = (C6621e) obj;
        return this.f31806a.equals(c6621e.f31806a) && this.f31807b.equals(c6621e.f31807b) && AbstractC4154l.m8918a(this.f31808c, c6621e.f31808c) && this.f31809d.equals(c6621e.f31809d);
    }

    public final int hashCode() {
        int iHashCode = (this.f31807b.hashCode() + (this.f31806a.hashCode() * 31)) * 31;
        List list = this.f31808c;
        return this.f31809d.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "MessageTemplateUpsertData(template=" + this.f31806a + ", subTemplatesWithFields=" + this.f31807b + ", documents=" + this.f31808c + ", tags=" + this.f31809d + ")";
    }
}

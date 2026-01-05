package br;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: br.e */
/* loaded from: classes3.dex */
public final class C0742e {

    /* renamed from: a */
    public final List f4690a;

    public C0742e(List totalCallsList) {
        AbstractC4154l.m8923f(totalCallsList, "totalCallsList");
        this.f4690a = totalCallsList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0742e) && AbstractC4154l.m8918a(this.f4690a, ((C0742e) obj).f4690a);
    }

    public final int hashCode() {
        return this.f4690a.hashCode();
    }

    public final String toString() {
        return m0.m7380m("SummaryContactDetailState(totalCallsList=", ")", this.f4690a);
    }
}

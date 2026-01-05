package cs;

import js.C3850f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cs.l */
/* loaded from: classes3.dex */
public final class C1493l extends AbstractC1500s {

    /* renamed from: a */
    public final C3850f f7574a;

    public C1493l(C3850f leadUI) {
        AbstractC4154l.m8923f(leadUI, "leadUI");
        this.f7574a = leadUI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1493l) && AbstractC4154l.m8918a(this.f7574a, ((C1493l) obj).f7574a);
    }

    public final int hashCode() {
        return this.f7574a.hashCode();
    }

    public final String toString() {
        return "EditLead(leadUI=" + this.f7574a + ")";
    }
}

package yr;

import kotlin.jvm.internal.AbstractC4154l;
import mm.C4800k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.f */
/* loaded from: classes3.dex */
public final class C8747f extends AbstractC8761t {

    /* renamed from: a */
    public final C4800k f42360a;

    public C8747f(C4800k leadStatus) {
        AbstractC4154l.m8923f(leadStatus, "leadStatus");
        this.f42360a = leadStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8747f) && AbstractC4154l.m8918a(this.f42360a, ((C8747f) obj).f42360a);
    }

    public final int hashCode() {
        return this.f42360a.hashCode();
    }

    public final String toString() {
        return "ChangeLeadStatus(leadStatus=" + this.f42360a + ")";
    }
}

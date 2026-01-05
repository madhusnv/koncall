package pm;

import kotlin.jvm.internal.AbstractC4154l;
import om.C5405g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pm.a */
/* loaded from: classes3.dex */
public final class C5974a {

    /* renamed from: a */
    public final C5405g f29217a;

    /* renamed from: b */
    public final Integer f29218b;

    public C5974a(C5405g c5405g, Integer num) {
        this.f29217a = c5405g;
        this.f29218b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5974a)) {
            return false;
        }
        C5974a c5974a = (C5974a) obj;
        return AbstractC4154l.m8918a(this.f29217a, c5974a.f29217a) && AbstractC4154l.m8918a(this.f29218b, c5974a.f29218b);
    }

    public final int hashCode() {
        int iHashCode = this.f29217a.hashCode() * 31;
        Integer num = this.f29218b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CallNoteTemplateWithSimSlot(callNoteTemplate=" + this.f29217a + ", slot=" + this.f29218b + ")";
    }
}

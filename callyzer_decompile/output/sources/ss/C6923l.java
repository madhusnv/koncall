package ss;

import kotlin.jvm.internal.AbstractC4154l;
import ts.EnumC7215b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ss.l */
/* loaded from: classes3.dex */
public final class C6923l extends a0 {

    /* renamed from: a */
    public final EnumC7215b f33455a;

    public C6923l(EnumC7215b type) {
        AbstractC4154l.m8923f(type, "type");
        this.f33455a = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6923l) && this.f33455a == ((C6923l) obj).f33455a;
    }

    public final int hashCode() {
        return this.f33455a.hashCode();
    }

    public final String toString() {
        return "OnDismissDialog(type=" + this.f33455a + ")";
    }
}

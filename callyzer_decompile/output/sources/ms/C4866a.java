package ms;

import kotlin.jvm.internal.AbstractC4154l;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ms.a */
/* loaded from: classes3.dex */
public final class C4866a extends AbstractC4871f {

    /* renamed from: a */
    public final EnumC7204p f24375a;

    public C4866a(EnumC7204p simSelectionMode) {
        AbstractC4154l.m8923f(simSelectionMode, "simSelectionMode");
        this.f24375a = simSelectionMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4866a) && this.f24375a == ((C4866a) obj).f24375a;
    }

    public final int hashCode() {
        return this.f24375a.hashCode();
    }

    public final String toString() {
        return "ChangeSIMSelectionMode(simSelectionMode=" + this.f24375a + ")";
    }
}

package zs;

import kotlin.jvm.internal.AbstractC4154l;
import pg.ma;
import tq.EnumC7204p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zs.l */
/* loaded from: classes3.dex */
public final class C9047l extends ma {

    /* renamed from: b */
    public final EnumC7204p f43556b;

    public C9047l(EnumC7204p simSelection) {
        AbstractC4154l.m8923f(simSelection, "simSelection");
        this.f43556b = simSelection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9047l) && this.f43556b == ((C9047l) obj).f43556b;
    }

    public final int hashCode() {
        return this.f43556b.hashCode();
    }

    public final String toString() {
        return "UpdateSimSelectionMode(simSelection=" + this.f43556b + ")";
    }
}

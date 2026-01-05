package ws;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ws.h */
/* loaded from: classes3.dex */
public final class C8167h extends AbstractC8175p {

    /* renamed from: a */
    public final C8176q f39090a;

    public C8167h(C8176q callLogUIModel) {
        AbstractC4154l.m8923f(callLogUIModel, "callLogUIModel");
        this.f39090a = callLogUIModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8167h) && AbstractC4154l.m8918a(this.f39090a, ((C8167h) obj).f39090a);
    }

    public final int hashCode() {
        return this.f39090a.hashCode();
    }

    public final String toString() {
        return "SelectedCorrupt(callLogUIModel=" + this.f39090a + ")";
    }
}

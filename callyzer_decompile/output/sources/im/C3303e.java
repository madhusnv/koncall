package im;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.e */
/* loaded from: classes3.dex */
public final class C3303e implements InterfaceC3307i {

    /* renamed from: a */
    public final List f17546a;

    public C3303e(List callLogData) {
        AbstractC4154l.m8923f(callLogData, "callLogData");
        this.f17546a = callLogData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3303e) && AbstractC4154l.m8918a(this.f17546a, ((C3303e) obj).f17546a);
    }

    public final int hashCode() {
        return this.f17546a.hashCode();
    }

    public final String toString() {
        return i0.m0.m7380m("DeletedCallLog(callLogData=", ")", this.f17546a);
    }
}

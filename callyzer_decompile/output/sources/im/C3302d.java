package im;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.d */
/* loaded from: classes3.dex */
public final class C3302d implements InterfaceC3307i {

    /* renamed from: a */
    public final List f17543a;

    public C3302d(List listCallLogId) {
        AbstractC4154l.m8923f(listCallLogId, "listCallLogId");
        this.f17543a = listCallLogId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3302d) && AbstractC4154l.m8918a(this.f17543a, ((C3302d) obj).f17543a);
    }

    public final int hashCode() {
        return this.f17543a.hashCode();
    }

    public final String toString() {
        return i0.m0.m7380m("CallRecordingSync(listCallLogId=", ")", this.f17543a);
    }
}

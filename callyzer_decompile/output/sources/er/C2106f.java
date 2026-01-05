package er;

import kotlin.jvm.internal.AbstractC4154l;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.f */
/* loaded from: classes3.dex */
public final class C2106f extends AbstractC2111k {

    /* renamed from: a */
    public final InterfaceC8209j f9859a;

    public C2106f(InterfaceC8209j refreshChannel) {
        AbstractC4154l.m8923f(refreshChannel, "refreshChannel");
        this.f9859a = refreshChannel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2106f) && AbstractC4154l.m8918a(this.f9859a, ((C2106f) obj).f9859a);
    }

    public final int hashCode() {
        return this.f9859a.hashCode();
    }

    public final String toString() {
        return "ReceiveRefreshStateChannel(refreshChannel=" + this.f9859a + ")";
    }
}

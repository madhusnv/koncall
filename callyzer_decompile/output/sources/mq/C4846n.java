package mq;

import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.n */
/* loaded from: classes3.dex */
public final class C4846n extends AbstractC4854v {

    /* renamed from: a */
    public final C6361k f24304a;

    public C4846n(C6361k c6361k) {
        this.f24304a = c6361k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4846n) && AbstractC4154l.m8918a(this.f24304a, ((C4846n) obj).f24304a);
    }

    public final int hashCode() {
        C6361k c6361k = this.f24304a;
        if (c6361k == null) {
            return 0;
        }
        return c6361k.hashCode();
    }

    public final String toString() {
        return "OnRecordingPlaySelected(idAndSource=" + this.f24304a + ")";
    }
}

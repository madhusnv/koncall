package jp;

import kotlin.jvm.internal.AbstractC4154l;
import rt.C6617a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jp.g */
/* loaded from: classes3.dex */
public final class C3826g extends AbstractC3828i {

    /* renamed from: a */
    public final C6617a f19778a;

    public C3826g(C6617a c6617a) {
        this.f19778a = c6617a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3826g) && AbstractC4154l.m8918a(this.f19778a, ((C3826g) obj).f19778a);
    }

    public final int hashCode() {
        C6617a c6617a = this.f19778a;
        if (c6617a == null) {
            return 0;
        }
        return c6617a.hashCode();
    }

    public final String toString() {
        return "SetCallLogData(callLogData=" + this.f19778a + ")";
    }
}

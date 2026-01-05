package jp;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jp.b */
/* loaded from: classes3.dex */
public final class C3821b extends AbstractC3828i {

    /* renamed from: a */
    public final boolean f19773a;

    public C3821b(boolean z6) {
        this.f19773a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3821b) && this.f19773a == ((C3821b) obj).f19773a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19773a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("IdentifyScreen(isNeverAttendScreen=", ")", this.f19773a);
    }
}

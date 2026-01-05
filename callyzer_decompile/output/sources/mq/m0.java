package mq;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m0 extends s0 {

    /* renamed from: a */
    public final boolean f24303a;

    public m0(boolean z6) {
        this.f24303a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && this.f24303a == ((m0) obj).f24303a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24303a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("ExcludeNumberSelectionChanged(isSelect=", ")", this.f24303a);
    }
}

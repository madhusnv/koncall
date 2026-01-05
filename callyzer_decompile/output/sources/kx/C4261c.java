package kx;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kx.c */
/* loaded from: classes3.dex */
public final class C4261c extends AbstractC4259a {
    static {
        new C4261c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4261c)) {
            return false;
        }
        if (isEmpty() && ((C4261c) obj).isEmpty()) {
            return true;
        }
        C4261c c4261c = (C4261c) obj;
        return this.f21637a == c4261c.f21637a && this.f21638b == c4261c.f21638b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f21637a * 31) + this.f21638b;
    }

    public final boolean isEmpty() {
        return AbstractC4154l.m8924g(this.f21637a, this.f21638b) > 0;
    }

    public final String toString() {
        return this.f21637a + ".." + this.f21638b;
    }
}

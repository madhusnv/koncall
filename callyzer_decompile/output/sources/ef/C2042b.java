package ef;

import xe.C8356h;
import xe.C8357i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ef.b */
/* loaded from: classes.dex */
public final class C2042b {

    /* renamed from: a */
    public final long f9613a;

    /* renamed from: b */
    public final C8357i f9614b;

    /* renamed from: c */
    public final C8356h f9615c;

    public C2042b(long j6, C8357i c8357i, C8356h c8356h) {
        this.f9613a = j6;
        this.f9614b = c8357i;
        this.f9615c = c8356h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2042b) {
            C2042b c2042b = (C2042b) obj;
            if (this.f9613a == c2042b.f9613a && this.f9614b.equals(c2042b.f9614b) && this.f9615c.equals(c2042b.f9615c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f9613a;
        return ((((((int) ((j6 >>> 32) ^ j6)) ^ 1000003) * 1000003) ^ this.f9614b.hashCode()) * 1000003) ^ this.f9615c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f9613a + ", transportContext=" + this.f9614b + ", event=" + this.f9615c + "}";
    }
}

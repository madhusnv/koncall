package p022x;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.m */
/* loaded from: classes.dex */
public final class C8243m {

    /* renamed from: a */
    public final OutputConfiguration f39386a;

    /* renamed from: b */
    public long f39387b = 1;

    public C8243m(OutputConfiguration outputConfiguration) {
        this.f39386a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8243m)) {
            return false;
        }
        C8243m c8243m = (C8243m) obj;
        return Objects.equals(this.f39386a, c8243m.f39386a) && this.f39387b == c8243m.f39387b;
    }

    public final int hashCode() {
        int iHashCode = this.f39386a.hashCode() ^ 31;
        return Long.hashCode(this.f39387b) ^ ((iHashCode << 5) - iHashCode);
    }
}

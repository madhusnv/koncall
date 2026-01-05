package p022x;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.k */
/* loaded from: classes.dex */
public final class C8241k {

    /* renamed from: a */
    public final OutputConfiguration f39383a;

    /* renamed from: b */
    public String f39384b;

    /* renamed from: c */
    public long f39385c = 1;

    public C8241k(OutputConfiguration outputConfiguration) {
        this.f39383a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8241k)) {
            return false;
        }
        C8241k c8241k = (C8241k) obj;
        return Objects.equals(this.f39383a, c8241k.f39383a) && this.f39385c == c8241k.f39385c && Objects.equals(this.f39384b, c8241k.f39384b);
    }

    public final int hashCode() {
        int iHashCode = this.f39383a.hashCode() ^ 31;
        int i10 = (iHashCode << 5) - iHashCode;
        String str = this.f39384b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
        return Long.hashCode(this.f39385c) ^ ((iHashCode2 << 5) - iHashCode2);
    }
}

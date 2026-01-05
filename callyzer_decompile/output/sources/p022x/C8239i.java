package p022x;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.i */
/* loaded from: classes.dex */
public final class C8239i {

    /* renamed from: a */
    public final OutputConfiguration f39378a;

    /* renamed from: b */
    public String f39379b;

    /* renamed from: c */
    public boolean f39380c;

    /* renamed from: d */
    public long f39381d = 1;

    public C8239i(OutputConfiguration outputConfiguration) {
        this.f39378a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8239i)) {
            return false;
        }
        C8239i c8239i = (C8239i) obj;
        return this.f39378a.equals(c8239i.f39378a) && this.f39380c == c8239i.f39380c && this.f39381d == c8239i.f39381d && Objects.equals(this.f39379b, c8239i.f39379b);
    }

    public final int hashCode() {
        int iHashCode = this.f39378a.hashCode() ^ 31;
        int i10 = (this.f39380c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
        int i11 = (i10 << 5) - i10;
        String str = this.f39379b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i11;
        return Long.hashCode(this.f39381d) ^ ((iHashCode2 << 5) - iHashCode2);
    }
}

package p022x;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.h */
/* loaded from: classes.dex */
public final class C8238h {

    /* renamed from: a */
    public final C8240j f39377a;

    public C8238h(int i10, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.f39377a = new C8245o(new OutputConfiguration(i10, surface));
            return;
        }
        if (i11 >= 28) {
            this.f39377a = new C8244n(new C8243m(new OutputConfiguration(i10, surface)));
        } else if (i11 >= 26) {
            this.f39377a = new C8242l(new C8241k(new OutputConfiguration(i10, surface)));
        } else {
            this.f39377a = new C8240j(new C8239i(new OutputConfiguration(i10, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8238h)) {
            return false;
        }
        return this.f39377a.equals(((C8238h) obj).f39377a);
    }

    public final int hashCode() {
        return this.f39377a.f39382a.hashCode();
    }

    public C8238h(C8240j c8240j) {
        this.f39377a = c8240j;
    }
}

package p022x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.l */
/* loaded from: classes.dex */
public class C8242l extends C8240j {
    @Override // p022x.C8240j
    /* renamed from: a */
    public final void mo15411a(Surface surface) {
        ((OutputConfiguration) mo15413c()).addSurface(surface);
    }

    @Override // p022x.C8240j
    /* renamed from: b */
    public final void mo15412b() {
        ((OutputConfiguration) mo15413c()).enableSurfaceSharing();
    }

    @Override // p022x.C8240j
    /* renamed from: c */
    public Object mo15413c() {
        Object obj = this.f39382a;
        y0.m11052b(obj instanceof C8241k);
        return ((C8241k) obj).f39383a;
    }

    @Override // p022x.C8240j
    /* renamed from: d */
    public String mo15414d() {
        return ((C8241k) this.f39382a).f39384b;
    }

    @Override // p022x.C8240j
    /* renamed from: f */
    public final boolean mo15416f() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // p022x.C8240j
    /* renamed from: g */
    public void mo15417g(long j6) {
        ((C8241k) this.f39382a).f39385c = j6;
    }

    @Override // p022x.C8240j
    /* renamed from: i */
    public void mo15419i(String str) {
        ((C8241k) this.f39382a).f39384b = str;
    }
}

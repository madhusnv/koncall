package p022x;

import android.hardware.camera2.params.OutputConfiguration;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.n */
/* loaded from: classes.dex */
public class C8244n extends C8242l {
    @Override // p022x.C8242l, p022x.C8240j
    /* renamed from: c */
    public Object mo15413c() {
        Object obj = this.f39382a;
        y0.m11052b(obj instanceof C8243m);
        return ((C8243m) obj).f39386a;
    }

    @Override // p022x.C8242l, p022x.C8240j
    /* renamed from: d */
    public final String mo15414d() {
        return null;
    }

    @Override // p022x.C8242l, p022x.C8240j
    /* renamed from: g */
    public void mo15417g(long j6) {
        ((C8243m) this.f39382a).f39387b = j6;
    }

    @Override // p022x.C8242l, p022x.C8240j
    /* renamed from: i */
    public final void mo15419i(String str) {
        ((OutputConfiguration) mo15413c()).setPhysicalCameraId(str);
    }
}

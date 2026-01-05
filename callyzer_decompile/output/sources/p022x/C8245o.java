package p022x;

import android.hardware.camera2.params.OutputConfiguration;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.o */
/* loaded from: classes.dex */
public final class C8245o extends C8244n {
    @Override // p022x.C8244n, p022x.C8242l, p022x.C8240j
    /* renamed from: c */
    public final Object mo15413c() {
        Object obj = this.f39382a;
        y0.m11052b(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // p022x.C8244n, p022x.C8242l, p022x.C8240j
    /* renamed from: g */
    public final void mo15417g(long j6) {
        ((OutputConfiguration) mo15413c()).setDynamicRangeProfile(j6);
    }

    @Override // p022x.C8240j
    /* renamed from: h */
    public final void mo15418h(int i10) {
        ((OutputConfiguration) mo15413c()).setMirrorMode(i10);
    }

    @Override // p022x.C8240j
    /* renamed from: j */
    public final void mo15420j(long j6) {
        if (j6 == -1) {
            return;
        }
        ((OutputConfiguration) mo15413c()).setStreamUseCase(j6);
    }
}

package p020v;

import a1.c0;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import d7.g0;
import p021w.C7843i;
import pg.i9;
import x4.C8299i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a */
    public final C7599i f36609a;

    /* renamed from: b */
    public final g0 f36610b;

    /* renamed from: c */
    public final g0 f36611c;

    /* renamed from: d */
    public boolean f36612d;

    /* renamed from: e */
    public final int f36613e;

    /* renamed from: f */
    public C8299i f36614f;

    /* renamed from: g */
    public boolean f36615g;

    public j1(C7599i c7599i, C7843i c7843i) {
        this.f36609a = c7599i;
        int iM14824b = (i9.m11700b(new c0(29, c7843i)) && c7843i.m14827e()) ? c7843i.m14824b() : 0;
        this.f36613e = iM14824b;
        this.f36610b = new g0(0);
        this.f36611c = new g0(Integer.valueOf(iM14824b));
        c7599i.m14393h(new InterfaceC7598h() { // from class: v.i1
            @Override // p020v.InterfaceC7598h
            /* renamed from: a */
            public final boolean mo14373a(TotalCaptureResult totalCaptureResult) {
                j1 j1Var = this.f36594a;
                if (j1Var.f36614f == null) {
                    return false;
                }
                Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                if ((num != null && num.intValue() == 2) != j1Var.f36615g) {
                    return false;
                }
                j1Var.f36614f.m15507b(null);
                j1Var.f36614f = null;
                return false;
            }
        });
    }
}

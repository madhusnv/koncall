package c0;

import androidx.camera.core.ImageProcessingUtil;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements c0 {

    /* renamed from: a */
    public final /* synthetic */ int f5256a;

    /* renamed from: b */
    public final /* synthetic */ b1 f5257b;

    public /* synthetic */ x0(b1 b1Var, b1 b1Var2, int i10) {
        this.f5256a = i10;
        this.f5257b = b1Var2;
    }

    @Override // c0.c0
    /* renamed from: c */
    public final void mo2178c(d0 d0Var) throws Exception {
        int i10 = this.f5256a;
        b1 b1Var = this.f5257b;
        switch (i10) {
            case 0:
                int i11 = ImageProcessingUtil.f1851a;
                if (b1Var != null) {
                    b1Var.close();
                    break;
                }
                break;
            default:
                int i12 = ImageProcessingUtil.f1851a;
                b1Var.close();
                break;
        }
    }
}

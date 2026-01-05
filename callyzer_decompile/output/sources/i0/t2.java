package i0;

import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a */
    public final g2 f16585a;

    /* renamed from: b */
    public final w2 f16586b;

    /* renamed from: c */
    public final C3082m f16587c;

    /* renamed from: d */
    public final List f16588d;

    /* renamed from: e */
    public boolean f16589e = false;

    /* renamed from: f */
    public boolean f16590f = false;

    public t2(g2 g2Var, w2 w2Var, C3082m c3082m, List list) {
        this.f16585a = g2Var;
        this.f16586b = w2Var;
        this.f16587c = c3082m;
        this.f16588d = list;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
        sb2.append(this.f16585a);
        sb2.append(", mUseCaseConfig=");
        sb2.append(this.f16586b);
        sb2.append(", mStreamSpec=");
        sb2.append(this.f16587c);
        sb2.append(", mCaptureTypes=");
        sb2.append(this.f16588d);
        sb2.append(", mAttached=");
        sb2.append(this.f16589e);
        sb2.append(", mActive=");
        return m0.m7382o(sb2, this.f16590f, '}');
    }
}

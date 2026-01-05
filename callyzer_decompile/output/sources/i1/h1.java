package i1;

import android.widget.Magnifier;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class h1 implements f1 {

    /* renamed from: a */
    public final Magnifier f16880a;

    public h1(Magnifier magnifier) {
        this.f16880a = magnifier;
    }

    @Override // i1.f1
    /* renamed from: a */
    public void mo7496a(long j6, long j10) {
        this.f16880a.show(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)));
    }

    /* renamed from: b */
    public final void m7508b() {
        this.f16880a.dismiss();
    }

    /* renamed from: c */
    public final long m7509c() {
        return (this.f16880a.getHeight() & 4294967295L) | (this.f16880a.getWidth() << 32);
    }

    /* renamed from: d */
    public final void m7510d() {
        this.f16880a.update();
    }
}

package mh;

import android.graphics.Typeface;
import og.z0;
import t5.AbstractC7044b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mh.b */
/* loaded from: classes.dex */
public final class C4749b extends AbstractC7044b {

    /* renamed from: e */
    public final /* synthetic */ z0 f23727e;

    /* renamed from: f */
    public final /* synthetic */ C4751d f23728f;

    public C4749b(C4751d c4751d, z0 z0Var) {
        this.f23728f = c4751d;
        this.f23727e = z0Var;
    }

    @Override // t5.AbstractC7044b
    /* renamed from: g */
    public final void mo9653g(int i10) {
        this.f23728f.f23744m = true;
        this.f23727e.mo7029b(i10);
    }

    @Override // t5.AbstractC7044b
    /* renamed from: h */
    public final void mo9654h(Typeface typeface) {
        C4751d c4751d = this.f23728f;
        c4751d.f23745n = Typeface.create(typeface, c4751d.f23735d);
        c4751d.f23744m = true;
        this.f23727e.mo7030c(c4751d.f23745n, false);
    }
}

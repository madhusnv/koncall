package y7;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 extends i0 {

    /* renamed from: a */
    public boolean f41822a = false;

    /* renamed from: b */
    public final /* synthetic */ C8588w f41823b;

    public w0(C8588w c8588w) {
        this.f41823b = c8588w;
    }

    @Override // y7.i0
    /* renamed from: a */
    public final void mo4095a(RecyclerView recyclerView, int i10) {
        if (i10 == 0 && this.f41822a) {
            this.f41822a = false;
            this.f41823b.m15945f();
        }
    }

    @Override // y7.i0
    /* renamed from: b */
    public final void mo4096b(RecyclerView recyclerView, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.f41822a = true;
    }
}

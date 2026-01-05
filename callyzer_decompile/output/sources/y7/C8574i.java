package y7;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.i */
/* loaded from: classes.dex */
public final class C8574i extends i0 {

    /* renamed from: a */
    public final /* synthetic */ C8575j f41656a;

    public C8574i(C8575j c8575j) {
        this.f41656a = c8575j;
    }

    @Override // y7.i0
    /* renamed from: b */
    public final void mo4096b(RecyclerView recyclerView, int i10, int i11) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C8575j c8575j = this.f41656a;
        int i12 = c8575j.f41661a;
        int iComputeVerticalScrollRange = c8575j.f41679s.computeVerticalScrollRange();
        int i13 = c8575j.f41678r;
        c8575j.f41680t = iComputeVerticalScrollRange - i13 > 0 && i13 >= i12;
        int iComputeHorizontalScrollRange = c8575j.f41679s.computeHorizontalScrollRange();
        int i14 = c8575j.f41677q;
        boolean z6 = iComputeHorizontalScrollRange - i14 > 0 && i14 >= i12;
        c8575j.f41681u = z6;
        boolean z10 = c8575j.f41680t;
        if (!z10 && !z6) {
            if (c8575j.f41682v != 0) {
                c8575j.m15869f(0);
                return;
            }
            return;
        }
        if (z10) {
            float f6 = i13;
            c8575j.f41672l = (int) ((((f6 / 2.0f) + iComputeVerticalScrollOffset) * f6) / iComputeVerticalScrollRange);
            c8575j.f41671k = Math.min(i13, (i13 * i13) / iComputeVerticalScrollRange);
        }
        if (c8575j.f41681u) {
            float f10 = iComputeHorizontalScrollOffset;
            float f11 = i14;
            c8575j.f41675o = (int) ((((f11 / 2.0f) + f10) * f11) / iComputeHorizontalScrollRange);
            c8575j.f41674n = Math.min(i14, (i14 * i14) / iComputeHorizontalScrollRange);
        }
        int i15 = c8575j.f41682v;
        if (i15 == 0 || i15 == 1) {
            c8575j.m15869f(1);
        }
    }
}

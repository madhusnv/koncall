package y7;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a */
    public int f41729a;

    /* renamed from: b */
    public int f41730b;

    /* renamed from: c */
    public int f41731c;

    /* renamed from: d */
    public int f41732d;

    /* renamed from: e */
    public Interpolator f41733e;

    /* renamed from: f */
    public boolean f41734f;

    /* renamed from: a */
    public final void m15890a(RecyclerView recyclerView) {
        int i10 = this.f41732d;
        if (i10 >= 0) {
            this.f41732d = -1;
            recyclerView.m1328L(i10);
            this.f41734f = false;
        } else if (this.f41734f) {
            Interpolator interpolator = this.f41733e;
            if (interpolator != null && this.f41731c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f41731c;
            if (i11 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.f43695f1.m15901b(this.f41729a, this.f41730b, i11, interpolator);
            this.f41734f = false;
        }
    }
}

package y7;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.v */
/* loaded from: classes.dex */
public final class C8587v extends C8584s {

    /* renamed from: p */
    public final /* synthetic */ C8588w f41815p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8587v(C8588w c8588w, Context context) {
        super(context);
        this.f41815p = c8588w;
    }

    @Override // y7.C8584s
    /* renamed from: b */
    public final float mo4110b(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // y7.C8584s
    /* renamed from: c */
    public final int mo15896c(int i10) {
        return Math.min(100, super.mo15896c(i10));
    }

    @Override // y7.C8584s
    /* renamed from: e */
    public final void mo15898e(View view, o0 o0Var) {
        C8588w c8588w = this.f41815p;
        int[] iArrM15942a = c8588w.m15942a(c8588w.f41818a.getLayoutManager(), view);
        int i10 = iArrM15942a[0];
        int i11 = iArrM15942a[1];
        int iCeil = (int) Math.ceil(mo15896c(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
        if (iCeil > 0) {
            o0Var.f41729a = i10;
            o0Var.f41730b = i11;
            o0Var.f41731c = iCeil;
            o0Var.f41733e = this.f41776i;
            o0Var.f41734f = true;
        }
    }
}

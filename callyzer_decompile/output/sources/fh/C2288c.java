package fh;

import android.content.res.Resources;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import hz.AbstractC3063b;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fh.c */
/* loaded from: classes.dex */
public final class C2288c extends AbstractC3063b {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetBehavior f10323a;

    public C2288c(BottomSheetBehavior bottomSheetBehavior) {
        this.f10323a = bottomSheetBehavior;
    }

    @Override // hz.AbstractC3063b
    /* renamed from: d */
    public final int mo5419d(int i10, View view) {
        return view.getLeft();
    }

    @Override // hz.AbstractC3063b
    /* renamed from: e */
    public final int mo5420e(int i10, View view) {
        BottomSheetBehavior bottomSheetBehavior = this.f10323a;
        int iM4064w = bottomSheetBehavior.m4064w();
        int i11 = bottomSheetBehavior.f6735C ? bottomSheetBehavior.f6745M : bottomSheetBehavior.f6733A;
        return i10 < iM4064w ? iM4064w : i10 > i11 ? i11 : i10;
    }

    @Override // hz.AbstractC3063b
    /* renamed from: h */
    public final int mo5965h() {
        BottomSheetBehavior bottomSheetBehavior = this.f10323a;
        return bottomSheetBehavior.f6735C ? bottomSheetBehavior.f6745M : bottomSheetBehavior.f6733A;
    }

    @Override // hz.AbstractC3063b
    /* renamed from: j */
    public final void mo5423j(int i10) throws Resources.NotFoundException {
        if (i10 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f10323a;
            if (bottomSheetBehavior.f6737E) {
                bottomSheetBehavior.m4067z(1);
            }
        }
    }

    @Override // hz.AbstractC3063b
    /* renamed from: k */
    public final void mo5424k(View view, int i10, int i11) {
        this.f10323a.m4063u(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // hz.AbstractC3063b
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5425l(android.view.View r6, float r7, float r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.C2288c.mo5425l(android.view.View, float, float):void");
    }

    @Override // hz.AbstractC3063b
    /* renamed from: m */
    public final boolean mo5426m(int i10, View view) {
        BottomSheetBehavior bottomSheetBehavior = this.f10323a;
        int i11 = bottomSheetBehavior.f6738F;
        if (i11 == 1 || bottomSheetBehavior.f6752T) {
            return false;
        }
        if (i11 == 3 && bottomSheetBehavior.f6750R == i10) {
            WeakReference weakReference = bottomSheetBehavior.f6747O;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference2 = bottomSheetBehavior.f6746N;
        return weakReference2 != null && weakReference2.get() == view;
    }
}

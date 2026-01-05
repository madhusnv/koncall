package p013o;

import android.widget.AbsListView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h1 implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ j1 f25501a;

    public h1(j1 j1Var) {
        this.f25501a = j1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        j1 j1Var = this.f25501a;
        f1 f1Var = j1Var.f25560p;
        C5238x c5238x = j1Var.f25568y;
        if (i10 != 1 || c5238x.getInputMethodMode() == 2 || c5238x.getContentView() == null) {
            return;
        }
        j1Var.f25564t.removeCallbacks(f1Var);
        f1Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}

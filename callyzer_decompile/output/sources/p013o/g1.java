package p013o;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g1 extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ j1 f25496a;

    public g1(j1 j1Var) {
        this.f25496a = j1Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        j1 j1Var = this.f25496a;
        if (j1Var.f25568y.isShowing()) {
            j1Var.mo9837f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f25496a.dismiss();
    }
}

package p013o;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public final /* synthetic */ j1 f25462a;

    public c1(j1 j1Var) {
        this.f25462a = j1Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j6) {
        n1 n1Var;
        if (i10 == -1 || (n1Var = this.f25462a.f25549c) == null) {
            return;
        }
        n1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}

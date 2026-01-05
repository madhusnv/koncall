package ai.salesmax.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public WrapContentLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void j1(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        try {
            super.j1(c2385v, c2389z);
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}

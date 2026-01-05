package p001o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class gj7 extends RecyclerView.d0 {
    public gj7(FrameLayout frameLayout) {
        super(frameLayout);
    }

    /* renamed from: O */
    public static gj7 m28852O(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(wvi.m55124k());
        frameLayout.setSaveEnabled(false);
        return new gj7(frameLayout);
    }

    /* renamed from: P */
    public FrameLayout m28853P() {
        return (FrameLayout) this.f9794a;
    }
}

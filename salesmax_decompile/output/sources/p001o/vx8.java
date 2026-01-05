package p001o;

import ai.salesmax.model.FormField;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class vx8 extends ewi {
    public final MaterialTextView n0;
    public final LinearLayout o0;
    public final MaterialCardView p0;
    public final RecyclerView q0;
    public final MaterialTextView r0;
    public FormField s0;
    public Integer t0;
    public ck6 u0;

    public vx8(Object obj, View view, int i, MaterialTextView materialTextView, LinearLayout linearLayout, MaterialCardView materialCardView, RecyclerView recyclerView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = linearLayout;
        this.p0 = materialCardView;
        this.q0 = recyclerView;
        this.r0 = materialTextView2;
    }
}

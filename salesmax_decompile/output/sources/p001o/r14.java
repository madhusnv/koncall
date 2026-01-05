package p001o;

import ai.salesmax.model.FormFields;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public abstract class r14 extends ewi {
    public final MaterialCardView n0;
    public final RecyclerView o0;
    public FormFields p0;
    public Integer q0;
    public ck6 r0;

    public r14(Object obj, View view, int i, MaterialCardView materialCardView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = materialCardView;
        this.o0 = recyclerView;
    }

    public abstract void h0(ck6 ck6Var);

    public abstract void i0(FormFields formFields);

    public abstract void j0(Integer num);
}

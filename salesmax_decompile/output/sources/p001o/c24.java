package p001o;

import ai.salesmax.model.HomeTasksStatus;
import ai.salesmax.services.model.ActivityMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class c24 extends ewi {
    public final View n0;
    public final RecyclerView o0;
    public final MaterialTextView p0;
    public final MaterialButton q0;
    public final MaterialTextView r0;
    public final MaterialButton s0;
    public ArrayList t0;
    public HomeTasksStatus u0;
    public ActivityMetrics.Period v0;
    public Integer w0;
    public Boolean x0;
    public ck6 y0;

    public c24(Object obj, View view, int i, View view2, RecyclerView recyclerView, MaterialTextView materialTextView, MaterialButton materialButton, MaterialTextView materialTextView2, MaterialButton materialButton2) {
        super(obj, view, i);
        this.n0 = view2;
        this.o0 = recyclerView;
        this.p0 = materialTextView;
        this.q0 = materialButton;
        this.r0 = materialTextView2;
        this.s0 = materialButton2;
    }

    public abstract void h0(ck6 ck6Var);

    public abstract void i0(ArrayList arrayList);

    public abstract void j0(ActivityMetrics.Period period);

    public abstract void k0(Integer num);

    public abstract void l0(Boolean bool);
}

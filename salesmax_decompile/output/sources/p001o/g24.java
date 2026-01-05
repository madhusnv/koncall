package p001o;

import ai.salesmax.model.HomeTasksStatus;
import ai.salesmax.services.model.ActivityMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class g24 extends ewi {
    public final View n0;
    public final RecyclerView o0;
    public final MaterialTextView p0;
    public final MaterialButton q0;
    public final MaterialTextView r0;
    public ArrayList s0;
    public HomeTasksStatus t0;
    public ActivityMetrics.Period u0;
    public Integer v0;
    public ck6 w0;

    public g24(Object obj, View view, int i, View view2, RecyclerView recyclerView, MaterialTextView materialTextView, MaterialButton materialButton, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = view2;
        this.o0 = recyclerView;
        this.p0 = materialTextView;
        this.q0 = materialButton;
        this.r0 = materialTextView2;
    }

    public abstract void h0(ArrayList arrayList);

    public abstract void i0(ActivityMetrics.Period period);
}

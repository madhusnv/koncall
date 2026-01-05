package p001o;

import ai.salesmax.model.SavedTableViewInfoList;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class l54 extends ewi {
    public final RecyclerView n0;
    public final MaterialTextView o0;
    public final MaterialButton p0;
    public SavedTableViewInfoList q0;
    public Integer r0;
    public ck6 s0;

    public l54(Object obj, View view, int i, RecyclerView recyclerView, MaterialTextView materialTextView, MaterialButton materialButton) {
        super(obj, view, i);
        this.n0 = recyclerView;
        this.o0 = materialTextView;
        this.p0 = materialButton;
    }
}

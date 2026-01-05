package p001o;

import ai.salesmax.model.LeadSource;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class t19 extends ewi {
    public final ShapeableImageView n0;
    public final MaterialTextView o0;
    public final LinearLayout p0;
    public LeadSource q0;
    public Integer r0;
    public ck6 s0;

    public t19(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, LinearLayout linearLayout) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialTextView;
        this.p0 = linearLayout;
    }
}

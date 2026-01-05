package p001o;

import ai.salesmax.model.Leads;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class r09 extends ewi {
    public final TextView n0;
    public final FrameLayout o0;
    public final CheckBox p0;
    public final MaterialCardView q0;
    public final ShapeableImageView r0;
    public final MaterialTextView s0;
    public final MaterialTextView t0;
    public Leads u0;
    public Integer v0;
    public ck6 w0;

    public r09(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, CheckBox checkBox, MaterialCardView materialCardView, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = textView;
        this.o0 = frameLayout;
        this.p0 = checkBox;
        this.q0 = materialCardView;
        this.r0 = shapeableImageView;
        this.s0 = materialTextView;
        this.t0 = materialTextView2;
    }
}

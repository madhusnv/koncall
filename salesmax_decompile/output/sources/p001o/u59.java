package p001o;

import ai.salesmax.model.ActiveProfile;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class u59 extends ewi {
    public final MaterialCardView n0;
    public final ShapeableImageView o0;
    public final ConstraintLayout p0;
    public final ShapeableImageView q0;
    public final MaterialCardView r0;
    public final MaterialButton s0;
    public final MaterialTextView t0;
    public final MaterialTextView u0;
    public final MaterialTextView v0;
    public ActiveProfile w0;
    public Integer x0;
    public ck6 y0;

    public u59(Object obj, View view, int i, MaterialCardView materialCardView, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView2, MaterialCardView materialCardView2, MaterialButton materialButton, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        super(obj, view, i);
        this.n0 = materialCardView;
        this.o0 = shapeableImageView;
        this.p0 = constraintLayout;
        this.q0 = shapeableImageView2;
        this.r0 = materialCardView2;
        this.s0 = materialButton;
        this.t0 = materialTextView;
        this.u0 = materialTextView2;
        this.v0 = materialTextView3;
    }
}

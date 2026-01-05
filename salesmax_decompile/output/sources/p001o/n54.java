package p001o;

import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class n54 extends ewi {
    public final ShapeableImageView n0;
    public final MaterialTextView o0;
    public final MaterialTextView p0;
    public final MaterialCardView q0;
    public final MaterialCardView r0;
    public boolean s0;
    public boolean t0;

    public n54(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialCardView materialCardView, MaterialCardView materialCardView2) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialTextView;
        this.p0 = materialTextView2;
        this.q0 = materialCardView;
        this.r0 = materialCardView2;
    }

    public abstract void h0(boolean z);

    public abstract void i0(boolean z);
}

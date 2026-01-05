package p001o;

import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class h44 extends ewi {
    public final MaterialCardView n0;
    public final ShapeableImageView o0;
    public final MaterialTextView p0;
    public final MaterialTextView q0;
    public boolean r0;
    public boolean s0;

    public h44(Object obj, View view, int i, MaterialCardView materialCardView, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = materialCardView;
        this.o0 = shapeableImageView;
        this.p0 = materialTextView;
        this.q0 = materialTextView2;
    }

    public abstract void h0(boolean z);

    public abstract void i0(boolean z);
}

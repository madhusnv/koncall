package p001o;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class d34 extends ewi {
    public final MaterialButton n0;
    public final ShapeableImageView o0;
    public final MaterialTextView p0;
    public final MaterialTextView q0;
    public boolean r0;
    public boolean s0;

    public d34(Object obj, View view, int i, MaterialButton materialButton, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = shapeableImageView;
        this.p0 = materialTextView;
        this.q0 = materialTextView2;
    }

    public abstract void h0(boolean z);

    public abstract void i0(boolean z);
}

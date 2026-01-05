package p001o;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes.dex */
public abstract class n19 extends ewi {
    public final TextView n0;
    public final TextView o0;
    public final ShapeableImageView p0;
    public final ConstraintLayout q0;
    public boolean r0;

    public n19(Object obj, View view, int i, TextView textView, TextView textView2, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.n0 = textView;
        this.o0 = textView2;
        this.p0 = shapeableImageView;
        this.q0 = constraintLayout;
    }

    public abstract void h0(boolean z);
}

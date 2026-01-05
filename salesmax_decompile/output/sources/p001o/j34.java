package p001o;

import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class j34 extends ewi {
    public final ShapeableImageView n0;
    public final MaterialTextView o0;
    public final MaterialTextView p0;
    public boolean q0;

    public j34(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialTextView;
        this.p0 = materialTextView2;
    }

    public abstract void h0(boolean z);
}

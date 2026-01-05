package p001o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class ig7 extends ewi {
    public final ShapeableImageView n0;
    public final ConstraintLayout o0;
    public final AppCompatAutoCompleteTextView p0;
    public final LinearLayout q0;
    public final TextInputLayout r0;
    public String s0;
    public boolean t0;

    public ig7(Object obj, View view, int i, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout, AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, LinearLayout linearLayout, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = constraintLayout;
        this.p0 = appCompatAutoCompleteTextView;
        this.q0 = linearLayout;
        this.r0 = textInputLayout;
    }
}

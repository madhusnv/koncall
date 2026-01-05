package p001o;

import ai.salesmax.model.UserContactDetail;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class nz8 extends ewi {
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final Button q0;
    public final CheckBox r0;
    public final ShapeableImageView s0;
    public final MaterialButtonToggleGroup t0;
    public final MaterialTextView u0;
    public final MaterialTextView v0;
    public UserContactDetail w0;
    public Integer x0;
    public ck6 y0;

    public nz8(Object obj, View view, int i, Button button, Button button2, Button button3, Button button4, CheckBox checkBox, ShapeableImageView shapeableImageView, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = button4;
        this.r0 = checkBox;
        this.s0 = shapeableImageView;
        this.t0 = materialButtonToggleGroup;
        this.u0 = materialTextView;
        this.v0 = materialTextView2;
    }
}

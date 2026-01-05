package p001o;

import ai.salesmax.ui.component.TouchImageView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ij7 extends ewi {
    public final AppBarLayout n0;
    public final Button o0;
    public final ShapeableImageView p0;
    public final ShapeableImageView q0;
    public final MaterialTextView r0;
    public final TouchImageView s0;
    public final View t0;
    public final TextView u0;
    public final ProgressBar v0;
    public final Button w0;
    public final Button x0;
    public final Toolbar y0;
    public String z0;

    public ij7(Object obj, View view, int i, AppBarLayout appBarLayout, Button button, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, TouchImageView touchImageView, View view2, TextView textView, ProgressBar progressBar, Button button2, Button button3, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = appBarLayout;
        this.o0 = button;
        this.p0 = shapeableImageView;
        this.q0 = shapeableImageView2;
        this.r0 = materialTextView;
        this.s0 = touchImageView;
        this.t0 = view2;
        this.u0 = textView;
        this.v0 = progressBar;
        this.w0 = button2;
        this.x0 = button3;
        this.y0 = toolbar;
    }
}

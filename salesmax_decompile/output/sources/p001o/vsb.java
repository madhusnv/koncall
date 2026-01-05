package p001o;

import ai.salesmax.model.ProfileView;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class vsb extends ewi {
    public final MaterialTextView A0;
    public final MaterialTextView B0;
    public final MaterialTextView C0;
    public ProfileView D0;
    public ck6 E0;
    public final MaterialCardView n0;
    public final ShapeableImageView o0;
    public final ShapeableImageView p0;
    public final MaterialTextView q0;
    public final MaterialButton r0;
    public final MaterialButton s0;
    public final MaterialButton t0;
    public final MaterialButton u0;
    public final MaterialButton v0;
    public final MaterialButton w0;
    public final MaterialButton x0;
    public final MaterialButton y0;
    public final MaterialButton z0;

    public vsb(Object obj, View view, int i, MaterialCardView materialCardView, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, MaterialButton materialButton6, MaterialButton materialButton7, MaterialButton materialButton8, MaterialButton materialButton9, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        super(obj, view, i);
        this.n0 = materialCardView;
        this.o0 = shapeableImageView;
        this.p0 = shapeableImageView2;
        this.q0 = materialTextView;
        this.r0 = materialButton;
        this.s0 = materialButton2;
        this.t0 = materialButton3;
        this.u0 = materialButton4;
        this.v0 = materialButton5;
        this.w0 = materialButton6;
        this.x0 = materialButton7;
        this.y0 = materialButton8;
        this.z0 = materialButton9;
        this.A0 = materialTextView2;
        this.B0 = materialTextView3;
        this.C0 = materialTextView4;
    }

    public abstract void h0(ProfileView profileView);
}

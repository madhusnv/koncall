package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class dg7 extends ewi {
    public final ShapeableImageView n0;
    public final ShapeableImageView o0;
    public final ImageView p0;
    public final ShapeableImageView q0;
    public final ShapeableImageView r0;
    public final MaterialButton s0;
    public final MaterialCardView t0;
    public final MaterialTextView u0;
    public final LinearProgressIndicator v0;
    public final PreviewView w0;

    public dg7(Object obj, View view, int i, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ImageView imageView, ShapeableImageView shapeableImageView3, ShapeableImageView shapeableImageView4, MaterialButton materialButton, MaterialCardView materialCardView, MaterialTextView materialTextView, LinearProgressIndicator linearProgressIndicator, PreviewView previewView) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = shapeableImageView2;
        this.p0 = imageView;
        this.q0 = shapeableImageView3;
        this.r0 = shapeableImageView4;
        this.s0 = materialButton;
        this.t0 = materialCardView;
        this.u0 = materialTextView;
        this.v0 = linearProgressIndicator;
        this.w0 = previewView;
    }

    public static dg7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static dg7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (dg7) ewi.m25668F(layoutInflater, p9e.fragment_attendance, viewGroup, z, obj);
    }
}

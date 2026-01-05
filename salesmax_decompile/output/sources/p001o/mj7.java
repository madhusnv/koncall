package p001o;

import ai.salesmax.model.FileData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.ortiz.touchview.TouchImageView;

/* loaded from: classes.dex */
public abstract class mj7 extends ewi {
    public final AppBarLayout n0;
    public final ShapeableImageView o0;
    public final ShapeableImageView p0;
    public final MaterialTextView q0;
    public final TouchImageView r0;
    public final Toolbar s0;
    public FileData t0;

    public mj7(Object obj, View view, int i, AppBarLayout appBarLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, MaterialTextView materialTextView, TouchImageView touchImageView, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = appBarLayout;
        this.o0 = shapeableImageView;
        this.p0 = shapeableImageView2;
        this.q0 = materialTextView;
        this.r0 = touchImageView;
        this.s0 = toolbar;
    }

    public static mj7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static mj7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (mj7) ewi.m25668F(layoutInflater, p9e.fragment_view_single_image, viewGroup, z, obj);
    }

    public abstract void j0(FileData fileData);
}

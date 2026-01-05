package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.ui.PlayerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ph7 extends ewi {
    public final AppBarLayout n0;
    public final ShapeableImageView o0;
    public final MaterialTextView p0;
    public final PlayerView q0;
    public final Toolbar r0;

    public ph7(Object obj, View view, int i, AppBarLayout appBarLayout, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, PlayerView playerView, Toolbar toolbar) {
        super(obj, view, i);
        this.n0 = appBarLayout;
        this.o0 = shapeableImageView;
        this.p0 = materialTextView;
        this.q0 = playerView;
        this.r0 = toolbar;
    }

    public static ph7 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ph7 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ph7) ewi.m25668F(layoutInflater, p9e.fragment_media, viewGroup, z, obj);
    }
}

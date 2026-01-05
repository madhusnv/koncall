package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes.dex */
public abstract class j70 extends ewi {
    public final ShapeableImageView n0;
    public final MaterialCardView o0;
    public final RecyclerView p0;

    public j70(Object obj, View view, int i, ShapeableImageView shapeableImageView, MaterialCardView materialCardView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.n0 = shapeableImageView;
        this.o0 = materialCardView;
        this.p0 = recyclerView;
    }

    public static j70 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static j70 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (j70) ewi.m25668F(layoutInflater, p9e.admin_user_team_management, viewGroup, z, obj);
    }
}

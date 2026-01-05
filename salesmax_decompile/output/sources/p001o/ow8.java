package p001o;

import ai.salesmax.model.LeadsUser;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ow8 extends ewi {
    public final MaterialTextView n0;
    public final MaterialCardView o0;
    public final ShapeableImageView p0;
    public final MaterialTextView q0;
    public LeadsUser r0;
    public Integer s0;

    public ow8(Object obj, View view, int i, MaterialTextView materialTextView, MaterialCardView materialCardView, ShapeableImageView shapeableImageView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = materialCardView;
        this.p0 = shapeableImageView;
        this.q0 = materialTextView2;
    }

    public static ow8 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ow8 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ow8) ewi.m25668F(layoutInflater, p9e.item_autocomplete_user, viewGroup, z, obj);
    }

    public abstract void j0(LeadsUser leadsUser);

    public abstract void k0(Integer num);
}

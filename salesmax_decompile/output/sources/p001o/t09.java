package p001o;

import ai.salesmax.model.LeadsUser;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class t09 extends ewi {
    public final MaterialTextView n0;
    public final ShapeableImageView o0;
    public final MaterialCardView p0;
    public LeadsUser q0;
    public Integer r0;
    public ck6 s0;

    public t09(Object obj, View view, int i, MaterialTextView materialTextView, ShapeableImageView shapeableImageView, MaterialCardView materialCardView) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = shapeableImageView;
        this.p0 = materialCardView;
    }

    public static t09 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return j0(layoutInflater, viewGroup, z, null);
    }

    public static t09 j0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (t09) ewi.m25668F(layoutInflater, p9e.item_lead_user, viewGroup, z, obj);
    }

    public ck6 h0() {
        return this.s0;
    }

    public abstract void k0(ck6 ck6Var);

    public abstract void l0(LeadsUser leadsUser);

    public abstract void m0(Integer num);
}

package p001o;

import ai.salesmax.model.BusinessInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class uw8 extends ewi {
    public final MaterialTextView n0;
    public final MaterialCardView o0;
    public final ShapeableImageView p0;
    public final MaterialTextView q0;
    public BusinessInfo r0;
    public Integer s0;

    public uw8(Object obj, View view, int i, MaterialTextView materialTextView, MaterialCardView materialCardView, ShapeableImageView shapeableImageView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = materialCardView;
        this.p0 = shapeableImageView;
        this.q0 = materialTextView2;
    }

    public static uw8 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static uw8 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (uw8) ewi.m25668F(layoutInflater, p9e.item_business_search, viewGroup, z, obj);
    }

    public abstract void j0(BusinessInfo businessInfo);

    public abstract void k0(Integer num);
}

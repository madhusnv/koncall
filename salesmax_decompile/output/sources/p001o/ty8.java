package p001o;

import ai.salesmax.model.EntityListInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class ty8 extends ewi {
    public final MaterialTextView n0;
    public final MaterialCardView o0;
    public final MaterialTextView p0;
    public EntityListInfo q0;
    public Integer r0;

    public ty8(Object obj, View view, int i, MaterialTextView materialTextView, MaterialCardView materialCardView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = materialCardView;
        this.p0 = materialTextView2;
    }

    public static ty8 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static ty8 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ty8) ewi.m25668F(layoutInflater, p9e.item_entitylist_search, viewGroup, z, obj);
    }

    public abstract void j0(EntityListInfo entityListInfo);

    public abstract void k0(Integer num);
}

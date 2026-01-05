package p001o;

import ai.salesmax.model.LeadsTeam;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class p09 extends ewi {
    public final MaterialTextView n0;
    public final MaterialCardView o0;
    public LeadsTeam p0;
    public Integer q0;

    public p09(Object obj, View view, int i, MaterialTextView materialTextView, MaterialCardView materialCardView) {
        super(obj, view, i);
        this.n0 = materialTextView;
        this.o0 = materialCardView;
    }

    public static p09 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static p09 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (p09) ewi.m25668F(layoutInflater, p9e.item_lead_team, viewGroup, z, obj);
    }

    public abstract void j0(LeadsTeam leadsTeam);

    public abstract void k0(Integer num);
}

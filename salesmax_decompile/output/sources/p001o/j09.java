package p001o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class j09 extends ewi {
    public final MaterialCardView n0;
    public final MaterialTextView o0;
    public String p0;
    public Integer q0;

    public j09(Object obj, View view, int i, MaterialCardView materialCardView, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialCardView;
        this.o0 = materialTextView;
    }

    public static j09 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static j09 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (j09) ewi.m25668F(layoutInflater, p9e.item_lead_source_search, viewGroup, z, obj);
    }

    public abstract void j0(String str);

    public abstract void k0(Integer num);
}

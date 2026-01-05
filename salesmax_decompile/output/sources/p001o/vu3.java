package p001o;

import ai.salesmax.model.LeadsSummary;
import ai.salesmax.view.ViewProfileData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes.dex */
public abstract class vu3 extends ewi {
    public final LinearLayoutCompat n0;
    public final ViewProfileData o0;
    public LeadsSummary p0;
    public Integer q0;
    public ck6 r0;

    public vu3(Object obj, View view, int i, LinearLayoutCompat linearLayoutCompat, ViewProfileData viewProfileData) {
        super(obj, view, i);
        this.n0 = linearLayoutCompat;
        this.o0 = viewProfileData;
    }

    public static vu3 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static vu3 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (vu3) ewi.m25668F(layoutInflater, p9e.contact_info_fragment, viewGroup, z, obj);
    }

    public abstract void j0(LeadsSummary leadsSummary);
}

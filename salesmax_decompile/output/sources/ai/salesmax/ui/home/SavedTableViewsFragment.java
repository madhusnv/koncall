package ai.salesmax.ui.home;

import ai.salesmax.services.model.SavedTableViewInfo;
import ai.salesmax.ui.leads.BaseLeadsFragment;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2145n;
import p001o.hae;
import p001o.sq8;
import p001o.wx9;

/* loaded from: classes.dex */
public final class SavedTableViewsFragment extends BaseLeadsFragment {
    public boolean t0;
    public SavedTableViewInfo u0;

    public SavedTableViewsFragment() {
        super(wx9.ME);
        this.t0 = true;
    }

    @Override // ai.salesmax.ui.leads.BaseLeadsFragment
    public AbstractC2145n D2(String str) {
        sq8.m48649h(str, "searchTerm");
        return I3() ? N2().m20666A(str, H3()) : N2().m20677r(str, H3());
    }

    public SavedTableViewInfo H3() {
        return this.u0;
    }

    public boolean I3() {
        return this.t0;
    }

    public void J3(boolean z) {
        this.t0 = z;
    }

    public void K3(SavedTableViewInfo savedTableViewInfo) {
        this.u0 = savedTableViewInfo;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        SavedTableViewInfo savedTableViewInfo;
        sq8.m48649h(context, "context");
        super.onAttach(context);
        Bundle arguments = getArguments();
        J3(arguments != null ? arguments.getBoolean(getString(hae.argumentIsMyDashBoard), true) : true);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (savedTableViewInfo = (SavedTableViewInfo) arguments2.getParcelable(getString(hae.argumentSavedTableViewInfo))) == null) {
            savedTableViewInfo = null;
        }
        K3(savedTableViewInfo);
    }
}

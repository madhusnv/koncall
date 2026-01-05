package p001o;

import ai.salesmax.model.AutoCompleteListModel;
import ai.salesmax.view.AllAutoCompleteTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class qvi extends ewi {
    public final View n0;
    public final Guideline o0;
    public final MaterialTextView p0;
    public final AllAutoCompleteTextView q0;
    public final TextInputLayout r0;
    public AutoCompleteListModel s0;
    public Integer t0;
    public ck6 u0;

    public qvi(Object obj, View view, int i, View view2, Guideline guideline, MaterialTextView materialTextView, AllAutoCompleteTextView allAutoCompleteTextView, TextInputLayout textInputLayout) {
        super(obj, view, i);
        this.n0 = view2;
        this.o0 = guideline;
        this.p0 = materialTextView;
        this.q0 = allAutoCompleteTextView;
        this.r0 = textInputLayout;
    }

    public static qvi h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static qvi i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qvi) ewi.m25668F(layoutInflater, p9e.view_add_lead_dropdown, viewGroup, z, obj);
    }
}

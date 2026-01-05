package p001o;

import ai.salesmax.model.PropertyDefinition;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class iw extends ewi {
    public final Button A0;
    public final MaterialButtonToggleGroup B0;
    public final Button C0;
    public final Button D0;
    public final Button E0;
    public final Button F0;
    public final MaterialTextView G0;
    public final MaterialTextView H0;
    public PropertyDefinition I0;
    public Integer J0;
    public ck6 K0;
    public final TextInputEditText n0;
    public final TextInputLayout o0;
    public final MaterialButton p0;
    public final MaterialButton q0;
    public final MaterialButton r0;
    public final MaterialSwitch s0;
    public final TextInputLayout t0;
    public final AutoCompleteTextView u0;
    public final RecyclerView v0;
    public final TextInputEditText w0;
    public final TextInputLayout x0;
    public final TextInputEditText y0;
    public final TextInputLayout z0;

    public iw(Object obj, View view, int i, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialSwitch materialSwitch, TextInputLayout textInputLayout2, AutoCompleteTextView autoCompleteTextView, RecyclerView recyclerView, TextInputEditText textInputEditText2, TextInputLayout textInputLayout3, TextInputEditText textInputEditText3, TextInputLayout textInputLayout4, Button button, MaterialButtonToggleGroup materialButtonToggleGroup, Button button2, Button button3, Button button4, Button button5, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        super(obj, view, i);
        this.n0 = textInputEditText;
        this.o0 = textInputLayout;
        this.p0 = materialButton;
        this.q0 = materialButton2;
        this.r0 = materialButton3;
        this.s0 = materialSwitch;
        this.t0 = textInputLayout2;
        this.u0 = autoCompleteTextView;
        this.v0 = recyclerView;
        this.w0 = textInputEditText2;
        this.x0 = textInputLayout3;
        this.y0 = textInputEditText3;
        this.z0 = textInputLayout4;
        this.A0 = button;
        this.B0 = materialButtonToggleGroup;
        this.C0 = button2;
        this.D0 = button3;
        this.E0 = button4;
        this.F0 = button5;
        this.G0 = materialTextView;
        this.H0 = materialTextView2;
    }

    public static iw h0(LayoutInflater layoutInflater) {
        zt4.m59873g();
        return i0(layoutInflater, null);
    }

    public static iw i0(LayoutInflater layoutInflater, Object obj) {
        return (iw) ewi.m25668F(layoutInflater, p9e.add_custom_property, null, false, obj);
    }

    public abstract void j0(PropertyDefinition propertyDefinition);
}

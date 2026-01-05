package com.google.android.material.button;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.material.button.MaterialButton;
import p001o.gza;
import p001o.pae;
import p001o.v9e;
import p001o.x5e;

/* loaded from: classes3.dex */
public class MaterialSplitButton extends MaterialButtonGroup {

    /* renamed from: y */
    public static final int f12258y = pae.Widget_Material3_MaterialSplitButton;

    public MaterialSplitButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m14268q(MaterialButton materialButton, boolean z) {
        materialButton.setStateDescription(getResources().getString(z ? v9e.mtrl_button_expanded_content_description : v9e.mtrl_button_collapsed_content_description));
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold MaterialButtons.");
        }
        if (getChildCount() > 2) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold two MaterialButtons.");
        }
        MaterialButton materialButton = (MaterialButton) view;
        super.addView(view, i, layoutParams);
        if (indexOfChild(view) == 1) {
            materialButton.setCheckable(true);
            materialButton.setA11yClassName(Button.class.getName());
            if (Build.VERSION.SDK_INT >= 30) {
                materialButton.setStateDescription(getResources().getString(materialButton.isChecked() ? v9e.mtrl_button_expanded_content_description : v9e.mtrl_button_collapsed_content_description));
                materialButton.m14213c(new MaterialButton.InterfaceC10976b() { // from class: o.fza
                    @Override // com.google.android.material.button.MaterialButton.InterfaceC10976b
                    /* renamed from: a */
                    public final void mo14234a(MaterialButton materialButton2, boolean z) {
                        this.f24275a.m14268q(materialButton2, z);
                    }
                });
            }
        }
    }

    public MaterialSplitButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.materialSplitButtonStyle);
    }

    public MaterialSplitButton(Context context, AttributeSet attributeSet, int i) {
        super(gza.m29680d(context, attributeSet, i, f12258y), attributeSet, i);
    }
}

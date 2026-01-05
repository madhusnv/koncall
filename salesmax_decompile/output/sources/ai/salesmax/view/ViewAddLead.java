package ai.salesmax.view;

import ai.salesmax.view.ViewAddLead;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;
import org.objectweb.asm.Opcodes;
import p001o.f9g;
import p001o.p9e;
import p001o.sbe;
import p001o.sq8;
import p001o.z8e;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class ViewAddLead extends FrameLayout {

    /* renamed from: a */
    public String f5044a;

    /* renamed from: b */
    public String f5045b;

    /* renamed from: c */
    public boolean f5046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAddLead(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f5044a = "";
        this.f5045b = "";
        this.f5046c = true;
        m3369b();
    }

    /* renamed from: d */
    public static final void m3368d(ViewAddLead viewAddLead, View view) {
        sq8.m48649h(viewAddLead, "this$0");
        viewAddLead.performClick();
    }

    /* renamed from: b */
    public final void m3369b() {
        LayoutInflater.from(getContext()).inflate(p9e.view_add_lead, this);
    }

    /* renamed from: c */
    public final void m3370c(Context context, AttributeSet attributeSet) {
        m3369b();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sbe.ViewProfileData, 0, 0);
        sq8.m48648g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f5044a = typedArrayObtainStyledAttributes.getString(sbe.ViewProfileData_superfone_profile_data_title);
            this.f5045b = typedArrayObtainStyledAttributes.getString(sbe.ViewProfileData_superfone_profile_data_value);
            this.f5046c = typedArrayObtainStyledAttributes.getBoolean(sbe.ViewProfileData_superfone_profile_data_clickable, true);
            setClickable();
            m3371e();
            m3372f();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public final void m3371e() {
        ((TextInputEditText) findViewById(z8e.viewAddLeadValue)).setText(this.f5045b);
    }

    /* renamed from: f */
    public final void m3372f() {
        MaterialTextView materialTextView = (MaterialTextView) findViewById(z8e.viewAddLeadTitle);
        String str = this.f5044a;
        if (str == null || f9g.d0(str)) {
            materialTextView.setVisibility(8);
        } else {
            materialTextView.setText(this.f5044a);
        }
    }

    public final String getViewAddLeadValue() {
        return f9g.Z0(String.valueOf(((TextInputEditText) findViewById(z8e.viewAddLeadValue)).getText())).toString();
    }

    public final TextInputEditText getViewEditText() {
        return (TextInputEditText) findViewById(z8e.viewAddLeadValue);
    }

    public final void setClickable() {
        TextInputEditText textInputEditText = (TextInputEditText) findViewById(z8e.viewAddLeadValue);
        if (getId() == z8e.addLeadLocation) {
            textInputEditText.setMaxLines(4);
            textInputEditText.setInputType(Opcodes.ACC_DEPRECATED);
        }
        if (this.f5046c) {
            return;
        }
        textInputEditText.setFocusable(false);
        textInputEditText.setOnClickListener(new View.OnClickListener() { // from class: o.ovi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAddLead.m3368d(this.f38986a, view);
            }
        });
    }

    public final void setTextViewEditable(boolean z) {
        ((TextInputEditText) findViewById(z8e.viewAddLeadValue)).setEnabled(false);
    }

    public final void setViewAddLeadValue(String str) {
        if (str != null) {
            this.f5045b = str;
            m3371e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAddLead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        this.f5044a = "";
        this.f5045b = "";
        this.f5046c = true;
        m3370c(context, attributeSet);
    }
}

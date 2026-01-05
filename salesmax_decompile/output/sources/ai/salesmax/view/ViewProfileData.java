package ai.salesmax.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.f9g;
import p001o.p9e;
import p001o.sbe;
import p001o.sq8;
import p001o.w7e;
import p001o.z8e;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class ViewProfileData extends FrameLayout {

    /* renamed from: a */
    public String f5056a;

    /* renamed from: b */
    public String f5057b;

    /* renamed from: c */
    public int f5058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewProfileData(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f5056a = "";
        this.f5057b = "";
        this.f5058c = -1;
        m3382a();
    }

    /* renamed from: a */
    public final void m3382a() {
        LayoutInflater.from(getContext()).inflate(p9e.view_profile_data, this);
    }

    /* renamed from: b */
    public final void m3383b(Context context, AttributeSet attributeSet) {
        m3382a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sbe.ViewProfileData, 0, 0);
        sq8.m48648g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f5056a = typedArrayObtainStyledAttributes.getString(sbe.ViewProfileData_superfone_profile_data_title);
            this.f5057b = typedArrayObtainStyledAttributes.getString(sbe.ViewProfileData_superfone_profile_data_value);
            this.f5058c = typedArrayObtainStyledAttributes.getResourceId(sbe.ViewProfileData_superfone_profile_data_icon, -1);
            setViewProfileDataValue(this.f5057b);
            m3385d();
            m3384c();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public final void m3384c() {
        if (this.f5058c != -1) {
            ((ImageView) findViewById(z8e.vpt_Icon)).setImageResource(this.f5058c);
        }
    }

    /* renamed from: d */
    public final void m3385d() {
        MaterialTextView materialTextView = (MaterialTextView) findViewById(z8e.vpt_Title);
        String str = this.f5056a;
        if (str == null || f9g.d0(str)) {
            materialTextView.setVisibility(8);
        } else {
            materialTextView.setText(this.f5056a);
        }
    }

    public final String getValue() {
        return this.f5057b;
    }

    public final void setCallEndIcon() {
        ((ImageView) findViewById(z8e.vpt_Icon)).setImageResource(w7e.ic_call);
    }

    public final void setVETValue() {
        ((MaterialTextView) findViewById(z8e.vpt_Value)).setText(this.f5057b);
    }

    public final void setViewProfileDataValue(String str) {
        if (str != null) {
            this.f5057b = str;
            setVETValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewProfileData(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        this.f5056a = "";
        this.f5057b = "";
        this.f5058c = -1;
        m3383b(context, attributeSet);
    }
}

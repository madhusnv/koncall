package ai.salesmax.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import p001o.f9g;
import p001o.p9e;
import p001o.sbe;
import p001o.sq8;
import p001o.w7e;
import p001o.z8e;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class ViewProfileDataVer2 extends FrameLayout {

    /* renamed from: a */
    public String f5059a;

    /* renamed from: b */
    public String f5060b;

    /* renamed from: c */
    public int f5061c;

    /* renamed from: d */
    public int f5062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewProfileDataVer2(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f5059a = "";
        this.f5060b = "";
        this.f5061c = -1;
        this.f5062d = -1;
        m3386a();
    }

    /* renamed from: a */
    public final void m3386a() {
        LayoutInflater.from(getContext()).inflate(p9e.view_profile_data_ver, this);
    }

    /* renamed from: b */
    public final void m3387b(Context context, AttributeSet attributeSet) {
        m3386a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sbe.ViewProfileDataVer2, 0, 0);
        sq8.m48648g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f5059a = typedArrayObtainStyledAttributes.getString(sbe.ViewProfileDataVer2_superfone_profile_data_ver2_title);
            this.f5060b = typedArrayObtainStyledAttributes.getString(sbe.ViewProfileDataVer2_superfone_profile_data_ver2_value);
            this.f5061c = typedArrayObtainStyledAttributes.getResourceId(sbe.ViewProfileDataVer2_superfone_profile_data_ver2_icon, -1);
            this.f5062d = typedArrayObtainStyledAttributes.getResourceId(sbe.ViewProfileDataVer2_superfone_profile_data_ver2_icon_remove, -1);
            setViewProfileDataValue(this.f5060b);
            m3389d();
            m3388c();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public final void m3388c() {
        if (this.f5061c != -1) {
            ((ImageView) findViewById(z8e.vpt_Icon)).setImageResource(this.f5061c);
        }
    }

    /* renamed from: d */
    public final void m3389d() {
        MaterialTextView materialTextView = (MaterialTextView) findViewById(z8e.vpt_Title);
        String str = this.f5059a;
        if (str == null || f9g.d0(str)) {
            materialTextView.setVisibility(8);
        } else {
            materialTextView.setText(this.f5059a);
        }
    }

    public final MaterialButton getRemoveUser() {
        return (MaterialButton) findViewById(z8e.userRemove);
    }

    public final String getValue() {
        return this.f5060b;
    }

    public final void setCallEndIcon() {
        ((ImageView) findViewById(z8e.vpt_Icon)).setImageResource(w7e.ic_call);
    }

    public final void setVETValue() {
        ((MaterialTextView) findViewById(z8e.vpt_Value)).setText(this.f5060b);
    }

    public final void setViewProfileDataValue(String str) {
        if (str != null) {
            this.f5060b = str;
            setVETValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewProfileDataVer2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        this.f5059a = "";
        this.f5060b = "";
        this.f5061c = -1;
        this.f5062d = -1;
        m3387b(context, attributeSet);
    }
}

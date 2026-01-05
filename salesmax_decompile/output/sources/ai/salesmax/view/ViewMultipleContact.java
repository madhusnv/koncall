package ai.salesmax.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import p001o.p9e;
import p001o.sbe;
import p001o.sq8;
import p001o.z8e;

/* loaded from: classes2.dex */
public final class ViewMultipleContact extends FrameLayout {

    /* renamed from: a */
    public String f5053a;

    /* renamed from: b */
    public String f5054b;

    /* renamed from: c */
    public int f5055c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewMultipleContact(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f5053a = "";
        this.f5054b = "";
        this.f5055c = -1;
        m3379a();
    }

    /* renamed from: a */
    public final void m3379a() {
        LayoutInflater.from(getContext()).inflate(p9e.view_mutiple_contact, this);
    }

    /* renamed from: b */
    public final void m3380b(Context context, AttributeSet attributeSet) {
        m3379a();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sbe.ViewMultipleContact, 0, 0);
        sq8.m48648g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f5054b = typedArrayObtainStyledAttributes.getString(sbe.ViewMultipleContact_superfone_mutiplecontact_data_value);
            this.f5055c = typedArrayObtainStyledAttributes.getResourceId(sbe.ViewMultipleContact_superfone_mutiplecontact_data_icon, -1);
            setViewMutiplecontactDataValue(this.f5054b);
            m3381c();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public final void m3381c() {
        if (this.f5055c != -1) {
            ((ImageView) findViewById(z8e.vpt_Icon)).setImageResource(this.f5055c);
        }
    }

    public final String getValue() {
        return this.f5054b;
    }

    public final void setVETValue() {
        ((MaterialTextView) findViewById(z8e.vpt_Value)).setText(this.f5054b);
    }

    public final void setViewMutiplecontactDataValue(String str) {
        if (str != null) {
            this.f5054b = str;
            setVETValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewMultipleContact(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        this.f5053a = "";
        this.f5054b = "";
        this.f5055c = -1;
        m3380b(context, attributeSet);
    }
}

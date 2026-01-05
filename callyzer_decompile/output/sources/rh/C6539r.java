package rh;

import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.datepicker.ViewOnClickListenerC1348l;
import com.google.android.material.textfield.TextInputLayout;
import com.websoptimization.callyzerbiz.R;
import java.util.LinkedHashSet;
import pg.s8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.r */
/* loaded from: classes.dex */
public final class C6539r extends AbstractC6536o {

    /* renamed from: d */
    public final C6531j f31365d;

    /* renamed from: e */
    public final C6524c f31366e;

    /* renamed from: f */
    public final C6525d f31367f;

    public C6539r(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f31365d = new C6531j(this, 1);
        this.f31366e = new C6524c(this, 2);
        this.f31367f = new C6525d(this, 2);
    }

    /* renamed from: d */
    public static boolean m12570d(C6539r c6539r) {
        EditText editText = c6539r.f31336a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // rh.AbstractC6536o
    /* renamed from: a */
    public final void mo12551a() {
        Drawable drawableM11864b = s8.m11864b(this.f31337b, R.drawable.design_password_eye);
        TextInputLayout textInputLayout = this.f31336a;
        textInputLayout.setEndIconDrawable(drawableM11864b);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC1348l(6, this));
        LinkedHashSet linkedHashSet = textInputLayout.f43897k1;
        C6524c c6524c = this.f31366e;
        linkedHashSet.add(c6524c);
        if (textInputLayout.f6960e != null) {
            c6524c.m12550a(textInputLayout);
        }
        textInputLayout.f43901o1.add(this.f31367f);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }
}

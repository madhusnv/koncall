package p001o;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.C11154a;

/* loaded from: classes3.dex */
public class vzc extends w76 {

    /* renamed from: e */
    public int f51070e;

    /* renamed from: f */
    public EditText f51071f;

    /* renamed from: g */
    public final View.OnClickListener f51072g;

    public vzc(C11154a c11154a, int i) {
        super(c11154a);
        this.f51070e = u7e.design_password_eye;
        this.f51072g = new View.OnClickListener() { // from class: o.uzc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49707a.m53632y(view);
            }
        };
        if (i != 0) {
            this.f51070e = i;
        }
    }

    /* renamed from: x */
    public static boolean m53631x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m53632y(View view) {
        EditText editText = this.f51071f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (m53634w()) {
            this.f51071f.setTransformationMethod(null);
        } else {
            this.f51071f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f51071f.setSelection(selectionEnd);
        }
        m54035r();
    }

    @Override // p001o.w76
    /* renamed from: b */
    public void mo53633b(CharSequence charSequence, int i, int i2, int i3) {
        m54035r();
    }

    @Override // p001o.w76
    /* renamed from: c */
    public int mo24010c() {
        return v9e.password_toggle_content_description;
    }

    @Override // p001o.w76
    /* renamed from: d */
    public int mo24011d() {
        return this.f51070e;
    }

    @Override // p001o.w76
    /* renamed from: f */
    public View.OnClickListener mo24013f() {
        return this.f51072g;
    }

    @Override // p001o.w76
    /* renamed from: l */
    public boolean mo24018l() {
        return true;
    }

    @Override // p001o.w76
    /* renamed from: m */
    public boolean mo24019m() {
        return !m53634w();
    }

    @Override // p001o.w76
    /* renamed from: n */
    public void mo24020n(EditText editText) {
        this.f51071f = editText;
        m54035r();
    }

    @Override // p001o.w76
    /* renamed from: s */
    public void mo24023s() {
        if (m53631x(this.f51071f)) {
            this.f51071f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // p001o.w76
    /* renamed from: u */
    public void mo24025u() {
        EditText editText = this.f51071f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: w */
    public final boolean m53634w() {
        EditText editText = this.f51071f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}

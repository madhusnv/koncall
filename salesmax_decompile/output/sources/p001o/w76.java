package p001o;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.C11154a;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public abstract class w76 {

    /* renamed from: a */
    public final TextInputLayout f51557a;

    /* renamed from: b */
    public final C11154a f51558b;

    /* renamed from: c */
    public final Context f51559c;

    /* renamed from: d */
    public final CheckableImageButton f51560d;

    public w76(C11154a c11154a) {
        this.f51557a = c11154a.f13129a;
        this.f51558b = c11154a;
        this.f51559c = c11154a.getContext();
        this.f51560d = c11154a.m15434s();
    }

    /* renamed from: a */
    public void mo24009a(Editable editable) {
    }

    /* renamed from: b */
    public void mo53633b(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public int mo24010c() {
        return 0;
    }

    /* renamed from: d */
    public int mo24011d() {
        return 0;
    }

    /* renamed from: e */
    public View.OnFocusChangeListener mo24012e() {
        return null;
    }

    /* renamed from: f */
    public View.OnClickListener mo24013f() {
        return null;
    }

    /* renamed from: g */
    public View.OnFocusChangeListener mo46470g() {
        return null;
    }

    /* renamed from: h */
    public AccessibilityManager.TouchExplorationStateChangeListener mo24014h() {
        return null;
    }

    /* renamed from: i */
    public boolean mo24015i(int i) {
        return true;
    }

    /* renamed from: j */
    public boolean mo24016j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo24017k() {
        return false;
    }

    /* renamed from: l */
    public boolean mo24018l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo24019m() {
        return false;
    }

    /* renamed from: n */
    public void mo24020n(EditText editText) {
    }

    /* renamed from: o */
    public void mo24021o(View view, cc ccVar) {
    }

    /* renamed from: p */
    public void mo24022p(View view, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: q */
    public void mo46471q(boolean z) {
    }

    /* renamed from: r */
    public final void m54035r() {
        this.f51558b.m15408M(false);
    }

    /* renamed from: s */
    public void mo24023s() {
    }

    /* renamed from: t */
    public boolean mo24024t() {
        return false;
    }

    /* renamed from: u */
    public void mo24025u() {
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import p001o.dcc;
import p001o.dkh;
import p001o.fk0;
import p001o.gj8;
import p001o.gjh;
import p001o.hjh;
import p001o.hk0;
import p001o.i46;
import p001o.kk0;
import p001o.n24;
import p001o.nk0;
import p001o.oj0;
import p001o.ok0;
import p001o.wvi;
import p001o.xmh;
import p001o.z5e;

/* loaded from: classes2.dex */
public class AppCompatEditText extends EditText implements dcc {

    /* renamed from: a */
    public final oj0 f5801a;

    /* renamed from: b */
    public final ok0 f5802b;

    /* renamed from: c */
    public final nk0 f5803c;

    /* renamed from: d */
    public final hjh f5804d;

    /* renamed from: e */
    public final fk0 f5805e;

    /* renamed from: f */
    public C1825a f5806f;

    /* renamed from: androidx.appcompat.widget.AppCompatEditText$a */
    public class C1825a {
        public C1825a() {
        }

        /* renamed from: a */
        public TextClassifier m4209a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        /* renamed from: b */
        public void m4210b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    private C1825a getSuperCaller() {
        if (this.f5806f == null) {
            this.f5806f = new C1825a();
        }
        return this.f5806f;
    }

    @Override // p001o.dcc
    /* renamed from: a */
    public n24 mo4207a(n24 n24Var) {
        return this.f5804d.mo20848a(this, n24Var);
    }

    /* renamed from: d */
    public void m4208d(fk0 fk0Var) {
        KeyListener keyListener = getKeyListener();
        if (fk0Var.m26941b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerM26940a = fk0Var.m26940a(keyListener);
            if (keyListenerM26940a == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM26940a);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        oj0 oj0Var = this.f5801a;
        if (oj0Var != null) {
            oj0Var.m42283b();
        }
        ok0 ok0Var = this.f5802b;
        if (ok0Var != null) {
            ok0Var.m42318b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return gjh.m28916o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        oj0 oj0Var = this.f5801a;
        if (oj0Var != null) {
            return oj0Var.m42284c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oj0 oj0Var = this.f5801a;
        if (oj0Var != null) {
            return oj0Var.m42285d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5802b.m42325j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5802b.m42326k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        nk0 nk0Var;
        return (Build.VERSION.SDK_INT >= 28 || (nk0Var = this.f5803c) == null) ? getSuperCaller().m4209a() : nk0Var.m40715a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM55090C;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f5802b.m42333r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionM30674a = hk0.m30674a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionM30674a != null && Build.VERSION.SDK_INT <= 30 && (strArrM55090C = wvi.m55090C(this)) != null) {
            i46.m31487d(editorInfo, strArrM55090C);
            inputConnectionM30674a = gj8.m28856c(this, inputConnectionM30674a, editorInfo);
        }
        return this.f5805e.m26943d(inputConnectionM30674a, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (kk0.m35791a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (kk0.m35792b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oj0 oj0Var = this.f5801a;
        if (oj0Var != null) {
            oj0Var.m42287f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oj0 oj0Var = this.f5801a;
        if (oj0Var != null) {
            oj0Var.m42288g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5802b;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5802b;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(gjh.m28917p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f5805e.m26944e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f5805e.m26940a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        oj0 oj0Var = this.f5801a;
        if (oj0Var != null) {
            oj0Var.m42290i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oj0 oj0Var = this.f5801a;
        if (oj0Var != null) {
            oj0Var.m42291j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f5802b.m42338w(colorStateList);
        this.f5802b.m42318b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f5802b.m42339x(mode);
        this.f5802b.m42318b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ok0 ok0Var = this.f5802b;
        if (ok0Var != null) {
            ok0Var.m42332q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        nk0 nk0Var;
        if (Build.VERSION.SDK_INT >= 28 || (nk0Var = this.f5803c) == null) {
            getSuperCaller().m4210b(textClassifier);
        } else {
            nk0Var.m40716b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(xmh.m56486b(context), attributeSet, i);
        dkh.m23377a(this, getContext());
        oj0 oj0Var = new oj0(this);
        this.f5801a = oj0Var;
        oj0Var.m42286e(attributeSet, i);
        ok0 ok0Var = new ok0(this);
        this.f5802b = ok0Var;
        ok0Var.m42328m(attributeSet, i);
        ok0Var.m42318b();
        this.f5803c = new nk0(this);
        this.f5804d = new hjh();
        fk0 fk0Var = new fk0(this);
        this.f5805e = fk0Var;
        fk0Var.m26942c(attributeSet, i);
        m4208d(fk0Var);
    }
}

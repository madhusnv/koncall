package p013o;

import a1.c0;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import c4.C0861k;
import c6.C0875e;
import c6.C0877g;
import c6.InterfaceC0874d;
import c6.InterfaceC0894x;
import c6.v0;
import c9.C0917l;
import com.websoptimization.callyzerbiz.R;
import e6.AbstractC1960c;
import e6.C1961d;
import e6.C1962e;
import g6.C2535j;
import iz.C3378k;
import og.bg;
import og.ga;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.t */
/* loaded from: classes.dex */
public abstract class AbstractC5234t extends EditText implements InterfaceC0894x {

    /* renamed from: a */
    public final C5228n f25641a;

    /* renamed from: b */
    public final f0 f25642b;

    /* renamed from: c */
    public final a0 f25643c;

    /* renamed from: d */
    public final C2535j f25644d;

    /* renamed from: e */
    public final C0917l f25645e;

    /* renamed from: f */
    public C5233s f25646f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5234t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        w1.m10301a(context);
        v1.m10297a(getContext(), this);
        C5228n c5228n = new C5228n(this);
        this.f25641a = c5228n;
        c5228n.m10258d(attributeSet, R.attr.editTextStyle);
        f0 f0Var = new f0(this);
        this.f25642b = f0Var;
        f0Var.m10229d(attributeSet, R.attr.editTextStyle);
        f0Var.m10228b();
        a0 a0Var = new a0();
        a0Var.f25434a = this;
        this.f25643c = a0Var;
        this.f25644d = new C2535j();
        C0917l c0917l = new C0917l(this);
        this.f25645e = c0917l;
        c0917l.m2645l(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM2642h = c0917l.m2642h(keyListener);
        if (keyListenerM2642h == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM2642h);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C5233s getSuperCaller() {
        if (this.f25646f == null) {
            this.f25646f = new C5233s(this);
        }
        return this.f25646f;
    }

    @Override // c6.InterfaceC0894x
    /* renamed from: a */
    public final C0877g mo2388a(C0877g c0877g) {
        this.f25644d.getClass();
        return C2535j.m6561a(this, c0877g);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C5228n c5228n = this.f25641a;
        if (c5228n != null) {
            c5228n.m10255a();
        }
        f0 f0Var = this.f25642b;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return bg.m10564f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5228n c5228n = this.f25641a;
        if (c5228n != null) {
            return c5228n.m10256b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5228n c5228n = this.f25641a;
        if (c5228n != null) {
            return c5228n.m10257c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C3378k c3378k = this.f25642b.f25487h;
        if (c3378k != null) {
            return (ColorStateList) c3378k.f17915c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C3378k c3378k = this.f25642b.f25487h;
        if (c3378k != null) {
            return (PorterDuff.Mode) c3378k.f17916d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f25643c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = a0Var.f25435b;
        return textClassifier == null ? AbstractC5240z.m10306a(a0Var.f25434a) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM2522d;
        InputConnection c1962e;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f25642b.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC1960c.m5709c(editorInfo, getText());
        }
        ga.m10663a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i10 <= 30 && (strArrM2522d = v0.m2522d(this)) != null) {
            AbstractC1960c.m5708b(editorInfo, strArrM2522d);
            c0 c0Var = new c0(10, this);
            if (i10 >= 25) {
                c1962e = new C1961d(inputConnectionOnCreateInputConnection, c0Var);
            } else if (AbstractC1960c.m5707a(editorInfo).length != 0) {
                c1962e = new C1962e(inputConnectionOnCreateInputConnection, c0Var);
            }
            inputConnectionOnCreateInputConnection = c1962e;
        }
        return this.f25645e.m2647n(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM10304a = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && v0.m2522d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM10304a = AbstractC5239y.m10304a(dragEvent, this, activity);
            }
        }
        if (zM10304a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        InterfaceC0874d c0861k;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 || v0.m2522d(this) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return super.onTextContextMenuItem(i10);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i11 >= 31) {
                c0861k = new C0861k(primaryClip, 1);
            } else {
                C0875e c0875e = new C0875e();
                c0875e.f5441b = primaryClip;
                c0875e.f5442c = 1;
                c0861k = c0875e;
            }
            c0861k.mo2305c(i10 == 16908322 ? 0 : 1);
            v0.m2524f(this, c0861k.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5228n c5228n = this.f25641a;
        if (c5228n != null) {
            c5228n.m10259e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5228n c5228n = this.f25641a;
        if (c5228n != null) {
            c5228n.m10260f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f25642b;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.f25642b;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(bg.m10565g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f25645e.m2652s(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f25645e.m2642h(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5228n c5228n = this.f25641a;
        if (c5228n != null) {
            c5228n.m10262h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5228n c5228n = this.f25641a;
        if (c5228n != null) {
            c5228n.m10263i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f0 f0Var = this.f25642b;
        f0Var.m10234i(colorStateList);
        f0Var.m10228b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f0 f0Var = this.f25642b;
        f0Var.m10235j(mode);
        f0Var.m10228b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f0 f0Var = this.f25642b;
        if (f0Var != null) {
            f0Var.m10230e(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f25643c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.f25435b = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}

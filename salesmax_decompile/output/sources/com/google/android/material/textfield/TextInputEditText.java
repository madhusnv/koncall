package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import p001o.aqa;
import p001o.bkh;
import p001o.ebe;
import p001o.gza;
import p001o.pae;
import p001o.z5e;

/* loaded from: classes3.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: g */
    public final Rect f13099g;

    /* renamed from: h */
    public boolean f13100h;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final boolean m15332e(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f13100h;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m15332e(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f13099g);
        rect.bottom = this.f13099g.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m15332e(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.m15366V()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m15366V() && super.getHint() == null && aqa.m17659d()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m15332e(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f13099g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f13099g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f13100h = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(gza.m29680d(context, attributeSet, i, 0), attributeSet, i);
        this.f13099g = new Rect();
        TypedArray typedArrayM19305i = bkh.m19305i(context, attributeSet, ebe.TextInputEditText, i, pae.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayM19305i.getBoolean(ebe.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        typedArrayM19305i.recycle();
    }
}

package com.google.android.material.textfield;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.websoptimization.callyzerbiz.R;
import java.util.Locale;
import lh.AbstractC4475k;
import p013o.AbstractC5234t;
import sh.AbstractC6844a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class TextInputEditText extends AbstractC5234t {

    /* renamed from: g */
    public final Rect f6939g;

    /* renamed from: h */
    public boolean f6940h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(AbstractC6844a.m13042a(context, attributeSet, R.attr.editTextStyle, 0), attributeSet);
        this.f6939g = new Rect();
        AbstractC4475k.m9324a(context, attributeSet, R.attr.editTextStyle, R.style.Widget_Design_TextInputEditText);
        int[] iArr = AbstractC0143a.f474w;
        AbstractC4475k.m9325b(context, attributeSet, iArr, R.attr.editTextStyle, R.style.Widget_Design_TextInputEditText, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.editTextStyle, R.style.Widget_Design_TextInputEditText);
        setTextInputLayoutFocusedRectEnabled(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
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

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f6940h || rect == null) {
            return;
        }
        Rect rect2 = this.f6939g;
        textInputLayout.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f6940h && rect != null) {
            Rect rect2 = this.f6939g;
            textInputLayout.getGlobalVisibleRect(rect2, point);
            rect.bottom = rect2.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.f6946G) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f6946G && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // p013o.AbstractC5234t, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean zRequestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f6940h) {
            int height = textInputLayout.getHeight() - getResources().getDimensionPixelOffset(R.dimen.mtrl_edittext_rectangle_top_offset);
            int width = textInputLayout.getWidth();
            int height2 = textInputLayout.getHeight();
            Rect rect2 = this.f6939g;
            rect2.set(0, height, width, height2);
            textInputLayout.requestRectangleOnScreen(rect2, true);
        }
        return zRequestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z6) {
        this.f6940h = z6;
    }
}

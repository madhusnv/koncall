package com.facebook;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookButtonBase;
import p001o.a94;
import p001o.ao8;
import p001o.c64;
import p001o.nae;
import p001o.p6e;
import p001o.qj7;
import p001o.sq8;
import p001o.ur6;
import p001o.ys;

@SuppressLint({"ResourceType"})
/* loaded from: classes5.dex */
public abstract class FacebookButtonBase extends Button {

    /* renamed from: a */
    public final String f11309a;

    /* renamed from: b */
    public final String f11310b;

    /* renamed from: c */
    public View.OnClickListener f11311c;

    /* renamed from: d */
    public View.OnClickListener f11312d;

    /* renamed from: e */
    public boolean f11313e;

    /* renamed from: f */
    public int f11314f;

    /* renamed from: g */
    public int f11315g;

    /* renamed from: h */
    public qj7 f11316h;

    /* renamed from: q */
    public final int f11317q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookButtonBase(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, 0);
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "analyticsButtonCreatedEventName");
        sq8.m48649h(str2, "analyticsButtonTappedEventName");
        i2 = i2 == 0 ? getDefaultStyleResource() : i2;
        mo12809c(context, attributeSet, i, i2 == 0 ? nae.com_facebook_button : i2);
        this.f11309a = str;
        this.f11310b = str2;
        setClickable(true);
        setFocusable(true);
    }

    /* renamed from: l */
    public static final void m12807l(FacebookButtonBase facebookButtonBase, View view) {
        if (a94.m16694d(FacebookButtonBase.class)) {
            return;
        }
        try {
            sq8.m48649h(facebookButtonBase, "this$0");
            facebookButtonBase.m12811e(facebookButtonBase.getContext());
            View.OnClickListener onClickListener = facebookButtonBase.f11312d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            View.OnClickListener onClickListener2 = facebookButtonBase.f11311c;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
            }
        } catch (Throwable th) {
            a94.m16692b(th, FacebookButtonBase.class);
        }
    }

    /* renamed from: b */
    public void m12808b(View view) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.f11311c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: c */
    public void mo12809c(Context context, AttributeSet attributeSet, int i, int i2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(context, "context");
            m12813g(context, attributeSet, i, i2);
            m12814h(context, attributeSet, i, i2);
            m12815i(context, attributeSet, i, i2);
            m12816j(context, attributeSet, i, i2);
            m12817k();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: d */
    public void m12810d(Context context) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            ao8.f15070b.m17568a(context, null).m17563f(this.f11309a);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: e */
    public void m12811e(Context context) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            ao8.f15070b.m17568a(context, null).m17563f(this.f11310b);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: f */
    public int m12812f(String str) {
        if (a94.m16694d(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(str));
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return 0;
        }
    }

    /* renamed from: g */
    public final void m12813g(Context context, AttributeSet attributeSet, int i, int i2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.background}, i, i2);
            sq8.m48648g(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(c64.getColor(context, p6e.com_facebook_blue));
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public Activity getActivity() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new ur6("Unable to get Activity.");
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    public final String getAnalyticsButtonCreatedEventName() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return this.f11309a;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    public final String getAnalyticsButtonTappedEventName() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return this.f11310b;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    public final ys getAndroidxActivityResultRegistryOwner() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            ComponentCallbacks2 activity = getActivity();
            if (activity instanceof ys) {
                return (ys) activity;
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (a94.m16694d(this)) {
            return 0;
        }
        try {
            return this.f11313e ? this.f11314f : super.getCompoundPaddingLeft();
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (a94.m16694d(this)) {
            return 0;
        }
        try {
            return this.f11313e ? this.f11315g : super.getCompoundPaddingRight();
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return 0;
        }
    }

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        if (a94.m16694d(this)) {
            return 0;
        }
        try {
            return this.f11317q;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return 0;
        }
    }

    public final Fragment getFragment() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            qj7 qj7Var = this.f11316h;
            if (qj7Var != null) {
                return qj7Var.m45545c();
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    public final android.app.Fragment getNativeFragment() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            qj7 qj7Var = this.f11316h;
            if (qj7Var != null) {
                return qj7Var.m45544b();
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    public int getRequestCode() {
        if (a94.m16694d(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return 0;
        }
    }

    /* renamed from: h */
    public final void m12814h(Context context, AttributeSet attributeSet, int i, int i2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.drawableLeft, R.attr.drawableTop, R.attr.drawableRight, R.attr.drawableBottom, R.attr.drawablePadding}, i, i2);
            sq8.m48648g(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                setCompoundDrawablesWithIntrinsicBounds(typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0), typedArrayObtainStyledAttributes.getResourceId(2, 0), typedArrayObtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                typedArrayObtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            a94.m16692b(th2, this);
        }
    }

    /* renamed from: i */
    public final void m12815i(Context context, AttributeSet attributeSet, int i, int i2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.paddingLeft, R.attr.paddingTop, R.attr.paddingRight, R.attr.paddingBottom}, i, i2);
            sq8.m48648g(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: j */
    public final void m12816j(Context context, AttributeSet attributeSet, int i, int i2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.textColor}, i, i2);
            sq8.m48648g(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
            try {
                setTextColor(typedArrayObtainStyledAttributes.getColorStateList(0));
                typedArrayObtainStyledAttributes.recycle();
                typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.gravity}, i, i2);
                sq8.m48648g(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                try {
                    int i3 = typedArrayObtainStyledAttributes.getInt(0, 17);
                    typedArrayObtainStyledAttributes.recycle();
                    setGravity(i3);
                    typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.textSize, R.attr.textStyle, R.attr.text}, i, i2);
                    sq8.m48648g(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…efStyleAttr, defStyleRes)");
                    try {
                        setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
                        setTypeface(Typeface.create(getTypeface(), 1));
                        String string = typedArrayObtainStyledAttributes.getString(2);
                        typedArrayObtainStyledAttributes.recycle();
                        setText(string);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: k */
    public final void m12817k() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            super.setOnClickListener(new View.OnClickListener() { // from class: o.or6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FacebookButtonBase.m12807l(this.f38790a, view);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (isInEditMode()) {
                return;
            }
            m12810d(getContext());
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(canvas, "canvas");
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int iMin = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - m12812f(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.f11314f = compoundPaddingLeft - iMin;
                this.f11315g = compoundPaddingRight + iMin;
                this.f11313e = true;
            }
            super.onDraw(canvas);
            this.f11313e = false;
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public final void setFragment(android.app.Fragment fragment) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(fragment, "fragment");
            this.f11316h = new qj7(fragment);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            this.f11312d = onClickListener;
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            this.f11311c = onClickListener;
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public final void setFragment(Fragment fragment) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(fragment, "fragment");
            this.f11316h = new qj7(fragment);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}

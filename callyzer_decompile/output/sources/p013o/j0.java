package p013o;

import a6.AbstractC0056d;
import a6.C0055c;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c6.e0;
import e6.AbstractC1960c;
import g6.InterfaceC2527b;
import iz.C3378k;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import l4.d0;
import og.bg;
import og.ga;
import pg.AbstractC5942w;
import pg.g6;
import pg.s8;
import u5.AbstractC7341c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class j0 extends TextView implements InterfaceC2527b {
    private final C5228n mBackgroundTintHelper;
    private C5235u mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<AbstractC0056d> mPrecomputedTextFuture;
    private g0 mSuperCaller;
    private final a0 mTextClassifierHelper;
    private final f0 mTextHelper;

    public j0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C5235u getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C5235u(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5228n c5228n = this.mBackgroundTintHelper;
        if (c5228n != null) {
            c5228n.m10255a();
        }
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (l2.f25576a) {
            return super.getAutoSizeMaxTextSize();
        }
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            return Math.round(f0Var.f25488i.f25600e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (l2.f25576a) {
            return super.getAutoSizeMinTextSize();
        }
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            return Math.round(f0Var.f25488i.f25599d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (l2.f25576a) {
            return super.getAutoSizeStepGranularity();
        }
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            return Math.round(f0Var.f25488i.f25598c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (l2.f25576a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        f0 f0Var = this.mTextHelper;
        return f0Var != null ? f0Var.f25488i.f25601f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (l2.f25576a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            return f0Var.f25488i.f25596a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return bg.m10564f(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public g0 getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.mSuperCaller = new i0(this);
            } else if (i10 >= 28) {
                this.mSuperCaller = new h0(this);
            } else if (i10 >= 26) {
                this.mSuperCaller = new d0(7, this);
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C5228n c5228n = this.mBackgroundTintHelper;
        if (c5228n != null) {
            return c5228n.m10256b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5228n c5228n = this.mBackgroundTintHelper;
        if (c5228n != null) {
            return c5228n.m10257c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C3378k c3378k = this.mTextHelper.f25487h;
        if (c3378k != null) {
            return (ColorStateList) c3378k.f17915c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C3378k c3378k = this.mTextHelper.f25487h;
        if (c3378k != null) {
            return (PorterDuff.Mode) c3378k.f17916d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<AbstractC0056d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                bg.m10560b(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = a0Var.f25435b;
        return textClassifier == null ? AbstractC5240z.m10306a(a0Var.f25434a) : textClassifier;
    }

    public C0055c getTextMetricsParamsCompat() {
        return bg.m10560b(this);
    }

    public boolean isEmojiCompatEnabled() {
        return ((g6) getEmojiTextViewHelper().f25652b.f36778a).mo11653d();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            AbstractC1960c.m5709c(editorInfo, getText());
        }
        ga.m10663a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        f0 f0Var = this.mTextHelper;
        if (f0Var == null || l2.f25576a) {
            return;
        }
        f0Var.f25488i.m10266a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future<AbstractC0056d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                bg.m10560b(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        f0 f0Var = this.mTextHelper;
        if (f0Var == null || l2.f25576a || !f0Var.f25488i.m10268e()) {
            return;
        }
        this.mTextHelper.f25488i.m10266a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        ((g6) getEmojiTextViewHelper().f25652b.f36778a).mo11654f(z6);
    }

    @Override // android.widget.TextView, g6.InterfaceC2527b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (l2.f25576a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            f0Var.m10231f(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (l2.f25576a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            f0Var.m10232g(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (l2.f25576a) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            f0Var.m10233h(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5228n c5228n = this.mBackgroundTintHelper;
        if (c5228n != null) {
            c5228n.m10259e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C5228n c5228n = this.mBackgroundTintHelper;
        if (c5228n != null) {
            c5228n.m10260f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(bg.m10565g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        ((g6) getEmojiTextViewHelper().f25652b.f36778a).mo11655g(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((g6) getEmojiTextViewHelper().f25652b.f36778a).mo11652a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo9082i(i10);
        } else {
            bg.m10561c(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo9081g(i10);
        } else {
            bg.m10562d(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        bg.m10563e(this, i10);
    }

    public void setPrecomputedText(AbstractC0056d abstractC0056d) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        bg.m10560b(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C5228n c5228n = this.mBackgroundTintHelper;
        if (c5228n != null) {
            c5228n.m10262h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C5228n c5228n = this.mBackgroundTintHelper;
        if (c5228n != null) {
            c5228n.m10263i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m10234i(colorStateList);
        this.mTextHelper.m10228b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m10235j(mode);
        this.mTextHelper.m10228b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            f0Var.m10230e(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.f25435b = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0056d> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0055c c0055c) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0055c.f229b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(c0055c.f228a);
        setBreakStrategy(c0055c.f230c);
        setHyphenationFrequency(c0055c.f231d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f6) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z6 = l2.f25576a;
        if (z6) {
            super.setTextSize(i10, f6);
            return;
        }
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            o0 o0Var = f0Var.f25488i;
            if (z6 || o0Var.m10268e()) {
                return;
            }
            o0Var.m10269f(f6, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC5942w abstractC5942w = AbstractC7341c.f34961a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        w1.m10301a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        v1.m10297a(getContext(), this);
        C5228n c5228n = new C5228n(this);
        this.mBackgroundTintHelper = c5228n;
        c5228n.m10258d(attributeSet, i10);
        f0 f0Var = new f0(this);
        this.mTextHelper = f0Var;
        f0Var.m10229d(attributeSet, i10);
        f0Var.m10228b();
        a0 a0Var = new a0();
        a0Var.f25434a = this;
        this.mTextClassifierHelper = a0Var;
        getEmojiTextViewHelper().m10290a(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f6) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            getSuperCaller().mo9083k(i10, f6);
        } else if (i11 >= 34) {
            e0.m2373t(this, i10, f6);
        } else {
            bg.m10563e(this, Math.round(TypedValue.applyDimension(i10, f6, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? s8.m11864b(context, i10) : null, i11 != 0 ? s8.m11864b(context, i11) : null, i12 != 0 ? s8.m11864b(context, i12) : null, i13 != 0 ? s8.m11864b(context, i13) : null);
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? s8.m11864b(context, i10) : null, i11 != 0 ? s8.m11864b(context, i11) : null, i12 != 0 ? s8.m11864b(context, i12) : null, i13 != 0 ? s8.m11864b(context, i13) : null);
        f0 f0Var = this.mTextHelper;
        if (f0Var != null) {
            f0Var.m10228b();
        }
    }
}

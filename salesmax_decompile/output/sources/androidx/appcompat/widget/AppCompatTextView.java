package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p001o.agd;
import p001o.dkh;
import p001o.fzh;
import p001o.gjh;
import p001o.gk0;
import p001o.hk0;
import p001o.lk0;
import p001o.nk0;
import p001o.oj0;
import p001o.ok0;
import p001o.tq;
import p001o.xmh;
import p001o.yzi;

/* loaded from: classes2.dex */
public class AppCompatTextView extends TextView {

    /* renamed from: a */
    public final oj0 f5850a;

    /* renamed from: b */
    public final ok0 f5851b;

    /* renamed from: c */
    public final nk0 f5852c;

    /* renamed from: d */
    public gk0 f5853d;

    /* renamed from: e */
    public boolean f5854e;

    /* renamed from: f */
    public InterfaceC1834a f5855f;

    /* renamed from: g */
    public Future f5856g;

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$a */
    public interface InterfaceC1834a {
        /* renamed from: a */
        void mo4249a(int[] iArr, int i);

        /* renamed from: b */
        void mo4250b(int i);

        /* renamed from: c */
        int mo4251c();

        /* renamed from: d */
        int mo4252d();

        /* renamed from: e */
        void mo4253e(int i, float f);

        /* renamed from: f */
        int[] mo4254f();

        /* renamed from: g */
        TextClassifier mo4255g();

        /* renamed from: h */
        int mo4256h();

        /* renamed from: i */
        void mo4257i(TextClassifier textClassifier);

        /* renamed from: j */
        void mo4258j(int i, int i2, int i3, int i4);

        /* renamed from: k */
        void mo4259k(int i);

        /* renamed from: l */
        int mo4260l();

        /* renamed from: m */
        void mo4261m(int i);
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$b */
    public class C1835b implements InterfaceC1834a {
        public C1835b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: a */
        public void mo4249a(int[] iArr, int i) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: b */
        public void mo4250b(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: c */
        public int mo4251c() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: d */
        public int mo4252d() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: e */
        public void mo4253e(int i, float f) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: f */
        public int[] mo4254f() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: g */
        public TextClassifier mo4255g() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: h */
        public int mo4256h() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: i */
        public void mo4257i(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: j */
        public void mo4258j(int i, int i2, int i3, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: k */
        public void mo4259k(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: l */
        public int mo4260l() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: m */
        public void mo4261m(int i) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$c */
    public class C1836c extends C1835b {
        public C1836c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.C1835b, androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: b */
        public void mo4250b(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.C1835b, androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: k */
        public void mo4259k(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$d */
    public class C1837d extends C1836c {
        public C1837d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.C1835b, androidx.appcompat.widget.AppCompatTextView.InterfaceC1834a
        /* renamed from: e */
        public void mo4253e(int i, float f) {
            AppCompatTextView.super.setLineHeight(i, f);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private gk0 getEmojiTextViewHelper() {
        if (this.f5853d == null) {
            this.f5853d = new gk0(this);
        }
        return this.f5853d;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        oj0 oj0Var = this.f5850a;
        if (oj0Var != null) {
            oj0Var.m42283b();
        }
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42318b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (yzi.f56345c) {
            return getSuperCaller().mo4256h();
        }
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            return ok0Var.m42320e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (yzi.f56345c) {
            return getSuperCaller().mo4252d();
        }
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            return ok0Var.m42321f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (yzi.f56345c) {
            return getSuperCaller().mo4260l();
        }
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            return ok0Var.m42322g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (yzi.f56345c) {
            return getSuperCaller().mo4254f();
        }
        ok0 ok0Var = this.f5851b;
        return ok0Var != null ? ok0Var.m42323h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (yzi.f56345c) {
            return getSuperCaller().mo4251c() == 1 ? 1 : 0;
        }
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            return ok0Var.m42324i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return gjh.m28916o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return gjh.m28902a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return gjh.m28903b(this);
    }

    public InterfaceC1834a getSuperCaller() {
        if (this.f5855f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f5855f = new C1837d();
            } else if (i >= 28) {
                this.f5855f = new C1836c();
            } else if (i >= 26) {
                this.f5855f = new C1835b();
            }
        }
        return this.f5855f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        oj0 oj0Var = this.f5850a;
        if (oj0Var != null) {
            return oj0Var.m42284c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        oj0 oj0Var = this.f5850a;
        if (oj0Var != null) {
            return oj0Var.m42285d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5851b.m42325j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5851b.m42326k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m4248r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        nk0 nk0Var;
        return (Build.VERSION.SDK_INT >= 28 || (nk0Var = this.f5852c) == null) ? getSuperCaller().mo4255g() : nk0Var.m40715a();
    }

    public agd.C12167a getTextMetricsParamsCompat() {
        return gjh.m28906e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f5851b.m42333r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return hk0.m30674a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42330o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m4248r();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ok0 ok0Var = this.f5851b;
        if ((ok0Var == null || yzi.f56345c || !ok0Var.m42327l()) ? false : true) {
            this.f5851b.m42319c();
        }
    }

    /* renamed from: r */
    public final void m4248r() {
        Future future = this.f5856g;
        if (future != null) {
            try {
                this.f5856g = null;
                tq.m50332a(future.get());
                gjh.m28913l(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m28942d(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (yzi.f56345c) {
            getSuperCaller().mo4258j(i, i2, i3, i4);
            return;
        }
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42335t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (yzi.f56345c) {
            getSuperCaller().mo4249a(iArr, i);
            return;
        }
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42336u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (yzi.f56345c) {
            getSuperCaller().mo4261m(i);
            return;
        }
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42337v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        oj0 oj0Var = this.f5850a;
        if (oj0Var != null) {
            oj0Var.m42287f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        oj0 oj0Var = this.f5850a;
        if (oj0Var != null) {
            oj0Var.m42288g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(gjh.m28917p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m28943e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m28939a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo4259k(i);
        } else {
            gjh.m28909h(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo4250b(i);
        } else {
            gjh.m28910i(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        gjh.m28911j(this, i);
    }

    public void setPrecomputedText(agd agdVar) {
        gjh.m28913l(this, agdVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        oj0 oj0Var = this.f5850a;
        if (oj0Var != null) {
            oj0Var.m42290i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        oj0 oj0Var = this.f5850a;
        if (oj0Var != null) {
            oj0Var.m42291j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f5851b.m42338w(colorStateList);
        this.f5851b.m42318b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f5851b.m42339x(mode);
        this.f5851b.m42318b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42332q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        nk0 nk0Var;
        if (Build.VERSION.SDK_INT >= 28 || (nk0Var = this.f5852c) == null) {
            getSuperCaller().mo4257i(textClassifier);
        } else {
            nk0Var.m40716b(textClassifier);
        }
    }

    public void setTextFuture(Future<agd> future) {
        this.f5856g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(agd.C12167a c12167a) {
        gjh.m28915n(this, c12167a);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (yzi.f56345c) {
            super.setTextSize(i, f);
            return;
        }
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42314A(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.f5854e) {
            return;
        }
        Typeface typefaceM27828a = (typeface == null || i <= 0) ? null : fzh.m27828a(getContext(), typeface, i);
        this.f5854e = true;
        if (typefaceM27828a != null) {
            typeface = typefaceM27828a;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f5854e = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().mo4253e(i, f);
        } else {
            gjh.m28912k(this, i, f);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(xmh.m56486b(context), attributeSet, i);
        this.f5854e = false;
        this.f5855f = null;
        dkh.m23377a(this, getContext());
        oj0 oj0Var = new oj0(this);
        this.f5850a = oj0Var;
        oj0Var.m42286e(attributeSet, i);
        ok0 ok0Var = new ok0(this);
        this.f5851b = ok0Var;
        ok0Var.m42328m(attributeSet, i);
        ok0Var.m42318b();
        this.f5852c = new nk0(this);
        getEmojiTextViewHelper().m28941c(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? lk0.m37353b(context, i) : null, i2 != 0 ? lk0.m37353b(context, i2) : null, i3 != 0 ? lk0.m37353b(context, i3) : null, i4 != 0 ? lk0.m37353b(context, i4) : null);
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? lk0.m37353b(context, i) : null, i2 != 0 ? lk0.m37353b(context, i2) : null, i3 != 0 ? lk0.m37353b(context, i3) : null, i4 != 0 ? lk0.m37353b(context, i4) : null);
        ok0 ok0Var = this.f5851b;
        if (ok0Var != null) {
            ok0Var.m42331p();
        }
    }
}

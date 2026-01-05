package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import androidx.transition.AbstractC2524c;
import androidx.transition.Fade;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.objectweb.asm.Opcodes;
import p001o.anh;
import p001o.bi8;
import p001o.bkh;
import p001o.c64;
import p001o.cc;
import p001o.db;
import p001o.ebe;
import p001o.ek0;
import p001o.f46;
import p001o.fy5;
import p001o.gh0;
import p001o.gjh;
import p001o.gk4;
import p001o.gua;
import p001o.gza;
import p001o.iae;
import p001o.k5g;
import p001o.km5;
import p001o.l5g;
import p001o.lh1;
import p001o.lk0;
import p001o.n8e;
import p001o.pae;
import p001o.qg3;
import p001o.r6e;
import p001o.u3g;
import p001o.umb;
import p001o.v9e;
import p001o.vy5;
import p001o.wvi;
import p001o.x5e;
import p001o.x6e;
import p001o.xzi;
import p001o.ykf;
import p001o.yya;
import p001o.z5e;
import p001o.zya;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int r1 = pae.Widget_Design_TextInputLayout;
    public static final int[][] s1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public boolean A0;
    public zya B0;
    public zya C0;
    public ykf D0;
    public boolean E0;
    public final int F0;
    public int G0;

    /* renamed from: H */
    public int f13101H;
    public int H0;
    public int I0;
    public int J0;
    public int K0;

    /* renamed from: L */
    public boolean f13102L;
    public int L0;

    /* renamed from: M */
    public InterfaceC11152e f13103M;
    public int M0;
    public final Rect N0;
    public final Rect O0;
    public final RectF P0;

    /* renamed from: Q */
    public TextView f13104Q;
    public Typeface Q0;
    public Drawable R0;
    public int S0;
    public final LinkedHashSet T0;
    public Drawable U0;
    public int V0;
    public Drawable W0;
    public ColorStateList X0;
    public ColorStateList Y0;
    public int Z0;

    /* renamed from: a */
    public final FrameLayout f13105a;
    public int a1;

    /* renamed from: b */
    public final u3g f13106b;
    public int b1;

    /* renamed from: c */
    public final C11154a f13107c;
    public ColorStateList c1;

    /* renamed from: d */
    public final int f13108d;
    public int d1;

    /* renamed from: e */
    public EditText f13109e;
    public int e1;

    /* renamed from: f */
    public CharSequence f13110f;
    public int f1;

    /* renamed from: g */
    public int f13111g;
    public int g1;

    /* renamed from: h */
    public int f13112h;
    public int h0;
    public int h1;
    public int i0;
    public int i1;
    public CharSequence j0;
    public boolean j1;
    public boolean k0;
    public final qg3 k1;
    public TextView l0;
    public boolean l1;
    public ColorStateList m0;
    public boolean m1;
    public int n0;
    public ValueAnimator n1;
    public Fade o0;
    public boolean o1;
    public Fade p0;
    public boolean p1;

    /* renamed from: q */
    public int f13113q;
    public ColorStateList q0;
    public boolean q1;
    public ColorStateList r0;

    /* renamed from: s */
    public int f13114s;
    public ColorStateList s0;
    public ColorStateList t0;
    public boolean u0;
    public CharSequence v0;
    public boolean w0;

    /* renamed from: x */
    public final bi8 f13115x;
    public zya x0;

    /* renamed from: y */
    public boolean f13116y;
    public zya y0;
    public StateListDrawable z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11147a();

        /* renamed from: c */
        public CharSequence f13117c;

        /* renamed from: d */
        public boolean f13118d;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        public class C11147a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f13117c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f13117c, parcel, i);
            parcel.writeInt(this.f13118d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13117c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f13118d = parcel.readInt() == 1;
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C11148a implements TextWatcher {

        /* renamed from: a */
        public int f13119a;

        /* renamed from: b */
        public final /* synthetic */ EditText f13120b;

        public C11148a(EditText editText) {
            this.f13120b = editText;
            this.f13119a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.B0(!r0.p1);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f13116y) {
                textInputLayout.q0(editable);
            }
            if (TextInputLayout.this.k0) {
                TextInputLayout.this.F0(editable);
            }
            int lineCount = this.f13120b.getLineCount();
            int i = this.f13119a;
            if (lineCount != i) {
                if (lineCount < i) {
                    int minimumHeight = this.f13120b.getMinimumHeight();
                    int i2 = TextInputLayout.this.i1;
                    if (minimumHeight != i2) {
                        this.f13120b.setMinimumHeight(i2);
                    }
                }
                this.f13119a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class RunnableC11149b implements Runnable {
        public RunnableC11149b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f13107c.m15423h();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C11150c implements ValueAnimator.AnimatorUpdateListener {
        public C11150c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.k1.C0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public static class C11151d extends db {

        /* renamed from: d */
        public final TextInputLayout f13124d;

        public C11151d(TextInputLayout textInputLayout) {
            this.f13124d = textInputLayout;
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            EditText editText = this.f13124d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f13124d.getHint();
            CharSequence error = this.f13124d.getError();
            CharSequence placeholderText = this.f13124d.getPlaceholderText();
            int counterMaxLength = this.f13124d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f13124d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f13124d.m15363S();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z2 ? hint.toString() : "";
            this.f13124d.f13106b.m50899A(ccVar);
            if (z) {
                ccVar.V0(text);
            } else if (!TextUtils.isEmpty(string)) {
                ccVar.V0(string);
                if (z3 && placeholderText != null) {
                    ccVar.V0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                ccVar.V0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    ccVar.B0(string);
                } else {
                    if (z) {
                        string = ((Object) text) + ", " + string;
                    }
                    ccVar.V0(string);
                }
                ccVar.R0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            ccVar.F0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                ccVar.x0(error);
            }
            View viewM19165t = this.f13124d.f13115x.m19165t();
            if (viewM19165t != null) {
                ccVar.D0(viewM19165t);
            }
            this.f13124d.f13107c.m15429n().mo24021o(view, ccVar);
        }

        @Override // p001o.db
        /* renamed from: h */
        public void mo9657h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo9657h(view, accessibilityEvent);
            this.f13124d.f13107c.m15429n().mo24022p(view, accessibilityEvent);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public interface InterfaceC11152e {
        /* renamed from: a */
        int mo15388a(Editable editable);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface InterfaceC11153f {
        /* renamed from: a */
        void mo15389a(TextInputLayout textInputLayout);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    /* renamed from: K */
    public static Drawable m15333K(zya zyaVar, int i, int i2, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{gua.m29512k(i2, i, 0.1f), i}), zyaVar, zyaVar);
    }

    /* renamed from: N */
    public static Drawable m15334N(Context context, zya zyaVar, int i, int[][] iArr) {
        int iM29504c = gua.m29504c(context, x5e.colorSurface, "TextInputLayout");
        zya zyaVar2 = new zya(zyaVar.m60103I());
        int iM29512k = gua.m29512k(i, iM29504c, 0.1f);
        zyaVar2.g0(new ColorStateList(iArr, new int[]{iM29512k, 0}));
        zyaVar2.setTint(iM29504c);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM29512k, iM29504c});
        zya zyaVar3 = new zya(zyaVar.m60103I());
        zyaVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, zyaVar2, zyaVar3), zyaVar});
    }

    /* renamed from: X */
    public static /* synthetic */ int m15335X(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m15336Y() {
        this.f13109e.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m15337Z(StaticLayout.Builder builder) {
        builder.setBreakStrategy(this.l0.getBreakStrategy());
    }

    public static void d0(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                d0((ViewGroup) childAt, z);
            }
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f13109e;
        if (!(editText instanceof AutoCompleteTextView) || f46.m26047a(editText)) {
            return this.x0;
        }
        int iM29505d = gua.m29505d(this.f13109e, z5e.colorControlHighlight);
        int i = this.G0;
        if (i == 2) {
            return m15334N(getContext(), this.x0, iM29505d, s1);
        }
        if (i == 1) {
            return m15333K(this.x0, this.M0, iM29505d, s1);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.z0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.z0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.z0.addState(new int[0], m15356J(false));
        }
        return this.z0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.y0 == null) {
            this.y0 = m15356J(true);
        }
        return this.y0;
    }

    public static void r0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? v9e.character_counter_overflowed_content_description : v9e.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void setEditText(EditText editText) {
        if (this.f13109e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z = editText instanceof TextInputEditText;
        }
        this.f13109e = editText;
        int i = this.f13111g;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f13113q);
        }
        int i2 = this.f13112h;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f13114s);
        }
        this.A0 = false;
        a0();
        setTextInputAccessibilityDelegate(new C11151d(this));
        this.k1.Q0(this.f13109e.getTypeface());
        this.k1.z0(this.f13109e.getTextSize());
        this.k1.t0(this.f13109e.getLetterSpacing());
        int gravity = this.f13109e.getGravity();
        this.k1.l0((gravity & (-113)) | 48);
        this.k1.y0(gravity);
        this.i1 = editText.getMinimumHeight();
        this.f13109e.addTextChangedListener(new C11148a(editText));
        if (this.X0 == null) {
            this.X0 = this.f13109e.getHintTextColors();
        }
        if (this.u0) {
            if (TextUtils.isEmpty(this.v0)) {
                CharSequence hint = this.f13109e.getHint();
                this.f13110f = hint;
                setHint(hint);
                this.f13109e.setHint((CharSequence) null);
            }
            this.w0 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            t0();
        }
        if (this.f13104Q != null) {
            q0(this.f13109e.getText());
        }
        v0();
        this.f13115x.m19151f();
        this.f13106b.bringToFront();
        this.f13107c.bringToFront();
        m15352F();
        this.f13107c.y0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        C0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.v0)) {
            return;
        }
        this.v0 = charSequence;
        this.k1.N0(charSequence);
        if (this.j1) {
            return;
        }
        b0();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.k0 == z) {
            return;
        }
        if (z) {
            m15369k();
        } else {
            f0();
            this.l0 = null;
        }
        this.k0 = z;
    }

    /* renamed from: A */
    public void m15347A() {
        this.f13107c.m15424i();
    }

    public final void A0() {
        if (this.G0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13105a.getLayoutParams();
            int iM15381w = m15381w();
            if (iM15381w != layoutParams.topMargin) {
                layoutParams.topMargin = iM15381w;
                this.f13105a.requestLayout();
            }
        }
    }

    /* renamed from: B */
    public final void m15348B() {
        if (m15351E()) {
            ((gk4) this.x0).D0();
        }
    }

    public void B0(boolean z) {
        C0(z, false);
    }

    /* renamed from: C */
    public final void m15349C(boolean z) {
        ValueAnimator valueAnimator = this.n1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.n1.cancel();
        }
        if (z && this.m1) {
            m15371m(1.0f);
        } else {
            this.k1.C0(1.0f);
        }
        this.j1 = false;
        if (m15351E()) {
            b0();
        }
        E0();
        this.f13106b.m50913l(false);
        this.f13107c.m15404I(false);
    }

    public final void C0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f13109e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f13109e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.X0;
        if (colorStateList2 != null) {
            this.k1.e0(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.X0;
            this.k1.e0(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.h1) : this.h1));
        } else if (i0()) {
            this.k1.e0(this.f13115x.m19163r());
        } else if (this.f13102L && (textView = this.f13104Q) != null) {
            this.k1.e0(textView.getTextColors());
        } else if (z4 && (colorStateList = this.Y0) != null) {
            this.k1.k0(colorStateList);
        }
        if (z3 || !this.l1 || (isEnabled() && z4)) {
            if (z2 || this.j1) {
                m15349C(z);
                return;
            }
            return;
        }
        if (z2 || !this.j1) {
            m15355I(z);
        }
    }

    /* renamed from: D */
    public final Fade m15350D() {
        Fade fade = new Fade();
        fade.w0(umb.m51785f(getContext(), x5e.motionDurationShort2, 87));
        fade.z0(umb.m51786g(getContext(), x5e.motionEasingLinearInterpolator, gh0.f25146a));
        return fade;
    }

    public final void D0() {
        EditText editText;
        if (this.l0 == null || (editText = this.f13109e) == null) {
            return;
        }
        this.l0.setGravity(editText.getGravity());
        this.l0.setPadding(this.f13109e.getCompoundPaddingLeft(), this.f13109e.getCompoundPaddingTop(), this.f13109e.getCompoundPaddingRight(), this.f13109e.getCompoundPaddingBottom());
    }

    /* renamed from: E */
    public final boolean m15351E() {
        return this.u0 && !TextUtils.isEmpty(this.v0) && (this.x0 instanceof gk4);
    }

    public final void E0() {
        EditText editText = this.f13109e;
        F0(editText == null ? null : editText.getText());
    }

    /* renamed from: F */
    public final void m15352F() {
        Iterator it = this.T0.iterator();
        while (it.hasNext()) {
            ((InterfaceC11153f) it.next()).mo15389a(this);
        }
    }

    public final void F0(Editable editable) {
        if (this.f13103M.mo15388a(editable) != 0 || this.j1) {
            m15359O();
        } else {
            l0();
        }
    }

    /* renamed from: G */
    public final void m15353G(Canvas canvas) {
        zya zyaVar;
        if (this.C0 == null || (zyaVar = this.B0) == null) {
            return;
        }
        zyaVar.draw(canvas);
        if (this.f13109e.isFocused()) {
            Rect bounds = this.C0.getBounds();
            Rect bounds2 = this.B0.getBounds();
            float fM45383H = this.k1.m45383H();
            int iCenterX = bounds2.centerX();
            bounds.left = gh0.m28649c(iCenterX, bounds2.left, fM45383H);
            bounds.right = gh0.m28649c(iCenterX, bounds2.right, fM45383H);
            this.C0.draw(canvas);
        }
    }

    public final void G0(boolean z, boolean z2) {
        int defaultColor = this.c1.getDefaultColor();
        int colorForState = this.c1.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.c1.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.L0 = colorForState2;
        } else if (z2) {
            this.L0 = colorForState;
        } else {
            this.L0 = defaultColor;
        }
    }

    /* renamed from: H */
    public final void m15354H(Canvas canvas) {
        if (this.u0) {
            this.k1.m45409k(canvas);
        }
    }

    public void H0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.x0 == null || this.G0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f13109e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f13109e) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.L0 = this.h1;
        } else if (i0()) {
            if (this.c1 != null) {
                G0(z2, z);
            } else {
                this.L0 = getErrorCurrentTextColors();
            }
        } else if (!this.f13102L || (textView = this.f13104Q) == null) {
            if (z2) {
                this.L0 = this.b1;
            } else if (z) {
                this.L0 = this.a1;
            } else {
                this.L0 = this.Z0;
            }
        } else if (this.c1 != null) {
            G0(z2, z);
        } else {
            this.L0 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            t0();
        }
        this.f13107c.m15405J();
        e0();
        if (this.G0 == 2) {
            int i = this.I0;
            if (z2 && isEnabled()) {
                this.I0 = this.K0;
            } else {
                this.I0 = this.J0;
            }
            if (this.I0 != i) {
                c0();
            }
        }
        if (this.G0 == 1) {
            if (!isEnabled()) {
                this.M0 = this.e1;
            } else if (z && !z2) {
                this.M0 = this.g1;
            } else if (z2) {
                this.M0 = this.f1;
            } else {
                this.M0 = this.d1;
            }
        }
        m15372n();
    }

    /* renamed from: I */
    public final void m15355I(boolean z) {
        ValueAnimator valueAnimator = this.n1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.n1.cancel();
        }
        if (z && this.m1) {
            m15371m(0.0f);
        } else {
            this.k1.C0(0.0f);
        }
        if (m15351E() && ((gk4) this.x0).C0()) {
            m15348B();
        }
        this.j1 = true;
        m15359O();
        this.f13106b.m50913l(true);
        this.f13107c.m15404I(true);
    }

    /* renamed from: J */
    public final zya m15356J(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(x6e.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f13109e;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(x6e.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(x6e.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ykf ykfVarM57970m = ykf.m57921a().m57964E(f).m57968I(f).m57978v(dimensionPixelOffset).m57982z(dimensionPixelOffset).m57970m();
        EditText editText2 = this.f13109e;
        zya zyaVarM60094q = zya.m60094q(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        zyaVarM60094q.setShapeAppearanceModel(ykfVarM57970m);
        zyaVarM60094q.i0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return zyaVarM60094q;
    }

    /* renamed from: L */
    public final int m15357L(int i, boolean z) {
        return i + ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f13109e.getCompoundPaddingLeft() : this.f13107c.m15441z() : this.f13106b.m50904c());
    }

    /* renamed from: M */
    public final int m15358M(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.f13109e.getCompoundPaddingRight() : this.f13106b.m50904c() : this.f13107c.m15441z());
    }

    /* renamed from: O */
    public final void m15359O() {
        TextView textView = this.l0;
        if (textView == null || !this.k0) {
            return;
        }
        textView.setText((CharSequence) null);
        AbstractC2524c.m9945b(this.f13105a, this.p0);
        this.l0.setVisibility(4);
    }

    /* renamed from: P */
    public boolean m15360P() {
        return this.f13107c.m15402G();
    }

    /* renamed from: Q */
    public boolean m15361Q() {
        return this.f13115x.m19131A();
    }

    /* renamed from: R */
    public boolean m15362R() {
        return this.f13115x.m19132B();
    }

    /* renamed from: S */
    public final boolean m15363S() {
        return this.j1;
    }

    /* renamed from: T */
    public final boolean m15364T() {
        return getHintMaxLines() == 1;
    }

    /* renamed from: U */
    public final boolean m15365U() {
        return i0() || (this.f13104Q != null && this.f13102L);
    }

    /* renamed from: V */
    public boolean m15366V() {
        return this.w0;
    }

    /* renamed from: W */
    public final boolean m15367W() {
        return this.G0 == 1 && this.f13109e.getMinLines() <= 1;
    }

    public final void a0() {
        m15375q();
        x0();
        H0();
        m0();
        m15370l();
        if (this.G0 != 0) {
            A0();
        }
        g0();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f13105a.addView(view, layoutParams2);
        this.f13105a.setLayoutParams(layoutParams);
        A0();
        setEditText((EditText) view);
    }

    public final void b0() {
        if (m15351E()) {
            RectF rectF = this.P0;
            this.k1.m45413o(rectF, this.f13109e.getWidth(), this.f13109e.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            m15374p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.I0);
            rectF.top = 0.0f;
            ((gk4) this.x0).F0(rectF);
        }
    }

    public final void c0() {
        if (!m15351E() || this.j1) {
            return;
        }
        m15348B();
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f13109e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f13110f != null) {
            boolean z = this.w0;
            this.w0 = false;
            CharSequence hint = editText.getHint();
            this.f13109e.setHint(this.f13110f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f13109e.setHint(hint);
                this.w0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f13105a.getChildCount());
        for (int i2 = 0; i2 < this.f13105a.getChildCount(); i2++) {
            View childAt = this.f13105a.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f13109e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.p1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.p1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m15354H(canvas);
        m15353G(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.o1) {
            return;
        }
        this.o1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        qg3 qg3Var = this.k1;
        boolean zL0 = qg3Var != null ? qg3Var.L0(drawableState) | false : false;
        if (this.f13109e != null) {
            B0(isLaidOut() && isEnabled());
        }
        v0();
        H0();
        if (zL0) {
            invalidate();
        }
        this.o1 = false;
    }

    public void e0() {
        this.f13106b.m50914m();
    }

    public final void f0() {
        TextView textView = this.l0;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void g0() {
        EditText editText = this.f13109e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i = this.G0;
                if (i == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f13109e;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m15381w() : super.getBaseline();
    }

    public zya getBoxBackground() {
        int i = this.G0;
        if (i == 1 || i == 2) {
            return this.x0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.M0;
    }

    public int getBoxBackgroundMode() {
        return this.G0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.H0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return xzi.m57079o(this) ? this.D0.m57931j().mo20547a(this.P0) : this.D0.m57933l().mo20547a(this.P0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return xzi.m57079o(this) ? this.D0.m57933l().mo20547a(this.P0) : this.D0.m57931j().mo20547a(this.P0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return xzi.m57079o(this) ? this.D0.m57938r().mo20547a(this.P0) : this.D0.m57940t().mo20547a(this.P0);
    }

    public float getBoxCornerRadiusTopStart() {
        return xzi.m57079o(this) ? this.D0.m57940t().mo20547a(this.P0) : this.D0.m57938r().mo20547a(this.P0);
    }

    public int getBoxStrokeColor() {
        return this.b1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.c1;
    }

    public int getBoxStrokeWidth() {
        return this.J0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.K0;
    }

    public int getCounterMaxLength() {
        return this.f13101H;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f13116y && this.f13102L && (textView = this.f13104Q) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.r0;
    }

    public ColorStateList getCounterTextColor() {
        return this.q0;
    }

    public ColorStateList getCursorColor() {
        return this.s0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.t0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.X0;
    }

    public EditText getEditText() {
        return this.f13109e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f13107c.m15428m();
    }

    public Drawable getEndIconDrawable() {
        return this.f13107c.m15430o();
    }

    public int getEndIconMinSize() {
        return this.f13107c.m15431p();
    }

    public int getEndIconMode() {
        return this.f13107c.m15432q();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f13107c.m15433r();
    }

    public CheckableImageButton getEndIconView() {
        return this.f13107c.m15434s();
    }

    public CharSequence getError() {
        if (this.f13115x.m19131A()) {
            return this.f13115x.m19161p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f13115x.m19159n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f13115x.m19160o();
    }

    public int getErrorCurrentTextColors() {
        return this.f13115x.m19162q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f13107c.m15435t();
    }

    public CharSequence getHelperText() {
        if (this.f13115x.m19132B()) {
            return this.f13115x.m19164s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f13115x.m19166u();
    }

    public CharSequence getHint() {
        if (this.u0) {
            return this.v0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.k1.m45416r();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.k1.m45421w();
    }

    public int getHintMaxLines() {
        return this.k1.m45376A();
    }

    public ColorStateList getHintTextColor() {
        return this.Y0;
    }

    public InterfaceC11152e getLengthCounter() {
        return this.f13103M;
    }

    public int getMaxEms() {
        return this.f13112h;
    }

    public int getMaxWidth() {
        return this.f13114s;
    }

    public int getMinEms() {
        return this.f13111g;
    }

    public int getMinWidth() {
        return this.f13113q;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f13107c.m15437v();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f13107c.m15438w();
    }

    public CharSequence getPlaceholderText() {
        if (this.k0) {
            return this.j0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.n0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.m0;
    }

    public CharSequence getPrefixText() {
        return this.f13106b.m50902a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f13106b.m50903b();
    }

    public TextView getPrefixTextView() {
        return this.f13106b.m50905d();
    }

    public ykf getShapeAppearanceModel() {
        return this.D0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f13106b.m50906e();
    }

    public Drawable getStartIconDrawable() {
        return this.f13106b.m50907f();
    }

    public int getStartIconMinSize() {
        return this.f13106b.m50908g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f13106b.m50909h();
    }

    public CharSequence getSuffixText() {
        return this.f13107c.m15439x();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f13107c.m15440y();
    }

    public TextView getSuffixTextView() {
        return this.f13107c.m15396A();
    }

    public Typeface getTypeface() {
        return this.Q0;
    }

    public void h0(TextView textView, int i) {
        boolean z = true;
        try {
            gjh.m28914m(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            gjh.m28914m(textView, iae.TextAppearance_AppCompat_Caption);
            textView.setTextColor(c64.getColor(getContext(), r6e.design_error));
        }
    }

    public boolean i0() {
        return this.f13115x.m19157l();
    }

    /* renamed from: j */
    public void m15368j(InterfaceC11153f interfaceC11153f) {
        this.T0.add(interfaceC11153f);
        if (this.f13109e != null) {
            interfaceC11153f.mo15389a(this);
        }
    }

    public final boolean j0() {
        return (this.f13107c.m15403H() || ((this.f13107c.m15397B() && m15360P()) || this.f13107c.m15439x() != null)) && this.f13107c.getMeasuredWidth() > 0;
    }

    /* renamed from: k */
    public final void m15369k() {
        TextView textView = this.l0;
        if (textView != null) {
            this.f13105a.addView(textView);
            this.l0.setVisibility(0);
        }
    }

    public final boolean k0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f13106b.getMeasuredWidth() > 0;
    }

    /* renamed from: l */
    public final void m15370l() {
        if (this.f13109e == null || this.G0 != 1) {
            return;
        }
        if (!m15364T()) {
            EditText editText = this.f13109e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.k1.m45416r() + this.f13108d), this.f13109e.getPaddingEnd(), getResources().getDimensionPixelSize(x6e.material_filled_edittext_font_1_3_padding_bottom));
        } else if (yya.m58505l(getContext())) {
            EditText editText2 = this.f13109e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(x6e.material_filled_edittext_font_2_0_padding_top), this.f13109e.getPaddingEnd(), getResources().getDimensionPixelSize(x6e.material_filled_edittext_font_2_0_padding_bottom));
        } else if (yya.m58504k(getContext())) {
            EditText editText3 = this.f13109e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(x6e.material_filled_edittext_font_1_3_padding_top), this.f13109e.getPaddingEnd(), getResources().getDimensionPixelSize(x6e.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    public final void l0() {
        if (this.l0 == null || !this.k0 || TextUtils.isEmpty(this.j0)) {
            return;
        }
        this.l0.setText(this.j0);
        AbstractC2524c.m9945b(this.f13105a, this.o0);
        this.l0.setVisibility(0);
        this.l0.bringToFront();
        announceForAccessibility(this.j0);
    }

    /* renamed from: m */
    public void m15371m(float f) {
        if (this.k1.m45383H() == f) {
            return;
        }
        if (this.n1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.n1 = valueAnimator;
            valueAnimator.setInterpolator(umb.m51786g(getContext(), x5e.motionEasingEmphasizedInterpolator, gh0.f25147b));
            this.n1.setDuration(umb.m51785f(getContext(), x5e.motionDurationMedium4, Opcodes.GOTO));
            this.n1.addUpdateListener(new C11150c());
        }
        this.n1.setFloatValues(this.k1.m45383H(), f);
        this.n1.start();
    }

    public final void m0() {
        if (this.G0 == 1) {
            if (yya.m58505l(getContext())) {
                this.H0 = getResources().getDimensionPixelSize(x6e.material_font_2_0_box_collapsed_padding_top);
            } else if (yya.m58504k(getContext())) {
                this.H0 = getResources().getDimensionPixelSize(x6e.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    /* renamed from: n */
    public final void m15372n() {
        zya zyaVar = this.x0;
        if (zyaVar == null) {
            return;
        }
        ykf ykfVarM60103I = zyaVar.m60103I();
        ykf ykfVar = this.D0;
        if (ykfVarM60103I != ykfVar) {
            this.x0.setShapeAppearanceModel(ykfVar);
        }
        if (m15382x()) {
            this.x0.p0(this.I0, this.L0);
        }
        int iM15376r = m15376r();
        this.M0 = iM15376r;
        this.x0.g0(ColorStateList.valueOf(iM15376r));
        m15373o();
        x0();
    }

    public final void n0(Rect rect) {
        zya zyaVar = this.B0;
        if (zyaVar != null) {
            int i = rect.bottom;
            zyaVar.setBounds(rect.left, i - this.J0, rect.right, i);
        }
        zya zyaVar2 = this.C0;
        if (zyaVar2 != null) {
            int i2 = rect.bottom;
            zyaVar2.setBounds(rect.left, i2 - this.K0, rect.right, i2);
        }
    }

    /* renamed from: o */
    public final void m15373o() {
        if (this.B0 == null || this.C0 == null) {
            return;
        }
        if (m15383y()) {
            this.B0.g0(this.f13109e.isFocused() ? ColorStateList.valueOf(this.Z0) : ColorStateList.valueOf(this.L0));
            this.C0.g0(ColorStateList.valueOf(this.L0));
        }
        invalidate();
    }

    public final void o0(int i) {
        this.k1.T0(i);
        Rect rect = this.N0;
        km5.m35901a(this, this.f13109e, rect);
        this.k1.g0(m15377s(rect));
        A0();
        m15370l();
        y0(i);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k1.m45399Z(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f13107c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.q1 = false;
        boolean zZ0 = z0();
        boolean zU0 = u0();
        if (zZ0 || zU0) {
            this.f13109e.post(new Runnable() { // from class: o.shh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45449a.m15336Y();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f13109e;
        if (editText != null) {
            Rect rect = this.N0;
            km5.m35901a(this, editText, rect);
            n0(rect);
            if (this.u0) {
                this.k1.z0(this.f13109e.getTextSize());
                int gravity = this.f13109e.getGravity();
                this.k1.l0((gravity & (-113)) | 48);
                this.k1.y0(gravity);
                this.k1.g0(m15377s(rect));
                this.k1.s0(m15380v(rect));
                this.k1.b0();
                if (!m15351E() || this.j1) {
                    return;
                }
                b0();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.q1) {
            this.f13107c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.q1 = true;
        }
        D0();
        this.f13107c.y0();
        if (m15364T()) {
            return;
        }
        o0((this.f13109e.getMeasuredWidth() - this.f13109e.getCompoundPaddingLeft()) - this.f13109e.getCompoundPaddingRight());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        setError(savedState.f13117c);
        if (savedState.f13118d) {
            post(new RunnableC11149b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.E0) {
            float fMo20547a = this.D0.m57938r().mo20547a(this.P0);
            float fMo20547a2 = this.D0.m57940t().mo20547a(this.P0);
            ykf ykfVarM57970m = ykf.m57921a().m57963D(this.D0.m57939s()).m57967H(this.D0.m57937q()).m57977u(this.D0.m57932k()).m57981y(this.D0.m57930i()).m57964E(fMo20547a2).m57968I(fMo20547a).m57978v(this.D0.m57933l().mo20547a(this.P0)).m57982z(this.D0.m57931j().mo20547a(this.P0)).m57970m();
            this.E0 = z;
            setShapeAppearanceModel(ykfVarM57970m);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (i0()) {
            savedState.f13117c = getError();
        }
        savedState.f13118d = this.f13107c.m15401F();
        return savedState;
    }

    /* renamed from: p */
    public final void m15374p(RectF rectF) {
        float f = rectF.left;
        int i = this.F0;
        rectF.left = f - i;
        rectF.right += i;
    }

    public final void p0() {
        if (this.f13104Q != null) {
            EditText editText = this.f13109e;
            q0(editText == null ? null : editText.getText());
        }
    }

    /* renamed from: q */
    public final void m15375q() {
        int i = this.G0;
        if (i == 0) {
            this.x0 = null;
            this.B0 = null;
            this.C0 = null;
            return;
        }
        if (i == 1) {
            this.x0 = new zya(this.D0);
            this.B0 = new zya();
            this.C0 = new zya();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.G0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.u0 || (this.x0 instanceof gk4)) {
                this.x0 = new zya(this.D0);
            } else {
                this.x0 = gk4.B0(this.D0);
            }
            this.B0 = null;
            this.C0 = null;
        }
    }

    public void q0(Editable editable) {
        int iMo15388a = this.f13103M.mo15388a(editable);
        boolean z = this.f13102L;
        int i = this.f13101H;
        if (i == -1) {
            this.f13104Q.setText(String.valueOf(iMo15388a));
            this.f13104Q.setContentDescription(null);
            this.f13102L = false;
        } else {
            this.f13102L = iMo15388a > i;
            r0(getContext(), this.f13104Q, iMo15388a, this.f13101H, this.f13102L);
            if (z != this.f13102L) {
                s0();
            }
            this.f13104Q.setText(lh1.m37169c().m37176j(getContext().getString(v9e.character_counter_pattern, Integer.valueOf(iMo15388a), Integer.valueOf(this.f13101H))));
        }
        if (this.f13109e == null || z == this.f13102L) {
            return;
        }
        B0(false);
        H0();
        v0();
    }

    /* renamed from: r */
    public final int m15376r() {
        return this.G0 == 1 ? gua.m29511j(gua.m29506e(this, x5e.colorSurface, 0), this.M0) : this.M0;
    }

    /* renamed from: s */
    public final Rect m15377s(Rect rect) {
        if (this.f13109e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.O0;
        boolean zM57079o = xzi.m57079o(this);
        rect2.bottom = rect.bottom;
        int i = this.G0;
        if (i == 1) {
            rect2.left = m15357L(rect.left, zM57079o);
            rect2.top = rect.top + this.H0;
            rect2.right = m15358M(rect.right, zM57079o);
            return rect2;
        }
        if (i != 2) {
            rect2.left = m15357L(rect.left, zM57079o);
            rect2.top = getPaddingTop();
            rect2.right = m15358M(rect.right, zM57079o);
            return rect2;
        }
        rect2.left = rect.left + this.f13109e.getPaddingLeft();
        rect2.top = rect.top - m15381w();
        rect2.right = rect.right - this.f13109e.getPaddingRight();
        return rect2;
    }

    public final void s0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f13104Q;
        if (textView != null) {
            h0(textView, this.f13102L ? this.h0 : this.i0);
            if (!this.f13102L && (colorStateList2 = this.q0) != null) {
                this.f13104Q.setTextColor(colorStateList2);
            }
            if (!this.f13102L || (colorStateList = this.r0) == null) {
                return;
            }
            this.f13104Q.setTextColor(colorStateList);
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.M0 != i) {
            this.M0 = i;
            this.d1 = i;
            this.f1 = i;
            this.g1 = i;
            m15372n();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(c64.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.d1 = defaultColor;
        this.M0 = defaultColor;
        this.e1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.g1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m15372n();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.G0) {
            return;
        }
        this.G0 = i;
        if (this.f13109e != null) {
            a0();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.H0 = i;
    }

    public void setBoxCornerFamily(int i) {
        this.D0 = this.D0.m57943w().m57962C(i, this.D0.m57938r()).m57966G(i, this.D0.m57940t()).m57976t(i, this.D0.m57931j()).m57980x(i, this.D0.m57933l()).m57970m();
        m15372n();
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        boolean zM57079o = xzi.m57079o(this);
        this.E0 = zM57079o;
        float f5 = zM57079o ? f2 : f;
        if (!zM57079o) {
            f = f2;
        }
        float f6 = zM57079o ? f4 : f3;
        if (!zM57079o) {
            f3 = f4;
        }
        zya zyaVar = this.x0;
        if (zyaVar != null && zyaVar.m60108N() == f5 && this.x0.m60109O() == f && this.x0.m60132w() == f6 && this.x0.m60133x() == f3) {
            return;
        }
        this.D0 = this.D0.m57943w().m57964E(f5).m57968I(f).m57978v(f6).m57982z(f3).m57970m();
        m15372n();
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.b1 != i) {
            this.b1 = i;
            H0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.Z0 = colorStateList.getDefaultColor();
            this.h1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.a1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.b1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.b1 != colorStateList.getDefaultColor()) {
            this.b1 = colorStateList.getDefaultColor();
        }
        H0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.c1 != colorStateList) {
            this.c1 = colorStateList;
            H0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.J0 = i;
        H0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.K0 = i;
        H0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f13116y != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f13104Q = appCompatTextView;
                appCompatTextView.setId(n8e.textinput_counter);
                Typeface typeface = this.Q0;
                if (typeface != null) {
                    this.f13104Q.setTypeface(typeface);
                }
                this.f13104Q.setMaxLines(1);
                this.f13115x.m19150e(this.f13104Q, 2);
                ((ViewGroup.MarginLayoutParams) this.f13104Q.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(x6e.mtrl_textinput_counter_margin_start));
                s0();
                p0();
            } else {
                this.f13115x.m19133C(this.f13104Q, 2);
                this.f13104Q = null;
            }
            this.f13116y = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f13101H != i) {
            if (i > 0) {
                this.f13101H = i;
            } else {
                this.f13101H = -1;
            }
            if (this.f13116y) {
                p0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            s0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.r0 != colorStateList) {
            this.r0 = colorStateList;
            s0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.i0 != i) {
            this.i0 = i;
            s0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.q0 != colorStateList) {
            this.q0 = colorStateList;
            s0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.s0 != colorStateList) {
            this.s0 = colorStateList;
            t0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.t0 != colorStateList) {
            this.t0 = colorStateList;
            if (m15365U()) {
                t0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.X0 = colorStateList;
        this.Y0 = colorStateList;
        if (this.f13109e != null) {
            B0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        d0(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f13107c.m15410O(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f13107c.m15411P(z);
    }

    public void setEndIconContentDescription(int i) {
        this.f13107c.m15412Q(i);
    }

    public void setEndIconDrawable(int i) {
        this.f13107c.m15414S(i);
    }

    public void setEndIconMinSize(int i) {
        this.f13107c.m15416U(i);
    }

    public void setEndIconMode(int i) {
        this.f13107c.m15417V(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f13107c.m15418W(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f13107c.m15419X(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f13107c.m15420Y(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f13107c.m15421Z(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f13107c.a0(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.f13107c.b0(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f13115x.m19131A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f13115x.m19168w();
        } else {
            this.f13115x.m19147Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        this.f13115x.m19135E(i);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f13115x.m19136F(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f13115x.m19137G(z);
    }

    public void setErrorIconDrawable(int i) {
        this.f13107c.c0(i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f13107c.e0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f13107c.f0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f13107c.g0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f13107c.h0(mode);
    }

    public void setErrorTextAppearance(int i) {
        this.f13115x.m19138H(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f13115x.m19139I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.l1 != z) {
            this.l1 = z;
            B0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m15362R()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!m15362R()) {
                setHelperTextEnabled(true);
            }
            this.f13115x.m19148R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f13115x.m19142L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f13115x.m19141K(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f13115x.m19140J(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.u0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.m1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.u0) {
            this.u0 = z;
            if (z) {
                CharSequence hint = this.f13109e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.v0)) {
                        setHint(hint);
                    }
                    this.f13109e.setHint((CharSequence) null);
                }
                this.w0 = true;
            } else {
                this.w0 = false;
                if (!TextUtils.isEmpty(this.v0) && TextUtils.isEmpty(this.f13109e.getHint())) {
                    this.f13109e.setHint(this.v0);
                }
                setHintInternal(null);
            }
            if (this.f13109e != null) {
                A0();
            }
        }
    }

    public void setHintMaxLines(int i) {
        this.k1.h0(i);
        this.k1.u0(i);
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        this.k1.i0(i);
        this.Y0 = this.k1.m45414p();
        if (this.f13109e != null) {
            B0(false);
            A0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.Y0 != colorStateList) {
            if (this.X0 == null) {
                this.k1.k0(colorStateList);
            }
            this.Y0 = colorStateList;
            if (this.f13109e != null) {
                B0(false);
            }
        }
    }

    public void setLengthCounter(InterfaceC11152e interfaceC11152e) {
        this.f13103M = interfaceC11152e;
    }

    public void setMaxEms(int i) {
        this.f13112h = i;
        EditText editText = this.f13109e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f13114s = i;
        EditText editText = this.f13109e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f13111g = i;
        EditText editText = this.f13109e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f13113q = i;
        EditText editText = this.f13109e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        this.f13107c.j0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        this.f13107c.l0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.f13107c.n0(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f13107c.o0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f13107c.p0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.l0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.l0 = appCompatTextView;
            appCompatTextView.setId(n8e.textinput_placeholder);
            this.l0.setImportantForAccessibility(2);
            Fade fadeM15350D = m15350D();
            this.o0 = fadeM15350D;
            fadeM15350D.D0(67L);
            this.p0 = m15350D();
            setPlaceholderTextAppearance(this.n0);
            setPlaceholderTextColor(this.m0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.k0) {
                setPlaceholderTextEnabled(true);
            }
            this.j0 = charSequence;
        }
        E0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.n0 = i;
        TextView textView = this.l0;
        if (textView != null) {
            gjh.m28914m(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.m0 != colorStateList) {
            this.m0 = colorStateList;
            TextView textView = this.l0;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f13106b.m50915n(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.f13106b.m50916o(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f13106b.m50917p(colorStateList);
    }

    public void setShapeAppearanceModel(ykf ykfVar) {
        zya zyaVar = this.x0;
        if (zyaVar == null || zyaVar.m60103I() == ykfVar) {
            return;
        }
        this.D0 = ykfVar;
        m15372n();
    }

    public void setStartIconCheckable(boolean z) {
        this.f13106b.m50918q(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? lk0.m37353b(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        this.f13106b.m50921t(i);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f13106b.m50922u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f13106b.m50923v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f13106b.m50924w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f13106b.m50925x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f13106b.m50926y(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.f13106b.m50927z(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f13107c.q0(charSequence);
    }

    public void setSuffixTextAppearance(int i) {
        this.f13107c.r0(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f13107c.s0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C11151d c11151d) {
        EditText editText = this.f13109e;
        if (editText != null) {
            wvi.m0(editText, c11151d);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.Q0) {
            this.Q0 = typeface;
            this.k1.Q0(typeface);
            this.f13115x.m19144N(typeface);
            TextView textView = this.f13104Q;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final int m15378t(Rect rect, Rect rect2, float f) {
        return m15367W() ? (int) (rect2.top + f) : rect.bottom - this.f13109e.getCompoundPaddingBottom();
    }

    public final void t0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListM29508g = this.s0;
        if (colorStateListM29508g == null) {
            colorStateListM29508g = gua.m29508g(getContext(), z5e.colorControlActivated);
        }
        EditText editText = this.f13109e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = fy5.m27744r(this.f13109e.getTextCursorDrawable()).mutate();
        if (m15365U() && (colorStateList = this.t0) != null) {
            colorStateListM29508g = colorStateList;
        }
        drawableMutate.setTintList(colorStateListM29508g);
    }

    /* renamed from: u */
    public final int m15379u(Rect rect, float f) {
        if (m15367W()) {
            return (int) (rect.centerY() - (f / 2.0f));
        }
        return (rect.top + this.f13109e.getCompoundPaddingTop()) - ((this.G0 != 0 || m15364T()) ? 0 : (int) (this.k1.m45380E() / 2.0f));
    }

    public boolean u0() {
        boolean z;
        if (this.f13109e == null) {
            return false;
        }
        boolean z2 = true;
        if (k0()) {
            int measuredWidth = this.f13106b.getMeasuredWidth() - this.f13109e.getPaddingLeft();
            if (this.R0 == null || this.S0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.R0 = colorDrawable;
                this.S0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f13109e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.R0;
            if (drawable != drawable2) {
                this.f13109e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.R0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f13109e.getCompoundDrawablesRelative();
                this.f13109e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.R0 = null;
                z = true;
            }
            z = false;
        }
        if (j0()) {
            int measuredWidth2 = this.f13107c.m15396A().getMeasuredWidth() - this.f13109e.getPaddingRight();
            CheckableImageButton checkableImageButtonM15427l = this.f13107c.m15427l();
            if (checkableImageButtonM15427l != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonM15427l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButtonM15427l.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.f13109e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.U0;
            if (drawable3 == null || this.V0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.U0 = colorDrawable2;
                    this.V0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.U0;
                if (drawable4 != drawable5) {
                    this.W0 = drawable4;
                    this.f13109e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.V0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f13109e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.U0, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.U0 == null) {
                return z;
            }
            Drawable[] compoundDrawablesRelative4 = this.f13109e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.U0) {
                this.f13109e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.W0, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.U0 = null;
        }
        return z2;
    }

    /* renamed from: v */
    public final Rect m15380v(Rect rect) {
        if (this.f13109e == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.O0;
        float fM45380E = m15364T() ? this.k1.m45380E() : this.k1.m45377B() * this.k1.m45424z();
        rect2.left = rect.left + this.f13109e.getCompoundPaddingLeft();
        rect2.top = m15379u(rect, fM45380E);
        rect2.right = rect.right - this.f13109e.getCompoundPaddingRight();
        rect2.bottom = m15378t(rect, rect2, fM45380E);
        return rect2;
    }

    public void v0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f13109e;
        if (editText == null || this.G0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (vy5.m53595a(background)) {
            background = background.mutate();
        }
        if (i0()) {
            background.setColorFilter(ek0.m25164e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f13102L && (textView = this.f13104Q) != null) {
            background.setColorFilter(ek0.m25164e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            fy5.m27729c(background);
            this.f13109e.refreshDrawableState();
        }
    }

    /* renamed from: w */
    public final int m15381w() {
        if (!this.u0) {
            return 0;
        }
        int i = this.G0;
        if (i == 0) {
            return (int) this.k1.m45416r();
        }
        if (i != 2) {
            return 0;
        }
        return m15364T() ? (int) (this.k1.m45416r() / 2.0f) : Math.max(0, (int) (this.k1.m45416r() - (this.k1.m45412n() / 2.0f)));
    }

    public final void w0() {
        this.f13109e.setBackground(getEditTextBoxBackground());
    }

    /* renamed from: x */
    public final boolean m15382x() {
        return this.G0 == 2 && m15383y();
    }

    public void x0() {
        EditText editText = this.f13109e;
        if (editText == null || this.x0 == null) {
            return;
        }
        if ((this.A0 || editText.getBackground() == null) && this.G0 != 0) {
            w0();
            this.A0 = true;
        }
    }

    /* renamed from: y */
    public final boolean m15383y() {
        return this.I0 > -1 && this.L0 != 0;
    }

    public final void y0(int i) {
        if (this.f13109e == null) {
            return;
        }
        float fM45379D = this.k1.m45379D();
        float height = 0.0f;
        if (this.j0 != null) {
            TextPaint textPaint = new TextPaint(Opcodes.LOR);
            textPaint.set(this.l0.getPaint());
            textPaint.setTextSize(this.l0.getTextSize());
            textPaint.setTypeface(this.l0.getTypeface());
            textPaint.setLetterSpacing(this.l0.getLetterSpacing());
            try {
                height = k5g.m35016b(this.j0, textPaint, i).m35022g(getLayoutDirection() == 1).m35021f(true).m35023h(this.l0.getLineSpacingExtra(), this.l0.getLineSpacingMultiplier()).m35025j(new l5g() { // from class: o.rhh
                    @Override // p001o.l5g
                    /* renamed from: a */
                    public final void mo36597a(StaticLayout.Builder builder) {
                        this.f43670a.m15337Z(builder);
                    }
                }).m35017a().getHeight() + (this.G0 == 1 ? this.k1.m45416r() + this.H0 + this.f13108d : 0.0f);
            } catch (k5g.C14716a e) {
                e.getCause().getMessage();
            }
        }
        float fMax = Math.max(fM45379D, height);
        if (this.f13109e.getMeasuredHeight() < fMax) {
            this.f13109e.setMinimumHeight(Math.round(fMax));
        }
    }

    /* renamed from: z */
    public void m15384z() {
        this.T0.clear();
    }

    public final boolean z0() {
        int iMax;
        if (this.f13109e == null || this.f13109e.getMeasuredHeight() >= (iMax = Math.max(this.f13107c.getMeasuredHeight(), this.f13106b.getMeasuredHeight()))) {
            return false;
        }
        this.f13109e.setMinimumHeight(iMax);
        return true;
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.textInputStyle);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f13107c.m15413R(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f13107c.m15415T(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f13107c.d0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f13107c.k0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f13107c.m0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f13106b.m50919r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f13106b.m50920s(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = r1;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.f13111g = -1;
        this.f13112h = -1;
        this.f13113q = -1;
        this.f13114s = -1;
        this.f13115x = new bi8(this);
        this.f13103M = new InterfaceC11152e() { // from class: o.thh
            @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC11152e
            /* renamed from: a */
            public final int mo15388a(Editable editable) {
                return TextInputLayout.m15335X(editable);
            }
        };
        this.N0 = new Rect();
        this.O0 = new Rect();
        this.P0 = new RectF();
        this.T0 = new LinkedHashSet();
        qg3 qg3Var = new qg3(this);
        this.k1 = qg3Var;
        this.q1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f13105a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = gh0.f25146a;
        qg3Var.O0(timeInterpolator);
        qg3Var.J0(timeInterpolator);
        qg3Var.l0(8388659);
        anh anhVarM19306j = bkh.m19306j(context2, attributeSet, ebe.TextInputLayout, i, i2, ebe.TextInputLayout_counterTextAppearance, ebe.TextInputLayout_counterOverflowTextAppearance, ebe.TextInputLayout_errorTextAppearance, ebe.TextInputLayout_helperTextTextAppearance, ebe.TextInputLayout_hintTextAppearance);
        u3g u3gVar = new u3g(this, anhVarM19306j);
        this.f13106b = u3gVar;
        this.u0 = anhVarM19306j.m17526a(ebe.TextInputLayout_hintEnabled, true);
        setHint(anhVarM19306j.m17541p(ebe.TextInputLayout_android_hint));
        this.m1 = anhVarM19306j.m17526a(ebe.TextInputLayout_hintAnimationEnabled, true);
        this.l1 = anhVarM19306j.m17526a(ebe.TextInputLayout_expandedHintEnabled, true);
        if (anhVarM19306j.m17544s(ebe.TextInputLayout_android_minEms)) {
            setMinEms(anhVarM19306j.m17536k(ebe.TextInputLayout_android_minEms, -1));
        } else if (anhVarM19306j.m17544s(ebe.TextInputLayout_android_minWidth)) {
            setMinWidth(anhVarM19306j.m17531f(ebe.TextInputLayout_android_minWidth, -1));
        }
        if (anhVarM19306j.m17544s(ebe.TextInputLayout_android_maxEms)) {
            setMaxEms(anhVarM19306j.m17536k(ebe.TextInputLayout_android_maxEms, -1));
        } else if (anhVarM19306j.m17544s(ebe.TextInputLayout_android_maxWidth)) {
            setMaxWidth(anhVarM19306j.m17531f(ebe.TextInputLayout_android_maxWidth, -1));
        }
        this.D0 = ykf.m57925e(context2, attributeSet, i, i2).m57970m();
        this.F0 = context2.getResources().getDimensionPixelOffset(x6e.mtrl_textinput_box_label_cutout_padding);
        this.H0 = anhVarM19306j.m17530e(ebe.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f13108d = getResources().getDimensionPixelSize(x6e.m3_multiline_hint_filled_text_extra_space);
        this.J0 = anhVarM19306j.m17531f(ebe.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(x6e.mtrl_textinput_box_stroke_width_default));
        this.K0 = anhVarM19306j.m17531f(ebe.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(x6e.mtrl_textinput_box_stroke_width_focused));
        this.I0 = this.J0;
        float fM17529d = anhVarM19306j.m17529d(ebe.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float fM17529d2 = anhVarM19306j.m17529d(ebe.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float fM17529d3 = anhVarM19306j.m17529d(ebe.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float fM17529d4 = anhVarM19306j.m17529d(ebe.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        ykf.C18426b c18426bM57943w = this.D0.m57943w();
        if (fM17529d >= 0.0f) {
            c18426bM57943w.m57964E(fM17529d);
        }
        if (fM17529d2 >= 0.0f) {
            c18426bM57943w.m57968I(fM17529d2);
        }
        if (fM17529d3 >= 0.0f) {
            c18426bM57943w.m57982z(fM17529d3);
        }
        if (fM17529d4 >= 0.0f) {
            c18426bM57943w.m57978v(fM17529d4);
        }
        this.D0 = c18426bM57943w.m57970m();
        ColorStateList colorStateListM58495b = yya.m58495b(context2, anhVarM19306j, ebe.TextInputLayout_boxBackgroundColor);
        if (colorStateListM58495b != null) {
            int defaultColor = colorStateListM58495b.getDefaultColor();
            this.d1 = defaultColor;
            this.M0 = defaultColor;
            if (colorStateListM58495b.isStateful()) {
                this.e1 = colorStateListM58495b.getColorForState(new int[]{-16842910}, -1);
                this.f1 = colorStateListM58495b.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.g1 = colorStateListM58495b.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1 = this.d1;
                ColorStateList colorStateListM37352a = lk0.m37352a(context2, r6e.mtrl_filled_background_color);
                this.e1 = colorStateListM37352a.getColorForState(new int[]{-16842910}, -1);
                this.g1 = colorStateListM37352a.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.M0 = 0;
            this.d1 = 0;
            this.e1 = 0;
            this.f1 = 0;
            this.g1 = 0;
        }
        if (anhVarM19306j.m17544s(ebe.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListM17528c = anhVarM19306j.m17528c(ebe.TextInputLayout_android_textColorHint);
            this.Y0 = colorStateListM17528c;
            this.X0 = colorStateListM17528c;
        }
        ColorStateList colorStateListM58495b2 = yya.m58495b(context2, anhVarM19306j, ebe.TextInputLayout_boxStrokeColor);
        this.b1 = anhVarM19306j.m17527b(ebe.TextInputLayout_boxStrokeColor, 0);
        this.Z0 = c64.getColor(context2, r6e.mtrl_textinput_default_box_stroke_color);
        this.h1 = c64.getColor(context2, r6e.mtrl_textinput_disabled_color);
        this.a1 = c64.getColor(context2, r6e.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM58495b2 != null) {
            setBoxStrokeColorStateList(colorStateListM58495b2);
        }
        if (anhVarM19306j.m17544s(ebe.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(yya.m58495b(context2, anhVarM19306j, ebe.TextInputLayout_boxStrokeErrorColor));
        }
        if (anhVarM19306j.m17539n(ebe.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(anhVarM19306j.m17539n(ebe.TextInputLayout_hintTextAppearance, 0));
        }
        this.s0 = anhVarM19306j.m17528c(ebe.TextInputLayout_cursorColor);
        this.t0 = anhVarM19306j.m17528c(ebe.TextInputLayout_cursorErrorColor);
        int iM17539n = anhVarM19306j.m17539n(ebe.TextInputLayout_errorTextAppearance, 0);
        CharSequence charSequenceM17541p = anhVarM19306j.m17541p(ebe.TextInputLayout_errorContentDescription);
        int iM17536k = anhVarM19306j.m17536k(ebe.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean zM17526a = anhVarM19306j.m17526a(ebe.TextInputLayout_errorEnabled, false);
        int iM17539n2 = anhVarM19306j.m17539n(ebe.TextInputLayout_helperTextTextAppearance, 0);
        boolean zM17526a2 = anhVarM19306j.m17526a(ebe.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequenceM17541p2 = anhVarM19306j.m17541p(ebe.TextInputLayout_helperText);
        int iM17539n3 = anhVarM19306j.m17539n(ebe.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence charSequenceM17541p3 = anhVarM19306j.m17541p(ebe.TextInputLayout_placeholderText);
        boolean zM17526a3 = anhVarM19306j.m17526a(ebe.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(anhVarM19306j.m17536k(ebe.TextInputLayout_counterMaxLength, -1));
        this.i0 = anhVarM19306j.m17539n(ebe.TextInputLayout_counterTextAppearance, 0);
        this.h0 = anhVarM19306j.m17539n(ebe.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(anhVarM19306j.m17536k(ebe.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(charSequenceM17541p);
        setErrorAccessibilityLiveRegion(iM17536k);
        setCounterOverflowTextAppearance(this.h0);
        setHelperTextTextAppearance(iM17539n2);
        setErrorTextAppearance(iM17539n);
        setCounterTextAppearance(this.i0);
        setPlaceholderText(charSequenceM17541p3);
        setPlaceholderTextAppearance(iM17539n3);
        if (anhVarM19306j.m17544s(ebe.TextInputLayout_errorTextColor)) {
            setErrorTextColor(anhVarM19306j.m17528c(ebe.TextInputLayout_errorTextColor));
        }
        if (anhVarM19306j.m17544s(ebe.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(anhVarM19306j.m17528c(ebe.TextInputLayout_helperTextTextColor));
        }
        if (anhVarM19306j.m17544s(ebe.TextInputLayout_hintTextColor)) {
            setHintTextColor(anhVarM19306j.m17528c(ebe.TextInputLayout_hintTextColor));
        }
        if (anhVarM19306j.m17544s(ebe.TextInputLayout_counterTextColor)) {
            setCounterTextColor(anhVarM19306j.m17528c(ebe.TextInputLayout_counterTextColor));
        }
        if (anhVarM19306j.m17544s(ebe.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(anhVarM19306j.m17528c(ebe.TextInputLayout_counterOverflowTextColor));
        }
        if (anhVarM19306j.m17544s(ebe.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(anhVarM19306j.m17528c(ebe.TextInputLayout_placeholderTextColor));
        }
        C11154a c11154a = new C11154a(this, anhVarM19306j);
        this.f13107c = c11154a;
        boolean zM17526a4 = anhVarM19306j.m17526a(ebe.TextInputLayout_android_enabled, true);
        setHintMaxLines(anhVarM19306j.m17536k(ebe.TextInputLayout_hintMaxLines, 1));
        anhVarM19306j.m17546x();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(u3gVar);
        frameLayout.addView(c11154a);
        addView(frameLayout);
        setEnabled(zM17526a4);
        setHelperTextEnabled(zM17526a2);
        setErrorEnabled(zM17526a);
        setCounterEnabled(zM17526a3);
        setHelperText(charSequenceM17541p2);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}

package com.google.android.material.textfield;

import a6.AbstractC0059g;
import a6.C0054b;
import a6.C0058f;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bh.AbstractC0659a;
import c6.v0;
import com.google.android.material.internal.CheckableImageButton;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import fh.C2287b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import l0.RunnableC4307g;
import l4.d0;
import lh.AbstractC4467c;
import lh.C4466b;
import mh.C4748a;
import mh.C4751d;
import og.y0;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p013o.C5232r;
import p013o.j0;
import p013o.r0;
import pg.s8;
import ph.C5951f;
import ph.C5952g;
import ph.C5955j;
import rh.AbstractC6536o;
import rh.C6522a;
import rh.C6524c;
import rh.C6525d;
import rh.C6528g;
import rh.C6530i;
import rh.C6535n;
import rh.C6538q;
import rh.C6541t;
import rh.C6542u;
import rh.RunnableC6540s;
import u5.AbstractC7339a;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public ColorStateList A1;

    /* renamed from: B */
    public final j0 f6941B;
    public ColorStateList B1;

    /* renamed from: C */
    public CharSequence f6942C;
    public int C1;

    /* renamed from: D */
    public final j0 f6943D;
    public int D1;

    /* renamed from: E */
    public boolean f6944E;
    public int E1;

    /* renamed from: F */
    public CharSequence f6945F;
    public ColorStateList F1;

    /* renamed from: G */
    public boolean f6946G;
    public int G1;

    /* renamed from: H */
    public C5952g f6947H;
    public int H1;

    /* renamed from: I */
    public C5952g f6948I;
    public int I1;
    public int J1;

    /* renamed from: K */
    public final C5955j f6949K;
    public int K1;

    /* renamed from: L */
    public final int f6950L;
    public boolean L1;

    /* renamed from: M */
    public int f6951M;
    public final C4466b M1;

    /* renamed from: N */
    public int f6952N;
    public boolean N1;

    /* renamed from: O */
    public int f6953O;
    public boolean O1;
    public ValueAnimator P1;
    public boolean Q1;
    public boolean R1;

    /* renamed from: T */
    public int f6954T;

    /* renamed from: V */
    public int f6955V;
    public int X0;
    public final Rect Y0;
    public final Rect Z0;

    /* renamed from: a */
    public final FrameLayout f6956a;

    /* renamed from: a1, reason: collision with root package name */
    public final RectF f43886a1;

    /* renamed from: b */
    public final LinearLayout f6957b;

    /* renamed from: b1, reason: collision with root package name */
    public Typeface f43887b1;

    /* renamed from: c */
    public final LinearLayout f6958c;

    /* renamed from: c1, reason: collision with root package name */
    public final CheckableImageButton f43888c1;

    /* renamed from: d */
    public final FrameLayout f6959d;

    /* renamed from: d1, reason: collision with root package name */
    public ColorStateList f43889d1;

    /* renamed from: e */
    public EditText f6960e;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f43890e1;

    /* renamed from: f */
    public CharSequence f6961f;

    /* renamed from: f1, reason: collision with root package name */
    public PorterDuff.Mode f43891f1;

    /* renamed from: g */
    public int f6962g;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f43892g1;

    /* renamed from: h */
    public int f6963h;

    /* renamed from: h0, reason: collision with root package name */
    public int f43893h0;

    /* renamed from: h1, reason: collision with root package name */
    public ColorDrawable f43894h1;

    /* renamed from: i1, reason: collision with root package name */
    public int f43895i1;

    /* renamed from: j */
    public final C6538q f6964j;

    /* renamed from: j1, reason: collision with root package name */
    public View.OnLongClickListener f43896j1;

    /* renamed from: k */
    public boolean f6965k;

    /* renamed from: k1, reason: collision with root package name */
    public final LinkedHashSet f43897k1;

    /* renamed from: l */
    public int f6966l;

    /* renamed from: l1, reason: collision with root package name */
    public int f43898l1;

    /* renamed from: m */
    public boolean f6967m;

    /* renamed from: m1, reason: collision with root package name */
    public final SparseArray f43899m1;

    /* renamed from: n */
    public j0 f6968n;

    /* renamed from: n1, reason: collision with root package name */
    public final CheckableImageButton f43900n1;

    /* renamed from: o1, reason: collision with root package name */
    public final LinkedHashSet f43901o1;

    /* renamed from: p */
    public int f6969p;

    /* renamed from: p1, reason: collision with root package name */
    public ColorStateList f43902p1;

    /* renamed from: q */
    public int f6970q;

    /* renamed from: q1, reason: collision with root package name */
    public boolean f43903q1;

    /* renamed from: r */
    public CharSequence f6971r;

    /* renamed from: r1, reason: collision with root package name */
    public PorterDuff.Mode f43904r1;

    /* renamed from: s */
    public boolean f6972s;

    /* renamed from: s1, reason: collision with root package name */
    public boolean f43905s1;

    /* renamed from: t */
    public j0 f6973t;

    /* renamed from: t0, reason: collision with root package name */
    public int f43906t0;

    /* renamed from: t1, reason: collision with root package name */
    public ColorDrawable f43907t1;

    /* renamed from: u1, reason: collision with root package name */
    public int f43908u1;

    /* renamed from: v */
    public ColorStateList f6974v;

    /* renamed from: v1, reason: collision with root package name */
    public Drawable f43909v1;

    /* renamed from: w */
    public int f6975w;

    /* renamed from: w1, reason: collision with root package name */
    public View.OnLongClickListener f43910w1;

    /* renamed from: x */
    public ColorStateList f6976x;

    /* renamed from: x1, reason: collision with root package name */
    public View.OnLongClickListener f43911x1;

    /* renamed from: y */
    public ColorStateList f6977y;

    /* renamed from: y1, reason: collision with root package name */
    public final CheckableImageButton f43912y1;

    /* renamed from: z */
    public CharSequence f6978z;

    /* renamed from: z1, reason: collision with root package name */
    public ColorStateList f43913z1;

    /* JADX WARN: Removed duplicated region for block: B:99:0x0511  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r30, android.util.AttributeSet r31) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: d */
    public static void m4116d(CheckableImageButton checkableImageButton, boolean z6, ColorStateList colorStateList, boolean z10, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z6 || z10)) {
            drawable = drawable.mutate();
            if (z6) {
                drawable.setTintList(colorStateList);
            }
            if (z10) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private AbstractC6536o getEndIconDelegate() {
        int i10 = this.f43898l1;
        SparseArray sparseArray = this.f43899m1;
        AbstractC6536o abstractC6536o = (AbstractC6536o) sparseArray.get(i10);
        return abstractC6536o != null ? abstractC6536o : (AbstractC6536o) sparseArray.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton = this.f43912y1;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if (this.f43898l1 == 0 || !m4124g()) {
            return null;
        }
        return this.f43900n1;
    }

    /* renamed from: j */
    public static void m4117j(ViewGroup viewGroup, boolean z6) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z6);
            if (childAt instanceof ViewGroup) {
                m4117j((ViewGroup) childAt, z6);
            }
        }
    }

    /* renamed from: l */
    public static void m4118l(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        Field field = v0.f5527a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z6 = onLongClickListener != null;
        boolean z10 = zHasOnClickListeners || z6;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z6);
        checkableImageButton.setImportantForAccessibility(z10 ? 1 : 2);
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        boolean z6;
        boolean z10;
        if (this.f6960e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        this.f6960e = editText;
        setMinWidth(this.f6962g);
        setMaxWidth(this.f6963h);
        m4125h();
        setTextInputAccessibilityDelegate(new C6541t(this));
        Typeface typeface = this.f6960e.getTypeface();
        C4466b c4466b = this.M1;
        C4748a c4748a = c4466b.f22264v;
        if (c4748a != null) {
            c4748a.f23726c = true;
        }
        if (c4466b.f22261s != typeface) {
            c4466b.f22261s = typeface;
            z6 = true;
        } else {
            z6 = false;
        }
        if (c4466b.f22262t != typeface) {
            c4466b.f22262t = typeface;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z6 || z10) {
            c4466b.m9318g();
        }
        float textSize = this.f6960e.getTextSize();
        if (c4466b.f22251i != textSize) {
            c4466b.f22251i = textSize;
            c4466b.m9318g();
        }
        int gravity = this.f6960e.getGravity();
        int i10 = (gravity & (-113)) | 48;
        if (c4466b.f22250h != i10) {
            c4466b.f22250h = i10;
            c4466b.m9318g();
        }
        if (c4466b.f22249g != gravity) {
            c4466b.f22249g = gravity;
            c4466b.m9318g();
        }
        this.f6960e.addTextChangedListener(new C6522a(1, this));
        if (this.A1 == null) {
            this.A1 = this.f6960e.getHintTextColors();
        }
        if (this.f6944E) {
            if (TextUtils.isEmpty(this.f6945F)) {
                CharSequence hint = this.f6960e.getHint();
                this.f6961f = hint;
                setHint(hint);
                this.f6960e.setHint((CharSequence) null);
            }
            this.f6946G = true;
        }
        if (this.f6968n != null) {
            m4129n(this.f6960e.getText().length());
        }
        m4132q();
        this.f6964j.m12561b();
        this.f6957b.bringToFront();
        this.f6958c.bringToFront();
        this.f6959d.bringToFront();
        this.f43912y1.bringToFront();
        Iterator it = this.f43897k1.iterator();
        while (it.hasNext()) {
            ((C6524c) it.next()).m12550a(this);
        }
        m4136u();
        m4139x();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m4134s(false, true);
    }

    private void setErrorIconVisible(boolean z6) throws Resources.NotFoundException {
        this.f43912y1.setVisibility(z6 ? 0 : 8);
        this.f6959d.setVisibility(z6 ? 8 : 0);
        m4139x();
        if (this.f43898l1 != 0) {
            return;
        }
        m4131p();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f6945F)) {
            return;
        }
        this.f6945F = charSequence;
        C4466b c4466b = this.M1;
        if (charSequence == null || !TextUtils.equals(c4466b.f22265w, charSequence)) {
            c4466b.f22265w = charSequence;
            c4466b.f22266x = null;
            Bitmap bitmap = c4466b.f22268z;
            if (bitmap != null) {
                bitmap.recycle();
                c4466b.f22268z = null;
            }
            c4466b.m9318g();
        }
        if (this.L1) {
            return;
        }
        m4126i();
    }

    private void setPlaceholderTextEnabled(boolean z6) {
        if (this.f6972s == z6) {
            return;
        }
        if (z6) {
            j0 j0Var = new j0(getContext(), null);
            this.f6973t = j0Var;
            j0Var.setId(R.id.textinput_placeholder);
            this.f6973t.setAccessibilityLiveRegion(1);
            setPlaceholderTextAppearance(this.f6975w);
            setPlaceholderTextColor(this.f6974v);
            j0 j0Var2 = this.f6973t;
            if (j0Var2 != null) {
                this.f6956a.addView(j0Var2);
                this.f6973t.setVisibility(0);
            }
        } else {
            j0 j0Var3 = this.f6973t;
            if (j0Var3 != null) {
                j0Var3.setVisibility(8);
            }
            this.f6973t = null;
        }
        this.f6972s = z6;
    }

    /* renamed from: a */
    public final void m4119a(float f6) {
        C4466b c4466b = this.M1;
        if (c4466b.f22245c == f6) {
            return;
        }
        int i10 = 2;
        if (this.P1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.P1 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0659a.f4204b);
            this.P1.setDuration(167L);
            this.P1.addUpdateListener(new C2287b(i10, this));
        }
        this.P1.setFloatValues(c4466b.f22245c, f6);
        this.P1.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f6956a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m4133r();
        setEditText((EditText) view);
    }

    /* renamed from: b */
    public final void m4120b() {
        int i10;
        int i11;
        int i12;
        C5952g c5952g = this.f6947H;
        if (c5952g == null) {
            return;
        }
        c5952g.setShapeAppearanceModel(this.f6949K);
        if (this.f6952N == 2 && (i11 = this.f6954T) > -1 && (i12 = this.f43906t0) != 0) {
            C5952g c5952g2 = this.f6947H;
            c5952g2.f29152a.f29144j = i11;
            c5952g2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i12);
            C5951f c5951f = c5952g2.f29152a;
            if (c5951f.f29138d != colorStateListValueOf) {
                c5951f.f29138d = colorStateListValueOf;
                c5952g2.onStateChange(c5952g2.getState());
            }
        }
        int iM13732b = this.X0;
        if (this.f6952N == 1) {
            TypedValue typedValueM11009b = og.v0.m11009b(getContext(), R.attr.colorSurface);
            iM13732b = AbstractC7339a.m13732b(this.X0, typedValueM11009b != null ? typedValueM11009b.data : 0);
        }
        this.X0 = iM13732b;
        this.f6947H.m11988i(ColorStateList.valueOf(iM13732b));
        if (this.f43898l1 == 3) {
            this.f6960e.getBackground().invalidateSelf();
        }
        C5952g c5952g3 = this.f6948I;
        if (c5952g3 != null) {
            if (this.f6954T > -1 && (i10 = this.f43906t0) != 0) {
                c5952g3.m11988i(ColorStateList.valueOf(i10));
            }
            invalidate();
        }
        invalidate();
    }

    /* renamed from: c */
    public final void m4121c() {
        m4116d(this.f43900n1, this.f43903q1, this.f43902p1, this.f43905s1, this.f43904r1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f6960e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f6961f != null) {
            boolean z6 = this.f6946G;
            this.f6946G = false;
            CharSequence hint = editText.getHint();
            this.f6960e.setHint(this.f6961f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f6960e.setHint(hint);
                this.f6946G = z6;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f6956a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f6960e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.R1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.R1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f6944E) {
            C4466b c4466b = this.M1;
            c4466b.getClass();
            int iSave = canvas.save();
            if (c4466b.f22266x != null && c4466b.f22244b) {
                c4466b.f22241N.getLineLeft(0);
                c4466b.f22232E.setTextSize(c4466b.f22229B);
                float f6 = c4466b.f22259q;
                float f10 = c4466b.f22260r;
                float f11 = c4466b.f22228A;
                if (f11 != 1.0f) {
                    canvas.scale(f11, f11, f6, f10);
                }
                canvas.translate(f6, f10);
                c4466b.f22241N.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        C5952g c5952g = this.f6948I;
        if (c5952g != null) {
            Rect bounds = c5952g.getBounds();
            bounds.top = bounds.bottom - this.f6954T;
            this.f6948I.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.Q1
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.Q1 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            lh.b r3 = r4.M1
            if (r3 == 0) goto L2f
            r3.f22230C = r1
            android.content.res.ColorStateList r1 = r3.f22254l
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f22253k
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.m9318g()
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f6960e
            if (r3 == 0) goto L47
            java.lang.reflect.Field r3 = c6.v0.f5527a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.m4134s(r0, r2)
        L47:
            r4.m4132q()
            r4.m4141z()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.Q1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    /* renamed from: e */
    public final int m4122e() {
        float f6;
        if (!this.f6944E) {
            return 0;
        }
        int i10 = this.f6952N;
        C4466b c4466b = this.M1;
        if (i10 == 0 || i10 == 1) {
            TextPaint textPaint = c4466b.f22233F;
            textPaint.setTextSize(c4466b.f22252j);
            textPaint.setTypeface(c4466b.f22261s);
            textPaint.setLetterSpacing(c4466b.f22240M);
            f6 = -textPaint.ascent();
        } else {
            if (i10 != 2) {
                return 0;
            }
            TextPaint textPaint2 = c4466b.f22233F;
            textPaint2.setTextSize(c4466b.f22252j);
            textPaint2.setTypeface(c4466b.f22261s);
            textPaint2.setLetterSpacing(c4466b.f22240M);
            f6 = (-textPaint2.ascent()) / 2.0f;
        }
        return (int) f6;
    }

    /* renamed from: f */
    public final boolean m4123f() {
        return this.f6944E && !TextUtils.isEmpty(this.f6945F) && (this.f6947H instanceof C6530i);
    }

    /* renamed from: g */
    public final boolean m4124g() {
        return this.f6959d.getVisibility() == 0 && this.f43900n1.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f6960e;
        if (editText == null) {
            return super.getBaseline();
        }
        return m4122e() + getPaddingTop() + editText.getBaseline();
    }

    public C5952g getBoxBackground() {
        int i10 = this.f6952N;
        if (i10 == 1 || i10 == 2) {
            return this.f6947H;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.X0;
    }

    public int getBoxBackgroundMode() {
        return this.f6952N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        C5952g c5952g = this.f6947H;
        return c5952g.f29152a.f29135a.f29182h.mo11975a(c5952g.m11984e());
    }

    public float getBoxCornerRadiusBottomStart() {
        C5952g c5952g = this.f6947H;
        return c5952g.f29152a.f29135a.f29181g.mo11975a(c5952g.m11984e());
    }

    public float getBoxCornerRadiusTopEnd() {
        C5952g c5952g = this.f6947H;
        return c5952g.f29152a.f29135a.f29180f.mo11975a(c5952g.m11984e());
    }

    public float getBoxCornerRadiusTopStart() {
        C5952g c5952g = this.f6947H;
        return c5952g.f29152a.f29135a.f29179e.mo11975a(c5952g.m11984e());
    }

    public int getBoxStrokeColor() {
        return this.E1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.F1;
    }

    public int getBoxStrokeWidth() {
        return this.f6955V;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f43893h0;
    }

    public int getCounterMaxLength() {
        return this.f6966l;
    }

    public CharSequence getCounterOverflowDescription() {
        j0 j0Var;
        if (this.f6965k && this.f6967m && (j0Var = this.f6968n) != null) {
            return j0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f6976x;
    }

    public ColorStateList getCounterTextColor() {
        return this.f6976x;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A1;
    }

    public EditText getEditText() {
        return this.f6960e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f43900n1.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f43900n1.getDrawable();
    }

    public int getEndIconMode() {
        return this.f43898l1;
    }

    public CheckableImageButton getEndIconView() {
        return this.f43900n1;
    }

    public CharSequence getError() {
        C6538q c6538q = this.f6964j;
        if (c6538q.f31354k) {
            return c6538q.f31353j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f6964j.f31356m;
    }

    public int getErrorCurrentTextColors() {
        j0 j0Var = this.f6964j.f31355l;
        if (j0Var != null) {
            return j0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f43912y1.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        j0 j0Var = this.f6964j.f31355l;
        if (j0Var != null) {
            return j0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        C6538q c6538q = this.f6964j;
        if (c6538q.f31360q) {
            return c6538q.f31359p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        j0 j0Var = this.f6964j.f31361r;
        if (j0Var != null) {
            return j0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f6944E) {
            return this.f6945F;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        C4466b c4466b = this.M1;
        TextPaint textPaint = c4466b.f22233F;
        textPaint.setTextSize(c4466b.f22252j);
        textPaint.setTypeface(c4466b.f22261s);
        textPaint.setLetterSpacing(c4466b.f22240M);
        return -textPaint.ascent();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C4466b c4466b = this.M1;
        return c4466b.m9316d(c4466b.f22254l);
    }

    public ColorStateList getHintTextColor() {
        return this.B1;
    }

    public int getMaxWidth() {
        return this.f6963h;
    }

    public int getMinWidth() {
        return this.f6962g;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f43900n1.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f43900n1.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f6972s) {
            return this.f6971r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f6975w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f6974v;
    }

    public CharSequence getPrefixText() {
        return this.f6978z;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f6941B.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f6941B;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f43888c1.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f43888c1.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f6942C;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f6943D.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f6943D;
    }

    public Typeface getTypeface() {
        return this.f43887b1;
    }

    /* renamed from: h */
    public final void m4125h() throws Resources.NotFoundException {
        int i10 = this.f6952N;
        if (i10 != 0) {
            C5955j c5955j = this.f6949K;
            if (i10 == 1) {
                this.f6947H = new C5952g(c5955j);
                this.f6948I = new C5952g();
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException(AbstractC5601a.m11233d(this.f6952N, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
                }
                if (!this.f6944E || (this.f6947H instanceof C6530i)) {
                    this.f6947H = new C5952g(c5955j);
                } else {
                    this.f6947H = new C6530i(c5955j);
                }
                this.f6948I = null;
            }
        } else {
            this.f6947H = null;
            this.f6948I = null;
        }
        EditText editText = this.f6960e;
        if (editText != null && this.f6947H != null && editText.getBackground() == null && this.f6952N != 0) {
            EditText editText2 = this.f6960e;
            C5952g c5952g = this.f6947H;
            Field field = v0.f5527a;
            editText2.setBackground(c5952g);
        }
        m4141z();
        if (this.f6952N == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f6953O = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (y0.m11060j(getContext())) {
                this.f6953O = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f6960e != null && this.f6952N == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText3 = this.f6960e;
                Field field2 = v0.f5527a;
                editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.f6960e.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (y0.m11060j(getContext())) {
                EditText editText4 = this.f6960e;
                Field field3 = v0.f5527a;
                editText4.setPaddingRelative(editText4.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.f6960e.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f6952N != 0) {
            m4133r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4126i() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m4126i():void");
    }

    /* renamed from: k */
    public final void m4127k(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* renamed from: m */
    public final void m4128m(j0 j0Var, int i10) {
        try {
            j0Var.setTextAppearance(i10);
            if (j0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        j0Var.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
        j0Var.setTextColor(getContext().getColor(R.color.design_error));
    }

    /* renamed from: n */
    public final void m4129n(int i10) throws Resources.NotFoundException {
        boolean z6 = this.f6967m;
        int i11 = this.f6966l;
        if (i11 == -1) {
            this.f6968n.setText(String.valueOf(i10));
            this.f6968n.setContentDescription(null);
            this.f6967m = false;
        } else {
            this.f6967m = i10 > i11;
            Context context = getContext();
            this.f6968n.setContentDescription(context.getString(this.f6967m ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i10), Integer.valueOf(this.f6966l)));
            if (z6 != this.f6967m) {
                m4130o();
            }
            String str = C0054b.f223b;
            C0054b c0054b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0054b.f226e : C0054b.f225d;
            j0 j0Var = this.f6968n;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.f6966l));
            c0054b.getClass();
            C0058f c0058f = AbstractC0059g.f235a;
            j0Var.setText(string != null ? c0054b.m161c(string).toString() : null);
        }
        if (this.f6960e == null || z6 == this.f6967m) {
            return;
        }
        m4134s(false, false);
        m4141z();
        m4132q();
    }

    /* renamed from: o */
    public final void m4130o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        j0 j0Var = this.f6968n;
        if (j0Var != null) {
            m4128m(j0Var, this.f6967m ? this.f6969p : this.f6970q);
            if (!this.f6967m && (colorStateList2 = this.f6976x) != null) {
                this.f6968n.setTextColor(colorStateList2);
            }
            if (!this.f6967m || (colorStateList = this.f6977y) == null) {
                return;
            }
            this.f6968n.setTextColor(colorStateList);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        EditText editText = this.f6960e;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC4467c.f22269a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.Y0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC4467c.f22269a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC4467c.m9322a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC4467c.f22270b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C5952g c5952g = this.f6948I;
            if (c5952g != null) {
                int i14 = rect.bottom;
                c5952g.setBounds(rect.left, i14 - this.f43893h0, rect.right, i14);
            }
            if (this.f6944E) {
                float textSize = this.f6960e.getTextSize();
                C4466b c4466b = this.M1;
                if (c4466b.f22251i != textSize) {
                    c4466b.f22251i = textSize;
                    c4466b.m9318g();
                }
                int gravity = this.f6960e.getGravity();
                int i15 = (gravity & (-113)) | 48;
                if (c4466b.f22250h != i15) {
                    c4466b.f22250h = i15;
                    c4466b.m9318g();
                }
                if (c4466b.f22249g != gravity) {
                    c4466b.f22249g = gravity;
                    c4466b.m9318g();
                }
                if (this.f6960e == null) {
                    throw new IllegalStateException();
                }
                Field field = v0.f5527a;
                boolean z10 = getLayoutDirection() == 1;
                int i16 = rect.bottom;
                Rect rect2 = this.Z0;
                rect2.bottom = i16;
                int i17 = this.f6952N;
                j0 j0Var = this.f6941B;
                if (i17 == 1) {
                    int compoundPaddingLeft = this.f6960e.getCompoundPaddingLeft() + rect.left;
                    if (this.f6978z != null && !z10) {
                        compoundPaddingLeft = (compoundPaddingLeft - j0Var.getMeasuredWidth()) + j0Var.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft;
                    rect2.top = rect.top + this.f6953O;
                    int compoundPaddingRight = rect.right - this.f6960e.getCompoundPaddingRight();
                    if (this.f6978z != null && z10) {
                        compoundPaddingRight += j0Var.getMeasuredWidth() - j0Var.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight;
                } else if (i17 != 2) {
                    int compoundPaddingLeft2 = this.f6960e.getCompoundPaddingLeft() + rect.left;
                    if (this.f6978z != null && !z10) {
                        compoundPaddingLeft2 = (compoundPaddingLeft2 - j0Var.getMeasuredWidth()) + j0Var.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft2;
                    rect2.top = getPaddingTop();
                    int compoundPaddingRight2 = rect.right - this.f6960e.getCompoundPaddingRight();
                    if (this.f6978z != null && z10) {
                        compoundPaddingRight2 += j0Var.getMeasuredWidth() - j0Var.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight2;
                } else {
                    rect2.left = this.f6960e.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m4122e();
                    rect2.right = rect.right - this.f6960e.getPaddingRight();
                }
                int i18 = rect2.left;
                int i19 = rect2.top;
                int i20 = rect2.right;
                int i21 = rect2.bottom;
                Rect rect3 = c4466b.f22247e;
                if (rect3.left != i18 || rect3.top != i19 || rect3.right != i20 || rect3.bottom != i21) {
                    rect3.set(i18, i19, i20, i21);
                    c4466b.f22231D = true;
                    c4466b.m9317f();
                }
                if (this.f6960e == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c4466b.f22233F;
                textPaint.setTextSize(c4466b.f22251i);
                textPaint.setTypeface(c4466b.f22262t);
                textPaint.setLetterSpacing(DefinitionKt.NO_Float_VALUE);
                float f6 = -textPaint.ascent();
                rect2.left = this.f6960e.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f6952N != 1 || this.f6960e.getMinLines() > 1) ? rect.top + this.f6960e.getCompoundPaddingTop() : (int) (rect.centerY() - (f6 / 2.0f));
                rect2.right = rect.right - this.f6960e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f6952N != 1 || this.f6960e.getMinLines() > 1) ? rect.bottom - this.f6960e.getCompoundPaddingBottom() : (int) (rect2.top + f6);
                rect2.bottom = compoundPaddingBottom;
                int i22 = rect2.left;
                int i23 = rect2.top;
                int i24 = rect2.right;
                Rect rect4 = c4466b.f22246d;
                if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i22, i23, i24, compoundPaddingBottom);
                    c4466b.f22231D = true;
                    c4466b.m9317f();
                }
                c4466b.m9318g();
                if (!m4123f() || this.L1) {
                    return;
                }
                m4126i();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        EditText editText;
        int iMax;
        super.onMeasure(i10, i11);
        boolean z6 = false;
        if (this.f6960e != null && this.f6960e.getMeasuredHeight() < (iMax = Math.max(this.f6958c.getMeasuredHeight(), this.f6957b.getMeasuredHeight()))) {
            this.f6960e.setMinimumHeight(iMax);
            z6 = true;
        }
        boolean zM4131p = m4131p();
        if (z6 || zM4131p) {
            this.f6960e.post(new RunnableC6540s(this, 1));
        }
        if (this.f6973t != null && (editText = this.f6960e) != null) {
            this.f6973t.setGravity(editText.getGravity());
            this.f6973t.setPadding(this.f6960e.getCompoundPaddingLeft(), this.f6960e.getCompoundPaddingTop(), this.f6960e.getCompoundPaddingRight(), this.f6960e.getCompoundPaddingBottom());
        }
        m4136u();
        m4139x();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof C6542u)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C6542u c6542u = (C6542u) parcelable;
        super.onRestoreInstanceState(c6542u.f21992a);
        setError(c6542u.f31371c);
        if (c6542u.f31372d) {
            this.f43900n1.post(new RunnableC6540s(this, 0));
        }
        setHint(c6542u.f31373e);
        setHelperText(c6542u.f31374f);
        setPlaceholderText(c6542u.f31375g);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C6542u c6542u = new C6542u(super.onSaveInstanceState());
        if (this.f6964j.m12564e()) {
            c6542u.f31371c = getError();
        }
        c6542u.f31372d = this.f43898l1 != 0 && this.f43900n1.f6920d;
        c6542u.f31373e = getHint();
        c6542u.f31374f = getHelperText();
        c6542u.f31375g = getPlaceholderText();
        return c6542u;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4131p() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m4131p():boolean");
    }

    /* renamed from: q */
    public final void m4132q() {
        Drawable background;
        j0 j0Var;
        EditText editText = this.f6960e;
        if (editText == null || this.f6952N != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = r0.f25630a;
        Drawable drawableMutate = background.mutate();
        C6538q c6538q = this.f6964j;
        if (c6538q.m12564e()) {
            j0 j0Var2 = c6538q.f31355l;
            drawableMutate.setColorFilter(C5232r.m10282b(j0Var2 != null ? j0Var2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
        } else if (this.f6967m && (j0Var = this.f6968n) != null) {
            drawableMutate.setColorFilter(C5232r.m10282b(j0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f6960e.refreshDrawableState();
        }
    }

    /* renamed from: r */
    public final void m4133r() {
        if (this.f6952N != 1) {
            FrameLayout frameLayout = this.f6956a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM4122e = m4122e();
            if (iM4122e != layoutParams.topMargin) {
                layoutParams.topMargin = iM4122e;
                frameLayout.requestLayout();
            }
        }
    }

    /* renamed from: s */
    public final void m4134s(boolean z6, boolean z10) {
        ColorStateList colorStateList;
        j0 j0Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f6960e;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f6960e;
        boolean z12 = editText2 != null && editText2.hasFocus();
        C6538q c6538q = this.f6964j;
        boolean zM12564e = c6538q.m12564e();
        ColorStateList colorStateList2 = this.A1;
        C4466b c4466b = this.M1;
        if (colorStateList2 != null) {
            c4466b.m9319h(colorStateList2);
            ColorStateList colorStateList3 = this.A1;
            if (c4466b.f22253k != colorStateList3) {
                c4466b.f22253k = colorStateList3;
                c4466b.m9318g();
            }
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList4 = this.A1;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.K1) : this.K1;
            c4466b.m9319h(ColorStateList.valueOf(colorForState));
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(colorForState);
            if (c4466b.f22253k != colorStateListValueOf) {
                c4466b.f22253k = colorStateListValueOf;
                c4466b.m9318g();
            }
        } else if (zM12564e) {
            j0 j0Var2 = c6538q.f31355l;
            c4466b.m9319h(j0Var2 != null ? j0Var2.getTextColors() : null);
        } else if (this.f6967m && (j0Var = this.f6968n) != null) {
            c4466b.m9319h(j0Var.getTextColors());
        } else if (z12 && (colorStateList = this.B1) != null) {
            c4466b.m9319h(colorStateList);
        }
        if (z11 || !this.N1 || (isEnabled() && z12)) {
            if (z10 || this.L1) {
                ValueAnimator valueAnimator = this.P1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.P1.cancel();
                }
                if (z6 && this.O1) {
                    m4119a(1.0f);
                } else {
                    c4466b.m9320i(1.0f);
                }
                this.L1 = false;
                if (m4123f()) {
                    m4126i();
                }
                EditText editText3 = this.f6960e;
                m4135t(editText3 != null ? editText3.getText().length() : 0);
                m4137v();
                m4140y();
                return;
            }
            return;
        }
        if (z10 || !this.L1) {
            ValueAnimator valueAnimator2 = this.P1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.P1.cancel();
            }
            if (z6 && this.O1) {
                m4119a(DefinitionKt.NO_Float_VALUE);
            } else {
                c4466b.m9320i(DefinitionKt.NO_Float_VALUE);
            }
            if (m4123f() && !((C6530i) this.f6947H).f31315C.isEmpty() && m4123f()) {
                ((C6530i) this.f6947H).m12554m(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE);
            }
            this.L1 = true;
            j0 j0Var3 = this.f6973t;
            if (j0Var3 != null && this.f6972s) {
                j0Var3.setText((CharSequence) null);
                this.f6973t.setVisibility(4);
            }
            m4137v();
            m4140y();
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.X0 != i10) {
            this.X0 = i10;
            this.G1 = i10;
            this.I1 = i10;
            this.J1 = i10;
            m4120b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(getContext().getColor(i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.G1 = defaultColor;
        this.X0 = defaultColor;
        this.H1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.I1 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.J1 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        m4120b();
    }

    public void setBoxBackgroundMode(int i10) throws Resources.NotFoundException {
        if (i10 == this.f6952N) {
            return;
        }
        this.f6952N = i10;
        if (this.f6960e != null) {
            m4125h();
        }
    }

    public void setBoxStrokeColor(int i10) throws Resources.NotFoundException {
        if (this.E1 != i10) {
            this.E1 = i10;
            m4141z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (colorStateList.isStateful()) {
            this.C1 = colorStateList.getDefaultColor();
            this.K1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.D1 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.E1 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.E1 != colorStateList.getDefaultColor()) {
            this.E1 = colorStateList.getDefaultColor();
        }
        m4141z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.F1 != colorStateList) {
            this.F1 = colorStateList;
            m4141z();
        }
    }

    public void setBoxStrokeWidth(int i10) throws Resources.NotFoundException {
        this.f6955V = i10;
        m4141z();
    }

    public void setBoxStrokeWidthFocused(int i10) throws Resources.NotFoundException {
        this.f43893h0 = i10;
        m4141z();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z6) throws Resources.NotFoundException {
        if (this.f6965k != z6) {
            C6538q c6538q = this.f6964j;
            if (z6) {
                j0 j0Var = new j0(getContext(), null);
                this.f6968n = j0Var;
                j0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.f43887b1;
                if (typeface != null) {
                    this.f6968n.setTypeface(typeface);
                }
                this.f6968n.setMaxLines(1);
                c6538q.m12560a(this.f6968n, 2);
                ((ViewGroup.MarginLayoutParams) this.f6968n.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                m4130o();
                if (this.f6968n != null) {
                    EditText editText = this.f6960e;
                    m4129n(editText == null ? 0 : editText.getText().length());
                }
            } else {
                c6538q.m12567h(this.f6968n, 2);
                this.f6968n = null;
            }
            this.f6965k = z6;
        }
    }

    public void setCounterMaxLength(int i10) throws Resources.NotFoundException {
        if (this.f6966l != i10) {
            if (i10 > 0) {
                this.f6966l = i10;
            } else {
                this.f6966l = -1;
            }
            if (!this.f6965k || this.f6968n == null) {
                return;
            }
            EditText editText = this.f6960e;
            m4129n(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f6969p != i10) {
            this.f6969p = i10;
            m4130o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f6977y != colorStateList) {
            this.f6977y = colorStateList;
            m4130o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f6970q != i10) {
            this.f6970q = i10;
            m4130o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f6976x != colorStateList) {
            this.f6976x = colorStateList;
            m4130o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A1 = colorStateList;
        this.B1 = colorStateList;
        if (this.f6960e != null) {
            m4134s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        m4117j(this, z6);
        super.setEnabled(z6);
    }

    public void setEndIconActivated(boolean z6) {
        this.f43900n1.setActivated(z6);
    }

    public void setEndIconCheckable(boolean z6) {
        this.f43900n1.setCheckable(z6);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? s8.m11864b(getContext(), i10) : null);
    }

    public void setEndIconMode(int i10) throws Resources.NotFoundException {
        int i11 = this.f43898l1;
        this.f43898l1 = i10;
        Iterator it = this.f43901o1.iterator();
        while (it.hasNext()) {
            C6525d c6525d = (C6525d) it.next();
            switch (c6525d.f31301a) {
                case 0:
                    EditText editText = getEditText();
                    if (editText != null && i11 == 2) {
                        editText.post(new RunnableC8956c(11, c6525d, editText, false));
                        if (editText.getOnFocusChangeListener() != ((C6528g) c6525d.f31302b).f31308e) {
                            break;
                        } else {
                            editText.setOnFocusChangeListener(null);
                            break;
                        }
                    } else {
                        break;
                    }
                    break;
                case 1:
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) getEditText();
                    if (autoCompleteTextView != null && i11 == 3) {
                        autoCompleteTextView.post(new RunnableC8956c(12, c6525d, autoCompleteTextView, false));
                        if (autoCompleteTextView.getOnFocusChangeListener() == ((C6535n) c6525d.f31302b).f31324e) {
                            autoCompleteTextView.setOnFocusChangeListener(null);
                        }
                        autoCompleteTextView.setOnTouchListener(null);
                        autoCompleteTextView.setOnDismissListener(null);
                        break;
                    } else {
                        break;
                    }
                default:
                    EditText editText2 = getEditText();
                    if (editText2 != null && i11 == 1) {
                        editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        editText2.post(new RunnableC4307g(13, c6525d, editText2, false));
                        break;
                    } else {
                        break;
                    }
                    break;
            }
        }
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().mo12557b(this.f6952N)) {
            getEndIconDelegate().mo12551a();
            m4121c();
        } else {
            throw new IllegalStateException("The current box background mode " + this.f6952N + " is not supported by the end icon mode " + i10);
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f43910w1;
        CheckableImageButton checkableImageButton = this.f43900n1;
        checkableImageButton.setOnClickListener(onClickListener);
        m4118l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f43910w1 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f43900n1;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m4118l(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f43902p1 != colorStateList) {
            this.f43902p1 = colorStateList;
            this.f43903q1 = true;
            m4121c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f43904r1 != mode) {
            this.f43904r1 = mode;
            this.f43905s1 = true;
            m4121c();
        }
    }

    public void setEndIconVisible(boolean z6) throws Resources.NotFoundException {
        if (m4124g() != z6) {
            this.f43900n1.setVisibility(z6 ? 0 : 8);
            m4139x();
            m4131p();
        }
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        C6538q c6538q = this.f6964j;
        if (!c6538q.f31354k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c6538q.m12566g();
            return;
        }
        c6538q.m12562c();
        c6538q.f31353j = charSequence;
        c6538q.f31355l.setText(charSequence);
        int i10 = c6538q.f31351h;
        if (i10 != 1) {
            c6538q.f31352i = 1;
        }
        c6538q.m12569j(i10, c6538q.f31352i, c6538q.m12568i(c6538q.f31355l, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C6538q c6538q = this.f6964j;
        c6538q.f31356m = charSequence;
        j0 j0Var = c6538q.f31355l;
        if (j0Var != null) {
            j0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z6) throws Resources.NotFoundException {
        C6538q c6538q = this.f6964j;
        TextInputLayout textInputLayout = c6538q.f31345b;
        if (c6538q.f31354k == z6) {
            return;
        }
        c6538q.m12562c();
        if (z6) {
            j0 j0Var = new j0(c6538q.f31344a, null);
            c6538q.f31355l = j0Var;
            j0Var.setId(R.id.textinput_error);
            c6538q.f31355l.setTextAlignment(5);
            Typeface typeface = c6538q.f31364u;
            if (typeface != null) {
                c6538q.f31355l.setTypeface(typeface);
            }
            int i10 = c6538q.f31357n;
            c6538q.f31357n = i10;
            j0 j0Var2 = c6538q.f31355l;
            if (j0Var2 != null) {
                c6538q.f31345b.m4128m(j0Var2, i10);
            }
            ColorStateList colorStateList = c6538q.f31358o;
            c6538q.f31358o = colorStateList;
            j0 j0Var3 = c6538q.f31355l;
            if (j0Var3 != null && colorStateList != null) {
                j0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c6538q.f31356m;
            c6538q.f31356m = charSequence;
            j0 j0Var4 = c6538q.f31355l;
            if (j0Var4 != null) {
                j0Var4.setContentDescription(charSequence);
            }
            c6538q.f31355l.setVisibility(4);
            c6538q.f31355l.setAccessibilityLiveRegion(1);
            c6538q.m12560a(c6538q.f31355l, 0);
        } else {
            c6538q.m12566g();
            c6538q.m12567h(c6538q.f31355l, 0);
            c6538q.f31355l = null;
            textInputLayout.m4132q();
            textInputLayout.m4141z();
        }
        c6538q.f31354k = z6;
    }

    public void setErrorIconDrawable(int i10) throws Resources.NotFoundException {
        setErrorIconDrawable(i10 != 0 ? s8.m11864b(getContext(), i10) : null);
        m4127k(this.f43912y1, this.f43913z1);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f43911x1;
        CheckableImageButton checkableImageButton = this.f43912y1;
        checkableImageButton.setOnClickListener(onClickListener);
        m4118l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f43911x1 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f43912y1;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m4118l(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f43913z1 = colorStateList;
        CheckableImageButton checkableImageButton = this.f43912y1;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.f43912y1;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i10) {
        C6538q c6538q = this.f6964j;
        c6538q.f31357n = i10;
        j0 j0Var = c6538q.f31355l;
        if (j0Var != null) {
            c6538q.f31345b.m4128m(j0Var, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C6538q c6538q = this.f6964j;
        c6538q.f31358o = colorStateList;
        j0 j0Var = c6538q.f31355l;
        if (j0Var == null || colorStateList == null) {
            return;
        }
        j0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z6) {
        if (this.N1 != z6) {
            this.N1 = z6;
            m4134s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C6538q c6538q = this.f6964j;
        if (zIsEmpty) {
            if (c6538q.f31360q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c6538q.f31360q) {
            setHelperTextEnabled(true);
        }
        c6538q.m12562c();
        c6538q.f31359p = charSequence;
        c6538q.f31361r.setText(charSequence);
        int i10 = c6538q.f31351h;
        if (i10 != 2) {
            c6538q.f31352i = 2;
        }
        c6538q.m12569j(i10, c6538q.f31352i, c6538q.m12568i(c6538q.f31361r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C6538q c6538q = this.f6964j;
        c6538q.f31363t = colorStateList;
        j0 j0Var = c6538q.f31361r;
        if (j0Var == null || colorStateList == null) {
            return;
        }
        j0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z6) throws Resources.NotFoundException {
        C6538q c6538q = this.f6964j;
        TextInputLayout textInputLayout = c6538q.f31345b;
        if (c6538q.f31360q == z6) {
            return;
        }
        c6538q.m12562c();
        if (z6) {
            j0 j0Var = new j0(c6538q.f31344a, null);
            c6538q.f31361r = j0Var;
            j0Var.setId(R.id.textinput_helper_text);
            c6538q.f31361r.setTextAlignment(5);
            Typeface typeface = c6538q.f31364u;
            if (typeface != null) {
                c6538q.f31361r.setTypeface(typeface);
            }
            c6538q.f31361r.setVisibility(4);
            c6538q.f31361r.setAccessibilityLiveRegion(1);
            int i10 = c6538q.f31362s;
            c6538q.f31362s = i10;
            j0 j0Var2 = c6538q.f31361r;
            if (j0Var2 != null) {
                j0Var2.setTextAppearance(i10);
            }
            ColorStateList colorStateList = c6538q.f31363t;
            c6538q.f31363t = colorStateList;
            j0 j0Var3 = c6538q.f31361r;
            if (j0Var3 != null && colorStateList != null) {
                j0Var3.setTextColor(colorStateList);
            }
            c6538q.m12560a(c6538q.f31361r, 1);
        } else {
            c6538q.m12562c();
            int i11 = c6538q.f31351h;
            if (i11 == 2) {
                c6538q.f31352i = 0;
            }
            c6538q.m12569j(i11, c6538q.f31352i, c6538q.m12568i(c6538q.f31361r, null));
            c6538q.m12567h(c6538q.f31361r, 1);
            c6538q.f31361r = null;
            textInputLayout.m4132q();
            textInputLayout.m4141z();
        }
        c6538q.f31360q = z6;
    }

    public void setHelperTextTextAppearance(int i10) {
        C6538q c6538q = this.f6964j;
        c6538q.f31362s = i10;
        j0 j0Var = c6538q.f31361r;
        if (j0Var != null) {
            j0Var.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f6944E) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(NewHope.SENDB_BYTES);
        }
    }

    public void setHintAnimationEnabled(boolean z6) {
        this.O1 = z6;
    }

    public void setHintEnabled(boolean z6) {
        if (z6 != this.f6944E) {
            this.f6944E = z6;
            if (z6) {
                CharSequence hint = this.f6960e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f6945F)) {
                        setHint(hint);
                    }
                    this.f6960e.setHint((CharSequence) null);
                }
                this.f6946G = true;
            } else {
                this.f6946G = false;
                if (!TextUtils.isEmpty(this.f6945F) && TextUtils.isEmpty(this.f6960e.getHint())) {
                    this.f6960e.setHint(this.f6945F);
                }
                setHintInternal(null);
            }
            if (this.f6960e != null) {
                m4133r();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        C4466b c4466b = this.M1;
        TextInputLayout textInputLayout = c4466b.f22243a;
        C4751d c4751d = new C4751d(textInputLayout.getContext(), i10);
        ColorStateList colorStateList = c4751d.f23732a;
        if (colorStateList != null) {
            c4466b.f22254l = colorStateList;
        }
        float f6 = c4751d.f23742k;
        if (f6 != DefinitionKt.NO_Float_VALUE) {
            c4466b.f22252j = f6;
        }
        ColorStateList colorStateList2 = c4751d.f23733b;
        if (colorStateList2 != null) {
            c4466b.f22239L = colorStateList2;
        }
        c4466b.f22237J = c4751d.f23737f;
        c4466b.f22238K = c4751d.f23738g;
        c4466b.f22236I = c4751d.f23739h;
        c4466b.f22240M = c4751d.f23741j;
        C4748a c4748a = c4466b.f22264v;
        if (c4748a != null) {
            c4748a.f23726c = true;
        }
        d0 d0Var = new d0(1, c4466b);
        c4751d.m9655a();
        c4466b.f22264v = new C4748a(d0Var, c4751d.f23745n);
        c4751d.m9657c(textInputLayout.getContext(), c4466b.f22264v);
        c4466b.m9318g();
        this.B1 = c4466b.f22254l;
        if (this.f6960e != null) {
            m4134s(false, false);
            m4133r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.B1 != colorStateList) {
            if (this.A1 == null) {
                this.M1.m9319h(colorStateList);
            }
            this.B1 = colorStateList;
            if (this.f6960e != null) {
                m4134s(false, false);
            }
        }
    }

    public void setMaxWidth(int i10) {
        this.f6963h = i10;
        EditText editText = this.f6960e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinWidth(int i10) {
        this.f6962g = i10;
        EditText editText = this.f6960e;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? s8.m11864b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z6) throws Resources.NotFoundException {
        if (z6 && this.f43898l1 != 1) {
            setEndIconMode(1);
        } else {
            if (z6) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f43902p1 = colorStateList;
        this.f43903q1 = true;
        m4121c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f43904r1 = mode;
        this.f43905s1 = true;
        m4121c();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f6972s && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f6972s) {
                setPlaceholderTextEnabled(true);
            }
            this.f6971r = charSequence;
        }
        EditText editText = this.f6960e;
        m4135t(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f6975w = i10;
        j0 j0Var = this.f6973t;
        if (j0Var != null) {
            j0Var.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f6974v != colorStateList) {
            this.f6974v = colorStateList;
            j0 j0Var = this.f6973t;
            if (j0Var == null || colorStateList == null) {
                return;
            }
            j0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f6978z = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f6941B.setText(charSequence);
        m4137v();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f6941B.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f6941B.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z6) {
        this.f43888c1.setCheckable(z6);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) throws Resources.NotFoundException {
        setStartIconDrawable(i10 != 0 ? s8.m11864b(getContext(), i10) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f43896j1;
        CheckableImageButton checkableImageButton = this.f43888c1;
        checkableImageButton.setOnClickListener(onClickListener);
        m4118l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f43896j1 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f43888c1;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m4118l(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f43889d1 != colorStateList) {
            this.f43889d1 = colorStateList;
            this.f43890e1 = true;
            m4116d(this.f43888c1, true, colorStateList, this.f43892g1, this.f43891f1);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f43891f1 != mode) {
            this.f43891f1 = mode;
            this.f43892g1 = true;
            m4116d(this.f43888c1, this.f43890e1, this.f43889d1, true, mode);
        }
    }

    public void setStartIconVisible(boolean z6) throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f43888c1;
        if ((checkableImageButton.getVisibility() == 0) != z6) {
            checkableImageButton.setVisibility(z6 ? 0 : 8);
            m4136u();
            m4131p();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f6942C = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f6943D.setText(charSequence);
        m4140y();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f6943D.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f6943D.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C6541t c6541t) {
        EditText editText = this.f6960e;
        if (editText != null) {
            v0.m2528j(editText, c6541t);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z6;
        if (typeface != this.f43887b1) {
            this.f43887b1 = typeface;
            C4466b c4466b = this.M1;
            C4748a c4748a = c4466b.f22264v;
            boolean z10 = true;
            if (c4748a != null) {
                c4748a.f23726c = true;
            }
            if (c4466b.f22261s != typeface) {
                c4466b.f22261s = typeface;
                z6 = true;
            } else {
                z6 = false;
            }
            if (c4466b.f22262t != typeface) {
                c4466b.f22262t = typeface;
            } else {
                z10 = false;
            }
            if (z6 || z10) {
                c4466b.m9318g();
            }
            C6538q c6538q = this.f6964j;
            if (typeface != c6538q.f31364u) {
                c6538q.f31364u = typeface;
                j0 j0Var = c6538q.f31355l;
                if (j0Var != null) {
                    j0Var.setTypeface(typeface);
                }
                j0 j0Var2 = c6538q.f31361r;
                if (j0Var2 != null) {
                    j0Var2.setTypeface(typeface);
                }
            }
            j0 j0Var3 = this.f6968n;
            if (j0Var3 != null) {
                j0Var3.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final void m4135t(int i10) {
        if (i10 != 0 || this.L1) {
            j0 j0Var = this.f6973t;
            if (j0Var == null || !this.f6972s) {
                return;
            }
            j0Var.setText((CharSequence) null);
            this.f6973t.setVisibility(4);
            return;
        }
        j0 j0Var2 = this.f6973t;
        if (j0Var2 == null || !this.f6972s) {
            return;
        }
        j0Var2.setText(this.f6971r);
        this.f6973t.setVisibility(0);
        this.f6973t.bringToFront();
    }

    /* renamed from: u */
    public final void m4136u() throws Resources.NotFoundException {
        int paddingStart;
        if (this.f6960e == null) {
            return;
        }
        if (this.f43888c1.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            EditText editText = this.f6960e;
            Field field = v0.f5527a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = this.f6960e.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = this.f6960e.getCompoundPaddingBottom();
        Field field2 = v0.f5527a;
        this.f6941B.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* renamed from: v */
    public final void m4137v() {
        this.f6941B.setVisibility((this.f6978z == null || this.L1) ? 8 : 0);
        m4131p();
    }

    /* renamed from: w */
    public final void m4138w(boolean z6, boolean z10) {
        int defaultColor = this.F1.getDefaultColor();
        int colorForState = this.F1.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.F1.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z6) {
            this.f43906t0 = colorForState2;
        } else if (z10) {
            this.f43906t0 = colorForState;
        } else {
            this.f43906t0 = defaultColor;
        }
    }

    /* renamed from: x */
    public final void m4139x() throws Resources.NotFoundException {
        int paddingEnd;
        if (this.f6960e == null) {
            return;
        }
        if (m4124g() || this.f43912y1.getVisibility() == 0) {
            paddingEnd = 0;
        } else {
            EditText editText = this.f6960e;
            Field field = v0.f5527a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.f6960e.getPaddingTop();
        int paddingBottom = this.f6960e.getPaddingBottom();
        Field field2 = v0.f5527a;
        this.f6943D.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    /* renamed from: y */
    public final void m4140y() {
        j0 j0Var = this.f6943D;
        int visibility = j0Var.getVisibility();
        boolean z6 = (this.f6942C == null || this.L1) ? false : true;
        j0Var.setVisibility(z6 ? 0 : 8);
        if (visibility != j0Var.getVisibility()) {
            getEndIconDelegate().mo12552c(z6);
        }
        m4131p();
    }

    /* renamed from: z */
    public final void m4141z() throws Resources.NotFoundException {
        j0 j0Var;
        EditText editText;
        EditText editText2;
        if (this.f6947H == null || this.f6952N == 0) {
            return;
        }
        boolean z6 = false;
        boolean z10 = isFocused() || ((editText2 = this.f6960e) != null && editText2.hasFocus());
        boolean z11 = isHovered() || ((editText = this.f6960e) != null && editText.isHovered());
        boolean zIsEnabled = isEnabled();
        C6538q c6538q = this.f6964j;
        if (!zIsEnabled) {
            this.f43906t0 = this.K1;
        } else if (c6538q.m12564e()) {
            if (this.F1 != null) {
                m4138w(z10, z11);
            } else {
                j0 j0Var2 = c6538q.f31355l;
                this.f43906t0 = j0Var2 != null ? j0Var2.getCurrentTextColor() : -1;
            }
        } else if (!this.f6967m || (j0Var = this.f6968n) == null) {
            if (z10) {
                this.f43906t0 = this.E1;
            } else if (z11) {
                this.f43906t0 = this.D1;
            } else {
                this.f43906t0 = this.C1;
            }
        } else if (this.F1 != null) {
            m4138w(z10, z11);
        } else {
            this.f43906t0 = j0Var.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && c6538q.f31354k && c6538q.m12564e()) {
            z6 = true;
        }
        setErrorIconVisible(z6);
        m4127k(this.f43912y1, this.f43913z1);
        m4127k(this.f43888c1, this.f43889d1);
        ColorStateList colorStateList = this.f43902p1;
        CheckableImageButton checkableImageButton = this.f43900n1;
        m4127k(checkableImageButton, colorStateList);
        AbstractC6536o endIconDelegate = getEndIconDelegate();
        endIconDelegate.getClass();
        if (endIconDelegate instanceof C6535n) {
            if (!c6538q.m12564e() || getEndIconDrawable() == null) {
                m4121c();
            } else {
                Drawable drawableMutate = getEndIconDrawable().mutate();
                j0 j0Var3 = c6538q.f31355l;
                drawableMutate.setTint(j0Var3 != null ? j0Var3.getCurrentTextColor() : -1);
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        if (z10 && isEnabled()) {
            this.f6954T = this.f43893h0;
        } else {
            this.f6954T = this.f6955V;
        }
        if (this.f6952N == 2 && m4123f() && !this.L1 && this.f6951M != this.f6954T) {
            if (m4123f()) {
                ((C6530i) this.f6947H).m12554m(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE);
            }
            m4126i();
        }
        if (this.f6952N == 1) {
            if (!isEnabled()) {
                this.X0 = this.H1;
            } else if (z11 && !z10) {
                this.X0 = this.J1;
            } else if (z10) {
                this.X0 = this.I1;
            } else {
                this.X0 = this.G1;
            }
        }
        m4120b();
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f43900n1.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f43900n1;
        checkableImageButton.setImageDrawable(drawable);
        m4127k(checkableImageButton, this.f43902p1);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f43888c1.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) throws Resources.NotFoundException {
        CheckableImageButton checkableImageButton = this.f43888c1;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m4127k(checkableImageButton, this.f43889d1);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) throws Resources.NotFoundException {
        this.f43912y1.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f6964j.f31354k);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f43900n1.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f43900n1.setImageDrawable(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}

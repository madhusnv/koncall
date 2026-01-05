package com.google.android.material.chip;

import a6.AbstractC0059g;
import a6.C0054b;
import a6.C0058f;
import ah.AbstractC0143a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import bh.C0660b;
import c6.n0;
import c6.v0;
import com.skydoves.balloon.internals.DefinitionKt;
import d6.C1616f;
import hh.C2924a;
import hh.C2925b;
import hh.C2926c;
import hh.C2928e;
import hh.InterfaceC2927d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import lh.AbstractC4475k;
import m6.AbstractC4666b;
import mh.C4751d;
import nh.AbstractC5071a;
import og.wb;
import og.y0;
import p013o.AbstractC5230p;
import pg.s8;
import ph.C5955j;
import ph.InterfaceC5965t;
import sh.AbstractC6844a;
import v5.InterfaceC7673a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class Chip extends AbstractC5230p implements InterfaceC2927d, InterfaceC5965t {

    /* renamed from: x */
    public static final Rect f6808x = new Rect();

    /* renamed from: y */
    public static final int[] f6809y = {R.attr.state_selected};

    /* renamed from: z */
    public static final int[] f6810z = {R.attr.state_checkable};

    /* renamed from: e */
    public C2928e f6811e;

    /* renamed from: f */
    public InsetDrawable f6812f;

    /* renamed from: g */
    public RippleDrawable f6813g;

    /* renamed from: h */
    public View.OnClickListener f6814h;

    /* renamed from: j */
    public CompoundButton.OnCheckedChangeListener f6815j;

    /* renamed from: k */
    public boolean f6816k;

    /* renamed from: l */
    public boolean f6817l;

    /* renamed from: m */
    public boolean f6818m;

    /* renamed from: n */
    public boolean f6819n;

    /* renamed from: p */
    public boolean f6820p;

    /* renamed from: q */
    public int f6821q;

    /* renamed from: r */
    public int f6822r;

    /* renamed from: s */
    public final C2926c f6823s;

    /* renamed from: t */
    public final Rect f6824t;

    /* renamed from: v */
    public final RectF f6825v;

    /* renamed from: w */
    public final C2924a f6826w;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(AbstractC6844a.m13042a(context, attributeSet, com.websoptimization.callyzerbiz.R.attr.chipStyle, com.websoptimization.callyzerbiz.R.style.Widget_MaterialComponents_Chip_Action), attributeSet);
        this.f6824t = new Rect();
        this.f6825v = new RectF();
        this.f6826w = new C2924a(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        C2928e c2928e = new C2928e(context2, attributeSet);
        Context context3 = c2928e.f44312k1;
        int[] iArr = AbstractC0143a.f453b;
        TypedArray typedArrayM9328e = AbstractC4475k.m9328e(context3, attributeSet, iArr, com.websoptimization.callyzerbiz.R.attr.chipStyle, com.websoptimization.callyzerbiz.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c2928e.K1 = typedArrayM9328e.hasValue(37);
        Context context4 = c2928e.f44312k1;
        ColorStateList colorStateListM11057g = y0.m11057g(context4, typedArrayM9328e, 24);
        if (c2928e.f15959B != colorStateListM11057g) {
            c2928e.f15959B = colorStateListM11057g;
            c2928e.onStateChange(c2928e.getState());
        }
        ColorStateList colorStateListM11057g2 = y0.m11057g(context4, typedArrayM9328e, 11);
        if (c2928e.f15960C != colorStateListM11057g2) {
            c2928e.f15960C = colorStateListM11057g2;
            c2928e.onStateChange(c2928e.getState());
        }
        float dimension = typedArrayM9328e.getDimension(19, DefinitionKt.NO_Float_VALUE);
        if (c2928e.f15961D != dimension) {
            c2928e.f15961D = dimension;
            c2928e.invalidateSelf();
            c2928e.m7060t();
        }
        if (typedArrayM9328e.hasValue(12)) {
            c2928e.m7066z(typedArrayM9328e.getDimension(12, DefinitionKt.NO_Float_VALUE));
        }
        c2928e.m7040E(y0.m11057g(context4, typedArrayM9328e, 22));
        c2928e.m7041F(typedArrayM9328e.getDimension(23, DefinitionKt.NO_Float_VALUE));
        c2928e.m7050O(y0.m11057g(context4, typedArrayM9328e, 36));
        String text = typedArrayM9328e.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(c2928e.f15966I, text)) {
            c2928e.f15966I = text;
            c2928e.f44318q1.f22295d = true;
            c2928e.invalidateSelf();
            c2928e.m7060t();
        }
        C4751d c4751d = (!typedArrayM9328e.hasValue(0) || (resourceId3 = typedArrayM9328e.getResourceId(0, 0)) == 0) ? null : new C4751d(context4, resourceId3);
        c4751d.f23742k = typedArrayM9328e.getDimension(1, c4751d.f23742k);
        c2928e.m7051P(c4751d);
        int i10 = typedArrayM9328e.getInt(3, 0);
        if (i10 == 1) {
            c2928e.H1 = TextUtils.TruncateAt.START;
        } else if (i10 == 2) {
            c2928e.H1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i10 == 3) {
            c2928e.H1 = TextUtils.TruncateAt.END;
        }
        c2928e.m7039D(typedArrayM9328e.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c2928e.m7039D(typedArrayM9328e.getBoolean(15, false));
        }
        c2928e.m7036A(y0.m11059i(context4, typedArrayM9328e, 14));
        if (typedArrayM9328e.hasValue(17)) {
            c2928e.m7038C(y0.m11057g(context4, typedArrayM9328e, 17));
        }
        c2928e.m7037B(typedArrayM9328e.getDimension(16, -1.0f));
        c2928e.m7047L(typedArrayM9328e.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c2928e.m7047L(typedArrayM9328e.getBoolean(26, false));
        }
        c2928e.m7042G(y0.m11059i(context4, typedArrayM9328e, 25));
        c2928e.m7046K(y0.m11057g(context4, typedArrayM9328e, 30));
        c2928e.m7044I(typedArrayM9328e.getDimension(28, DefinitionKt.NO_Float_VALUE));
        c2928e.m7062v(typedArrayM9328e.getBoolean(6, false));
        c2928e.m7065y(typedArrayM9328e.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c2928e.m7065y(typedArrayM9328e.getBoolean(8, false));
        }
        c2928e.m7063w(y0.m11059i(context4, typedArrayM9328e, 7));
        if (typedArrayM9328e.hasValue(9)) {
            c2928e.m7064x(y0.m11057g(context4, typedArrayM9328e, 9));
        }
        c2928e.f44301a1 = (!typedArrayM9328e.hasValue(39) || (resourceId2 = typedArrayM9328e.getResourceId(39, 0)) == 0) ? null : C0660b.m1930a(context4, resourceId2);
        c2928e.f44302b1 = (!typedArrayM9328e.hasValue(33) || (resourceId = typedArrayM9328e.getResourceId(33, 0)) == 0) ? null : C0660b.m1930a(context4, resourceId);
        float dimension2 = typedArrayM9328e.getDimension(21, DefinitionKt.NO_Float_VALUE);
        if (c2928e.f44303c1 != dimension2) {
            c2928e.f44303c1 = dimension2;
            c2928e.invalidateSelf();
            c2928e.m7060t();
        }
        c2928e.m7049N(typedArrayM9328e.getDimension(35, DefinitionKt.NO_Float_VALUE));
        c2928e.m7048M(typedArrayM9328e.getDimension(34, DefinitionKt.NO_Float_VALUE));
        float dimension3 = typedArrayM9328e.getDimension(41, DefinitionKt.NO_Float_VALUE);
        if (c2928e.f44306f1 != dimension3) {
            c2928e.f44306f1 = dimension3;
            c2928e.invalidateSelf();
            c2928e.m7060t();
        }
        float dimension4 = typedArrayM9328e.getDimension(40, DefinitionKt.NO_Float_VALUE);
        if (c2928e.f44307g1 != dimension4) {
            c2928e.f44307g1 = dimension4;
            c2928e.invalidateSelf();
            c2928e.m7060t();
        }
        c2928e.m7045J(typedArrayM9328e.getDimension(29, DefinitionKt.NO_Float_VALUE));
        c2928e.m7043H(typedArrayM9328e.getDimension(27, DefinitionKt.NO_Float_VALUE));
        float dimension5 = typedArrayM9328e.getDimension(13, DefinitionKt.NO_Float_VALUE);
        if (c2928e.f44311j1 != dimension5) {
            c2928e.f44311j1 = dimension5;
            c2928e.invalidateSelf();
            c2928e.m7060t();
        }
        c2928e.J1 = typedArrayM9328e.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayM9328e.recycle();
        AbstractC4475k.m9324a(context2, attributeSet, com.websoptimization.callyzerbiz.R.attr.chipStyle, com.websoptimization.callyzerbiz.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC4475k.m9325b(context2, attributeSet, iArr, com.websoptimization.callyzerbiz.R.attr.chipStyle, com.websoptimization.callyzerbiz.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.websoptimization.callyzerbiz.R.attr.chipStyle, com.websoptimization.callyzerbiz.R.style.Widget_MaterialComponents_Chip_Action);
        this.f6820p = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f6822r = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(c2928e);
        c2928e.m11987h(n0.m2453e(this));
        AbstractC4475k.m9324a(context2, attributeSet, com.websoptimization.callyzerbiz.R.attr.chipStyle, com.websoptimization.callyzerbiz.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC4475k.m9325b(context2, attributeSet, iArr, com.websoptimization.callyzerbiz.R.attr.chipStyle, com.websoptimization.callyzerbiz.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.websoptimization.callyzerbiz.R.attr.chipStyle, com.websoptimization.callyzerbiz.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f6823s = new C2926c(this, this);
        m4082f();
        if (!zHasValue) {
            setOutlineProvider(new C2925b(this));
        }
        setChecked(this.f6816k);
        setText(c2928e.f15966I);
        setEllipsize(c2928e.H1);
        m4085i();
        if (!this.f6811e.I1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m4084h();
        if (this.f6820p) {
            setMinHeight(this.f6822r);
        }
        this.f6821q = getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f6825v;
        rectF.setEmpty();
        if (m4080d() && this.f6814h != null) {
            C2928e c2928e = this.f6811e;
            Rect bounds = c2928e.getBounds();
            rectF.setEmpty();
            if (c2928e.m7054S()) {
                float f6 = c2928e.f44311j1 + c2928e.f44310i1 + c2928e.f15976Z + c2928e.f44309h1 + c2928e.f44307g1;
                if (c2928e.getLayoutDirection() == 0) {
                    float f10 = bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f6;
                } else {
                    float f11 = bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f6;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f6824t;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private C4751d getTextAppearance() {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            return c2928e.f44318q1.f22297f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z6) {
        if (this.f6818m != z6) {
            this.f6818m = z6;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z6) {
        if (this.f6817l != z6) {
            this.f6817l = z6;
            refreshDrawableState();
        }
    }

    /* renamed from: c */
    public final void m4079c(int i10) {
        this.f6822r = i10;
        if (!this.f6820p) {
            InsetDrawable insetDrawable = this.f6812f;
            if (insetDrawable == null) {
                m4083g();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f6812f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m4083g();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i10 - ((int) this.f6811e.f15961D));
        int iMax2 = Math.max(0, i10 - this.f6811e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f6812f;
            if (insetDrawable2 == null) {
                m4083g();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f6812f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m4083g();
                    return;
                }
                return;
            }
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f6812f != null) {
            Rect rect = new Rect();
            this.f6812f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                m4083g();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f6812f = new InsetDrawable((Drawable) this.f6811e, i11, i12, i11, i12);
        m4083g();
    }

    /* renamed from: d */
    public final boolean m4080d() {
        C2928e c2928e = this.f6811e;
        if (c2928e == null) {
            return false;
        }
        Object obj = c2928e.f15973V;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof InterfaceC7673a) {
            obj = null;
        }
        return obj != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int action = motionEvent.getAction();
        C2926c c2926c = this.f6823s;
        if (action == 10) {
            try {
                Field declaredField = AbstractC4666b.class.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(c2926c)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC4666b.class.getDeclaredMethod("s", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(c2926c, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return c2926c.m9550l(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            hh.c r0 = r9.f6823s
            r0.getClass()
            int r1 = r10.getAction()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1
            if (r1 == r4) goto L90
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L7a
            r5 = 66
            if (r1 == r5) goto L4f
            switch(r1) {
                case 19: goto L21;
                case 20: goto L21;
                case 21: goto L21;
                case 22: goto L21;
                case 23: goto L4f;
                default: goto L1f;
            }
        L1f:
            goto L90
        L21:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L90
            r7 = 19
            if (r1 == r7) goto L39
            r7 = 21
            if (r1 == r7) goto L36
            r7 = 22
            if (r1 == r7) goto L3b
            r5 = 130(0x82, float:1.82E-43)
            goto L3b
        L36:
            r5 = 17
            goto L3b
        L39:
            r5 = 33
        L3b:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r4
            r7 = r3
        L41:
            if (r3 >= r1) goto L4d
            boolean r8 = r0.m9551n(r5, r6)
            if (r8 == 0) goto L4d
            int r3 = r3 + 1
            r7 = r4
            goto L41
        L4d:
            r3 = r7
            goto L90
        L4f:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L90
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L90
            int r1 = r0.f23076l
            if (r1 == r2) goto L78
            com.google.android.material.chip.Chip r5 = r0.f15958q
            if (r1 != 0) goto L67
            r5.performClick()
            goto L78
        L67:
            if (r1 != r4) goto L78
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r1 = r5.f6814h
            if (r1 == 0) goto L73
            r1.onClick(r5)
        L73:
            hh.c r1 = r5.f6823s
            r1.m9554r(r4, r4)
        L78:
            r3 = r4
            goto L90
        L7a:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L86
            r1 = 2
            boolean r3 = r0.m9551n(r1, r6)
            goto L90
        L86:
            boolean r1 = r10.hasModifiers(r4)
            if (r1 == 0) goto L90
            boolean r3 = r0.m9551n(r4, r6)
        L90:
            if (r3 == 0) goto L97
            int r0 = r0.f23076l
            if (r0 == r2) goto L97
            return r4
        L97:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p013o.AbstractC5230p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i10;
        super.drawableStateChanged();
        C2928e c2928e = this.f6811e;
        boolean zM7061u = false;
        if (c2928e != null && C2928e.m7035s(c2928e.f15973V)) {
            C2928e c2928e2 = this.f6811e;
            ?? IsEnabled = isEnabled();
            int i11 = IsEnabled;
            if (this.f6819n) {
                i11 = IsEnabled + 1;
            }
            int i12 = i11;
            if (this.f6818m) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.f6817l) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.f6819n) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.f6818m) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.f6817l) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            if (!Arrays.equals(c2928e2.E1, iArr)) {
                c2928e2.E1 = iArr;
                if (c2928e2.m7054S()) {
                    zM7061u = c2928e2.m7061u(c2928e2.getState(), iArr);
                }
            }
        }
        if (zM7061u) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final boolean m4081e() {
        C2928e c2928e = this.f6811e;
        return c2928e != null && c2928e.f44321t0;
    }

    /* renamed from: f */
    public final void m4082f() {
        C2928e c2928e;
        if (!m4080d() || (c2928e = this.f6811e) == null || !c2928e.f15972T || this.f6814h == null) {
            v0.m2528j(this, null);
        } else {
            v0.m2528j(this, this.f6823s);
        }
    }

    /* renamed from: g */
    public final void m4083g() {
        this.f6813g = new RippleDrawable(AbstractC5071a.m10006a(this.f6811e.f15965H), getBackgroundDrawable(), null);
        this.f6811e.getClass();
        RippleDrawable rippleDrawable = this.f6813g;
        Field field = v0.f5527a;
        setBackground(rippleDrawable);
        m4084h();
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f6812f;
        return insetDrawable == null ? this.f6811e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            return c2928e.Y0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            return c2928e.Z0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            return c2928e.f15960C;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? Math.max(DefinitionKt.NO_Float_VALUE, c2928e.m7059q()) : DefinitionKt.NO_Float_VALUE;
    }

    public Drawable getChipDrawable() {
        return this.f6811e;
    }

    public float getChipEndPadding() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? c2928e.f44311j1 : DefinitionKt.NO_Float_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C2928e c2928e = this.f6811e;
        if (c2928e == null || (drawable = c2928e.f15968L) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC7673a)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? c2928e.f15970N : DefinitionKt.NO_Float_VALUE;
    }

    public ColorStateList getChipIconTint() {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            return c2928e.f15969M;
        }
        return null;
    }

    public float getChipMinHeight() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? c2928e.f15961D : DefinitionKt.NO_Float_VALUE;
    }

    public float getChipStartPadding() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? c2928e.f44303c1 : DefinitionKt.NO_Float_VALUE;
    }

    public ColorStateList getChipStrokeColor() {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            return c2928e.f15963F;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? c2928e.f15964G : DefinitionKt.NO_Float_VALUE;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C2928e c2928e = this.f6811e;
        if (c2928e == null || (drawable = c2928e.f15973V) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC7673a)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            return c2928e.f44308h0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? c2928e.f44310i1 : DefinitionKt.NO_Float_VALUE;
    }

    public float getCloseIconSize() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? c2928e.f15976Z : DefinitionKt.NO_Float_VALUE;
    }

    public float getCloseIconStartPadding() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? c2928e.f44309h1 : DefinitionKt.NO_Float_VALUE;
    }

    public ColorStateList getCloseIconTint() {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            return c2928e.f15975Y;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            return c2928e.H1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        C2926c c2926c = this.f6823s;
        if (c2926c.f23076l == 1 || c2926c.f23075k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C0660b getHideMotionSpec() {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            return c2928e.f44302b1;
        }
        return null;
    }

    public float getIconEndPadding() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? c2928e.f44305e1 : DefinitionKt.NO_Float_VALUE;
    }

    public float getIconStartPadding() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? c2928e.f44304d1 : DefinitionKt.NO_Float_VALUE;
    }

    public ColorStateList getRippleColor() {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            return c2928e.f15965H;
        }
        return null;
    }

    public C5955j getShapeAppearanceModel() {
        return this.f6811e.f29152a.f29135a;
    }

    public C0660b getShowMotionSpec() {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            return c2928e.f44301a1;
        }
        return null;
    }

    public float getTextEndPadding() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? c2928e.f44307g1 : DefinitionKt.NO_Float_VALUE;
    }

    public float getTextStartPadding() {
        C2928e c2928e = this.f6811e;
        return c2928e != null ? c2928e.f44306f1 : DefinitionKt.NO_Float_VALUE;
    }

    /* renamed from: h */
    public final void m4084h() {
        C2928e c2928e;
        if (TextUtils.isEmpty(getText()) || (c2928e = this.f6811e) == null) {
            return;
        }
        int iM7058p = (int) (c2928e.m7058p() + c2928e.f44311j1 + c2928e.f44307g1);
        C2928e c2928e2 = this.f6811e;
        int iM7057o = (int) (c2928e2.m7057o() + c2928e2.f44303c1 + c2928e2.f44306f1);
        if (this.f6812f != null) {
            Rect rect = new Rect();
            this.f6812f.getPadding(rect);
            iM7057o += rect.left;
            iM7058p += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        Field field = v0.f5527a;
        setPaddingRelative(iM7057o, paddingTop, iM7058p, paddingBottom);
    }

    /* renamed from: i */
    public final void m4085i() {
        TextPaint paint = getPaint();
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            paint.drawableState = c2928e.getState();
        }
        C4751d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m9659e(getContext(), paint, this.f6826w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wb.m11030c(this, this.f6811e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6809y);
        }
        if (m4081e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6810z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i10, Rect rect) {
        super.onFocusChanged(z6, i10, rect);
        C2926c c2926c = this.f6823s;
        int i11 = c2926c.f23076l;
        if (i11 != Integer.MIN_VALUE) {
            c2926c.m9548j(i11);
        }
        if (z6) {
            c2926c.m9551n(i10, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (m4081e() || isClickable()) {
            accessibilityNodeInfo.setClassName(m4081e() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(m4081e());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f22273c) {
                i10 = 0;
                for (int i11 = 0; i11 < chipGroup.getChildCount(); i11++) {
                    if (chipGroup.getChildAt(i11) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i11)) == this) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                i10 = -1;
            } else {
                i10 = -1;
            }
            Object tag = getTag(com.websoptimization.callyzerbiz.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C1616f.m5280a(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i10, 1).f8060a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f6821q != i10) {
            this.f6821q = i10;
            m4084h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L25;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L46
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L41
            goto L4c
        L21:
            boolean r0 = r5.f6817l
            if (r0 == 0) goto L4c
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L4d
        L2c:
            boolean r0 = r5.f6817l
            if (r0 == 0) goto L41
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f6814h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            hh.c r0 = r5.f6823s
            r0.m9554r(r2, r2)
            r0 = r2
            goto L42
        L41:
            r0 = r3
        L42:
            r5.setCloseIconPressed(r3)
            goto L4d
        L46:
            if (r1 == 0) goto L4c
            r5.setCloseIconPressed(r2)
            goto L2a
        L4c:
            r0 = r3
        L4d:
            if (r0 != 0) goto L57
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L56
            goto L57
        L56:
            return r3
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6813g) {
            super.setBackground(drawable);
        }
    }

    @Override // p013o.AbstractC5230p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6813g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCheckable(boolean z6) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7062v(z6);
        }
    }

    public void setCheckableResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7062v(c2928e.f44312k1.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C2928e c2928e = this.f6811e;
        if (c2928e == null) {
            this.f6816k = z6;
            return;
        }
        if (c2928e.f44321t0) {
            boolean zIsChecked = isChecked();
            super.setChecked(z6);
            if (zIsChecked == z6 || (onCheckedChangeListener = this.f6815j) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z6);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7063w(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z6) {
        setCheckedIconVisible(z6);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7063w(s8.m11864b(c2928e.f44312k1, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7064x(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7064x(s8.m11863a(c2928e.f44312k1, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7065y(c2928e.f44312k1.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C2928e c2928e = this.f6811e;
        if (c2928e == null || c2928e.f15960C == colorStateList) {
            return;
        }
        c2928e.f15960C = colorStateList;
        c2928e.onStateChange(c2928e.getState());
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateListM11863a;
        C2928e c2928e = this.f6811e;
        if (c2928e == null || c2928e.f15960C == (colorStateListM11863a = s8.m11863a(c2928e.f44312k1, i10))) {
            return;
        }
        c2928e.f15960C = colorStateListM11863a;
        c2928e.onStateChange(c2928e.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7066z(f6);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7066z(c2928e.f44312k1.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(C2928e c2928e) {
        C2928e c2928e2 = this.f6811e;
        if (c2928e2 != c2928e) {
            if (c2928e2 != null) {
                c2928e2.G1 = new WeakReference(null);
            }
            this.f6811e = c2928e;
            c2928e.I1 = false;
            c2928e.G1 = new WeakReference(this);
            m4079c(this.f6822r);
        }
    }

    public void setChipEndPadding(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e == null || c2928e.f44311j1 == f6) {
            return;
        }
        c2928e.f44311j1 = f6;
        c2928e.invalidateSelf();
        c2928e.m7060t();
    }

    public void setChipEndPaddingResource(int i10) throws Resources.NotFoundException {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            float dimension = c2928e.f44312k1.getResources().getDimension(i10);
            if (c2928e.f44311j1 != dimension) {
                c2928e.f44311j1 = dimension;
                c2928e.invalidateSelf();
                c2928e.m7060t();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7036A(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z6) {
        setChipIconVisible(z6);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7036A(s8.m11864b(c2928e.f44312k1, i10));
        }
    }

    public void setChipIconSize(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7037B(f6);
        }
    }

    public void setChipIconSizeResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7037B(c2928e.f44312k1.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7038C(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7038C(s8.m11863a(c2928e.f44312k1, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7039D(c2928e.f44312k1.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e == null || c2928e.f15961D == f6) {
            return;
        }
        c2928e.f15961D = f6;
        c2928e.invalidateSelf();
        c2928e.m7060t();
    }

    public void setChipMinHeightResource(int i10) throws Resources.NotFoundException {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            float dimension = c2928e.f44312k1.getResources().getDimension(i10);
            if (c2928e.f15961D != dimension) {
                c2928e.f15961D = dimension;
                c2928e.invalidateSelf();
                c2928e.m7060t();
            }
        }
    }

    public void setChipStartPadding(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e == null || c2928e.f44303c1 == f6) {
            return;
        }
        c2928e.f44303c1 = f6;
        c2928e.invalidateSelf();
        c2928e.m7060t();
    }

    public void setChipStartPaddingResource(int i10) throws Resources.NotFoundException {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            float dimension = c2928e.f44312k1.getResources().getDimension(i10);
            if (c2928e.f44303c1 != dimension) {
                c2928e.f44303c1 = dimension;
                c2928e.invalidateSelf();
                c2928e.m7060t();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7040E(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7040E(s8.m11863a(c2928e.f44312k1, i10));
        }
    }

    public void setChipStrokeWidth(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7041F(f6);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7041F(c2928e.f44312k1.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7042G(drawable);
        }
        m4082f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C2928e c2928e = this.f6811e;
        if (c2928e == null || c2928e.f44308h0 == charSequence) {
            return;
        }
        String str = C0054b.f223b;
        C0054b c0054b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0054b.f226e : C0054b.f225d;
        c0054b.getClass();
        C0058f c0058f = AbstractC0059g.f235a;
        c2928e.f44308h0 = c0054b.m161c(charSequence);
        c2928e.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z6) {
        setCloseIconVisible(z6);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7043H(f6);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7043H(c2928e.f44312k1.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7042G(s8.m11864b(c2928e.f44312k1, i10));
        }
        m4082f();
    }

    public void setCloseIconSize(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7044I(f6);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7044I(c2928e.f44312k1.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7045J(f6);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7045J(c2928e.f44312k1.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7046K(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7046K(s8.m11863a(c2928e.f44312k1, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // p013o.AbstractC5230p, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p013o.AbstractC5230p, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m11987h(f6);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f6811e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.H1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        this.f6820p = z6;
        m4079c(this.f6822r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            return;
        }
        super.setGravity(i10);
    }

    public void setHideMotionSpec(C0660b c0660b) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.f44302b1 = c0660b;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.f44302b1 = C0660b.m1930a(c2928e.f44312k1, i10);
        }
    }

    public void setIconEndPadding(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7048M(f6);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7048M(c2928e.f44312k1.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7049N(f6);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7049N(c2928e.f44312k1.getResources().getDimension(i10));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f6811e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.J1 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6815j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f6814h = onClickListener;
        m4082f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7050O(colorStateList);
        }
        this.f6811e.getClass();
        m4083g();
    }

    public void setRippleColorResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7050O(s8.m11863a(c2928e.f44312k1, i10));
            this.f6811e.getClass();
            m4083g();
        }
    }

    @Override // ph.InterfaceC5965t
    public void setShapeAppearanceModel(C5955j c5955j) {
        this.f6811e.setShapeAppearanceModel(c5955j);
    }

    public void setShowMotionSpec(C0660b c0660b) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.f44301a1 = c0660b;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.f44301a1 = C0660b.m1930a(c2928e.f44312k1, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z6) {
        if (!z6) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z6);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C2928e c2928e = this.f6811e;
        if (c2928e == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c2928e.I1 ? null : charSequence, bufferType);
        C2928e c2928e2 = this.f6811e;
        if (c2928e2 == null || TextUtils.equals(c2928e2.f15966I, charSequence)) {
            return;
        }
        c2928e2.f15966I = charSequence;
        c2928e2.f44318q1.f22295d = true;
        c2928e2.invalidateSelf();
        c2928e2.m7060t();
    }

    public void setTextAppearance(C4751d c4751d) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7051P(c4751d);
        }
        m4085i();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e == null || c2928e.f44307g1 == f6) {
            return;
        }
        c2928e.f44307g1 = f6;
        c2928e.invalidateSelf();
        c2928e.m7060t();
    }

    public void setTextEndPaddingResource(int i10) throws Resources.NotFoundException {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            float dimension = c2928e.f44312k1.getResources().getDimension(i10);
            if (c2928e.f44307g1 != dimension) {
                c2928e.f44307g1 = dimension;
                c2928e.invalidateSelf();
                c2928e.m7060t();
            }
        }
    }

    public void setTextStartPadding(float f6) {
        C2928e c2928e = this.f6811e;
        if (c2928e == null || c2928e.f44306f1 == f6) {
            return;
        }
        c2928e.f44306f1 = f6;
        c2928e.invalidateSelf();
        c2928e.m7060t();
    }

    public void setTextStartPaddingResource(int i10) throws Resources.NotFoundException {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            float dimension = c2928e.f44312k1.getResources().getDimension(i10);
            if (c2928e.f44306f1 != dimension) {
                c2928e.f44306f1 = dimension;
                c2928e.invalidateSelf();
                c2928e.m7060t();
            }
        }
    }

    public void setCloseIconVisible(boolean z6) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7047L(z6);
        }
        m4082f();
    }

    public void setCheckedIconVisible(boolean z6) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7065y(z6);
        }
    }

    public void setChipIconVisible(boolean z6) {
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7039D(z6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7051P(new C4751d(c2928e.f44312k1, i10));
        }
        m4085i();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        C2928e c2928e = this.f6811e;
        if (c2928e != null) {
            c2928e.m7051P(new C4751d(c2928e.f44312k1, i10));
        }
        m4085i();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
    }

    @Override // p013o.AbstractC5230p, android.view.View
    public void setBackgroundResource(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }
}

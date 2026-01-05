package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.C2066c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import org.apache.http.message.TokenParser;
import p001o.anh;
import p001o.bbe;
import p001o.dkh;
import p001o.fy5;
import p001o.gjh;
import p001o.gk0;
import p001o.lk0;
import p001o.ok0;
import p001o.vy5;
import p001o.w90;
import p001o.wvi;
import p001o.y9e;
import p001o.yzi;
import p001o.z5e;

/* loaded from: classes2.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property J0 = new C1873a(Float.class, "thumbPos");
    public static final int[] K0 = {R.attr.state_checked};
    public ColorStateList A0;
    public Layout B0;
    public Layout C0;
    public TransformationMethod D0;
    public ObjectAnimator E0;
    public final ok0 F0;
    public gk0 G0;

    /* renamed from: H */
    public int f5967H;
    public C1874b H0;
    public final Rect I0;

    /* renamed from: L */
    public boolean f5968L;

    /* renamed from: M */
    public CharSequence f5969M;

    /* renamed from: Q */
    public CharSequence f5970Q;

    /* renamed from: a */
    public Drawable f5971a;

    /* renamed from: b */
    public ColorStateList f5972b;

    /* renamed from: c */
    public PorterDuff.Mode f5973c;

    /* renamed from: d */
    public boolean f5974d;

    /* renamed from: e */
    public boolean f5975e;

    /* renamed from: f */
    public Drawable f5976f;

    /* renamed from: g */
    public ColorStateList f5977g;

    /* renamed from: h */
    public PorterDuff.Mode f5978h;
    public CharSequence h0;
    public CharSequence i0;
    public boolean j0;
    public int k0;
    public int l0;
    public float m0;
    public float n0;
    public VelocityTracker o0;
    public int p0;

    /* renamed from: q */
    public boolean f5979q;
    public float q0;
    public int r0;

    /* renamed from: s */
    public boolean f5980s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;

    /* renamed from: x */
    public int f5981x;
    public int x0;

    /* renamed from: y */
    public int f5982y;
    public boolean y0;
    public final TextPaint z0;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public class C1873a extends Property {
        public C1873a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.q0);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$b */
    public static class C1874b extends C2066c.f {

        /* renamed from: a */
        public final Reference f5983a;

        public C1874b(SwitchCompat switchCompat) {
            this.f5983a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.C2066c.f
        /* renamed from: a */
        public void mo4395a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f5983a.get();
            if (switchCompat != null) {
                switchCompat.m4387j();
            }
        }

        @Override // androidx.emoji2.text.C2066c.f
        /* renamed from: b */
        public void mo4396b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f5983a.get();
            if (switchCompat != null) {
                switchCompat.m4387j();
            }
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    public static float m4378f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private gk0 getEmojiTextViewHelper() {
        if (this.G0 == null) {
            this.G0 = new gk0(this);
        }
        return this.G0;
    }

    private boolean getTargetCheckedState() {
        return this.q0 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((yzi.m58585b(this) ? 1.0f - this.q0 : this.q0) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f5976f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.I0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f5971a;
        Rect rectM53598d = drawable2 != null ? vy5.m53598d(drawable2) : vy5.f51031c;
        return ((((this.r0 - this.t0) - rect.left) - rect.right) - rectM53598d.left) - rectM53598d.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.h0 = charSequence;
        this.i0 = m4384g(charSequence);
        this.C0 = null;
        if (this.j0) {
            m4391n();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f5969M = charSequence;
        this.f5970Q = m4384g(charSequence);
        this.B0 = null;
        if (this.j0) {
            m4391n();
        }
    }

    /* renamed from: a */
    public final void m4379a(boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) J0, z ? 1.0f : 0.0f);
        this.E0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.E0.setAutoCancel(true);
        this.E0.start();
    }

    /* renamed from: b */
    public final void m4380b() {
        Drawable drawable = this.f5971a;
        if (drawable != null) {
            if (this.f5974d || this.f5975e) {
                Drawable drawableMutate = fy5.m27744r(drawable).mutate();
                this.f5971a = drawableMutate;
                if (this.f5974d) {
                    fy5.m27741o(drawableMutate, this.f5972b);
                }
                if (this.f5975e) {
                    fy5.m27742p(this.f5971a, this.f5973c);
                }
                if (this.f5971a.isStateful()) {
                    this.f5971a.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final void m4381c() {
        Drawable drawable = this.f5976f;
        if (drawable != null) {
            if (this.f5979q || this.f5980s) {
                Drawable drawableMutate = fy5.m27744r(drawable).mutate();
                this.f5976f = drawableMutate;
                if (this.f5979q) {
                    fy5.m27741o(drawableMutate, this.f5977g);
                }
                if (this.f5980s) {
                    fy5.m27742p(this.f5976f, this.f5978h);
                }
                if (this.f5976f.isStateful()) {
                    this.f5976f.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m4382d() {
        ObjectAnimator objectAnimator = this.E0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.I0;
        int i3 = this.u0;
        int i4 = this.v0;
        int i5 = this.w0;
        int i6 = this.x0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f5971a;
        Rect rectM53598d = drawable != null ? vy5.m53598d(drawable) : vy5.f51031c;
        Drawable drawable2 = this.f5976f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectM53598d != null) {
                int i8 = rectM53598d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM53598d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM53598d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM53598d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f5976f.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f5976f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f5971a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.t0 + rect.right;
            this.f5971a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                fy5.m27738l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f5971a;
        if (drawable != null) {
            fy5.m27737k(drawable, f, f2);
        }
        Drawable drawable2 = this.f5976f;
        if (drawable2 != null) {
            fy5.m27737k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5971a;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f5976f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m4383e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* renamed from: g */
    public final CharSequence m4384g(CharSequence charSequence) {
        TransformationMethod transformationMethodM28944f = getEmojiTextViewHelper().m28944f(this.D0);
        return transformationMethodM28944f != null ? transformationMethodM28944f.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!yzi.m58585b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.r0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f5967H : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (yzi.m58585b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.r0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f5967H : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return gjh.m28916o(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.j0;
    }

    public boolean getSplitTrack() {
        return this.f5968L;
    }

    public int getSwitchMinWidth() {
        return this.f5982y;
    }

    public int getSwitchPadding() {
        return this.f5967H;
    }

    public CharSequence getTextOff() {
        return this.h0;
    }

    public CharSequence getTextOn() {
        return this.f5969M;
    }

    public Drawable getThumbDrawable() {
        return this.f5971a;
    }

    public final float getThumbPosition() {
        return this.q0;
    }

    public int getThumbTextPadding() {
        return this.f5981x;
    }

    public ColorStateList getThumbTintList() {
        return this.f5972b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f5973c;
    }

    public Drawable getTrackDrawable() {
        return this.f5976f;
    }

    public ColorStateList getTrackTintList() {
        return this.f5977g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f5978h;
    }

    /* renamed from: h */
    public final boolean m4385h(float f, float f2) {
        if (this.f5971a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f5971a.getPadding(this.I0);
        int i = this.v0;
        int i2 = this.l0;
        int i3 = i - i2;
        int i4 = (this.u0 + thumbOffset) - i2;
        int i5 = this.t0 + i4;
        Rect rect = this.I0;
        return f > ((float) i4) && f < ((float) (((i5 + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.x0 + i2));
    }

    /* renamed from: i */
    public final Layout m4386i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.z0, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: j */
    public void m4387j() {
        setTextOnInternal(this.f5969M);
        setTextOffInternal(this.h0);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5971a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f5976f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.E0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.E0.end();
        this.E0 = null;
    }

    /* renamed from: k */
    public final void m4388k() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.h0;
            if (string == null) {
                string = getResources().getString(y9e.abc_capital_off);
            }
            wvi.B0(this, string);
        }
    }

    /* renamed from: l */
    public final void m4389l() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f5969M;
            if (string == null) {
                string = getResources().getString(y9e.abc_capital_on);
            }
            wvi.B0(this, string);
        }
    }

    /* renamed from: m */
    public final void m4390m(int i, int i2) {
        setSwitchTypeface(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    /* renamed from: n */
    public final void m4391n() {
        if (this.H0 == null && this.G0.m28940b() && C2066c.m6068i()) {
            C2066c c2066cM6064c = C2066c.m6064c();
            int iM6070e = c2066cM6064c.m6070e();
            if (iM6070e == 3 || iM6070e == 0) {
                C1874b c1874b = new C1874b(this);
                this.H0 = c1874b;
                c2066cM6064c.m6081t(c1874b);
            }
        }
    }

    /* renamed from: o */
    public final void m4392o(MotionEvent motionEvent) {
        this.k0 = 0;
        boolean targetCheckedState = true;
        boolean z = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z) {
            this.o0.computeCurrentVelocity(1000);
            float xVelocity = this.o0.getXVelocity();
            if (Math.abs(xVelocity) <= this.p0) {
                targetCheckedState = getTargetCheckedState();
            } else if (!yzi.m58585b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        m4383e(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.I0;
        Drawable drawable = this.f5976f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.v0;
        int i2 = this.x0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f5971a;
        if (drawable != null) {
            if (!this.f5968L || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM53598d = vy5.m53598d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM53598d.left;
                rect.right -= rectM53598d.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.B0 : this.C0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.A0;
            if (colorStateList != null) {
                this.z0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.z0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f5969M : this.h0;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(TokenParser.SP);
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int i5;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f5971a != null) {
            Rect rect = this.I0;
            Drawable drawable = this.f5976f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM53598d = vy5.m53598d(this.f5971a);
            iMax = Math.max(0, rectM53598d.left - rect.left);
            iMax2 = Math.max(0, rectM53598d.right - rect.right);
        } else {
            iMax = 0;
        }
        if (yzi.m58585b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.r0 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.r0) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i5 = this.s0;
            paddingTop = paddingTop2 - (i5 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.s0;
                this.u0 = paddingLeft;
                this.v0 = paddingTop;
                this.x0 = height;
                this.w0 = width;
            }
            paddingTop = getPaddingTop();
            i5 = this.s0;
        }
        height = i5 + paddingTop;
        this.u0 = paddingLeft;
        this.v0 = paddingTop;
        this.x0 = height;
        this.w0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.j0) {
            if (this.B0 == null) {
                this.B0 = m4386i(this.f5970Q);
            }
            if (this.C0 == null) {
                this.C0 = m4386i(this.i0);
            }
        }
        Rect rect = this.I0;
        Drawable drawable = this.f5971a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f5971a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f5971a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.t0 = Math.max(this.j0 ? Math.max(this.B0.getWidth(), this.C0.getWidth()) + (this.f5981x * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f5976f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f5976f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f5971a;
        if (drawable3 != null) {
            Rect rectM53598d = vy5.m53598d(drawable3);
            iMax = Math.max(iMax, rectM53598d.left);
            iMax2 = Math.max(iMax2, rectM53598d.right);
        }
        int iMax3 = this.y0 ? Math.max(this.f5982y, (this.t0 * 2) + iMax + iMax2) : this.f5982y;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.r0 = iMax3;
        this.s0 = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f5969M : this.h0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.o0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (isEnabled() && m4385h(x, y)) {
                this.k0 = 1;
                this.m0 = x;
                this.n0 = y;
            }
        } else if (actionMasked == 1) {
            if (this.k0 == 2) {
                m4392o(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.k0 = 0;
            this.o0.clear();
        } else if (actionMasked == 2) {
            int i = this.k0;
            if (i == 1) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (Math.abs(x2 - this.m0) > this.l0 || Math.abs(y2 - this.n0) > this.l0) {
                    this.k0 = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.m0 = x2;
                    this.n0 = y2;
                    return true;
                }
            } else if (i == 2) {
                float x3 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f = x3 - this.m0;
                float f2 = thumbScrollRange != 0 ? f / thumbScrollRange : f > 0.0f ? 1.0f : -1.0f;
                if (yzi.m58585b(this)) {
                    f2 = -f2;
                }
                float fM4378f = m4378f(this.q0 + f2, 0.0f, 1.0f);
                if (fM4378f != this.q0) {
                    this.m0 = x3;
                    setThumbPosition(fM4378f);
                }
                return true;
            }
        } else if (actionMasked == 3) {
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m28942d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            m4389l();
        } else {
            m4388k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            m4379a(zIsChecked);
        } else {
            m4382d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(gjh.m28917p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m28943e(z);
        setTextOnInternal(this.f5969M);
        setTextOffInternal(this.h0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.y0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m28939a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.j0 != z) {
            this.j0 = z;
            requestLayout();
            if (z) {
                m4391n();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f5968L = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f5982y = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f5967H = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        anh anhVarM17523t = anh.m17523t(context, i, bbe.TextAppearance);
        ColorStateList colorStateListM17528c = anhVarM17523t.m17528c(bbe.TextAppearance_android_textColor);
        if (colorStateListM17528c != null) {
            this.A0 = colorStateListM17528c;
        } else {
            this.A0 = getTextColors();
        }
        int iM17531f = anhVarM17523t.m17531f(bbe.TextAppearance_android_textSize, 0);
        if (iM17531f != 0) {
            float f = iM17531f;
            if (f != this.z0.getTextSize()) {
                this.z0.setTextSize(f);
                requestLayout();
            }
        }
        m4390m(anhVarM17523t.m17536k(bbe.TextAppearance_android_typeface, -1), anhVarM17523t.m17536k(bbe.TextAppearance_android_textStyle, -1));
        if (anhVarM17523t.m17526a(bbe.TextAppearance_textAllCaps, false)) {
            this.D0 = new w90(getContext());
        } else {
            this.D0 = null;
        }
        setTextOnInternal(this.f5969M);
        setTextOffInternal(this.h0);
        anhVarM17523t.m17546x();
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        if (i <= 0) {
            this.z0.setFakeBoldText(false);
            this.z0.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i2 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i;
            this.z0.setFakeBoldText((i2 & 1) != 0);
            this.z0.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        m4388k();
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            m4389l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f5971a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5971a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.q0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(lk0.m37353b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f5981x = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f5972b = colorStateList;
        this.f5974d = true;
        m4380b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f5973c = mode;
        this.f5975e = true;
        m4380b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f5976f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5976f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(lk0.m37353b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f5977g = colorStateList;
        this.f5979q = true;
        m4381c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f5978h = mode;
        this.f5980s = true;
        m4381c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5971a || drawable == this.f5976f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5972b = null;
        this.f5973c = null;
        this.f5974d = false;
        this.f5975e = false;
        this.f5977g = null;
        this.f5978h = null;
        this.f5979q = false;
        this.f5980s = false;
        this.o0 = VelocityTracker.obtain();
        this.y0 = true;
        this.I0 = new Rect();
        dkh.m23377a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.z0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        anh anhVarM17525v = anh.m17525v(context, attributeSet, bbe.SwitchCompat, i, 0);
        wvi.k0(this, context, bbe.SwitchCompat, attributeSet, anhVarM17525v.m17543r(), i, 0);
        Drawable drawableM17532g = anhVarM17525v.m17532g(bbe.SwitchCompat_android_thumb);
        this.f5971a = drawableM17532g;
        if (drawableM17532g != null) {
            drawableM17532g.setCallback(this);
        }
        Drawable drawableM17532g2 = anhVarM17525v.m17532g(bbe.SwitchCompat_track);
        this.f5976f = drawableM17532g2;
        if (drawableM17532g2 != null) {
            drawableM17532g2.setCallback(this);
        }
        setTextOnInternal(anhVarM17525v.m17541p(bbe.SwitchCompat_android_textOn));
        setTextOffInternal(anhVarM17525v.m17541p(bbe.SwitchCompat_android_textOff));
        this.j0 = anhVarM17525v.m17526a(bbe.SwitchCompat_showText, true);
        this.f5981x = anhVarM17525v.m17531f(bbe.SwitchCompat_thumbTextPadding, 0);
        this.f5982y = anhVarM17525v.m17531f(bbe.SwitchCompat_switchMinWidth, 0);
        this.f5967H = anhVarM17525v.m17531f(bbe.SwitchCompat_switchPadding, 0);
        this.f5968L = anhVarM17525v.m17526a(bbe.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListM17528c = anhVarM17525v.m17528c(bbe.SwitchCompat_thumbTint);
        if (colorStateListM17528c != null) {
            this.f5972b = colorStateListM17528c;
            this.f5974d = true;
        }
        PorterDuff.Mode modeM53599e = vy5.m53599e(anhVarM17525v.m17536k(bbe.SwitchCompat_thumbTintMode, -1), null);
        if (this.f5973c != modeM53599e) {
            this.f5973c = modeM53599e;
            this.f5975e = true;
        }
        if (this.f5974d || this.f5975e) {
            m4380b();
        }
        ColorStateList colorStateListM17528c2 = anhVarM17525v.m17528c(bbe.SwitchCompat_trackTint);
        if (colorStateListM17528c2 != null) {
            this.f5977g = colorStateListM17528c2;
            this.f5979q = true;
        }
        PorterDuff.Mode modeM53599e2 = vy5.m53599e(anhVarM17525v.m17536k(bbe.SwitchCompat_trackTintMode, -1), null);
        if (this.f5978h != modeM53599e2) {
            this.f5978h = modeM53599e2;
            this.f5980s = true;
        }
        if (this.f5979q || this.f5980s) {
            m4381c();
        }
        int iM17539n = anhVarM17525v.m17539n(bbe.SwitchCompat_switchTextAppearance, 0);
        if (iM17539n != 0) {
            setSwitchTextAppearance(context, iM17539n);
        }
        ok0 ok0Var = new ok0(this);
        this.F0 = ok0Var;
        ok0Var.m42328m(attributeSet, i);
        anhVarM17525v.m17546x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.l0 = viewConfiguration.getScaledTouchSlop();
        this.p0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m28941c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.z0.getTypeface() == null || this.z0.getTypeface().equals(typeface)) && (this.z0.getTypeface() != null || typeface == null)) {
            return;
        }
        this.z0.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}

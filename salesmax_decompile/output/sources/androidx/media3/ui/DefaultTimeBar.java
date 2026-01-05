package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.InterfaceC2298b;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p001o.op0;
import p001o.rbe;
import p001o.sqi;

/* loaded from: classes2.dex */
public class DefaultTimeBar extends View implements InterfaceC2298b {
    public long A0;
    public long B0;
    public long C0;
    public int D0;
    public long[] E0;
    public boolean[] F0;

    /* renamed from: H */
    public final int f8761H;

    /* renamed from: L */
    public final int f8762L;

    /* renamed from: M */
    public final int f8763M;

    /* renamed from: Q */
    public final int f8764Q;

    /* renamed from: a */
    public final Rect f8765a;

    /* renamed from: b */
    public final Rect f8766b;

    /* renamed from: c */
    public final Rect f8767c;

    /* renamed from: d */
    public final Rect f8768d;

    /* renamed from: e */
    public final Paint f8769e;

    /* renamed from: f */
    public final Paint f8770f;

    /* renamed from: g */
    public final Paint f8771g;

    /* renamed from: h */
    public final Paint f8772h;
    public final int h0;
    public final int i0;
    public final int j0;
    public final int k0;
    public final StringBuilder l0;
    public final Formatter m0;
    public final Runnable n0;
    public final CopyOnWriteArraySet o0;
    public final Point p0;

    /* renamed from: q */
    public final Paint f8773q;
    public final float q0;
    public int r0;

    /* renamed from: s */
    public final Paint f8774s;
    public long s0;
    public int t0;
    public Rect u0;
    public ValueAnimator v0;
    public float w0;

    /* renamed from: x */
    public final Drawable f8775x;
    public boolean x0;

    /* renamed from: y */
    public final int f8776y;
    public boolean y0;
    public long z0;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    public static int m7616d(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.s0;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.A0;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.r0;
    }

    private String getProgressText() {
        return sqi.n0(this.l0, this.m0, this.B0);
    }

    private long getScrubberPosition() {
        if (this.f8766b.width() <= 0 || this.A0 == -9223372036854775807L) {
            return 0L;
        }
        return (this.f8768d.width() * this.A0) / this.f8766b.width();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m7617j() {
        m7635v(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m7618k(ValueAnimator valueAnimator) {
        this.w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f8765a);
    }

    /* renamed from: m */
    public static int m7619m(float f, int i) {
        return (int) (i / f);
    }

    /* renamed from: q */
    public static boolean m7620q(Drawable drawable, int i) {
        return sqi.f45790a >= 23 && drawable.setLayoutDirection(i);
    }

    @Override // androidx.media3.ui.InterfaceC2298b
    /* renamed from: a */
    public void mo7621a(InterfaceC2298b.a aVar) {
        op0.m42515e(aVar);
        this.o0.add(aVar);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m7637x();
    }

    /* renamed from: e */
    public final void m7622e(Canvas canvas) {
        if (this.A0 <= 0) {
            return;
        }
        Rect rect = this.f8768d;
        int iM48736o = sqi.m48736o(rect.right, rect.left, this.f8766b.right);
        int iCenterY = this.f8768d.centerY();
        if (this.f8775x == null) {
            canvas.drawCircle(iM48736o, iCenterY, (int) ((((this.y0 || isFocused()) ? this.i0 : isEnabled() ? this.f8764Q : this.h0) * this.w0) / 2.0f), this.f8774s);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.w0)) / 2;
        int intrinsicHeight = ((int) (this.f8775x.getIntrinsicHeight() * this.w0)) / 2;
        this.f8775x.setBounds(iM48736o - intrinsicWidth, iCenterY - intrinsicHeight, iM48736o + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f8775x.draw(canvas);
    }

    /* renamed from: f */
    public final void m7623f(Canvas canvas) {
        int iHeight = this.f8766b.height();
        int iCenterY = this.f8766b.centerY() - (iHeight / 2);
        int i = iHeight + iCenterY;
        if (this.A0 <= 0) {
            Rect rect = this.f8766b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i, this.f8771g);
            return;
        }
        Rect rect2 = this.f8767c;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int iMax = Math.max(Math.max(this.f8766b.left, i3), this.f8768d.right);
        int i4 = this.f8766b.right;
        if (iMax < i4) {
            canvas.drawRect(iMax, iCenterY, i4, i, this.f8771g);
        }
        int iMax2 = Math.max(i2, this.f8768d.right);
        if (i3 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i3, i, this.f8770f);
        }
        if (this.f8768d.width() > 0) {
            Rect rect3 = this.f8768d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i, this.f8769e);
        }
        if (this.D0 == 0) {
            return;
        }
        long[] jArr = (long[]) op0.m42515e(this.E0);
        boolean[] zArr = (boolean[]) op0.m42515e(this.F0);
        int i5 = this.f8763M / 2;
        for (int i6 = 0; i6 < this.D0; i6++) {
            int iWidth = ((int) ((this.f8766b.width() * sqi.m48737p(jArr[i6], 0L, this.A0)) / this.A0)) - i5;
            Rect rect4 = this.f8766b;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f8763M, Math.max(0, iWidth)), iCenterY, r10 + this.f8763M, i, zArr[i6] ? this.f8773q : this.f8772h);
        }
    }

    /* renamed from: g */
    public void m7624g(long j) {
        if (this.v0.isStarted()) {
            this.v0.cancel();
        }
        this.v0.setFloatValues(this.w0, 0.0f);
        this.v0.setDuration(j);
        this.v0.start();
    }

    @Override // androidx.media3.ui.InterfaceC2298b
    public long getPreferredUpdateDelay() {
        int iM7619m = m7619m(this.q0, this.f8766b.width());
        if (iM7619m != 0) {
            long j = this.A0;
            if (j != 0 && j != -9223372036854775807L) {
                return j / iM7619m;
            }
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: h */
    public void m7625h(boolean z) {
        if (this.v0.isStarted()) {
            this.v0.cancel();
        }
        this.x0 = z;
        this.w0 = 0.0f;
        invalidate(this.f8765a);
    }

    /* renamed from: i */
    public final boolean m7626i(float f, float f2) {
        return this.f8765a.contains((int) f, (int) f2);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8775x;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: l */
    public final void m7627l(float f) {
        Rect rect = this.f8768d;
        Rect rect2 = this.f8766b;
        rect.right = sqi.m48736o((int) f, rect2.left, rect2.right);
    }

    /* renamed from: n */
    public final Point m7628n(MotionEvent motionEvent) {
        this.p0.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.p0;
    }

    /* renamed from: o */
    public final boolean m7629o(long j) {
        long j2 = this.A0;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.y0 ? this.z0 : this.B0;
        long jM48737p = sqi.m48737p(j3 + j, 0L, j2);
        if (jM48737p == j3) {
            return false;
        }
        if (this.y0) {
            m7638y(jM48737p);
        } else {
            m7634u(jM48737p);
        }
        m7636w();
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        m7623f(canvas);
        m7622e(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.y0 || z) {
            return;
        }
        m7635v(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.A0 <= 0) {
            return;
        }
        if (sqi.f45790a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (m7629o(positionIncrement)) {
                            removeCallbacks(this.n0);
                            postDelayed(this.n0, 1000L);
                            break;
                        }
                        break;
                    case 22:
                        if (m7629o(positionIncrement)) {
                        }
                        break;
                    case 23:
                        if (this.y0) {
                            m7635v(false);
                            break;
                        }
                        break;
                }
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingBottom;
        int iMax;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i5 - getPaddingRight();
        int i7 = this.x0 ? 0 : this.j0;
        if (this.f8762L == 1) {
            paddingBottom = (i6 - getPaddingBottom()) - this.f8761H;
            int paddingBottom2 = i6 - getPaddingBottom();
            int i8 = this.f8776y;
            iMax = (paddingBottom2 - i8) - Math.max(i7 - (i8 / 2), 0);
        } else {
            paddingBottom = (i6 - this.f8761H) / 2;
            iMax = (i6 - this.f8776y) / 2;
        }
        this.f8765a.set(paddingLeft, paddingBottom, paddingRight, this.f8761H + paddingBottom);
        Rect rect = this.f8766b;
        Rect rect2 = this.f8765a;
        rect.set(rect2.left + i7, iMax, rect2.right - i7, this.f8776y + iMax);
        if (sqi.f45790a >= 29) {
            m7631r(i5, i6);
        }
        m7636w();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f8761H;
        } else if (mode != 1073741824) {
            size = Math.min(this.f8761H, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        m7637x();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f8775x;
        if (drawable == null || !m7620q(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.A0 > 0) {
            Point pointM7628n = m7628n(motionEvent);
            int i = pointM7628n.x;
            int i2 = pointM7628n.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f = i;
                if (m7626i(f, i2)) {
                    m7627l(f);
                    m7634u(getScrubberPosition());
                    m7636w();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.y0) {
                    m7635v(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                }
            } else if (this.y0) {
                if (i2 < this.k0) {
                    int i3 = this.t0;
                    m7627l(i3 + ((i - i3) / 3));
                } else {
                    this.t0 = i;
                    m7627l(i);
                }
                m7638y(getScrubberPosition());
                m7636w();
                invalidate();
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m7630p(Drawable drawable) {
        return sqi.f45790a >= 23 && m7620q(drawable, getLayoutDirection());
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.A0 <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m7629o(-getPositionIncrement())) {
                m7635v(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m7629o(getPositionIncrement())) {
                m7635v(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    /* renamed from: r */
    public final void m7631r(int i, int i2) {
        Rect rect = this.u0;
        if (rect != null && rect.width() == i && this.u0.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.u0 = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    /* renamed from: s */
    public void m7632s() {
        if (this.v0.isStarted()) {
            this.v0.cancel();
        }
        this.x0 = false;
        this.w0 = 1.0f;
        invalidate(this.f8765a);
    }

    @Override // androidx.media3.ui.InterfaceC2298b
    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i) {
        op0.m42511a(i == 0 || !(jArr == null || zArr == null));
        this.D0 = i;
        this.E0 = jArr;
        this.F0 = zArr;
        m7636w();
    }

    public void setAdMarkerColor(int i) {
        this.f8772h.setColor(i);
        invalidate(this.f8765a);
    }

    public void setBufferedColor(int i) {
        this.f8770f.setColor(i);
        invalidate(this.f8765a);
    }

    @Override // androidx.media3.ui.InterfaceC2298b
    public void setBufferedPosition(long j) {
        if (this.C0 == j) {
            return;
        }
        this.C0 = j;
        m7636w();
    }

    @Override // androidx.media3.ui.InterfaceC2298b
    public void setDuration(long j) {
        if (this.A0 == j) {
            return;
        }
        this.A0 = j;
        if (this.y0 && j == -9223372036854775807L) {
            m7635v(true);
        }
        m7636w();
    }

    @Override // android.view.View, androidx.media3.ui.InterfaceC2298b
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.y0 || z) {
            return;
        }
        m7635v(true);
    }

    public void setKeyCountIncrement(int i) {
        op0.m42511a(i > 0);
        this.r0 = i;
        this.s0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        op0.m42511a(j > 0);
        this.r0 = -1;
        this.s0 = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f8773q.setColor(i);
        invalidate(this.f8765a);
    }

    public void setPlayedColor(int i) {
        this.f8769e.setColor(i);
        invalidate(this.f8765a);
    }

    @Override // androidx.media3.ui.InterfaceC2298b
    public void setPosition(long j) {
        if (this.B0 == j) {
            return;
        }
        this.B0 = j;
        setContentDescription(getProgressText());
        m7636w();
    }

    public void setScrubberColor(int i) {
        this.f8774s.setColor(i);
        invalidate(this.f8765a);
    }

    public void setUnplayedColor(int i) {
        this.f8771g.setColor(i);
        invalidate(this.f8765a);
    }

    /* renamed from: t */
    public void m7633t(long j) {
        if (this.v0.isStarted()) {
            this.v0.cancel();
        }
        this.x0 = false;
        this.v0.setFloatValues(this.w0, 1.0f);
        this.v0.setDuration(j);
        this.v0.start();
    }

    /* renamed from: u */
    public final void m7634u(long j) {
        this.z0 = j;
        this.y0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.o0.iterator();
        while (it.hasNext()) {
            ((InterfaceC2298b.a) it.next()).mo7681E(this, j);
        }
    }

    /* renamed from: v */
    public final void m7635v(boolean z) {
        removeCallbacks(this.n0);
        this.y0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.o0.iterator();
        while (it.hasNext()) {
            ((InterfaceC2298b.a) it.next()).mo7683L(this, this.z0, z);
        }
    }

    /* renamed from: w */
    public final void m7636w() {
        this.f8767c.set(this.f8766b);
        this.f8768d.set(this.f8766b);
        long j = this.y0 ? this.z0 : this.B0;
        if (this.A0 > 0) {
            int iWidth = (int) ((this.f8766b.width() * this.C0) / this.A0);
            Rect rect = this.f8767c;
            Rect rect2 = this.f8766b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((this.f8766b.width() * j) / this.A0);
            Rect rect3 = this.f8768d;
            Rect rect4 = this.f8766b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f8767c;
            int i = this.f8766b.left;
            rect5.right = i;
            this.f8768d.right = i;
        }
        invalidate(this.f8765a);
    }

    /* renamed from: x */
    public final void m7637x() {
        Drawable drawable = this.f8775x;
        if (drawable != null && drawable.isStateful() && this.f8775x.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: y */
    public final void m7638y(long j) {
        if (this.z0 == j) {
            return;
        }
        this.z0 = j;
        Iterator it = this.o0.iterator();
        while (it.hasNext()) {
            ((InterfaceC2298b.a) it.next()).mo7682G(this, j);
        }
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f8765a = new Rect();
        this.f8766b = new Rect();
        this.f8767c = new Rect();
        this.f8768d = new Rect();
        Paint paint = new Paint();
        this.f8769e = paint;
        Paint paint2 = new Paint();
        this.f8770f = paint2;
        Paint paint3 = new Paint();
        this.f8771g = paint3;
        Paint paint4 = new Paint();
        this.f8772h = paint4;
        Paint paint5 = new Paint();
        this.f8773q = paint5;
        Paint paint6 = new Paint();
        this.f8774s = paint6;
        paint6.setAntiAlias(true);
        this.o0 = new CopyOnWriteArraySet();
        this.p0 = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.q0 = f;
        this.k0 = m7616d(f, -50);
        int iM7616d = m7616d(f, 4);
        int iM7616d2 = m7616d(f, 26);
        int iM7616d3 = m7616d(f, 4);
        int iM7616d4 = m7616d(f, 12);
        int iM7616d5 = m7616d(f, 0);
        int iM7616d6 = m7616d(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, rbe.DefaultTimeBar, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(rbe.DefaultTimeBar_scrubber_drawable);
                this.f8775x = drawable;
                if (drawable != null) {
                    m7630p(drawable);
                    iM7616d2 = Math.max(drawable.getMinimumHeight(), iM7616d2);
                }
                this.f8776y = typedArrayObtainStyledAttributes.getDimensionPixelSize(rbe.DefaultTimeBar_bar_height, iM7616d);
                this.f8761H = typedArrayObtainStyledAttributes.getDimensionPixelSize(rbe.DefaultTimeBar_touch_target_height, iM7616d2);
                this.f8762L = typedArrayObtainStyledAttributes.getInt(rbe.DefaultTimeBar_bar_gravity, 0);
                this.f8763M = typedArrayObtainStyledAttributes.getDimensionPixelSize(rbe.DefaultTimeBar_ad_marker_width, iM7616d3);
                this.f8764Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(rbe.DefaultTimeBar_scrubber_enabled_size, iM7616d4);
                this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(rbe.DefaultTimeBar_scrubber_disabled_size, iM7616d5);
                this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(rbe.DefaultTimeBar_scrubber_dragged_size, iM7616d6);
                int i3 = typedArrayObtainStyledAttributes.getInt(rbe.DefaultTimeBar_played_color, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(rbe.DefaultTimeBar_scrubber_color, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(rbe.DefaultTimeBar_buffered_color, -855638017);
                int i6 = typedArrayObtainStyledAttributes.getInt(rbe.DefaultTimeBar_unplayed_color, 872415231);
                int i7 = typedArrayObtainStyledAttributes.getInt(rbe.DefaultTimeBar_ad_marker_color, -1291845888);
                int i8 = typedArrayObtainStyledAttributes.getInt(rbe.DefaultTimeBar_played_ad_marker_color, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            this.f8776y = iM7616d;
            this.f8761H = iM7616d2;
            this.f8762L = 0;
            this.f8763M = iM7616d3;
            this.f8764Q = iM7616d4;
            this.h0 = iM7616d5;
            this.i0 = iM7616d6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f8775x = null;
        }
        StringBuilder sb = new StringBuilder();
        this.l0 = sb;
        this.m0 = new Formatter(sb, Locale.getDefault());
        this.n0 = new Runnable() { // from class: o.si5
            @Override // java.lang.Runnable
            public final void run() {
                this.f45453a.m7617j();
            }
        };
        Drawable drawable2 = this.f8775x;
        if (drawable2 != null) {
            this.j0 = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.j0 = (Math.max(this.h0, Math.max(this.f8764Q, this.i0)) + 1) / 2;
        }
        this.w0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.v0 = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.ti5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f47192a.m7618k(valueAnimator2);
            }
        });
        this.A0 = -9223372036854775807L;
        this.s0 = -9223372036854775807L;
        this.r0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}

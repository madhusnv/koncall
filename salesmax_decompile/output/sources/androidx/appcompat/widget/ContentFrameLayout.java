package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    public TypedValue f5866a;

    /* renamed from: b */
    public TypedValue f5867b;

    /* renamed from: c */
    public TypedValue f5868c;

    /* renamed from: d */
    public TypedValue f5869d;

    /* renamed from: e */
    public TypedValue f5870e;

    /* renamed from: f */
    public TypedValue f5871f;

    /* renamed from: g */
    public final Rect f5872g;

    /* renamed from: h */
    public InterfaceC1838a f5873h;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC1838a {
        /* renamed from: a */
        void mo3831a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f5870e == null) {
            this.f5870e = new TypedValue();
        }
        return this.f5870e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f5871f == null) {
            this.f5871f = new TypedValue();
        }
        return this.f5871f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f5868c == null) {
            this.f5868c = new TypedValue();
        }
        return this.f5868c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f5869d == null) {
            this.f5869d = new TypedValue();
        }
        return this.f5869d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f5866a == null) {
            this.f5866a = new TypedValue();
        }
        return this.f5866a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f5867b == null) {
            this.f5867b = new TypedValue();
        }
        return this.f5867b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1838a interfaceC1838a = this.f5873h;
        if (interfaceC1838a != null) {
            interfaceC1838a.mo3831a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1838a interfaceC1838a = this.f5873h;
        if (interfaceC1838a != null) {
            interfaceC1838a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f5869d : this.f5868c;
            if (typedValue != null && (i7 = typedValue.type) != 0) {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i7 == 6) {
                    int i9 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i9, i9);
                } else {
                    i8 = 0;
                    if (i8 <= 0) {
                        Rect rect = this.f5872g;
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    }
                }
                i8 = (int) fraction3;
                if (i8 <= 0) {
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f5870e : this.f5871f;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i5 == 6) {
                    int i10 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i10, i10);
                } else {
                    i6 = 0;
                    if (i6 > 0) {
                        Rect rect2 = this.f5872g;
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f5867b : this.f5866a;
            if (typedValue3 != null && (i3 = typedValue3.type) != 0) {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i3 == 6) {
                    int i11 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i11, i11);
                } else {
                    i4 = 0;
                    if (i4 > 0) {
                        Rect rect3 = this.f5872g;
                        i4 -= rect3.left + rect3.right;
                    }
                    if (measuredWidth >= i4) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                }
                if (measuredWidth >= i4) {
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public void setAttachListener(InterfaceC1838a interfaceC1838a) {
        this.f5873h = interfaceC1838a;
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.f5872g.set(i, i2, i3, i4);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5872g = new Rect();
    }
}

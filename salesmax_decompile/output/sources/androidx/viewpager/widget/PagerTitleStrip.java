package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.perf.util.Constants;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p001o.gjh;
import p001o.pic;

@ViewPager.InterfaceC2537e
/* loaded from: classes2.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: M */
    public static final int[] f10447M = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* renamed from: Q */
    public static final int[] f10448Q = {R.attr.textAllCaps};

    /* renamed from: H */
    public int f10449H;

    /* renamed from: L */
    public int f10450L;

    /* renamed from: a */
    public ViewPager f10451a;

    /* renamed from: b */
    public TextView f10452b;

    /* renamed from: c */
    public TextView f10453c;

    /* renamed from: d */
    public TextView f10454d;

    /* renamed from: e */
    public int f10455e;

    /* renamed from: f */
    public float f10456f;

    /* renamed from: g */
    public int f10457g;

    /* renamed from: h */
    public int f10458h;

    /* renamed from: q */
    public boolean f10459q;

    /* renamed from: s */
    public boolean f10460s;

    /* renamed from: x */
    public final C2530a f10461x;

    /* renamed from: y */
    public WeakReference f10462y;

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$a */
    public class C2530a extends DataSetObserver implements ViewPager.InterfaceC2541i, ViewPager.InterfaceC2540h {

        /* renamed from: a */
        public int f10463a;

        public C2530a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2541i
        /* renamed from: a */
        public void mo9967a(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo9964c(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2541i
        /* renamed from: b */
        public void mo9968b(int i) {
            this.f10463a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2541i
        /* renamed from: c */
        public void mo9969c(int i) {
            if (this.f10463a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.m9966b(pagerTitleStrip.f10451a.getCurrentItem(), PagerTitleStrip.this.f10451a.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.f10456f;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.mo9964c(pagerTitleStrip2.f10451a.getCurrentItem(), f, true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2540h
        /* renamed from: d */
        public void mo9970d(ViewPager viewPager, pic picVar, pic picVar2) {
            PagerTitleStrip.this.m9965a(picVar, picVar2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.m9966b(pagerTitleStrip.f10451a.getCurrentItem(), PagerTitleStrip.this.f10451a.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.f10456f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.mo9964c(pagerTitleStrip2.f10451a.getCurrentItem(), f, true);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTitleStrip$b */
    public static class C2531b extends SingleLineTransformationMethod {

        /* renamed from: a */
        public Locale f10465a;

        public C2531b(Context context) {
            this.f10465a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f10465a);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C2531b(textView.getContext()));
    }

    /* renamed from: a */
    public void m9965a(pic picVar, pic picVar2) {
        if (picVar != null) {
            picVar.m43746r(this.f10461x);
            this.f10462y = null;
        }
        if (picVar2 != null) {
            picVar2.m43738j(this.f10461x);
            this.f10462y = new WeakReference(picVar2);
        }
        ViewPager viewPager = this.f10451a;
        if (viewPager != null) {
            this.f10455e = -1;
            this.f10456f = -1.0f;
            m9966b(viewPager.getCurrentItem(), picVar2);
            requestLayout();
        }
    }

    /* renamed from: b */
    public void m9966b(int i, pic picVar) {
        int iMo27814d = picVar != null ? picVar.mo27814d() : 0;
        this.f10459q = true;
        CharSequence charSequenceMo27815f = null;
        this.f10452b.setText((i < 1 || picVar == null) ? null : picVar.mo27815f(i - 1));
        this.f10453c.setText((picVar == null || i >= iMo27814d) ? null : picVar.mo27815f(i));
        int i2 = i + 1;
        if (i2 < iMo27814d && picVar != null) {
            charSequenceMo27815f = picVar.mo27815f(i2);
        }
        this.f10454d.setText(charSequenceMo27815f);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f10452b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f10453c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f10454d.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f10455e = i;
        if (!this.f10460s) {
            mo9964c(i, this.f10456f, false);
        }
        this.f10459q = false;
    }

    /* renamed from: c */
    public void mo9964c(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f10455e) {
            m9966b(i, this.f10451a.getAdapter());
        } else if (!z && f == this.f10456f) {
            return;
        }
        this.f10460s = true;
        int measuredWidth = this.f10452b.getMeasuredWidth();
        int measuredWidth2 = this.f10453c.getMeasuredWidth();
        int measuredWidth3 = this.f10454d.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f10452b.getBaseline();
        int baseline2 = this.f10453c.getBaseline();
        int baseline3 = this.f10454d.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = iMax - baseline;
        int i12 = iMax - baseline2;
        int i13 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f10452b.getMeasuredHeight() + i11, this.f10453c.getMeasuredHeight() + i12), this.f10454d.getMeasuredHeight() + i13);
        int i14 = this.f10458h & 112;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
                TextView textView = this.f10453c;
                textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
                int iMin = Math.min(paddingLeft, (i9 - this.f10457g) - measuredWidth);
                TextView textView2 = this.f10452b;
                textView2.layout(iMin, i3, measuredWidth + iMin, textView2.getMeasuredHeight() + i3);
                int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f10457g);
                TextView textView3 = this.f10454d;
                textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
                this.f10456f = f;
                this.f10460s = false;
            }
            i2 = (height - paddingBottom) - iMax2;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.f10453c;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.f10457g) - measuredWidth);
        TextView textView22 = this.f10452b;
        textView22.layout(iMin2, i3, measuredWidth + iMin2, textView22.getMeasuredHeight() + i3);
        int iMax32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f10457g);
        TextView textView32 = this.f10454d;
        textView32.layout(iMax32, i5, iMax32 + measuredWidth3, textView32.getMeasuredHeight() + i5);
        this.f10456f = f;
        this.f10460s = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f10457g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        pic adapter = viewPager.getAdapter();
        viewPager.m9986O(this.f10461x);
        viewPager.m9990b(this.f10461x);
        this.f10451a = viewPager;
        WeakReference weakReference = this.f10462y;
        m9965a(weakReference != null ? (pic) weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f10451a;
        if (viewPager != null) {
            m9965a(viewPager.getAdapter(), null);
            this.f10451a.m9986O(null);
            this.f10451a.m9979H(this.f10461x);
            this.f10451a = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f10451a != null) {
            float f = this.f10456f;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo9964c(this.f10455e, f, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.f10452b.measure(childMeasureSpec2, childMeasureSpec);
        this.f10453c.measure(childMeasureSpec2, childMeasureSpec);
        this.f10454d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(getMinHeight(), this.f10453c.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, this.f10453c.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f10459q) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.f10458h = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f) {
        int i = ((int) (f * 255.0f)) & Constants.MAX_HOST_LENGTH;
        this.f10449H = i;
        int i2 = (i << 24) | (this.f10450L & 16777215);
        this.f10452b.setTextColor(i2);
        this.f10454d.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.f10450L = i;
        this.f10453c.setTextColor(i);
        int i2 = (this.f10449H << 24) | (this.f10450L & 16777215);
        this.f10452b.setTextColor(i2);
        this.f10454d.setTextColor(i2);
    }

    public void setTextSize(int i, float f) {
        this.f10452b.setTextSize(i, f);
        this.f10453c.setTextSize(i, f);
        this.f10454d.setTextSize(i, f);
    }

    public void setTextSpacing(int i) {
        this.f10457g = i;
        requestLayout();
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f10455e = -1;
        this.f10456f = -1.0f;
        this.f10461x = new C2530a();
        TextView textView = new TextView(context);
        this.f10452b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f10453c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f10454d = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10447M);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            gjh.m28914m(this.f10452b, resourceId);
            gjh.m28914m(this.f10453c, resourceId);
            gjh.m28914m(this.f10454d, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f10452b.setTextColor(color);
            this.f10453c.setTextColor(color);
            this.f10454d.setTextColor(color);
        }
        this.f10458h = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f10450L = this.f10453c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.f10452b.setEllipsize(TextUtils.TruncateAt.END);
        this.f10453c.setEllipsize(TextUtils.TruncateAt.END);
        this.f10454d.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f10448Q);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f10452b);
            setSingleLineAllCaps(this.f10453c);
            setSingleLineAllCaps(this.f10454d);
        } else {
            this.f10452b.setSingleLine();
            this.f10453c.setSingleLine();
            this.f10454d.setSingleLine();
        }
        this.f10457g = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}

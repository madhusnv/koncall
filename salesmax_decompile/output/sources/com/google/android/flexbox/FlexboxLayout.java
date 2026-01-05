package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.C10898b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.dbe;
import p001o.n27;
import p001o.wvi;

/* loaded from: classes5.dex */
public class FlexboxLayout extends ViewGroup implements n27 {

    /* renamed from: H */
    public int[] f11859H;

    /* renamed from: L */
    public SparseIntArray f11860L;

    /* renamed from: M */
    public C10898b f11861M;

    /* renamed from: Q */
    public List f11862Q;

    /* renamed from: a */
    public int f11863a;

    /* renamed from: b */
    public int f11864b;

    /* renamed from: c */
    public int f11865c;

    /* renamed from: d */
    public int f11866d;

    /* renamed from: e */
    public int f11867e;

    /* renamed from: f */
    public int f11868f;

    /* renamed from: g */
    public Drawable f11869g;

    /* renamed from: h */
    public Drawable f11870h;
    public C10898b.b h0;

    /* renamed from: q */
    public int f11871q;

    /* renamed from: s */
    public int f11872s;

    /* renamed from: x */
    public int f11873x;

    /* renamed from: y */
    public int f11874y;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    public final void m13646A() {
        if (this.f11869g == null && this.f11870h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* renamed from: a */
    public final boolean m13647a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (((C10897a) this.f11862Q.get(i2)).m13739c() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f11860L == null) {
            this.f11860L = new SparseIntArray(getChildCount());
        }
        this.f11859H = this.f11861M.m13780n(view, i, layoutParams, this.f11860L);
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final boolean m13648b(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewM13664r = m13664r(i - i3);
            if (viewM13664r != null && viewM13664r.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final void m13649c(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f11862Q.size();
        for (int i = 0; i < size; i++) {
            C10897a c10897a = (C10897a) this.f11862Q.get(i);
            for (int i2 = 0; i2 < c10897a.f11922h; i2++) {
                int i3 = c10897a.f11929o + i2;
                View viewM13664r = m13664r(i3);
                if (viewM13664r != null && viewM13664r.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewM13664r.getLayoutParams();
                    if (m13665s(i3, i2)) {
                        m13656j(canvas, z ? viewM13664r.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewM13664r.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f11874y, c10897a.f11916b, c10897a.f11921g);
                    }
                    if (i2 == c10897a.f11922h - 1 && (this.f11872s & 4) > 0) {
                        m13656j(canvas, z ? (viewM13664r.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f11874y : viewM13664r.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, c10897a.f11916b, c10897a.f11921g);
                    }
                }
            }
            if (m13666t(i)) {
                m13654h(canvas, paddingLeft, z2 ? c10897a.f11918d : c10897a.f11916b - this.f11873x, iMax);
            }
            if (m13667u(i) && (this.f11871q & 4) > 0) {
                m13654h(canvas, paddingLeft, z2 ? c10897a.f11916b - this.f11873x : c10897a.f11918d, iMax);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // p001o.n27
    /* renamed from: d */
    public void mo13650d(View view, int i, int i2, C10897a c10897a) {
        if (m13665s(i, i2)) {
            if (mo13663q()) {
                int i3 = c10897a.f11919e;
                int i4 = this.f11874y;
                c10897a.f11919e = i3 + i4;
                c10897a.f11920f += i4;
                return;
            }
            int i5 = c10897a.f11919e;
            int i6 = this.f11873x;
            c10897a.f11919e = i5 + i6;
            c10897a.f11920f += i6;
        }
    }

    @Override // p001o.n27
    /* renamed from: e */
    public int mo13651e(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: f */
    public final void m13652f(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f11862Q.size();
        for (int i = 0; i < size; i++) {
            C10897a c10897a = (C10897a) this.f11862Q.get(i);
            for (int i2 = 0; i2 < c10897a.f11922h; i2++) {
                int i3 = c10897a.f11929o + i2;
                View viewM13664r = m13664r(i3);
                if (viewM13664r != null && viewM13664r.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewM13664r.getLayoutParams();
                    if (m13665s(i3, i2)) {
                        m13654h(canvas, c10897a.f11915a, z2 ? viewM13664r.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewM13664r.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f11873x, c10897a.f11921g);
                    }
                    if (i2 == c10897a.f11922h - 1 && (this.f11871q & 4) > 0) {
                        m13654h(canvas, c10897a.f11915a, z2 ? (viewM13664r.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f11873x : viewM13664r.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, c10897a.f11921g);
                    }
                }
            }
            if (m13666t(i)) {
                m13656j(canvas, z ? c10897a.f11917c : c10897a.f11915a - this.f11874y, paddingTop, iMax);
            }
            if (m13667u(i) && (this.f11872s & 4) > 0) {
                m13656j(canvas, z ? c10897a.f11915a - this.f11874y : c10897a.f11917c, paddingTop, iMax);
            }
        }
    }

    @Override // p001o.n27
    /* renamed from: g */
    public View mo13653g(int i) {
        return getChildAt(i);
    }

    @Override // p001o.n27
    public int getAlignContent() {
        return this.f11867e;
    }

    @Override // p001o.n27
    public int getAlignItems() {
        return this.f11866d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f11869g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f11870h;
    }

    @Override // p001o.n27
    public int getFlexDirection() {
        return this.f11863a;
    }

    @Override // p001o.n27
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C10897a> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f11862Q.size());
        for (C10897a c10897a : this.f11862Q) {
            if (c10897a.m13739c() != 0) {
                arrayList.add(c10897a);
            }
        }
        return arrayList;
    }

    @Override // p001o.n27
    public List<C10897a> getFlexLinesInternal() {
        return this.f11862Q;
    }

    @Override // p001o.n27
    public int getFlexWrap() {
        return this.f11864b;
    }

    public int getJustifyContent() {
        return this.f11865c;
    }

    @Override // p001o.n27
    public int getLargestMainSize() {
        Iterator it = this.f11862Q.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C10897a) it.next()).f11919e);
        }
        return iMax;
    }

    @Override // p001o.n27
    public int getMaxLine() {
        return this.f11868f;
    }

    public int getShowDividerHorizontal() {
        return this.f11871q;
    }

    public int getShowDividerVertical() {
        return this.f11872s;
    }

    @Override // p001o.n27
    public int getSumOfCrossSize() {
        int size = this.f11862Q.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C10897a c10897a = (C10897a) this.f11862Q.get(i2);
            if (m13666t(i2)) {
                i += mo13663q() ? this.f11873x : this.f11874y;
            }
            if (m13667u(i2)) {
                i += mo13663q() ? this.f11873x : this.f11874y;
            }
            i += c10897a.f11921g;
        }
        return i;
    }

    /* renamed from: h */
    public final void m13654h(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f11869g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.f11873x + i2);
        this.f11869g.draw(canvas);
    }

    @Override // p001o.n27
    /* renamed from: i */
    public int mo13655i(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: j */
    public final void m13656j(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f11870h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f11874y + i, i3 + i2);
        this.f11870h.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // p001o.n27
    /* renamed from: l */
    public int mo13658l(View view) {
        return 0;
    }

    @Override // p001o.n27
    /* renamed from: m */
    public void mo13659m(C10897a c10897a) {
        if (mo13663q()) {
            if ((this.f11872s & 4) > 0) {
                int i = c10897a.f11919e;
                int i2 = this.f11874y;
                c10897a.f11919e = i + i2;
                c10897a.f11920f += i2;
                return;
            }
            return;
        }
        if ((this.f11871q & 4) > 0) {
            int i3 = c10897a.f11919e;
            int i4 = this.f11873x;
            c10897a.f11919e = i3 + i4;
            c10897a.f11920f += i4;
        }
    }

    @Override // p001o.n27
    /* renamed from: n */
    public View mo13660n(int i) {
        return m13664r(i);
    }

    @Override // p001o.n27
    /* renamed from: o */
    public void mo13661o(int i, View view) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f11870h == null && this.f11869g == null) {
            return;
        }
        if (this.f11871q == 0 && this.f11872s == 0) {
            return;
        }
        int iM55139z = wvi.m55139z(this);
        int i = this.f11863a;
        if (i == 0) {
            m13649c(canvas, iM55139z == 1, this.f11864b == 2);
            return;
        }
        if (i == 1) {
            m13649c(canvas, iM55139z != 1, this.f11864b == 2);
            return;
        }
        if (i == 2) {
            boolean z = iM55139z == 1;
            if (this.f11864b == 2) {
                z = !z;
            }
            m13652f(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = iM55139z == 1;
        if (this.f11864b == 2) {
            z2 = !z2;
        }
        m13652f(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int iM55139z = wvi.m55139z(this);
        int i5 = this.f11863a;
        if (i5 == 0) {
            m13668v(iM55139z == 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 1) {
            m13668v(iM55139z != 1, i, i2, i3, i4);
            return;
        }
        if (i5 == 2) {
            z2 = iM55139z == 1;
            m13669w(this.f11864b == 2 ? !z2 : z2, false, i, i2, i3, i4);
        } else if (i5 == 3) {
            z2 = iM55139z == 1;
            m13669w(this.f11864b == 2 ? !z2 : z2, true, i, i2, i3, i4);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f11863a);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f11860L == null) {
            this.f11860L = new SparseIntArray(getChildCount());
        }
        if (this.f11861M.m13755O(this.f11860L)) {
            this.f11859H = this.f11861M.m13779m(this.f11860L);
        }
        int i3 = this.f11863a;
        if (i3 == 0 || i3 == 1) {
            m13670x(i, i2);
            return;
        }
        if (i3 == 2 || i3 == 3) {
            m13671y(i, i2);
            return;
        }
        throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f11863a);
    }

    @Override // p001o.n27
    /* renamed from: p */
    public int mo13662p(View view, int i, int i2) {
        int i3;
        int i4;
        if (mo13663q()) {
            i3 = m13665s(i, i2) ? 0 + this.f11874y : 0;
            if ((this.f11872s & 4) <= 0) {
                return i3;
            }
            i4 = this.f11874y;
        } else {
            i3 = m13665s(i, i2) ? 0 + this.f11873x : 0;
            if ((this.f11871q & 4) <= 0) {
                return i3;
            }
            i4 = this.f11873x;
        }
        return i3 + i4;
    }

    @Override // p001o.n27
    /* renamed from: q */
    public boolean mo13663q() {
        int i = this.f11863a;
        return i == 0 || i == 1;
    }

    /* renamed from: r */
    public View m13664r(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f11859H;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    /* renamed from: s */
    public final boolean m13665s(int i, int i2) {
        return m13648b(i, i2) ? mo13663q() ? (this.f11872s & 1) != 0 : (this.f11871q & 1) != 0 : mo13663q() ? (this.f11872s & 2) != 0 : (this.f11871q & 2) != 0;
    }

    public void setAlignContent(int i) {
        if (this.f11867e != i) {
            this.f11867e = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f11866d != i) {
            this.f11866d = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f11869g) {
            return;
        }
        this.f11869g = drawable;
        if (drawable != null) {
            this.f11873x = drawable.getIntrinsicHeight();
        } else {
            this.f11873x = 0;
        }
        m13646A();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f11870h) {
            return;
        }
        this.f11870h = drawable;
        if (drawable != null) {
            this.f11874y = drawable.getIntrinsicWidth();
        } else {
            this.f11874y = 0;
        }
        m13646A();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f11863a != i) {
            this.f11863a = i;
            requestLayout();
        }
    }

    @Override // p001o.n27
    public void setFlexLines(List<C10897a> list) {
        this.f11862Q = list;
    }

    public void setFlexWrap(int i) {
        if (this.f11864b != i) {
            this.f11864b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f11865c != i) {
            this.f11865c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f11868f != i) {
            this.f11868f = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f11871q) {
            this.f11871q = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f11872s) {
            this.f11872s = i;
            requestLayout();
        }
    }

    /* renamed from: t */
    public final boolean m13666t(int i) {
        if (i < 0 || i >= this.f11862Q.size()) {
            return false;
        }
        return m13647a(i) ? mo13663q() ? (this.f11871q & 1) != 0 : (this.f11872s & 1) != 0 : mo13663q() ? (this.f11871q & 2) != 0 : (this.f11872s & 2) != 0;
    }

    /* renamed from: u */
    public final boolean m13667u(int i) {
        if (i < 0 || i >= this.f11862Q.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f11862Q.size(); i2++) {
            if (((C10897a) this.f11862Q.get(i2)).m13739c() > 0) {
                return false;
            }
        }
        return mo13663q() ? (this.f11871q & 4) != 0 : (this.f11872s & 4) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13668v(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        char c;
        float f3;
        int i9;
        char c2;
        LayoutParams layoutParams;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i10 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f11862Q.size();
        int i11 = 0;
        while (i11 < size) {
            C10897a c10897a = (C10897a) this.f11862Q.get(i11);
            if (m13666t(i11)) {
                int i12 = this.f11873x;
                paddingBottom -= i12;
                paddingTop += i12;
            }
            int i13 = this.f11865c;
            char c3 = 4;
            int i14 = 1;
            if (i13 == 0) {
                measuredWidth = paddingLeft;
                f = i10 - paddingRight;
            } else if (i13 == 1) {
                int i15 = c10897a.f11919e;
                f = i15 - paddingLeft;
                measuredWidth = (i10 - i15) + paddingRight;
            } else if (i13 != 2) {
                if (i13 == 3) {
                    measuredWidth = paddingLeft;
                    f2 = (i10 - c10897a.f11919e) / (c10897a.m13739c() != 1 ? r10 - 1 : 1.0f);
                    f = i10 - paddingRight;
                } else if (i13 == 4) {
                    int iM13739c = c10897a.m13739c();
                    f2 = iM13739c != 0 ? (i10 - c10897a.f11919e) / iM13739c : 0.0f;
                    float f4 = f2 / 2.0f;
                    measuredWidth = paddingLeft + f4;
                    f = (i10 - paddingRight) - f4;
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f11865c);
                    }
                    f2 = c10897a.m13739c() != 0 ? (i10 - c10897a.f11919e) / (r7 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i10 - paddingRight) - f2;
                }
                float fMax = Math.max(f2, 0.0f);
                i5 = 0;
                while (i5 < c10897a.f11922h) {
                    int i16 = c10897a.f11929o + i5;
                    View viewM13664r = m13664r(i16);
                    if (viewM13664r == null) {
                        i6 = paddingLeft;
                        i7 = i14;
                        i8 = i5;
                        c = c3;
                    } else if (viewM13664r.getVisibility() == 8) {
                        i6 = paddingLeft;
                        i7 = i14;
                        i8 = i5;
                        c = 4;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) viewM13664r.getLayoutParams();
                        float f5 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        float f6 = f - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        if (m13665s(i16, i5)) {
                            int i17 = this.f11874y;
                            float f7 = i17;
                            f5 += f7;
                            i9 = i17;
                            f3 = f6 - f7;
                        } else {
                            f3 = f6;
                            i9 = 0;
                        }
                        if (i5 == c10897a.f11922h - i14) {
                            c2 = 4;
                            int i18 = (this.f11872s & 4) > 0 ? this.f11874y : 0;
                            if (this.f11864b == 2) {
                                i6 = paddingLeft;
                                i7 = i14;
                                i8 = i5;
                                layoutParams = layoutParams2;
                                c = c2;
                                if (z) {
                                    this.f11861M.m13757Q(viewM13664r, c10897a, Math.round(f3) - viewM13664r.getMeasuredWidth(), paddingTop, Math.round(f3), paddingTop + viewM13664r.getMeasuredHeight());
                                } else {
                                    this.f11861M.m13757Q(viewM13664r, c10897a, Math.round(f5), paddingTop, Math.round(f5) + viewM13664r.getMeasuredWidth(), paddingTop + viewM13664r.getMeasuredHeight());
                                }
                            } else if (z) {
                                i7 = i14;
                                i8 = i5;
                                i6 = paddingLeft;
                                layoutParams = layoutParams2;
                                c = c2;
                                this.f11861M.m13757Q(viewM13664r, c10897a, Math.round(f3) - viewM13664r.getMeasuredWidth(), paddingBottom - viewM13664r.getMeasuredHeight(), Math.round(f3), paddingBottom);
                            } else {
                                i6 = paddingLeft;
                                i7 = i14;
                                i8 = i5;
                                layoutParams = layoutParams2;
                                c = c2;
                                this.f11861M.m13757Q(viewM13664r, c10897a, Math.round(f5), paddingBottom - viewM13664r.getMeasuredHeight(), Math.round(f5) + viewM13664r.getMeasuredWidth(), paddingBottom);
                            }
                            measuredWidth = f5 + viewM13664r.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth2 = f3 - ((viewM13664r.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z) {
                                c10897a.m13740d(viewM13664r, i9, 0, i18, 0);
                            } else {
                                c10897a.m13740d(viewM13664r, i18, 0, i9, 0);
                            }
                            f = measuredWidth2;
                        } else {
                            c2 = 4;
                        }
                        if (this.f11864b == 2) {
                        }
                        measuredWidth = f5 + viewM13664r.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        float measuredWidth22 = f3 - ((viewM13664r.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                        if (z) {
                        }
                        f = measuredWidth22;
                    }
                    i5 = i8 + 1;
                    paddingLeft = i6;
                    i14 = i7;
                    c3 = c;
                }
                int i19 = paddingLeft;
                int i20 = c10897a.f11921g;
                paddingTop += i20;
                paddingBottom -= i20;
                i11++;
                paddingLeft = i19;
            } else {
                int i21 = c10897a.f11919e;
                measuredWidth = paddingLeft + ((i10 - i21) / 2.0f);
                f = (i10 - paddingRight) - ((i10 - i21) / 2.0f);
            }
            f2 = 0.0f;
            float fMax2 = Math.max(f2, 0.0f);
            i5 = 0;
            while (i5 < c10897a.f11922h) {
            }
            int i192 = paddingLeft;
            int i202 = c10897a.f11921g;
            paddingTop += i202;
            paddingBottom -= i202;
            i11++;
            paddingLeft = i192;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f5  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13669w(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2;
        float f3;
        int i6;
        int i7;
        boolean z3;
        char c;
        float f4;
        float f5;
        int i8;
        char c2;
        LayoutParams layoutParams;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i9 = i4 - i2;
        int i10 = (i3 - i) - paddingRight;
        int size = this.f11862Q.size();
        for (int i11 = 0; i11 < size; i11++) {
            C10897a c10897a = (C10897a) this.f11862Q.get(i11);
            if (m13666t(i11)) {
                int i12 = this.f11874y;
                paddingLeft += i12;
                i10 -= i12;
            }
            int i13 = this.f11865c;
            char c3 = 4;
            boolean z4 = true;
            if (i13 == 0) {
                f = paddingTop;
                i5 = i9 - paddingBottom;
            } else if (i13 == 1) {
                int i14 = c10897a.f11919e;
                f = (i9 - i14) + paddingBottom;
                i5 = i14 - paddingTop;
            } else if (i13 != 2) {
                if (i13 == 3) {
                    f = paddingTop;
                    f3 = (i9 - c10897a.f11919e) / (c10897a.m13739c() != 1 ? r7 - 1 : 1.0f);
                    f2 = i9 - paddingBottom;
                } else if (i13 == 4) {
                    int iM13739c = c10897a.m13739c();
                    f3 = iM13739c != 0 ? (i9 - c10897a.f11919e) / iM13739c : 0.0f;
                    float f6 = f3 / 2.0f;
                    f = paddingTop + f6;
                    f2 = (i9 - paddingBottom) - f6;
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f11865c);
                    }
                    f3 = c10897a.m13739c() != 0 ? (i9 - c10897a.f11919e) / (r10 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i9 - paddingBottom) - f3;
                }
                float fMax = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < c10897a.f11922h) {
                    int i15 = c10897a.f11929o + i6;
                    View viewM13664r = m13664r(i15);
                    if (viewM13664r == null) {
                        i7 = i6;
                        z3 = z4;
                        c = c3;
                    } else if (viewM13664r.getVisibility() == 8) {
                        i7 = i6;
                        z3 = true;
                        c = 4;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) viewM13664r.getLayoutParams();
                        float f7 = f + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        float f8 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        if (m13665s(i15, i6)) {
                            int i16 = this.f11873x;
                            float f9 = i16;
                            f4 = f7 + f9;
                            i8 = i16;
                            f5 = f8 - f9;
                        } else {
                            f4 = f7;
                            f5 = f8;
                            i8 = 0;
                        }
                        if (i6 == c10897a.f11922h - 1) {
                            c2 = 4;
                            int i17 = (this.f11871q & 4) > 0 ? this.f11873x : 0;
                            if (z) {
                                i7 = i6;
                                z3 = true;
                                layoutParams = layoutParams2;
                                c = c2;
                                if (z2) {
                                    this.f11861M.m13758R(viewM13664r, c10897a, false, paddingLeft, Math.round(f5) - viewM13664r.getMeasuredHeight(), paddingLeft + viewM13664r.getMeasuredWidth(), Math.round(f5));
                                } else {
                                    this.f11861M.m13758R(viewM13664r, c10897a, false, paddingLeft, Math.round(f4), paddingLeft + viewM13664r.getMeasuredWidth(), Math.round(f4) + viewM13664r.getMeasuredHeight());
                                }
                            } else if (z2) {
                                i7 = i6;
                                z3 = true;
                                layoutParams = layoutParams2;
                                c = c2;
                                this.f11861M.m13758R(viewM13664r, c10897a, true, i10 - viewM13664r.getMeasuredWidth(), Math.round(f5) - viewM13664r.getMeasuredHeight(), i10, Math.round(f5));
                            } else {
                                i7 = i6;
                                z3 = true;
                                layoutParams = layoutParams2;
                                c = c2;
                                this.f11861M.m13758R(viewM13664r, c10897a, true, i10 - viewM13664r.getMeasuredWidth(), Math.round(f4), i10, Math.round(f4) + viewM13664r.getMeasuredHeight());
                            }
                            LayoutParams layoutParams3 = layoutParams;
                            float measuredHeight = f4 + viewM13664r.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                            float measuredHeight2 = f5 - ((viewM13664r.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin);
                            if (z2) {
                                c10897a.m13740d(viewM13664r, 0, i8, 0, i17);
                            } else {
                                c10897a.m13740d(viewM13664r, 0, i17, 0, i8);
                            }
                            f = measuredHeight;
                            f2 = measuredHeight2;
                        } else {
                            c2 = 4;
                        }
                        if (z) {
                        }
                        LayoutParams layoutParams32 = layoutParams;
                        float measuredHeight3 = f4 + viewM13664r.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams32).bottomMargin;
                        float measuredHeight22 = f5 - ((viewM13664r.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams32).topMargin);
                        if (z2) {
                        }
                        f = measuredHeight3;
                        f2 = measuredHeight22;
                    }
                    i6 = i7 + 1;
                    z4 = z3;
                    c3 = c;
                }
                int i18 = c10897a.f11921g;
                paddingLeft += i18;
                i10 -= i18;
            } else {
                int i19 = c10897a.f11919e;
                f2 = (i9 - paddingBottom) - ((i9 - i19) / 2.0f);
                f = paddingTop + ((i9 - i19) / 2.0f);
                f3 = 0.0f;
                float fMax2 = Math.max(f3, 0.0f);
                i6 = 0;
                while (i6 < c10897a.f11922h) {
                }
                int i182 = c10897a.f11921g;
                paddingLeft += i182;
                i10 -= i182;
            }
            f2 = i5;
            f3 = 0.0f;
            float fMax22 = Math.max(f3, 0.0f);
            i6 = 0;
            while (i6 < c10897a.f11922h) {
            }
            int i1822 = c10897a.f11921g;
            paddingLeft += i1822;
            i10 -= i1822;
        }
    }

    /* renamed from: x */
    public final void m13670x(int i, int i2) {
        this.f11862Q.clear();
        this.h0.m13793a();
        this.f11861M.m13769c(this.h0, i, i2);
        this.f11862Q = this.h0.f11938a;
        this.f11861M.m13782p(i, i2);
        if (this.f11866d == 3) {
            for (C10897a c10897a : this.f11862Q) {
                int iMax = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < c10897a.f11922h; i3++) {
                    View viewM13664r = m13664r(c10897a.f11929o + i3);
                    if (viewM13664r != null && viewM13664r.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewM13664r.getLayoutParams();
                        iMax = this.f11864b != 2 ? Math.max(iMax, viewM13664r.getMeasuredHeight() + Math.max(c10897a.f11926l - viewM13664r.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewM13664r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((c10897a.f11926l - viewM13664r.getMeasuredHeight()) + viewM13664r.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                c10897a.f11921g = iMax;
            }
        }
        this.f11861M.m13781o(i, i2, getPaddingTop() + getPaddingBottom());
        this.f11861M.m13764X();
        m13672z(this.f11863a, i, i2, this.h0.f11939b);
    }

    /* renamed from: y */
    public final void m13671y(int i, int i2) {
        this.f11862Q.clear();
        this.h0.m13793a();
        this.f11861M.m13772f(this.h0, i, i2);
        this.f11862Q = this.h0.f11938a;
        this.f11861M.m13782p(i, i2);
        this.f11861M.m13781o(i, i2, getPaddingLeft() + getPaddingRight());
        this.f11861M.m13764X();
        m13672z(this.f11863a, i, i2, this.h0.f11939b);
    }

    /* renamed from: z */
    public final void m13672z(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown width mode is set: " + mode);
            }
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException("Unknown height mode is set: " + mode2);
            }
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11868f = -1;
        this.f11861M = new C10898b(this);
        this.f11862Q = new ArrayList();
        this.h0 = new C10898b.b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbe.FlexboxLayout, i, 0);
        this.f11863a = typedArrayObtainStyledAttributes.getInt(dbe.FlexboxLayout_flexDirection, 0);
        this.f11864b = typedArrayObtainStyledAttributes.getInt(dbe.FlexboxLayout_flexWrap, 0);
        this.f11865c = typedArrayObtainStyledAttributes.getInt(dbe.FlexboxLayout_justifyContent, 0);
        this.f11866d = typedArrayObtainStyledAttributes.getInt(dbe.FlexboxLayout_alignItems, 0);
        this.f11867e = typedArrayObtainStyledAttributes.getInt(dbe.FlexboxLayout_alignContent, 0);
        this.f11868f = typedArrayObtainStyledAttributes.getInt(dbe.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(dbe.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(dbe.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(dbe.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(dbe.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.f11872s = i2;
            this.f11871q = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(dbe.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.f11872s = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(dbe.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.f11871q = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C10891a();

        /* renamed from: a */
        public int f11875a;

        /* renamed from: b */
        public float f11876b;

        /* renamed from: c */
        public float f11877c;

        /* renamed from: d */
        public int f11878d;

        /* renamed from: e */
        public float f11879e;

        /* renamed from: f */
        public int f11880f;

        /* renamed from: g */
        public int f11881g;

        /* renamed from: h */
        public int f11882h;

        /* renamed from: q */
        public int f11883q;

        /* renamed from: s */
        public boolean f11884s;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$LayoutParams$a */
        public class C10891a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11875a = 1;
            this.f11876b = 0.0f;
            this.f11877c = 1.0f;
            this.f11878d = -1;
            this.f11879e = -1.0f;
            this.f11880f = -1;
            this.f11881g = -1;
            this.f11882h = 16777215;
            this.f11883q = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dbe.FlexboxLayout_Layout);
            this.f11875a = typedArrayObtainStyledAttributes.getInt(dbe.FlexboxLayout_Layout_layout_order, 1);
            this.f11876b = typedArrayObtainStyledAttributes.getFloat(dbe.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.f11877c = typedArrayObtainStyledAttributes.getFloat(dbe.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f11878d = typedArrayObtainStyledAttributes.getInt(dbe.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f11879e = typedArrayObtainStyledAttributes.getFraction(dbe.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f11880f = typedArrayObtainStyledAttributes.getDimensionPixelSize(dbe.FlexboxLayout_Layout_layout_minWidth, -1);
            this.f11881g = typedArrayObtainStyledAttributes.getDimensionPixelSize(dbe.FlexboxLayout_Layout_layout_minHeight, -1);
            this.f11882h = typedArrayObtainStyledAttributes.getDimensionPixelSize(dbe.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f11883q = typedArrayObtainStyledAttributes.getDimensionPixelSize(dbe.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f11884s = typedArrayObtainStyledAttributes.getBoolean(dbe.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public void A0(int i) {
            this.f11881g = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float F0() {
            return this.f11876b;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: O */
        public int mo13643O() {
            return this.f11878d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float O0() {
            return this.f11879e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int O2() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int R2() {
            return this.f11881g;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: S */
        public float mo13644S() {
            return this.f11877c;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: Y */
        public int mo13645Y() {
            return this.f11880f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean b1() {
            return this.f11884s;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void b2(int i) {
            this.f11880f = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int c2() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int d3() {
            return this.f11883q;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int e2() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.f11875a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int n1() {
            return this.f11882h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int r0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11875a);
            parcel.writeFloat(this.f11876b);
            parcel.writeFloat(this.f11877c);
            parcel.writeInt(this.f11878d);
            parcel.writeFloat(this.f11879e);
            parcel.writeInt(this.f11880f);
            parcel.writeInt(this.f11881g);
            parcel.writeInt(this.f11882h);
            parcel.writeInt(this.f11883q);
            parcel.writeByte(this.f11884s ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f11875a = 1;
            this.f11876b = 0.0f;
            this.f11877c = 1.0f;
            this.f11878d = -1;
            this.f11879e = -1.0f;
            this.f11880f = -1;
            this.f11881g = -1;
            this.f11882h = 16777215;
            this.f11883q = 16777215;
            this.f11875a = layoutParams.f11875a;
            this.f11876b = layoutParams.f11876b;
            this.f11877c = layoutParams.f11877c;
            this.f11878d = layoutParams.f11878d;
            this.f11879e = layoutParams.f11879e;
            this.f11880f = layoutParams.f11880f;
            this.f11881g = layoutParams.f11881g;
            this.f11882h = layoutParams.f11882h;
            this.f11883q = layoutParams.f11883q;
            this.f11884s = layoutParams.f11884s;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11875a = 1;
            this.f11876b = 0.0f;
            this.f11877c = 1.0f;
            this.f11878d = -1;
            this.f11879e = -1.0f;
            this.f11880f = -1;
            this.f11881g = -1;
            this.f11882h = 16777215;
            this.f11883q = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11875a = 1;
            this.f11876b = 0.0f;
            this.f11877c = 1.0f;
            this.f11878d = -1;
            this.f11879e = -1.0f;
            this.f11880f = -1;
            this.f11881g = -1;
            this.f11882h = 16777215;
            this.f11883q = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.f11875a = 1;
            this.f11876b = 0.0f;
            this.f11877c = 1.0f;
            this.f11878d = -1;
            this.f11879e = -1.0f;
            this.f11880f = -1;
            this.f11881g = -1;
            this.f11882h = 16777215;
            this.f11883q = 16777215;
            this.f11875a = parcel.readInt();
            this.f11876b = parcel.readFloat();
            this.f11877c = parcel.readFloat();
            this.f11878d = parcel.readInt();
            this.f11879e = parcel.readFloat();
            this.f11880f = parcel.readInt();
            this.f11881g = parcel.readInt();
            this.f11882h = parcel.readInt();
            this.f11883q = parcel.readInt();
            this.f11884s = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}

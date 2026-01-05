package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p001o.lsa;
import p001o.n27;
import p001o.op3;

/* renamed from: com.google.android.flexbox.b */
/* loaded from: classes5.dex */
public class C10898b {

    /* renamed from: a */
    public final n27 f11933a;

    /* renamed from: b */
    public boolean[] f11934b;

    /* renamed from: c */
    public int[] f11935c;

    /* renamed from: d */
    public long[] f11936d;

    /* renamed from: e */
    public long[] f11937e;

    /* renamed from: com.google.android.flexbox.b$b */
    public static class b {

        /* renamed from: a */
        public List f11938a;

        /* renamed from: b */
        public int f11939b;

        /* renamed from: a */
        public void m13793a() {
            this.f11938a = null;
            this.f11939b = 0;
        }
    }

    /* renamed from: com.google.android.flexbox.b$c */
    public static class c implements Comparable {

        /* renamed from: a */
        public int f11940a;

        /* renamed from: b */
        public int f11941b;

        public c() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i = this.f11941b;
            int i2 = cVar.f11941b;
            return i != i2 ? i - i2 : this.f11940a - cVar.f11940a;
        }

        public String toString() {
            return "Order{order=" + this.f11941b + ", index=" + this.f11940a + '}';
        }
    }

    public C10898b(n27 n27Var) {
        this.f11933a = n27Var;
    }

    /* renamed from: A */
    public final int m13741A(int i, FlexItem flexItem, int i2) {
        n27 n27Var = this.f11933a;
        int iMo13651e = n27Var.mo13651e(i, n27Var.getPaddingLeft() + this.f11933a.getPaddingRight() + flexItem.e2() + flexItem.O2() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iMo13651e);
        return size > flexItem.n1() ? View.MeasureSpec.makeMeasureSpec(flexItem.n1(), View.MeasureSpec.getMode(iMo13651e)) : size < flexItem.mo13645Y() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo13645Y(), View.MeasureSpec.getMode(iMo13651e)) : iMo13651e;
    }

    /* renamed from: B */
    public final int m13742B(FlexItem flexItem, boolean z) {
        return z ? flexItem.c2() : flexItem.O2();
    }

    /* renamed from: C */
    public final int m13743C(FlexItem flexItem, boolean z) {
        return z ? flexItem.O2() : flexItem.c2();
    }

    /* renamed from: D */
    public final int m13744D(FlexItem flexItem, boolean z) {
        return z ? flexItem.r0() : flexItem.e2();
    }

    /* renamed from: E */
    public final int m13745E(FlexItem flexItem, boolean z) {
        return z ? flexItem.e2() : flexItem.r0();
    }

    /* renamed from: F */
    public final int m13746F(FlexItem flexItem, boolean z) {
        return z ? flexItem.getHeight() : flexItem.getWidth();
    }

    /* renamed from: G */
    public final int m13747G(FlexItem flexItem, boolean z) {
        return z ? flexItem.getWidth() : flexItem.getHeight();
    }

    /* renamed from: H */
    public final int m13748H(boolean z) {
        return z ? this.f11933a.getPaddingBottom() : this.f11933a.getPaddingEnd();
    }

    /* renamed from: I */
    public final int m13749I(boolean z) {
        return z ? this.f11933a.getPaddingEnd() : this.f11933a.getPaddingBottom();
    }

    /* renamed from: J */
    public final int m13750J(boolean z) {
        return z ? this.f11933a.getPaddingTop() : this.f11933a.getPaddingStart();
    }

    /* renamed from: K */
    public final int m13751K(boolean z) {
        return z ? this.f11933a.getPaddingStart() : this.f11933a.getPaddingTop();
    }

    /* renamed from: L */
    public final int m13752L(View view, boolean z) {
        return z ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    /* renamed from: M */
    public final int m13753M(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    /* renamed from: N */
    public final boolean m13754N(int i, int i2, C10897a c10897a) {
        return i == i2 - 1 && c10897a.m13739c() != 0;
    }

    /* renamed from: O */
    public boolean m13755O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f11933a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View viewMo13653g = this.f11933a.mo13653g(i);
            if (viewMo13653g != null && ((FlexItem) viewMo13653g.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public final boolean m13756P(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.f11933a.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.b1()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.f11933a.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int iMo13662p = this.f11933a.mo13662p(view, i5, i6);
        if (iMo13662p > 0) {
            i4 += iMo13662p;
        }
        return i2 < i3 + i4;
    }

    /* renamed from: Q */
    public void m13757Q(View view, C10897a c10897a, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f11933a.getAlignItems();
        if (flexItem.mo13643O() != -1) {
            alignItems = flexItem.mo13643O();
        }
        int i5 = c10897a.f11921g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.f11933a.getFlexWrap() == 2) {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.r0(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.r0());
                    return;
                } else {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.c2(), i3, i6 - flexItem.c2());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.r0()) - flexItem.c2()) / 2;
                if (this.f11933a.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.f11933a.getFlexWrap() != 2) {
                    int iMax = Math.max(c10897a.f11926l - view.getBaseline(), flexItem.r0());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((c10897a.f11926l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.c2());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.f11933a.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.r0(), i3, i4 + flexItem.r0());
        } else {
            view.layout(i, i2 - flexItem.c2(), i3, i4 - flexItem.c2());
        }
    }

    /* renamed from: R */
    public void m13758R(View view, C10897a c10897a, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f11933a.getAlignItems();
        if (flexItem.mo13643O() != -1) {
            alignItems = flexItem.mo13643O();
        }
        int i5 = c10897a.f11921g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z) {
                    view.layout((i - i5) + view.getMeasuredWidth() + flexItem.e2(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.e2(), i4);
                    return;
                } else {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.O2(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.O2(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + lsa.m37862b(marginLayoutParams)) - lsa.m37861a(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                } else {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.O2(), i2, i3 - flexItem.O2(), i4);
        } else {
            view.layout(i + flexItem.e2(), i2, i3 + flexItem.e2(), i4);
        }
    }

    /* renamed from: S */
    public long m13759S(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    /* renamed from: T */
    public final void m13760T(int i, int i2, C10897a c10897a, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int iMax;
        int i7 = c10897a.f11919e;
        float f = c10897a.f11925k;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 > i7) {
            return;
        }
        float f3 = (i7 - i3) / f;
        c10897a.f11919e = i4 + c10897a.f11920f;
        if (!z) {
            c10897a.f11921g = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        float f4 = 0.0f;
        while (i8 < c10897a.f11922h) {
            int i10 = c10897a.f11929o + i8;
            View viewMo13660n = this.f11933a.mo13660n(i10);
            if (viewMo13660n == null || viewMo13660n.getVisibility() == 8) {
                i5 = i7;
                i6 = i8;
            } else {
                FlexItem flexItem = (FlexItem) viewMo13660n.getLayoutParams();
                int flexDirection = this.f11933a.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i7;
                    int i11 = i8;
                    int measuredWidth = viewMo13660n.getMeasuredWidth();
                    long[] jArr = this.f11937e;
                    if (jArr != null) {
                        measuredWidth = m13791y(jArr[i10]);
                    }
                    int measuredHeight = viewMo13660n.getMeasuredHeight();
                    long[] jArr2 = this.f11937e;
                    if (jArr2 != null) {
                        measuredHeight = m13790x(jArr2[i10]);
                    }
                    if (this.f11934b[i10] || flexItem.mo13644S() <= 0.0f) {
                        i6 = i11;
                    } else {
                        float fMo13644S = measuredWidth - (flexItem.mo13644S() * f3);
                        i6 = i11;
                        if (i6 == c10897a.f11922h - 1) {
                            fMo13644S += f4;
                            f4 = 0.0f;
                        }
                        int iRound = Math.round(fMo13644S);
                        if (iRound < flexItem.mo13645Y()) {
                            iRound = flexItem.mo13645Y();
                            this.f11934b[i10] = true;
                            c10897a.f11925k -= flexItem.mo13644S();
                            z2 = true;
                        } else {
                            f4 += fMo13644S - iRound;
                            double d = f4;
                            if (d > 1.0d) {
                                iRound++;
                                f4 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f4 += 1.0f;
                            }
                        }
                        int iM13792z = m13792z(i2, flexItem, c10897a.f11927m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewMo13660n.measure(iMakeMeasureSpec, iM13792z);
                        int measuredWidth2 = viewMo13660n.getMeasuredWidth();
                        int measuredHeight2 = viewMo13660n.getMeasuredHeight();
                        m13766Z(i10, iMakeMeasureSpec, iM13792z, viewMo13660n);
                        this.f11933a.mo13661o(i10, viewMo13660n);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, measuredHeight + flexItem.r0() + flexItem.c2() + this.f11933a.mo13658l(viewMo13660n));
                    c10897a.f11919e += measuredWidth + flexItem.e2() + flexItem.O2();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMo13660n.getMeasuredHeight();
                    long[] jArr3 = this.f11937e;
                    if (jArr3 != null) {
                        measuredHeight3 = m13790x(jArr3[i10]);
                    }
                    int measuredWidth3 = viewMo13660n.getMeasuredWidth();
                    long[] jArr4 = this.f11937e;
                    if (jArr4 != null) {
                        measuredWidth3 = m13791y(jArr4[i10]);
                    }
                    if (this.f11934b[i10] || flexItem.mo13644S() <= f2) {
                        i5 = i7;
                        i6 = i8;
                    } else {
                        float fMo13644S2 = measuredHeight3 - (flexItem.mo13644S() * f3);
                        if (i8 == c10897a.f11922h - 1) {
                            fMo13644S2 += f4;
                            f4 = f2;
                        }
                        int iRound2 = Math.round(fMo13644S2);
                        if (iRound2 < flexItem.R2()) {
                            iRound2 = flexItem.R2();
                            this.f11934b[i10] = true;
                            c10897a.f11925k -= flexItem.mo13644S();
                            i5 = i7;
                            i6 = i8;
                            z2 = true;
                        } else {
                            f4 += fMo13644S2 - iRound2;
                            i5 = i7;
                            i6 = i8;
                            double d2 = f4;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f4 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f4 += 1.0f;
                            }
                        }
                        int iM13741A = m13741A(i, flexItem, c10897a.f11927m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewMo13660n.measure(iM13741A, iMakeMeasureSpec2);
                        measuredWidth3 = viewMo13660n.getMeasuredWidth();
                        int measuredHeight4 = viewMo13660n.getMeasuredHeight();
                        m13766Z(i10, iM13741A, iMakeMeasureSpec2, viewMo13660n);
                        this.f11933a.mo13661o(i10, viewMo13660n);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i9, measuredWidth3 + flexItem.e2() + flexItem.O2() + this.f11933a.mo13658l(viewMo13660n));
                    c10897a.f11919e += measuredHeight3 + flexItem.r0() + flexItem.c2();
                }
                c10897a.f11921g = Math.max(c10897a.f11921g, iMax);
                i9 = iMax;
            }
            i8 = i6 + 1;
            i7 = i5;
            f2 = 0.0f;
        }
        int i12 = i7;
        if (!z2 || i12 == c10897a.f11919e) {
            return;
        }
        m13760T(i, i2, c10897a, i3, i4, true);
    }

    /* renamed from: U */
    public final int[] m13761U(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i3 = cVar.f11940a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, cVar.f11941b);
            i2++;
        }
        return iArr;
    }

    /* renamed from: V */
    public final void m13762V(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.e2()) - flexItem.O2()) - this.f11933a.mo13658l(view), flexItem.mo13645Y()), flexItem.n1());
        long[] jArr = this.f11937e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? m13790x(jArr[i2]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        m13766Z(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.f11933a.mo13661o(i2, view);
    }

    /* renamed from: W */
    public final void m13763W(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - flexItem.r0()) - flexItem.c2()) - this.f11933a.mo13658l(view), flexItem.R2()), flexItem.d3());
        long[] jArr = this.f11937e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? m13791y(jArr[i2]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        m13766Z(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.f11933a.mo13661o(i2, view);
    }

    /* renamed from: X */
    public void m13764X() {
        m13765Y(0);
    }

    /* renamed from: Y */
    public void m13765Y(int i) {
        View viewMo13660n;
        if (i >= this.f11933a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f11933a.getFlexDirection();
        if (this.f11933a.getAlignItems() != 4) {
            for (C10897a c10897a : this.f11933a.getFlexLinesInternal()) {
                for (Integer num : c10897a.f11928n) {
                    View viewMo13660n2 = this.f11933a.mo13660n(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        m13763W(viewMo13660n2, c10897a.f11921g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                        m13762V(viewMo13660n2, c10897a.f11921g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f11935c;
        List flexLinesInternal = this.f11933a.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            C10897a c10897a2 = (C10897a) flexLinesInternal.get(i2);
            int i3 = c10897a2.f11922h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = c10897a2.f11929o + i4;
                if (i4 < this.f11933a.getFlexItemCount() && (viewMo13660n = this.f11933a.mo13660n(i5)) != null && viewMo13660n.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewMo13660n.getLayoutParams();
                    if (flexItem.mo13643O() == -1 || flexItem.mo13643O() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            m13763W(viewMo13660n, c10897a2.f11921g, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                            }
                            m13762V(viewMo13660n, c10897a2.f11921g, i5);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: Z */
    public final void m13766Z(int i, int i2, int i3, View view) {
        long[] jArr = this.f11936d;
        if (jArr != null) {
            jArr[i] = m13759S(i2, i3);
        }
        long[] jArr2 = this.f11937e;
        if (jArr2 != null) {
            jArr2[i] = m13759S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: a */
    public final void m13767a(List list, C10897a c10897a, int i, int i2) {
        c10897a.f11927m = i2;
        this.f11933a.mo13659m(c10897a);
        c10897a.f11930p = i;
        list.add(c10897a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m13768b(b bVar, int i, int i2, int i3, int i4, int i5, List list) {
        int i6;
        b bVar2;
        int i7;
        int i8;
        int i9;
        List list2;
        int i10;
        View view;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i;
        int i19 = i2;
        int i20 = i5;
        boolean zMo13663q = this.f11933a.mo13663q();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List arrayList = list == null ? new ArrayList() : list;
        bVar.f11938a = arrayList;
        int i21 = i20 == -1 ? 1 : 0;
        int iM13751K = m13751K(zMo13663q);
        int iM13749I = m13749I(zMo13663q);
        int iM13750J = m13750J(zMo13663q);
        int iM13748H = m13748H(zMo13663q);
        C10897a c10897a = new C10897a();
        int i22 = i4;
        c10897a.f11929o = i22;
        int i23 = iM13749I + iM13751K;
        c10897a.f11919e = i23;
        int flexItemCount = this.f11933a.getFlexItemCount();
        int i24 = i21;
        int i25 = Integer.MIN_VALUE;
        int i26 = 0;
        int iCombineMeasuredStates = 0;
        int i27 = 0;
        while (true) {
            if (i22 >= flexItemCount) {
                i6 = iCombineMeasuredStates;
                bVar2 = bVar;
                break;
            }
            View viewMo13660n = this.f11933a.mo13660n(i22);
            if (viewMo13660n != null) {
                if (viewMo13660n.getVisibility() != 8) {
                    if (viewMo13660n instanceof CompoundButton) {
                        m13788v((CompoundButton) viewMo13660n);
                    }
                    FlexItem flexItem = (FlexItem) viewMo13660n.getLayoutParams();
                    int i28 = flexItemCount;
                    if (flexItem.mo13643O() == 4) {
                        c10897a.f11928n.add(Integer.valueOf(i22));
                    }
                    int iM13747G = m13747G(flexItem, zMo13663q);
                    if (flexItem.O0() != -1.0f && mode == 1073741824) {
                        iM13747G = Math.round(size * flexItem.O0());
                    }
                    if (zMo13663q) {
                        int iMo13651e = this.f11933a.mo13651e(i18, i23 + m13745E(flexItem, true) + m13743C(flexItem, true), iM13747G);
                        i7 = size;
                        i8 = mode;
                        int iMo13655i = this.f11933a.mo13655i(i19, iM13750J + iM13748H + m13744D(flexItem, true) + m13742B(flexItem, true) + i26, m13746F(flexItem, true));
                        viewMo13660n.measure(iMo13651e, iMo13655i);
                        m13766Z(i22, iMo13651e, iMo13655i, viewMo13660n);
                        i9 = iMo13651e;
                    } else {
                        i7 = size;
                        i8 = mode;
                        int iMo13651e2 = this.f11933a.mo13651e(i19, iM13750J + iM13748H + m13744D(flexItem, false) + m13742B(flexItem, false) + i26, m13746F(flexItem, false));
                        int iMo13655i2 = this.f11933a.mo13655i(i18, m13745E(flexItem, false) + i23 + m13743C(flexItem, false), iM13747G);
                        viewMo13660n.measure(iMo13651e2, iMo13655i2);
                        m13766Z(i22, iMo13651e2, iMo13655i2, viewMo13660n);
                        i9 = iMo13655i2;
                    }
                    this.f11933a.mo13661o(i22, viewMo13660n);
                    m13775i(viewMo13660n, i22);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewMo13660n.getMeasuredState());
                    int i29 = i26;
                    int i30 = i23;
                    C10897a c10897a2 = c10897a;
                    int i31 = i22;
                    list2 = arrayList;
                    int i32 = i9;
                    if (m13756P(viewMo13660n, i8, i7, c10897a.f11919e, m13743C(flexItem, zMo13663q) + m13753M(viewMo13660n, zMo13663q) + m13745E(flexItem, zMo13663q), flexItem, i31, i27, arrayList.size())) {
                        if (c10897a2.m13739c() > 0) {
                            m13767a(list2, c10897a2, i31 > 0 ? i31 - 1 : 0, i29);
                            i26 = c10897a2.f11921g + i29;
                        } else {
                            i26 = i29;
                        }
                        if (!zMo13663q) {
                            i10 = i2;
                            view = viewMo13660n;
                            i22 = i31;
                            if (flexItem.getWidth() == -1) {
                                n27 n27Var = this.f11933a;
                                view.measure(n27Var.mo13651e(i10, n27Var.getPaddingLeft() + this.f11933a.getPaddingRight() + flexItem.e2() + flexItem.O2() + i26, flexItem.getWidth()), i32);
                                m13775i(view, i22);
                            }
                        } else if (flexItem.getHeight() == -1) {
                            n27 n27Var2 = this.f11933a;
                            i10 = i2;
                            i22 = i31;
                            view = viewMo13660n;
                            view.measure(i32, n27Var2.mo13655i(i10, n27Var2.getPaddingTop() + this.f11933a.getPaddingBottom() + flexItem.r0() + flexItem.c2() + i26, flexItem.getHeight()));
                            m13775i(view, i22);
                        } else {
                            i10 = i2;
                            view = viewMo13660n;
                            i22 = i31;
                        }
                        c10897a = new C10897a();
                        i12 = 1;
                        c10897a.f11922h = 1;
                        i11 = i30;
                        c10897a.f11919e = i11;
                        c10897a.f11929o = i22;
                        i14 = Integer.MIN_VALUE;
                        i13 = 0;
                    } else {
                        i10 = i2;
                        view = viewMo13660n;
                        i22 = i31;
                        c10897a = c10897a2;
                        i11 = i30;
                        i12 = 1;
                        c10897a.f11922h++;
                        i13 = i27 + 1;
                        i26 = i29;
                        i14 = i25;
                    }
                    c10897a.f11931q = (c10897a.f11931q ? 1 : 0) | (flexItem.F0() != 0.0f ? i12 : 0);
                    c10897a.f11932r = (c10897a.f11932r ? 1 : 0) | (flexItem.mo13644S() != 0.0f ? i12 : 0);
                    int[] iArr = this.f11935c;
                    if (iArr != null) {
                        iArr[i22] = list2.size();
                    }
                    c10897a.f11919e += m13753M(view, zMo13663q) + m13745E(flexItem, zMo13663q) + m13743C(flexItem, zMo13663q);
                    c10897a.f11924j += flexItem.F0();
                    c10897a.f11925k += flexItem.mo13644S();
                    this.f11933a.mo13650d(view, i22, i13, c10897a);
                    int iMax = Math.max(i14, m13752L(view, zMo13663q) + m13744D(flexItem, zMo13663q) + m13742B(flexItem, zMo13663q) + this.f11933a.mo13658l(view));
                    c10897a.f11921g = Math.max(c10897a.f11921g, iMax);
                    if (zMo13663q) {
                        if (this.f11933a.getFlexWrap() != 2) {
                            c10897a.f11926l = Math.max(c10897a.f11926l, view.getBaseline() + flexItem.r0());
                        } else {
                            c10897a.f11926l = Math.max(c10897a.f11926l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.c2());
                        }
                    }
                    i15 = i28;
                    if (m13754N(i22, i15, c10897a)) {
                        m13767a(list2, c10897a, i22, i26);
                        i26 += c10897a.f11921g;
                    }
                    i16 = i5;
                    if (i16 == -1 || list2.size() <= 0 || ((C10897a) list2.get(list2.size() - i12)).f11930p < i16 || i22 < i16 || i24 != 0) {
                        i17 = i3;
                    } else {
                        i26 = -c10897a.m13737a();
                        i17 = i3;
                        i24 = i12;
                    }
                    if (i26 > i17 && i24 != 0) {
                        bVar2 = bVar;
                        i6 = iCombineMeasuredStates;
                        break;
                    }
                    i27 = i13;
                    i25 = iMax;
                    i22++;
                    i18 = i;
                    flexItemCount = i15;
                    i19 = i10;
                    i23 = i11;
                    arrayList = list2;
                    size = i7;
                    i20 = i16;
                    mode = i8;
                } else {
                    c10897a.f11923i++;
                    c10897a.f11922h++;
                    if (m13754N(i22, flexItemCount, c10897a)) {
                        m13767a(arrayList, c10897a, i22, i26);
                    }
                }
            } else if (m13754N(i22, flexItemCount, c10897a)) {
                m13767a(arrayList, c10897a, i22, i26);
            }
            i7 = size;
            i8 = mode;
            i10 = i19;
            i16 = i20;
            list2 = arrayList;
            i11 = i23;
            i15 = flexItemCount;
            i22++;
            i18 = i;
            flexItemCount = i15;
            i19 = i10;
            i23 = i11;
            arrayList = list2;
            size = i7;
            i20 = i16;
            mode = i8;
        }
        bVar2.f11939b = i6;
    }

    /* renamed from: c */
    public void m13769c(b bVar, int i, int i2) {
        m13768b(bVar, i, i2, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, -1, null);
    }

    /* renamed from: d */
    public void m13770d(b bVar, int i, int i2, int i3, int i4, List list) {
        m13768b(bVar, i, i2, i3, i4, -1, list);
    }

    /* renamed from: e */
    public void m13771e(b bVar, int i, int i2, int i3, int i4, List list) {
        m13768b(bVar, i, i2, i3, 0, i4, list);
    }

    /* renamed from: f */
    public void m13772f(b bVar, int i, int i2) {
        m13768b(bVar, i2, i, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, -1, null);
    }

    /* renamed from: g */
    public void m13773g(b bVar, int i, int i2, int i3, int i4, List list) {
        m13768b(bVar, i2, i, i3, i4, -1, list);
    }

    /* renamed from: h */
    public void m13774h(b bVar, int i, int i2, int i3, int i4, List list) {
        m13768b(bVar, i2, i, i3, 0, i4, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13775i(View view, int i) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < flexItem.mo13645Y()) {
            measuredWidth = flexItem.mo13645Y();
        } else {
            if (measuredWidth <= flexItem.n1()) {
                z = false;
                if (measuredHeight >= flexItem.R2()) {
                    measuredHeight = flexItem.R2();
                } else if (measuredHeight > flexItem.d3()) {
                    measuredHeight = flexItem.d3();
                } else {
                    z2 = z;
                }
                if (z2) {
                    return;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                m13766Z(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.f11933a.mo13661o(i, view);
                return;
            }
            measuredWidth = flexItem.n1();
        }
        z = true;
        if (measuredHeight >= flexItem.R2()) {
        }
        if (z2) {
        }
    }

    /* renamed from: j */
    public void m13776j(List list, int i) {
        int i2 = this.f11935c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f11935c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f11936d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    /* renamed from: k */
    public final List m13777k(List list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        C10897a c10897a = new C10897a();
        c10897a.f11921g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(c10897a);
            }
            arrayList.add((C10897a) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(c10897a);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public final List m13778l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.f11933a.mo13653g(i2).getLayoutParams();
            c cVar = new c();
            cVar.f11941b = flexItem.getOrder();
            cVar.f11940a = i2;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: m */
    public int[] m13779m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.f11933a.getFlexItemCount();
        return m13761U(flexItemCount, m13778l(flexItemCount), sparseIntArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public int[] m13780n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.f11933a.getFlexItemCount();
        List listM13778l = m13778l(flexItemCount);
        c cVar = new c();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            cVar.f11941b = 1;
        } else {
            cVar.f11941b = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= this.f11933a.getFlexItemCount()) {
            cVar.f11940a = flexItemCount;
        } else {
            cVar.f11940a = i;
            while (i < flexItemCount) {
                ((c) listM13778l.get(i)).f11940a++;
                i++;
            }
        }
        listM13778l.add(cVar);
        return m13761U(flexItemCount + 1, listM13778l, sparseIntArray);
    }

    /* renamed from: o */
    public void m13781o(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.f11933a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<C10897a> flexLinesInternal = this.f11933a.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.f11933a.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((C10897a) flexLinesInternal.get(0)).f11921g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f11933a.getAlignContent();
                if (alignContent == 1) {
                    int i5 = size - sumOfCrossSize;
                    C10897a c10897a = new C10897a();
                    c10897a.f11921g = i5;
                    flexLinesInternal.add(0, c10897a);
                    return;
                }
                if (alignContent == 2) {
                    this.f11933a.setFlexLines(m13777k(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size4) {
                        arrayList.add((C10897a) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            C10897a c10897a2 = new C10897a();
                            if (i4 == flexLinesInternal.size() - 2) {
                                c10897a2.f11921g = Math.round(f + size3);
                                f = 0.0f;
                            } else {
                                c10897a2.f11921g = Math.round(size3);
                            }
                            int i6 = c10897a2.f11921g;
                            f += size3 - i6;
                            if (f > 1.0f) {
                                c10897a2.f11921g = i6 + 1;
                                f -= 1.0f;
                            } else if (f < -1.0f) {
                                c10897a2.f11921g = i6 - 1;
                                f += 1.0f;
                            }
                            arrayList.add(c10897a2);
                        }
                        i4++;
                    }
                    this.f11933a.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.f11933a.setFlexLines(m13777k(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    C10897a c10897a3 = new C10897a();
                    c10897a3.f11921g = size5;
                    for (C10897a c10897a4 : flexLinesInternal) {
                        arrayList2.add(c10897a3);
                        arrayList2.add(c10897a4);
                        arrayList2.add(c10897a3);
                    }
                    this.f11933a.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i4 < size7) {
                        C10897a c10897a5 = (C10897a) flexLinesInternal.get(i4);
                        float f3 = c10897a5.f11921g + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int iRound = Math.round(f3);
                        f2 += f3 - iRound;
                        if (f2 > 1.0f) {
                            iRound++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            iRound--;
                            f2 += 1.0f;
                        }
                        c10897a5.f11921g = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public void m13782p(int i, int i2) {
        m13783q(i, i2, 0);
    }

    /* renamed from: q */
    public void m13783q(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        m13784r(this.f11933a.getFlexItemCount());
        if (i3 >= this.f11933a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.f11933a.getFlexDirection();
        int flexDirection2 = this.f11933a.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.f11933a.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.f11933a.getPaddingLeft();
            paddingRight = this.f11933a.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.f11933a.getLargestMainSize();
            }
            paddingLeft = this.f11933a.getPaddingTop();
            paddingRight = this.f11933a.getPaddingBottom();
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.f11935c;
        List flexLinesInternal = this.f11933a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            C10897a c10897a = (C10897a) flexLinesInternal.get(i5);
            int i6 = c10897a.f11919e;
            if (i6 < size && c10897a.f11931q) {
                m13789w(i, i2, c10897a, size, i4, false);
            } else if (i6 > size && c10897a.f11932r) {
                m13760T(i, i2, c10897a, size, i4, false);
            }
        }
    }

    /* renamed from: r */
    public final void m13784r(int i) {
        boolean[] zArr = this.f11934b;
        if (zArr == null) {
            this.f11934b = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.f11934b = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* renamed from: s */
    public void m13785s(int i) {
        int[] iArr = this.f11935c;
        if (iArr == null) {
            this.f11935c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f11935c = Arrays.copyOf(this.f11935c, Math.max(iArr.length * 2, i));
        }
    }

    /* renamed from: t */
    public void m13786t(int i) {
        long[] jArr = this.f11936d;
        if (jArr == null) {
            this.f11936d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f11936d = Arrays.copyOf(this.f11936d, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: u */
    public void m13787u(int i) {
        long[] jArr = this.f11937e;
        if (jArr == null) {
            this.f11937e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f11937e = Arrays.copyOf(this.f11937e, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: v */
    public final void m13788v(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int iMo13645Y = flexItem.mo13645Y();
        int iR2 = flexItem.R2();
        Drawable drawableM42523a = op3.m42523a(compoundButton);
        int minimumWidth = drawableM42523a == null ? 0 : drawableM42523a.getMinimumWidth();
        int minimumHeight = drawableM42523a != null ? drawableM42523a.getMinimumHeight() : 0;
        if (iMo13645Y == -1) {
            iMo13645Y = minimumWidth;
        }
        flexItem.b2(iMo13645Y);
        if (iR2 == -1) {
            iR2 = minimumHeight;
        }
        flexItem.A0(iR2);
    }

    /* renamed from: w */
    public final void m13789w(int i, int i2, C10897a c10897a, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int iMax;
        double d;
        int i7;
        double d2;
        float f = c10897a.f11924j;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 < (i5 = c10897a.f11919e)) {
            return;
        }
        float f3 = (i3 - i5) / f;
        c10897a.f11919e = i4 + c10897a.f11920f;
        if (!z) {
            c10897a.f11921g = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        float f4 = 0.0f;
        while (i8 < c10897a.f11922h) {
            int i10 = c10897a.f11929o + i8;
            View viewMo13660n = this.f11933a.mo13660n(i10);
            if (viewMo13660n == null || viewMo13660n.getVisibility() == 8) {
                i6 = i5;
            } else {
                FlexItem flexItem = (FlexItem) viewMo13660n.getLayoutParams();
                int flexDirection = this.f11933a.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i11 = i5;
                    int measuredWidth = viewMo13660n.getMeasuredWidth();
                    long[] jArr = this.f11937e;
                    if (jArr != null) {
                        measuredWidth = m13791y(jArr[i10]);
                    }
                    int measuredHeight = viewMo13660n.getMeasuredHeight();
                    long[] jArr2 = this.f11937e;
                    i6 = i11;
                    if (jArr2 != null) {
                        measuredHeight = m13790x(jArr2[i10]);
                    }
                    if (!this.f11934b[i10] && flexItem.F0() > 0.0f) {
                        float fF0 = measuredWidth + (flexItem.F0() * f3);
                        if (i8 == c10897a.f11922h - 1) {
                            fF0 += f4;
                            f4 = 0.0f;
                        }
                        int iRound = Math.round(fF0);
                        if (iRound > flexItem.n1()) {
                            iRound = flexItem.n1();
                            this.f11934b[i10] = true;
                            c10897a.f11924j -= flexItem.F0();
                            z2 = true;
                        } else {
                            f4 += fF0 - iRound;
                            double d3 = f4;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            }
                            f4 = (float) d;
                        }
                        int iM13792z = m13792z(i2, flexItem, c10897a.f11927m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewMo13660n.measure(iMakeMeasureSpec, iM13792z);
                        int measuredWidth2 = viewMo13660n.getMeasuredWidth();
                        int measuredHeight2 = viewMo13660n.getMeasuredHeight();
                        m13766Z(i10, iMakeMeasureSpec, iM13792z, viewMo13660n);
                        this.f11933a.mo13661o(i10, viewMo13660n);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, measuredHeight + flexItem.r0() + flexItem.c2() + this.f11933a.mo13658l(viewMo13660n));
                    c10897a.f11919e += measuredWidth + flexItem.e2() + flexItem.O2();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMo13660n.getMeasuredHeight();
                    long[] jArr3 = this.f11937e;
                    if (jArr3 != null) {
                        measuredHeight3 = m13790x(jArr3[i10]);
                    }
                    int measuredWidth3 = viewMo13660n.getMeasuredWidth();
                    long[] jArr4 = this.f11937e;
                    if (jArr4 != null) {
                        measuredWidth3 = m13791y(jArr4[i10]);
                    }
                    if (this.f11934b[i10] || flexItem.F0() <= f2) {
                        i7 = i5;
                    } else {
                        float fF02 = measuredHeight3 + (flexItem.F0() * f3);
                        if (i8 == c10897a.f11922h - 1) {
                            fF02 += f4;
                            f4 = f2;
                        }
                        int iRound2 = Math.round(fF02);
                        if (iRound2 > flexItem.d3()) {
                            iRound2 = flexItem.d3();
                            this.f11934b[i10] = true;
                            c10897a.f11924j -= flexItem.F0();
                            i7 = i5;
                            z2 = true;
                        } else {
                            f4 += fF02 - iRound2;
                            i7 = i5;
                            double d4 = f4;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                iRound2--;
                                d2 = d4 + 1.0d;
                            }
                            f4 = (float) d2;
                        }
                        int iM13741A = m13741A(i, flexItem, c10897a.f11927m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewMo13660n.measure(iM13741A, iMakeMeasureSpec2);
                        measuredWidth3 = viewMo13660n.getMeasuredWidth();
                        int measuredHeight4 = viewMo13660n.getMeasuredHeight();
                        m13766Z(i10, iM13741A, iMakeMeasureSpec2, viewMo13660n);
                        this.f11933a.mo13661o(i10, viewMo13660n);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i9, measuredWidth3 + flexItem.e2() + flexItem.O2() + this.f11933a.mo13658l(viewMo13660n));
                    c10897a.f11919e += measuredHeight3 + flexItem.r0() + flexItem.c2();
                    i6 = i7;
                }
                c10897a.f11921g = Math.max(c10897a.f11921g, iMax);
                i9 = iMax;
            }
            i8++;
            i5 = i6;
            f2 = 0.0f;
        }
        int i12 = i5;
        if (!z2 || i12 == c10897a.f11919e) {
            return;
        }
        m13789w(i, i2, c10897a, i3, i4, true);
    }

    /* renamed from: x */
    public int m13790x(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: y */
    public int m13791y(long j) {
        return (int) j;
    }

    /* renamed from: z */
    public final int m13792z(int i, FlexItem flexItem, int i2) {
        n27 n27Var = this.f11933a;
        int iMo13655i = n27Var.mo13655i(i, n27Var.getPaddingTop() + this.f11933a.getPaddingBottom() + flexItem.r0() + flexItem.c2() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iMo13655i);
        return size > flexItem.d3() ? View.MeasureSpec.makeMeasureSpec(flexItem.d3(), View.MeasureSpec.getMode(iMo13655i)) : size < flexItem.R2() ? View.MeasureSpec.makeMeasureSpec(flexItem.R2(), View.MeasureSpec.getMode(iMo13655i)) : iMo13655i;
    }
}

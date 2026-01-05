package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p001o.cc;

/* loaded from: classes2.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public final SparseIntArray A0;
    public final SparseIntArray B0;
    public AbstractC2358b C0;
    public final Rect D0;
    public boolean E0;
    public boolean w0;
    public int x0;
    public int[] y0;
    public View[] z0;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C2357a extends AbstractC2358b {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC2358b
        /* renamed from: e */
        public int mo9019e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC2358b
        /* renamed from: f */
        public int mo9020f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static abstract class AbstractC2358b {

        /* renamed from: a */
        public final SparseIntArray f9732a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f9733b = new SparseIntArray();

        /* renamed from: c */
        public boolean f9734c = false;

        /* renamed from: d */
        public boolean f9735d = false;

        /* renamed from: a */
        public static int m9021a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* renamed from: b */
        public int m9022b(int i, int i2) {
            if (!this.f9735d) {
                return m9024d(i, i2);
            }
            int i3 = this.f9733b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iM9024d = m9024d(i, i2);
            this.f9733b.put(i, iM9024d);
            return iM9024d;
        }

        /* renamed from: c */
        public int m9023c(int i, int i2) {
            if (!this.f9734c) {
                return mo9019e(i, i2);
            }
            int i3 = this.f9732a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iMo9019e = mo9019e(i, i2);
            this.f9732a.put(i, iMo9019e);
            return iMo9019e;
        }

        /* renamed from: d */
        public int m9024d(int i, int i2) {
            int i3;
            int i4;
            int iM9023c;
            int iM9021a;
            if (!this.f9735d || (iM9021a = m9021a(this.f9733b, i)) == -1) {
                i3 = 0;
                i4 = 0;
                iM9023c = 0;
            } else {
                i3 = this.f9733b.get(iM9021a);
                i4 = iM9021a + 1;
                iM9023c = m9023c(iM9021a, i2) + mo9020f(iM9021a);
                if (iM9023c == i2) {
                    i3++;
                    iM9023c = 0;
                }
            }
            int iMo9020f = mo9020f(i);
            while (i4 < i) {
                int iMo9020f2 = mo9020f(i4);
                iM9023c += iMo9020f2;
                if (iM9023c == i2) {
                    i3++;
                    iM9023c = 0;
                } else if (iM9023c > i2) {
                    i3++;
                    iM9023c = iMo9020f2;
                }
                i4++;
            }
            return iM9023c + iMo9020f > i2 ? i3 + 1 : i3;
        }

        /* renamed from: e */
        public abstract int mo9019e(int i, int i2);

        /* renamed from: f */
        public abstract int mo9020f(int i);

        /* renamed from: g */
        public void m9025g() {
            this.f9733b.clear();
        }

        /* renamed from: h */
        public void m9026h() {
            this.f9732a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.w0 = false;
        this.x0 = -1;
        this.A0 = new SparseIntArray();
        this.B0 = new SparseIntArray();
        this.C0 = new C2357a();
        this.D0 = new Rect();
        p3(RecyclerView.AbstractC2379p.t0(context, attributeSet, i, i2).f9848b);
    }

    public static int[] b3(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: C */
    public boolean mo9009C(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void C2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, LinearLayoutManager.C2362c c2362c, LinearLayoutManager.C2361b c2361b) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iMo9629f;
        int iMo9629f2;
        int iMo9629f3;
        int i8;
        int iA0;
        int iA02;
        View viewM9050d;
        int iMo9636m = this.i0.mo9636m();
        boolean z = iMo9636m != 1073741824;
        int i9 = m9241Z() > 0 ? this.y0[this.x0] : 0;
        if (z) {
            q3();
        }
        boolean z2 = c2362c.f9753e == 1;
        int iK3 = this.x0;
        if (!z2) {
            iK3 = k3(c2385v, c2389z, c2362c.f9752d) + l3(c2385v, c2389z, c2362c.f9752d);
        }
        int i10 = 0;
        while (i10 < this.x0 && c2362c.m9049c(c2389z) && iK3 > 0) {
            int i11 = c2362c.f9752d;
            int iL3 = l3(c2385v, c2389z, i11);
            if (iL3 > this.x0) {
                throw new IllegalArgumentException("Item at position " + i11 + " requires " + iL3 + " spans but GridLayoutManager has only " + this.x0 + " spans.");
            }
            iK3 -= iL3;
            if (iK3 < 0 || (viewM9050d = c2362c.m9050d(c2385v)) == null) {
                break;
            }
            this.z0[i10] = viewM9050d;
            i10++;
        }
        if (i10 == 0) {
            c2361b.f9746b = true;
            return;
        }
        Y2(c2385v, c2389z, i10, z2);
        float f = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            View view = this.z0[i13];
            if (c2362c.f9760l == null) {
                if (z2) {
                    m9245t(view);
                } else {
                    m9246u(view, 0);
                }
            } else if (z2) {
                m9243r(view);
            } else {
                m9244s(view, 0);
            }
            m9250z(view, this.D0);
            n3(view, iMo9636m, false);
            int iMo9628e = this.i0.mo9628e(view);
            if (iMo9628e > i12) {
                i12 = iMo9628e;
            }
            float fMo9629f = (this.i0.mo9629f(view) * 1.0f) / ((LayoutParams) view.getLayoutParams()).f9731f;
            if (fMo9629f > f) {
                f = fMo9629f;
            }
        }
        if (z) {
            m3(f, i9);
            i12 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                View view2 = this.z0[i14];
                n3(view2, 1073741824, true);
                int iMo9628e2 = this.i0.mo9628e(view2);
                if (iMo9628e2 > i12) {
                    i12 = iMo9628e2;
                }
            }
        }
        for (int i15 = 0; i15 < i10; i15++) {
            View view3 = this.z0[i15];
            if (this.i0.mo9628e(view3) != i12) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f9779b;
                int i16 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i17 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int iH3 = h3(layoutParams.f9730e, layoutParams.f9731f);
                if (this.f9736Z == 1) {
                    iA02 = RecyclerView.AbstractC2379p.a0(iH3, 1073741824, i17, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
                    iA0 = View.MeasureSpec.makeMeasureSpec(i12 - i16, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - i17, 1073741824);
                    iA0 = RecyclerView.AbstractC2379p.a0(iH3, 1073741824, i16, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    iA02 = iMakeMeasureSpec;
                }
                o3(view3, iA02, iA0, true);
            }
        }
        c2361b.f9745a = i12;
        if (this.f9736Z == 1) {
            if (c2362c.f9754f == -1) {
                i6 = c2362c.f9750b;
                i8 = i6 - i12;
            } else {
                i8 = c2362c.f9750b;
                i6 = i8 + i12;
            }
            i4 = i8;
            i5 = 0;
            i3 = 0;
        } else {
            if (c2362c.f9754f == -1) {
                i2 = c2362c.f9750b;
                i = i2 - i12;
            } else {
                i = c2362c.f9750b;
                i2 = i + i12;
            }
            i3 = i;
            i4 = 0;
            i5 = i2;
            i6 = 0;
        }
        int i18 = 0;
        while (i18 < i10) {
            View view4 = this.z0[i18];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.f9736Z == 1) {
                if (A2()) {
                    int paddingLeft = getPaddingLeft() + this.y0[this.x0 - layoutParams2.f9730e];
                    iMo9629f3 = i6;
                    iMo9629f = paddingLeft;
                    iMo9629f2 = paddingLeft - this.i0.mo9629f(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.y0[layoutParams2.f9730e];
                    iMo9629f3 = i6;
                    iMo9629f2 = paddingLeft2;
                    iMo9629f = this.i0.mo9629f(view4) + paddingLeft2;
                }
                i7 = i4;
            } else {
                int paddingTop = getPaddingTop() + this.y0[layoutParams2.f9730e];
                i7 = paddingTop;
                iMo9629f = i5;
                iMo9629f2 = i3;
                iMo9629f3 = this.i0.mo9629f(view4) + paddingTop;
            }
            L0(view4, iMo9629f2, i7, iMo9629f, iMo9629f3);
            if (layoutParams2.m9106c() || layoutParams2.m9105b()) {
                c2361b.f9747c = true;
            }
            c2361b.f9748d |= view4.hasFocusable();
            i18++;
            i6 = iMo9629f3;
            i5 = iMo9629f;
            i3 = iMo9629f2;
            i4 = i7;
        }
        Arrays.fill(this.z0, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void E2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, LinearLayoutManager.C2360a c2360a, int i) {
        super.E2(c2385v, c2389z, c2360a, i);
        q3();
        if (c2389z.m9344b() > 0 && !c2389z.m9347e()) {
            f3(c2385v, c2389z, c2360a, i);
        }
        g3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: H */
    public int mo9010H(RecyclerView.C2389z c2389z) {
        return this.E0 ? d3(c2389z) : super.mo9010H(c2389z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: I */
    public int mo9011I(RecyclerView.C2389z c2389z) {
        return this.E0 ? e3(c2389z) : super.mo9011I(c2389z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public int J1(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        q3();
        g3();
        return super.J1(i, c2385v, c2389z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: K */
    public int mo9012K(RecyclerView.C2389z c2389z) {
        return this.E0 ? d3(c2389z) : super.mo9012K(c2389z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: L */
    public int mo9013L(RecyclerView.C2389z c2389z) {
        return this.E0 ? e3(c2389z) : super.mo9013L(c2389z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public int L1(int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        q3();
        g3();
        return super.L1(i, c2385v, c2389z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void P1(Rect rect, int i, int i2) {
        int iM9231D;
        int iM9231D2;
        if (this.y0 == null) {
            super.P1(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f9736Z == 1) {
            iM9231D2 = RecyclerView.AbstractC2379p.m9231D(i2, rect.height() + paddingTop, q0());
            int[] iArr = this.y0;
            iM9231D = RecyclerView.AbstractC2379p.m9231D(i, iArr[iArr.length - 1] + paddingLeft, r0());
        } else {
            iM9231D = RecyclerView.AbstractC2379p.m9231D(i, rect.width() + paddingLeft, r0());
            int[] iArr2 = this.y0;
            iM9231D2 = RecyclerView.AbstractC2379p.m9231D(i2, iArr2[iArr2.length - 1] + paddingTop, q0());
        }
        O1(iM9231D, iM9231D2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void P2(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.P2(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: T */
    public RecyclerView.LayoutParams mo9014T() {
        return this.f9736Z == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: U */
    public RecyclerView.LayoutParams mo9015U(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /* renamed from: V */
    public RecyclerView.LayoutParams mo9016V(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View V0(View view, int i, RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        int iM9241Z;
        int i2;
        int iM9241Z2;
        View view2;
        View view3;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        RecyclerView.C2385v c2385v2 = c2385v;
        RecyclerView.C2389z c2389z2 = c2389z;
        View viewM9237R = m9237R(view);
        View view4 = null;
        if (viewM9237R == null) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) viewM9237R.getLayoutParams();
        int i7 = layoutParams.f9730e;
        int i8 = layoutParams.f9731f + i7;
        if (super.V0(view, i, c2385v, c2389z) == null) {
            return null;
        }
        if ((e2(i) == 1) != this.l0) {
            iM9241Z2 = m9241Z() - 1;
            iM9241Z = -1;
            i2 = -1;
        } else {
            iM9241Z = m9241Z();
            i2 = 1;
            iM9241Z2 = 0;
        }
        boolean z2 = this.f9736Z == 1 && A2();
        int iJ3 = j3(c2385v2, c2389z2, iM9241Z2);
        int i9 = -1;
        int i10 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i11 = iM9241Z2;
        View view5 = null;
        while (i11 != iM9241Z) {
            int iJ32 = j3(c2385v2, c2389z2, i11);
            View viewM9240Y = m9240Y(i11);
            if (viewM9240Y == viewM9237R) {
                break;
            }
            if (!viewM9240Y.hasFocusable() || iJ32 == iJ3) {
                LayoutParams layoutParams2 = (LayoutParams) viewM9240Y.getLayoutParams();
                int i12 = layoutParams2.f9730e;
                view2 = viewM9237R;
                int i13 = layoutParams2.f9731f + i12;
                if (viewM9240Y.hasFocusable() && i12 == i7 && i13 == i8) {
                    return viewM9240Y;
                }
                if (!(viewM9240Y.hasFocusable() && view4 == null) && (viewM9240Y.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i13, i8) - Math.max(i12, i7);
                    if (!viewM9240Y.hasFocusable()) {
                        if (view4 == null) {
                            i3 = iMin;
                            i4 = iM9241Z;
                            if (K0(viewM9240Y, false, true)) {
                                i5 = iMin2;
                                if (iMin3 > i5) {
                                    i6 = i10;
                                    if (!z) {
                                        if (viewM9240Y.hasFocusable()) {
                                            i9 = layoutParams2.f9730e;
                                            i10 = i6;
                                            iMin2 = i5;
                                            view5 = view3;
                                            view4 = viewM9240Y;
                                            iMin = Math.min(i13, i8) - Math.max(i12, i7);
                                        } else {
                                            int i14 = layoutParams2.f9730e;
                                            iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                                            i10 = i14;
                                            iMin = i3;
                                            view5 = viewM9240Y;
                                        }
                                    }
                                    i11 += i2;
                                    c2385v2 = c2385v;
                                    c2389z2 = c2389z;
                                    viewM9237R = view2;
                                    iM9241Z = i4;
                                } else if (iMin3 == i5) {
                                    i6 = i10;
                                    if (z2 == (i12 > i6)) {
                                        z = true;
                                    }
                                    if (!z) {
                                    }
                                    i11 += i2;
                                    c2385v2 = c2385v;
                                    c2389z2 = c2389z;
                                    viewM9237R = view2;
                                    iM9241Z = i4;
                                } else {
                                    i6 = i10;
                                }
                            }
                            z = false;
                            if (!z) {
                            }
                            i11 += i2;
                            c2385v2 = c2385v;
                            c2389z2 = c2389z;
                            viewM9237R = view2;
                            iM9241Z = i4;
                        }
                        i6 = i10;
                        i5 = iMin2;
                        z = false;
                        if (!z) {
                        }
                        i11 += i2;
                        c2385v2 = c2385v;
                        c2389z2 = c2389z;
                        viewM9237R = view2;
                        iM9241Z = i4;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                    i3 = iMin;
                    i4 = iM9241Z;
                    i6 = i10;
                    i5 = iMin2;
                    z = false;
                    if (!z) {
                    }
                    i11 += i2;
                    c2385v2 = c2385v;
                    c2389z2 = c2389z;
                    viewM9237R = view2;
                    iM9241Z = i4;
                } else {
                    view3 = view5;
                }
                i3 = iMin;
                i4 = iM9241Z;
                i6 = i10;
                i5 = iMin2;
                z = true;
                if (!z) {
                }
                i11 += i2;
                c2385v2 = c2385v;
                c2389z2 = c2389z;
                viewM9237R = view2;
                iM9241Z = i4;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = viewM9237R;
                view3 = view5;
                i3 = iMin;
                i4 = iM9241Z;
                i6 = i10;
                i5 = iMin2;
            }
            i10 = i6;
            iMin2 = i5;
            iMin = i3;
            view5 = view3;
            i11 += i2;
            c2385v2 = c2385v;
            c2389z2 = c2389z;
            viewM9237R = view2;
            iM9241Z = i4;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void Y0(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, cc ccVar) {
        super.Y0(c2385v, c2389z, ccVar);
        ccVar.o0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public boolean Y1() {
        return this.r0 == null && !this.w0;
    }

    public final void Y2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.z0[i2];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int iL3 = l3(c2385v, c2389z, s0(view));
            layoutParams.f9731f = iL3;
            layoutParams.f9730e = i5;
            i5 += iL3;
            i2 += i4;
        }
    }

    public final void Z2() {
        int iM9241Z = m9241Z();
        for (int i = 0; i < iM9241Z; i++) {
            LayoutParams layoutParams = (LayoutParams) m9240Y(i).getLayoutParams();
            int iM9104a = layoutParams.m9104a();
            this.A0.put(iM9104a, layoutParams.m9018f());
            this.B0.put(iM9104a, layoutParams.m9017e());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void a2(RecyclerView.C2389z c2389z, LinearLayoutManager.C2362c c2362c, RecyclerView.AbstractC2379p.c cVar) {
        int iMo9020f = this.x0;
        for (int i = 0; i < this.x0 && c2362c.m9049c(c2389z) && iMo9020f > 0; i++) {
            int i2 = c2362c.f9752d;
            cVar.mo9256a(i2, Math.max(0, c2362c.f9755g));
            iMo9020f -= this.C0.mo9020f(i2);
            c2362c.f9752d += c2362c.f9753e;
        }
    }

    public final void a3(int i) {
        this.y0 = b3(this.y0, this.x0, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void b1(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, View view, cc ccVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.a1(view, ccVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iJ3 = j3(c2385v, c2389z, layoutParams2.m9104a());
        if (this.f9736Z == 0) {
            ccVar.r0(cc.C12629f.m20832a(layoutParams2.m9017e(), layoutParams2.m9018f(), iJ3, 1, false, false));
        } else {
            ccVar.r0(cc.C12629f.m20832a(iJ3, 1, layoutParams2.m9017e(), layoutParams2.m9018f(), false, false));
        }
    }

    public final void c3() {
        this.A0.clear();
        this.B0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public int d0(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (this.f9736Z == 1) {
            return this.x0;
        }
        if (c2389z.m9344b() < 1) {
            return 0;
        }
        return j3(c2385v, c2389z, c2389z.m9344b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void d1(RecyclerView recyclerView, int i, int i2) {
        this.C0.m9026h();
        this.C0.m9025g();
    }

    public final int d3(RecyclerView.C2389z c2389z) {
        if (m9241Z() != 0 && c2389z.m9344b() != 0) {
            g2();
            boolean zB2 = B2();
            View viewK2 = k2(!zB2, true);
            View viewJ2 = j2(!zB2, true);
            if (viewK2 != null && viewJ2 != null) {
                int iM9022b = this.C0.m9022b(s0(viewK2), this.x0);
                int iM9022b2 = this.C0.m9022b(s0(viewJ2), this.x0);
                int iMax = this.l0 ? Math.max(0, ((this.C0.m9022b(c2389z.m9344b() - 1, this.x0) + 1) - Math.max(iM9022b, iM9022b2)) - 1) : Math.max(0, Math.min(iM9022b, iM9022b2));
                if (zB2) {
                    return Math.round((iMax * (Math.abs(this.i0.mo9627d(viewJ2) - this.i0.mo9630g(viewK2)) / ((this.C0.m9022b(s0(viewJ2), this.x0) - this.C0.m9022b(s0(viewK2), this.x0)) + 1))) + (this.i0.mo9637n() - this.i0.mo9630g(viewK2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void e1(RecyclerView recyclerView) {
        this.C0.m9026h();
        this.C0.m9025g();
    }

    public final int e3(RecyclerView.C2389z c2389z) {
        if (m9241Z() != 0 && c2389z.m9344b() != 0) {
            g2();
            View viewK2 = k2(!B2(), true);
            View viewJ2 = j2(!B2(), true);
            if (viewK2 != null && viewJ2 != null) {
                if (!B2()) {
                    return this.C0.m9022b(c2389z.m9344b() - 1, this.x0) + 1;
                }
                int iMo9627d = this.i0.mo9627d(viewJ2) - this.i0.mo9630g(viewK2);
                int iM9022b = this.C0.m9022b(s0(viewK2), this.x0);
                return (int) ((iMo9627d / ((this.C0.m9022b(s0(viewJ2), this.x0) - iM9022b) + 1)) * (this.C0.m9022b(c2389z.m9344b() - 1, this.x0) + 1));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void f1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.C0.m9026h();
        this.C0.m9025g();
    }

    public final void f3(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, LinearLayoutManager.C2360a c2360a, int i) {
        boolean z = i == 1;
        int iK3 = k3(c2385v, c2389z, c2360a.f9741b);
        if (z) {
            while (iK3 > 0) {
                int i2 = c2360a.f9741b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                c2360a.f9741b = i3;
                iK3 = k3(c2385v, c2389z, i3);
            }
            return;
        }
        int iM9344b = c2389z.m9344b() - 1;
        int i4 = c2360a.f9741b;
        while (i4 < iM9344b) {
            int i5 = i4 + 1;
            int iK32 = k3(c2385v, c2389z, i5);
            if (iK32 <= iK3) {
                break;
            }
            i4 = i5;
            iK3 = iK32;
        }
        c2360a.f9741b = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void g1(RecyclerView recyclerView, int i, int i2) {
        this.C0.m9026h();
        this.C0.m9025g();
    }

    public final void g3() {
        View[] viewArr = this.z0;
        if (viewArr == null || viewArr.length != this.x0) {
            this.z0 = new View[this.x0];
        }
    }

    public int h3(int i, int i2) {
        if (this.f9736Z != 1 || !A2()) {
            int[] iArr = this.y0;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.y0;
        int i3 = this.x0;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void i1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.C0.m9026h();
        this.C0.m9025g();
    }

    public int i3() {
        return this.x0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void j1(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (c2389z.m9347e()) {
            Z2();
        }
        super.j1(c2385v, c2389z);
        c3();
    }

    public final int j3(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, int i) {
        if (!c2389z.m9347e()) {
            return this.C0.m9022b(i, this.x0);
        }
        int iM9298f = c2385v.m9298f(i);
        if (iM9298f != -1) {
            return this.C0.m9022b(iM9298f, this.x0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public void k1(RecyclerView.C2389z c2389z) {
        super.k1(c2389z);
        this.w0 = false;
    }

    public final int k3(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, int i) {
        if (!c2389z.m9347e()) {
            return this.C0.m9023c(i, this.x0);
        }
        int i2 = this.B0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM9298f = c2385v.m9298f(i);
        if (iM9298f != -1) {
            return this.C0.m9023c(iM9298f, this.x0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        return 0;
    }

    public final int l3(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, int i) {
        if (!c2389z.m9347e()) {
            return this.C0.mo9020f(i);
        }
        int i2 = this.A0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM9298f = c2385v.m9298f(i);
        if (iM9298f != -1) {
            return this.C0.mo9020f(iM9298f);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        return 1;
    }

    public final void m3(float f, int i) {
        a3(Math.max(Math.round(f * this.x0), i));
    }

    public final void n3(View view, int i, boolean z) {
        int iA0;
        int iA02;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f9779b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iH3 = h3(layoutParams.f9730e, layoutParams.f9731f);
        if (this.f9736Z == 1) {
            iA02 = RecyclerView.AbstractC2379p.a0(iH3, i, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            iA0 = RecyclerView.AbstractC2379p.a0(this.i0.mo9638o(), n0(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int iA03 = RecyclerView.AbstractC2379p.a0(iH3, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int iA04 = RecyclerView.AbstractC2379p.a0(this.i0.mo9638o(), A0(), i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            iA0 = iA03;
            iA02 = iA04;
        }
        o3(view, iA02, iA0, z);
    }

    public final void o3(View view, int i, int i2, boolean z) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? U1(view, i, i2, layoutParams) : S1(view, i, i2, layoutParams)) {
            view.measure(i, i2);
        }
    }

    public void p3(int i) {
        if (i == this.x0) {
            return;
        }
        this.w0 = true;
        if (i >= 1) {
            this.x0 = i;
            this.C0.m9026h();
            G1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    public final void q3() {
        int iM0;
        int paddingTop;
        if (y2() == 1) {
            iM0 = z0() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            iM0 = m0() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        a3(iM0 - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View s2(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z, boolean z, boolean z2) {
        int i;
        int iM9241Z;
        int iM9241Z2 = m9241Z();
        int i2 = 1;
        if (z2) {
            iM9241Z = m9241Z() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM9241Z2;
            iM9241Z = 0;
        }
        int iM9344b = c2389z.m9344b();
        g2();
        int iMo9637n = this.i0.mo9637n();
        int iMo9632i = this.i0.mo9632i();
        View view = null;
        View view2 = null;
        while (iM9241Z != i) {
            View viewM9240Y = m9240Y(iM9241Z);
            int iS0 = s0(viewM9240Y);
            if (iS0 >= 0 && iS0 < iM9344b && k3(c2385v, c2389z, iS0) == 0) {
                if (((RecyclerView.LayoutParams) viewM9240Y.getLayoutParams()).m9106c()) {
                    if (view2 == null) {
                        view2 = viewM9240Y;
                    }
                } else {
                    if (this.i0.mo9630g(viewM9240Y) < iMo9632i && this.i0.mo9627d(viewM9240Y) >= iMo9637n) {
                        return viewM9240Y;
                    }
                    if (view == null) {
                        view = viewM9240Y;
                    }
                }
            }
            iM9241Z += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p
    public int v0(RecyclerView.C2385v c2385v, RecyclerView.C2389z c2389z) {
        if (this.f9736Z == 0) {
            return this.x0;
        }
        if (c2389z.m9344b() < 1) {
            return 0;
        }
        return j3(c2385v, c2389z, c2389z.m9344b() - 1) + 1;
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e */
        public int f9730e;

        /* renamed from: f */
        public int f9731f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9730e = -1;
            this.f9731f = 0;
        }

        /* renamed from: e */
        public int m9017e() {
            return this.f9730e;
        }

        /* renamed from: f */
        public int m9018f() {
            return this.f9731f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f9730e = -1;
            this.f9731f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9730e = -1;
            this.f9731f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9730e = -1;
            this.f9731f = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.w0 = false;
        this.x0 = -1;
        this.A0 = new SparseIntArray();
        this.B0 = new SparseIntArray();
        this.C0 = new C2357a();
        this.D0 = new Rect();
        p3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.w0 = false;
        this.x0 = -1;
        this.A0 = new SparseIntArray();
        this.B0 = new SparseIntArray();
        this.C0 = new C2357a();
        this.D0 = new Rect();
        p3(i);
    }
}

package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import p001o.mbe;

/* loaded from: classes2.dex */
public class Grid extends VirtualLayout {

    /* renamed from: H */
    public final int f6574H;

    /* renamed from: L */
    public View[] f6575L;

    /* renamed from: M */
    public ConstraintLayout f6576M;

    /* renamed from: Q */
    public int f6577Q;
    public int h0;
    public int i0;
    public int j0;
    public String k0;
    public String l0;
    public String m0;
    public String n0;
    public float o0;
    public float p0;
    public int q0;
    public int r0;
    public boolean s0;
    public boolean t0;
    public boolean[][] u0;
    public Set v0;
    public int[] w0;

    /* renamed from: y */
    public final int f6578y;

    public Grid(Context context) {
        super(context);
        this.f6578y = 50;
        this.f6574H = 50;
        this.r0 = 0;
        this.v0 = new HashSet();
    }

    private int getNextPosition() {
        boolean z = false;
        int i = 0;
        while (!z) {
            i = this.r0;
            if (i >= this.f6577Q * this.i0) {
                return -1;
            }
            int iM5317F = m5317F(i);
            int iM5316E = m5316E(this.r0);
            boolean[] zArr = this.u0[iM5317F];
            if (zArr[iM5316E]) {
                zArr[iM5316E] = false;
                z = true;
            }
            this.r0++;
        }
        return i;
    }

    /* renamed from: A */
    public final void m5312A(View view) {
        ConstraintLayout.LayoutParams layoutParamsM5325N = m5325N(view);
        layoutParamsM5325N.f6886L = -1.0f;
        layoutParamsM5325N.f6906f = -1;
        layoutParamsM5325N.f6905e = -1;
        layoutParamsM5325N.f6907g = -1;
        layoutParamsM5325N.f6908h = -1;
        ((ViewGroup.MarginLayoutParams) layoutParamsM5325N).leftMargin = -1;
        view.setLayoutParams(layoutParamsM5325N);
    }

    /* renamed from: B */
    public final void m5313B(View view) {
        ConstraintLayout.LayoutParams layoutParamsM5325N = m5325N(view);
        layoutParamsM5325N.f6887M = -1.0f;
        layoutParamsM5325N.f6910j = -1;
        layoutParamsM5325N.f6909i = -1;
        layoutParamsM5325N.f6911k = -1;
        layoutParamsM5325N.f6912l = -1;
        ((ViewGroup.MarginLayoutParams) layoutParamsM5325N).topMargin = -1;
        view.setLayoutParams(layoutParamsM5325N);
    }

    /* renamed from: C */
    public final void m5314C(View view, int i, int i2, int i3, int i4) {
        ConstraintLayout.LayoutParams layoutParamsM5325N = m5325N(view);
        int[] iArr = this.w0;
        layoutParamsM5325N.f6905e = iArr[i2];
        layoutParamsM5325N.f6909i = iArr[i];
        layoutParamsM5325N.f6908h = iArr[(i2 + i4) - 1];
        layoutParamsM5325N.f6912l = iArr[(i + i3) - 1];
        view.setLayoutParams(layoutParamsM5325N);
    }

    /* renamed from: D */
    public final boolean m5315D(boolean z) {
        int[][] iArrM5326O;
        int[][] iArrM5326O2;
        if (this.f6576M == null || this.f6577Q < 1 || this.i0 < 1) {
            return false;
        }
        if (z) {
            for (int i = 0; i < this.u0.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr = this.u0;
                    if (i2 < zArr[0].length) {
                        zArr[i][i2] = true;
                        i2++;
                    }
                }
            }
            this.v0.clear();
        }
        this.r0 = 0;
        m5332z();
        String str = this.l0;
        boolean zM5318G = (str == null || str.trim().isEmpty() || (iArrM5326O2 = m5326O(this.l0)) == null) ? true : m5318G(iArrM5326O2) & true;
        String str2 = this.k0;
        if (str2 != null && !str2.trim().isEmpty() && (iArrM5326O = m5326O(this.k0)) != null) {
            zM5318G &= m5319H(this.f6850a, iArrM5326O);
        }
        return (zM5318G && m5331y()) || !this.s0;
    }

    /* renamed from: E */
    public final int m5316E(int i) {
        return this.q0 == 1 ? i / this.f6577Q : i % this.i0;
    }

    /* renamed from: F */
    public final int m5317F(int i) {
        return this.q0 == 1 ? i % this.f6577Q : i / this.i0;
    }

    /* renamed from: G */
    public final boolean m5318G(int[][] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int iM5317F = m5317F(iArr[i][0]);
            int iM5316E = m5316E(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!m5321J(iM5317F, iM5316E, iArr2[1], iArr2[2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m5319H(int[] iArr, int[][] iArr2) {
        View[] viewArrM5598n = m5598n(this.f6576M);
        for (int i = 0; i < iArr2.length; i++) {
            int iM5317F = m5317F(iArr2[i][0]);
            int iM5316E = m5316E(iArr2[i][0]);
            int[] iArr3 = iArr2[i];
            if (!m5321J(iM5317F, iM5316E, iArr3[1], iArr3[2])) {
                return false;
            }
            View view = viewArrM5598n[i];
            int[] iArr4 = iArr2[i];
            m5314C(view, iM5317F, iM5316E, iArr4[1], iArr4[2]);
            this.v0.add(Integer.valueOf(iArr[i]));
        }
        return true;
    }

    /* renamed from: I */
    public final void m5320I() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f6577Q, this.i0);
        this.u0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    /* renamed from: J */
    public final boolean m5321J(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.u0;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: K */
    public final boolean m5322K(CharSequence charSequence) {
        return true;
    }

    /* renamed from: L */
    public final boolean m5323L(String str) {
        return true;
    }

    /* renamed from: M */
    public final View m5324M() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.f6576M.addView(view, new ConstraintLayout.LayoutParams(0, 0));
        return view;
    }

    /* renamed from: N */
    public final ConstraintLayout.LayoutParams m5325N(View view) {
        return (ConstraintLayout.LayoutParams) view.getLayoutParams();
    }

    /* renamed from: O */
    public final int[][] m5326O(String str) {
        if (!m5322K(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    /* renamed from: P */
    public final float[] m5327P(int i, String str) {
        float[] fArr = null;
        if (str != null && !str.trim().isEmpty()) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length != i) {
                return null;
            }
            fArr = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr[i2] = Float.parseFloat(strArrSplit[i2].trim());
            }
        }
        return fArr;
    }

    /* renamed from: Q */
    public final void m5328Q() {
        int i;
        int id = getId();
        int iMax = Math.max(this.f6577Q, this.i0);
        float[] fArrM5327P = m5327P(this.i0, this.n0);
        int i2 = 0;
        ConstraintLayout.LayoutParams layoutParamsM5325N = m5325N(this.f6575L[0]);
        if (this.i0 == 1) {
            m5312A(this.f6575L[0]);
            layoutParamsM5325N.f6905e = id;
            layoutParamsM5325N.f6908h = id;
            this.f6575L[0].setLayoutParams(layoutParamsM5325N);
            return;
        }
        while (true) {
            i = this.i0;
            if (i2 >= i) {
                break;
            }
            ConstraintLayout.LayoutParams layoutParamsM5325N2 = m5325N(this.f6575L[i2]);
            m5312A(this.f6575L[i2]);
            if (fArrM5327P != null) {
                layoutParamsM5325N2.f6886L = fArrM5327P[i2];
            }
            if (i2 > 0) {
                layoutParamsM5325N2.f6906f = this.w0[i2 - 1];
            } else {
                layoutParamsM5325N2.f6905e = id;
            }
            if (i2 < this.i0 - 1) {
                layoutParamsM5325N2.f6907g = this.w0[i2 + 1];
            } else {
                layoutParamsM5325N2.f6908h = id;
            }
            if (i2 > 0) {
                ((ViewGroup.MarginLayoutParams) layoutParamsM5325N2).leftMargin = (int) this.o0;
            }
            this.f6575L[i2].setLayoutParams(layoutParamsM5325N2);
            i2++;
        }
        while (i < iMax) {
            ConstraintLayout.LayoutParams layoutParamsM5325N3 = m5325N(this.f6575L[i]);
            m5312A(this.f6575L[i]);
            layoutParamsM5325N3.f6905e = id;
            layoutParamsM5325N3.f6908h = id;
            this.f6575L[i].setLayoutParams(layoutParamsM5325N3);
            i++;
        }
    }

    /* renamed from: R */
    public final void m5329R() {
        int i;
        int id = getId();
        int iMax = Math.max(this.f6577Q, this.i0);
        float[] fArrM5327P = m5327P(this.f6577Q, this.m0);
        int i2 = 0;
        if (this.f6577Q == 1) {
            ConstraintLayout.LayoutParams layoutParamsM5325N = m5325N(this.f6575L[0]);
            m5313B(this.f6575L[0]);
            layoutParamsM5325N.f6909i = id;
            layoutParamsM5325N.f6912l = id;
            this.f6575L[0].setLayoutParams(layoutParamsM5325N);
            return;
        }
        while (true) {
            i = this.f6577Q;
            if (i2 >= i) {
                break;
            }
            ConstraintLayout.LayoutParams layoutParamsM5325N2 = m5325N(this.f6575L[i2]);
            m5313B(this.f6575L[i2]);
            if (fArrM5327P != null) {
                layoutParamsM5325N2.f6887M = fArrM5327P[i2];
            }
            if (i2 > 0) {
                layoutParamsM5325N2.f6910j = this.w0[i2 - 1];
            } else {
                layoutParamsM5325N2.f6909i = id;
            }
            if (i2 < this.f6577Q - 1) {
                layoutParamsM5325N2.f6911k = this.w0[i2 + 1];
            } else {
                layoutParamsM5325N2.f6912l = id;
            }
            if (i2 > 0) {
                ((ViewGroup.MarginLayoutParams) layoutParamsM5325N2).topMargin = (int) this.o0;
            }
            this.f6575L[i2].setLayoutParams(layoutParamsM5325N2);
            i2++;
        }
        while (i < iMax) {
            ConstraintLayout.LayoutParams layoutParamsM5325N3 = m5325N(this.f6575L[i]);
            m5313B(this.f6575L[i]);
            layoutParamsM5325N3.f6909i = id;
            layoutParamsM5325N3.f6912l = id;
            this.f6575L[i].setLayoutParams(layoutParamsM5325N3);
            i++;
        }
    }

    /* renamed from: S */
    public final void m5330S() {
        int i;
        int i2 = this.h0;
        if (i2 != 0 && (i = this.j0) != 0) {
            this.f6577Q = i2;
            this.i0 = i;
            return;
        }
        int i3 = this.j0;
        if (i3 > 0) {
            this.i0 = i3;
            this.f6577Q = ((this.f6851b + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.f6577Q = i2;
            this.i0 = ((this.f6851b + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f6851b) + 1.5d);
            this.f6577Q = iSqrt;
            this.i0 = ((this.f6851b + iSqrt) - 1) / iSqrt;
        }
    }

    public String getColumnWeights() {
        return this.n0;
    }

    public int getColumns() {
        return this.j0;
    }

    public float getHorizontalGaps() {
        return this.o0;
    }

    public int getOrientation() {
        return this.q0;
    }

    public String getRowWeights() {
        return this.m0;
    }

    public int getRows() {
        return this.h0;
    }

    public String getSkips() {
        return this.l0;
    }

    public String getSpans() {
        return this.k0;
    }

    public float getVerticalGaps() {
        return this.p0;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: o */
    public void mo5306o(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.mo5306o(attributeSet);
        this.f6854e = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.Grid);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == mbe.Grid_grid_rows) {
                    this.h0 = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == mbe.Grid_grid_columns) {
                    this.j0 = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == mbe.Grid_grid_spans) {
                    this.k0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == mbe.Grid_grid_skips) {
                    this.l0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == mbe.Grid_grid_rowWeights) {
                    this.m0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == mbe.Grid_grid_columnWeights) {
                    this.n0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == mbe.Grid_grid_orientation) {
                    this.q0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == mbe.Grid_grid_horizontalGaps) {
                    this.o0 = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == mbe.Grid_grid_verticalGaps) {
                    this.p0 = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == mbe.Grid_grid_validateInputs) {
                    this.s0 = typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == mbe.Grid_grid_useRtl) {
                    this.t0 = typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            m5330S();
            m5320I();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        this.f6576M = (ConstraintLayout) getParent();
        m5315D(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(Opcodes.V_PREVIEW);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            View[] viewArr = this.f6575L;
            int length = viewArr.length;
            int i = 0;
            while (i < length) {
                View view = viewArr[i];
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                canvas.drawRect(left2, 0.0f, right2, bottom - top, paint);
                canvas.drawRect(0.0f, top2, right - left, bottom2, paint);
                i++;
                top = top;
            }
        }
    }

    public void setColumnWeights(String str) {
        if (m5323L(str)) {
            String str2 = this.n0;
            if (str2 == null || !str2.equals(str)) {
                this.n0 = str;
                m5315D(true);
                invalidate();
            }
        }
    }

    public void setColumns(int i) {
        if (i <= 50 && this.j0 != i) {
            this.j0 = i;
            m5330S();
            m5320I();
            m5315D(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f) {
        if (f >= 0.0f && this.o0 != f) {
            this.o0 = f;
            m5315D(true);
            invalidate();
        }
    }

    public void setOrientation(int i) {
        if ((i == 0 || i == 1) && this.q0 != i) {
            this.q0 = i;
            m5315D(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        if (m5323L(str)) {
            String str2 = this.m0;
            if (str2 == null || !str2.equals(str)) {
                this.m0 = str;
                m5315D(true);
                invalidate();
            }
        }
    }

    public void setRows(int i) {
        if (i <= 50 && this.h0 != i) {
            this.h0 = i;
            m5330S();
            m5320I();
            m5315D(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        if (m5322K(str)) {
            String str2 = this.l0;
            if (str2 == null || !str2.equals(str)) {
                this.l0 = str;
                m5315D(true);
                invalidate();
            }
        }
    }

    public void setSpans(CharSequence charSequence) {
        if (m5322K(charSequence)) {
            String str = this.k0;
            if (str == null || !str.contentEquals(charSequence)) {
                this.k0 = charSequence.toString();
                m5315D(true);
                invalidate();
            }
        }
    }

    public void setVerticalGaps(float f) {
        if (f >= 0.0f && this.p0 != f) {
            this.p0 = f;
            m5315D(true);
            invalidate();
        }
    }

    /* renamed from: y */
    public final boolean m5331y() {
        View[] viewArrM5598n = m5598n(this.f6576M);
        for (int i = 0; i < this.f6851b; i++) {
            if (!this.v0.contains(Integer.valueOf(this.f6850a[i]))) {
                int nextPosition = getNextPosition();
                int iM5317F = m5317F(nextPosition);
                int iM5316E = m5316E(nextPosition);
                if (nextPosition == -1) {
                    return false;
                }
                m5314C(viewArrM5598n[i], iM5317F, iM5316E, 1, 1);
            }
        }
        return true;
    }

    /* renamed from: z */
    public final void m5332z() {
        int iMax = Math.max(this.f6577Q, this.i0);
        View[] viewArr = this.f6575L;
        int i = 0;
        if (viewArr == null) {
            this.f6575L = new View[iMax];
            int i2 = 0;
            while (true) {
                View[] viewArr2 = this.f6575L;
                if (i2 >= viewArr2.length) {
                    break;
                }
                viewArr2[i2] = m5324M();
                i2++;
            }
        } else if (iMax != viewArr.length) {
            View[] viewArr3 = new View[iMax];
            for (int i3 = 0; i3 < iMax; i3++) {
                View[] viewArr4 = this.f6575L;
                if (i3 < viewArr4.length) {
                    viewArr3[i3] = viewArr4[i3];
                } else {
                    viewArr3[i3] = m5324M();
                }
            }
            int i4 = iMax;
            while (true) {
                View[] viewArr5 = this.f6575L;
                if (i4 >= viewArr5.length) {
                    break;
                }
                this.f6576M.removeView(viewArr5[i4]);
                i4++;
            }
            this.f6575L = viewArr3;
        }
        this.w0 = new int[iMax];
        while (true) {
            View[] viewArr6 = this.f6575L;
            if (i >= viewArr6.length) {
                m5329R();
                m5328Q();
                return;
            } else {
                this.w0[i] = viewArr6[i].getId();
                i++;
            }
        }
    }

    public Grid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6578y = 50;
        this.f6574H = 50;
        this.r0 = 0;
        this.v0 = new HashSet();
    }

    public Grid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6578y = 50;
        this.f6574H = 50;
        this.r0 = 0;
        this.v0 = new HashSet();
    }
}

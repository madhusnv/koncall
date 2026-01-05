package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import com.google.api.Service;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import org.xmlpull.v1.XmlPullParserException;
import p001o.au3;
import p001o.cu3;
import p001o.lec;
import p001o.mbe;
import p001o.meb;
import p001o.rf1;
import p001o.rv7;
import p001o.tq;
import p001o.tt3;
import p001o.um5;
import p001o.vt3;
import p001o.wm5;
import p001o.x0j;
import p001o.zt3;

/* loaded from: classes2.dex */
public class ConstraintLayout extends ViewGroup {
    public static C2006c p0;

    /* renamed from: H */
    public HashMap f6859H;

    /* renamed from: L */
    public int f6860L;

    /* renamed from: M */
    public int f6861M;

    /* renamed from: Q */
    public int f6862Q;

    /* renamed from: a */
    public SparseArray f6863a;

    /* renamed from: b */
    public ArrayList f6864b;

    /* renamed from: c */
    public au3 f6865c;

    /* renamed from: d */
    public int f6866d;

    /* renamed from: e */
    public int f6867e;

    /* renamed from: f */
    public int f6868f;

    /* renamed from: g */
    public int f6869g;

    /* renamed from: h */
    public boolean f6870h;
    public int h0;
    public int i0;
    public int j0;
    public SparseArray k0;
    public C2003b l0;
    public int m0;
    public int n0;
    public ArrayList o0;

    /* renamed from: q */
    public int f6871q;

    /* renamed from: s */
    public C2005b f6872s;

    /* renamed from: x */
    public vt3 f6873x;

    /* renamed from: y */
    public int f6874y;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static /* synthetic */ class C2002a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6928a;

        static {
            int[] iArr = new int[zt3.EnumC18702b.values().length];
            f6928a = iArr;
            try {
                iArr[zt3.EnumC18702b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6928a[zt3.EnumC18702b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6928a[zt3.EnumC18702b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6928a[zt3.EnumC18702b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public class C2003b implements rf1.InterfaceC16599b {

        /* renamed from: a */
        public ConstraintLayout f6929a;

        /* renamed from: b */
        public int f6930b;

        /* renamed from: c */
        public int f6931c;

        /* renamed from: d */
        public int f6932d;

        /* renamed from: e */
        public int f6933e;

        /* renamed from: f */
        public int f6934f;

        /* renamed from: g */
        public int f6935g;

        public C2003b(ConstraintLayout constraintLayout) {
            this.f6929a = constraintLayout;
        }

        @Override // p001o.rf1.InterfaceC16599b
        /* renamed from: a */
        public final void mo5625a() {
            int childCount = this.f6929a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f6929a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).m5633b(this.f6929a);
                }
            }
            int size = this.f6929a.f6864b.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.f6929a.f6864b.get(i2)).m5599s(this.f6929a);
                }
            }
        }

        @Override // p001o.rf1.InterfaceC16599b
        /* renamed from: b */
        public final void mo5626b(zt3 zt3Var, rf1.C16598a c16598a) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int i;
            int measuredHeight;
            int i2;
            if (zt3Var == null) {
                return;
            }
            if (zt3Var.m59845X() == 8 && !zt3Var.l0()) {
                c16598a.f43474e = 0;
                c16598a.f43475f = 0;
                c16598a.f43476g = 0;
                return;
            }
            if (zt3Var.m59835M() == null) {
                return;
            }
            ConstraintLayout.m5602a(ConstraintLayout.this);
            zt3.EnumC18702b enumC18702b = c16598a.f43470a;
            zt3.EnumC18702b enumC18702b2 = c16598a.f43471b;
            int i3 = c16598a.f43472c;
            int i4 = c16598a.f43473d;
            int i5 = this.f6930b + this.f6931c;
            int i6 = this.f6932d;
            View view = (View) zt3Var.m59861u();
            int[] iArr = C2002a.f6928a;
            int i7 = iArr[enumC18702b.ordinal()];
            if (i7 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (i7 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6934f, i6, -2);
            } else if (i7 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6934f, i6 + zt3Var.m59826D(), -1);
            } else if (i7 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6934f, i6, -2);
                boolean z = zt3Var.f57663w == 1;
                int i8 = c16598a.f43479j;
                if (i8 == rf1.C16598a.f43468l || i8 == rf1.C16598a.f43469m) {
                    if (c16598a.f43479j == rf1.C16598a.f43469m || !z || (z && (view.getMeasuredHeight() == zt3Var.m59866z())) || (view instanceof Placeholder) || zt3Var.p0()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(zt3Var.m59846Y(), 1073741824);
                    }
                }
            }
            int i9 = iArr[enumC18702b2.ordinal()];
            if (i9 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (i9 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f6935g, i5, -2);
            } else if (i9 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f6935g, i5 + zt3Var.m59844W(), -1);
            } else if (i9 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f6935g, i5, -2);
                boolean z2 = zt3Var.f57664x == 1;
                int i10 = c16598a.f43479j;
                if (i10 == rf1.C16598a.f43468l || i10 == rf1.C16598a.f43469m) {
                    if (c16598a.f43479j == rf1.C16598a.f43469m || !z2 || (z2 && (view.getMeasuredWidth() == zt3Var.m59846Y())) || (view instanceof Placeholder) || zt3Var.q0()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(zt3Var.m59866z(), 1073741824);
                    }
                }
            }
            au3 au3Var = (au3) zt3Var.m59835M();
            if (au3Var != null && lec.m37039b(ConstraintLayout.this.f6871q, 256) && view.getMeasuredWidth() == zt3Var.m59846Y() && view.getMeasuredWidth() < au3Var.m59846Y() && view.getMeasuredHeight() == zt3Var.m59866z() && view.getMeasuredHeight() < au3Var.m59866z() && view.getBaseline() == zt3Var.m59858r() && !zt3Var.o0()) {
                if (m5628d(zt3Var.m59827E(), iMakeMeasureSpec, zt3Var.m59846Y()) && m5628d(zt3Var.m59828F(), iMakeMeasureSpec2, zt3Var.m59866z())) {
                    c16598a.f43474e = zt3Var.m59846Y();
                    c16598a.f43475f = zt3Var.m59866z();
                    c16598a.f43476g = zt3Var.m59858r();
                    return;
                }
            }
            zt3.EnumC18702b enumC18702b3 = zt3.EnumC18702b.MATCH_CONSTRAINT;
            boolean z3 = enumC18702b == enumC18702b3;
            boolean z4 = enumC18702b2 == enumC18702b3;
            zt3.EnumC18702b enumC18702b4 = zt3.EnumC18702b.MATCH_PARENT;
            boolean z5 = enumC18702b2 == enumC18702b4 || enumC18702b2 == zt3.EnumC18702b.FIXED;
            boolean z6 = enumC18702b == enumC18702b4 || enumC18702b == zt3.EnumC18702b.FIXED;
            boolean z7 = z3 && zt3Var.f0 > 0.0f;
            boolean z8 = z4 && zt3Var.f0 > 0.0f;
            if (view == null) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i11 = c16598a.f43479j;
            if (i11 != rf1.C16598a.f43468l && i11 != rf1.C16598a.f43469m && z3 && zt3Var.f57663w == 0 && z4 && zt3Var.f57664x == 0) {
                i2 = -1;
                measuredHeight = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof VirtualLayout) && (zt3Var instanceof x0j)) {
                    ((VirtualLayout) view).mo5311x((x0j) zt3Var, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                zt3Var.a1(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i12 = zt3Var.f57666z;
                iMax = i12 > 0 ? Math.max(i12, measuredWidth) : measuredWidth;
                int i13 = zt3Var.f57615A;
                if (i13 > 0) {
                    iMax = Math.min(i13, iMax);
                }
                int i14 = zt3Var.f57617C;
                if (i14 > 0) {
                    measuredHeight = Math.max(i14, measuredHeight2);
                    i = iMakeMeasureSpec;
                } else {
                    i = iMakeMeasureSpec;
                    measuredHeight = measuredHeight2;
                }
                int i15 = zt3Var.f57618D;
                if (i15 > 0) {
                    measuredHeight = Math.min(i15, measuredHeight);
                }
                int i16 = iMakeMeasureSpec2;
                if (!lec.m37039b(ConstraintLayout.this.f6871q, 1)) {
                    if (z7 && z5) {
                        iMax = (int) ((measuredHeight * zt3Var.f0) + 0.5f);
                    } else if (z8 && z6) {
                        measuredHeight = (int) ((iMax / zt3Var.f0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight2 != measuredHeight) {
                    int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i;
                    int iMakeMeasureSpec4 = measuredHeight2 != measuredHeight ? View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824) : i16;
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    zt3Var.a1(iMakeMeasureSpec3, iMakeMeasureSpec4);
                    iMax = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i2 = -1;
            }
            boolean z9 = baseline != i2;
            c16598a.f43478i = (iMax == c16598a.f43472c && measuredHeight == c16598a.f43473d) ? false : true;
            if (layoutParams.g0) {
                z9 = true;
            }
            if (z9 && baseline != -1 && zt3Var.m59858r() != baseline) {
                c16598a.f43478i = true;
            }
            c16598a.f43474e = iMax;
            c16598a.f43475f = measuredHeight;
            c16598a.f43477h = z9;
            c16598a.f43476g = baseline;
            ConstraintLayout.m5602a(ConstraintLayout.this);
        }

        /* renamed from: c */
        public void m5627c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f6930b = i3;
            this.f6931c = i4;
            this.f6932d = i5;
            this.f6933e = i6;
            this.f6934f = i;
            this.f6935g = i2;
        }

        /* renamed from: d */
        public final boolean m5628d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            return View.MeasureSpec.getMode(i2) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i3 == View.MeasureSpec.getSize(i2);
        }
    }

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException, NumberFormatException {
        super(context);
        this.f6863a = new SparseArray();
        this.f6864b = new ArrayList(4);
        this.f6865c = new au3();
        this.f6866d = 0;
        this.f6867e = 0;
        this.f6868f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f6869g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f6870h = true;
        this.f6871q = 257;
        this.f6872s = null;
        this.f6873x = null;
        this.f6874y = -1;
        this.f6859H = new HashMap();
        this.f6860L = -1;
        this.f6861M = -1;
        this.f6862Q = -1;
        this.h0 = -1;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new SparseArray();
        this.l0 = new C2003b(this);
        this.m0 = 0;
        this.n0 = 0;
        m5615s(null, 0, 0);
    }

    /* renamed from: a */
    public static /* synthetic */ meb m5602a(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C2006c getSharedValues() {
        if (p0 == null) {
            p0 = new C2006c();
        }
        return p0;
    }

    /* renamed from: A */
    public final void m5605A(zt3 zt3Var, LayoutParams layoutParams, SparseArray sparseArray, int i, tt3.EnumC17197a enumC17197a) {
        View view = (View) this.f6863a.get(i);
        zt3 zt3Var2 = (zt3) sparseArray.get(i);
        if (zt3Var2 == null || view == null || !(view.getLayoutParams() instanceof LayoutParams)) {
            return;
        }
        layoutParams.g0 = true;
        tt3.EnumC17197a enumC17197a2 = tt3.EnumC17197a.BASELINE;
        if (enumC17197a == enumC17197a2) {
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.g0 = true;
            layoutParams2.v0.P0(true);
        }
        zt3Var.mo47185q(enumC17197a2).m50469b(zt3Var2.mo47185q(enumC17197a), layoutParams.f6878D, layoutParams.f6877C, true);
        zt3Var.P0(true);
        zt3Var.mo47185q(tt3.EnumC17197a.TOP).m50484q();
        zt3Var.mo47185q(tt3.EnumC17197a.BOTTOM).m50484q();
    }

    /* renamed from: B */
    public final boolean m5606B() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            m5620y();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f6864b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((ConstraintHelper) this.f6864b.get(i)).mo5335t(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(Opcodes.V_PREVIEW);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void m5607e(boolean z, View view, zt3 zt3Var, LayoutParams layoutParams, SparseArray sparseArray) {
        zt3 zt3Var2;
        zt3 zt3Var3;
        zt3 zt3Var4;
        zt3 zt3Var5;
        int i;
        layoutParams.m5624c();
        layoutParams.w0 = false;
        zt3Var.o1(view.getVisibility());
        if (layoutParams.j0) {
            zt3Var.Y0(true);
            zt3Var.o1(8);
        }
        zt3Var.G0(view);
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).mo5310q(zt3Var, this.f6865c.V1());
        }
        if (layoutParams.h0) {
            rv7 rv7Var = (rv7) zt3Var;
            int i2 = layoutParams.s0;
            int i3 = layoutParams.t0;
            float f = layoutParams.u0;
            if (f != -1.0f) {
                rv7Var.E1(f);
                return;
            } else if (i2 != -1) {
                rv7Var.C1(i2);
                return;
            } else {
                if (i3 != -1) {
                    rv7Var.D1(i3);
                    return;
                }
                return;
            }
        }
        int i4 = layoutParams.l0;
        int i5 = layoutParams.m0;
        int i6 = layoutParams.n0;
        int i7 = layoutParams.o0;
        int i8 = layoutParams.p0;
        int i9 = layoutParams.q0;
        float f2 = layoutParams.r0;
        int i10 = layoutParams.f6916p;
        if (i10 != -1) {
            zt3 zt3Var6 = (zt3) sparseArray.get(i10);
            if (zt3Var6 != null) {
                zt3Var.m59855m(zt3Var6, layoutParams.f6918r, layoutParams.f6917q);
            }
        } else {
            if (i4 != -1) {
                zt3 zt3Var7 = (zt3) sparseArray.get(i4);
                if (zt3Var7 != null) {
                    tt3.EnumC17197a enumC17197a = tt3.EnumC17197a.LEFT;
                    zt3Var.g0(enumC17197a, zt3Var7, enumC17197a, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
                }
            } else if (i5 != -1 && (zt3Var2 = (zt3) sparseArray.get(i5)) != null) {
                zt3Var.g0(tt3.EnumC17197a.LEFT, zt3Var2, tt3.EnumC17197a.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
            }
            if (i6 != -1) {
                zt3 zt3Var8 = (zt3) sparseArray.get(i6);
                if (zt3Var8 != null) {
                    zt3Var.g0(tt3.EnumC17197a.RIGHT, zt3Var8, tt3.EnumC17197a.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
                }
            } else if (i7 != -1 && (zt3Var3 = (zt3) sparseArray.get(i7)) != null) {
                tt3.EnumC17197a enumC17197a2 = tt3.EnumC17197a.RIGHT;
                zt3Var.g0(enumC17197a2, zt3Var3, enumC17197a2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
            }
            int i11 = layoutParams.f6909i;
            if (i11 != -1) {
                zt3 zt3Var9 = (zt3) sparseArray.get(i11);
                if (zt3Var9 != null) {
                    tt3.EnumC17197a enumC17197a3 = tt3.EnumC17197a.TOP;
                    zt3Var.g0(enumC17197a3, zt3Var9, enumC17197a3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f6924x);
                }
            } else {
                int i12 = layoutParams.f6910j;
                if (i12 != -1 && (zt3Var4 = (zt3) sparseArray.get(i12)) != null) {
                    zt3Var.g0(tt3.EnumC17197a.TOP, zt3Var4, tt3.EnumC17197a.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f6924x);
                }
            }
            int i13 = layoutParams.f6911k;
            if (i13 != -1) {
                zt3 zt3Var10 = (zt3) sparseArray.get(i13);
                if (zt3Var10 != null) {
                    zt3Var.g0(tt3.EnumC17197a.BOTTOM, zt3Var10, tt3.EnumC17197a.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f6926z);
                }
            } else {
                int i14 = layoutParams.f6912l;
                if (i14 != -1 && (zt3Var5 = (zt3) sparseArray.get(i14)) != null) {
                    tt3.EnumC17197a enumC17197a4 = tt3.EnumC17197a.BOTTOM;
                    zt3Var.g0(enumC17197a4, zt3Var5, enumC17197a4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f6926z);
                }
            }
            int i15 = layoutParams.f6913m;
            if (i15 != -1) {
                m5605A(zt3Var, layoutParams, sparseArray, i15, tt3.EnumC17197a.BASELINE);
            } else {
                int i16 = layoutParams.f6914n;
                if (i16 != -1) {
                    m5605A(zt3Var, layoutParams, sparseArray, i16, tt3.EnumC17197a.TOP);
                } else {
                    int i17 = layoutParams.f6915o;
                    if (i17 != -1) {
                        m5605A(zt3Var, layoutParams, sparseArray, i17, tt3.EnumC17197a.BOTTOM);
                    }
                }
            }
            if (f2 >= 0.0f) {
                zt3Var.R0(f2);
            }
            float f3 = layoutParams.f6882H;
            if (f3 >= 0.0f) {
                zt3Var.i1(f3);
            }
        }
        if (z && ((i = layoutParams.f6898X) != -1 || layoutParams.f6899Y != -1)) {
            zt3Var.g1(i, layoutParams.f6899Y);
        }
        if (layoutParams.e0) {
            zt3Var.U0(zt3.EnumC18702b.FIXED);
            zt3Var.p1(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                zt3Var.U0(zt3.EnumC18702b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            if (layoutParams.a0) {
                zt3Var.U0(zt3.EnumC18702b.MATCH_CONSTRAINT);
            } else {
                zt3Var.U0(zt3.EnumC18702b.MATCH_PARENT);
            }
            zt3Var.mo47185q(tt3.EnumC17197a.LEFT).f47688g = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            zt3Var.mo47185q(tt3.EnumC17197a.RIGHT).f47688g = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            zt3Var.U0(zt3.EnumC18702b.MATCH_CONSTRAINT);
            zt3Var.p1(0);
        }
        if (layoutParams.f0) {
            zt3Var.l1(zt3.EnumC18702b.FIXED);
            zt3Var.Q0(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                zt3Var.l1(zt3.EnumC18702b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            if (layoutParams.b0) {
                zt3Var.l1(zt3.EnumC18702b.MATCH_CONSTRAINT);
            } else {
                zt3Var.l1(zt3.EnumC18702b.MATCH_PARENT);
            }
            zt3Var.mo47185q(tt3.EnumC17197a.TOP).f47688g = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            zt3Var.mo47185q(tt3.EnumC17197a.BOTTOM).f47688g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            zt3Var.l1(zt3.EnumC18702b.MATCH_CONSTRAINT);
            zt3Var.Q0(0);
        }
        zt3Var.I0(layoutParams.f6883I);
        zt3Var.W0(layoutParams.f6886L);
        zt3Var.n1(layoutParams.f6887M);
        zt3Var.S0(layoutParams.f6888N);
        zt3Var.j1(layoutParams.f6889O);
        zt3Var.q1(layoutParams.d0);
        zt3Var.V0(layoutParams.f6890P, layoutParams.f6892R, layoutParams.f6894T, layoutParams.f6896V);
        zt3Var.m1(layoutParams.f6891Q, layoutParams.f6893S, layoutParams.f6895U, layoutParams.f6897W);
    }

    /* renamed from: f */
    public boolean m5608f(int i, int i2) {
        if (this.o0 == null) {
            return false;
        }
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        Iterator it = this.o0.iterator();
        while (it.hasNext()) {
            tq.m50332a(it.next());
            Iterator it2 = this.f6865c.w1().iterator();
            if (it2.hasNext()) {
                View view = (View) ((zt3) it2.next()).m59861u();
                view.getId();
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void forceLayout() {
        m5617u();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f6869g;
    }

    public int getMaxWidth() {
        return this.f6868f;
    }

    public int getMinHeight() {
        return this.f6867e;
    }

    public int getMinWidth() {
        return this.f6866d;
    }

    public int getOptimizationLevel() {
        return this.f6865c.P1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f6865c.f57655o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f6865c.f57655o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f6865c.f57655o = "parent";
            }
        }
        if (this.f6865c.m59862v() == null) {
            au3 au3Var = this.f6865c;
            au3Var.H0(au3Var.f57655o);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" setDebugName ");
            sb2.append(this.f6865c.m59862v());
        }
        Iterator it = this.f6865c.w1().iterator();
        while (it.hasNext()) {
            zt3 zt3Var = (zt3) it.next();
            View view = (View) zt3Var.m59861u();
            if (view != null) {
                if (zt3Var.f57655o == null && (id = view.getId()) != -1) {
                    zt3Var.f57655o = getContext().getResources().getResourceEntryName(id);
                }
                if (zt3Var.m59862v() == null) {
                    zt3Var.H0(zt3Var.f57655o);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" setDebugName ");
                    sb3.append(zt3Var.m59862v());
                }
            }
        }
        this.f6865c.mo17832Q(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: o */
    public Object m5611o(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f6859H;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f6859H.get(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            zt3 zt3Var = layoutParams.v0;
            if ((childAt.getVisibility() != 8 || layoutParams.h0 || layoutParams.i0 || layoutParams.k0 || zIsInEditMode) && !layoutParams.j0) {
                int iM59847Z = zt3Var.m59847Z();
                int iA0 = zt3Var.a0();
                int iM59846Y = zt3Var.m59846Y() + iM59847Z;
                int iM59866z = zt3Var.m59866z() + iA0;
                childAt.layout(iM59847Z, iA0, iM59846Y, iM59866z);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iM59847Z, iA0, iM59846Y, iM59866z);
                }
            }
        }
        int size = this.f6864b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ConstraintHelper) this.f6864b.get(i6)).mo5334r(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean zM5608f = this.f6870h | m5608f(i, i2);
        this.f6870h = zM5608f;
        if (!zM5608f) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.f6870h = true;
                    break;
                }
                i3++;
            }
        }
        boolean z = this.f6870h;
        this.m0 = i;
        this.n0 = i2;
        this.f6865c.e2(m5616t());
        if (this.f6870h) {
            this.f6870h = false;
            if (m5606B()) {
                this.f6865c.g2();
            }
        }
        this.f6865c.N1(null);
        m5619x(this.f6865c, this.f6871q, i, i2);
        m5618w(i, i2, this.f6865c.m59846Y(), this.f6865c.m59866z(), this.f6865c.W1(), this.f6865c.U1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        zt3 zt3VarM5614r = m5614r(view);
        if ((view instanceof Guideline) && !(zt3VarM5614r instanceof rv7)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            rv7 rv7Var = new rv7();
            layoutParams.v0 = rv7Var;
            layoutParams.h0 = true;
            rv7Var.F1(layoutParams.f6900Z);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m5601w();
            ((LayoutParams) view.getLayoutParams()).i0 = true;
            if (!this.f6864b.contains(constraintHelper)) {
                this.f6864b.add(constraintHelper);
            }
        }
        this.f6863a.put(view.getId(), view);
        this.f6870h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f6863a.remove(view.getId());
        this.f6865c.y1(m5614r(view));
        this.f6864b.remove(view);
        this.f6870h = true;
    }

    /* renamed from: p */
    public final zt3 m5612p(int i) {
        if (i == 0) {
            return this.f6865c;
        }
        View viewFindViewById = (View) this.f6863a.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f6865c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((LayoutParams) viewFindViewById.getLayoutParams()).v0;
    }

    /* renamed from: q */
    public View m5613q(int i) {
        return (View) this.f6863a.get(i);
    }

    /* renamed from: r */
    public final zt3 m5614r(View view) {
        if (view == this) {
            return this.f6865c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).v0;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m5617u();
        super.requestLayout();
    }

    /* renamed from: s */
    public final void m5615s(AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        this.f6865c.G0(this);
        this.f6865c.b2(this.l0);
        this.f6863a.put(getId(), this);
        this.f6872s = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mbe.ConstraintLayout_Layout, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == mbe.ConstraintLayout_Layout_android_minWidth) {
                    this.f6866d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6866d);
                } else if (index == mbe.ConstraintLayout_Layout_android_minHeight) {
                    this.f6867e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6867e);
                } else if (index == mbe.ConstraintLayout_Layout_android_maxWidth) {
                    this.f6868f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6868f);
                } else if (index == mbe.ConstraintLayout_Layout_android_maxHeight) {
                    this.f6869g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6869g);
                } else if (index == mbe.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f6871q = typedArrayObtainStyledAttributes.getInt(index, this.f6871q);
                } else if (index == mbe.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo5374v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f6873x = null;
                        }
                    }
                } else if (index == mbe.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C2005b c2005b = new C2005b();
                        this.f6872s = c2005b;
                        c2005b.m5666D(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f6872s = null;
                    }
                    this.f6874y = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f6865c.c2(this.f6871q);
    }

    public void setConstraintSet(C2005b c2005b) {
        this.f6872s = c2005b;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f6859H == null) {
                this.f6859H = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f6859H.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f6863a.remove(getId());
        super.setId(i);
        this.f6863a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f6869g) {
            return;
        }
        this.f6869g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f6868f) {
            return;
        }
        this.f6868f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f6867e) {
            return;
        }
        this.f6867e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f6866d) {
            return;
        }
        this.f6866d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(cu3 cu3Var) {
        vt3 vt3Var = this.f6873x;
        if (vt3Var != null) {
            vt3Var.m53395c(cu3Var);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f6871q = i;
        this.f6865c.c2(i);
    }

    public void setState(int i, int i2, int i3) {
        vt3 vt3Var = this.f6873x;
        if (vt3Var != null) {
            vt3Var.m53396d(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public boolean m5616t() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* renamed from: u */
    public final void m5617u() {
        this.f6870h = true;
        this.f6860L = -1;
        this.f6861M = -1;
        this.f6862Q = -1;
        this.h0 = -1;
        this.i0 = 0;
        this.j0 = 0;
    }

    /* renamed from: v */
    public void mo5374v(int i) {
        this.f6873x = new vt3(getContext(), this, i);
    }

    /* renamed from: w */
    public void m5618w(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C2003b c2003b = this.l0;
        int i5 = c2003b.f6933e;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + c2003b.f6932d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f6868f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f6869g, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f6860L = iMin;
        this.f6861M = iMin2;
    }

    /* renamed from: x */
    public void m5619x(au3 au3Var, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i4 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.l0.m5627c(i2, i3, iMax, iMax2, paddingWidth, i4);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? m5616t() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        m5621z(au3Var, mode, i5, mode2, i6);
        au3Var.X1(i, mode, i5, mode2, i6, this.f6860L, this.f6861M, iMax5, iMax);
    }

    /* renamed from: y */
    public final void m5620y() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            zt3 zt3VarM5614r = m5614r(getChildAt(i));
            if (zt3VarM5614r != null) {
                zt3VarM5614r.v0();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    m5612p(childAt.getId()).H0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f6874y != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.f6874y && (childAt2 instanceof Constraints)) {
                    this.f6872s = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        C2005b c2005b = this.f6872s;
        if (c2005b != null) {
            c2005b.m5679k(this, true);
        }
        this.f6865c.z1();
        int size = this.f6864b.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((ConstraintHelper) this.f6864b.get(i4)).m5600u(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).m5634c(this);
            }
        }
        this.k0.clear();
        this.k0.put(0, this.f6865c);
        this.k0.put(getId(), this.f6865c);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.k0.put(childAt4.getId(), m5614r(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            zt3 zt3VarM5614r2 = m5614r(childAt5);
            if (zt3VarM5614r2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.f6865c.m41784a(zt3VarM5614r2);
                m5607e(zIsInEditMode, childAt5, zt3VarM5614r2, layoutParams, this.k0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 o.zt3$b) = (r2v3 o.zt3$b), (r2v0 o.zt3$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5621z(au3 au3Var, int i, int i2, int i3, int i4) {
        zt3.EnumC18702b enumC18702b;
        C2003b c2003b = this.l0;
        int i5 = c2003b.f6933e;
        int i6 = c2003b.f6932d;
        zt3.EnumC18702b enumC18702b2 = zt3.EnumC18702b.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            enumC18702b = zt3.EnumC18702b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.f6866d);
            }
        } else if (i == 0) {
            enumC18702b = zt3.EnumC18702b.WRAP_CONTENT;
            i2 = childCount == 0 ? Math.max(0, this.f6866d) : 0;
        } else if (i != 1073741824) {
            enumC18702b = enumC18702b2;
        } else {
            i2 = Math.min(this.f6868f - i6, i2);
            enumC18702b = enumC18702b2;
        }
        if (i3 == Integer.MIN_VALUE) {
            enumC18702b2 = zt3.EnumC18702b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f6867e);
            }
        } else if (i3 != 0) {
            i4 = i3 != 1073741824 ? 0 : Math.min(this.f6869g - i5, i4);
        } else {
            enumC18702b2 = zt3.EnumC18702b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f6867e);
            }
        }
        if (i2 != au3Var.m59846Y() || i4 != au3Var.m59866z()) {
            au3Var.T1();
        }
        au3Var.r1(0);
        au3Var.s1(0);
        au3Var.c1(this.f6868f - i6);
        au3Var.b1(this.f6869g - i5);
        au3Var.f1(0);
        au3Var.e1(0);
        au3Var.U0(enumC18702b);
        au3Var.p1(i2);
        au3Var.l1(enumC18702b2);
        au3Var.Q0(i4);
        au3Var.f1(this.f6866d - i6);
        au3Var.e1(this.f6867e - i5);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.f6863a = new SparseArray();
        this.f6864b = new ArrayList(4);
        this.f6865c = new au3();
        this.f6866d = 0;
        this.f6867e = 0;
        this.f6868f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f6869g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f6870h = true;
        this.f6871q = 257;
        this.f6872s = null;
        this.f6873x = null;
        this.f6874y = -1;
        this.f6859H = new HashMap();
        this.f6860L = -1;
        this.f6861M = -1;
        this.f6862Q = -1;
        this.h0 = -1;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new SparseArray();
        this.l0 = new C2003b(this);
        this.m0 = 0;
        this.n0 = 0;
        m5615s(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.f6863a = new SparseArray();
        this.f6864b = new ArrayList(4);
        this.f6865c = new au3();
        this.f6866d = 0;
        this.f6867e = 0;
        this.f6868f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f6869g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f6870h = true;
        this.f6871q = 257;
        this.f6872s = null;
        this.f6873x = null;
        this.f6874y = -1;
        this.f6859H = new HashMap();
        this.f6860L = -1;
        this.f6861M = -1;
        this.f6862Q = -1;
        this.h0 = -1;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = new SparseArray();
        this.l0 = new C2003b(this);
        this.m0 = 0;
        this.n0 = 0;
        m5615s(attributeSet, i, 0);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public int f6875A;

        /* renamed from: B */
        public int f6876B;

        /* renamed from: C */
        public int f6877C;

        /* renamed from: D */
        public int f6878D;

        /* renamed from: E */
        public boolean f6879E;

        /* renamed from: F */
        public boolean f6880F;

        /* renamed from: G */
        public float f6881G;

        /* renamed from: H */
        public float f6882H;

        /* renamed from: I */
        public String f6883I;

        /* renamed from: J */
        public float f6884J;

        /* renamed from: K */
        public int f6885K;

        /* renamed from: L */
        public float f6886L;

        /* renamed from: M */
        public float f6887M;

        /* renamed from: N */
        public int f6888N;

        /* renamed from: O */
        public int f6889O;

        /* renamed from: P */
        public int f6890P;

        /* renamed from: Q */
        public int f6891Q;

        /* renamed from: R */
        public int f6892R;

        /* renamed from: S */
        public int f6893S;

        /* renamed from: T */
        public int f6894T;

        /* renamed from: U */
        public int f6895U;

        /* renamed from: V */
        public float f6896V;

        /* renamed from: W */
        public float f6897W;

        /* renamed from: X */
        public int f6898X;

        /* renamed from: Y */
        public int f6899Y;

        /* renamed from: Z */
        public int f6900Z;

        /* renamed from: a */
        public int f6901a;
        public boolean a0;

        /* renamed from: b */
        public int f6902b;
        public boolean b0;

        /* renamed from: c */
        public float f6903c;
        public String c0;

        /* renamed from: d */
        public boolean f6904d;
        public int d0;

        /* renamed from: e */
        public int f6905e;
        public boolean e0;

        /* renamed from: f */
        public int f6906f;
        public boolean f0;

        /* renamed from: g */
        public int f6907g;
        public boolean g0;

        /* renamed from: h */
        public int f6908h;
        public boolean h0;

        /* renamed from: i */
        public int f6909i;
        public boolean i0;

        /* renamed from: j */
        public int f6910j;
        public boolean j0;

        /* renamed from: k */
        public int f6911k;
        public boolean k0;

        /* renamed from: l */
        public int f6912l;
        public int l0;

        /* renamed from: m */
        public int f6913m;
        public int m0;

        /* renamed from: n */
        public int f6914n;
        public int n0;

        /* renamed from: o */
        public int f6915o;
        public int o0;

        /* renamed from: p */
        public int f6916p;
        public int p0;

        /* renamed from: q */
        public int f6917q;
        public int q0;

        /* renamed from: r */
        public float f6918r;
        public float r0;

        /* renamed from: s */
        public int f6919s;
        public int s0;

        /* renamed from: t */
        public int f6920t;
        public int t0;

        /* renamed from: u */
        public int f6921u;
        public float u0;

        /* renamed from: v */
        public int f6922v;
        public zt3 v0;

        /* renamed from: w */
        public int f6923w;
        public boolean w0;

        /* renamed from: x */
        public int f6924x;

        /* renamed from: y */
        public int f6925y;

        /* renamed from: z */
        public int f6926z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        public static class C2001a {

            /* renamed from: a */
            public static final SparseIntArray f6927a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f6927a = sparseIntArray;
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(mbe.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6901a = -1;
            this.f6902b = -1;
            this.f6903c = -1.0f;
            this.f6904d = true;
            this.f6905e = -1;
            this.f6906f = -1;
            this.f6907g = -1;
            this.f6908h = -1;
            this.f6909i = -1;
            this.f6910j = -1;
            this.f6911k = -1;
            this.f6912l = -1;
            this.f6913m = -1;
            this.f6914n = -1;
            this.f6915o = -1;
            this.f6916p = -1;
            this.f6917q = 0;
            this.f6918r = 0.0f;
            this.f6919s = -1;
            this.f6920t = -1;
            this.f6921u = -1;
            this.f6922v = -1;
            this.f6923w = Integer.MIN_VALUE;
            this.f6924x = Integer.MIN_VALUE;
            this.f6925y = Integer.MIN_VALUE;
            this.f6926z = Integer.MIN_VALUE;
            this.f6875A = Integer.MIN_VALUE;
            this.f6876B = Integer.MIN_VALUE;
            this.f6877C = Integer.MIN_VALUE;
            this.f6878D = 0;
            this.f6879E = true;
            this.f6880F = true;
            this.f6881G = 0.5f;
            this.f6882H = 0.5f;
            this.f6883I = null;
            this.f6884J = 0.0f;
            this.f6885K = 1;
            this.f6886L = -1.0f;
            this.f6887M = -1.0f;
            this.f6888N = 0;
            this.f6889O = 0;
            this.f6890P = 0;
            this.f6891Q = 0;
            this.f6892R = 0;
            this.f6893S = 0;
            this.f6894T = 0;
            this.f6895U = 0;
            this.f6896V = 1.0f;
            this.f6897W = 1.0f;
            this.f6898X = -1;
            this.f6899Y = -1;
            this.f6900Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new zt3();
            this.w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                this.f6901a = layoutParams2.f6901a;
                this.f6902b = layoutParams2.f6902b;
                this.f6903c = layoutParams2.f6903c;
                this.f6904d = layoutParams2.f6904d;
                this.f6905e = layoutParams2.f6905e;
                this.f6906f = layoutParams2.f6906f;
                this.f6907g = layoutParams2.f6907g;
                this.f6908h = layoutParams2.f6908h;
                this.f6909i = layoutParams2.f6909i;
                this.f6910j = layoutParams2.f6910j;
                this.f6911k = layoutParams2.f6911k;
                this.f6912l = layoutParams2.f6912l;
                this.f6913m = layoutParams2.f6913m;
                this.f6914n = layoutParams2.f6914n;
                this.f6915o = layoutParams2.f6915o;
                this.f6916p = layoutParams2.f6916p;
                this.f6917q = layoutParams2.f6917q;
                this.f6918r = layoutParams2.f6918r;
                this.f6919s = layoutParams2.f6919s;
                this.f6920t = layoutParams2.f6920t;
                this.f6921u = layoutParams2.f6921u;
                this.f6922v = layoutParams2.f6922v;
                this.f6923w = layoutParams2.f6923w;
                this.f6924x = layoutParams2.f6924x;
                this.f6925y = layoutParams2.f6925y;
                this.f6926z = layoutParams2.f6926z;
                this.f6875A = layoutParams2.f6875A;
                this.f6876B = layoutParams2.f6876B;
                this.f6877C = layoutParams2.f6877C;
                this.f6878D = layoutParams2.f6878D;
                this.f6881G = layoutParams2.f6881G;
                this.f6882H = layoutParams2.f6882H;
                this.f6883I = layoutParams2.f6883I;
                this.f6884J = layoutParams2.f6884J;
                this.f6885K = layoutParams2.f6885K;
                this.f6886L = layoutParams2.f6886L;
                this.f6887M = layoutParams2.f6887M;
                this.f6888N = layoutParams2.f6888N;
                this.f6889O = layoutParams2.f6889O;
                this.a0 = layoutParams2.a0;
                this.b0 = layoutParams2.b0;
                this.f6890P = layoutParams2.f6890P;
                this.f6891Q = layoutParams2.f6891Q;
                this.f6892R = layoutParams2.f6892R;
                this.f6894T = layoutParams2.f6894T;
                this.f6893S = layoutParams2.f6893S;
                this.f6895U = layoutParams2.f6895U;
                this.f6896V = layoutParams2.f6896V;
                this.f6897W = layoutParams2.f6897W;
                this.f6898X = layoutParams2.f6898X;
                this.f6899Y = layoutParams2.f6899Y;
                this.f6900Z = layoutParams2.f6900Z;
                this.e0 = layoutParams2.e0;
                this.f0 = layoutParams2.f0;
                this.g0 = layoutParams2.g0;
                this.h0 = layoutParams2.h0;
                this.l0 = layoutParams2.l0;
                this.m0 = layoutParams2.m0;
                this.n0 = layoutParams2.n0;
                this.o0 = layoutParams2.o0;
                this.p0 = layoutParams2.p0;
                this.q0 = layoutParams2.q0;
                this.r0 = layoutParams2.r0;
                this.c0 = layoutParams2.c0;
                this.d0 = layoutParams2.d0;
                this.v0 = layoutParams2.v0;
                this.f6879E = layoutParams2.f6879E;
                this.f6880F = layoutParams2.f6880F;
            }
        }

        /* renamed from: a */
        public String m5622a() {
            return this.c0;
        }

        /* renamed from: b */
        public zt3 m5623b() {
            return this.v0;
        }

        /* renamed from: c */
        public void m5624c() {
            this.h0 = false;
            this.e0 = true;
            this.f0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.a0) {
                this.e0 = false;
                if (this.f6890P == 0) {
                    this.f6890P = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.b0) {
                this.f0 = false;
                if (this.f6891Q == 0) {
                    this.f6891Q = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.e0 = false;
                if (i == 0 && this.f6890P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.a0 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f0 = false;
                if (i2 == 0 && this.f6891Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.b0 = true;
                }
            }
            if (this.f6903c == -1.0f && this.f6901a == -1 && this.f6902b == -1) {
                return;
            }
            this.h0 = true;
            this.e0 = true;
            this.f0 = true;
            if (!(this.v0 instanceof rv7)) {
                this.v0 = new rv7();
            }
            ((rv7) this.v0).F1(this.f6900Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.n0 = -1;
            this.o0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.p0 = this.f6923w;
            this.q0 = this.f6925y;
            float f = this.f6881G;
            this.r0 = f;
            int i8 = this.f6901a;
            this.s0 = i8;
            int i9 = this.f6902b;
            this.t0 = i9;
            float f2 = this.f6903c;
            this.u0 = f2;
            if (z2) {
                int i10 = this.f6919s;
                if (i10 != -1) {
                    this.n0 = i10;
                } else {
                    int i11 = this.f6920t;
                    if (i11 != -1) {
                        this.o0 = i11;
                    }
                    i2 = this.f6921u;
                    if (i2 != -1) {
                        this.m0 = i2;
                        z = true;
                    }
                    i3 = this.f6922v;
                    if (i3 != -1) {
                        this.l0 = i3;
                        z = true;
                    }
                    i4 = this.f6875A;
                    if (i4 != Integer.MIN_VALUE) {
                        this.q0 = i4;
                    }
                    i5 = this.f6876B;
                    if (i5 != Integer.MIN_VALUE) {
                        this.p0 = i5;
                    }
                    if (z) {
                        this.r0 = 1.0f - f;
                    }
                    if (this.h0 && this.f6900Z == 1 && this.f6904d) {
                        if (f2 == -1.0f) {
                            this.u0 = 1.0f - f2;
                            this.s0 = -1;
                            this.t0 = -1;
                        } else if (i8 != -1) {
                            this.t0 = i8;
                            this.s0 = -1;
                            this.u0 = -1.0f;
                        } else if (i9 != -1) {
                            this.s0 = i9;
                            this.t0 = -1;
                            this.u0 = -1.0f;
                        }
                    }
                }
                z = true;
                i2 = this.f6921u;
                if (i2 != -1) {
                }
                i3 = this.f6922v;
                if (i3 != -1) {
                }
                i4 = this.f6875A;
                if (i4 != Integer.MIN_VALUE) {
                }
                i5 = this.f6876B;
                if (i5 != Integer.MIN_VALUE) {
                }
                if (z) {
                }
                if (this.h0) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                int i12 = this.f6919s;
                if (i12 != -1) {
                    this.m0 = i12;
                }
                int i13 = this.f6920t;
                if (i13 != -1) {
                    this.l0 = i13;
                }
                int i14 = this.f6921u;
                if (i14 != -1) {
                    this.n0 = i14;
                }
                int i15 = this.f6922v;
                if (i15 != -1) {
                    this.o0 = i15;
                }
                int i16 = this.f6875A;
                if (i16 != Integer.MIN_VALUE) {
                    this.p0 = i16;
                }
                int i17 = this.f6876B;
                if (i17 != Integer.MIN_VALUE) {
                    this.q0 = i17;
                }
            }
            if (this.f6921u == -1 && this.f6922v == -1 && this.f6920t == -1 && this.f6919s == -1) {
                int i18 = this.f6907g;
                if (i18 != -1) {
                    this.n0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.f6908h;
                    if (i19 != -1) {
                        this.o0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.f6905e;
                if (i20 != -1) {
                    this.l0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.f6906f;
                if (i21 != -1) {
                    this.m0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) throws NumberFormatException {
            super(context, attributeSet);
            this.f6901a = -1;
            this.f6902b = -1;
            this.f6903c = -1.0f;
            this.f6904d = true;
            this.f6905e = -1;
            this.f6906f = -1;
            this.f6907g = -1;
            this.f6908h = -1;
            this.f6909i = -1;
            this.f6910j = -1;
            this.f6911k = -1;
            this.f6912l = -1;
            this.f6913m = -1;
            this.f6914n = -1;
            this.f6915o = -1;
            this.f6916p = -1;
            this.f6917q = 0;
            this.f6918r = 0.0f;
            this.f6919s = -1;
            this.f6920t = -1;
            this.f6921u = -1;
            this.f6922v = -1;
            this.f6923w = Integer.MIN_VALUE;
            this.f6924x = Integer.MIN_VALUE;
            this.f6925y = Integer.MIN_VALUE;
            this.f6926z = Integer.MIN_VALUE;
            this.f6875A = Integer.MIN_VALUE;
            this.f6876B = Integer.MIN_VALUE;
            this.f6877C = Integer.MIN_VALUE;
            this.f6878D = 0;
            this.f6879E = true;
            this.f6880F = true;
            this.f6881G = 0.5f;
            this.f6882H = 0.5f;
            this.f6883I = null;
            this.f6884J = 0.0f;
            this.f6885K = 1;
            this.f6886L = -1.0f;
            this.f6887M = -1.0f;
            this.f6888N = 0;
            this.f6889O = 0;
            this.f6890P = 0;
            this.f6891Q = 0;
            this.f6892R = 0;
            this.f6893S = 0;
            this.f6894T = 0;
            this.f6895U = 0;
            this.f6896V = 1.0f;
            this.f6897W = 1.0f;
            this.f6898X = -1;
            this.f6899Y = -1;
            this.f6900Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new zt3();
            this.w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mbe.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = C2001a.f6927a.get(index);
                switch (i2) {
                    case 1:
                        this.f6900Z = typedArrayObtainStyledAttributes.getInt(index, this.f6900Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f6916p);
                        this.f6916p = resourceId;
                        if (resourceId == -1) {
                            this.f6916p = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f6917q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6917q);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.f6918r) % 360.0f;
                        this.f6918r = f;
                        if (f < 0.0f) {
                            this.f6918r = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f6901a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6901a);
                        break;
                    case 6:
                        this.f6902b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6902b);
                        break;
                    case 7:
                        this.f6903c = typedArrayObtainStyledAttributes.getFloat(index, this.f6903c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6905e);
                        this.f6905e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f6905e = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6906f);
                        this.f6906f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f6906f = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6907g);
                        this.f6907g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f6907g = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6908h);
                        this.f6908h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f6908h = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6909i);
                        this.f6909i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f6909i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6910j);
                        this.f6910j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f6910j = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6911k);
                        this.f6911k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f6911k = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6912l);
                        this.f6912l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f6912l = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6913m);
                        this.f6913m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f6913m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6919s);
                        this.f6919s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f6919s = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6920t);
                        this.f6920t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f6920t = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6921u);
                        this.f6921u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f6921u = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6922v);
                        this.f6922v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f6922v = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f6923w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6923w);
                        break;
                    case 22:
                        this.f6924x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6924x);
                        break;
                    case 23:
                        this.f6925y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6925y);
                        break;
                    case 24:
                        this.f6926z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6926z);
                        break;
                    case 25:
                        this.f6875A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6875A);
                        break;
                    case 26:
                        this.f6876B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6876B);
                        break;
                    case 27:
                        this.a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.a0);
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        this.b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.b0);
                        break;
                    case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                        this.f6881G = typedArrayObtainStyledAttributes.getFloat(index, this.f6881G);
                        break;
                    case 30:
                        this.f6882H = typedArrayObtainStyledAttributes.getFloat(index, this.f6882H);
                        break;
                    case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        this.f6890P = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.f6891Q = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f6892R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6892R);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f6892R) == -2) {
                                this.f6892R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        try {
                            this.f6894T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6894T);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f6894T) == -2) {
                                this.f6894T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f6896V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f6896V));
                        this.f6890P = 2;
                        break;
                    case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        try {
                            this.f6893S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6893S);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f6893S) == -2) {
                                this.f6893S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f6895U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6895U);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f6895U) == -2) {
                                this.f6895U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f6897W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f6897W));
                        this.f6891Q = 2;
                        break;
                    default:
                        switch (i2) {
                            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                C2005b.m5650I(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f6886L = typedArrayObtainStyledAttributes.getFloat(index, this.f6886L);
                                break;
                            case 46:
                                this.f6887M = typedArrayObtainStyledAttributes.getFloat(index, this.f6887M);
                                break;
                            case 47:
                                this.f6888N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f6889O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f6898X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6898X);
                                break;
                            case 50:
                                this.f6899Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6899Y);
                                break;
                            case 51:
                                this.c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6914n);
                                this.f6914n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f6914n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6915o);
                                this.f6915o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f6915o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f6878D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6878D);
                                break;
                            case 55:
                                this.f6877C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6877C);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        C2005b.m5648G(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.f6879E = true;
                                        break;
                                    case 65:
                                        C2005b.m5648G(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.f6880F = true;
                                        break;
                                    case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                                        this.d0 = typedArrayObtainStyledAttributes.getInt(index, this.d0);
                                        break;
                                    case TypeReference.INSTANCEOF /* 67 */:
                                        this.f6904d = typedArrayObtainStyledAttributes.getBoolean(index, this.f6904d);
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m5624c();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f6901a = -1;
            this.f6902b = -1;
            this.f6903c = -1.0f;
            this.f6904d = true;
            this.f6905e = -1;
            this.f6906f = -1;
            this.f6907g = -1;
            this.f6908h = -1;
            this.f6909i = -1;
            this.f6910j = -1;
            this.f6911k = -1;
            this.f6912l = -1;
            this.f6913m = -1;
            this.f6914n = -1;
            this.f6915o = -1;
            this.f6916p = -1;
            this.f6917q = 0;
            this.f6918r = 0.0f;
            this.f6919s = -1;
            this.f6920t = -1;
            this.f6921u = -1;
            this.f6922v = -1;
            this.f6923w = Integer.MIN_VALUE;
            this.f6924x = Integer.MIN_VALUE;
            this.f6925y = Integer.MIN_VALUE;
            this.f6926z = Integer.MIN_VALUE;
            this.f6875A = Integer.MIN_VALUE;
            this.f6876B = Integer.MIN_VALUE;
            this.f6877C = Integer.MIN_VALUE;
            this.f6878D = 0;
            this.f6879E = true;
            this.f6880F = true;
            this.f6881G = 0.5f;
            this.f6882H = 0.5f;
            this.f6883I = null;
            this.f6884J = 0.0f;
            this.f6885K = 1;
            this.f6886L = -1.0f;
            this.f6887M = -1.0f;
            this.f6888N = 0;
            this.f6889O = 0;
            this.f6890P = 0;
            this.f6891Q = 0;
            this.f6892R = 0;
            this.f6893S = 0;
            this.f6894T = 0;
            this.f6895U = 0;
            this.f6896V = 1.0f;
            this.f6897W = 1.0f;
            this.f6898X = -1;
            this.f6899Y = -1;
            this.f6900Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new zt3();
            this.w0 = false;
        }
    }
}

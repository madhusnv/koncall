package w4;

import android.content.Context;
import android.view.View;
import android.view.Window;
import c6.InterfaceC0893w;
import c6.n0;
import c6.v0;
import c6.y1;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2141e;
import java.lang.reflect.Field;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.e1;
import v4.C7656b;
import w3.AbstractC7883a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.m */
/* loaded from: classes.dex */
public final class C7921m extends AbstractC7883a implements InterfaceC0893w {

    /* renamed from: a */
    public final Window f38104a;

    /* renamed from: b */
    public final e1 f38105b;

    /* renamed from: c */
    public boolean f38106c;

    /* renamed from: d */
    public boolean f38107d;

    /* renamed from: e */
    public boolean f38108e;

    /* renamed from: f */
    public boolean f38109f;

    public C7921m(Context context, Window window) {
        super(context);
        this.f38104a = window;
        this.f38105b = C3953b.m8517t(AbstractC7919k.f38102a);
        Field field = v0.f5527a;
        n0.m2460l(this, this);
        v0.m2530l(this, new C7656b(this, 1));
    }

    @Override // w3.AbstractC7883a
    public final void Content(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8607Y(1735448596);
        AbstractC1452a.m4576w(0, (InterfaceC2141e) this.f38105b.getValue(), c3966o, false);
    }

    @Override // c6.InterfaceC0893w
    /* renamed from: e */
    public final y1 mo2531e(View view, y1 y1Var) {
        if (!this.f38107d) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return y1Var.f5541a.mo2478n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return y1Var;
    }

    @Override // w3.AbstractC7883a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f38109f;
    }

    @Override // w3.AbstractC7883a
    public final void internalOnLayout$ui_release(boolean z6, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i14 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i15 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // w3.AbstractC7883a
    public final void internalOnMeasure$ui_release(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui_release(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        Window window = this.f38104a;
        int i12 = (mode != Integer.MIN_VALUE || this.f38106c || this.f38107d || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i13 = size - paddingRight;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = i12 - paddingBottom;
        int i15 = i14 >= 0 ? i14 : 0;
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE);
        }
        childAt.measure(i10, i11);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f38106c || this.f38107d || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.setLayout(-1, -1);
    }
}

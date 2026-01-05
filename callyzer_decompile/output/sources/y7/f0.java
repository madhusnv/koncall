package y7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import b2.C0558p;
import c9.C0910e;
import d6.C1616f;
import d6.C1617g;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k1.j2;
import uf.C7427b;
import ug.C7439j;
import ug.g1;
import x7.AbstractC8311a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a */
    public C7439j f41619a;

    /* renamed from: b */
    public RecyclerView f41620b;

    /* renamed from: c */
    public final C0910e f41621c;

    /* renamed from: d */
    public final C0910e f41622d;

    /* renamed from: e */
    public C8584s f41623e;

    /* renamed from: f */
    public boolean f41624f;

    /* renamed from: g */
    public boolean f41625g;

    /* renamed from: h */
    public final boolean f41626h;

    /* renamed from: i */
    public final boolean f41627i;

    /* renamed from: j */
    public int f41628j;

    /* renamed from: k */
    public boolean f41629k;

    /* renamed from: l */
    public int f41630l;

    /* renamed from: m */
    public int f41631m;

    /* renamed from: n */
    public int f41632n;

    /* renamed from: o */
    public int f41633o;

    public f0() {
        C7427b c7427b = new C7427b(14, this);
        g1 g1Var = new g1(this);
        this.f41621c = new C0910e((c1) c7427b);
        this.f41622d = new C0910e((c1) g1Var);
        this.f41624f = false;
        this.f41625g = false;
        this.f41626h = true;
        this.f41627i = true;
    }

    /* renamed from: D */
    public static int m15843D(View view) {
        return ((g0) view.getLayoutParams()).f41639a.m15917b();
    }

    /* renamed from: E */
    public static e0 m15844E(Context context, AttributeSet attributeSet, int i10, int i11) {
        e0 e0Var = new e0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8311a.f39860a, i10, i11);
        e0Var.f41609a = typedArrayObtainStyledAttributes.getInt(0, 1);
        e0Var.f41610b = typedArrayObtainStyledAttributes.getInt(10, 1);
        e0Var.f41611c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        e0Var.f41612d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return e0Var;
    }

    /* renamed from: I */
    public static boolean m15845I(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    /* renamed from: J */
    public static void m15846J(View view, int i10, int i11, int i12, int i13) {
        g0 g0Var = (g0) view.getLayoutParams();
        Rect rect = g0Var.f41640b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) g0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) g0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) g0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) g0Var).bottomMargin);
    }

    /* renamed from: g */
    public static int m15847g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m15848w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.f0.m15848w(boolean, int, int, int, int):int");
    }

    /* renamed from: y */
    public static void m15849y(View view, Rect rect) {
        int[] iArr = RecyclerView.f43688y1;
        g0 g0Var = (g0) view.getLayoutParams();
        Rect rect2 = g0Var.f41640b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) g0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) g0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) g0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) g0Var).bottomMargin);
    }

    /* renamed from: A */
    public final int m15850A() {
        RecyclerView recyclerView = this.f41620b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    /* renamed from: B */
    public final int m15851B() {
        RecyclerView recyclerView = this.f41620b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: C */
    public final int m15852C() {
        RecyclerView recyclerView = this.f41620b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    /* renamed from: F */
    public int mo1279F(l0 l0Var, q0 q0Var) {
        RecyclerView recyclerView = this.f41620b;
        if (recyclerView == null || recyclerView.f2823l == null || !mo1306e()) {
            return 1;
        }
        return this.f41620b.f2823l.mo4090a();
    }

    /* renamed from: G */
    public final void m15853G(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((g0) view.getLayoutParams()).f41640b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f41620b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f41620b.f2822k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    /* renamed from: H */
    public abstract boolean mo1298H();

    /* renamed from: K */
    public void mo1364K(int i10) {
        RecyclerView recyclerView = this.f41620b;
        if (recyclerView != null) {
            int iM14009t = recyclerView.f2817e.m14009t();
            for (int i11 = 0; i11 < iM14009t; i11++) {
                recyclerView.f2817e.m14008s(i11).offsetLeftAndRight(i10);
            }
        }
    }

    /* renamed from: L */
    public void mo1365L(int i10) {
        RecyclerView recyclerView = this.f41620b;
        if (recyclerView != null) {
            int iM14009t = recyclerView.f2817e.m14009t();
            for (int i11 = 0; i11 < iM14009t; i11++) {
                recyclerView.f2817e.m14008s(i11).offsetTopAndBottom(i10);
            }
        }
    }

    /* renamed from: M */
    public abstract void mo1299M(RecyclerView recyclerView);

    /* renamed from: N */
    public abstract View mo1280N(View view, int i10, l0 l0Var, q0 q0Var);

    /* renamed from: O */
    public void mo1300O(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f41620b;
        l0 l0Var = recyclerView.f2814b;
        q0 q0Var = recyclerView.f43699i1;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z6 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f41620b.canScrollVertically(-1) && !this.f41620b.canScrollHorizontally(-1) && !this.f41620b.canScrollHorizontally(1)) {
            z6 = false;
        }
        accessibilityEvent.setScrollable(z6);
        AbstractC8590y abstractC8590y = this.f41620b.f2823l;
        if (abstractC8590y != null) {
            accessibilityEvent.setItemCount(abstractC8590y.mo4090a());
        }
    }

    /* renamed from: P */
    public final void m15854P(View view, C1617g c1617g) {
        t0 t0VarM1313H = RecyclerView.m1313H(view);
        if (t0VarM1313H == null || t0VarM1313H.m15923h()) {
            return;
        }
        C7439j c7439j = this.f41619a;
        if (((ArrayList) c7439j.f35539d).contains(t0VarM1313H.f41792a)) {
            return;
        }
        RecyclerView recyclerView = this.f41620b;
        mo1281Q(recyclerView.f2814b, recyclerView.f43699i1, view, c1617g);
    }

    /* renamed from: Q */
    public void mo1281Q(l0 l0Var, q0 q0Var, View view, C1617g c1617g) {
        c1617g.m5294m(C1616f.m5280a(false, mo1306e() ? m15843D(view) : 0, 1, mo1305d() ? m15843D(view) : 0, 1));
    }

    /* renamed from: W */
    public abstract void mo1287W(l0 l0Var, q0 q0Var);

    /* renamed from: X */
    public abstract void mo1288X(q0 q0Var);

    /* renamed from: Y */
    public abstract void mo1301Y(Parcelable parcelable);

    /* renamed from: Z */
    public abstract Parcelable mo1302Z();

    /* renamed from: b */
    public final void m15855b(View view, int i10, boolean z6) {
        t0 t0VarM1313H = RecyclerView.m1313H(view);
        if (z6 || t0VarM1313H.m15923h()) {
            e1.u0 u0Var = (e1.u0) this.f41620b.f2818f.f5594b;
            d1 d1VarM15842a = (d1) u0Var.get(t0VarM1313H);
            if (d1VarM15842a == null) {
                d1VarM15842a = d1.m15842a();
                u0Var.put(t0VarM1313H, d1VarM15842a);
            }
            d1VarM15842a.f41601a |= 1;
        } else {
            this.f41620b.f2818f.m2650q(t0VarM1313H);
        }
        g0 g0Var = (g0) view.getLayoutParams();
        if (t0VarM1313H.m15931p() || t0VarM1313H.m15924i()) {
            if (t0VarM1313H.m15924i()) {
                t0VarM1313H.f41805n.m15884j(t0VarM1313H);
            } else {
                t0VarM1313H.f41801j &= -33;
            }
            this.f41619a.m14002m(view, i10, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f41620b) {
                C7439j c7439j = this.f41619a;
                j2 j2Var = (j2) c7439j.f35538c;
                int iIndexOfChild = ((RecyclerView) ((C7427b) c7439j.f35537b).f35231b).indexOfChild(view);
                int iM8456c = (iIndexOfChild == -1 || j2Var.m8458e(iIndexOfChild)) ? -1 : iIndexOfChild - j2Var.m8456c(iIndexOfChild);
                if (i10 == -1) {
                    i10 = this.f41619a.m14009t();
                }
                if (iM8456c == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f41620b.indexOfChild(view) + this.f41620b.m1361x());
                }
                if (iM8456c != i10) {
                    f0 f0Var = this.f41620b.f2824m;
                    View viewM15857u = f0Var.m15857u(iM8456c);
                    if (viewM15857u == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iM8456c + f0Var.f41620b.toString());
                    }
                    f0Var.m15857u(iM8456c);
                    f0Var.f41619a.m14007r(iM8456c);
                    g0 g0Var2 = (g0) viewM15857u.getLayoutParams();
                    t0 t0VarM1313H2 = RecyclerView.m1313H(viewM15857u);
                    if (t0VarM1313H2.m15923h()) {
                        e1.u0 u0Var2 = (e1.u0) f0Var.f41620b.f2818f.f5594b;
                        d1 d1VarM15842a2 = (d1) u0Var2.get(t0VarM1313H2);
                        if (d1VarM15842a2 == null) {
                            d1VarM15842a2 = d1.m15842a();
                            u0Var2.put(t0VarM1313H2, d1VarM15842a2);
                        }
                        d1VarM15842a2.f41601a = 1 | d1VarM15842a2.f41601a;
                    } else {
                        f0Var.f41620b.f2818f.m2650q(t0VarM1313H2);
                    }
                    f0Var.f41619a.m14002m(viewM15857u, i10, g0Var2, t0VarM1313H2.m15923h());
                }
            } else {
                this.f41619a.m14001b(view, i10, false);
                g0Var.f41641c = true;
                C8584s c8584s = this.f41623e;
                if (c8584s != null && c8584s.f41772e) {
                    c8584s.f41769b.getClass();
                    t0 t0VarM1313H3 = RecyclerView.m1313H(view);
                    if ((t0VarM1313H3 != null ? t0VarM1313H3.m15917b() : -1) == c8584s.f41768a) {
                        c8584s.f41773f = view;
                    }
                }
            }
        }
        if (g0Var.f41642d) {
            t0VarM1313H.f41792a.invalidate();
            g0Var.f41642d = false;
        }
    }

    public final void b0(l0 l0Var) {
        for (int iM15858v = m15858v() - 1; iM15858v >= 0; iM15858v--) {
            if (!RecyclerView.m1313H(m15857u(iM15858v)).m15930o()) {
                View viewM15857u = m15857u(iM15858v);
                e0(iM15858v);
                l0Var.m15880f(viewM15857u);
            }
        }
    }

    /* renamed from: c */
    public abstract void mo1304c(String str);

    public final void c0(l0 l0Var) {
        ArrayList arrayList = l0Var.f41704a;
        int size = arrayList.size();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            View view = ((t0) arrayList.get(i10)).f41792a;
            t0 t0VarM1313H = RecyclerView.m1313H(view);
            if (!t0VarM1313H.m15930o()) {
                t0VarM1313H.m15929n(false);
                if (t0VarM1313H.m15925j()) {
                    this.f41620b.removeDetachedView(view, false);
                }
                c0 c0Var = this.f41620b.f2808M;
                if (c0Var != null) {
                    c0Var.mo15838d(t0VarM1313H);
                }
                t0VarM1313H.m15929n(true);
                t0 t0VarM1313H2 = RecyclerView.m1313H(view);
                t0VarM1313H2.f41805n = null;
                t0VarM1313H2.f41806o = false;
                t0VarM1313H2.f41801j &= -33;
                l0Var.m15881g(t0VarM1313H2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = l0Var.f41705b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f41620b.invalidate();
        }
    }

    /* renamed from: d */
    public abstract boolean mo1305d();

    public final void d0(View view, l0 l0Var) {
        C7439j c7439j = this.f41619a;
        C7427b c7427b = (C7427b) c7439j.f35537b;
        int iIndexOfChild = ((RecyclerView) c7427b.f35231b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((j2) c7439j.f35538c).m8462i(iIndexOfChild)) {
                c7439j.m13999E(view);
            }
            c7427b.m13821p(iIndexOfChild);
        }
        l0Var.m15880f(view);
    }

    /* renamed from: e */
    public abstract boolean mo1306e();

    public final void e0(int i10) {
        if (m15857u(i10) != null) {
            C7439j c7439j = this.f41619a;
            int iM14010u = c7439j.m14010u(i10);
            C7427b c7427b = (C7427b) c7439j.f35537b;
            View childAt = ((RecyclerView) c7427b.f35231b).getChildAt(iM14010u);
            if (childAt == null) {
                return;
            }
            if (((j2) c7439j.f35538c).m8462i(iM14010u)) {
                c7439j.m13999E(childAt);
            }
            c7427b.m13821p(iM14010u);
        }
    }

    /* renamed from: f */
    public boolean mo1289f(g0 g0Var) {
        return g0Var != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.m15850A()
            int r1 = r8.m15852C()
            int r2 = r8.f41632n
            int r3 = r8.m15851B()
            int r2 = r2 - r3
            int r3 = r8.f41633o
            int r4 = r8.m15859z()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f41620b
            java.lang.reflect.Field r7 = c6.v0.f5527a
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb2
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L80
            goto Lb7
        L80:
            int r1 = r8.m15850A()
            int r2 = r8.m15852C()
            int r3 = r8.f41632n
            int r4 = r8.m15851B()
            int r3 = r3 - r4
            int r4 = r8.f41633o
            int r5 = r8.m15859z()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f41620b
            android.graphics.Rect r5 = r5.f2820h
            m15849y(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb7
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb7
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb7
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb2
            goto Lb7
        Lb2:
            if (r11 != 0) goto Lb8
            if (r10 == 0) goto Lb7
            goto Lb8
        Lb7:
            return r0
        Lb8:
            if (r12 == 0) goto Lbe
            r9.scrollBy(r11, r10)
            return r7
        Lbe:
            r9.m1341Y(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.f0.f0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void g0() {
        RecyclerView recyclerView = this.f41620b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    /* renamed from: h */
    public abstract void mo1307h(int i10, int i11, q0 q0Var, C0558p c0558p);

    public abstract int h0(int i10, l0 l0Var, q0 q0Var);

    public abstract void i0(int i10);

    /* renamed from: j */
    public abstract int mo1309j(q0 q0Var);

    public abstract int j0(int i10, l0 l0Var, q0 q0Var);

    /* renamed from: k */
    public abstract int mo1290k(q0 q0Var);

    public final void k0(RecyclerView recyclerView) {
        l0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    /* renamed from: l */
    public abstract int mo1291l(q0 q0Var);

    public final void l0(int i10, int i11) {
        this.f41632n = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f41630l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f43688y1;
        }
        this.f41633o = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f41631m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f43688y1;
        }
    }

    /* renamed from: m */
    public abstract int mo1310m(q0 q0Var);

    public void m0(Rect rect, int i10, int i11) {
        int iM15851B = m15851B() + m15850A() + rect.width();
        int iM15859z = m15859z() + m15852C() + rect.height();
        RecyclerView recyclerView = this.f41620b;
        Field field = c6.v0.f5527a;
        this.f41620b.setMeasuredDimension(m15847g(i10, iM15851B, recyclerView.getMinimumWidth()), m15847g(i11, iM15859z, this.f41620b.getMinimumHeight()));
    }

    /* renamed from: n */
    public abstract int mo1292n(q0 q0Var);

    public final void n0(int i10, int i11) {
        int iM15858v = m15858v();
        if (iM15858v == 0) {
            this.f41620b.m1350m(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < iM15858v; i16++) {
            View viewM15857u = m15857u(i16);
            Rect rect = this.f41620b.f2820h;
            m15849y(viewM15857u, rect);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.f41620b.f2820h.set(i15, i13, i12, i14);
        m0(this.f41620b.f2820h, i10, i11);
    }

    /* renamed from: o */
    public abstract int mo1293o(q0 q0Var);

    public final void o0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f41620b = null;
            this.f41619a = null;
            this.f41632n = 0;
            this.f41633o = 0;
        } else {
            this.f41620b = recyclerView;
            this.f41619a = recyclerView.f2817e;
            this.f41632n = recyclerView.getWidth();
            this.f41633o = recyclerView.getHeight();
        }
        this.f41630l = 1073741824;
        this.f41631m = 1073741824;
    }

    /* renamed from: p */
    public final void m15856p(l0 l0Var) {
        for (int iM15858v = m15858v() - 1; iM15858v >= 0; iM15858v--) {
            View viewM15857u = m15857u(iM15858v);
            t0 t0VarM1313H = RecyclerView.m1313H(viewM15857u);
            if (!t0VarM1313H.m15930o()) {
                if (!t0VarM1313H.m15921f() || t0VarM1313H.m15923h() || this.f41620b.f2823l.f41833b) {
                    m15857u(iM15858v);
                    this.f41619a.m14007r(iM15858v);
                    l0Var.m15882h(viewM15857u);
                    this.f41620b.f2818f.m2650q(t0VarM1313H);
                } else {
                    e0(iM15858v);
                    l0Var.m15881g(t0VarM1313H);
                }
            }
        }
    }

    public final boolean p0(View view, int i10, int i11, g0 g0Var) {
        return (!view.isLayoutRequested() && this.f41626h && m15845I(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) g0Var).width) && m15845I(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) g0Var).height)) ? false : true;
    }

    /* renamed from: q */
    public View mo1311q(int i10) {
        int iM15858v = m15858v();
        for (int i11 = 0; i11 < iM15858v; i11++) {
            View viewM15857u = m15857u(i11);
            t0 t0VarM1313H = RecyclerView.m1313H(viewM15857u);
            if (t0VarM1313H != null && t0VarM1313H.m15917b() == i10 && !t0VarM1313H.m15930o() && (this.f41620b.f43699i1.f41757g || !t0VarM1313H.m15923h())) {
                return viewM15857u;
            }
        }
        return null;
    }

    public boolean q0() {
        return false;
    }

    /* renamed from: r */
    public abstract g0 mo1294r();

    public final boolean r0(View view, int i10, int i11, g0 g0Var) {
        return (this.f41626h && m15845I(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) g0Var).width) && m15845I(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) g0Var).height)) ? false : true;
    }

    /* renamed from: s */
    public g0 mo1295s(Context context, AttributeSet attributeSet) {
        return new g0(context, attributeSet);
    }

    public abstract void s0(RecyclerView recyclerView, int i10);

    /* renamed from: t */
    public g0 mo1296t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g0 ? new g0((g0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g0((ViewGroup.MarginLayoutParams) layoutParams) : new g0(layoutParams);
    }

    public final void t0(C8584s c8584s) {
        C8584s c8584s2 = this.f41623e;
        if (c8584s2 != null && c8584s != c8584s2 && c8584s2.f41772e) {
            c8584s2.m15899f();
        }
        this.f41623e = c8584s;
        RecyclerView recyclerView = this.f41620b;
        s0 s0Var = recyclerView.f43695f1;
        s0Var.f41789g.removeCallbacks(s0Var);
        s0Var.f41785c.abortAnimation();
        c8584s.f41769b = recyclerView;
        c8584s.f41770c = this;
        int i10 = c8584s.f41768a;
        if (i10 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f43699i1.f41751a = i10;
        c8584s.f41772e = true;
        c8584s.f41771d = true;
        c8584s.f41773f = recyclerView.f2824m.mo1311q(i10);
        c8584s.f41769b.f43695f1.m15900a();
    }

    /* renamed from: u */
    public final View m15857u(int i10) {
        C7439j c7439j = this.f41619a;
        if (c7439j != null) {
            return c7439j.m14008s(i10);
        }
        return null;
    }

    public abstract boolean u0();

    /* renamed from: v */
    public final int m15858v() {
        C7439j c7439j = this.f41619a;
        if (c7439j != null) {
            return c7439j.m14009t();
        }
        return 0;
    }

    /* renamed from: x */
    public int mo1297x(l0 l0Var, q0 q0Var) {
        RecyclerView recyclerView = this.f41620b;
        if (recyclerView == null || recyclerView.f2823l == null || !mo1305d()) {
            return 1;
        }
        return this.f41620b.f2823l.mo4090a();
    }

    /* renamed from: z */
    public final int m15859z() {
        RecyclerView recyclerView = this.f41620b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: S */
    public void mo1283S() {
    }

    public void a0(int i10) {
    }

    /* renamed from: R */
    public void mo1282R(int i10, int i11) {
    }

    /* renamed from: T */
    public void mo1284T(int i10, int i11) {
    }

    /* renamed from: U */
    public void mo1285U(int i10, int i11) {
    }

    /* renamed from: V */
    public void mo1286V(int i10, int i11) {
    }

    /* renamed from: i */
    public void mo1308i(int i10, C0558p c0558p) {
    }
}

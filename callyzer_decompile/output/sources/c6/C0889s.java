package c6;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c6.s */
/* loaded from: classes.dex */
public final class C0889s {

    /* renamed from: a */
    public ViewParent f5511a;

    /* renamed from: b */
    public ViewParent f5512b;

    /* renamed from: c */
    public final ViewGroup f5513c;

    /* renamed from: d */
    public boolean f5514d;

    /* renamed from: e */
    public int[] f5515e;

    public C0889s(ViewGroup viewGroup) {
        this.f5513c = viewGroup;
    }

    /* renamed from: a */
    public final boolean m2502a(float f6, float f10, boolean z6) {
        ViewParent viewParentM2506e;
        if (this.f5514d && (viewParentM2506e = m2506e(0)) != null) {
            try {
                return viewParentM2506e.onNestedFling(this.f5513c, f6, f10, z6);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentM2506e);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m2503b(float f6, float f10) {
        ViewParent viewParentM2506e;
        if (this.f5514d && (viewParentM2506e = m2506e(0)) != null) {
            try {
                return viewParentM2506e.onNestedPreFling(this.f5513c, f6, f10);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentM2506e);
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m2504c(int i10, int[] iArr, int i11, int i12, int[] iArr2) {
        ViewParent viewParentM2506e;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f5514d || (viewParentM2506e = m2506e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f5513c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f5515e == null) {
                this.f5515e = new int[2];
            }
            iArr3 = this.f5515e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM2506e instanceof InterfaceC0890t) {
            ((InterfaceC0890t) viewParentM2506e).mo567i(viewGroup, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                viewParentM2506e.onNestedPreScroll(viewGroup, i10, i11, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentM2506e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2505d(int r13, int[] r14, int r15, int r16, int r17, int[] r18, int r19) {
        /*
            r12 = this;
            r6 = r19
            boolean r0 = r12.f5514d
            r8 = 0
            if (r0 == 0) goto L97
            android.view.ViewParent r1 = r12.m2506e(r6)
            if (r1 != 0) goto Lf
            goto L97
        Lf:
            r9 = 1
            if (r13 != 0) goto L20
            if (r15 != 0) goto L20
            if (r16 != 0) goto L20
            if (r17 == 0) goto L19
            goto L20
        L19:
            if (r14 == 0) goto L97
            r14[r8] = r8
            r14[r9] = r8
            return r8
        L20:
            android.view.ViewGroup r2 = r12.f5513c
            if (r14 == 0) goto L2e
            r2.getLocationInWindow(r14)
            r0 = r14[r8]
            r3 = r14[r9]
            r10 = r0
            r11 = r3
            goto L30
        L2e:
            r10 = r8
            r11 = r10
        L30:
            if (r18 != 0) goto L43
            int[] r0 = r12.f5515e
            if (r0 != 0) goto L3b
            r0 = 2
            int[] r0 = new int[r0]
            r12.f5515e = r0
        L3b:
            int[] r0 = r12.f5515e
            r0[r8] = r8
            r0[r9] = r8
            r7 = r0
            goto L45
        L43:
            r7 = r18
        L45:
            boolean r0 = r1 instanceof c6.InterfaceC0891u
            if (r0 == 0) goto L58
            r0 = r1
            c6.u r0 = (c6.InterfaceC0891u) r0
            r3 = r15
            r4 = r16
            r5 = r17
            r1 = r2
            r2 = r13
            r0.mo562d(r1, r2, r3, r4, r5, r6, r7)
        L56:
            r2 = r1
            goto L87
        L58:
            r0 = r7[r8]
            int r0 = r0 + r16
            r7[r8] = r0
            r0 = r7[r9]
            int r0 = r0 + r17
            r7[r9] = r0
            boolean r0 = r1 instanceof c6.InterfaceC0890t
            if (r0 == 0) goto L78
            r0 = r1
            c6.t r0 = (c6.InterfaceC0890t) r0
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r19
            r1 = r2
            r2 = r13
            r0.mo564f(r1, r2, r3, r4, r5, r6)
            goto L56
        L78:
            if (r19 != 0) goto L87
            r3 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r1.onNestedScroll(r2, r3, r4, r5, r6)     // Catch: java.lang.AbstractMethodError -> L84
            goto L87
        L84:
            java.util.Objects.toString(r1)
        L87:
            if (r14 == 0) goto L96
            r2.getLocationInWindow(r14)
            r13 = r14[r8]
            int r13 = r13 - r10
            r14[r8] = r13
            r13 = r14[r9]
            int r13 = r13 - r11
            r14[r9] = r13
        L96:
            return r9
        L97:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.C0889s.m2505d(int, int[], int, int, int, int[], int):boolean");
    }

    /* renamed from: e */
    public final ViewParent m2506e(int i10) {
        if (i10 == 0) {
            return this.f5511a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f5512b;
    }

    /* renamed from: f */
    public final boolean m2507f(int i10) {
        return m2506e(i10) != null;
    }

    /* renamed from: g */
    public final boolean m2508g(int i10, int i11) {
        boolean zOnStartNestedScroll;
        if (!m2507f(i11)) {
            if (this.f5514d) {
                View view = this.f5513c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z6 = parent instanceof InterfaceC0890t;
                    if (z6) {
                        zOnStartNestedScroll = ((InterfaceC0890t) parent).mo565g(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i10);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i11 == 0) {
                            this.f5511a = parent;
                        } else if (i11 == 1) {
                            this.f5512b = parent;
                        }
                        if (z6) {
                            ((InterfaceC0890t) parent).mo566h(view2, view, i10, i11);
                        } else if (i11 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i10);
                            } catch (AbstractMethodError unused2) {
                                Objects.toString(parent);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void m2509h(int i10) {
        ViewParent viewParentM2506e = m2506e(i10);
        if (viewParentM2506e != null) {
            boolean z6 = viewParentM2506e instanceof InterfaceC0890t;
            ViewGroup viewGroup = this.f5513c;
            if (z6) {
                ((InterfaceC0890t) viewParentM2506e).mo561c(i10, viewGroup);
            } else if (i10 == 0) {
                try {
                    viewParentM2506e.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentM2506e);
                }
            }
            if (i10 == 0) {
                this.f5511a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f5512b = null;
            }
        }
    }
}

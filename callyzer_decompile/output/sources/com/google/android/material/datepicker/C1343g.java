package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import c6.C0872b;
import d6.C1613c;
import d6.C1617g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes.dex */
public final class C1343g extends C0872b {

    /* renamed from: d */
    public final /* synthetic */ int f6859d;

    public /* synthetic */ C1343g(int i10) {
        this.f6859d = i10;
    }

    @Override // c6.C0872b
    /* renamed from: c */
    public void mo2337c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f6859d) {
            case 2:
                super.mo2337c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.mo2337c(view, accessibilityEvent);
                break;
        }
    }

    @Override // c6.C0872b
    /* renamed from: d */
    public final void mo2338d(View view, C1617g c1617g) {
        int scrollRange;
        switch (this.f6859d) {
            case 0:
                this.f5422a.onInitializeAccessibilityNodeInfo(view, c1617g.f8062a);
                c1617g.m5293l(null);
                break;
            case 1:
                this.f5422a.onInitializeAccessibilityNodeInfo(view, c1617g.f8062a);
                c1617g.m5293l(null);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = c1617g.f8062a;
                this.f5422a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                c1617g.m5292k("android.widget.ScrollView");
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c1617g.m5284b(C1613c.f8047i);
                        c1617g.m5284b(C1613c.f8051m);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c1617g.m5284b(C1613c.f8046h);
                        c1617g.m5284b(C1613c.f8053o);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // c6.C0872b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2341g(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.f6859d
            switch(r0) {
                case 2: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.mo2341g(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.mo2341g(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L13
            goto La1
        L13:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L1e
            goto La0
        L1e:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L3b
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L3b
            int r7 = r2.height()
        L3b:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L75
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4e
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L4e
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L75
            goto La0
        L4e:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.m776t(r1, r6, r0)
            goto La1
        L75:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.m776t(r1, r6, r0)
            goto La1
        La0:
            r0 = r1
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C1343g.mo2341g(android.view.View, int, android.os.Bundle):boolean");
    }
}

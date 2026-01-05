package com.google.android.material.dockedtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p001o.anh;
import p001o.bkh;
import p001o.ebe;
import p001o.gza;
import p001o.pae;
import p001o.r9j;
import p001o.sj8;
import p001o.x5e;
import p001o.xzi;
import p001o.ykf;
import p001o.zya;

/* loaded from: classes3.dex */
public class DockedToolbarLayout extends FrameLayout {

    /* renamed from: c */
    public static final int f12555c = pae.Widget_Material3_DockedToolbar;

    /* renamed from: a */
    public Boolean f12556a;

    /* renamed from: b */
    public Boolean f12557b;

    /* renamed from: com.google.android.material.dockedtoolbar.DockedToolbarLayout$a */
    public class C11041a implements xzi.InterfaceC18287d {
        public C11041a() {
        }

        @Override // p001o.xzi.InterfaceC18287d
        /* renamed from: a */
        public r9j mo14146a(View view, r9j r9jVar, xzi.C18288e c18288e) {
            if (DockedToolbarLayout.this.f12556a != null && DockedToolbarLayout.this.f12557b != null && !DockedToolbarLayout.this.f12556a.booleanValue() && !DockedToolbarLayout.this.f12557b.booleanValue()) {
                return r9jVar;
            }
            sj8 sj8VarM46391f = r9jVar.m46391f(r9j.C16576m.m46449e());
            sj8 sj8VarM46391f2 = r9jVar.m46391f(r9j.C16576m.m46445a());
            int i = sj8VarM46391f.f45480d + sj8VarM46391f2.f45480d;
            int i2 = sj8VarM46391f.f45478b + sj8VarM46391f2.f45478b;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i3 = (DockedToolbarLayout.this.m14587d(layoutParams, 48) && DockedToolbarLayout.this.f12556a == null && DockedToolbarLayout.this.getFitsSystemWindows()) ? i2 : 0;
            int i4 = (DockedToolbarLayout.this.m14587d(layoutParams, 80) && DockedToolbarLayout.this.f12557b == null && DockedToolbarLayout.this.getFitsSystemWindows()) ? i : 0;
            if (DockedToolbarLayout.this.f12557b != null) {
                if (!DockedToolbarLayout.this.f12557b.booleanValue()) {
                    i = 0;
                }
                i4 = i;
            }
            if (DockedToolbarLayout.this.f12556a != null) {
                if (!DockedToolbarLayout.this.f12556a.booleanValue()) {
                    i2 = 0;
                }
                i3 = i2;
            }
            c18288e.f54659b += i3;
            c18288e.f54661d += i4;
            c18288e.m57085a(view);
            return r9jVar;
        }
    }

    public DockedToolbarLayout(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    public final boolean m14587d(ViewGroup.LayoutParams layoutParams, int i) {
        return layoutParams instanceof CoordinatorLayout.C2012e ? (((CoordinatorLayout.C2012e) layoutParams).f7097c & i) == i : (layoutParams instanceof FrameLayout.LayoutParams) && (((FrameLayout.LayoutParams) layoutParams).gravity & i) == i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            int childCount = getChildCount();
            int iMax = Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom());
            for (int i3 = 0; i3 < childCount; i3++) {
                measureChild(getChildAt(i3), i, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
            }
            setMeasuredDimension(getMeasuredWidth(), iMax);
        }
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.dockedToolbarStyle);
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, f12555c);
    }

    public DockedToolbarLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        anh anhVarM19306j = bkh.m19306j(context2, attributeSet, ebe.DockedToolbar, i, i2, new int[0]);
        if (anhVarM19306j.m17544s(ebe.DockedToolbar_backgroundTint)) {
            int iM17527b = anhVarM19306j.m17527b(ebe.DockedToolbar_backgroundTint, 0);
            zya zyaVar = new zya(ykf.m57925e(context2, attributeSet, i, i2).m57970m());
            zyaVar.g0(ColorStateList.valueOf(iM17527b));
            setBackground(zyaVar);
        }
        if (anhVarM19306j.m17544s(ebe.DockedToolbar_paddingTopSystemWindowInsets)) {
            this.f12556a = Boolean.valueOf(anhVarM19306j.m17526a(ebe.DockedToolbar_paddingTopSystemWindowInsets, true));
        }
        if (anhVarM19306j.m17544s(ebe.DockedToolbar_paddingBottomSystemWindowInsets)) {
            this.f12557b = Boolean.valueOf(anhVarM19306j.m17526a(ebe.DockedToolbar_paddingBottomSystemWindowInsets, true));
        }
        xzi.m57070f(this, new C11041a());
        setImportantForAccessibility(1);
        anhVarM19306j.m17546x();
    }
}

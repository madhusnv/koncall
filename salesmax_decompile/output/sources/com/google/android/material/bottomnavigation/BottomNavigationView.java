package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import p001o.anh;
import p001o.bkh;
import p001o.ebe;
import p001o.pae;
import p001o.r9j;
import p001o.x5e;
import p001o.xzi;

/* loaded from: classes3.dex */
public class BottomNavigationView extends NavigationBarView {

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    public class C10957a implements xzi.InterfaceC18287d {
        public C10957a() {
        }

        @Override // p001o.xzi.InterfaceC18287d
        /* renamed from: a */
        public r9j mo14146a(View view, r9j r9jVar, xzi.C18288e c18288e) {
            c18288e.f54661d += r9jVar.m46394i();
            boolean z = view.getLayoutDirection() == 1;
            int iM46395j = r9jVar.m46395j();
            int iM46396k = r9jVar.m46396k();
            c18288e.f54658a += z ? iM46396k : iM46395j;
            int i = c18288e.f54660c;
            if (!z) {
                iM46395j = iM46396k;
            }
            c18288e.f54660c = i + iM46395j;
            c18288e.m57085a(view);
            return r9jVar;
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    public interface InterfaceC10958b extends NavigationBarView.InterfaceC11079b {
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface InterfaceC10959c extends NavigationBarView.InterfaceC11080c {
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    /* renamed from: c */
    public NavigationBarMenuView mo14151c(Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 6;
    }

    /* renamed from: h */
    public final void m14152h() {
        xzi.m57070f(this, new C10957a());
    }

    /* renamed from: i */
    public final int m14153i(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), Integer.MIN_VALUE);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, m14153i(i2));
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) throws Resources.NotFoundException {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.m14150u() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().mo3967h(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(InterfaceC10958b interfaceC10958b) {
        setOnItemReselectedListener(interfaceC10958b);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC10959c interfaceC10959c) {
        setOnItemSelectedListener(interfaceC10959c);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, pae.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i, i2);
        anh anhVarM19306j = bkh.m19306j(getContext(), attributeSet, ebe.BottomNavigationView, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(anhVarM19306j.m17526a(ebe.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        if (anhVarM19306j.m17544s(ebe.BottomNavigationView_android_minHeight)) {
            setMinimumHeight(anhVarM19306j.m17531f(ebe.BottomNavigationView_android_minHeight, 0));
        }
        anhVarM19306j.m17546x();
        m14152h();
    }
}

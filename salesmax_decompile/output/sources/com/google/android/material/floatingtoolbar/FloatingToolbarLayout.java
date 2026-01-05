package com.google.android.material.floatingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p001o.anh;
import p001o.bkh;
import p001o.cbc;
import p001o.ebe;
import p001o.gza;
import p001o.pae;
import p001o.r9j;
import p001o.sj8;
import p001o.wvi;
import p001o.x5e;
import p001o.ykf;
import p001o.zya;

/* loaded from: classes3.dex */
public class FloatingToolbarLayout extends FrameLayout {

    /* renamed from: s */
    public static final int f12650s = pae.Widget_Material3_FloatingToolbar;

    /* renamed from: a */
    public boolean f12651a;

    /* renamed from: b */
    public boolean f12652b;

    /* renamed from: c */
    public boolean f12653c;

    /* renamed from: d */
    public boolean f12654d;

    /* renamed from: e */
    public Rect f12655e;

    /* renamed from: f */
    public int f12656f;

    /* renamed from: g */
    public int f12657g;

    /* renamed from: h */
    public int f12658h;

    /* renamed from: q */
    public int f12659q;

    /* renamed from: com.google.android.material.floatingtoolbar.FloatingToolbarLayout$a */
    public class C11062a implements cbc {
        public C11062a() {
        }

        @Override // p001o.cbc
        /* renamed from: a */
        public r9j mo3830a(View view, r9j r9jVar) {
            if (!FloatingToolbarLayout.this.f12651a && !FloatingToolbarLayout.this.f12653c && !FloatingToolbarLayout.this.f12652b && !FloatingToolbarLayout.this.f12654d) {
                return r9jVar;
            }
            sj8 sj8VarM46391f = r9jVar.m46391f(r9j.C16576m.m46449e());
            sj8 sj8VarM46391f2 = r9jVar.m46391f(r9j.C16576m.m46445a());
            FloatingToolbarLayout.this.f12656f = sj8VarM46391f.f45480d + sj8VarM46391f2.f45480d;
            FloatingToolbarLayout.this.f12657g = sj8VarM46391f.f45478b + sj8VarM46391f2.f45478b;
            FloatingToolbarLayout.this.f12659q = sj8VarM46391f.f45479c + sj8VarM46391f2.f45479c;
            FloatingToolbarLayout.this.f12658h = sj8VarM46391f.f45477a + sj8VarM46391f2.f45477a;
            FloatingToolbarLayout.this.m14733j();
            return r9jVar;
        }
    }

    public FloatingToolbarLayout(Context context) {
        this(context, null);
    }

    /* renamed from: j */
    public final void m14733j() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.f12655e;
        if (rect == null) {
            return;
        }
        int i = rect.left + (this.f12651a ? this.f12658h : 0);
        int i2 = rect.right + (this.f12653c ? this.f12659q : 0);
        int i3 = rect.top + (this.f12652b ? this.f12657g : 0);
        int i4 = rect.bottom + (this.f12654d ? this.f12656f : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if ((marginLayoutParams.bottomMargin == i4 && marginLayoutParams.leftMargin == i && marginLayoutParams.rightMargin == i2 && marginLayoutParams.topMargin == i3) ? false : true) {
            marginLayoutParams.bottomMargin = i4;
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i2;
            marginLayoutParams.topMargin = i3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            this.f12655e = null;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f12655e = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        m14733j();
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.floatingToolbarStyle);
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, f12650s);
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        anh anhVarM19306j = bkh.m19306j(context2, attributeSet, ebe.FloatingToolbar, i, i2, new int[0]);
        if (anhVarM19306j.m17544s(ebe.FloatingToolbar_backgroundTint)) {
            int iM17527b = anhVarM19306j.m17527b(ebe.FloatingToolbar_backgroundTint, 0);
            zya zyaVar = new zya(ykf.m57925e(context2, attributeSet, i, i2).m57970m());
            zyaVar.g0(ColorStateList.valueOf(iM17527b));
            setBackground(zyaVar);
        }
        this.f12651a = anhVarM19306j.m17526a(ebe.FloatingToolbar_marginLeftSystemWindowInsets, true);
        this.f12652b = anhVarM19306j.m17526a(ebe.FloatingToolbar_marginTopSystemWindowInsets, false);
        this.f12653c = anhVarM19306j.m17526a(ebe.FloatingToolbar_marginRightSystemWindowInsets, true);
        this.f12654d = anhVarM19306j.m17526a(ebe.FloatingToolbar_marginBottomSystemWindowInsets, true);
        wvi.x0(this, new C11062a());
        anhVarM19306j.m17546x();
    }
}

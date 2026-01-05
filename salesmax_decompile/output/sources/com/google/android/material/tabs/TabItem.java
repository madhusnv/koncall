package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p001o.anh;
import p001o.ebe;

/* loaded from: classes3.dex */
public class TabItem extends View {

    /* renamed from: a */
    public final CharSequence f13015a;

    /* renamed from: b */
    public final Drawable f13016b;

    /* renamed from: c */
    public final int f13017c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        anh anhVarM17524u = anh.m17524u(context, attributeSet, ebe.TabItem);
        this.f13015a = anhVarM17524u.m17541p(ebe.TabItem_android_text);
        this.f13016b = anhVarM17524u.m17532g(ebe.TabItem_android_icon);
        this.f13017c = anhVarM17524u.m17539n(ebe.TabItem_android_layout, 0);
        anhVarM17524u.m17546x();
    }
}

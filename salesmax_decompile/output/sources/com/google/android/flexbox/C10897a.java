package com.google.android.flexbox;

import android.view.View;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.flexbox.a */
/* loaded from: classes5.dex */
public class C10897a {

    /* renamed from: e */
    public int f11919e;

    /* renamed from: f */
    public int f11920f;

    /* renamed from: g */
    public int f11921g;

    /* renamed from: h */
    public int f11922h;

    /* renamed from: i */
    public int f11923i;

    /* renamed from: j */
    public float f11924j;

    /* renamed from: k */
    public float f11925k;

    /* renamed from: l */
    public int f11926l;

    /* renamed from: m */
    public int f11927m;

    /* renamed from: o */
    public int f11929o;

    /* renamed from: p */
    public int f11930p;

    /* renamed from: q */
    public boolean f11931q;

    /* renamed from: r */
    public boolean f11932r;

    /* renamed from: a */
    public int f11915a = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: b */
    public int f11916b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: c */
    public int f11917c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f11918d = Integer.MIN_VALUE;

    /* renamed from: n */
    public List f11928n = new ArrayList();

    /* renamed from: a */
    public int m13737a() {
        return this.f11921g;
    }

    /* renamed from: b */
    public int m13738b() {
        return this.f11922h;
    }

    /* renamed from: c */
    public int m13739c() {
        return this.f11922h - this.f11923i;
    }

    /* renamed from: d */
    public void m13740d(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f11915a = Math.min(this.f11915a, (view.getLeft() - flexItem.e2()) - i);
        this.f11916b = Math.min(this.f11916b, (view.getTop() - flexItem.r0()) - i2);
        this.f11917c = Math.max(this.f11917c, view.getRight() + flexItem.O2() + i3);
        this.f11918d = Math.max(this.f11918d, view.getBottom() + flexItem.c2() + i4);
    }
}

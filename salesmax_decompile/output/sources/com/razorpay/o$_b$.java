package com.razorpay;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.RelativeLayout;

/* loaded from: classes6.dex */
final class o$_b$ {

    /* renamed from: a */
    private Context f13795a;

    /* renamed from: b */
    private ViewGroup f13796b;

    /* renamed from: c */
    private View f13797c;

    /* renamed from: d */
    private float f13798d;

    /* renamed from: e */
    private int f13799e;

    /* renamed from: f */
    private String f13800f;

    public o$_b$(Context context, ViewGroup viewGroup) {
        this(context, viewGroup, null);
    }

    /* renamed from: b */
    private int m16094b() {
        TypedValue typedValue = new TypedValue();
        return this.f13795a.getTheme().resolveAttribute(android.R.attr.colorAccent, typedValue, true) ? typedValue.data : Color.parseColor("#4aa3df");
    }

    /* renamed from: c */
    private void m16096c(int i) {
        C11896a c11896a = new C11896a(this.f13797c, m16095b((int) this.f13798d));
        c11896a.setDuration(200L);
        this.f13797c.startAnimation(c11896a);
        c11896a.setAnimationListener(new Animation.AnimationListener() { // from class: com.razorpay.G_$8_
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                this.f13620a.m16092a(0, 10);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        });
    }

    public o$_b$(Context context, ViewGroup viewGroup, String str) {
        int iM16094b;
        this.f13800f = str;
        this.f13795a = context;
        this.f13796b = viewGroup;
        this.f13798d = r3.widthPixels / context.getResources().getDisplayMetrics().density;
        this.f13799e = m16095b(4);
        this.f13797c = new View(this.f13795a);
        this.f13797c.setLayoutParams(new RelativeLayout.LayoutParams(0, this.f13799e));
        if (TextUtils.isEmpty(this.f13800f)) {
            iM16094b = m16094b();
        } else {
            try {
                iM16094b = Color.parseColor(this.f13800f);
            } catch (IllegalArgumentException unused) {
                iM16094b = m16094b();
            }
        }
        float[] fArr = new float[3];
        Color.colorToHSV(iM16094b, fArr);
        fArr[2] = fArr[2] * 0.8f;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iM16094b, Color.HSVToColor(fArr)});
        gradientDrawable.setCornerRadius(0.0f);
        this.f13797c.setBackgroundDrawable(gradientDrawable);
        this.f13796b.addView(this.f13797c);
    }

    /* renamed from: a */
    public final void m16097a() {
        m16096c(200);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m16092a(int i, int i2) {
        C11896a c11896a = new C11896a(this.f13797c, m16095b((int) ((this.f13798d * i) / 100.0f)));
        c11896a.setDuration(i2);
        this.f13797c.startAnimation(c11896a);
        c11896a.setAnimationListener(new Animation.AnimationListener(this) { // from class: com.razorpay.X$_8_
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        });
    }

    /* renamed from: b */
    private int m16095b(int i) {
        return (int) TypedValue.applyDimension(1, i, this.f13795a.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public final void m16098a(int i) {
        if (i == 100) {
            m16096c(200);
        } else {
            m16092a(i, 500);
        }
    }
}

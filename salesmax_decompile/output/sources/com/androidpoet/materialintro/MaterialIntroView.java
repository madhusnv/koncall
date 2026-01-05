package com.androidpoet.materialintro;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.androidpoet.materialintro.MaterialIntroView;
import java.util.ArrayList;
import java.util.List;
import p001o.ih0;
import p001o.j9e;
import p001o.rbc;
import p001o.sq8;
import p001o.wq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class MaterialIntroView extends FrameLayout {

    /* renamed from: a */
    public List f11142a;

    /* renamed from: b */
    public int f11143b;

    /* renamed from: c */
    public long f11144c;

    /* renamed from: d */
    public long f11145d;

    /* renamed from: e */
    public wq8 f11146e;

    /* renamed from: f */
    public wq8 f11147f;

    /* renamed from: g */
    public boolean f11148g;

    /* renamed from: h */
    public boolean f11149h;

    /* renamed from: q */
    public rbc f11150q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialIntroView(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f11142a = new ArrayList();
        this.f11144c = 300L;
        this.f11145d = 300L;
        wq8 wq8Var = wq8.None;
        this.f11146e = wq8Var;
        this.f11147f = wq8Var;
        sq8.m48648g(View.inflate(getContext(), j9e.materialintro, this), "inflate(context, R.layout.materialintro, this)");
        post(new Runnable() { // from class: o.sya
            @Override // java.lang.Runnable
            public final void run() {
                MaterialIntroView.m12639c(this.f46116a);
            }
        });
    }

    /* renamed from: c */
    public static final void m12639c(MaterialIntroView materialIntroView) {
        sq8.m48649h(materialIntroView, "this$0");
        if (!materialIntroView.f11142a.isEmpty()) {
            ih0.m32121c(((Number) materialIntroView.f11142a.get(0)).intValue(), materialIntroView.f11146e, materialIntroView.f11144c, materialIntroView);
        }
    }

    /* renamed from: d */
    public static final void m12640d(xk7 xk7Var, int i) {
        sq8.m48649h(xk7Var, "$block");
        xk7Var.invoke(Integer.valueOf(i));
    }

    public final boolean getEnterTransitionOverlap() {
        return this.f11148g;
    }

    public final int getIndex() {
        return this.f11143b;
    }

    public final List<Integer> getLayoutList() {
        return this.f11142a;
    }

    public final wq8 getNextAnimation() {
        return this.f11146e;
    }

    public final long getNextDuration() {
        return this.f11144c;
    }

    public final wq8 getPreviousAnimation() {
        return this.f11147f;
    }

    public final long getPreviousDuration() {
        return this.f11145d;
    }

    public final boolean getReturnTransitionOverlap() {
        return this.f11149h;
    }

    public final void setEnterTransitionOverlap(boolean z) {
        this.f11148g = z;
    }

    public final void setIndex(int i) {
        this.f11143b = i;
    }

    public final void setLayoutList(List<Integer> list) {
        sq8.m48649h(list, "<set-?>");
        this.f11142a = list;
    }

    public final void setNextAnimation(wq8 wq8Var) {
        sq8.m48649h(wq8Var, "<set-?>");
        this.f11146e = wq8Var;
    }

    public final void setNextDuration(long j) {
        this.f11144c = j;
    }

    public final void setOnIndexChangeListener(rbc rbcVar) {
        sq8.m48649h(rbcVar, "onIndexChangeListener");
        this.f11150q = rbcVar;
    }

    public final void setPreviousAnimation(wq8 wq8Var) {
        sq8.m48649h(wq8Var, "<set-?>");
        this.f11147f = wq8Var;
    }

    public final void setPreviousDuration(long j) {
        this.f11145d = j;
    }

    public final void setReturnTransitionOverlap(boolean z) {
        this.f11149h = z;
    }

    public final void setViewsList(List<Integer> list) {
        sq8.m48649h(list, "list");
        this.f11142a.clear();
        this.f11142a.addAll(list);
    }

    public final /* synthetic */ void setOnIndexChangeListener(final xk7 xk7Var) {
        sq8.m48649h(xk7Var, "block");
        this.f11150q = new rbc() { // from class: o.tya
            @Override // p001o.rbc
            /* renamed from: a */
            public final void mo46489a(int i) {
                MaterialIntroView.m12640d(xk7Var, i);
            }
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialIntroView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attributeSet");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialIntroView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attributeSet");
        this.f11142a = new ArrayList();
        this.f11144c = 300L;
        this.f11145d = 300L;
        wq8 wq8Var = wq8.None;
        this.f11146e = wq8Var;
        this.f11147f = wq8Var;
        sq8.m48648g(View.inflate(getContext(), j9e.materialintro, this), "inflate(context, R.layout.materialintro, this)");
        post(new Runnable() { // from class: o.sya
            @Override // java.lang.Runnable
            public final void run() {
                MaterialIntroView.m12639c(this.f46116a);
            }
        });
    }
}

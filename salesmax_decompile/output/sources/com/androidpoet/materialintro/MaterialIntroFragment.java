package com.androidpoet.materialintro;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.AbstractC2124j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.androidpoet.materialintro.MaterialIntroFragment;
import java.util.ArrayList;
import java.util.List;
import p001o.h8e;
import p001o.ih0;
import p001o.j9e;
import p001o.rbc;
import p001o.sg7;
import p001o.sq8;
import p001o.wq8;
import p001o.xk7;

/* loaded from: classes5.dex */
public final class MaterialIntroFragment extends FrameLayout {

    /* renamed from: a */
    public List f11132a;

    /* renamed from: b */
    public int f11133b;

    /* renamed from: c */
    public long f11134c;

    /* renamed from: d */
    public long f11135d;

    /* renamed from: e */
    public long f11136e;

    /* renamed from: f */
    public long f11137f;

    /* renamed from: g */
    public wq8 f11138g;

    /* renamed from: h */
    public boolean f11139h;

    /* renamed from: q */
    public boolean f11140q;

    /* renamed from: s */
    public rbc f11141s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialIntroFragment(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f11132a = new ArrayList();
        this.f11134c = 300L;
        this.f11135d = 300L;
        this.f11136e = 300L;
        this.f11137f = 300L;
        this.f11138g = wq8.None;
        sq8.m48648g(View.inflate(getContext(), j9e.materialintro, this), "inflate(context, R.layout.materialintro, this)");
        post(new Runnable() { // from class: o.qya
            @Override // java.lang.Runnable
            public final void run() {
                MaterialIntroFragment.m12631c(this.f42620a);
            }
        });
    }

    /* renamed from: c */
    public static final void m12631c(MaterialIntroFragment materialIntroFragment) {
        sq8.m48649h(materialIntroFragment, "this$0");
        if ((!materialIntroFragment.f11132a.isEmpty()) && (!materialIntroFragment.f11132a.isEmpty())) {
            materialIntroFragment.m12636h((Fragment) materialIntroFragment.f11132a.get(0));
        }
    }

    /* renamed from: g */
    public static final void m12632g(xk7 xk7Var, int i) {
        sq8.m48649h(xk7Var, "$block");
        xk7Var.invoke(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final boolean m12633d(List list, int i) {
        return i >= 0 && i < list.size();
    }

    /* renamed from: e */
    public final void m12634e() {
        if (m12633d(this.f11132a, this.f11133b + 1)) {
            int i = this.f11133b + 1;
            this.f11133b = i;
            m12636h((Fragment) this.f11132a.get(i));
            rbc rbcVar = this.f11141s;
            if (rbcVar == null) {
                return;
            }
            rbcVar.mo46489a(this.f11133b);
        }
    }

    /* renamed from: f */
    public final void m12635f() {
        if (m12633d(this.f11132a, this.f11133b - 1)) {
            int i = this.f11133b - 1;
            this.f11133b = i;
            m12636h((Fragment) this.f11132a.get(i));
            rbc rbcVar = this.f11141s;
            if (rbcVar == null) {
                return;
            }
            rbcVar.mo46489a(this.f11133b);
        }
    }

    public final wq8 getEnterAnimation() {
        return this.f11138g;
    }

    public final long getEnterDuration() {
        return this.f11134c;
    }

    public final boolean getEnterTransitionOverlap() {
        return this.f11139h;
    }

    public final long getExitDuration() {
        return this.f11136e;
    }

    public final List<Fragment> getFragmentList() {
        return this.f11132a;
    }

    public final long getReenterDuration() {
        return this.f11135d;
    }

    public final long getReturnDuration() {
        return this.f11137f;
    }

    public final boolean getReturnTransitionOverlap() {
        return this.f11140q;
    }

    /* renamed from: h */
    public final void m12636h(Fragment fragment) {
        FragmentManager supportFragmentManager;
        sg7.m48307b(fragment, this);
        Context context = getContext();
        sq8.m48648g(context, "context");
        AppCompatActivity appCompatActivityM32119a = ih0.m32119a(context);
        if (appCompatActivityM32119a == null || (supportFragmentManager = appCompatActivityM32119a.getSupportFragmentManager()) == null) {
            return;
        }
        AbstractC2124j abstractC2124jM6205q = supportFragmentManager.m6205q();
        sq8.m48648g(abstractC2124jM6205q, "beginTransaction()");
        abstractC2124jM6205q.m6425p(h8e.fragment_container, fragment);
        abstractC2124jM6205q.mo6260h();
    }

    public final void setEnterAnimation(wq8 wq8Var) {
        sq8.m48649h(wq8Var, "<set-?>");
        this.f11138g = wq8Var;
    }

    public final void setEnterDuration(long j) {
        this.f11134c = j;
    }

    public final void setEnterTransitionOverlap(boolean z) {
        this.f11139h = z;
    }

    public final void setExitDuration(long j) {
        this.f11136e = j;
    }

    public final void setFragmentList(List<Fragment> list) {
        sq8.m48649h(list, "<set-?>");
        this.f11132a = list;
    }

    public final void setFragmentsList(List<? extends Fragment> list) {
        sq8.m48649h(list, "list");
        this.f11132a.clear();
        this.f11132a.addAll(list);
    }

    public final void setOnIndexChangeListener(rbc rbcVar) {
        sq8.m48649h(rbcVar, "onIndexChangeListener");
        this.f11141s = rbcVar;
    }

    public final void setReenterDuration(long j) {
        this.f11135d = j;
    }

    public final void setReturnDuration(long j) {
        this.f11137f = j;
    }

    public final void setReturnTransitionOverlap(boolean z) {
        this.f11140q = z;
    }

    public final /* synthetic */ void setOnIndexChangeListener(final xk7 xk7Var) {
        sq8.m48649h(xk7Var, "block");
        this.f11141s = new rbc() { // from class: o.rya
            @Override // p001o.rbc
            /* renamed from: a */
            public final void mo46489a(int i) {
                MaterialIntroFragment.m12632g(xk7Var, i);
            }
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaterialIntroFragment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attributeSet");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialIntroFragment(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attributeSet");
        this.f11132a = new ArrayList();
        this.f11134c = 300L;
        this.f11135d = 300L;
        this.f11136e = 300L;
        this.f11137f = 300L;
        this.f11138g = wq8.None;
        sq8.m48648g(View.inflate(getContext(), j9e.materialintro, this), "inflate(context, R.layout.materialintro, this)");
        post(new Runnable() { // from class: o.qya
            @Override // java.lang.Runnable
            public final void run() {
                MaterialIntroFragment.m12631c(this.f42620a);
            }
        });
    }
}

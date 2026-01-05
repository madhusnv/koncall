package p001o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* loaded from: classes5.dex */
public abstract class r6f {

    /* renamed from: a */
    public FastScroller f43058a;

    /* renamed from: b */
    public svi f43059b;

    /* renamed from: c */
    public svi f43060c;

    /* renamed from: a */
    public svi m46260a() {
        if (this.f43060c == null) {
            this.f43060c = mo46269j();
        }
        return this.f43060c;
    }

    /* renamed from: b */
    public abstract int mo46261b();

    /* renamed from: c */
    public Context m46262c() {
        return this.f43058a.getContext();
    }

    /* renamed from: d */
    public svi m46263d() {
        if (this.f43059b == null) {
            this.f43059b = mo46272m();
        }
        return this.f43059b;
    }

    /* renamed from: e */
    public FastScroller m46264e() {
        return this.f43058a;
    }

    /* renamed from: f */
    public void m46265f() {
        if (m46263d() != null) {
            m46263d().mo26435a();
        }
        if (m46260a() != null) {
            m46260a().mo26435a();
        }
    }

    /* renamed from: g */
    public void m46266g() {
        if (m46263d() != null) {
            m46263d().mo26436b();
        }
        if (m46260a() != null) {
            m46260a().mo26436b();
        }
    }

    /* renamed from: h */
    public void m46267h() {
        if (m46263d() != null) {
            m46263d().mo26437c();
        }
        if (m46260a() != null) {
            m46260a().mo26437c();
        }
    }

    /* renamed from: i */
    public void m46268i() {
        if (m46263d() != null) {
            m46263d().mo26438d();
        }
        if (m46260a() != null) {
            m46260a().mo26438d();
        }
    }

    /* renamed from: j */
    public abstract svi mo46269j();

    /* renamed from: k */
    public abstract TextView mo46270k();

    /* renamed from: l */
    public abstract View mo46271l(ViewGroup viewGroup);

    /* renamed from: m */
    public abstract svi mo46272m();

    /* renamed from: n */
    public abstract View mo46273n(ViewGroup viewGroup);

    /* renamed from: o */
    public void m46274o(FastScroller fastScroller) {
        this.f43058a = fastScroller;
    }
}

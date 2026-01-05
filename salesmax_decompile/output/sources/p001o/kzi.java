package p001o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class kzi extends qe1 {

    /* renamed from: f */
    public static boolean f32892f;

    /* renamed from: g */
    public static int f32893g = j8e.glide_custom_view_target_tag;

    /* renamed from: a */
    public final View f32894a;

    /* renamed from: b */
    public final C14945a f32895b;

    /* renamed from: c */
    public View.OnAttachStateChangeListener f32896c;

    /* renamed from: d */
    public boolean f32897d;

    /* renamed from: e */
    public boolean f32898e;

    /* renamed from: o.kzi$a */
    public static final class C14945a {

        /* renamed from: e */
        public static Integer f32899e;

        /* renamed from: a */
        public final View f32900a;

        /* renamed from: b */
        public final List f32901b = new ArrayList();

        /* renamed from: c */
        public boolean f32902c;

        /* renamed from: d */
        public a f32903d;

        /* renamed from: o.kzi$a$a */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference f32904a;

            public a(C14945a c14945a) {
                this.f32904a = new WeakReference(c14945a);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                C14945a c14945a = (C14945a) this.f32904a.get();
                if (c14945a == null) {
                    return true;
                }
                c14945a.m36391a();
                return true;
            }
        }

        public C14945a(View view) {
            this.f32900a = view;
        }

        /* renamed from: c */
        public static int m36390c(Context context) {
            if (f32899e == null) {
                Display defaultDisplay = ((WindowManager) bgd.m18886d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f32899e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f32899e.intValue();
        }

        /* renamed from: a */
        public void m36391a() {
            if (this.f32901b.isEmpty()) {
                return;
            }
            int iM36396g = m36396g();
            int iM36395f = m36395f();
            if (m36398i(iM36396g, iM36395f)) {
                m36399j(iM36396g, iM36395f);
                m36392b();
            }
        }

        /* renamed from: b */
        public void m36392b() {
            ViewTreeObserver viewTreeObserver = this.f32900a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f32903d);
            }
            this.f32903d = null;
            this.f32901b.clear();
        }

        /* renamed from: d */
        public void m36393d(kvf kvfVar) {
            int iM36396g = m36396g();
            int iM36395f = m36395f();
            if (m36398i(iM36396g, iM36395f)) {
                kvfVar.mo36260e(iM36396g, iM36395f);
                return;
            }
            if (!this.f32901b.contains(kvfVar)) {
                this.f32901b.add(kvfVar);
            }
            if (this.f32903d == null) {
                ViewTreeObserver viewTreeObserver = this.f32900a.getViewTreeObserver();
                a aVar = new a(this);
                this.f32903d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* renamed from: e */
        public final int m36394e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f32902c && this.f32900a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f32900a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            return m36390c(this.f32900a.getContext());
        }

        /* renamed from: f */
        public final int m36395f() {
            int paddingTop = this.f32900a.getPaddingTop() + this.f32900a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f32900a.getLayoutParams();
            return m36394e(this.f32900a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        public final int m36396g() {
            int paddingLeft = this.f32900a.getPaddingLeft() + this.f32900a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f32900a.getLayoutParams();
            return m36394e(this.f32900a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        public final boolean m36397h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean m36398i(int i, int i2) {
            return m36397h(i) && m36397h(i2);
        }

        /* renamed from: j */
        public final void m36399j(int i, int i2) {
            Iterator it = new ArrayList(this.f32901b).iterator();
            while (it.hasNext()) {
                ((kvf) it.next()).mo36260e(i, i2);
            }
        }

        /* renamed from: k */
        public void m36400k(kvf kvfVar) {
            this.f32901b.remove(kvfVar);
        }
    }

    public kzi(View view) {
        this.f32894a = (View) bgd.m18886d(view);
        this.f32895b = new C14945a(view);
    }

    @Override // p001o.pjg
    /* renamed from: a */
    public wle mo36380a() {
        Object objM36386k = m36386k();
        if (objM36386k == null) {
            return null;
        }
        if (objM36386k instanceof wle) {
            return (wle) objM36386k;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p001o.pjg
    /* renamed from: b */
    public void mo36381b(kvf kvfVar) {
        this.f32895b.m36400k(kvfVar);
    }

    @Override // p001o.pjg
    /* renamed from: d */
    public void mo36382d(wle wleVar) {
        m36389n(wleVar);
    }

    @Override // p001o.pjg
    /* renamed from: e */
    public void mo36383e(kvf kvfVar) {
        this.f32895b.m36393d(kvfVar);
    }

    @Override // p001o.qe1, p001o.pjg
    /* renamed from: g */
    public void mo36384g(Drawable drawable) {
        super.mo36384g(drawable);
        m36387l();
    }

    @Override // p001o.qe1, p001o.pjg
    /* renamed from: h */
    public void mo36385h(Drawable drawable) {
        super.mo36385h(drawable);
        this.f32895b.m36392b();
        if (this.f32897d) {
            return;
        }
        m36388m();
    }

    /* renamed from: k */
    public final Object m36386k() {
        return this.f32894a.getTag(f32893g);
    }

    /* renamed from: l */
    public final void m36387l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f32896c;
        if (onAttachStateChangeListener == null || this.f32898e) {
            return;
        }
        this.f32894a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f32898e = true;
    }

    /* renamed from: m */
    public final void m36388m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f32896c;
        if (onAttachStateChangeListener == null || !this.f32898e) {
            return;
        }
        this.f32894a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f32898e = false;
    }

    /* renamed from: n */
    public final void m36389n(Object obj) {
        f32892f = true;
        this.f32894a.setTag(f32893g, obj);
    }

    public String toString() {
        return "Target for: " + this.f32894a;
    }
}

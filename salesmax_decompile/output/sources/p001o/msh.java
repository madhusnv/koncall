package p001o;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes2.dex */
public class msh implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: x */
    public static msh f35920x;

    /* renamed from: y */
    public static msh f35921y;

    /* renamed from: a */
    public final View f35922a;

    /* renamed from: b */
    public final CharSequence f35923b;

    /* renamed from: c */
    public final int f35924c;

    /* renamed from: d */
    public final Runnable f35925d = new Runnable() { // from class: o.ksh
        @Override // java.lang.Runnable
        public final void run() throws Resources.NotFoundException {
            this.f32671a.m39618e();
        }
    };

    /* renamed from: e */
    public final Runnable f35926e = new Runnable() { // from class: o.lsh
        @Override // java.lang.Runnable
        public final void run() {
            this.f34350a.m39623d();
        }
    };

    /* renamed from: f */
    public int f35927f;

    /* renamed from: g */
    public int f35928g;

    /* renamed from: h */
    public osh f35929h;

    /* renamed from: q */
    public boolean f35930q;

    /* renamed from: s */
    public boolean f35931s;

    public msh(View view, CharSequence charSequence) {
        this.f35922a = view;
        this.f35923b = charSequence;
        this.f35924c = cwi.m21948g(ViewConfiguration.get(view.getContext()));
        m39622c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m39618e() throws Resources.NotFoundException {
        m39625i(false);
    }

    /* renamed from: g */
    public static void m39619g(msh mshVar) {
        msh mshVar2 = f35920x;
        if (mshVar2 != null) {
            mshVar2.m39621b();
        }
        f35920x = mshVar;
        if (mshVar != null) {
            mshVar.m39624f();
        }
    }

    /* renamed from: h */
    public static void m39620h(View view, CharSequence charSequence) {
        msh mshVar = f35920x;
        if (mshVar != null && mshVar.f35922a == view) {
            m39619g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new msh(view, charSequence);
            return;
        }
        msh mshVar2 = f35921y;
        if (mshVar2 != null && mshVar2.f35922a == view) {
            mshVar2.m39623d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* renamed from: b */
    public final void m39621b() {
        this.f35922a.removeCallbacks(this.f35925d);
    }

    /* renamed from: c */
    public final void m39622c() {
        this.f35931s = true;
    }

    /* renamed from: d */
    public void m39623d() {
        if (f35921y == this) {
            f35921y = null;
            osh oshVar = this.f35929h;
            if (oshVar != null) {
                oshVar.m42636c();
                this.f35929h = null;
                m39622c();
                this.f35922a.removeOnAttachStateChangeListener(this);
            }
        }
        if (f35920x == this) {
            m39619g(null);
        }
        this.f35922a.removeCallbacks(this.f35926e);
    }

    /* renamed from: f */
    public final void m39624f() {
        this.f35922a.postDelayed(this.f35925d, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: i */
    public void m39625i(boolean z) throws Resources.NotFoundException {
        long longPressTimeout;
        long j;
        long j2;
        if (this.f35922a.isAttachedToWindow()) {
            m39619g(null);
            msh mshVar = f35921y;
            if (mshVar != null) {
                mshVar.m39623d();
            }
            f35921y = this;
            this.f35930q = z;
            osh oshVar = new osh(this.f35922a.getContext());
            this.f35929h = oshVar;
            oshVar.m42638e(this.f35922a, this.f35927f, this.f35928g, this.f35930q, this.f35923b);
            this.f35922a.addOnAttachStateChangeListener(this);
            if (this.f35930q) {
                j2 = 2500;
            } else {
                if ((wvi.m55099L(this.f35922a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            this.f35922a.removeCallbacks(this.f35926e);
            this.f35922a.postDelayed(this.f35926e, j2);
        }
    }

    /* renamed from: j */
    public final boolean m39626j(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f35931s && Math.abs(x - this.f35927f) <= this.f35924c && Math.abs(y - this.f35928g) <= this.f35924c) {
            return false;
        }
        this.f35927f = x;
        this.f35928g = y;
        this.f35931s = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f35929h != null && this.f35930q) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f35922a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m39622c();
                m39623d();
            }
        } else if (this.f35922a.isEnabled() && this.f35929h == null && m39626j(motionEvent)) {
            m39619g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f35927f = view.getWidth() / 2;
        this.f35928g = view.getHeight() / 2;
        m39625i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m39623d();
    }
}

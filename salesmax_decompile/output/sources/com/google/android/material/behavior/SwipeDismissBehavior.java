package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p001o.cc;
import p001o.fwi;
import p001o.jc;
import p001o.wvi;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    public fwi f12108a;

    /* renamed from: b */
    public InterfaceC10944c f12109b;

    /* renamed from: c */
    public boolean f12110c;

    /* renamed from: d */
    public boolean f12111d;

    /* renamed from: f */
    public boolean f12113f;

    /* renamed from: e */
    public float f12112e = 0.0f;

    /* renamed from: g */
    public int f12114g = 2;

    /* renamed from: h */
    public float f12115h = 0.5f;

    /* renamed from: q */
    public float f12116q = 0.0f;

    /* renamed from: s */
    public float f12117s = 0.5f;

    /* renamed from: x */
    public final fwi.AbstractC13588c f12118x = new C10942a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C10942a extends fwi.AbstractC13588c {

        /* renamed from: a */
        public int f12119a;

        /* renamed from: b */
        public int f12120b = -1;

        public C10942a() {
        }

        /* renamed from: a */
        public final boolean m14121a(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.f12119a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f12115h);
            }
            boolean z = view.getLayoutDirection() == 1;
            int i = SwipeDismissBehavior.this.f12114g;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            if (z) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (f >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // p001o.fwi.AbstractC13588c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = view.getLayoutDirection() == 1;
            int i3 = SwipeDismissBehavior.this.f12114g;
            if (i3 == 0) {
                if (z) {
                    width = this.f12119a - view.getWidth();
                    width2 = this.f12119a;
                } else {
                    width = this.f12119a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.f12119a - view.getWidth();
                width2 = view.getWidth() + this.f12119a;
            } else if (z) {
                width = this.f12119a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f12119a - view.getWidth();
                width2 = this.f12119a;
            }
            return SwipeDismissBehavior.m14112L(width, i, width2);
        }

        @Override // p001o.fwi.AbstractC13588c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p001o.fwi.AbstractC13588c
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewCaptured(View view, int i) {
            this.f12120b = i;
            this.f12119a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f12111d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f12111d = false;
            }
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewDragStateChanged(int i) {
            InterfaceC10944c interfaceC10944c = SwipeDismissBehavior.this.f12109b;
            if (interfaceC10944c != null) {
                interfaceC10944c.mo14123b(i);
            }
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f12116q;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f12117s;
            float fAbs = Math.abs(i - this.f12119a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m14111K(0.0f, 1.0f - SwipeDismissBehavior.m14113N(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // p001o.fwi.AbstractC13588c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onViewReleased(View view, float f, float f2) {
            int i;
            boolean z;
            InterfaceC10944c interfaceC10944c;
            this.f12120b = -1;
            int width = view.getWidth();
            if (!m14121a(view, f)) {
                i = this.f12119a;
                z = false;
            } else if (f >= 0.0f) {
                int left = view.getLeft();
                int i2 = this.f12119a;
                i = left < i2 ? this.f12119a - width : i2 + width;
                z = true;
            }
            if (SwipeDismissBehavior.this.f12108a.m27681P(i, view.getTop())) {
                view.postOnAnimation(new RunnableC10945d(view, z));
            } else {
                if (!z || (interfaceC10944c = SwipeDismissBehavior.this.f12109b) == null) {
                    return;
                }
                interfaceC10944c.mo14122a(view);
            }
        }

        @Override // p001o.fwi.AbstractC13588c
        public boolean tryCaptureView(View view, int i) {
            int i2 = this.f12120b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo14114J(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class C10943b implements jc {
        public C10943b() {
        }

        @Override // p001o.jc
        /* renamed from: a */
        public boolean mo6030a(View view, jc.AbstractC14493a abstractC14493a) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.mo14114J(view)) {
                return false;
            }
            boolean z2 = view.getLayoutDirection() == 1;
            int i = SwipeDismissBehavior.this.f12114g;
            if ((i == 0 && z2) || (i == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            wvi.m55110W(view, width);
            view.setAlpha(0.0f);
            InterfaceC10944c interfaceC10944c = SwipeDismissBehavior.this.f12109b;
            if (interfaceC10944c != null) {
                interfaceC10944c.mo14122a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface InterfaceC10944c {
        /* renamed from: a */
        void mo14122a(View view);

        /* renamed from: b */
        void mo14123b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    public class RunnableC10945d implements Runnable {

        /* renamed from: a */
        public final View f12123a;

        /* renamed from: b */
        public final boolean f12124b;

        public RunnableC10945d(View view, boolean z) {
            this.f12123a = view;
            this.f12124b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC10944c interfaceC10944c;
            fwi fwiVar = SwipeDismissBehavior.this.f12108a;
            if (fwiVar != null && fwiVar.m27698n(true)) {
                this.f12123a.postOnAnimation(this);
            } else {
                if (!this.f12124b || (interfaceC10944c = SwipeDismissBehavior.this.f12109b) == null) {
                    return;
                }
                interfaceC10944c.mo14122a(this.f12123a);
            }
        }
    }

    /* renamed from: K */
    public static float m14111K(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: L */
    public static int m14112L(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: N */
    public static float m14113N(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: H */
    public boolean mo5767H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f12108a == null) {
            return false;
        }
        if (this.f12111d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f12108a.m27672G(motionEvent);
        return true;
    }

    /* renamed from: J */
    public boolean mo14114J(View view) {
        return true;
    }

    /* renamed from: M */
    public final void m14115M(ViewGroup viewGroup) {
        if (this.f12108a == null) {
            this.f12108a = this.f12113f ? fwi.m27664o(viewGroup, this.f12112e, this.f12118x) : fwi.m27665p(viewGroup, this.f12118x);
        }
    }

    /* renamed from: O */
    public void m14116O(float f) {
        this.f12117s = m14111K(0.0f, f, 1.0f);
    }

    /* renamed from: P */
    public void m14117P(InterfaceC10944c interfaceC10944c) {
        this.f12109b = interfaceC10944c;
    }

    /* renamed from: Q */
    public void m14118Q(float f) {
        this.f12116q = m14111K(0.0f, f, 1.0f);
    }

    /* renamed from: R */
    public void m14119R(int i) {
        this.f12114g = i;
    }

    /* renamed from: S */
    public final void m14120S(View view) {
        wvi.g0(view, 1048576);
        if (mo14114J(view)) {
            wvi.i0(view, cc.C12624a.f17813y, null, new C10943b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: o */
    public boolean mo5778o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM5730F = this.f12110c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM5730F = coordinatorLayout.m5730F(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f12110c = zM5730F;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f12110c = false;
        }
        if (!zM5730F) {
            return false;
        }
        m14115M(coordinatorLayout);
        return !this.f12111d && this.f12108a.m27682Q(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: p */
    public boolean mo5779p(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean zMo5779p = super.mo5779p(coordinatorLayout, view, i);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            m14120S(view);
        }
        return zMo5779p;
    }
}

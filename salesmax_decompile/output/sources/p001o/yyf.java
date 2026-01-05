package p001o;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.yyf;

/* loaded from: classes2.dex */
public final class yyf {

    /* renamed from: a */
    public final C18531c f56291a;

    /* renamed from: o.yyf$a */
    public static class C18529a extends C18531c {

        /* renamed from: a */
        public final View f56292a;

        public C18529a(View view) {
            this.f56292a = view;
        }

        /* renamed from: d */
        public static /* synthetic */ void m58532d(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // p001o.yyf.C18531c
        /* renamed from: a */
        public void mo58533a() {
            View view = this.f56292a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f56292a.getWindowToken(), 0);
            }
        }

        @Override // p001o.yyf.C18531c
        /* renamed from: b */
        public void mo58534b() {
            final View viewFindViewById = this.f56292a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f56292a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: o.pyf
                @Override // java.lang.Runnable
                public final void run() {
                    yyf.C18529a.m58532d(viewFindViewById);
                }
            });
        }
    }

    /* renamed from: o.yyf$c */
    public static class C18531c {
        /* renamed from: a */
        public abstract void mo58533a();

        /* renamed from: b */
        public abstract void mo58534b();
    }

    public yyf(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f56291a = new C18530b(view);
        } else {
            this.f56291a = new C18529a(view);
        }
    }

    /* renamed from: a */
    public void m58529a() {
        this.f56291a.mo58533a();
    }

    /* renamed from: b */
    public void m58530b() {
        this.f56291a.mo58534b();
    }

    /* renamed from: o.yyf$b */
    public static class C18530b extends C18529a {

        /* renamed from: b */
        public View f56293b;

        /* renamed from: c */
        public WindowInsetsController f56294c;

        public C18530b(View view) {
            super(view);
            this.f56293b = view;
        }

        /* renamed from: f */
        public static /* synthetic */ void m58536f(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i) {
            atomicBoolean.set((i & 8) != 0);
        }

        @Override // p001o.yyf.C18529a, p001o.yyf.C18531c
        /* renamed from: a */
        public void mo58533a() {
            View view;
            WindowInsetsController windowInsetsController = this.f56294c;
            if (windowInsetsController == null) {
                View view2 = this.f56293b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.mo58533a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: o.xyf
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    yyf.C18530b.m58536f(atomicBoolean, windowInsetsController2, i);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f56293b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f56293b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // p001o.yyf.C18529a, p001o.yyf.C18531c
        /* renamed from: b */
        public void mo58534b() {
            View view = this.f56293b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f56294c;
            if (windowInsetsController == null) {
                View view2 = this.f56293b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.mo58534b();
        }

        public C18530b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f56294c = windowInsetsController;
        }
    }

    public yyf(WindowInsetsController windowInsetsController) {
        this.f56291a = new C18530b(windowInsetsController);
    }
}

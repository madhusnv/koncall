package w3;

import al.C0182j;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.C0348m;
import com.websoptimization.callyzerbiz.R;
import cp.C1475f;
import d7.AbstractC1646r;
import d7.InterfaceC1649u;
import ex.InterfaceC2137a;
import java.lang.ref.WeakReference;
import k2.AbstractC3969r;
import k2.InterfaceC3962k;
import k2.InterfaceC3968q;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C4168z;
import p012n.ViewOnAttachStateChangeListenerC4924d;
import pg.z8;
import qw.C6366p;
import s2.C6734c;
import s3.AbstractC6744a;
import u7.C7351a;
import uw.C7565i;
import uw.InterfaceC7564h;
import ux.AbstractC7570d;
import ux.C7569c;
import w2.C7864c;
import w2.InterfaceC7880s;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.a */
/* loaded from: classes.dex */
public abstract class AbstractC7883a extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<AbstractC3969r> cachedViewTreeCompositionContext;
    private InterfaceC3968q composition;
    private boolean creatingComposition;
    private InterfaceC2137a disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private AbstractC3969r parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    public AbstractC7883a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC4924d viewOnAttachStateChangeListenerC4924d = new ViewOnAttachStateChangeListenerC4924d(3, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC4924d);
        C7892j c7892j = new C7892j(2);
        z8.m11968c(this).f20787a.add(c7892j);
        this.disposeViewCompositionStrategy = new C0348m(8, this, viewOnAttachStateChangeListenerC4924d, c7892j);
    }

    private final void setParentContext(AbstractC3969r abstractC3969r) {
        if (this.parentContext != abstractC3969r) {
            this.parentContext = abstractC3969r;
            if (abstractC3969r != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            InterfaceC3968q interfaceC3968q = this.composition;
            if (interfaceC3968q != null) {
                interfaceC3968q.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    m14854b();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public abstract void Content(InterfaceC3962k interfaceC3962k, int i10);

    /* renamed from: a */
    public final void m14853a() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        m14853a();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        m14853a();
        return super.addViewInLayout(view, i10, layoutParams);
    }

    /* renamed from: b */
    public final void m14854b() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = i3.m14960a(this, m14855c(), new C6734c(new C1475f(23, this), true, -656146368));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final AbstractC3969r m14855c() {
        k2.q1 q1Var;
        InterfaceC7564h interfaceC7564h;
        k2.g1 g1Var;
        AbstractC3969r abstractC3969rM14903b = this.parentContext;
        if (abstractC3969rM14903b == null) {
            abstractC3969rM14903b = d3.m14903b(this);
            if (abstractC3969rM14903b == null) {
                for (ViewParent parent = getParent(); abstractC3969rM14903b == null && (parent instanceof View); parent = parent.getParent()) {
                    abstractC3969rM14903b = d3.m14903b((View) parent);
                }
            }
            if (abstractC3969rM14903b != null) {
                AbstractC3969r abstractC3969r = (!(abstractC3969rM14903b instanceof k2.q1) || ((k2.o1) ((k2.q1) abstractC3969rM14903b).f20537t.getValue()).compareTo(k2.o1.ShuttingDown) > 0) ? abstractC3969rM14903b : null;
                if (abstractC3969r != null) {
                    this.cachedViewTreeCompositionContext = new WeakReference<>(abstractC3969r);
                }
            } else {
                abstractC3969rM14903b = null;
            }
            if (abstractC3969rM14903b == null) {
                WeakReference<AbstractC3969r> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference == null || (abstractC3969rM14903b = weakReference.get()) == null || ((abstractC3969rM14903b instanceof k2.q1) && ((k2.o1) ((k2.q1) abstractC3969rM14903b).f20537t.getValue()).compareTo(k2.o1.ShuttingDown) <= 0)) {
                    abstractC3969rM14903b = null;
                }
                if (abstractC3969rM14903b == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC6744a.m12907b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    AbstractC3969r abstractC3969rM14903b2 = d3.m14903b(view);
                    if (abstractC3969rM14903b2 == null) {
                        ((y2) z2.f38070a.get()).getClass();
                        C7565i c7565i = C7565i.f36440a;
                        C6366p c6366p = u0.f37968n;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC7564h = (InterfaceC7564h) u0.f37968n.getValue();
                        } else {
                            interfaceC7564h = (InterfaceC7564h) u0.f37969p.get();
                            if (interfaceC7564h == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        InterfaceC7564h interfaceC7564hT0 = interfaceC7564h.t0(c7565i);
                        k2.t0 t0Var = (k2.t0) interfaceC7564hT0.o0(k2.s0.f20543b);
                        if (t0Var != null) {
                            k2.g1 g1Var2 = new k2.g1(t0Var);
                            C0182j c0182j = (C0182j) g1Var2.f20393c;
                            synchronized (c0182j.f555b) {
                                c0182j.f554a = false;
                                g1Var = g1Var2;
                            }
                        } else {
                            g1Var = 0;
                        }
                        C4168z c4168z = new C4168z();
                        InterfaceC7564h y1Var = (InterfaceC7880s) interfaceC7564hT0.o0(C7864c.f37657r);
                        if (y1Var == null) {
                            y1Var = new y1();
                            c4168z.f21164a = y1Var;
                        }
                        if (g1Var != 0) {
                            c7565i = g1Var;
                        }
                        InterfaceC7564h interfaceC7564hT02 = interfaceC7564hT0.t0(c7565i).t0(y1Var);
                        k2.q1 q1Var2 = new k2.q1(interfaceC7564hT02);
                        synchronized (q1Var2.f20519b) {
                            q1Var2.f20536s = true;
                        }
                        C8810d c8810dM13479b = tx.c0.m13479b(interfaceC7564hT02);
                        InterfaceC1649u interfaceC1649uM5337d = d7.q0.m5337d(view);
                        AbstractC1646r lifecycle = interfaceC1649uM5337d != null ? interfaceC1649uM5337d.getLifecycle() : null;
                        if (lifecycle == null) {
                            AbstractC6744a.m12908c("ViewTreeLifecycleOwner not found from " + view);
                            throw new KotlinNothingValueException();
                        }
                        view.addOnAttachStateChangeListener(new a3(view, q1Var2));
                        lifecycle.mo5343a(new c3(c8810dM13479b, g1Var, q1Var2, c4168z, view));
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, q1Var2);
                        tx.z0 z0Var = tx.z0.f34701a;
                        Handler handler = view.getHandler();
                        int i10 = AbstractC7570d.f36447a;
                        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC4924d(4, tx.c0.m13502y(z0Var, new C7569c(handler, "windowRecomposer cleanup", false).f36446f, null, new C7351a(q1Var2, view, interfaceC7559c, 10), 2)));
                        q1Var = q1Var2;
                    } else {
                        if (!(abstractC3969rM14903b2 instanceof k2.q1)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        q1Var = (k2.q1) abstractC3969rM14903b2;
                    }
                    interfaceC7559c = ((k2.o1) q1Var.f20537t.getValue()).compareTo(k2.o1.ShuttingDown) > 0 ? q1Var : null;
                    if (interfaceC7559c != null) {
                        this.cachedViewTreeCompositionContext = new WeakReference<>(interfaceC7559c);
                    }
                    return q1Var;
                }
            }
        }
        return abstractC3969rM14903b;
    }

    public final void createComposition() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        m14854b();
    }

    public final void disposeComposition() {
        InterfaceC3968q interfaceC3968q = this.composition;
        if (interfaceC3968q != null) {
            interfaceC3968q.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z6, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i12 - i10) - getPaddingRight(), (i13 - i11) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i10, i11);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i10)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i11)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            m14854b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        internalOnLayout$ui_release(z6, i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        m14854b();
        internalOnMeasure$ui_release(i10, i11);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i10);
    }

    public final void setParentCompositionContext(AbstractC3969r abstractC3969r) {
        setParentContext(abstractC3969r);
    }

    public final void setShowLayoutBounds(boolean z6) {
        this.showLayoutBounds = z6;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((C7904v) ((v3.p1) childAt)).setShowLayoutBounds(z6);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z6) {
        super.setTransitionGroup(z6);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(s2 s2Var) {
        InterfaceC2137a interfaceC2137a = this.disposeViewCompositionStrategy;
        if (interfaceC2137a != null) {
            interfaceC2137a.invoke();
        }
        ((m0) s2Var).getClass();
        ViewOnAttachStateChangeListenerC4924d viewOnAttachStateChangeListenerC4924d = new ViewOnAttachStateChangeListenerC4924d(3, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC4924d);
        C7892j c7892j = new C7892j(2);
        z8.m11968c(this).f20787a.add(c7892j);
        this.disposeViewCompositionStrategy = new C0348m(8, this, viewOnAttachStateChangeListenerC4924d, c7892j);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        m14853a();
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z6) {
        m14853a();
        return super.addViewInLayout(view, i10, layoutParams, z6);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        m14853a();
        super.addView(view, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m14853a();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        m14853a();
        super.addView(view, i10, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}

package p012n;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p013o.C5220f;
import p013o.C5221g;
import p013o.C5222h;
import p013o.z0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n.a */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC4921a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f24483a;

    /* renamed from: b */
    public final int f24484b;

    /* renamed from: c */
    public final int f24485c;

    /* renamed from: d */
    public final View f24486d;

    /* renamed from: e */
    public z0 f24487e;

    /* renamed from: f */
    public z0 f24488f;

    /* renamed from: g */
    public boolean f24489g;

    /* renamed from: h */
    public int f24490h;

    /* renamed from: j */
    public final int[] f24491j;

    /* renamed from: k */
    public final /* synthetic */ int f24492k;

    /* renamed from: l */
    public final /* synthetic */ View f24493l;

    public ViewOnTouchListenerC4921a(View view) {
        this.f24491j = new int[2];
        this.f24486d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f24483a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f24484b = tapTimeout;
        this.f24485c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: a */
    public final void m9826a() {
        z0 z0Var = this.f24488f;
        View view = this.f24486d;
        if (z0Var != null) {
            view.removeCallbacks(z0Var);
        }
        z0 z0Var2 = this.f24487e;
        if (z0Var2 != null) {
            view.removeCallbacks(z0Var2);
        }
    }

    /* renamed from: b */
    public final AbstractC4931k m9827b() {
        C5220f c5220f;
        switch (this.f24492k) {
            case 0:
                AbstractC4922b abstractC4922b = ((ActionMenuItemView) this.f24493l).f1677f;
                if (abstractC4922b == null || (c5220f = ((C5221g) abstractC4922b).f25495a.f25532v) == null) {
                    return null;
                }
                return c5220f.m9880a();
            default:
                C5220f c5220f2 = ((C5222h) this.f24493l).f25499d.f25531t;
                if (c5220f2 == null) {
                    return null;
                }
                return c5220f2.m9880a();
        }
    }

    /* renamed from: c */
    public final boolean m9828c() {
        AbstractC4931k abstractC4931kM9827b;
        switch (this.f24492k) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f24493l;
                InterfaceC4928h interfaceC4928h = actionMenuItemView.f1675d;
                return interfaceC4928h != null && interfaceC4928h.mo555b(actionMenuItemView.f1672a) && (abstractC4931kM9827b = m9827b()) != null && abstractC4931kM9827b.mo9836e();
            default:
                ((C5222h) this.f24493l).f25499d.m10243h();
                return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012n.ViewOnTouchListenerC4921a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f24489g = false;
        this.f24490h = -1;
        z0 z0Var = this.f24487e;
        if (z0Var != null) {
            this.f24486d.removeCallbacks(z0Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC4921a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f24492k = 0;
        this.f24493l = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnTouchListenerC4921a(C5222h c5222h, C5222h c5222h2) {
        this(c5222h2);
        this.f24492k = 1;
        this.f24493l = c5222h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

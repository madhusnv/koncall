package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p001o.cc;
import p001o.db;
import p001o.gza;
import p001o.jc;
import p001o.pae;
import p001o.v9e;
import p001o.wvi;
import p001o.x5e;

/* loaded from: classes3.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: y */
    public static final int f12194y = pae.Widget_Material3_BottomSheet_DragHandle;

    /* renamed from: d */
    public final AccessibilityManager f12195d;

    /* renamed from: e */
    public BottomSheetBehavior f12196e;

    /* renamed from: f */
    public boolean f12197f;

    /* renamed from: g */
    public boolean f12198g;

    /* renamed from: h */
    public boolean f12199h;

    /* renamed from: q */
    public final String f12200q;

    /* renamed from: s */
    public final String f12201s;

    /* renamed from: x */
    public final BottomSheetBehavior.AbstractC10967g f12202x;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$a */
    public class C10971a extends BottomSheetBehavior.AbstractC10967g {
        public C10971a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC10967g
        /* renamed from: b */
        public void mo14181b(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC10967g
        /* renamed from: c */
        public void mo14182c(View view, int i) {
            BottomSheetDragHandleView.this.m14193j(i);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDragHandleView$b */
    public class C10972b extends db {
        public C10972b() {
        }

        @Override // p001o.db
        /* renamed from: h */
        public void mo9657h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo9657h(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                BottomSheetDragHandleView.this.m14191f();
            }
        }
    }

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }

    /* renamed from: h */
    public static View m14189h(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ boolean m14190i(View view, jc.AbstractC14493a abstractC14493a) {
        return m14191f();
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.f12196e;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.F0(this.f12202x);
            this.f12196e.K0(null);
        }
        this.f12196e = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K0(this);
            m14193j(this.f12196e.u0());
            this.f12196e.c0(this.f12202x);
        }
        m14194k();
    }

    /* renamed from: f */
    public final boolean m14191f() {
        boolean z = false;
        if (!this.f12198g) {
            return false;
        }
        if (!this.f12196e.z0() && !this.f12196e.f1()) {
            z = true;
        }
        int iU0 = this.f12196e.u0();
        int i = 6;
        int i2 = 3;
        if (iU0 == 4) {
            if (!z) {
                i = i2;
            }
        } else if (iU0 != 3) {
            if (!this.f12199h) {
                i2 = 4;
            }
            i = i2;
        } else if (!z) {
            i = 4;
        }
        this.f12196e.Z0(i);
        return true;
    }

    /* renamed from: g */
    public final BottomSheetBehavior m14192g() {
        View viewM14189h = this;
        while (true) {
            viewM14189h = m14189h(viewM14189h);
            if (viewM14189h == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = viewM14189h.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C2012e) {
                CoordinatorLayout.Behavior behaviorM5798f = ((CoordinatorLayout.C2012e) layoutParams).m5798f();
                if (behaviorM5798f instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) behaviorM5798f;
                }
            }
        }
    }

    /* renamed from: j */
    public final void m14193j(int i) {
        if (i == 4) {
            this.f12199h = true;
        } else if (i == 3) {
            this.f12199h = false;
        }
        wvi.i0(this, cc.C12624a.f17797i, this.f12199h ? this.f12200q : this.f12201s, new jc() { // from class: o.al1
            @Override // p001o.jc
            /* renamed from: a */
            public final boolean mo6030a(View view, jc.AbstractC14493a abstractC14493a) {
                return this.f14907a.m14190i(view, abstractC14493a);
            }
        });
    }

    /* renamed from: k */
    public final void m14194k() {
        this.f12198g = this.f12197f && this.f12196e != null;
        setImportantForAccessibility(this.f12196e == null ? 2 : 1);
        setClickable(this.f12198g);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        this.f12197f = z;
        m14194k();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(m14192g());
        AccessibilityManager accessibilityManager = this.f12195d;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.f12195d.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f12195d;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(gza.m29680d(context, attributeSet, i, f12194y), attributeSet, i);
        this.f12200q = getResources().getString(v9e.bottomsheet_action_expand);
        this.f12201s = getResources().getString(v9e.bottomsheet_action_collapse);
        this.f12202x = new C10971a();
        this.f12195d = (AccessibilityManager) getContext().getSystemService("accessibility");
        m14194k();
        wvi.m0(this, new C10972b());
    }
}

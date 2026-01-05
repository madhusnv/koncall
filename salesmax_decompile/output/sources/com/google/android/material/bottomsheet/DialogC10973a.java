package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p001o.cbc;
import p001o.cc;
import p001o.d36;
import p001o.db;
import p001o.dk0;
import p001o.gua;
import p001o.n8e;
import p001o.n9e;
import p001o.pae;
import p001o.r9j;
import p001o.rta;
import p001o.w8j;
import p001o.wvi;
import p001o.x5e;
import p001o.xzi;
import p001o.zya;

/* renamed from: com.google.android.material.bottomsheet.a */
/* loaded from: classes3.dex */
public class DialogC10973a extends dk0 {

    /* renamed from: a */
    public BottomSheetBehavior f12205a;

    /* renamed from: b */
    public FrameLayout f12206b;

    /* renamed from: c */
    public CoordinatorLayout f12207c;

    /* renamed from: d */
    public FrameLayout f12208d;

    /* renamed from: e */
    public boolean f12209e;

    /* renamed from: f */
    public boolean f12210f;

    /* renamed from: g */
    public boolean f12211g;

    /* renamed from: h */
    public boolean f12212h;

    /* renamed from: q */
    public f f12213q;

    /* renamed from: s */
    public boolean f12214s;

    /* renamed from: x */
    public rta f12215x;

    /* renamed from: y */
    public BottomSheetBehavior.AbstractC10967g f12216y;

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    public class a implements cbc {
        public a() {
        }

        @Override // p001o.cbc
        /* renamed from: a */
        public r9j mo3830a(View view, r9j r9jVar) {
            if (DialogC10973a.this.f12213q != null) {
                DialogC10973a.this.f12205a.F0(DialogC10973a.this.f12213q);
            }
            if (r9jVar != null) {
                DialogC10973a dialogC10973a = DialogC10973a.this;
                dialogC10973a.f12213q = new f(dialogC10973a.f12208d, r9jVar, null);
                DialogC10973a.this.f12213q.m14209e(DialogC10973a.this.getWindow());
                DialogC10973a.this.f12205a.c0(DialogC10973a.this.f12213q);
            }
            return r9jVar;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC10973a dialogC10973a = DialogC10973a.this;
            if (dialogC10973a.f12210f && dialogC10973a.isShowing() && DialogC10973a.this.m14205o()) {
                DialogC10973a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    public class c extends db {
        public c() {
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            if (!DialogC10973a.this.f12210f) {
                ccVar.u0(false);
            } else {
                ccVar.m20777a(1048576);
                ccVar.u0(true);
            }
        }

        @Override // p001o.db
        /* renamed from: j */
        public boolean mo5939j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                DialogC10973a dialogC10973a = DialogC10973a.this;
                if (dialogC10973a.f12210f) {
                    dialogC10973a.cancel();
                    return true;
                }
            }
            return super.mo5939j(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$e */
    public class e extends BottomSheetBehavior.AbstractC10967g {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC10967g
        /* renamed from: b */
        public void mo14181b(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC10967g
        /* renamed from: c */
        public void mo14182c(View view, int i) {
            if (i == 5) {
                DialogC10973a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$f */
    public static class f extends BottomSheetBehavior.AbstractC10967g {

        /* renamed from: a */
        public final Boolean f12222a;

        /* renamed from: b */
        public final r9j f12223b;

        /* renamed from: c */
        public Window f12224c;

        /* renamed from: d */
        public boolean f12225d;

        public /* synthetic */ f(View view, r9j r9jVar, a aVar) {
            this(view, r9jVar);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC10967g
        /* renamed from: a */
        public void mo14180a(View view) {
            m14208d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC10967g
        /* renamed from: b */
        public void mo14181b(View view, float f) {
            m14208d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC10967g
        /* renamed from: c */
        public void mo14182c(View view, int i) {
            m14208d(view);
        }

        /* renamed from: d */
        public final void m14208d(View view) {
            if (view.getTop() < this.f12223b.m46397l()) {
                Window window = this.f12224c;
                if (window != null) {
                    Boolean bool = this.f12222a;
                    d36.m22300f(window, bool == null ? this.f12225d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f12223b.m46397l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f12224c;
                if (window2 != null) {
                    d36.m22300f(window2, this.f12225d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        /* renamed from: e */
        public void m14209e(Window window) {
            if (this.f12224c == window) {
                return;
            }
            this.f12224c = window;
            if (window != null) {
                this.f12225d = w8j.m54105a(window, window.getDecorView()).m41887b();
            }
        }

        public f(View view, r9j r9jVar) {
            this.f12223b = r9jVar;
            zya zyaVarT0 = BottomSheetBehavior.q0(view).t0();
            ColorStateList colorStateListM60096B = zyaVarT0 != null ? zyaVarT0.m60096B() : view.getBackgroundTintList();
            if (colorStateListM60096B != null) {
                this.f12222a = Boolean.valueOf(gua.m29509h(colorStateListM60096B.getDefaultColor()));
                return;
            }
            Integer numM57072h = xzi.m57072h(view);
            if (numM57072h != null) {
                this.f12222a = Boolean.valueOf(gua.m29509h(numM57072h.intValue()));
            } else {
                this.f12222a = null;
            }
        }
    }

    public DialogC10973a(Context context) {
        this(context, 0);
        m14203m();
    }

    /* renamed from: d */
    public static int m14195d(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(x5e.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : pae.Theme_Design_Light_BottomSheetDialog;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior bottomSheetBehaviorM14201k = m14201k();
        if (!this.f12209e || bottomSheetBehaviorM14201k.u0() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorM14201k.Z0(5);
        }
    }

    /* renamed from: j */
    public final FrameLayout m14200j() {
        if (this.f12206b == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), n9e.design_bottom_sheet_dialog, null);
            this.f12206b = frameLayout;
            this.f12207c = (CoordinatorLayout) frameLayout.findViewById(n8e.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f12206b.findViewById(n8e.design_bottom_sheet);
            this.f12208d = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(frameLayout2);
            this.f12205a = bottomSheetBehaviorQ0;
            bottomSheetBehaviorQ0.c0(this.f12216y);
            this.f12205a.R0(this.f12210f);
            this.f12215x = new rta(this.f12205a, this.f12208d);
        }
        return this.f12206b;
    }

    /* renamed from: k */
    public BottomSheetBehavior m14201k() {
        if (this.f12205a == null) {
            m14200j();
        }
        return this.f12205a;
    }

    /* renamed from: l */
    public boolean m14202l() {
        return this.f12209e;
    }

    /* renamed from: m */
    public final void m14203m() {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{x5e.enableEdgeToEdge});
        this.f12214s = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: n */
    public void m14204n() {
        this.f12205a.F0(this.f12216y);
    }

    /* renamed from: o */
    public boolean m14205o() {
        if (!this.f12212h) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f12211g = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f12212h = true;
        }
        return this.f12211g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.f12214s && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f12206b;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.f12207c;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            w8j.m54106b(window, !z);
            f fVar = this.f12213q;
            if (fVar != null) {
                fVar.m14209e(window);
            }
        }
        m14206p();
    }

    @Override // p001o.dk0, p001o.fn3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f12213q;
        if (fVar != null) {
            fVar.m14209e(null);
        }
        rta rtaVar = this.f12215x;
        if (rtaVar != null) {
            rtaVar.m47157f();
        }
    }

    @Override // p001o.fn3, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f12205a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.u0() != 5) {
            return;
        }
        this.f12205a.Z0(4);
    }

    /* renamed from: p */
    public final void m14206p() {
        rta rtaVar = this.f12215x;
        if (rtaVar == null) {
            return;
        }
        if (this.f12210f) {
            rtaVar.m47154c();
        } else {
            rtaVar.m47157f();
        }
    }

    /* renamed from: q */
    public final View m14207q(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m14200j();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f12206b.findViewById(n8e.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f12214s) {
            wvi.x0(this.f12208d, new a());
        }
        this.f12208d.removeAllViews();
        if (layoutParams == null) {
            this.f12208d.addView(view);
        } else {
            this.f12208d.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(n8e.touch_outside).setOnClickListener(new b());
        wvi.m0(this.f12208d, new c());
        this.f12208d.setOnTouchListener(new d());
        return this.f12206b;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f12210f != z) {
            this.f12210f = z;
            BottomSheetBehavior bottomSheetBehavior = this.f12205a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.R0(z);
            }
            if (getWindow() != null) {
                m14206p();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f12210f) {
            this.f12210f = true;
        }
        this.f12211g = z;
        this.f12212h = true;
    }

    @Override // p001o.dk0, p001o.fn3, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(m14207q(i, null, null));
    }

    @Override // p001o.dk0, p001o.fn3, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m14207q(0, view, null));
    }

    public DialogC10973a(Context context, int i) {
        super(context, m14195d(context, i));
        this.f12210f = true;
        this.f12211g = true;
        this.f12216y = new e();
        supportRequestWindowFeature(1);
        m14203m();
    }

    @Override // p001o.dk0, p001o.fn3, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m14207q(0, view, layoutParams));
    }
}

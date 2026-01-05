package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.login.widget.C10842a;
import java.lang.ref.WeakReference;
import p001o.a94;
import p001o.id5;
import p001o.l8e;
import p001o.l9e;
import p001o.sq8;
import p001o.t7e;

/* renamed from: com.facebook.login.widget.a */
/* loaded from: classes5.dex */
public final class C10842a {

    /* renamed from: i */
    public static final a f11702i = new a(null);

    /* renamed from: a */
    public final String f11703a;

    /* renamed from: b */
    public final WeakReference f11704b;

    /* renamed from: c */
    public final Context f11705c;

    /* renamed from: d */
    public b f11706d;

    /* renamed from: e */
    public PopupWindow f11707e;

    /* renamed from: f */
    public c f11708f;

    /* renamed from: g */
    public long f11709g;

    /* renamed from: h */
    public final ViewTreeObserver.OnScrollChangedListener f11710h;

    /* renamed from: com.facebook.login.widget.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.facebook.login.widget.a$b */
    public final class b extends FrameLayout {

        /* renamed from: a */
        public final ImageView f11711a;

        /* renamed from: b */
        public final ImageView f11712b;

        /* renamed from: c */
        public final View f11713c;

        /* renamed from: d */
        public final ImageView f11714d;

        /* renamed from: e */
        public final /* synthetic */ C10842a f11715e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C10842a c10842a, Context context) {
            super(context);
            sq8.m48649h(context, "context");
            this.f11715e = c10842a;
            LayoutInflater.from(context).inflate(l9e.com_facebook_tooltip_bubble, this);
            View viewFindViewById = findViewById(l8e.com_facebook_tooltip_bubble_view_top_pointer);
            sq8.m48647f(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            this.f11711a = (ImageView) viewFindViewById;
            View viewFindViewById2 = findViewById(l8e.com_facebook_tooltip_bubble_view_bottom_pointer);
            sq8.m48647f(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            this.f11712b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = findViewById(l8e.com_facebook_body_frame);
            sq8.m48648g(viewFindViewById3, "findViewById(R.id.com_facebook_body_frame)");
            this.f11713c = viewFindViewById3;
            View viewFindViewById4 = findViewById(l8e.com_facebook_button_xout);
            sq8.m48647f(viewFindViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            this.f11714d = (ImageView) viewFindViewById4;
        }

        /* renamed from: a */
        public final View m13498a() {
            return this.f11713c;
        }

        /* renamed from: b */
        public final ImageView m13499b() {
            return this.f11712b;
        }

        /* renamed from: c */
        public final ImageView m13500c() {
            return this.f11711a;
        }

        /* renamed from: d */
        public final ImageView m13501d() {
            return this.f11714d;
        }

        /* renamed from: e */
        public final void m13502e() {
            this.f11711a.setVisibility(4);
            this.f11712b.setVisibility(0);
        }

        /* renamed from: f */
        public final void m13503f() {
            this.f11711a.setVisibility(0);
            this.f11712b.setVisibility(4);
        }
    }

    /* renamed from: com.facebook.login.widget.a$c */
    public enum c {
        BLUE,
        BLACK
    }

    public C10842a(String str, View view) {
        sq8.m48649h(str, "text");
        sq8.m48649h(view, "anchor");
        this.f11703a = str;
        this.f11704b = new WeakReference(view);
        Context context = view.getContext();
        sq8.m48648g(context, "anchor.context");
        this.f11705c = context;
        this.f11708f = c.BLUE;
        this.f11709g = 6000L;
        this.f11710h = new ViewTreeObserver.OnScrollChangedListener() { // from class: o.bsh
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C10842a.m13488f(this.f16773a);
            }
        };
    }

    /* renamed from: f */
    public static final void m13488f(C10842a c10842a) {
        PopupWindow popupWindow;
        if (a94.m16694d(C10842a.class)) {
            return;
        }
        try {
            sq8.m48649h(c10842a, "this$0");
            if (c10842a.f11704b.get() == null || (popupWindow = c10842a.f11707e) == null || !popupWindow.isShowing()) {
                return;
            }
            if (popupWindow.isAboveAnchor()) {
                b bVar = c10842a.f11706d;
                if (bVar != null) {
                    bVar.m13502e();
                    return;
                }
                return;
            }
            b bVar2 = c10842a.f11706d;
            if (bVar2 != null) {
                bVar2.m13503f();
            }
        } catch (Throwable th) {
            a94.m16692b(th, C10842a.class);
        }
    }

    /* renamed from: j */
    public static final void m13489j(C10842a c10842a) {
        if (a94.m16694d(C10842a.class)) {
            return;
        }
        try {
            sq8.m48649h(c10842a, "this$0");
            c10842a.m13491d();
        } catch (Throwable th) {
            a94.m16692b(th, C10842a.class);
        }
    }

    /* renamed from: k */
    public static final void m13490k(C10842a c10842a, View view) {
        if (a94.m16694d(C10842a.class)) {
            return;
        }
        try {
            sq8.m48649h(c10842a, "this$0");
            c10842a.m13491d();
        } catch (Throwable th) {
            a94.m16692b(th, C10842a.class);
        }
    }

    /* renamed from: d */
    public final void m13491d() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m13496l();
            PopupWindow popupWindow = this.f11707e;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: e */
    public final void m13492e() {
        ViewTreeObserver viewTreeObserver;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m13496l();
            View view = (View) this.f11704b.get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnScrollChangedListener(this.f11710h);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: g */
    public final void m13493g(long j) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            this.f11709g = j;
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: h */
    public final void m13494h(c cVar) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(cVar, "style");
            this.f11708f = cVar;
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: i */
    public final void m13495i() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (this.f11704b.get() != null) {
                b bVar = new b(this, this.f11705c);
                this.f11706d = bVar;
                View viewFindViewById = bVar.findViewById(l8e.com_facebook_tooltip_bubble_view_text_body);
                sq8.m48647f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) viewFindViewById).setText(this.f11703a);
                if (this.f11708f == c.BLUE) {
                    bVar.m13498a().setBackgroundResource(t7e.com_facebook_tooltip_blue_background);
                    bVar.m13499b().setImageResource(t7e.com_facebook_tooltip_blue_bottomnub);
                    bVar.m13500c().setImageResource(t7e.com_facebook_tooltip_blue_topnub);
                    bVar.m13501d().setImageResource(t7e.com_facebook_tooltip_blue_xout);
                } else {
                    bVar.m13498a().setBackgroundResource(t7e.com_facebook_tooltip_black_background);
                    bVar.m13499b().setImageResource(t7e.com_facebook_tooltip_black_bottomnub);
                    bVar.m13500c().setImageResource(t7e.com_facebook_tooltip_black_topnub);
                    bVar.m13501d().setImageResource(t7e.com_facebook_tooltip_black_xout);
                }
                Context context = this.f11705c;
                sq8.m48647f(context, "null cannot be cast to non-null type android.app.Activity");
                View decorView = ((Activity) context).getWindow().getDecorView();
                sq8.m48648g(decorView, "window.decorView");
                int width = decorView.getWidth();
                int height = decorView.getHeight();
                m13492e();
                bVar.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                PopupWindow popupWindow = new PopupWindow(bVar, bVar.getMeasuredWidth(), bVar.getMeasuredHeight());
                this.f11707e = popupWindow;
                popupWindow.showAsDropDown((View) this.f11704b.get());
                m13497m();
                if (this.f11709g > 0) {
                    bVar.postDelayed(new Runnable() { // from class: o.csh
                        @Override // java.lang.Runnable
                        public final void run() {
                            C10842a.m13489j(this.f18599a);
                        }
                    }, this.f11709g);
                }
                popupWindow.setTouchable(true);
                bVar.setOnClickListener(new View.OnClickListener() { // from class: o.dsh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C10842a.m13490k(this.f20481a, view);
                    }
                });
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: l */
    public final void m13496l() {
        ViewTreeObserver viewTreeObserver;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            View view = (View) this.f11704b.get();
            if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnScrollChangedListener(this.f11710h);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: m */
    public final void m13497m() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            PopupWindow popupWindow = this.f11707e;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            if (popupWindow.isAboveAnchor()) {
                b bVar = this.f11706d;
                if (bVar != null) {
                    bVar.m13502e();
                    return;
                }
                return;
            }
            b bVar2 = this.f11706d;
            if (bVar2 != null) {
                bVar2.m13503f();
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}

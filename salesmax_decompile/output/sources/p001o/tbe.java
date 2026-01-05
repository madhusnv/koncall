package p001o;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class tbe {

    /* renamed from: a */
    public static final tbe f46778a = new tbe();

    /* renamed from: o.tbe$a */
    public static final class ViewOnTouchListenerC17052a implements View.OnTouchListener {

        /* renamed from: a */
        public final yj6 f46779a;

        /* renamed from: b */
        public final WeakReference f46780b;

        /* renamed from: c */
        public final WeakReference f46781c;

        /* renamed from: d */
        public final View.OnTouchListener f46782d;

        /* renamed from: e */
        public boolean f46783e;

        public ViewOnTouchListenerC17052a(yj6 yj6Var, View view, View view2) {
            sq8.m48649h(yj6Var, "mapping");
            sq8.m48649h(view, "rootView");
            sq8.m48649h(view2, "hostView");
            this.f46779a = yj6Var;
            this.f46780b = new WeakReference(view2);
            this.f46781c = new WeakReference(view);
            this.f46782d = owi.m42737h(view2);
            this.f46783e = true;
        }

        /* renamed from: a */
        public final boolean m49694a() {
            return this.f46783e;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            sq8.m48649h(view, "view");
            sq8.m48649h(motionEvent, "motionEvent");
            View view2 = (View) this.f46781c.get();
            View view3 = (View) this.f46780b.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                rf3.m46649d(this.f46779a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f46782d;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    /* renamed from: a */
    public static final ViewOnTouchListenerC17052a m49693a(yj6 yj6Var, View view, View view2) {
        if (a94.m16694d(tbe.class)) {
            return null;
        }
        try {
            sq8.m48649h(yj6Var, "mapping");
            sq8.m48649h(view, "rootView");
            sq8.m48649h(view2, "hostView");
            return new ViewOnTouchListenerC17052a(yj6Var, view, view2);
        } catch (Throwable th) {
            a94.m16692b(th, tbe.class);
            return null;
        }
    }
}

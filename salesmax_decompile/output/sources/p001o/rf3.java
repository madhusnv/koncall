package p001o;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.C10773c;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class rf3 {

    /* renamed from: a */
    public static final rf3 f43483a = new rf3();

    /* renamed from: o.rf3$a */
    public static final class ViewOnClickListenerC16600a implements View.OnClickListener {

        /* renamed from: a */
        public yj6 f43484a;

        /* renamed from: b */
        public WeakReference f43485b;

        /* renamed from: c */
        public WeakReference f43486c;

        /* renamed from: d */
        public View.OnClickListener f43487d;

        /* renamed from: e */
        public boolean f43488e;

        public ViewOnClickListenerC16600a(yj6 yj6Var, View view, View view2) {
            sq8.m48649h(yj6Var, "mapping");
            sq8.m48649h(view, "rootView");
            sq8.m48649h(view2, "hostView");
            this.f43484a = yj6Var;
            this.f43485b = new WeakReference(view2);
            this.f43486c = new WeakReference(view);
            this.f43487d = owi.m42736g(view2);
            this.f43488e = true;
        }

        /* renamed from: a */
        public final boolean m46652a() {
            return this.f43488e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                sq8.m48649h(view, "view");
                View.OnClickListener onClickListener = this.f43487d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = (View) this.f43486c.get();
                View view3 = (View) this.f43485b.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                yj6 yj6Var = this.f43484a;
                sq8.m48647f(yj6Var, "null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding");
                rf3.m46649d(yj6Var, view2, view3);
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }
    }

    /* renamed from: o.rf3$b */
    public static final class C16601b implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        public yj6 f43489a;

        /* renamed from: b */
        public WeakReference f43490b;

        /* renamed from: c */
        public WeakReference f43491c;

        /* renamed from: d */
        public AdapterView.OnItemClickListener f43492d;

        /* renamed from: e */
        public boolean f43493e;

        public C16601b(yj6 yj6Var, View view, AdapterView adapterView) {
            sq8.m48649h(yj6Var, "mapping");
            sq8.m48649h(view, "rootView");
            sq8.m48649h(adapterView, "hostView");
            this.f43489a = yj6Var;
            this.f43490b = new WeakReference(adapterView);
            this.f43491c = new WeakReference(view);
            this.f43492d = adapterView.getOnItemClickListener();
            this.f43493e = true;
        }

        /* renamed from: a */
        public final boolean m46653a() {
            return this.f43493e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            sq8.m48649h(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f43492d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            View view2 = (View) this.f43491c.get();
            AdapterView adapterView2 = (AdapterView) this.f43490b.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            rf3.m46649d(this.f43489a, view2, adapterView2);
        }
    }

    /* renamed from: b */
    public static final ViewOnClickListenerC16600a m46647b(yj6 yj6Var, View view, View view2) {
        if (a94.m16694d(rf3.class)) {
            return null;
        }
        try {
            sq8.m48649h(yj6Var, "mapping");
            sq8.m48649h(view, "rootView");
            sq8.m48649h(view2, "hostView");
            return new ViewOnClickListenerC16600a(yj6Var, view, view2);
        } catch (Throwable th) {
            a94.m16692b(th, rf3.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final C16601b m46648c(yj6 yj6Var, View view, AdapterView adapterView) {
        if (a94.m16694d(rf3.class)) {
            return null;
        }
        try {
            sq8.m48649h(yj6Var, "mapping");
            sq8.m48649h(view, "rootView");
            sq8.m48649h(adapterView, "hostView");
            return new C16601b(yj6Var, view, adapterView);
        } catch (Throwable th) {
            a94.m16692b(th, rf3.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final void m46649d(yj6 yj6Var, View view, View view2) {
        if (a94.m16694d(rf3.class)) {
            return;
        }
        try {
            sq8.m48649h(yj6Var, "mapping");
            sq8.m48649h(view, "rootView");
            sq8.m48649h(view2, "hostView");
            final String strM57880b = yj6Var.m57880b();
            final Bundle bundleM54306b = wf3.f51880f.m54306b(yj6Var, view, view2);
            f43483a.m46651f(bundleM54306b);
            C10773c.m13028u().execute(new Runnable() { // from class: o.qf3
                @Override // java.lang.Runnable
                public final void run() {
                    rf3.m46650e(strM57880b, bundleM54306b);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, rf3.class);
        }
    }

    /* renamed from: e */
    public static final void m46650e(String str, Bundle bundle) {
        if (a94.m16694d(rf3.class)) {
            return;
        }
        try {
            sq8.m48649h(str, "$eventName");
            sq8.m48649h(bundle, "$parameters");
            nl0.f36985b.m40739f(C10773c.m13019l()).m40733b(str, bundle);
        } catch (Throwable th) {
            a94.m16692b(th, rf3.class);
        }
    }

    /* renamed from: f */
    public final void m46651f(Bundle bundle) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(bundle, "parameters");
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                bundle.putDouble("_valueToSum", gl0.m28972f(string));
            }
            bundle.putString("_is_fb_codeless", "1");
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}

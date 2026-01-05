package o1;

import android.os.Build;
import android.view.View;
import c6.AbstractC0880j;
import c6.C0881k;
import com.websoptimization.callyzerbiz.R;
import java.util.WeakHashMap;
import u2.AbstractC7316m;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: v */
    public static final WeakHashMap f25863v = new WeakHashMap();

    /* renamed from: a */
    public final C5242a f25864a = C5243b.m10313b(4, "captionBar");

    /* renamed from: b */
    public final C5242a f25865b;

    /* renamed from: c */
    public final C5242a f25866c;

    /* renamed from: d */
    public final C5242a f25867d;

    /* renamed from: e */
    public final C5242a f25868e;

    /* renamed from: f */
    public final C5242a f25869f;

    /* renamed from: g */
    public final C5242a f25870g;

    /* renamed from: h */
    public final C5242a f25871h;

    /* renamed from: i */
    public final C5242a f25872i;

    /* renamed from: j */
    public final t1 f25873j;

    /* renamed from: k */
    public final r1 f25874k;

    /* renamed from: l */
    public final t1 f25875l;

    /* renamed from: m */
    public final t1 f25876m;

    /* renamed from: n */
    public final t1 f25877n;

    /* renamed from: o */
    public final t1 f25878o;

    /* renamed from: p */
    public final t1 f25879p;

    /* renamed from: q */
    public final t1 f25880q;

    /* renamed from: r */
    public final t1 f25881r;

    /* renamed from: s */
    public final boolean f25882s;

    /* renamed from: t */
    public int f25883t;

    /* renamed from: u */
    public final w0 f25884u;

    public w1(View view) {
        C5242a c5242aM10313b = C5243b.m10313b(128, "displayCutout");
        this.f25865b = c5242aM10313b;
        C5242a c5242aM10313b2 = C5243b.m10313b(8, "ime");
        this.f25866c = c5242aM10313b2;
        C5242a c5242aM10313b3 = C5243b.m10313b(32, "mandatorySystemGestures");
        this.f25867d = c5242aM10313b3;
        this.f25868e = C5243b.m10313b(2, "navigationBars");
        this.f25869f = C5243b.m10313b(1, "statusBars");
        C5242a c5242aM10313b4 = C5243b.m10313b(519, "systemBars");
        this.f25870g = c5242aM10313b4;
        C5242a c5242aM10313b5 = C5243b.m10313b(16, "systemGestures");
        this.f25871h = c5242aM10313b5;
        C5242a c5242aM10313b6 = C5243b.m10313b(64, "tappableElement");
        this.f25872i = c5242aM10313b6;
        t1 t1Var = new t1(new z0(0, 0, 0, 0), "waterfall");
        this.f25873j = t1Var;
        this.f25874k = new r1(new r1(c5242aM10313b4, c5242aM10313b2), c5242aM10313b);
        new r1(new r1(new r1(c5242aM10313b6, c5242aM10313b3), c5242aM10313b5), t1Var);
        this.f25875l = C5243b.m10314d(4, "captionBarIgnoringVisibility");
        this.f25876m = C5243b.m10314d(2, "navigationBarsIgnoringVisibility");
        this.f25877n = C5243b.m10314d(1, "statusBarsIgnoringVisibility");
        this.f25878o = C5243b.m10314d(519, "systemBarsIgnoringVisibility");
        this.f25879p = C5243b.m10314d(64, "tappableElementIgnoringVisibility");
        this.f25880q = C5243b.m10314d(8, "imeAnimationTarget");
        this.f25881r = C5243b.m10314d(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f25882s = bool != null ? bool.booleanValue() : true;
        this.f25884u = new w0(this);
    }

    /* renamed from: a */
    public static void m10374a(w1 w1Var, c6.y1 y1Var) {
        boolean z6 = false;
        w1Var.f25864a.m10312f(y1Var, 0);
        w1Var.f25866c.m10312f(y1Var, 0);
        w1Var.f25865b.m10312f(y1Var, 0);
        w1Var.f25868e.m10312f(y1Var, 0);
        w1Var.f25869f.m10312f(y1Var, 0);
        w1Var.f25870g.m10312f(y1Var, 0);
        w1Var.f25871h.m10312f(y1Var, 0);
        w1Var.f25872i.m10312f(y1Var, 0);
        w1Var.f25867d.m10312f(y1Var, 0);
        w1Var.f25875l.m10372f(AbstractC5244c.m10332q(y1Var.f5541a.mo2476h(4)));
        w1Var.f25876m.m10372f(AbstractC5244c.m10332q(y1Var.f5541a.mo2476h(2)));
        w1Var.f25877n.m10372f(AbstractC5244c.m10332q(y1Var.f5541a.mo2476h(1)));
        w1Var.f25878o.m10372f(AbstractC5244c.m10332q(y1Var.f5541a.mo2476h(519)));
        w1Var.f25879p.m10372f(AbstractC5244c.m10332q(y1Var.f5541a.mo2476h(64)));
        C0881k c0881kMo2501f = y1Var.f5541a.mo2501f();
        if (c0881kMo2501f != null) {
            w1Var.f25873j.m10372f(AbstractC5244c.m10332q(Build.VERSION.SDK_INT >= 30 ? C7340b.m13737c(AbstractC0880j.m2422f(c0881kMo2501f.f5477a)) : C7340b.f34956e));
        }
        synchronized (AbstractC7316m.f34890b) {
            e1.k0 k0Var = AbstractC7316m.f34897i.f34857h;
            if (k0Var != null) {
                if (k0Var.m5588h()) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            AbstractC7316m.m13676a();
        }
    }
}

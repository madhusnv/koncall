package l4;

import a1.RunnableC0024w;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b2.C0566x;
import c3.C0848c;
import g4.l0;
import g4.n0;
import gx.AbstractC2747a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC4154l;
import m2.C4640e;
import nx.AbstractC5185w;
import s1.C6725t;
import u8.AbstractC7370r;
import vd.RunnableC7704a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 implements InterfaceC4375t {

    /* renamed from: a */
    public ArrayList f21884a;

    /* renamed from: b */
    public boolean f21885b;

    /* renamed from: c */
    public Object f21886c;

    /* renamed from: d */
    public Object f21887d;

    /* renamed from: e */
    public Object f21888e;

    /* renamed from: f */
    public Serializable f21889f;

    /* renamed from: g */
    public Object f21890g;

    /* renamed from: h */
    public Object f21891h;

    /* renamed from: i */
    public Object f21892i;

    /* renamed from: j */
    public Object f21893j;

    /* renamed from: k */
    public Object f21894k;

    /* renamed from: l */
    public Object f21895l;

    /* renamed from: m */
    public Object f21896m;

    /* renamed from: n */
    public Object f21897n;

    @Override // l4.InterfaceC4375t
    /* renamed from: a */
    public void mo9093a() {
        m9103k(b0.StartInput);
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: b */
    public void mo9094b() {
        m9103k(b0.ShowKeyboard);
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: c */
    public void mo9095c() {
        this.f21885b = false;
        this.f21889f = C4357b.f21858g;
        this.f21890g = C4357b.f21859h;
        this.f21894k = null;
        m9103k(b0.StopInput);
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: d */
    public void mo9096d(C0848c c0848c) {
        Rect rect;
        this.f21894k = new Rect(AbstractC2747a.m6747k(c0848c.f5354a), AbstractC2747a.m6747k(c0848c.f5355b), AbstractC2747a.m6747k(c0848c.f5356c), AbstractC2747a.m6747k(c0848c.f5357d));
        if (!this.f21884a.isEmpty() || (rect = (Rect) this.f21894k) == null) {
            return;
        }
        ((View) this.f21886c).requestRectangleOnScreen(new Rect(rect));
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: e */
    public void mo9097e(C4381z c4381z, InterfaceC4374s interfaceC4374s, l0 l0Var, C6725t c6725t, C0848c c0848c, C0848c c0848c2) {
        C4358c c4358c = (C4358c) this.f21895l;
        synchronized (c4358c.f21863c) {
            try {
                c4358c.f21870j = c4381z;
                c4358c.f21872l = interfaceC4374s;
                c4358c.f21871k = l0Var;
                c4358c.f21873m = c6725t;
                c4358c.f21874n = c0848c;
                c4358c.f21875o = c0848c2;
                if (c4358c.f21865e || c4358c.f21864d) {
                    c4358c.m9069a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, qw.g] */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.lang.Object, qw.g] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, qw.g] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, qw.g] */
    @Override // l4.InterfaceC4375t
    /* renamed from: f */
    public void mo9098f(C4381z c4381z, C4381z c4381z2) {
        boolean z6 = (n0.m6454a(((C4381z) this.f21891h).f21946b, c4381z2.f21946b) && AbstractC4154l.m8918a(((C4381z) this.f21891h).f21947c, c4381z2.f21947c)) ? false : true;
        this.f21891h = c4381z2;
        int size = this.f21884a.size();
        for (int i10 = 0; i10 < size; i10++) {
            InputConnectionC4376u inputConnectionC4376u = (InputConnectionC4376u) ((WeakReference) this.f21884a.get(i10)).get();
            if (inputConnectionC4376u != null) {
                inputConnectionC4376u.f21932d = c4381z2;
            }
        }
        C4358c c4358c = (C4358c) this.f21895l;
        synchronized (c4358c.f21863c) {
            c4358c.f21870j = null;
            c4358c.f21872l = null;
            c4358c.f21871k = null;
            c4358c.f21873m = C4357b.f21853b;
            c4358c.f21874n = null;
            c4358c.f21875o = null;
        }
        if (AbstractC4154l.m8918a(c4381z, c4381z2)) {
            if (z6) {
                C4367l c4367l = (C4367l) this.f21887d;
                int iM6458e = n0.m6458e(c4381z2.f21946b);
                int iM6457d = n0.m6457d(c4381z2.f21946b);
                n0 n0Var = ((C4381z) this.f21891h).f21947c;
                int iM6458e2 = n0Var != null ? n0.m6458e(n0Var.f13686a) : -1;
                n0 n0Var2 = ((C4381z) this.f21891h).f21947c;
                ((InputMethodManager) c4367l.f21922c.getValue()).updateSelection((View) c4367l.f21921b, iM6458e, iM6457d, iM6458e2, n0Var2 != null ? n0.m6457d(n0Var2.f13686a) : -1);
                return;
            }
            return;
        }
        if (c4381z != null && (!AbstractC4154l.m8918a(c4381z.f21945a.f13620b, c4381z2.f21945a.f13620b) || (n0.m6454a(c4381z.f21946b, c4381z2.f21946b) && !AbstractC4154l.m8918a(c4381z.f21947c, c4381z2.f21947c)))) {
            C4367l c4367l2 = (C4367l) this.f21887d;
            ((InputMethodManager) c4367l2.f21922c.getValue()).restartInput((View) c4367l2.f21921b);
            return;
        }
        int size2 = this.f21884a.size();
        for (int i11 = 0; i11 < size2; i11++) {
            InputConnectionC4376u inputConnectionC4376u2 = (InputConnectionC4376u) ((WeakReference) this.f21884a.get(i11)).get();
            if (inputConnectionC4376u2 != null) {
                C4381z c4381z3 = (C4381z) this.f21891h;
                C4367l c4367l3 = (C4367l) this.f21887d;
                if (inputConnectionC4376u2.f21936h) {
                    inputConnectionC4376u2.f21932d = c4381z3;
                    if (inputConnectionC4376u2.f21934f) {
                        ((InputMethodManager) c4367l3.f21922c.getValue()).updateExtractedText((View) c4367l3.f21921b, inputConnectionC4376u2.f21933e, AbstractC7370r.m13789b(c4381z3));
                    }
                    n0 n0Var3 = c4381z3.f21947c;
                    long j6 = c4381z3.f21946b;
                    int iM6458e3 = n0Var3 != null ? n0.m6458e(n0Var3.f13686a) : -1;
                    n0 n0Var4 = c4381z3.f21947c;
                    ((InputMethodManager) c4367l3.f21922c.getValue()).updateSelection((View) c4367l3.f21921b, n0.m6458e(j6), n0.m6457d(j6), iM6458e3, n0Var4 != null ? n0.m6457d(n0Var4.f13686a) : -1);
                }
            }
        }
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: g */
    public void mo9099g() {
        m9103k(b0.HideKeyboard);
    }

    @Override // l4.InterfaceC4375t
    /* renamed from: h */
    public void mo9100h(C4381z c4381z, C4366k c4366k, C0566x c0566x, x1.c0 c0Var) {
        this.f21885b = true;
        this.f21891h = c4381z;
        this.f21892i = c4366k;
        this.f21889f = c0566x;
        this.f21890g = c0Var;
        m9103k(b0.StartInput);
    }

    /* renamed from: i */
    public void m9101i() {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC7704a(this, 1), 0L);
    }

    /* renamed from: j */
    public void m9102j() {
        if (AbstractC5185w.m10130l((String) this.f21895l, "HTML", false)) {
            this.f21895l = "text/html; charset=utf-8";
        } else {
            this.f21895l = "text/plain";
        }
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC4154l.m8922e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        AbstractC4154l.m8922e(Executors.newFixedThreadPool(3), "newFixedThreadPool(3)");
        new Handler(Looper.getMainLooper());
        executorServiceNewSingleThreadExecutor.execute(new RunnableC7704a(this, 0));
    }

    /* renamed from: k */
    public void m9103k(b0 b0Var) {
        ((C4640e) this.f21896m).m9506b(b0Var);
        if (((RunnableC0024w) this.f21897n) == null) {
            RunnableC0024w runnableC0024w = new RunnableC0024w(23, this);
            ((f0) this.f21888e).execute(runnableC0024w);
            this.f21897n = runnableC0024w;
        }
    }
}

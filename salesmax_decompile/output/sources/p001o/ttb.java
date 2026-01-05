package p001o;

import androidx.appcompat.app.AppCompatActivity;
import java.util.HashSet;
import java.util.Optional;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import p001o.ttb;

/* loaded from: classes.dex */
public class ttb {

    /* renamed from: e */
    public static WeakHashMap f47764e = new WeakHashMap();

    /* renamed from: a */
    public jga f47765a;

    /* renamed from: b */
    public n9c f47766b;

    /* renamed from: c */
    public AtomicBoolean f47767c;

    /* renamed from: d */
    public final WeakHashMap f47768d = new WeakHashMap();

    /* renamed from: o.ttb$a */
    public static class C17205a {

        /* renamed from: a */
        public Boolean f47769a;

        /* renamed from: a */
        public Boolean m50583a() {
            return this.f47769a;
        }

        public C17205a(Boolean bool) {
            this.f47769a = bool;
        }
    }

    /* renamed from: o.ttb$b */
    public interface InterfaceC17206b {
        /* renamed from: a */
        void mo36185a(C17205a c17205a);
    }

    public ttb(final AppCompatActivity appCompatActivity) {
        this.f47765a = new jga(appCompatActivity.getApplication());
        this.f47767c = new AtomicBoolean(bub.m19823b(appCompatActivity.getApplicationContext()));
        this.f47766b = new n9c() { // from class: o.ptb
            @Override // p001o.n9c
            public final void onChanged(Object obj) {
                this.f40546a.m50575m(appCompatActivity, (Boolean) obj);
            }
        };
        j0f.m33008i(new Runnable() { // from class: o.qtb
            @Override // java.lang.Runnable
            public final void run() {
                this.f42393a.m50576n(appCompatActivity);
            }
        });
    }

    /* renamed from: g */
    public static synchronized void m50571g(AppCompatActivity appCompatActivity) {
        Optional.ofNullable((ttb) f47764e.remove(appCompatActivity)).ifPresent(new Consumer() { // from class: o.mtb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ttb) obj).m50579f();
            }
        });
    }

    /* renamed from: j */
    public static synchronized ttb m50572j(AppCompatActivity appCompatActivity) {
        if (!f47764e.containsKey(appCompatActivity)) {
            f47764e.put(appCompatActivity, new ttb(appCompatActivity));
        }
        return (ttb) f47764e.get(appCompatActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m50573k(jga jgaVar) {
        jgaVar.removeObserver(this.f47766b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m50575m(AppCompatActivity appCompatActivity, Boolean bool) {
        boolean zM19823b = bub.m19823b(appCompatActivity.getApplicationContext());
        if (!zM19823b) {
            m50581i(Boolean.valueOf(zM19823b));
        } else if (bub.m19823b(appCompatActivity.getApplicationContext())) {
            m50581i(Boolean.valueOf(zM19823b));
        } else {
            m50581i(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m50576n(AppCompatActivity appCompatActivity) {
        this.f47765a.observe(appCompatActivity, this.f47766b);
    }

    /* renamed from: q */
    public static void m50578q(final InterfaceC17206b interfaceC17206b) {
        f47764e.values().forEach(new Consumer() { // from class: o.ntb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ttb) obj).m50580h(interfaceC17206b);
            }
        });
    }

    /* renamed from: f */
    public void m50579f() {
        this.f47768d.clear();
        Optional.ofNullable(this.f47765a).ifPresent(new Consumer() { // from class: o.otb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f38885a.m50573k((jga) obj);
            }
        });
        this.f47765a = null;
        this.f47766b = null;
    }

    /* renamed from: h */
    public void m50580h(InterfaceC17206b interfaceC17206b) {
        synchronized (this.f47768d) {
            this.f47768d.remove(interfaceC17206b);
        }
    }

    /* renamed from: i */
    public final void m50581i(Boolean bool) {
        HashSet hashSet;
        final C17205a c17205a = new C17205a(bool);
        synchronized (this.f47768d) {
            hashSet = new HashSet(this.f47768d.keySet());
        }
        hashSet.forEach(new Consumer() { // from class: o.rtb
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ttb.InterfaceC17206b) obj).mo36185a(c17205a);
            }
        });
    }

    /* renamed from: p */
    public void m50582p(InterfaceC17206b interfaceC17206b) {
        synchronized (this.f47768d) {
            this.f47768d.put(interfaceC17206b, Boolean.TRUE);
        }
    }
}

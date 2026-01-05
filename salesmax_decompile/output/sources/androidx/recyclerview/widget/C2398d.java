package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.AbstractC2401g;
import androidx.recyclerview.widget.C2397c;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p001o.nfa;
import p001o.tq;

/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes2.dex */
public class C2398d {

    /* renamed from: h */
    public static final Executor f9953h = new b();

    /* renamed from: a */
    public final nfa f9954a;

    /* renamed from: b */
    public final C2397c f9955b;

    /* renamed from: c */
    public Executor f9956c;

    /* renamed from: d */
    public final List f9957d;

    /* renamed from: e */
    public List f9958e;

    /* renamed from: f */
    public List f9959f;

    /* renamed from: g */
    public int f9960g;

    /* renamed from: androidx.recyclerview.widget.d$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f9961a;

        /* renamed from: b */
        public final /* synthetic */ List f9962b;

        /* renamed from: c */
        public final /* synthetic */ int f9963c;

        /* renamed from: d */
        public final /* synthetic */ Runnable f9964d;

        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        public class C19576a extends AbstractC2401g.b {
            public C19576a() {
            }

            @Override // androidx.recyclerview.widget.AbstractC2401g.b
            /* renamed from: a */
            public boolean mo9439a(int i, int i2) {
                Object obj = a.this.f9961a.get(i);
                Object obj2 = a.this.f9962b.get(i2);
                if (obj != null && obj2 != null) {
                    return C2398d.this.f9955b.m9431b().mo9502a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.AbstractC2401g.b
            /* renamed from: b */
            public boolean mo9440b(int i, int i2) {
                Object obj = a.this.f9961a.get(i);
                Object obj2 = a.this.f9962b.get(i2);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : C2398d.this.f9955b.m9431b().mo9503b(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.AbstractC2401g.b
            /* renamed from: c */
            public Object mo9441c(int i, int i2) {
                Object obj = a.this.f9961a.get(i);
                Object obj2 = a.this.f9962b.get(i2);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return C2398d.this.f9955b.m9431b().m9504c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.AbstractC2401g.b
            /* renamed from: d */
            public int mo9442d() {
                return a.this.f9962b.size();
            }

            @Override // androidx.recyclerview.widget.AbstractC2401g.b
            /* renamed from: e */
            public int mo9443e() {
                return a.this.f9961a.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        public class b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ AbstractC2401g.e f9967a;

            public b(AbstractC2401g.e eVar) {
                this.f9967a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                C2398d c2398d = C2398d.this;
                if (c2398d.f9960g == aVar.f9963c) {
                    c2398d.m9435b(aVar.f9962b, this.f9967a, aVar.f9964d);
                }
            }
        }

        public a(List list, List list2, int i, Runnable runnable) {
            this.f9961a = list;
            this.f9962b = list2;
            this.f9963c = i;
            this.f9964d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2398d.this.f9956c.execute(new b(AbstractC2401g.m9486b(new C19576a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    public static class b implements Executor {

        /* renamed from: a */
        public final Handler f9969a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f9969a.post(runnable);
        }
    }

    public C2398d(RecyclerView.AbstractC2371h abstractC2371h, AbstractC2401g.f fVar) {
        this(new C2396b(abstractC2371h), new C2397c.a(fVar).m9433a());
    }

    /* renamed from: a */
    public List m9434a() {
        return this.f9959f;
    }

    /* renamed from: b */
    public void m9435b(List list, AbstractC2401g.e eVar, Runnable runnable) {
        List list2 = this.f9959f;
        this.f9958e = list;
        this.f9959f = Collections.unmodifiableList(list);
        eVar.m9498b(this.f9954a);
        m9436c(list2, runnable);
    }

    /* renamed from: c */
    public final void m9436c(List list, Runnable runnable) {
        Iterator it = this.f9957d.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: d */
    public void m9437d(List list) {
        m9438e(list, null);
    }

    /* renamed from: e */
    public void m9438e(List list, Runnable runnable) {
        int i = this.f9960g + 1;
        this.f9960g = i;
        List list2 = this.f9958e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f9959f;
        if (list == null) {
            int size = list2.size();
            this.f9958e = null;
            this.f9959f = Collections.emptyList();
            this.f9954a.mo9427b(0, size);
            m9436c(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f9955b.m9430a().execute(new a(list2, list, i, runnable));
            return;
        }
        this.f9958e = list;
        this.f9959f = Collections.unmodifiableList(list);
        this.f9954a.mo9426a(0, list.size());
        m9436c(list3, runnable);
    }

    public C2398d(nfa nfaVar, C2397c c2397c) {
        this.f9957d = new CopyOnWriteArrayList();
        this.f9959f = Collections.emptyList();
        this.f9954a = nfaVar;
        this.f9955b = c2397c;
        if (c2397c.m9432c() != null) {
            this.f9956c = c2397c.m9432c();
        } else {
            this.f9956c = f9953h;
        }
    }
}

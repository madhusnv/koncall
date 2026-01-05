package p001o;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.v6c;

/* loaded from: classes2.dex */
public final class nga implements v6c {

    /* renamed from: a */
    public final hpb f36814a = new hpb();

    /* renamed from: b */
    public final Map f36815b = new HashMap();

    /* renamed from: o.nga$a */
    public static final class C15579a implements n9c {

        /* renamed from: a */
        public final AtomicBoolean f36816a = new AtomicBoolean(true);

        /* renamed from: b */
        public final v6c.InterfaceC17516a f36817b;

        /* renamed from: c */
        public final Executor f36818c;

        public C15579a(Executor executor, v6c.InterfaceC17516a interfaceC17516a) {
            this.f36818c = executor;
            this.f36817b = interfaceC17516a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m40535c(C15580b c15580b) {
            if (this.f36816a.get()) {
                if (c15580b.m40539a()) {
                    this.f36817b.mo4754a(c15580b.m40541d());
                } else {
                    fgd.m26663g(c15580b.m40540c());
                    this.f36817b.onError(c15580b.m40540c());
                }
            }
        }

        /* renamed from: b */
        public void m40536b() {
            this.f36816a.set(false);
        }

        @Override // p001o.n9c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onChanged(final C15580b c15580b) {
            this.f36818c.execute(new Runnable() { // from class: o.mga
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35396a.m40535c(c15580b);
                }
            });
        }
    }

    /* renamed from: o.nga$b */
    public static final class C15580b {

        /* renamed from: a */
        public final Object f36819a;

        /* renamed from: b */
        public final Throwable f36820b;

        public C15580b(Object obj, Throwable th) {
            this.f36819a = obj;
            this.f36820b = th;
        }

        /* renamed from: b */
        public static C15580b m40538b(Object obj) {
            return new C15580b(obj, null);
        }

        /* renamed from: a */
        public boolean m40539a() {
            return this.f36820b == null;
        }

        /* renamed from: c */
        public Throwable m40540c() {
            return this.f36820b;
        }

        /* renamed from: d */
        public Object m40541d() {
            if (m40539a()) {
                return this.f36819a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (m40539a()) {
                str = "Value: " + this.f36819a;
            } else {
                str = "Error: " + this.f36820b;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m40531e(C15579a c15579a, C15579a c15579a2) {
        if (c15579a != null) {
            this.f36814a.removeObserver(c15579a);
        }
        this.f36814a.observeForever(c15579a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m40532f(C15579a c15579a) {
        this.f36814a.removeObserver(c15579a);
    }

    @Override // p001o.v6c
    /* renamed from: a */
    public void mo24338a(Executor executor, v6c.InterfaceC17516a interfaceC17516a) {
        synchronized (this.f36815b) {
            final C15579a c15579a = (C15579a) this.f36815b.get(interfaceC17516a);
            if (c15579a != null) {
                c15579a.m40536b();
            }
            final C15579a c15579a2 = new C15579a(executor, interfaceC17516a);
            this.f36815b.put(interfaceC17516a, c15579a2);
            gb2.m28295c().execute(new Runnable() { // from class: o.kga
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32225a.m40531e(c15579a, c15579a2);
                }
            });
        }
    }

    @Override // p001o.v6c
    /* renamed from: b */
    public void mo24339b(v6c.InterfaceC17516a interfaceC17516a) {
        synchronized (this.f36815b) {
            final C15579a c15579a = (C15579a) this.f36815b.remove(interfaceC17516a);
            if (c15579a != null) {
                c15579a.m40536b();
                gb2.m28295c().execute(new Runnable() { // from class: o.lga
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33757a.m40532f(c15579a);
                    }
                });
            }
        }
    }

    /* renamed from: g */
    public void m40533g(Object obj) {
        this.f36814a.postValue(C15580b.m40538b(obj));
    }
}

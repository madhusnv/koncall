package p001o;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p001o.ta1;

/* loaded from: classes2.dex */
public interface ta1 {

    /* renamed from: o.ta1$a */
    public interface InterfaceC17036a {

        /* renamed from: o.ta1$a$a */
        public static final class a {

            /* renamed from: a */
            public final CopyOnWriteArrayList f46685a = new CopyOnWriteArrayList();

            /* renamed from: o.ta1$a$a$a, reason: collision with other inner class name */
            public static final class C19595a {

                /* renamed from: a */
                public final Handler f46686a;

                /* renamed from: b */
                public final InterfaceC17036a f46687b;

                /* renamed from: c */
                public boolean f46688c;

                public C19595a(Handler handler, InterfaceC17036a interfaceC17036a) {
                    this.f46686a = handler;
                    this.f46687b = interfaceC17036a;
                }

                /* renamed from: d */
                public void m49595d() {
                    this.f46688c = true;
                }
            }

            /* renamed from: d */
            public static /* synthetic */ void m49588d(C19595a c19595a, int i, long j, long j2) {
                c19595a.f46687b.mo49586G(i, j, j2);
            }

            /* renamed from: b */
            public void m49589b(Handler handler, InterfaceC17036a interfaceC17036a) {
                op0.m42515e(handler);
                op0.m42515e(interfaceC17036a);
                m49591e(interfaceC17036a);
                this.f46685a.add(new C19595a(handler, interfaceC17036a));
            }

            /* renamed from: c */
            public void m49590c(final int i, final long j, final long j2) {
                Iterator it = this.f46685a.iterator();
                while (it.hasNext()) {
                    final C19595a c19595a = (C19595a) it.next();
                    if (!c19595a.f46688c) {
                        c19595a.f46686a.post(new Runnable() { // from class: o.sa1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ta1.InterfaceC17036a.a.m49588d(c19595a, i, j, j2);
                            }
                        });
                    }
                }
            }

            /* renamed from: e */
            public void m49591e(InterfaceC17036a interfaceC17036a) {
                Iterator it = this.f46685a.iterator();
                while (it.hasNext()) {
                    C19595a c19595a = (C19595a) it.next();
                    if (c19595a.f46687b == interfaceC17036a) {
                        c19595a.m49595d();
                        this.f46685a.remove(c19595a);
                    }
                }
            }
        }

        /* renamed from: G */
        void mo49586G(int i, long j, long j2);
    }

    /* renamed from: a */
    void mo24755a(Handler handler, InterfaceC17036a interfaceC17036a);

    /* renamed from: b */
    default long m49585b() {
        return -9223372036854775807L;
    }

    /* renamed from: c */
    void mo24756c(InterfaceC17036a interfaceC17036a);

    /* renamed from: d */
    juh mo24757d();

    /* renamed from: e */
    long mo24758e();
}

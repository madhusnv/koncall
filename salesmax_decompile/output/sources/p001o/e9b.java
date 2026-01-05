package p001o;

import android.os.Handler;
import androidx.media3.common.C2181a;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p001o.x8b;

/* loaded from: classes2.dex */
public interface e9b {

    /* renamed from: o.e9b$a */
    public static class C13130a {

        /* renamed from: a */
        public final int f21185a;

        /* renamed from: b */
        public final x8b.C18076b f21186b;

        /* renamed from: c */
        public final CopyOnWriteArrayList f21187c;

        /* renamed from: o.e9b$a$a */
        public static final class a {

            /* renamed from: a */
            public Handler f21188a;

            /* renamed from: b */
            public e9b f21189b;

            public a(Handler handler, e9b e9bVar) {
                this.f21188a = handler;
                this.f21189b = e9bVar;
            }
        }

        public C13130a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m24540j(e9b e9bVar, u2b u2bVar) {
            e9bVar.mo7409U(this.f21185a, this.f21186b, u2bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m24541k(e9b e9bVar, tga tgaVar, u2b u2bVar) {
            e9bVar.h0(this.f21185a, this.f21186b, tgaVar, u2bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m24542l(e9b e9bVar, tga tgaVar, u2b u2bVar) {
            e9bVar.mo7410Y(this.f21185a, this.f21186b, tgaVar, u2bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m24543m(e9b e9bVar, tga tgaVar, u2b u2bVar, IOException iOException, boolean z) {
            e9bVar.d0(this.f21185a, this.f21186b, tgaVar, u2bVar, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m24544n(e9b e9bVar, tga tgaVar, u2b u2bVar) {
            e9bVar.b0(this.f21185a, this.f21186b, tgaVar, u2bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m24545o(e9b e9bVar, x8b.C18076b c18076b, u2b u2bVar) {
            e9bVar.mo7406L(this.f21185a, c18076b, u2bVar);
        }

        /* renamed from: A */
        public void m24546A(final tga tgaVar, final u2b u2bVar) {
            Iterator it = this.f21187c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final e9b e9bVar = aVar.f21189b;
                sqi.W0(aVar.f21188a, new Runnable() { // from class: o.y8b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f55065a.m24544n(e9bVar, tgaVar, u2bVar);
                    }
                });
            }
        }

        /* renamed from: B */
        public void m24547B(e9b e9bVar) {
            Iterator it = this.f21187c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.f21189b == e9bVar) {
                    this.f21187c.remove(aVar);
                }
            }
        }

        /* renamed from: C */
        public void m24548C(int i, long j, long j2) {
            m24549D(new u2b(1, i, null, 3, null, sqi.q1(j), sqi.q1(j2)));
        }

        /* renamed from: D */
        public void m24549D(final u2b u2bVar) {
            final x8b.C18076b c18076b = (x8b.C18076b) op0.m42515e(this.f21186b);
            Iterator it = this.f21187c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final e9b e9bVar = aVar.f21189b;
                sqi.W0(aVar.f21188a, new Runnable() { // from class: o.d9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19413a.m24545o(e9bVar, c18076b, u2bVar);
                    }
                });
            }
        }

        /* renamed from: E */
        public C13130a m24550E(int i, x8b.C18076b c18076b) {
            return new C13130a(this.f21187c, i, c18076b);
        }

        /* renamed from: g */
        public void m24551g(Handler handler, e9b e9bVar) {
            op0.m42515e(handler);
            op0.m42515e(e9bVar);
            this.f21187c.add(new a(handler, e9bVar));
        }

        /* renamed from: h */
        public void m24552h(int i, C2181a c2181a, int i2, Object obj, long j) {
            m24553i(new u2b(1, i, c2181a, i2, obj, sqi.q1(j), -9223372036854775807L));
        }

        /* renamed from: i */
        public void m24553i(final u2b u2bVar) {
            Iterator it = this.f21187c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final e9b e9bVar = aVar.f21189b;
                sqi.W0(aVar.f21188a, new Runnable() { // from class: o.z8b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f56698a.m24540j(e9bVar, u2bVar);
                    }
                });
            }
        }

        /* renamed from: p */
        public void m24554p(tga tgaVar, int i) {
            m24555q(tgaVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: q */
        public void m24555q(tga tgaVar, int i, int i2, C2181a c2181a, int i3, Object obj, long j, long j2) {
            m24556r(tgaVar, new u2b(i, i2, c2181a, i3, obj, sqi.q1(j), sqi.q1(j2)));
        }

        /* renamed from: r */
        public void m24556r(final tga tgaVar, final u2b u2bVar) {
            Iterator it = this.f21187c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final e9b e9bVar = aVar.f21189b;
                sqi.W0(aVar.f21188a, new Runnable() { // from class: o.a9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14315a.m24541k(e9bVar, tgaVar, u2bVar);
                    }
                });
            }
        }

        /* renamed from: s */
        public void m24557s(tga tgaVar, int i) {
            m24558t(tgaVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: t */
        public void m24558t(tga tgaVar, int i, int i2, C2181a c2181a, int i3, Object obj, long j, long j2) {
            m24559u(tgaVar, new u2b(i, i2, c2181a, i3, obj, sqi.q1(j), sqi.q1(j2)));
        }

        /* renamed from: u */
        public void m24559u(final tga tgaVar, final u2b u2bVar) {
            Iterator it = this.f21187c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final e9b e9bVar = aVar.f21189b;
                sqi.W0(aVar.f21188a, new Runnable() { // from class: o.c9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17537a.m24542l(e9bVar, tgaVar, u2bVar);
                    }
                });
            }
        }

        /* renamed from: v */
        public void m24560v(tga tgaVar, int i, int i2, C2181a c2181a, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            m24562x(tgaVar, new u2b(i, i2, c2181a, i3, obj, sqi.q1(j), sqi.q1(j2)), iOException, z);
        }

        /* renamed from: w */
        public void m24561w(tga tgaVar, int i, IOException iOException, boolean z) {
            m24560v(tgaVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        /* renamed from: x */
        public void m24562x(final tga tgaVar, final u2b u2bVar, final IOException iOException, final boolean z) {
            Iterator it = this.f21187c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final e9b e9bVar = aVar.f21189b;
                sqi.W0(aVar.f21188a, new Runnable() { // from class: o.b9b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15798a.m24543m(e9bVar, tgaVar, u2bVar, iOException, z);
                    }
                });
            }
        }

        /* renamed from: y */
        public void m24563y(tga tgaVar, int i) {
            m24564z(tgaVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: z */
        public void m24564z(tga tgaVar, int i, int i2, C2181a c2181a, int i3, Object obj, long j, long j2) {
            m24546A(tgaVar, new u2b(i, i2, c2181a, i3, obj, sqi.q1(j), sqi.q1(j2)));
        }

        public C13130a(CopyOnWriteArrayList copyOnWriteArrayList, int i, x8b.C18076b c18076b) {
            this.f21187c = copyOnWriteArrayList;
            this.f21185a = i;
            this.f21186b = c18076b;
        }
    }

    /* renamed from: L */
    void mo7406L(int i, x8b.C18076b c18076b, u2b u2bVar);

    /* renamed from: U */
    void mo7409U(int i, x8b.C18076b c18076b, u2b u2bVar);

    /* renamed from: Y */
    void mo7410Y(int i, x8b.C18076b c18076b, tga tgaVar, u2b u2bVar);

    void b0(int i, x8b.C18076b c18076b, tga tgaVar, u2b u2bVar);

    void d0(int i, x8b.C18076b c18076b, tga tgaVar, u2b u2bVar, IOException iOException, boolean z);

    void h0(int i, x8b.C18076b c18076b, tga tgaVar, u2b u2bVar);
}

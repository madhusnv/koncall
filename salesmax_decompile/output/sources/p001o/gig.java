package p001o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p001o.uw7;

/* loaded from: classes2.dex */
public final class gig implements uw7 {

    /* renamed from: b */
    public static final List f25311b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f25312a;

    /* renamed from: o.gig$b */
    public static final class C13747b implements uw7.InterfaceC17465a {

        /* renamed from: a */
        public Message f25313a;

        /* renamed from: b */
        public gig f25314b;

        public C13747b() {
        }

        @Override // p001o.uw7.InterfaceC17465a
        /* renamed from: a */
        public void mo28843a() {
            ((Message) op0.m42515e(this.f25313a)).sendToTarget();
            m28844b();
        }

        /* renamed from: b */
        public final void m28844b() {
            this.f25313a = null;
            this.f25314b = null;
            gig.m28831n(this);
        }

        /* renamed from: c */
        public boolean m28845c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) op0.m42515e(this.f25313a));
            m28844b();
            return zSendMessageAtFrontOfQueue;
        }

        /* renamed from: d */
        public C13747b m28846d(Message message, gig gigVar) {
            this.f25313a = message;
            this.f25314b = gigVar;
            return this;
        }
    }

    public gig(Handler handler) {
        this.f25312a = handler;
    }

    /* renamed from: m */
    public static C13747b m28830m() {
        C13747b c13747b;
        List list = f25311b;
        synchronized (list) {
            c13747b = list.isEmpty() ? new C13747b() : (C13747b) list.remove(list.size() - 1);
        }
        return c13747b;
    }

    /* renamed from: n */
    public static void m28831n(C13747b c13747b) {
        List list = f25311b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(c13747b);
            }
        }
    }

    @Override // p001o.uw7
    /* renamed from: a */
    public uw7.InterfaceC17465a mo28832a(int i) {
        return m28830m().m28846d(this.f25312a.obtainMessage(i), this);
    }

    @Override // p001o.uw7
    /* renamed from: b */
    public boolean mo28833b(int i) {
        op0.m42511a(i != 0);
        return this.f25312a.hasMessages(i);
    }

    @Override // p001o.uw7
    /* renamed from: c */
    public uw7.InterfaceC17465a mo28834c(int i, Object obj) {
        return m28830m().m28846d(this.f25312a.obtainMessage(i, obj), this);
    }

    @Override // p001o.uw7
    /* renamed from: d */
    public void mo28835d(Object obj) {
        this.f25312a.removeCallbacksAndMessages(obj);
    }

    @Override // p001o.uw7
    /* renamed from: e */
    public Looper mo28836e() {
        return this.f25312a.getLooper();
    }

    @Override // p001o.uw7
    /* renamed from: f */
    public uw7.InterfaceC17465a mo28837f(int i, int i2, int i3) {
        return m28830m().m28846d(this.f25312a.obtainMessage(i, i2, i3), this);
    }

    @Override // p001o.uw7
    /* renamed from: g */
    public boolean mo28838g(uw7.InterfaceC17465a interfaceC17465a) {
        return ((C13747b) interfaceC17465a).m28845c(this.f25312a);
    }

    @Override // p001o.uw7
    /* renamed from: h */
    public boolean mo28839h(Runnable runnable) {
        return this.f25312a.post(runnable);
    }

    @Override // p001o.uw7
    /* renamed from: i */
    public boolean mo28840i(int i) {
        return this.f25312a.sendEmptyMessage(i);
    }

    @Override // p001o.uw7
    /* renamed from: j */
    public boolean mo28841j(int i, long j) {
        return this.f25312a.sendEmptyMessageAtTime(i, j);
    }

    @Override // p001o.uw7
    /* renamed from: k */
    public void mo28842k(int i) {
        op0.m42511a(i != 0);
        this.f25312a.removeMessages(i);
    }
}

package p001o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class xga implements zga {

    /* renamed from: d */
    public static final C18151c f53731d = m56262h(false, -9223372036854775807L);

    /* renamed from: e */
    public static final C18151c f53732e = m56262h(true, -9223372036854775807L);

    /* renamed from: f */
    public static final C18151c f53733f;

    /* renamed from: g */
    public static final C18151c f53734g;

    /* renamed from: a */
    public final ExecutorService f53735a;

    /* renamed from: b */
    public HandlerC18152d f53736b;

    /* renamed from: c */
    public IOException f53737c;

    /* renamed from: o.xga$b */
    public interface InterfaceC18150b {
        /* renamed from: k */
        void mo6963k(InterfaceC18153e interfaceC18153e, long j, long j2);

        /* renamed from: m */
        void mo6964m(InterfaceC18153e interfaceC18153e, long j, long j2, boolean z);

        /* renamed from: o */
        C18151c mo6965o(InterfaceC18153e interfaceC18153e, long j, long j2, IOException iOException, int i);
    }

    /* renamed from: o.xga$c */
    public static final class C18151c {

        /* renamed from: a */
        public final int f53738a;

        /* renamed from: b */
        public final long f53739b;

        /* renamed from: c */
        public boolean m56273c() {
            int i = this.f53738a;
            return i == 0 || i == 1;
        }

        public C18151c(int i, long j) {
            this.f53738a = i;
            this.f53739b = j;
        }
    }

    /* renamed from: o.xga$d */
    public final class HandlerC18152d extends Handler implements Runnable {

        /* renamed from: a */
        public final int f53740a;

        /* renamed from: b */
        public final InterfaceC18153e f53741b;

        /* renamed from: c */
        public final long f53742c;

        /* renamed from: d */
        public InterfaceC18150b f53743d;

        /* renamed from: e */
        public IOException f53744e;

        /* renamed from: f */
        public int f53745f;

        /* renamed from: g */
        public Thread f53746g;

        /* renamed from: h */
        public boolean f53747h;

        /* renamed from: q */
        public volatile boolean f53748q;

        public HandlerC18152d(Looper looper, InterfaceC18153e interfaceC18153e, InterfaceC18150b interfaceC18150b, int i, long j) {
            super(looper);
            this.f53741b = interfaceC18153e;
            this.f53743d = interfaceC18150b;
            this.f53740a = i;
            this.f53742c = j;
        }

        /* renamed from: a */
        public void m56274a(boolean z) {
            this.f53748q = z;
            this.f53744e = null;
            if (hasMessages(1)) {
                this.f53747h = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    this.f53747h = true;
                    this.f53741b.mo22073b();
                    Thread thread = this.f53746g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                m56276c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((InterfaceC18150b) op0.m42515e(this.f53743d)).mo6964m(this.f53741b, jElapsedRealtime, jElapsedRealtime - this.f53742c, true);
                this.f53743d = null;
            }
        }

        /* renamed from: b */
        public final void m56275b() {
            this.f53744e = null;
            xga.this.f53735a.execute((Runnable) op0.m42515e(xga.this.f53736b));
        }

        /* renamed from: c */
        public final void m56276c() {
            xga.this.f53736b = null;
        }

        /* renamed from: d */
        public final long m56277d() {
            return Math.min((this.f53745f - 1) * 1000, 5000);
        }

        /* renamed from: e */
        public void m56278e(int i) throws IOException {
            IOException iOException = this.f53744e;
            if (iOException != null && this.f53745f > i) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void m56279f(long j) {
            op0.m42517g(xga.this.f53736b == null);
            xga.this.f53736b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(1, j);
            } else {
                m56275b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f53748q) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                m56275b();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            m56276c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f53742c;
            InterfaceC18150b interfaceC18150b = (InterfaceC18150b) op0.m42515e(this.f53743d);
            if (this.f53747h) {
                interfaceC18150b.mo6964m(this.f53741b, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 2) {
                try {
                    interfaceC18150b.mo6963k(this.f53741b, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    ria.m46820d("LoadTask", "Unexpected exception handling load completed", e);
                    xga.this.f53737c = new C18156h(e);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f53744e = iOException;
            int i3 = this.f53745f + 1;
            this.f53745f = i3;
            C18151c c18151cMo6965o = interfaceC18150b.mo6965o(this.f53741b, jElapsedRealtime, j, iOException, i3);
            if (c18151cMo6965o.f53738a == 3) {
                xga.this.f53737c = this.f53744e;
            } else if (c18151cMo6965o.f53738a != 2) {
                if (c18151cMo6965o.f53738a == 1) {
                    this.f53745f = 1;
                }
                m56279f(c18151cMo6965o.f53739b != -9223372036854775807L ? c18151cMo6965o.f53739b : m56277d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f53747h;
                    this.f53746g = Thread.currentThread();
                }
                if (z) {
                    gth.m29480a("load:" + this.f53741b.getClass().getSimpleName());
                    try {
                        this.f53741b.load();
                        gth.m29481b();
                    } catch (Throwable th) {
                        gth.m29481b();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f53746g = null;
                    Thread.interrupted();
                }
                if (this.f53748q) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.f53748q) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Error e2) {
                if (!this.f53748q) {
                    ria.m46820d("LoadTask", "Unexpected error loading stream", e2);
                    obtainMessage(4, e2).sendToTarget();
                }
                throw e2;
            } catch (Exception e3) {
                if (this.f53748q) {
                    return;
                }
                ria.m46820d("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(3, new C18156h(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                if (this.f53748q) {
                    return;
                }
                ria.m46820d("LoadTask", "OutOfMemory error loading stream", e4);
                obtainMessage(3, new C18156h(e4)).sendToTarget();
            }
        }
    }

    /* renamed from: o.xga$e */
    public interface InterfaceC18153e {
        /* renamed from: b */
        void mo22073b();

        void load();
    }

    /* renamed from: o.xga$f */
    public interface InterfaceC18154f {
        /* renamed from: l */
        void mo32488l();
    }

    /* renamed from: o.xga$g */
    public static final class RunnableC18155g implements Runnable {

        /* renamed from: a */
        public final InterfaceC18154f f53750a;

        public RunnableC18155g(InterfaceC18154f interfaceC18154f) {
            this.f53750a = interfaceC18154f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f53750a.mo32488l();
        }
    }

    /* renamed from: o.xga$h */
    public static final class C18156h extends IOException {
        public C18156h(Throwable th) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb.append(str);
            super(sb.toString(), th);
        }
    }

    static {
        long j = -9223372036854775807L;
        f53733f = new C18151c(2, j);
        f53734g = new C18151c(3, j);
    }

    public xga(String str) {
        this.f53735a = sqi.P0("ExoPlayer:Loader:" + str);
    }

    /* renamed from: h */
    public static C18151c m56262h(boolean z, long j) {
        return new C18151c(z ? 1 : 0, j);
    }

    @Override // p001o.zga
    /* renamed from: a */
    public void mo6966a() throws IOException {
        m56267k(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public void m56263f() {
        ((HandlerC18152d) op0.m42519i(this.f53736b)).m56274a(false);
    }

    /* renamed from: g */
    public void m56264g() {
        this.f53737c = null;
    }

    /* renamed from: i */
    public boolean m56265i() {
        return this.f53737c != null;
    }

    /* renamed from: j */
    public boolean m56266j() {
        return this.f53736b != null;
    }

    /* renamed from: k */
    public void m56267k(int i) throws IOException {
        IOException iOException = this.f53737c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC18152d handlerC18152d = this.f53736b;
        if (handlerC18152d != null) {
            if (i == Integer.MIN_VALUE) {
                i = handlerC18152d.f53740a;
            }
            handlerC18152d.m56278e(i);
        }
    }

    /* renamed from: l */
    public void m56268l() {
        m56269m(null);
    }

    /* renamed from: m */
    public void m56269m(InterfaceC18154f interfaceC18154f) {
        HandlerC18152d handlerC18152d = this.f53736b;
        if (handlerC18152d != null) {
            handlerC18152d.m56274a(true);
        }
        if (interfaceC18154f != null) {
            this.f53735a.execute(new RunnableC18155g(interfaceC18154f));
        }
        this.f53735a.shutdown();
    }

    /* renamed from: n */
    public long m56270n(InterfaceC18153e interfaceC18153e, InterfaceC18150b interfaceC18150b, int i) {
        Looper looper = (Looper) op0.m42519i(Looper.myLooper());
        this.f53737c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC18152d(looper, interfaceC18153e, interfaceC18150b, i, jElapsedRealtime).m56279f(0L);
        return jElapsedRealtime;
    }
}

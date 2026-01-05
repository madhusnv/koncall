package p001o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class i5e extends d8 implements Serializable, vkh {

    /* renamed from: H */
    public final Object f28102H;

    /* renamed from: L */
    public long f28103L;

    /* renamed from: a */
    public String f28109a;

    /* renamed from: b */
    public Set f28110b;

    /* renamed from: c */
    public List f28111c;

    /* renamed from: d */
    public Runnable[] f28112d;

    /* renamed from: e */
    public int f28113e;

    /* renamed from: f */
    public int f28114f;

    /* renamed from: g */
    public int f28115g;

    /* renamed from: h */
    public int f28116h;
    public int j0;

    /* renamed from: q */
    public boolean f28117q;

    /* renamed from: s */
    public int f28118s;

    /* renamed from: x */
    public final Object f28119x;

    /* renamed from: y */
    public final Object f28120y;

    /* renamed from: M */
    public int f28104M = 60000;

    /* renamed from: Q */
    public int f28105Q = 250;

    /* renamed from: X */
    public int f28106X = 2;

    /* renamed from: Y */
    public boolean f28107Y = false;

    /* renamed from: Z */
    public int f28108Z = 0;
    public int h0 = 5;
    public int i0 = 0;

    /* renamed from: o.i5e$a */
    public class C14188a {
        public C14188a() {
        }
    }

    /* renamed from: o.i5e$b */
    public class C14189b extends Thread {

        /* renamed from: a */
        public Runnable f28122a = null;

        public C14189b() {
            setDaemon(i5e.this.f28117q);
            setPriority(i5e.this.h0);
        }

        /* renamed from: a */
        public void m31596a(Runnable runnable) {
            synchronized (this) {
                this.f28122a = runnable;
                notify();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:173:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
        
            r0 = r10.f28123b.f28119x;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
        
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
        
            r10.f28123b.f28111c.remove(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
        
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
        
            r1 = r10.f28123b.f28120y;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
        
            monitor-enter(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
        
            r10.f28123b.f28110b.remove(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00cc, code lost:
        
            monitor-exit(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
        
            r0 = r10.f28122a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
        
            monitor-exit(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
        
            if (r0 == null) goto L173;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
        
            r10.f28123b.mo31595s(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ef, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
        
            if (r10.f28122a != null) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
        
            wait(r10.f28123b.m31592T());
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00fe, code lost:
        
            r2 = r10.f28122a;
            r10.f28122a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0102, code lost:
        
            monitor-exit(r10);
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Runnable runnable;
            Runnable runnable2;
            boolean z = false;
            Runnable runnable3 = null;
            while (i5e.this.isRunning()) {
                try {
                    try {
                        if (runnable3 != null) {
                            runnable3.run();
                            z = false;
                        }
                        synchronized (i5e.this.f28119x) {
                            if (i5e.this.f28115g > 0) {
                                i5e.m31584L(i5e.this);
                                runnable2 = i5e.this.f28112d[i5e.this.f28113e];
                                i5e.this.f28112d[i5e.m31588P(i5e.this)] = null;
                                if (i5e.this.f28113e == i5e.this.f28112d.length) {
                                    i5e.this.f28113e = 0;
                                }
                            } else {
                                int size = i5e.this.f28110b.size();
                                if (size > i5e.this.f28106X && (size > i5e.this.f28105Q || i5e.this.f28111c.size() > i5e.this.i0)) {
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    if (jCurrentTimeMillis - i5e.this.f28103L > i5e.this.m31592T()) {
                                        i5e.this.f28103L = jCurrentTimeMillis;
                                        i5e.this.f28111c.remove(this);
                                    }
                                }
                                if (!z) {
                                    i5e.this.f28111c.add(this);
                                    z = true;
                                }
                            }
                        }
                        runnable3 = runnable2;
                    } catch (InterruptedException e) {
                        tia.m49923e(e);
                        synchronized (i5e.this.f28119x) {
                            i5e.this.f28111c.remove(this);
                            synchronized (i5e.this.f28120y) {
                                i5e.this.f28110b.remove(this);
                                synchronized (this) {
                                    runnable = this.f28122a;
                                    if (runnable == null) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    synchronized (i5e.this.f28119x) {
                        i5e.this.f28111c.remove(this);
                        synchronized (i5e.this.f28120y) {
                            i5e.this.f28110b.remove(this);
                            synchronized (this) {
                                Runnable runnable4 = this.f28122a;
                                if (runnable4 != null) {
                                    i5e.this.mo31595s(runnable4);
                                }
                                throw th;
                            }
                        }
                    }
                }
            }
            synchronized (i5e.this.f28119x) {
                i5e.this.f28111c.remove(this);
            }
            synchronized (i5e.this.f28120y) {
                i5e.this.f28110b.remove(this);
            }
            synchronized (this) {
                runnable = this.f28122a;
            }
            if (runnable == null) {
                return;
            }
            i5e.this.mo31595s(runnable);
        }
    }

    public i5e() {
        this.f28119x = new C14188a();
        this.f28120y = new C14188a();
        this.f28102H = new C14188a();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("qtp-");
        stringBuffer.append(hashCode());
        this.f28109a = stringBuffer.toString();
    }

    /* renamed from: L */
    public static /* synthetic */ int m31584L(i5e i5eVar) {
        int i = i5eVar.f28115g;
        i5eVar.f28115g = i - 1;
        return i;
    }

    /* renamed from: P */
    public static /* synthetic */ int m31588P(i5e i5eVar) {
        int i = i5eVar.f28113e;
        i5eVar.f28113e = i + 1;
        return i;
    }

    /* renamed from: T */
    public int m31592T() {
        return this.f28104M;
    }

    /* renamed from: U */
    public void m31593U() {
        synchronized (this.f28120y) {
            if (this.f28110b.size() < this.f28105Q) {
                C14189b c14189b = new C14189b();
                this.f28110b.add(c14189b);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(c14189b.hashCode());
                stringBuffer.append("@");
                stringBuffer.append(this.f28109a);
                stringBuffer.append("-");
                int i = this.f28118s;
                this.f28118s = i + 1;
                stringBuffer.append(i);
                c14189b.setName(stringBuffer.toString());
                c14189b.start();
            } else if (!this.f28107Y) {
                this.f28107Y = true;
                tia.m49921c("Max threads for {}", this);
            }
        }
    }

    @Override // p001o.vkh
    /* renamed from: c */
    public boolean mo31594c() {
        return this.f28115g > this.f28108Z;
    }

    @Override // p001o.d8
    public void doStart() {
        int i = this.f28105Q;
        int i2 = this.f28106X;
        if (i < i2 || i2 <= 0) {
            throw new IllegalArgumentException("!0<minThreads<maxThreads");
        }
        this.f28110b = new HashSet();
        this.f28111c = new ArrayList();
        this.f28112d = new Runnable[this.f28105Q];
        for (int i3 = 0; i3 < this.f28106X; i3++) {
            m31593U();
        }
    }

    @Override // p001o.d8
    public void doStop() throws InterruptedException {
        int i;
        super.doStop();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i2 = 0; i2 < 100; i2++) {
            synchronized (this.f28120y) {
                Iterator it = this.f28110b.iterator();
                while (it.hasNext()) {
                    ((Thread) it.next()).interrupt();
                }
            }
            Thread.yield();
            if (this.f28110b.size() == 0 || ((i = this.j0) > 0 && i < System.currentTimeMillis() - jCurrentTimeMillis)) {
                break;
            }
            try {
                Thread.sleep(i2 * 100);
            } catch (InterruptedException unused) {
            }
        }
        if (this.f28110b.size() > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f28110b.size());
            stringBuffer.append(" threads could not be stopped");
            tia.m49928j(stringBuffer.toString());
        }
        synchronized (this.f28102H) {
            this.f28102H.notifyAll();
        }
    }

    @Override // p001o.vkh
    /* renamed from: s */
    public boolean mo31595s(Runnable runnable) {
        C14189b c14189b;
        if (!isRunning() || runnable == null) {
            return false;
        }
        synchronized (this.f28119x) {
            int size = this.f28111c.size();
            if (size > 0) {
                c14189b = (C14189b) this.f28111c.remove(size - 1);
            } else {
                int i = this.f28115g + 1;
                this.f28115g = i;
                if (i > this.f28116h) {
                    this.f28116h = i;
                }
                Runnable[] runnableArr = this.f28112d;
                int i2 = this.f28114f;
                int i3 = i2 + 1;
                this.f28114f = i3;
                runnableArr[i2] = runnable;
                if (i3 == runnableArr.length) {
                    this.f28114f = 0;
                }
                int i4 = this.f28114f;
                int i5 = this.f28113e;
                if (i4 == i5) {
                    Runnable[] runnableArr2 = new Runnable[runnableArr.length + this.f28105Q];
                    int length = runnableArr.length - i5;
                    if (length > 0) {
                        System.arraycopy(runnableArr, i5, runnableArr2, 0, length);
                    }
                    if (this.f28113e != 0) {
                        System.arraycopy(this.f28112d, 0, runnableArr2, length, this.f28114f);
                    }
                    this.f28112d = runnableArr2;
                    this.f28113e = 0;
                    this.f28114f = this.f28115g;
                }
                z = this.f28115g > this.i0;
                c14189b = null;
            }
        }
        if (c14189b != null) {
            c14189b.m31596a(runnable);
        } else if (z) {
            m31593U();
        }
        return true;
    }
}

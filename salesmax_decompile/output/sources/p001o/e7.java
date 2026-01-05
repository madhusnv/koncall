package p001o;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/* loaded from: classes6.dex */
public abstract class e7 extends x6 implements lt3 {
    public transient int A0;

    /* renamed from: X */
    public boolean f21075X;

    /* renamed from: Y */
    public boolean f21076Y;

    /* renamed from: Z */
    public String f21077Z;

    /* renamed from: f */
    public bgf f21078f;

    /* renamed from: g */
    public vkh f21079g;

    /* renamed from: h */
    public String f21080h;
    public transient Thread[] o0;
    public transient int r0;
    public transient int s0;
    public transient int t0;
    public transient int u0;
    public transient int v0;
    public transient long w0;
    public transient long x0;
    public transient long y0;
    public transient int z0;

    /* renamed from: q */
    public int f21081q = 0;

    /* renamed from: s */
    public String f21082s = "https";

    /* renamed from: x */
    public int f21083x = 0;

    /* renamed from: y */
    public String f21084y = "https";

    /* renamed from: H */
    public int f21071H = 0;

    /* renamed from: L */
    public int f21072L = 0;

    /* renamed from: M */
    public int f21073M = 1;

    /* renamed from: Q */
    public int f21074Q = 0;
    public String h0 = "X-Forwarded-Host";
    public String i0 = "X-Forwarded-Server";
    public String j0 = "X-Forwarded-For";
    public boolean k0 = true;
    public int l0 = 200000;
    public int m0 = -1;
    public int n0 = -1;
    public Object p0 = new Object();
    public transient long q0 = -1;

    /* renamed from: o.e7$a */
    public class RunnableC13119a implements Runnable {

        /* renamed from: a */
        public int f21085a;

        public RunnableC13119a(int i) {
            this.f21085a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread threadCurrentThread = Thread.currentThread();
            synchronized (e7.this) {
                if (e7.this.o0 == null) {
                    return;
                }
                e7.this.o0[this.f21085a] = threadCurrentThread;
                String name = e7.this.o0[this.f21085a].getName();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(name);
                stringBuffer.append(" - Acceptor");
                stringBuffer.append(this.f21085a);
                stringBuffer.append(" ");
                stringBuffer.append(e7.this);
                threadCurrentThread.setName(stringBuffer.toString());
                int priority = threadCurrentThread.getPriority();
                try {
                    threadCurrentThread.setPriority(priority - e7.this.f21074Q);
                    while (e7.this.isRunning() && e7.this.mo27762d() != null) {
                        try {
                            try {
                                try {
                                    e7.this.mo24426C(this.f21085a);
                                } catch (ThreadDeath e) {
                                    throw e;
                                }
                            } catch (IOException e2) {
                                tia.m49923e(e2);
                            }
                        } catch (dj6 e3) {
                            tia.m49923e(e3);
                        } catch (Throwable th) {
                            tia.m49931m(th);
                        }
                    }
                    threadCurrentThread.setPriority(priority);
                    threadCurrentThread.setName(name);
                    synchronized (e7.this) {
                        if (e7.this.o0 != null) {
                            e7.this.o0[this.f21085a] = null;
                        }
                    }
                } catch (Throwable th2) {
                    threadCurrentThread.setPriority(priority);
                    threadCurrentThread.setName(name);
                    synchronized (e7.this) {
                        if (e7.this.o0 != null) {
                            e7.this.o0[this.f21085a] = null;
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    /* renamed from: C */
    public abstract void mo24426C(int i);

    /* renamed from: G */
    public void m24427G(y76 y76Var, vle vleVar) throws UnknownHostException {
        e38 e38VarM26002x = vleVar.m52925c().m26002x();
        String strM24437R = m24437R(e38VarM26002x.m24183l(m24434O()));
        String strM24437R2 = m24437R(e38VarM26002x.m24183l(m24435P()));
        String strM24437R3 = m24437R(e38VarM26002x.m24183l(m24433N()));
        String str = this.f21077Z;
        InetAddress byName = null;
        if (str != null) {
            e38VarM26002x.m24186o(j38.f29700e, str);
            vleVar.m52919E(null);
            vleVar.m52920F(-1);
            vleVar.m52940r();
        } else if (strM24437R != null) {
            e38VarM26002x.m24186o(j38.f29700e, strM24437R);
            vleVar.m52919E(null);
            vleVar.m52920F(-1);
            vleVar.m52940r();
        } else if (strM24437R2 != null) {
            vleVar.m52919E(strM24437R2);
        }
        if (strM24437R3 != null) {
            vleVar.m52917C(strM24437R3);
            if (this.f21075X) {
                try {
                    byName = InetAddress.getByName(strM24437R3);
                } catch (UnknownHostException e) {
                    tia.m49923e(e);
                }
            }
            if (byName != null) {
                strM24437R3 = byName.getHostName();
            }
            vleVar.m52918D(strM24437R3);
        }
    }

    /* renamed from: H */
    public void m24428H(Socket socket) {
        try {
            socket.setTcpNoDelay(true);
            int i = this.l0;
            if (i >= 0) {
                socket.setSoTimeout(i);
            }
            int i2 = this.n0;
            if (i2 >= 0) {
                socket.setSoLinger(true, i2 / 1000);
            } else {
                socket.setSoLinger(false, 0);
            }
        } catch (Exception e) {
            tia.m49923e(e);
        }
    }

    /* renamed from: I */
    public void m24429I(f28 f28Var) {
        if (this.q0 >= 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - f28Var.m25984C();
            int iM26003y = f28Var.m26003y();
            synchronized (this.p0) {
                this.r0 += iM26003y;
                this.s0++;
                int i = this.t0 - 1;
                this.t0 = i;
                this.y0 += jCurrentTimeMillis;
                if (i < 0) {
                    this.t0 = 0;
                }
                int i2 = this.t0;
                if (i2 < this.u0) {
                    this.u0 = i2;
                }
                long j = this.w0;
                if (j == 0 || jCurrentTimeMillis < j) {
                    this.w0 = jCurrentTimeMillis;
                }
                if (jCurrentTimeMillis > this.x0) {
                    this.x0 = jCurrentTimeMillis;
                }
                int i3 = this.z0;
                if (i3 == 0 || iM26003y < i3) {
                    this.z0 = iM26003y;
                }
                if (iM26003y > this.A0) {
                    this.A0 = iM26003y;
                }
            }
        }
        f28Var.m25993o();
    }

    /* renamed from: J */
    public void m24430J(f28 f28Var) {
        if (this.q0 == -1) {
            return;
        }
        synchronized (this.p0) {
            int i = this.t0 + 1;
            this.t0 = i;
            if (i > this.v0) {
                this.v0 = i;
            }
        }
    }

    /* renamed from: L */
    public int m24431L() {
        return this.f21072L;
    }

    /* renamed from: M */
    public int m24432M() {
        return this.f21073M;
    }

    /* renamed from: N */
    public String m24433N() {
        return this.j0;
    }

    /* renamed from: O */
    public String m24434O() {
        return this.h0;
    }

    /* renamed from: P */
    public String m24435P() {
        return this.i0;
    }

    /* renamed from: Q */
    public String m24436Q() {
        return this.f21080h;
    }

    /* renamed from: R */
    public String m24437R(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(44);
        return iIndexOf == -1 ? str : str.substring(0, iIndexOf);
    }

    /* renamed from: S */
    public int m24438S() {
        return this.m0;
    }

    /* renamed from: T */
    public int m24439T() {
        return this.f21081q;
    }

    /* renamed from: U */
    public boolean m24440U() {
        return this.k0;
    }

    /* renamed from: V */
    public vkh m24441V() {
        return this.f21079g;
    }

    /* renamed from: W */
    public boolean m24442W() {
        return this.f21076Y;
    }

    @Override // p001o.lt3
    /* renamed from: b */
    public void mo24443b(int i) {
        this.f21081q = i;
    }

    @Override // p001o.x6, p001o.d8
    public void doStart() {
        if (this.f21078f == null) {
            throw new IllegalStateException("No server");
        }
        mo27761a();
        super.doStart();
        if (this.f21079g == null) {
            this.f21079g = this.f21078f.m18898M();
        }
        if (this.f21079g != this.f21078f.m18898M()) {
            vkh vkhVar = this.f21079g;
            if (vkhVar instanceof pca) {
                ((pca) vkhVar).start();
            }
        }
        synchronized (this) {
            this.o0 = new Thread[m24432M()];
            int i = 0;
            while (true) {
                if (i >= this.o0.length) {
                    break;
                }
                if (!this.f21079g.mo31595s(new RunnableC13119a(i))) {
                    tia.m49929k("insufficient maxThreads configured for {}", this);
                    break;
                }
                i++;
            }
        }
        tia.m49925g("Started {}", this);
    }

    @Override // p001o.d8
    public void doStop() {
        Thread[] threadArr;
        tia.m49925g("Stopped {}", this);
        try {
            close();
        } catch (IOException e) {
            tia.m49931m(e);
        }
        if (this.f21079g == this.f21078f.m18898M()) {
            this.f21079g = null;
        } else {
            vkh vkhVar = this.f21079g;
            if (vkhVar instanceof pca) {
                ((pca) vkhVar).stop();
            }
        }
        super.doStop();
        synchronized (this) {
            threadArr = this.o0;
            this.o0 = null;
        }
        if (threadArr != null) {
            for (Thread thread : threadArr) {
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
    }

    @Override // p001o.lt3
    /* renamed from: g */
    public void mo24444g(y76 y76Var, vle vleVar) {
        if (m24442W()) {
            m24427G(y76Var, vleVar);
        }
    }

    @Override // p001o.lt3
    public bgf getServer() {
        return this.f21078f;
    }

    @Override // p001o.lt3
    /* renamed from: h */
    public void mo24445h(y76 y76Var) {
    }

    @Override // p001o.lt3
    /* renamed from: i */
    public boolean mo24446i() {
        return this.f21075X;
    }

    @Override // p001o.lt3
    /* renamed from: l */
    public int mo24447l() {
        return this.l0;
    }

    @Override // p001o.lt3
    /* renamed from: o */
    public void mo24448o(String str) {
        this.f21080h = str;
    }

    @Override // p001o.lt3
    public void setServer(bgf bgfVar) {
        this.f21078f = bgfVar;
    }

    public String toString() {
        String name = getClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf > 0) {
            name = name.substring(iLastIndexOf + 1);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name);
        stringBuffer.append("@");
        stringBuffer.append(m24436Q() == null ? "0.0.0.0" : m24436Q());
        stringBuffer.append(":");
        stringBuffer.append(getLocalPort() <= 0 ? m24439T() : getLocalPort());
        return stringBuffer.toString();
    }
}

package p001o;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public class fyf extends e7 {
    public ServerSocket B0;
    public Set C0;

    /* renamed from: o.fyf$a */
    public class RunnableC13591a extends gyf implements Runnable {

        /* renamed from: f */
        public boolean f24259f;

        /* renamed from: g */
        public f28 f24260g;

        /* renamed from: h */
        public int f24261h;

        /* renamed from: q */
        public Socket f24262q;

        public RunnableC13591a(Socket socket) {
            super(socket);
            this.f24259f = false;
            this.f24260g = fyf.this.a0(this);
            this.f24261h = socket.getSoTimeout();
            this.f24262q = socket;
        }

        @Override // p001o.u6g, p001o.y76
        /* renamed from: j */
        public int mo27763j(sl1 sl1Var) throws IOException {
            int iMo27763j = super.mo27763j(sl1Var);
            if (iMo27763j < 0) {
                close();
            }
            return iMo27763j;
        }

        /* renamed from: n */
        public void m27764n() throws IOException {
            if (fyf.this.m24441V() == null || !fyf.this.m24441V().mo31595s(this)) {
                tia.m49929k("dispatch failed for {}", this.f24260g);
                close();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int iM24438S;
            try {
                try {
                    try {
                        try {
                            fyf.this.m24430J(this.f24260g);
                            synchronized (fyf.this.C0) {
                                fyf.this.C0.add(this);
                            }
                            while (fyf.this.isStarted() && !m51053m()) {
                                if (this.f24260g.m25987F() && fyf.this.getServer().m18898M().mo31594c() && (iM24438S = fyf.this.m24438S()) >= 0 && this.f24261h != iM24438S) {
                                    this.f24261h = iM24438S;
                                    this.f24262q.setSoTimeout(iM24438S);
                                }
                                this.f24260g.m25985D();
                            }
                            fyf.this.m24429I(this.f24260g);
                            synchronized (fyf.this.C0) {
                                fyf.this.C0.remove(this);
                            }
                        } catch (dj6 e) {
                            tia.m49921c("EOF", e);
                            try {
                                close();
                            } catch (IOException e2) {
                                tia.m49923e(e2);
                            }
                            fyf.this.m24429I(this.f24260g);
                            synchronized (fyf.this.C0) {
                                fyf.this.C0.remove(this);
                            }
                        }
                    } catch (a38 e3) {
                        tia.m49921c("BAD", e3);
                        try {
                            close();
                        } catch (IOException e4) {
                            tia.m49923e(e4);
                        }
                        fyf.this.m24429I(this.f24260g);
                        synchronized (fyf.this.C0) {
                            fyf.this.C0.remove(this);
                        }
                    }
                } catch (Throwable th) {
                    tia.m49930l("handle failed", th);
                    try {
                        close();
                    } catch (IOException e5) {
                        tia.m49923e(e5);
                    }
                    fyf.this.m24429I(this.f24260g);
                    synchronized (fyf.this.C0) {
                        fyf.this.C0.remove(this);
                    }
                }
            } catch (Throwable th2) {
                fyf.this.m24429I(this.f24260g);
                synchronized (fyf.this.C0) {
                    fyf.this.C0.remove(this);
                    throw th2;
                }
            }
        }
    }

    @Override // p001o.x6
    /* renamed from: B */
    public sl1 mo27760B(int i) {
        return new pp1(i);
    }

    @Override // p001o.e7
    /* renamed from: C */
    public void mo24426C(int i) throws IOException {
        Socket socketAccept = this.B0.accept();
        m24428H(socketAccept);
        new RunnableC13591a(socketAccept).m27764n();
    }

    @Override // p001o.lt3
    /* renamed from: a */
    public void mo27761a() throws SocketException {
        ServerSocket serverSocket = this.B0;
        if (serverSocket == null || serverSocket.isClosed()) {
            this.B0 = b0(m24436Q(), m24439T(), m24431L());
        }
        this.B0.setReuseAddress(m24440U());
    }

    public f28 a0(y76 y76Var) {
        return new f28(this, y76Var, getServer());
    }

    public ServerSocket b0(String str, int i, int i2) {
        return str == null ? new ServerSocket(i, i2) : new ServerSocket(i, i2, InetAddress.getByName(str));
    }

    @Override // p001o.lt3
    public void close() throws IOException {
        ServerSocket serverSocket = this.B0;
        if (serverSocket != null) {
            serverSocket.close();
        }
        this.B0 = null;
    }

    @Override // p001o.lt3
    /* renamed from: d */
    public Object mo27762d() {
        return this.B0;
    }

    @Override // p001o.e7, p001o.x6, p001o.d8
    public void doStart() {
        this.C0 = new HashSet();
        super.doStart();
    }

    @Override // p001o.e7, p001o.d8
    public void doStop() throws IOException {
        HashSet hashSet;
        super.doStop();
        synchronized (this.C0) {
            hashSet = new HashSet(this.C0);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((RunnableC13591a) it.next()).close();
        }
    }

    @Override // p001o.e7, p001o.lt3
    /* renamed from: g */
    public void mo24444g(y76 y76Var, vle vleVar) throws SocketException {
        RunnableC13591a runnableC13591a = (RunnableC13591a) y76Var;
        int i = runnableC13591a.f24261h;
        int i2 = this.l0;
        if (i != i2) {
            runnableC13591a.f24261h = i2;
            ((Socket) y76Var.mo29643a()).setSoTimeout(this.l0);
        }
        super.mo24444g(y76Var, vleVar);
    }

    @Override // p001o.lt3
    public int getLocalPort() {
        ServerSocket serverSocket = this.B0;
        if (serverSocket == null || serverSocket.isClosed()) {
            return -1;
        }
        return this.B0.getLocalPort();
    }
}

package jakarta.mail;

import jakarta.mail.event.AbstractC3642e;
import jakarta.mail.event.C3638a;
import jakarta.mail.event.InterfaceC3639b;
import java.util.EventListener;
import java.util.Vector;
import java.util.concurrent.Executor;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.w */
/* loaded from: classes3.dex */
public abstract class AbstractC3695w implements AutoCloseable {
    private boolean connected = false;
    private final Vector<InterfaceC3639b> connectionListeners = new Vector<>();
    protected boolean debug;

    /* renamed from: q */
    private final RunnableC3648f f19430q;
    protected c0 session;
    protected volatile h0 url;

    public AbstractC3695w(c0 c0Var, h0 h0Var) {
        int i10;
        String property;
        String str;
        String str2;
        String strM8196a;
        String property2 = null;
        this.url = null;
        this.debug = false;
        this.session = c0Var;
        this.debug = c0Var.m8181b();
        this.url = h0Var;
        if (this.url != null) {
            String str3 = this.url.f19313b;
            String str4 = this.url.f19316e;
            i10 = this.url.f19319h;
            property = this.url.m8199d();
            String str5 = this.url.f19315d;
            strM8196a = h0.f19310l ? h0.m8196a(str5) : str5;
            str2 = this.url.f19320i;
            str = str3;
            property2 = str4;
        } else {
            i10 = -1;
            property = null;
            str = null;
            str2 = null;
            strM8196a = null;
        }
        int i11 = i10;
        if (str != null) {
            property2 = property2 == null ? c0Var.f19287a.getProperty(AbstractC5601a.m11238i("mail.", str, ".host")) : property2;
            if (property == null) {
                property = c0Var.f19287a.getProperty(AbstractC5601a.m11238i("mail.", str, ".user"));
            }
        }
        String property3 = property2 == null ? c0Var.f19287a.getProperty("mail.host") : property2;
        property = property == null ? c0Var.f19287a.getProperty("mail.user") : property;
        if (property == null) {
            try {
                property = System.getProperty("user.name");
            } catch (SecurityException unused) {
            }
        }
        this.url = new h0(i11, str, property3, str2, property, strM8196a);
        String property4 = c0Var.f19287a.getProperty("mail.event.scope", "folder");
        Executor executor = (Executor) c0Var.f19287a.get("mail.event.executor");
        if (property4.equalsIgnoreCase("application")) {
            this.f19430q = RunnableC3648f.m8191b(executor);
        } else if (property4.equalsIgnoreCase("session")) {
            this.f19430q = c0Var.f19296j;
        } else {
            this.f19430q = new RunnableC3648f(executor);
        }
    }

    public void addConnectionListener(InterfaceC3639b interfaceC3639b) {
        this.connectionListeners.addElement(interfaceC3639b);
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        setConnected(false);
        notifyConnectionListeners(3);
    }

    public void connect() {
        connect(null, null, null);
    }

    public void finalize() {
        try {
            this.f19430q.m8193c();
        } finally {
            super.finalize();
        }
    }

    public RunnableC3648f getEventQueue() {
        return this.f19430q;
    }

    c0 getSession() {
        return this.session;
    }

    public h0 getURLName() {
        h0 h0Var = this.url;
        if (h0Var != null) {
            String strM8196a = h0Var.f19315d;
            if (h0.f19310l) {
                strM8196a = h0.m8196a(strM8196a);
            }
            if (strM8196a != null || h0Var.f19320i != null) {
                return new h0(h0Var.f19319h, h0Var.f19313b, h0Var.f19316e, null, h0Var.m8199d(), null);
            }
        }
        return h0Var;
    }

    public synchronized boolean isConnected() {
        return this.connected;
    }

    public void notifyConnectionListeners(int i10) {
        if (this.connectionListeners.size() > 0) {
            queueEvent(new C3638a(this, i10), this.connectionListeners);
        }
        if (i10 == 3) {
            this.f19430q.m8193c();
        }
    }

    public abstract boolean protocolConnect(String str, int i10, String str2, String str3);

    public void queueEvent(AbstractC3642e abstractC3642e, Vector<? extends EventListener> vector) {
        this.f19430q.m8192a(abstractC3642e, (Vector) vector.clone());
    }

    public void removeConnectionListener(InterfaceC3639b interfaceC3639b) {
        this.connectionListeners.removeElement(interfaceC3639b);
    }

    public synchronized void setConnected(boolean z6) {
        this.connected = z6;
    }

    public void setURLName(h0 h0Var) {
        this.url = h0Var;
    }

    public String toString() {
        h0 uRLName = getURLName();
        return uRLName != null ? uRLName.toString() : super.toString();
    }

    public void connect(String str, String str2, String str3) {
        connect(str, -1, str2, str3);
    }

    public void connect(String str, String str2) {
        connect(null, str, str2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:6|(5:8|(1:10)(1:13)|14|(1:16)(1:17)|(3:19|(2:21|(1:23))(1:24)|31)(2:(0)(2:28|(1:30))|31))(1:32)|(2:(1:35)|(1:37))|(1:39)|40|(1:42)|(2:98|44)|45|(1:59)(2:49|(1:(1:52)(2:54|(1:56)))(6:58|94|60|61|(5:96|64|67|(1:69)|(1:71))|(1:(1:(1:(2:76|77)(2:78|79))(2:80|81))(1:82))(4:83|(1:85)|86|87)))|53|94|60|61|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[PHI: r0
      0x0046: PHI (r0v28 java.lang.String) = (r0v0 java.lang.String), (r0v0 java.lang.String), (r0v31 java.lang.String) binds: [B:25:0x0049, B:27:0x0055, B:20:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155 A[Catch: all -> 0x001f, TryCatch #3 {all -> 0x001f, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0014, B:10:0x001a, B:16:0x0029, B:19:0x0031, B:21:0x0039, B:23:0x0041, B:31:0x0063, B:35:0x0078, B:37:0x0093, B:39:0x00ae, B:42:0x00bb, B:44:0x00c7, B:47:0x00d2, B:49:0x00d6, B:52:0x00f3, B:60:0x0109, B:64:0x0112, B:67:0x0118, B:69:0x011e, B:71:0x012c, B:76:0x013c, B:77:0x0143, B:78:0x0144, B:79:0x014b, B:80:0x014c, B:81:0x0153, B:82:0x0154, B:83:0x0155, B:85:0x0162, B:86:0x0172, B:54:0x00f9, B:56:0x0101, B:26:0x004b, B:28:0x0057, B:30:0x005f, B:89:0x017a, B:90:0x0181), top: B:100:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void connect(java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jakarta.mail.AbstractC3695w.connect(java.lang.String, int, java.lang.String, java.lang.String):void");
    }
}

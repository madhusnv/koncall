package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes6.dex */
public class bgf extends vw7 implements px0 {

    /* renamed from: H */
    public static String f16150H;

    /* renamed from: L */
    public static /* synthetic */ Class f16151L;

    /* renamed from: M */
    public static /* synthetic */ Class f16152M;

    /* renamed from: y */
    public static C12382a f16153y = new C12382a();

    /* renamed from: c */
    public vkh f16154c;

    /* renamed from: d */
    public lt3[] f16155d;

    /* renamed from: e */
    public npi[] f16156e;

    /* renamed from: f */
    public f14 f16157f = new f14();

    /* renamed from: g */
    public boolean f16158g = true;

    /* renamed from: h */
    public boolean f16159h = false;

    /* renamed from: q */
    public ux0 f16160q = new ux0();

    /* renamed from: s */
    public List f16161s = new ArrayList();

    /* renamed from: x */
    public int f16162x = 0;

    /* renamed from: o.bgf$a */
    public static class C12382a extends Thread {

        /* renamed from: a */
        public boolean f16163a;

        /* renamed from: b */
        public ArrayList f16164b;

        public C12382a() {
            this.f16163a = false;
            this.f16164b = new ArrayList();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws InterruptedException {
            setName("Shutdown");
            tia.m49924f("Shutdown hook executing");
            Iterator it = this.f16164b.iterator();
            while (it.hasNext()) {
                bgf bgfVar = (bgf) it.next();
                if (bgfVar != null) {
                    try {
                        bgfVar.stop();
                    } catch (Exception e) {
                        tia.m49931m(e);
                    }
                    tia.m49924f("Shutdown hook complete");
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception e2) {
                        tia.m49931m(e2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    static {
        String implementationVersion;
        Class clsClass$ = f16151L;
        if (clsClass$ == null) {
            clsClass$ = class$("org.mortbay.jetty.Server");
            f16151L = clsClass$;
        }
        if (clsClass$.getPackage() == null) {
            implementationVersion = "6.1.x";
        } else {
            Class clsClass$2 = f16151L;
            if (clsClass$2 == null) {
                clsClass$2 = class$("org.mortbay.jetty.Server");
                f16151L = clsClass$2;
            }
            if (clsClass$2.getPackage().getImplementationVersion() != null) {
                Class clsClass$3 = f16151L;
                if (clsClass$3 == null) {
                    clsClass$3 = class$("org.mortbay.jetty.Server");
                    f16151L = clsClass$3;
                }
                implementationVersion = clsClass$3.getPackage().getImplementationVersion();
            }
        }
        f16150H = implementationVersion;
    }

    public bgf(int i) {
        setServer(this);
        fyf fyfVar = new fyf();
        fyfVar.mo24443b(i);
        m18900O(new lt3[]{fyfVar});
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    /* renamed from: F */
    public void m18892F(iw7 iw7Var) {
        if (m53504C() == null) {
            m53505E(iw7Var);
        } else {
            if (m53504C() instanceof kw7) {
                ((kw7) m53504C()).m36262C(iw7Var);
                return;
            }
            kw7 kw7Var = new kw7();
            kw7Var.m36264F(new iw7[]{m53504C(), iw7Var});
            m53505E(kw7Var);
        }
    }

    /* renamed from: G */
    public Object m18893G(String str) {
        return this.f16160q.m52095a(str);
    }

    /* renamed from: H */
    public lt3[] m18894H() {
        return this.f16155d;
    }

    /* renamed from: I */
    public f14 m18895I() {
        return this.f16157f;
    }

    /* renamed from: J */
    public boolean m18896J() {
        return this.f16159h;
    }

    /* renamed from: L */
    public boolean m18897L() {
        return this.f16158g;
    }

    /* renamed from: M */
    public vkh m18898M() {
        return this.f16154c;
    }

    /* renamed from: N */
    public void m18899N(f28 f28Var) {
        String strM52935m = f28Var.m26001w().m52935m();
        if (!tia.m49926h()) {
            handle(strM52935m, f28Var.m26001w(), f28Var.m25982A(), 1);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("REQUEST ");
        stringBuffer.append(strM52935m);
        stringBuffer.append(" on ");
        stringBuffer.append(f28Var);
        tia.m49920b(stringBuffer.toString());
        handle(strM52935m, f28Var.m26001w(), f28Var.m25982A(), 1);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("RESPONSE ");
        stringBuffer2.append(strM52935m);
        stringBuffer2.append("  ");
        stringBuffer2.append(f28Var.m25982A().m17710i());
        tia.m49920b(stringBuffer2.toString());
    }

    /* renamed from: O */
    public void m18900O(lt3[] lt3VarArr) {
        if (lt3VarArr != null) {
            for (lt3 lt3Var : lt3VarArr) {
                lt3Var.setServer(this);
            }
        }
        this.f16157f.m25932g(this, this.f16155d, lt3VarArr, "connector");
        this.f16155d = lt3VarArr;
    }

    /* renamed from: P */
    public void m18901P(vkh vkhVar) {
        this.f16157f.m25931f(this, this.f16154c, vkhVar, "threadpool", true);
        this.f16154c = vkhVar;
    }

    @Override // p001o.vw7, p001o.s7, p001o.d8
    public void doStart() throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("jetty-");
        stringBuffer.append(f16150H);
        tia.m49924f(stringBuffer.toString());
        g38.m28015y(f16150H);
        unb unbVar = new unb();
        int i = 0;
        int i2 = 0;
        while (true) {
            npi[] npiVarArr = this.f16156e;
            if (npiVarArr == null || i2 >= npiVarArr.length) {
                break;
            }
            npi npiVar = npiVarArr[i2];
            i2++;
        }
        Iterator it = this.f16161s.iterator();
        while (it.hasNext()) {
            try {
                ((pca) it.next()).start();
            } catch (Throwable th) {
                unbVar.m51827a(th);
            }
        }
        if (this.f16154c == null) {
            m18901P(new i5e());
        }
        try {
            vkh vkhVar = this.f16154c;
            if (vkhVar instanceof pca) {
                ((pca) vkhVar).start();
            }
        } catch (Throwable th2) {
            unbVar.m51827a(th2);
        }
        try {
            super.doStart();
        } catch (Throwable th3) {
            tia.m49930l("Error starting handlers", th3);
        }
        if (this.f16155d != null) {
            while (true) {
                lt3[] lt3VarArr = this.f16155d;
                if (i >= lt3VarArr.length) {
                    break;
                }
                try {
                    lt3VarArr[i].start();
                } catch (Throwable th4) {
                    unbVar.m51827a(th4);
                }
                i++;
            }
        }
        unbVar.m51829c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:3|(1:71)(1:7))|8|(6:10|(2:12|(2:13|(5:15|60|16|74|20)(1:72)))(0)|21|(1:23)|24|(1:26)(2:27|28))|29|(10:31|(2:32|(4:68|34|76|38)(0))|39|62|43|(1:45)|49|(3:51|(5:66|54|79|78|52)|77)|58|59)(0)|64|39|62|43|(0)|49|(0)|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0076, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        r0.m51827a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
    
        r0.m51827a(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #1 {all -> 0x0086, blocks: (B:43:0x007a, B:45:0x0080), top: B:62:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    @Override // p001o.vw7, p001o.s7, p001o.d8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void doStop() throws Exception {
        vkh vkhVar;
        unb unbVar = new unb();
        int i = 0;
        while (true) {
            npi[] npiVarArr = this.f16156e;
            if (npiVarArr == null || i >= npiVarArr.length) {
                break;
            }
            npi npiVar = npiVarArr[i];
            i++;
        }
        if (this.f16162x > 0) {
            lt3[] lt3VarArr = this.f16155d;
            if (lt3VarArr != null) {
                int length = lt3VarArr.length;
                while (true) {
                    int i2 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    tia.m49925g("Graceful shutdown {}", this.f16155d[i2]);
                    try {
                        this.f16155d[i2].close();
                    } catch (Throwable th) {
                        unbVar.m51827a(th);
                    }
                    length = i2;
                }
            }
            Class clsClass$ = f16152M;
            if (clsClass$ == null) {
                clsClass$ = class$("org.mortbay.jetty.Server$Graceful");
                f16152M = clsClass$;
            }
            iw7[] iw7VarArrMo39734p = mo39734p(clsClass$);
            if (iw7VarArrMo39734p.length > 0) {
                tq.m50332a(iw7VarArrMo39734p[0]);
                tia.m49925g("Graceful shutdown {}", null);
                throw null;
            }
            Thread.sleep(this.f16162x);
        }
        lt3[] lt3VarArr2 = this.f16155d;
        if (lt3VarArr2 != null) {
            int length2 = lt3VarArr2.length;
            while (true) {
                int i3 = length2 - 1;
                if (length2 > 0) {
                    try {
                        this.f16155d[i3].stop();
                    } catch (Throwable th2) {
                        unbVar.m51827a(th2);
                    }
                    length2 = i3;
                }
            }
            super.doStop();
            vkhVar = this.f16154c;
            if (vkhVar instanceof pca) {
                ((pca) vkhVar).stop();
            }
            if (!this.f16161s.isEmpty()) {
                List list = this.f16161s;
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    try {
                        ((pca) listIterator.previous()).stop();
                    } catch (Throwable th3) {
                        unbVar.m51827a(th3);
                    }
                }
            }
            unbVar.m51829c();
        }
        super.doStop();
        vkhVar = this.f16154c;
        if (vkhVar instanceof pca) {
        }
        if (!this.f16161s.isEmpty()) {
        }
        unbVar.m51829c();
    }

    @Override // p001o.px0
    /* renamed from: r */
    public void mo18902r() {
        this.f16160q.mo18902r();
    }
}

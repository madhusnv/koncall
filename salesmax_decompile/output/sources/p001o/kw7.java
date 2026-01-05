package p001o;

import java.io.IOException;

/* loaded from: classes6.dex */
public class kw7 extends t7 {

    /* renamed from: c */
    public static /* synthetic */ Class f32762c;

    /* renamed from: b */
    public iw7[] f32763b;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // p001o.t7
    /* renamed from: A */
    public Object mo36261A(Object obj, Class cls) {
        iw7[] iw7VarArrM36263E = m36263E();
        for (int i = 0; iw7VarArrM36263E != null && i < iw7VarArrM36263E.length; i++) {
            obj = m49496B(iw7VarArrM36263E[i], obj, cls);
        }
        return obj;
    }

    /* renamed from: C */
    public void m36262C(iw7 iw7Var) {
        iw7[] iw7VarArrM36263E = m36263E();
        Class clsClass$ = f32762c;
        if (clsClass$ == null) {
            clsClass$ = class$("org.mortbay.jetty.Handler");
            f32762c = clsClass$;
        }
        m36264F((iw7[]) ti9.m49911c(iw7VarArrM36263E, iw7Var, clsClass$));
    }

    /* renamed from: E */
    public iw7[] m36263E() {
        return this.f32763b;
    }

    /* renamed from: F */
    public void m36264F(iw7[] iw7VarArr) {
        iw7[] iw7VarArr2 = this.f32763b;
        iw7[] iw7VarArr3 = iw7VarArr2 == null ? null : (iw7[]) iw7VarArr2.clone();
        if (getServer() != null) {
            getServer().m18895I().m25932g(this, iw7VarArr3, iw7VarArr, "handler");
        }
        bgf server = getServer();
        unb unbVar = new unb();
        for (int i = 0; iw7VarArr != null && i < iw7VarArr.length; i++) {
            if (iw7VarArr[i].getServer() != server) {
                iw7VarArr[i].setServer(server);
            }
        }
        this.f32763b = iw7VarArr;
        for (int i2 = 0; iw7VarArr3 != null && i2 < iw7VarArr3.length; i2++) {
            iw7 iw7Var = iw7VarArr3[i2];
            if (iw7Var != null) {
                try {
                    if (iw7Var.isStarted()) {
                        iw7VarArr3[i2].stop();
                    }
                } catch (Throwable th) {
                    unbVar.m51827a(th);
                }
            }
        }
        unbVar.m51830d();
    }

    @Override // p001o.s7, p001o.d8
    public void doStart() throws Exception {
        unb unbVar = new unb();
        if (this.f32763b != null) {
            int i = 0;
            while (true) {
                iw7[] iw7VarArr = this.f32763b;
                if (i >= iw7VarArr.length) {
                    break;
                }
                try {
                    iw7VarArr[i].start();
                } catch (Throwable th) {
                    unbVar.m51827a(th);
                }
                i++;
            }
        }
        super.doStart();
        unbVar.m51829c();
    }

    @Override // p001o.s7, p001o.d8
    public void doStop() throws Exception {
        unb unbVar = new unb();
        try {
            super.doStop();
        } catch (Throwable th) {
            unbVar.m51827a(th);
        }
        iw7[] iw7VarArr = this.f32763b;
        if (iw7VarArr != null) {
            int length = iw7VarArr.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                }
                try {
                    this.f32763b[i].stop();
                } catch (Throwable th2) {
                    unbVar.m51827a(th2);
                }
                length = i;
            }
        }
        unbVar.m51829c();
    }

    @Override // p001o.iw7
    public void handle(String str, o48 o48Var, p48 p48Var, int i) throws wgf, IOException {
        if (this.f32763b == null || !isStarted()) {
            return;
        }
        unb unbVar = null;
        int i2 = 0;
        while (true) {
            iw7[] iw7VarArr = this.f32763b;
            if (i2 >= iw7VarArr.length) {
                break;
            }
            try {
                iw7VarArr[i2].handle(str, o48Var, p48Var, i);
            } catch (IOException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
                if (unbVar == null) {
                    unbVar = new unb();
                }
                unbVar.m51827a(e3);
            }
            i2++;
        }
        if (unbVar != null) {
            if (unbVar.m51831e() != 1) {
                throw new wgf(unbVar);
            }
            throw new wgf(unbVar.m51828b(0));
        }
    }

    @Override // p001o.s7, p001o.iw7
    public void setServer(bgf bgfVar) {
        bgf server = getServer();
        super.setServer(bgfVar);
        iw7[] iw7VarArrM36263E = m36263E();
        for (int i = 0; iw7VarArrM36263E != null && i < iw7VarArrM36263E.length; i++) {
            iw7VarArrM36263E[i].setServer(bgfVar);
        }
        if (bgfVar == null || bgfVar == server) {
            return;
        }
        bgfVar.m18895I().m25932g(this, null, this.f32763b, "handler");
    }
}

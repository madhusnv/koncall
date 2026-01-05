package p001o;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes6.dex */
public class unb extends Exception {

    /* renamed from: a */
    public Object f49228a;

    public unb() {
        super("Multiple exceptions");
    }

    /* renamed from: a */
    public void m51827a(Throwable th) {
        if (!(th instanceof unb)) {
            this.f49228a = ti9.m49909a(this.f49228a, th);
            return;
        }
        unb unbVar = (unb) th;
        for (int i = 0; i < ti9.m49917k(unbVar.f49228a); i++) {
            this.f49228a = ti9.m49909a(this.f49228a, ti9.m49913g(unbVar.f49228a, i));
        }
    }

    /* renamed from: b */
    public Throwable m51828b(int i) {
        return (Throwable) ti9.m49913g(this.f49228a, i);
    }

    /* renamed from: c */
    public void m51829c() throws Exception {
        int iM49917k = ti9.m49917k(this.f49228a);
        if (iM49917k != 0) {
            if (iM49917k != 1) {
                throw this;
            }
            Throwable th = (Throwable) ti9.m49913g(this.f49228a, 0);
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (!(th instanceof Exception)) {
                throw this;
            }
            throw ((Exception) th);
        }
    }

    /* renamed from: d */
    public void m51830d() {
        int iM49917k = ti9.m49917k(this.f49228a);
        if (iM49917k != 0) {
            if (iM49917k != 1) {
                throw new RuntimeException(this);
            }
            Throwable th = (Throwable) ti9.m49913g(this.f49228a, 0);
            if (th instanceof Error) {
                throw ((Error) th);
            }
            if (!(th instanceof RuntimeException)) {
                throw new RuntimeException(th);
            }
            throw ((RuntimeException) th);
        }
    }

    /* renamed from: e */
    public int m51831e() {
        return ti9.m49917k(this.f49228a);
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        super.printStackTrace();
        for (int i = 0; i < ti9.m49917k(this.f49228a); i++) {
            ((Throwable) ti9.m49913g(this.f49228a, i)).printStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (ti9.m49917k(this.f49228a) <= 0) {
            return "org.mortbay.util.MultiException[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("org.mortbay.util.MultiException");
        stringBuffer.append(ti9.m49914h(this.f49228a));
        return stringBuffer.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        for (int i = 0; i < ti9.m49917k(this.f49228a); i++) {
            ((Throwable) ti9.m49913g(this.f49228a, i)).printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        for (int i = 0; i < ti9.m49917k(this.f49228a); i++) {
            ((Throwable) ti9.m49913g(this.f49228a, i)).printStackTrace(printWriter);
        }
    }
}

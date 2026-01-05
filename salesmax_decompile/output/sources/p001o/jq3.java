package p001o;

/* loaded from: classes2.dex */
public class jq3 {

    /* renamed from: a */
    public final jb3 f30939a;

    /* renamed from: b */
    public boolean f30940b;

    public jq3() {
        this(jb3.f30077a);
    }

    /* renamed from: a */
    public synchronized void m34266a() {
        while (!this.f30940b) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized void m34267b() {
        boolean z = false;
        while (!this.f30940b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public synchronized boolean m34268c() {
        boolean z;
        z = this.f30940b;
        this.f30940b = false;
        return z;
    }

    /* renamed from: d */
    public synchronized boolean m34269d() {
        return this.f30940b;
    }

    /* renamed from: e */
    public synchronized boolean m34270e() {
        if (this.f30940b) {
            return false;
        }
        this.f30940b = true;
        notifyAll();
        return true;
    }

    public jq3(jb3 jb3Var) {
        this.f30939a = jb3Var;
    }
}

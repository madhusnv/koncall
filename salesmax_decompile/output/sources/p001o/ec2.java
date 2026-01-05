package p001o;

import android.os.CancellationSignal;

/* loaded from: classes2.dex */
public final class ec2 {

    /* renamed from: a */
    public boolean f21352a;

    /* renamed from: b */
    public InterfaceC13157a f21353b;

    /* renamed from: c */
    public Object f21354c;

    /* renamed from: d */
    public boolean f21355d;

    /* renamed from: o.ec2$a */
    public interface InterfaceC13157a {
        void onCancel();
    }

    /* renamed from: a */
    public void m24745a() {
        synchronized (this) {
            if (this.f21352a) {
                return;
            }
            this.f21352a = true;
            this.f21355d = true;
            InterfaceC13157a interfaceC13157a = this.f21353b;
            Object obj = this.f21354c;
            if (interfaceC13157a != null) {
                try {
                    interfaceC13157a.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f21355d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f21355d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public void m24746b(InterfaceC13157a interfaceC13157a) {
        synchronized (this) {
            m24747c();
            if (this.f21353b == interfaceC13157a) {
                return;
            }
            this.f21353b = interfaceC13157a;
            if (this.f21352a && interfaceC13157a != null) {
                interfaceC13157a.onCancel();
            }
        }
    }

    /* renamed from: c */
    public final void m24747c() throws InterruptedException {
        while (this.f21355d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}

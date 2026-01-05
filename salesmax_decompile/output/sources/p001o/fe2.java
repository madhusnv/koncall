package p001o;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p001o.fe2;

/* loaded from: classes2.dex */
public class fe2 {

    /* renamed from: a */
    public final Executor f23177a;

    /* renamed from: b */
    public final Object f23178b = new Object();

    /* renamed from: c */
    public final Set f23179c = new LinkedHashSet();

    /* renamed from: d */
    public final Set f23180d = new LinkedHashSet();

    /* renamed from: e */
    public final Set f23181e = new LinkedHashSet();

    /* renamed from: f */
    public final CameraDevice.StateCallback f23182f = new C13407a();

    /* renamed from: o.fe2$a */
    public class C13407a extends CameraDevice.StateCallback {
        public C13407a() {
        }

        /* renamed from: f */
        public static /* synthetic */ void m26496f(LinkedHashSet linkedHashSet, int i) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((ugg) it.next()).mo17116d(i);
            }
        }

        /* renamed from: c */
        public final void m26498c() {
            List listM26488f;
            synchronized (fe2.this.f23178b) {
                listM26488f = fe2.this.m26488f();
                fe2.this.f23181e.clear();
                fe2.this.f23179c.clear();
                fe2.this.f23180d.clear();
            }
            Iterator it = listM26488f.iterator();
            while (it.hasNext()) {
                ((ugg) it.next()).mo17113a();
            }
        }

        /* renamed from: d */
        public final void m26499d(final int i) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (fe2.this.f23178b) {
                linkedHashSet.addAll(fe2.this.f23181e);
                linkedHashSet.addAll(fe2.this.f23179c);
            }
            fe2.this.f23177a.execute(new Runnable() { // from class: o.de2
                @Override // java.lang.Runnable
                public final void run() {
                    fe2.C13407a.m26496f(linkedHashSet, i);
                }
            });
        }

        /* renamed from: e */
        public final void m26500e() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (fe2.this.f23178b) {
                linkedHashSet.addAll(fe2.this.f23181e);
                linkedHashSet.addAll(fe2.this.f23179c);
            }
            fe2.this.f23177a.execute(new Runnable() { // from class: o.ee2
                @Override // java.lang.Runnable
                public final void run() {
                    fe2.m26483b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            m26500e();
            m26498c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            m26500e();
            m26498c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            m26500e();
            m26499d(i);
            m26498c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public fe2(Executor executor) {
        this.f23177a = executor;
    }

    /* renamed from: b */
    public static void m26483b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ugg uggVar = (ugg) it.next();
            uggVar.mo17115c().mo17128q(uggVar);
        }
    }

    /* renamed from: a */
    public final void m26484a(ugg uggVar) {
        ugg uggVar2;
        Iterator it = m26488f().iterator();
        while (it.hasNext() && (uggVar2 = (ugg) it.next()) != uggVar) {
            uggVar2.mo17113a();
        }
    }

    /* renamed from: c */
    public CameraDevice.StateCallback m26485c() {
        return this.f23182f;
    }

    /* renamed from: d */
    public List m26486d() {
        ArrayList arrayList;
        synchronized (this.f23178b) {
            arrayList = new ArrayList(this.f23179c);
        }
        return arrayList;
    }

    /* renamed from: e */
    public List m26487e() {
        ArrayList arrayList;
        synchronized (this.f23178b) {
            arrayList = new ArrayList(this.f23181e);
        }
        return arrayList;
    }

    /* renamed from: f */
    public List m26488f() {
        ArrayList arrayList;
        synchronized (this.f23178b) {
            arrayList = new ArrayList();
            arrayList.addAll(m26486d());
            arrayList.addAll(m26487e());
        }
        return arrayList;
    }

    /* renamed from: g */
    public void m26489g(ugg uggVar) {
        synchronized (this.f23178b) {
            this.f23179c.remove(uggVar);
            this.f23180d.remove(uggVar);
        }
    }

    /* renamed from: h */
    public void m26490h(ugg uggVar) {
        synchronized (this.f23178b) {
            this.f23180d.add(uggVar);
        }
    }

    /* renamed from: i */
    public void m26491i(ugg uggVar) {
        m26484a(uggVar);
        synchronized (this.f23178b) {
            this.f23181e.remove(uggVar);
        }
    }

    /* renamed from: j */
    public void m26492j(ugg uggVar) {
        synchronized (this.f23178b) {
            this.f23179c.add(uggVar);
            this.f23181e.remove(uggVar);
        }
        m26484a(uggVar);
    }

    /* renamed from: k */
    public void m26493k(ugg uggVar) {
        synchronized (this.f23178b) {
            this.f23181e.add(uggVar);
        }
    }
}

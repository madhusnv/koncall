package p020v;

import android.hardware.camera2.CameraDevice;
import com.amplifyframework.storage.s3.transfer.RunnableC1257d;
import i0.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import k0.ExecutorC3900j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 extends CameraDevice.StateCallback {

    /* renamed from: a */
    public final /* synthetic */ int f36567a;

    /* renamed from: b */
    public final Object f36568b;

    public h0(x0 x0Var) {
        this.f36567a = 1;
        this.f36568b = x0Var;
    }

    /* renamed from: a */
    public void m14389a() {
        ArrayList arrayListM14490u;
        synchronized (((x0) this.f36568b).f36755c) {
            arrayListM14490u = ((x0) this.f36568b).m14490u();
            ((LinkedHashSet) ((x0) this.f36568b).f36758f).clear();
            ((LinkedHashSet) ((x0) this.f36568b).f36756d).clear();
            ((LinkedHashSet) ((x0) this.f36568b).f36757e).clear();
        }
        int size = arrayListM14490u.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM14490u.get(i10);
            i10++;
            g1 g1Var = (g1) obj;
            synchronized (g1Var.f36544a) {
                try {
                    List list = g1Var.f36554k;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((v0) it.next()).m7417b();
                        }
                        g1Var.f36554k = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g1Var.f36564u.m177p();
        }
    }

    /* renamed from: b */
    public void m14390b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((x0) this.f36568b).f36755c) {
            linkedHashSet.addAll((LinkedHashSet) ((x0) this.f36568b).f36758f);
            linkedHashSet.addAll((LinkedHashSet) ((x0) this.f36568b).f36756d);
        }
        ((ExecutorC3900j) ((x0) this.f36568b).f36754b).execute(new RunnableC7606p(3, linkedHashSet));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f36567a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36568b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraDevice.StateCallback) obj).onClosed(cameraDevice);
                }
                break;
            default:
                m14390b();
                m14389a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f36567a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36568b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraDevice.StateCallback) obj).onDisconnected(cameraDevice);
                }
                break;
            default:
                m14390b();
                m14389a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.f36567a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36568b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((CameraDevice.StateCallback) obj).onError(cameraDevice, i10);
                }
                return;
            default:
                m14390b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((x0) this.f36568b).f36755c) {
                    linkedHashSet.addAll((LinkedHashSet) ((x0) this.f36568b).f36758f);
                    linkedHashSet.addAll((LinkedHashSet) ((x0) this.f36568b).f36756d);
                }
                ((ExecutorC3900j) ((x0) this.f36568b).f36754b).execute(new RunnableC1257d(linkedHashSet, i10, 3));
                m14389a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.f36567a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f36568b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((CameraDevice.StateCallback) obj).onOpened(cameraDevice);
                }
                break;
        }
    }

    public h0(ArrayList arrayList) {
        this.f36567a = 0;
        this.f36568b = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) obj;
            if (!(stateCallback instanceof i0)) {
                ((ArrayList) this.f36568b).add(stateCallback);
            }
        }
    }

    /* renamed from: c */
    private final void m14388c(CameraDevice cameraDevice) {
    }
}

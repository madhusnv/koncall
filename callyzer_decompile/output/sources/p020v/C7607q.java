package p020v;

import a1.C0004c;
import a9.C0073l;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import c0.a0;
import c0.u1;
import com.amplifyframework.storage.s3.transfer.RunnableC1255b;
import eb.i3;
import i0.C3080k;
import i0.g2;
import i0.j1;
import i0.l1;
import i0.o1;
import i0.q0;
import i0.r2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import k0.ExecutorC3900j;
import k0.ScheduledExecutorServiceC3894d;
import l0.AbstractC4308h;
import l0.C4304d;
import l0.C4305e;
import l0.RunnableC4302b;
import p021w.RunnableC7844j;
import pg.i7;
import pg.t8;
import qi.RunnableC6224g;
import x4.C8299i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.q */
/* loaded from: classes.dex */
public final class C7607q extends CameraDevice.StateCallback {

    /* renamed from: a */
    public final /* synthetic */ int f36665a = 1;

    /* renamed from: b */
    public final Object f36666b;

    /* renamed from: c */
    public final Object f36667c;

    public C7607q(Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f36667c = executor;
        this.f36666b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f36665a) {
            case 0:
                ((C7612v) this.f36667c).m14455w("openCameraConfigAndClose camera closed");
                ((C8299i) this.f36666b).m15507b(null);
                break;
            default:
                ((Executor) this.f36667c).execute(new RunnableC7844j(this, cameraDevice, 0));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f36665a) {
            case 0:
                ((C7612v) this.f36667c).m14455w("openCameraConfigAndClose camera disconnected");
                ((C8299i) this.f36666b).m15507b(null);
                break;
            default:
                ((Executor) this.f36667c).execute(new RunnableC7844j(this, cameraDevice, 1));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.f36665a) {
            case 0:
                ((C7612v) this.f36667c).m14455w("openCameraConfigAndClose camera error " + i10);
                ((C8299i) this.f36666b).m15507b(null);
                break;
            default:
                ((Executor) this.f36667c).execute(new RunnableC1255b(this, cameraDevice, i10, 7));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        int i10 = this.f36665a;
        Object obj = this.f36667c;
        switch (i10) {
            case 0:
                C7612v c7612v = (C7612v) obj;
                ExecutorC3900j executorC3900j = c7612v.f36721c;
                c7612v.m14455w("openCameraConfigAndClose camera opened");
                o0 o0Var = new o0(c7612v.f36716O, new i3(Collections.EMPTY_LIST), false);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                u1 u1Var = new u1(surface);
                AbstractC4308h.m9034d(u1Var.f16604e).mo9026a(new RunnableC6224g(11, surface, surfaceTexture), t8.m11872a());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                j1 j1VarM7349b = j1.m7349b();
                ArrayList arrayList = new ArrayList();
                l1 l1VarM7361a = l1.m7361a();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                C0073l c0073lM7353a = C3080k.m7353a(u1Var);
                c0073lM7353a.f268e = a0.f5035d;
                linkedHashSet.add(c0073lM7353a.m219k());
                c7612v.m14455w("Start configAndClose.");
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                o1 o1VarM7399a = o1.m7399a(j1VarM7349b);
                ArrayList arrayList10 = new ArrayList(arrayList);
                r2 r2Var = r2.f16576b;
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = l1VarM7361a.f16577a;
                for (String str : arrayMap2.keySet()) {
                    arrayMap.put(str, arrayMap2.get(str));
                }
                g2 g2Var = new g2(arrayList5, arrayList6, arrayList7, arrayList8, new q0(arrayList9, o1VarM7399a, 1, arrayList10, false, new r2(arrayMap), null), null, null, 0, null);
                x0 x0Var = c7612v.f36710H;
                i3 i3Var = (i3) x0Var.f36758f;
                i3 i3Var2 = (i3) x0Var.f36759g;
                x0 x0Var2 = (x0) x0Var.f36757e;
                ExecutorC3900j executorC3900j2 = (ExecutorC3900j) x0Var.f36754b;
                RunnableC4302b runnableC4302bM9037g = AbstractC4308h.m9037g(C4304d.m9025b(i7.m11697b(new C4305e(o0Var.m14417l(g2Var, cameraDevice, new g1((Handler) x0Var.f36756d, i3Var, i3Var2, (ScheduledExecutorServiceC3894d) x0Var.f36755c, executorC3900j2, x0Var2)), 1))), new C0004c(20, o0Var, u1Var), executorC3900j);
                Objects.requireNonNull(cameraDevice);
                runnableC4302bM9037g.mo9026a(new RunnableC7606p(0, cameraDevice), executorC3900j);
                break;
            default:
                ((Executor) obj).execute(new RunnableC7844j(this, cameraDevice, 2));
                break;
        }
    }

    public C7607q(C7612v c7612v, C8299i c8299i) {
        this.f36667c = c7612v;
        this.f36666b = c8299i;
    }
}

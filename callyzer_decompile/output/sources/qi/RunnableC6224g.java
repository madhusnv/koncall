package qi;

import a1.C0006e;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.hardware.camera2.TotalCaptureResult;
import android.media.ImageWriter;
import android.os.Process;
import android.os.StrictMode;
import android.util.ArrayMap;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import b6.InterfaceC0600a;
import be.C0655j;
import c0.C0823p;
import c0.d1;
import c0.n1;
import c0.x1;
import c9.C0915j;
import cj.C0979e;
import com.google.firebase.messaging.FirebaseMessaging;
import d9.ExecutorC1668m;
import e0.C1894c;
import ef.C2046f;
import i0.AbstractC3084o;
import i0.d2;
import i0.e2;
import i0.g2;
import i0.t2;
import i1.AbstractC3131j;
import ia.C3220l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.coroutines.DispatchException;
import l0.AbstractC4308h;
import l1.C4327p;
import m0.C4610d;
import og.pe;
import org.bouncycastle.iana.AEADAlgorithm;
import p020v.C7597g;
import p020v.C7599i;
import p020v.C7612v;
import p020v.InterfaceC7598h;
import p021w.C7851q;
import pg.i7;
import q0.C6070k;
import qj.InterfaceC6237b;
import r0.C6412c;
import r0.C6414e;
import ri.ScheduledFutureC6550h;
import ri.ThreadFactoryC6543a;
import rw.AbstractC6663m;
import s0.AbstractC6705i;
import t5.AbstractC7044b;
import tx.C7251k;
import u8.C7356d;
import u8.C7361i;
import u8.InterfaceC7354b;
import uf.C7427b;
import ug.m2;
import ux.C7569c;
import wi.C8062l;
import wi.C8066p;
import wi.C8068r;
import wj.C8086l;
import x4.C8299i;
import y2.ViewOnAttachStateChangeListenerC8534d;
import yg.C8650g;
import yi.C8674c;
import yi.C8679h;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qi.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6224g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f30222a;

    /* renamed from: b */
    public final /* synthetic */ Object f30223b;

    /* renamed from: c */
    public final /* synthetic */ Object f30224c;

    public /* synthetic */ RunnableC6224g(int i10, Object obj, Object obj2) {
        this.f30222a = i10;
        this.f30223b = obj;
        this.f30224c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException, DispatchException {
        int i10 = 2;
        switch (this.f30222a) {
            case 0:
                C6231n c6231n = (C6231n) this.f30223b;
                InterfaceC6237b interfaceC6237b = (InterfaceC6237b) this.f30224c;
                synchronized (c6231n) {
                    try {
                        if (c6231n.f30248b == null) {
                            c6231n.f30247a.add(interfaceC6237b);
                        } else {
                            c6231n.f30248b.add(interfaceC6237b.get());
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                final C6414e c6414e = (C6414e) this.f30223b;
                x1 x1Var = (x1) this.f30224c;
                c6414e.f30935e++;
                C6412c c6412c = c6414e.f30931a;
                boolean z6 = x1Var.f5262e;
                Size size = x1Var.f5259b;
                AbstractC6705i.m12835d((AtomicBoolean) c6412c.f15432c, true);
                AbstractC6705i.m12834c((Thread) c6412c.f15434e);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(z6 ? c6412c.f30924p : c6412c.f30925q);
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                x1Var.m2236a(surface, c6414e.f30933c, new InterfaceC0600a() { // from class: r0.d
                    @Override // b6.InterfaceC0600a
                    public final void accept(Object obj) {
                        C6414e c6414e2 = c6414e;
                        c6414e2.getClass();
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface.release();
                        c6414e2.f30935e--;
                        c6414e2.m12421d();
                    }
                });
                if (z6) {
                    c6414e.f30939i = surfaceTexture;
                    return;
                } else {
                    c6414e.f30940j = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(c6414e, c6414e.f30934d);
                    return;
                }
            case 2:
                C6414e c6414e2 = (C6414e) this.f30223b;
                C6070k c6070k = (C6070k) this.f30224c;
                Surface surfaceM12080j = c6070k.m12080j(c6414e2.f30933c, new C4610d(i10, c6414e2, c6070k));
                c6414e2.f30931a.m6821k(surfaceM12080j);
                c6414e2.f30938h.put(c6070k, surfaceM12080j);
                return;
            case 3:
                ThreadFactoryC6543a threadFactoryC6543a = (ThreadFactoryC6543a) this.f30223b;
                Runnable runnable = (Runnable) this.f30224c;
                Process.setThreadPriority(threadFactoryC6543a.f31379c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC6543a.f31380d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 4:
                Callable callable = (Callable) this.f30223b;
                ScheduledFutureC6550h scheduledFutureC6550h = (ScheduledFutureC6550h) ((C4327p) this.f30224c).f21788b;
                try {
                    scheduledFutureC6550h.m15504j(callable.call());
                    return;
                } catch (Exception e2) {
                    scheduledFutureC6550h.mo15505k(e2);
                    return;
                }
            case 5:
                ((AbstractC7044b) this.f30223b).mo9654h((Typeface) this.f30224c);
                return;
            case 6:
                C7356d c7356d = (C7356d) this.f30223b;
                C0915j c0915j = (C0915j) this.f30224c;
                synchronized (c7356d.f35013k) {
                    try {
                        ArrayList arrayList = c7356d.f35012j;
                        int size2 = arrayList.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            ((InterfaceC7354b) obj).mo1381a(c0915j, false);
                        }
                    } finally {
                    }
                }
                return;
            case 7:
                ((C7251k) this.f30223b).m13527B((C7569c) this.f30224c);
                return;
            case 8:
                C7599i c7599i = (C7599i) this.f30223b;
                AbstractC3084o abstractC3084o = (AbstractC3084o) this.f30224c;
                C0006e c0006e = c7599i.f36593y;
                ((HashSet) c0006e.f33b).remove(abstractC3084o);
                ((ArrayMap) c0006e.f34c).remove(abstractC3084o);
                return;
            case 9:
                C7599i c7599i2 = (C7599i) this.f30223b;
                AbstractC4308h.m9035e(i7.m11697b(new C2046f(c7599i2, c7599i2.m14399p())), (C8299i) this.f30224c);
                return;
            case 10:
                C7597g c7597g = (C7597g) this.f30223b;
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.f30224c;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = (HashSet) c7597g.f36542b;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    InterfaceC7598h interfaceC7598h = (InterfaceC7598h) it.next();
                    if (interfaceC7598h.mo14373a(totalCaptureResult)) {
                        hashSet.add(interfaceC7598h);
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                hashSet2.removeAll(hashSet);
                return;
            case 11:
                Surface surface2 = (Surface) this.f30223b;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.f30224c;
                surface2.release();
                surfaceTexture2.release();
                return;
            case 12:
                C7612v c7612v = (C7612v) this.f30223b;
                String str = (String) this.f30224c;
                c7612v.m14455w("Use case " + str + " INACTIVE");
                LinkedHashMap linkedHashMap = c7612v.f36719a.f10051a;
                if (linkedHashMap.containsKey(str)) {
                    t2 t2Var = (t2) linkedHashMap.get(str);
                    t2Var.f16590f = false;
                    if (!t2Var.f16589e) {
                        linkedHashMap.remove(str);
                    }
                }
                c7612v.m14448M();
                return;
            case 13:
                ((d2) this.f30223b).mo2191a((g2) this.f30224c, e2.SESSION_ERROR_SURFACE_NEEDS_RESET);
                return;
            case 14:
                d1 d1Var = (d1) this.f30223b;
                C8299i c8299i = (C8299i) this.f30224c;
                try {
                    String[] strArrM14836c = ((C7851q) d1Var.f5071f).m14836c();
                    AbstractC4154l.m8922e(strArrM14836c, "getCameraIdList(...)");
                    ArrayList arrayList2 = new ArrayList(strArrM14836c.length);
                    for (String str2 : strArrM14836c) {
                        AbstractC4154l.m8920c(str2);
                        arrayList2.add(new C0823p(pe.m10835j(str2), null));
                    }
                    AbstractC6663m.m12748L(arrayList2, null, null, null, null, 63);
                    d1Var.m2189j(arrayList2, null);
                    c8299i.m15507b(arrayList2);
                    return;
                } catch (CameraAccessExceptionCompat e10) {
                    CameraUnavailableException cameraUnavailableException = new CameraUnavailableException(e10);
                    d1Var.m2189j(null, cameraUnavailableException);
                    c8299i.m15509d(cameraUnavailableException);
                    return;
                }
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C0655j c0655j = (C0655j) this.f30223b;
                C8849i c8849i = (C8849i) this.f30224c;
                c0655j.m1883m();
                ((AtomicBoolean) c8849i.f42584c).set(false);
                ImageWriter imageWriter = (ImageWriter) c8849i.f42583b;
                if (imageWriter != null) {
                    imageWriter.close();
                    return;
                }
                return;
            case 16:
                ((C8849i) ((C3220l) this.f30223b).f17356c).m16318K((C7361i) this.f30224c, 3);
                return;
            case 17:
                ((C8062l) this.f30223b).m15199c((String) this.f30224c, Boolean.FALSE);
                return;
            case 18:
                C8066p c8066p = (C8066p) this.f30223b;
                Throwable th2 = (Throwable) this.f30224c;
                Map map = Collections.EMPTY_MAP;
                C8062l c8062l = c8066p.f38630g;
                Thread threadCurrentThread = Thread.currentThread();
                c8062l.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                C8068r c8068r = c8062l.f38612n;
                if (c8068r == null || !c8068r.f38650e.get()) {
                    long j6 = jCurrentTimeMillis / 1000;
                    String strM15200d = c8062l.m15200d();
                    if (strM15200d == null) {
                        return;
                    }
                    C8674c c8674c = new C8674c(strM15200d, j6, map);
                    C0979e c0979e = c8062l.f38611m;
                    c0979e.getClass();
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    c0979e.m2784s(th2, threadCurrentThread, "error", c8674c, false);
                    return;
                }
                return;
            case 19:
                ((m2) this.f30223b).m14060a((Intent) this.f30224c);
                return;
            case 20:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f30223b;
                C8650g c8650g = (C8650g) this.f30224c;
                C7427b c7427b = FirebaseMessaging.f7158k;
                try {
                    c8650g.m15969b(firebaseMessaging.m4480a());
                    return;
                } catch (Exception e11) {
                    c8650g.m15968a(e11);
                    return;
                }
            case 21:
                C8086l c8086l = (C8086l) this.f30223b;
                C8650g c8650g2 = (C8650g) this.f30224c;
                try {
                    c8650g2.m15969b(c8086l.m15222h());
                    return;
                } catch (Exception e12) {
                    c8650g2.m15968a(e12);
                    return;
                }
            case 22:
                AbstractC3131j.m7512b((ViewOnAttachStateChangeListenerC8534d) this.f30223b, (LongSparseArray) this.f30224c);
                return;
            case 23:
                C0979e c0979e2 = (C0979e) this.f30223b;
                ((C8679h) c0979e2.f5803b).m16020h((String) c0979e2.f5802a, (List) this.f30224c);
                return;
            case 24:
                C1894c c1894c = (C1894c) this.f30223b;
                d1 d1Var2 = (d1) this.f30224c;
                HashSet hashSet3 = new HashSet();
                if (c1894c != null) {
                    hashSet3.addAll(c1894c.f8915a);
                }
                ((n1) d1Var2.f5072g).getClass();
                return;
            default:
                Runnable runnable2 = (Runnable) this.f30223b;
                ExecutorC1668m executorC1668m = (ExecutorC1668m) this.f30224c;
                try {
                    runnable2.run();
                    return;
                } finally {
                    executorC1668m.m5380a();
                }
        }
    }

    public /* synthetic */ RunnableC6224g(C8066p c8066p, Throwable th2) {
        this.f30222a = 18;
        Map map = Collections.EMPTY_MAP;
        this.f30223b = c8066p;
        this.f30224c = th2;
    }
}

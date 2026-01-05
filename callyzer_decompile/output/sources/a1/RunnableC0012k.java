package a1;

import a0.C0001a;
import a9.AbstractC0067f;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import b6.InterfaceC0600a;
import be.C0655j;
import c0.C0815h;
import c0.C0829v;
import c0.ExecutorC0821n;
import c0.f1;
import c0.j1;
import c0.x1;
import c6.C0885o;
import c9.C0927v;
import com.amplifyframework.core.category.Category;
import com.amplifyframework.storage.s3.operation.AWSS3StorageDownloadFileOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StoragePathUploadFileOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageUploadFileOperation;
import com.amplifyframework.storage.s3.operation.AWSS3StorageUploadInputStreamOperation;
import com.amplifyframework.storage.s3.request.AWSS3StorageDownloadFileRequest;
import com.amplifyframework.storage.s3.request.AWSS3StoragePathUploadRequest;
import com.amplifyframework.storage.s3.request.AWSS3StorageUploadRequest;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.j4;
import cy.C1531b;
import cy.C1534e;
import cy.InterfaceC1535f;
import d7.h0;
import d9.AbstractC1665j;
import dj.C1731d;
import ex.InterfaceC2139c;
import h1.g2;
import i0.c1;
import i0.g0;
import i0.g1;
import i0.h1;
import i0.l0;
import j0.C3505e;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k0.ScheduledExecutorServiceC3894d;
import kotlin.jvm.internal.AbstractC4154l;
import m0.C4610d;
import nf.C5047i;
import org.bouncycastle.iana.AEADAlgorithm;
import p004e.AbstractActivityC1878m;
import p020v.C7600j;
import p020v.RunnableC7606p;
import q0.C6062c;
import q0.C6070k;
import qi.C6232o;
import qj.InterfaceC6236a;
import qj.InterfaceC6237b;
import s0.AbstractC6705i;
import u8.C7368p;
import ue.EnumC7422d;
import x4.C8299i;
import xe.C8365q;
import z8.C8899b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a1.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0012k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f62a;

    /* renamed from: b */
    public final /* synthetic */ Object f63b;

    /* renamed from: c */
    public final /* synthetic */ Object f64c;

    public /* synthetic */ RunnableC0012k(int i10, Object obj, Object obj2) {
        this.f62a = i10;
        this.f64c = obj;
        this.f63b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        InterfaceC6236a interfaceC6236a;
        int i10 = 1;
        switch (this.f62a) {
            case 0:
                ((C0018q) ((C5047i) this.f64c).f24823b).f82m.mo2206C((x1) this.f63b);
                return;
            case 1:
                f0 f0Var = (f0) this.f64c;
                x1 x1Var = (x1) this.f63b;
                x1 x1Var2 = f0Var.f45h;
                if (x1Var2 != null && x1Var2 == x1Var) {
                    f0Var.f45h = null;
                    f0Var.f44g = null;
                }
                C0013l c0013l = f0Var.f49l;
                if (c0013l != null) {
                    c0013l.m97c();
                    f0Var.f49l = null;
                    return;
                }
                return;
            case 2:
                List list = (List) this.f64c;
                AbstractC0067f abstractC0067f = (AbstractC0067f) this.f63b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C8899b) it.next()).m16403a(abstractC0067f.f254d);
                }
                return;
            case 3:
                j4 j4Var = (j4) this.f64c;
                c1 c1Var = (c1) this.f63b;
                j4Var.getClass();
                c1Var.mo18d(j4Var);
                return;
            case 4:
                C0829v c0829v = (C0829v) this.f64c;
                C8299i c8299i = (C8299i) this.f63b;
                C7600j c7600j = c0829v.f5233g;
                C0001a c0001a = c7600j.f36596b;
                synchronized (c0001a.f0a) {
                    c0001a.f2c.clear();
                    c0001a.f3d.clear();
                    c0001a.f5f.clear();
                    c0001a.f4e.clear();
                    c0001a.f6g = 0;
                }
                c7600j.f36604j.m2187g();
                if (c0829v.f5232f != null) {
                    Executor executor = c0829v.f5230d;
                    if (executor instanceof ExecutorC0821n) {
                        ExecutorC0821n executorC0821n = (ExecutorC0821n) executor;
                        synchronized (executorC0821n.f5180a) {
                            try {
                                if (!executorC0821n.f5181b.isShutdown()) {
                                    executorC0821n.f5181b.shutdown();
                                }
                            } finally {
                            }
                        }
                    }
                    c0829v.f5232f.quit();
                }
                c8299i.m15507b(null);
                return;
            case 5:
                C0655j c0655j = (C0655j) this.f64c;
                C0655j c0655j2 = (C0655j) this.f63b;
                c0655j.m1883m();
                if (c0655j2 != null) {
                    c0655j2.m1883m();
                    return;
                }
                return;
            case 6:
                f1 f1Var = (f1) this.f64c;
                c1 c1Var2 = (c1) this.f63b;
                f1Var.getClass();
                c1Var2.mo18d(f1Var);
                return;
            case 7:
                ((j1) this.f64c).mo2206C((x1) this.f63b);
                return;
            case 8:
                ((Category) this.f64c).initialize((Context) this.f63b);
                return;
            case 9:
                AWSS3StorageDownloadFileOperation.start$lambda$1((AWSS3StorageDownloadFileOperation) this.f64c, (AWSS3StorageDownloadFileRequest) this.f63b);
                return;
            case 10:
                AWSS3StoragePathUploadFileOperation.start$lambda$0((AWSS3StoragePathUploadFileOperation) this.f64c, (AWSS3StoragePathUploadRequest) this.f63b);
                return;
            case 11:
                AWSS3StorageUploadFileOperation.start$lambda$1((AWSS3StorageUploadFileOperation) this.f64c, (AWSS3StorageUploadRequest) this.f63b);
                return;
            case 12:
                AWSS3StorageUploadInputStreamOperation.start$lambda$1((AWSS3StorageUploadInputStreamOperation) this.f64c, (AWSS3StorageUploadRequest) this.f63b);
                return;
            case 13:
                ((InterfaceC2139c) this.f64c).invoke((w3.j1) this.f63b);
                return;
            case 14:
                ((C1534e) ((InterfaceC1535f) this.f64c)).m5082g((C1531b) this.f63b, qw.a0.f30746a);
                return;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C7368p c7368p = (C7368p) this.f64c;
                String string = ((UUID) this.f63b).toString();
                AbstractC4154l.m8922e(string, "id.toString()");
                AbstractC1665j.m5376a(string, c7368p);
                return;
            case 16:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f64c;
                JobParameters jobParameters = (JobParameters) this.f63b;
                int i11 = JobInfoSchedulerService.f5957a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 17:
                C1731d c1731d = (C1731d) this.f64c;
                countDownLatch = (CountDownLatch) this.f63b;
                try {
                    C8365q.m15536a().f40023d.m7653h(c1731d.f8392h.f40014a.m15533b(EnumC7422d.HIGHEST), 1);
                } catch (Exception unused) {
                }
                return;
            case 18:
                AbstractActivityC1878m abstractActivityC1878m = (AbstractActivityC1878m) this.f64c;
                abstractActivityC1878m.getLifecycle().mo5343a(new C0885o(1, (p004e.c0) this.f63b, abstractActivityC1878m));
                return;
            case 19:
                ((g0) this.f64c).mo7319q().mo7320b().mo5320j((h0) this.f63b);
                return;
            case 20:
                ((i0.e0) this.f64c).mo7320b().m5316f((i0.h0) this.f63b);
                return;
            case 21:
                l0 l0Var = (l0) this.f64c;
                g0 g0Var = (g0) this.f63b;
                synchronized (l0Var.f16515a) {
                    try {
                        l0Var.f16517c.remove(g0Var);
                        if (l0Var.f16517c.isEmpty()) {
                            l0Var.f16519e.getClass();
                            l0Var.f16519e.m15507b(null);
                            l0Var.f16519e = null;
                            l0Var.f16518d = null;
                        }
                    } finally {
                    }
                }
                return;
            case 22:
                ((d7.g0) ((C0927v) this.f64c).f5668b).mo5320j((g1) this.f63b);
                return;
            case 23:
                g1 g1Var = (g1) this.f64c;
                h1 h1Var = (h1) this.f63b;
                if (g1Var.f16463a.get()) {
                    h1Var.getClass();
                    g1Var.f16464b.mo88q(h1Var.f16479a);
                    return;
                }
                return;
            case 24:
                C3505e.m8065m((C3505e) this.f64c, (d7.d0) this.f63b);
                return;
            case 25:
                RunnableC7606p runnableC7606p = (RunnableC7606p) this.f64c;
                countDownLatch = (CountDownLatch) this.f63b;
                try {
                    runnableC7606p.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 26:
                C6062c c6062c = (C6062c) this.f64c;
                C6070k c6070k = (C6070k) this.f63b;
                Surface surfaceM12080j = c6070k.m12080j(c6062c.f29566c, new C4610d(i10, c6062c, c6070k));
                c6062c.f29564a.m6821k(surfaceM12080j);
                c6062c.f29571h.put(c6070k, surfaceM12080j);
                return;
            case 27:
                final C6062c c6062c2 = (C6062c) this.f64c;
                final x1 x1Var3 = (x1) this.f63b;
                c6062c2.f29572i++;
                g2 g2Var = c6062c2.f29564a;
                AbstractC6705i.m12835d((AtomicBoolean) g2Var.f15432c, true);
                AbstractC6705i.m12834c((Thread) g2Var.f15434e);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(g2Var.f15431b);
                Size size = x1Var3.f5259b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                ScheduledExecutorServiceC3894d scheduledExecutorServiceC3894d = c6062c2.f29566c;
                x1Var3.m2237b(scheduledExecutorServiceC3894d, new C0004c(16, c6062c2, x1Var3));
                x1Var3.m2236a(surface, scheduledExecutorServiceC3894d, new InterfaceC0600a() { // from class: q0.b
                    @Override // b6.InterfaceC0600a
                    public final void accept(Object obj) {
                        C6062c c6062c3 = c6062c2;
                        x1 x1Var4 = x1Var3;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        synchronized (x1Var4.f5258a) {
                            x1Var4.f5270m = null;
                            x1Var4.f5271n = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        c6062c3.f29572i--;
                        c6062c3.m12068d();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(c6062c2, c6062c2.f29567d);
                return;
            case 28:
                ((InterfaceC0600a) ((AtomicReference) this.f63b).get()).accept(new C0815h((C6070k) this.f64c));
                return;
            default:
                C6232o c6232o = (C6232o) this.f64c;
                InterfaceC6237b interfaceC6237b = (InterfaceC6237b) this.f63b;
                if (c6232o.f30252b != C6232o.f30250d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (c6232o) {
                    interfaceC6236a = c6232o.f30251a;
                    c6232o.f30251a = null;
                    c6232o.f30252b = interfaceC6237b;
                }
                interfaceC6236a.mo19e(interfaceC6237b);
                return;
        }
    }
}

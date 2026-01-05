package og;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.sun.mail.util.AbstractC1452a;
import ec.C2005c;
import ec.InterfaceC2004b;
import ec.InterfaceC2016n;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import sb.C6778e;
import sb.InterfaceC6777d;
import yb.AbstractC8610b;
import yb.InterfaceC8609a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class mb {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final void m10760a(InterfaceC4026c interfaceC4026c, Throwable th2) {
        boolean zIsTerminated;
        if (interfaceC4026c != 0) {
            if (th2 != null) {
                try {
                    AbstractC1452a.m4552C(interfaceC4026c);
                    return;
                } catch (Throwable th3) {
                    md.m10764a(th2, th3);
                    return;
                }
            }
            if (interfaceC4026c instanceof AutoCloseable) {
                interfaceC4026c.close();
                return;
            }
            if (!(interfaceC4026c instanceof ExecutorService)) {
                if (interfaceC4026c instanceof TypedArray) {
                    ((TypedArray) interfaceC4026c).recycle();
                    return;
                } else if (interfaceC4026c instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) interfaceC4026c).release();
                    return;
                } else {
                    if (!(interfaceC4026c instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) interfaceC4026c).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) interfaceC4026c;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z6 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z6) {
                        executorService.shutdownNow();
                        z6 = true;
                    }
                }
            }
            if (z6) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: b */
    public static final InterfaceC6777d m10761b(InterfaceC6777d interfaceC6777d, InterfaceC8609a metric) {
        AbstractC4154l.m8923f(interfaceC6777d, "<this>");
        AbstractC4154l.m8923f(metric, "metric");
        InterfaceC2004b interfaceC2004b = ((C6778e) interfaceC6777d).f32243e;
        if (interfaceC2004b instanceof InterfaceC2016n) {
            AbstractC8610b.m15957c((InterfaceC2016n) interfaceC2004b, metric);
            return interfaceC6777d;
        }
        C2005c c2005cM10984j = ud.m10984j(interfaceC2004b);
        AbstractC8610b.m15957c(c2005cM10984j, metric);
        return ff.m10653a(interfaceC6777d, null, c2005cM10984j, 31);
    }
}

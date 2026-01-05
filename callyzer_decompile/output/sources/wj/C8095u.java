package wj;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import e1.C1903e;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p020v.x0;
import pg.l8;
import s1.u0;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.u */
/* loaded from: classes.dex */
public final class C8095u {

    /* renamed from: i */
    public static final long f38743i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    public static final /* synthetic */ int f38744j = 0;

    /* renamed from: a */
    public final Context f38745a;

    /* renamed from: b */
    public final u0 f38746b;

    /* renamed from: c */
    public final x0 f38747c;

    /* renamed from: d */
    public final FirebaseMessaging f38748d;

    /* renamed from: f */
    public final ScheduledThreadPoolExecutor f38750f;

    /* renamed from: h */
    public final C8093s f38752h;

    /* renamed from: e */
    public final C1903e f38749e = new C1903e(0);

    /* renamed from: g */
    public boolean f38751g = false;

    public C8095u(FirebaseMessaging firebaseMessaging, u0 u0Var, C8093s c8093s, x0 x0Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f38748d = firebaseMessaging;
        this.f38746b = u0Var;
        this.f38752h = c8093s;
        this.f38747c = x0Var;
        this.f38745a = context;
        this.f38750f = scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public static void m15272a(C8656m c8656m) throws IOException {
        try {
            l8.m11761b(c8656m, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e10);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: b */
    public final void m15273b(String str) throws IOException {
        String strM4480a = this.f38748d.m4480a();
        x0 x0Var = this.f38747c;
        x0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        m15272a(x0Var.m14485o(x0Var.m14477M(strM4480a, "/topics/" + str, bundle)));
    }

    /* renamed from: c */
    public final void m15274c(String str) throws IOException {
        String strM4480a = this.f38748d.m4480a();
        x0 x0Var = this.f38747c;
        x0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        m15272a(x0Var.m14485o(x0Var.m14477M(strM4480a, "/topics/" + str, bundle)));
    }

    /* renamed from: d */
    public final synchronized void m15275d(boolean z6) {
        this.f38751g = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[Catch: IOException -> 0x0038, TRY_LEAVE, TryCatch #2 {IOException -> 0x0038, blocks: (B:11:0x0016, B:24:0x004c, B:16:0x0027, B:18:0x002f, B:21:0x003b, B:23:0x0043), top: B:78:0x0016 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m15276e() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.C8095u.m15276e():boolean");
    }

    /* renamed from: f */
    public final void m15277f(long j6) {
        this.f38750f.schedule(new RunnableC8097w(this, this.f38745a, this.f38746b, Math.min(Math.max(30L, 2 * j6), f38743i)), j6, TimeUnit.SECONDS);
        m15275d(true);
    }
}

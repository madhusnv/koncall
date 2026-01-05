package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.AbstractC2355c;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001o.pi8;

/* loaded from: classes2.dex */
public class ProfileInstallerInitializer implements pi8 {

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    public static class C2351a {
        /* renamed from: a */
        public static Handler m8972a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    public static class C2352b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m8966f(Context context, long j) {
        m8971e(context);
    }

    /* renamed from: i */
    public static void m8969i(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: o.rmd
            @Override // java.lang.Runnable
            public final void run() throws PackageManager.NameNotFoundException {
                AbstractC2355c.m8999i(context);
            }
        });
    }

    @Override // p001o.pi8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C2352b create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: o.pmd
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.f40270a.m8966f(applicationContext, j);
            }
        });
        return new C2352b();
    }

    @Override // p001o.pi8
    public List dependencies() {
        return Collections.emptyList();
    }

    /* renamed from: e */
    public void m8971e(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? C2351a.m8972a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: o.qmd
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m8969i(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}

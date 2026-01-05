package wi;

import android.util.Log;
import io.C3328c;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import ti.C7162b;
import uf.C7427b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.r */
/* loaded from: classes.dex */
public final class C8068r implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final C7427b f38646a;

    /* renamed from: b */
    public final C3328c f38647b;

    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler f38648c;

    /* renamed from: d */
    public final C7162b f38649d;

    /* renamed from: e */
    public final AtomicBoolean f38650e = new AtomicBoolean(false);

    public C8068r(C7427b c7427b, C3328c c3328c, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C7162b c7162b) {
        this.f38646a = c7427b;
        this.f38647b = c3328c;
        this.f38648c = uncaughtExceptionHandler;
        this.f38649d = c7162b;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        AtomicBoolean atomicBoolean = this.f38650e;
        atomicBoolean.set(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f38648c;
        if (thread == null || th2 == null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
        } else {
            try {
                if (this.f38649d.m13421b()) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    Log.isLoggable("FirebaseCrashlytics", 3);
                } else {
                    this.f38646a.m13819n(this.f38647b, thread, th2);
                }
            } catch (Exception unused) {
                if (uncaughtExceptionHandler != null) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    System.exit(1);
                }
                atomicBoolean.set(false);
                return;
            } catch (Throwable th3) {
                if (uncaughtExceptionHandler != null) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } else {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    System.exit(1);
                }
                atomicBoolean.set(false);
                throw th3;
            }
        }
        if (uncaughtExceptionHandler != null) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            Log.isLoggable("FirebaseCrashlytics", 3);
            System.exit(1);
        }
        atomicBoolean.set(false);
    }
}

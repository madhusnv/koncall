package p001o;

import android.preference.PreferenceManager;
import com.facebook.C10773c;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes5.dex */
public final class lc0 {

    /* renamed from: a */
    public static final lc0 f33586a = new lc0();

    /* renamed from: b */
    public static final String f33587b = lc0.class.getSimpleName();

    /* renamed from: c */
    public static final ReentrantReadWriteLock f33588c = new ReentrantReadWriteLock();

    /* renamed from: d */
    public static String f33589d;

    /* renamed from: e */
    public static volatile boolean f33590e;

    /* renamed from: b */
    public static final String m36881b() {
        if (!f33590e) {
            f33586a.m36884c();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f33588c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = f33589d;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th) {
            f33588c.readLock().unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public static final void m36882d() {
        if (f33590e) {
            return;
        }
        ao8.f15070b.m17570c().execute(new Runnable() { // from class: o.kc0
            @Override // java.lang.Runnable
            public final void run() {
                lc0.m36883e();
            }
        });
    }

    /* renamed from: e */
    public static final void m36883e() {
        f33586a.m36884c();
    }

    /* renamed from: c */
    public final void m36884c() {
        if (f33590e) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f33588c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f33590e) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            f33589d = PreferenceManager.getDefaultSharedPreferences(C10773c.m13019l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f33590e = true;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f33588c.writeLock().unlock();
            throw th;
        }
    }
}

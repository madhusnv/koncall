package p001o;

import android.os.Handler;
import android.os.Looper;
import com.facebook.C10773c;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p001o.lk8;

/* loaded from: classes5.dex */
public final class a94 {

    /* renamed from: a */
    public static final a94 f14306a = new a94();

    /* renamed from: b */
    public static final Set f14307b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public static boolean f14308c;

    /* renamed from: o.a94$a */
    public static final class RunnableC12115a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Throwable f14309a;

        public RunnableC12115a(Throwable th) {
            this.f14309a = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException(this.f14309a);
        }
    }

    /* renamed from: a */
    public static final void m16691a() {
        f14308c = true;
    }

    /* renamed from: b */
    public static final void m16692b(Throwable th, Object obj) {
        sq8.m48649h(obj, NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST);
        if (f14308c) {
            f14307b.add(obj);
            if (C10773c.m13023p()) {
                wk6.m54665c(th);
                lk8.C15093a.m37385b(th, lk8.EnumC15095c.CrashShield).m37383g();
            }
            m16695e(th);
        }
    }

    /* renamed from: c */
    public static final boolean m16693c() {
        return false;
    }

    /* renamed from: d */
    public static final boolean m16694d(Object obj) {
        sq8.m48649h(obj, NotificationBundleProcessor.PUSH_MINIFIED_BUTTONS_LIST);
        return f14307b.contains(obj);
    }

    /* renamed from: e */
    public static final void m16695e(Throwable th) {
        if (m16693c()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC12115a(th));
        }
    }
}

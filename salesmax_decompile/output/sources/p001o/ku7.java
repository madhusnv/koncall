package p001o;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class ku7 {

    /* renamed from: a */
    public static final ku7 f32716a = new ku7();

    /* renamed from: b */
    public static final String f32717b;

    /* renamed from: c */
    public static final gi9 f32718c;

    /* renamed from: d */
    public static final AtomicBoolean f32719d;

    /* renamed from: o.ku7$a */
    public static final class C14926a extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C14926a f32720a = new C14926a();

        public C14926a() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newCachedThreadPool();
        }
    }

    static {
        String string = ku7.class.toString();
        sq8.m48648g(string, "GpsTopicsManager::class.java.toString()");
        f32717b = string;
        f32718c = si9.m48360a(C14926a.f32720a);
        f32719d = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public static final void m36237a() {
        if (a94.m16694d(ku7.class)) {
            return;
        }
        try {
            f32719d.set(true);
        } catch (Throwable th) {
            a94.m16692b(th, ku7.class);
        }
    }
}

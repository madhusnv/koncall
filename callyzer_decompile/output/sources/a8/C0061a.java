package a8;

import al.C0174b;
import c9.C0917l;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a8.a */
/* loaded from: classes.dex */
public final class C0061a {

    /* renamed from: c */
    public static final C0174b f240c = new C0174b(1);

    /* renamed from: d */
    public static final LinkedHashMap f241d = new LinkedHashMap();

    /* renamed from: a */
    public final ReentrantLock f242a;

    /* renamed from: b */
    public final C0917l f243b;

    public C0061a(String str, boolean z6) {
        ReentrantLock reentrantLock;
        synchronized (f240c) {
            try {
                LinkedHashMap linkedHashMap = f241d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f242a = reentrantLock;
        this.f243b = z6 ? new C0917l(str) : null;
    }
}

package ud;

import dy.AbstractC1862j;
import dy.C1861i;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import td.C7124a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ud.c */
/* loaded from: classes.dex */
public final class C7399c implements Closeable {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35177f = AtomicReferenceFieldUpdater.newUpdater(C7399c.class, Object.class, "d");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f35178g = AtomicIntegerFieldUpdater.newUpdater(C7399c.class, "e");

    /* renamed from: a */
    public final long f35179a;

    /* renamed from: b */
    public final C7124a f35180b;

    /* renamed from: c */
    public final C1861i f35181c;

    /* renamed from: d */
    public volatile /* synthetic */ Object f35182d;

    /* renamed from: e */
    public volatile /* synthetic */ int f35183e;

    public C7399c(long j6, C7124a clock) {
        AbstractC4154l.m8923f(clock, "clock");
        this.f35179a = j6;
        this.f35180b = clock;
        this.f35181c = AbstractC1862j.m5494a(1);
        this.f35182d = null;
        this.f35183e = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (f35178g.compareAndSet(this, 0, 1)) {
            while (true) {
                Object obj = this.f35182d;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35177f;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:40:0x00ae, B:42:0x00b4, B:43:0x00b6, B:45:0x00bc, B:48:0x00c4, B:51:0x00cb, B:52:0x00d2, B:53:0x00d3, B:54:0x00d8), top: B:59:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:40:0x00ae, B:42:0x00b4, B:43:0x00b6, B:45:0x00bc, B:48:0x00c4, B:51:0x00cb, B:52:0x00d2, B:53:0x00d3, B:54:0x00d8), top: B:59:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ex.c] */
    /* JADX WARN: Type inference failed for: r2v7, types: [dy.e] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m13805h(ex.InterfaceC2139c r11, ww.AbstractC8193c r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.C7399c.m13805h(ex.c, ww.c):java.lang.Object");
    }
}

package o6;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.z */
/* loaded from: classes.dex */
public class C5324z implements InterfaceC5300b {

    /* renamed from: a */
    public final File f26206a;

    /* renamed from: b */
    public final w0 f26207b;

    /* renamed from: c */
    public final AtomicBoolean f26208c;

    public C5324z(File file, w0 serializer) {
        AbstractC4154l.m8923f(serializer, "serializer");
        this.f26206a = file;
        this.f26207b = serializer;
        this.f26208c = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [o6.z] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m10470a(o6.C5324z r7, ww.AbstractC8193c r8) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C5324z.m10470a(o6.z, ww.c):java.lang.Object");
    }

    @Override // o6.InterfaceC5300b
    public final void close() {
        this.f26208c.set(true);
    }
}

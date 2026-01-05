package xe;

import ef.C2045e;
import ef.C2049i;
import ef.InterfaceC2044d;
import java.io.Closeable;
import pw.InterfaceC6043a;
import ye.C8640e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xe.j */
/* loaded from: classes.dex */
public final class C8358j implements Closeable {

    /* renamed from: a */
    public InterfaceC6043a f40001a;

    /* renamed from: b */
    public C8640e f40002b;

    /* renamed from: c */
    public InterfaceC6043a f40003c;

    /* renamed from: d */
    public C2045e f40004d;

    /* renamed from: e */
    public InterfaceC6043a f40005e;

    /* renamed from: f */
    public InterfaceC6043a f40006f;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((C2049i) ((InterfaceC2044d) this.f40005e.get())).close();
    }
}

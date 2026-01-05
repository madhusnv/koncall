package cl;

import d7.EnumC1644p;
import d7.InterfaceC1648t;
import d7.i0;
import java.io.Closeable;
import qf.InterfaceC6210i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cl.a */
/* loaded from: classes.dex */
public interface InterfaceC0981a extends Closeable, InterfaceC1648t, InterfaceC6210i {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @i0(EnumC1644p.ON_DESTROY)
    void close();
}

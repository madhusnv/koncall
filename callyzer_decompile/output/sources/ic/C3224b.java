package ic;

import java.util.zip.CRC32;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ic.b */
/* loaded from: classes.dex */
public final class C3224b extends AbstractC3225c {

    /* renamed from: a */
    public final CRC32 f17391a = new CRC32();

    @Override // ic.AbstractC3225c
    /* renamed from: c */
    public final int mo7577c() {
        return (int) this.f17391a.getValue();
    }

    @Override // ic.InterfaceC3227e
    public final void reset() {
        this.f17391a.reset();
    }

    @Override // ic.InterfaceC3227e
    public final void update(byte[] input, int i10, int i11) {
        AbstractC4154l.m8923f(input, "input");
        this.f17391a.update(input, i10, i11);
    }
}

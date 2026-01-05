package ic;

import java.security.MessageDigest;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ic.h */
/* loaded from: classes.dex */
public final class C3230h implements InterfaceC3227e {

    /* renamed from: a */
    public final MessageDigest f17395a = MessageDigest.getInstance("SHA-256");

    @Override // ic.InterfaceC3227e
    /* renamed from: a */
    public final byte[] mo7578a() {
        byte[] bArrDigest = this.f17395a.digest();
        AbstractC4154l.m8922e(bArrDigest, "digest(...)");
        return bArrDigest;
    }

    @Override // ic.InterfaceC3227e
    /* renamed from: b */
    public final int mo7579b() {
        return 64;
    }

    @Override // ic.InterfaceC3227e
    public final void update(byte[] input, int i10, int i11) {
        AbstractC4154l.m8923f(input, "input");
        this.f17395a.update(input, i10, i11);
    }
}

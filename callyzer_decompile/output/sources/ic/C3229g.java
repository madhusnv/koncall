package ic;

import java.security.MessageDigest;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ic.g */
/* loaded from: classes.dex */
public final class C3229g implements InterfaceC3227e {

    /* renamed from: a */
    public final MessageDigest f17394a = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);

    @Override // ic.InterfaceC3227e
    /* renamed from: a */
    public final byte[] mo7578a() {
        byte[] bArrDigest = this.f17394a.digest();
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
        this.f17394a.update(input, i10, i11);
    }
}

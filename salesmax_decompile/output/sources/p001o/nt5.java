package p001o;

import androidx.media3.common.C2181a;
import java.io.EOFException;
import p001o.uth;

/* loaded from: classes2.dex */
public final class nt5 implements uth {

    /* renamed from: a */
    public final byte[] f37284a = new byte[4096];

    @Override // p001o.uth
    /* renamed from: a */
    public void mo7071a(long j, int i, int i2, int i3, uth.C17452a c17452a) {
    }

    @Override // p001o.uth
    /* renamed from: b */
    public void mo7072b(C2181a c2181a) {
    }

    @Override // p001o.uth
    /* renamed from: d */
    public int mo7073d(pu4 pu4Var, int i, boolean z, int i2) throws EOFException {
        int i3 = pu4Var.read(this.f37284a, 0, Math.min(this.f37284a.length, i));
        if (i3 != -1) {
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p001o.uth
    /* renamed from: f */
    public void mo7074f(zwc zwcVar, int i, int i2) {
        zwcVar.m60018V(i);
    }
}

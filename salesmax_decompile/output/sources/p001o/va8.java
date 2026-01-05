package p001o;

import androidx.media3.common.Metadata;
import java.io.EOFException;
import p001o.ua8;

/* loaded from: classes2.dex */
public final class va8 {

    /* renamed from: a */
    public final zwc f50071a = new zwc(10);

    /* renamed from: a */
    public Metadata m52494a(uq6 uq6Var, ua8.InterfaceC17345a interfaceC17345a) {
        Metadata metadataM51303e = null;
        int i = 0;
        while (true) {
            try {
                uq6Var.mo40498m(this.f50071a.m60024e(), 0, 10);
                this.f50071a.m60017U(0);
                if (this.f50071a.m60007K() != 4801587) {
                    break;
                }
                this.f50071a.m60018V(3);
                int iM60003G = this.f50071a.m60003G();
                int i2 = iM60003G + 10;
                if (metadataM51303e == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f50071a.m60024e(), 0, bArr, 0, 10);
                    uq6Var.mo40498m(bArr, 10, iM60003G);
                    metadataM51303e = new ua8(interfaceC17345a).m51303e(bArr, i2);
                } else {
                    uq6Var.mo40494h(iM60003G);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        uq6Var.mo40490c();
        uq6Var.mo40494h(i);
        return metadataM51303e;
    }
}

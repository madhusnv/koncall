package g2;

import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.NoWhenBranchMatchedException;
import org.bouncycastle.iana.AEADAlgorithm;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class xd {

    /* renamed from: a */
    public static final k2.i2 f13268a = new k2.i2(w1.f13091y);

    /* renamed from: a */
    public static final g4.o0 m6341a(j2.t0 t0Var, InterfaceC3962k interfaceC3962k) {
        vd vdVar = (vd) ((C3966o) interfaceC3962k).m8618k(f13268a);
        switch (wd.f13183a[t0Var.ordinal()]) {
            case 1:
                return vdVar.f13045a;
            case 2:
                return vdVar.f13046b;
            case 3:
                return vdVar.f13047c;
            case 4:
                return vdVar.f13048d;
            case 5:
                return vdVar.f13049e;
            case 6:
                return vdVar.f13050f;
            case 7:
                return vdVar.f13051g;
            case 8:
                return vdVar.f13052h;
            case 9:
                return vdVar.f13053i;
            case 10:
                return vdVar.f13054j;
            case 11:
                return vdVar.f13055k;
            case 12:
                return vdVar.f13056l;
            case 13:
                return vdVar.f13057m;
            case 14:
                return vdVar.f13058n;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return vdVar.f13059o;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

package xt;

import ex.InterfaceC2137a;
import k2.w0;
import org.bouncycastle.iana.AEADAlgorithm;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xt.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8457h implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f41249a;

    /* renamed from: b */
    public final /* synthetic */ w0 f41250b;

    public /* synthetic */ C8457h(w0 w0Var, int i10) {
        this.f41249a = i10;
        this.f41250b = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f41249a) {
            case 0:
                this.f41250b.setValue(Boolean.TRUE);
                break;
            case 1:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            case 4:
                break;
            case 5:
                this.f41250b.setValue(Boolean.TRUE);
                break;
            case 6:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            case 7:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            case 8:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            case 9:
                this.f41250b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 10:
                this.f41250b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 11:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            case 12:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            case 13:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            case 14:
                this.f41250b.setValue(Boolean.TRUE);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                this.f41250b.setValue(Boolean.TRUE);
                break;
            case 16:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            case 17:
                this.f41250b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 18:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            case 19:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            case 20:
                this.f41250b.setValue(Boolean.FALSE);
                break;
            default:
                this.f41250b.setValue(Boolean.TRUE);
                break;
        }
        return a0.f30746a;
    }
}

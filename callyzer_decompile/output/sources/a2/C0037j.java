package a2;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import org.bouncycastle.iana.AEADAlgorithm;
import qw.a0;
import s4.C6754j;
import s4.EnumC6757m;
import t3.v0;
import t3.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a2.j */
/* loaded from: classes.dex */
public final class C0037j extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f157a;

    /* renamed from: b */
    public final /* synthetic */ w0 f158b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0037j(w0 w0Var, int i10) {
        super(1);
        this.f157a = i10;
        this.f158b = w0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f157a) {
            case 0:
                ((v0) obj).m13324d(this.f158b, 0, 0, DefinitionKt.NO_Float_VALUE);
                break;
            case 1:
                ((v0) obj).m13324d(this.f158b, 0, 0, DefinitionKt.NO_Float_VALUE);
                break;
            case 2:
                v0.m13319g((v0) obj, this.f158b, 0, 0);
                break;
            case 3:
                ((v0) obj).m13324d(this.f158b, 0, 0, DefinitionKt.NO_Float_VALUE);
                break;
            case 4:
                ((v0) obj).m13324d(this.f158b, 0, 0, DefinitionKt.NO_Float_VALUE);
                break;
            case 5:
                ((v0) obj).m13324d(this.f158b, 0, 0, DefinitionKt.NO_Float_VALUE);
                break;
            case 6:
                ((v0) obj).m13324d(this.f158b, 0, 0, DefinitionKt.NO_Float_VALUE);
                break;
            case 7:
                v0.m13319g((v0) obj, this.f158b, 0, 0);
                break;
            case 8:
                v0.m13319g((v0) obj, this.f158b, 0, 0);
                break;
            case 9:
                v0 v0Var = (v0) obj;
                EnumC6757m enumC6757mMo13293b = v0Var.mo13293b();
                EnumC6757m enumC6757m = EnumC6757m.Ltr;
                w0 w0Var = this.f158b;
                if (enumC6757mMo13293b == enumC6757m || v0Var.mo13294c() == 0) {
                    v0.m13316a(v0Var, w0Var);
                    w0Var.k0(C6754j.m12942c(0L, w0Var.f34034e), DefinitionKt.NO_Float_VALUE, null);
                } else {
                    long jMo13294c = ((v0Var.mo13294c() - w0Var.f34030a) - r1) << 32;
                    v0.m13316a(v0Var, w0Var);
                    w0Var.k0(C6754j.m12942c((((int) 0) & 4294967295L) | jMo13294c, w0Var.f34034e), DefinitionKt.NO_Float_VALUE, null);
                }
                break;
            case 10:
                v0.m13319g((v0) obj, this.f158b, 0, 0);
                break;
            case 11:
                v0.m13319g((v0) obj, this.f158b, 0, 0);
                break;
            case 12:
                ((v0) obj).m13324d(this.f158b, 0, 0, DefinitionKt.NO_Float_VALUE);
                break;
            case 13:
                ((v0) obj).m13324d(this.f158b, 0, 0, DefinitionKt.NO_Float_VALUE);
                break;
            case 14:
                v0.m13320h((v0) obj, this.f158b, 0, 0);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                v0.m13319g((v0) obj, this.f158b, 0, 0);
                break;
            default:
                v0.m13319g((v0) obj, this.f158b, 0, 0);
                break;
        }
        return a0.f30746a;
    }
}

package b2;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import s4.C6752h;
import s4.C6756l;
import s4.InterfaceC6747c;
import w2.C7876o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3728a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6747c f3729b;

    /* renamed from: c */
    public final /* synthetic */ k2.w0 f3730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(InterfaceC6747c interfaceC6747c, k2.w0 w0Var, int i10) {
        super(1);
        this.f3728a = i10;
        this.f3729b = interfaceC6747c;
        this.f3730c = w0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f3728a) {
            case 0:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (((C6752h) obj).f32203a >> 32));
                InterfaceC6747c interfaceC6747c = this.f3729b;
                this.f3730c.setValue(new C6756l((interfaceC6747c.e0(fIntBitsToFloat) << 32) | (interfaceC6747c.e0(Float.intBitsToFloat((int) (r0 & 4294967295L))) & 4294967295L)));
                return qw.a0.f30746a;
            default:
                d1 d1Var = new d1(0, (InterfaceC2137a) obj);
                e1 e1Var = new e1(this.f3729b, this.f3730c, 0);
                if (i1.x0.m7525a()) {
                    return i1.x0.m7525a() ? new MagnifierElement(d1Var, e1Var, Build.VERSION.SDK_INT == 28 ? i1.i1.f16885b : i1.i1.f16886c) : C7876o.f37669a;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}

package g2;

import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import f3.InterfaceC2198d;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h9 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ long f11739a;

    /* renamed from: b */
    public final /* synthetic */ int f11740b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(int i10, long j6) {
        super(1);
        this.f11739a = j6;
        this.f11740b = i10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC2198d interfaceC2198d = (InterfaceC2198d) obj;
        float fMin = Math.min(interfaceC2198d.mo8435T(c9.f11315d), C0850e.m2291b(interfaceC2198d.mo5913e()));
        float fM2291b = (C0850e.m2291b(interfaceC2198d.mo5913e()) - fMin) / 2;
        long j6 = this.f11739a;
        if (this.f11740b == 1) {
            float f6 = fMin / 2.0f;
            InterfaceC2198d.m5910q(interfaceC2198d, j6, f6, og.a2.m10524a((C0850e.m2293d(interfaceC2198d.mo5913e()) - f6) - fM2291b, C0850e.m2291b(interfaceC2198d.mo5913e()) / 2.0f), null, 0, 120);
        } else {
            InterfaceC2198d.o0(interfaceC2198d, j6, og.a2.m10524a((C0850e.m2293d(interfaceC2198d.mo5913e()) - fMin) - fM2291b, (C0850e.m2291b(interfaceC2198d.mo5913e()) - fMin) / 2.0f), og.d2.m10598a(fMin, fMin), DefinitionKt.NO_Float_VALUE, null, 120);
        }
        return qw.a0.f30746a;
    }
}

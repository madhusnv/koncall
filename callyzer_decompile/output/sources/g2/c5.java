package g2;

import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import f3.InterfaceC2198d;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c5 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11300a;

    /* renamed from: b */
    public final /* synthetic */ float f11301b;

    /* renamed from: c */
    public final /* synthetic */ long f11302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5(float f6, int i10, long j6) {
        super(1);
        this.f11300a = i10;
        this.f11301b = f6;
        this.f11302c = j6;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f11300a) {
            case 0:
                InterfaceC2198d interfaceC2198d = (InterfaceC2198d) obj;
                float f6 = this.f11301b;
                float f10 = 2;
                interfaceC2198d.r0(this.f11302c, og.a2.m10524a(DefinitionKt.NO_Float_VALUE, interfaceC2198d.mo8435T(f6) / f10), og.a2.m10524a(C0850e.m2293d(interfaceC2198d.mo5913e()), interfaceC2198d.mo8435T(f6) / f10), interfaceC2198d.mo8435T(f6), (496 & 16) != 0 ? 0 : 0, 3);
                break;
            default:
                InterfaceC2198d interfaceC2198d2 = (InterfaceC2198d) obj;
                float f11 = this.f11301b;
                float f12 = 2;
                interfaceC2198d2.r0(this.f11302c, og.a2.m10524a(interfaceC2198d2.mo8435T(f11) / f12, DefinitionKt.NO_Float_VALUE), og.a2.m10524a(interfaceC2198d2.mo8435T(f11) / f12, C0850e.m2291b(interfaceC2198d2.mo5913e())), interfaceC2198d2.mo8435T(f11), (496 & 16) != 0 ? 0 : 0, 3);
                break;
        }
        return qw.a0.f30746a;
    }
}

package fp;

import ar.C0414d;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import qw.InterfaceC6355e;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fp.d */
/* loaded from: classes3.dex */
public final class C2364d implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10759a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6355e f10760b;

    public /* synthetic */ C2364d(InterfaceC6355e interfaceC6355e, int i10) {
        this.f10759a = i10;
        this.f10760b = interfaceC6355e;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10759a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                String number = (String) obj2;
                AbstractC4154l.m8923f(number, "number");
                ((InterfaceC2141e) this.f10760b).invoke(Integer.valueOf(iIntValue), number);
                break;
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                String name = (String) obj2;
                AbstractC4154l.m8923f(name, "name");
                ((InterfaceC2141e) this.f10760b).invoke(Integer.valueOf(iIntValue2), name);
                break;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                String number2 = (String) obj2;
                AbstractC4154l.m8923f(number2, "number");
                ((InterfaceC2139c) this.f10760b).invoke(new C0414d(iIntValue3, number2));
                break;
        }
        return a0.f30746a;
    }
}

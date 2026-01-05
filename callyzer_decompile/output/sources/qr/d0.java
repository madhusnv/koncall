package qr;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import k2.C3953b;
import k2.InterfaceC3962k;
import ur.C7531x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f30522a;

    /* renamed from: b */
    public final /* synthetic */ C7531x f30523b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f30524c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f30525d;

    public /* synthetic */ d0(C7531x c7531x, ArrayList arrayList, InterfaceC2139c interfaceC2139c, int i10, int i11) {
        this.f30522a = i11;
        this.f30523b = c7531x;
        this.f30524c = arrayList;
        this.f30525d = interfaceC2139c;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f30522a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC6287k.m12299p(this.f30523b, this.f30524c, this.f30525d, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC6287k.m12298o(this.f30523b, this.f30524c, this.f30525d, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }
}

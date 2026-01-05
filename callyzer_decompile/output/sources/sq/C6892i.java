package sq;

import android.net.Uri;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sq.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6892i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f32942a;

    /* renamed from: b */
    public final /* synthetic */ Uri f32943b;

    public /* synthetic */ C6892i(Uri uri, int i10, int i11) {
        this.f32942a = i11;
        this.f32943b = uri;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f32942a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                g2.e0(this.f32943b, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                g2.m13142T(this.f32943b, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }
}

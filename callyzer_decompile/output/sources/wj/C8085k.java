package wj;

import com.google.firebase.messaging.FirebaseMessaging;
import of.C5346a;
import pg.v6;
import uf.C7427b;
import yg.InterfaceC8648e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C8085k implements InterfaceC8648e {

    /* renamed from: a */
    public final /* synthetic */ int f38711a;

    /* renamed from: b */
    public final /* synthetic */ FirebaseMessaging f38712b;

    public /* synthetic */ C8085k(FirebaseMessaging firebaseMessaging, int i10) {
        this.f38711a = i10;
        this.f38712b = firebaseMessaging;
    }

    @Override // yg.InterfaceC8648e
    /* renamed from: g */
    public final void mo27g(Object obj) throws NumberFormatException {
        boolean z6;
        switch (this.f38711a) {
            case 0:
                C8095u c8095u = (C8095u) obj;
                if (!this.f38712b.f7165e.m417h() || c8095u.f38752h.m15271a() == null) {
                    return;
                }
                synchronized (c8095u) {
                    z6 = c8095u.f38751g;
                }
                if (z6) {
                    return;
                }
                c8095u.m15277f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f38712b;
                C5346a c5346a = (C5346a) obj;
                C7427b c7427b = FirebaseMessaging.f7158k;
                firebaseMessaging.getClass();
                if (c5346a != null) {
                    v6.m11894b(c5346a.f26261a);
                    firebaseMessaging.m4482e();
                    return;
                }
                return;
        }
    }
}

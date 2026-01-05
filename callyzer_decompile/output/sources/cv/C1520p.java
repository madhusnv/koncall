package cv;

import com.websoptimization.callyzerbiz.data.model.response.LeadRecentNoteResponse;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1520p implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f7661a;

    /* renamed from: b */
    public final /* synthetic */ LeadRecentNoteResponse f7662b;

    public /* synthetic */ C1520p(LeadRecentNoteResponse leadRecentNoteResponse, int i10, int i11) {
        this.f7661a = i11;
        this.f7662b = leadRecentNoteResponse;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f7661a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC1505a.m5073m(this.f7662b, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC1505a.m5074n(this.f7662b, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}

package nf;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import ig.AbstractC3253i;
import kf.AbstractC4074a;
import qf.AbstractC6209h;
import qf.InterfaceC6204c;
import qf.InterfaceC6211j;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nf.g */
/* loaded from: classes.dex */
public final class C5045g extends BasePendingResult {

    /* renamed from: l */
    public final /* synthetic */ int f24819l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5045g(AbstractC6209h abstractC6209h, int i10) {
        super(abstractC6209h);
        this.f24819l = i10;
        AbstractC6840z.m13037h(abstractC6209h, "GoogleApiClient must not be null");
        AbstractC6840z.m13037h(AbstractC4074a.f20942a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC6211j mo3094b(Status status) {
        int i10 = this.f24819l;
        return status;
    }

    /* renamed from: f */
    public final void m9966f(InterfaceC6204c interfaceC6204c) {
        switch (this.f24819l) {
            case 0:
                C5043e c5043e = (C5043e) interfaceC6204c;
                C5049k c5049k = (C5049k) c5043e.m13009t();
                BinderC5044f binderC5044f = new BinderC5044f(this, 0);
                GoogleSignInOptions googleSignInOptions = c5043e.f24816D;
                Parcel parcelM3755f = c5049k.m3755f();
                int i10 = AbstractC3253i.f17432a;
                parcelM3755f.writeStrongBinder(binderC5044f);
                AbstractC3253i.m7600c(parcelM3755f, googleSignInOptions);
                c5049k.m3756g(parcelM3755f, 102);
                break;
            default:
                C5043e c5043e2 = (C5043e) interfaceC6204c;
                C5049k c5049k2 = (C5049k) c5043e2.m13009t();
                BinderC5044f binderC5044f2 = new BinderC5044f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = c5043e2.f24816D;
                Parcel parcelM3755f2 = c5049k2.m3755f();
                int i11 = AbstractC3253i.f17432a;
                parcelM3755f2.writeStrongBinder(binderC5044f2);
                AbstractC3253i.m7600c(parcelM3755f2, googleSignInOptions2);
                c5049k2.m3756g(parcelM3755f2, 103);
                break;
        }
    }

    /* renamed from: g */
    public final void m9967g(Status status) {
        AbstractC6840z.m13030a("Failed result must not be success", !status.m3092b());
        m3097e(mo3094b(status));
    }
}

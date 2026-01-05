package nf;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import ig.AbstractBinderC3252h;
import ig.AbstractC3253i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nf.f */
/* loaded from: classes.dex */
public final class BinderC5044f extends AbstractBinderC3252h implements InterfaceC5048j {

    /* renamed from: f */
    public final /* synthetic */ int f24817f;

    /* renamed from: g */
    public final /* synthetic */ C5045g f24818g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC5044f(C5045g c5045g, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 0);
        this.f24817f = i10;
        this.f24818g = c5045g;
    }

    @Override // nf.InterfaceC5048j
    /* renamed from: A */
    public void mo9964A(Status status) {
        switch (this.f24817f) {
            case 0:
                this.f24818g.m3097e(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // ig.AbstractBinderC3252h
    /* renamed from: P */
    public final boolean mo7583P(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                AbstractC3253i.m7599b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) AbstractC3253i.m7598a(parcel, Status.CREATOR);
                AbstractC3253i.m7599b(parcel);
                mo9964A(status);
                break;
            case 103:
                Status status2 = (Status) AbstractC3253i.m7598a(parcel, Status.CREATOR);
                AbstractC3253i.m7599b(parcel);
                mo9965y(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // nf.InterfaceC5048j
    /* renamed from: y */
    public void mo9965y(Status status) {
        switch (this.f24817f) {
            case 1:
                this.f24818g.m3097e(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

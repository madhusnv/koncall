package ig;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import jg.AbstractC3762a;
import og.de;
import rf.InterfaceC6501f;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ig.d */
/* loaded from: classes.dex */
public final class BinderC3248d extends AbstractBinderC3252h implements InterfaceC6501f {

    /* renamed from: f */
    public final /* synthetic */ C8650g f17424f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3248d(C8650g c8650g) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 1);
        this.f17424f = c8650g;
    }

    @Override // ig.AbstractBinderC3252h
    /* renamed from: O */
    public final boolean mo7586O(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) AbstractC3762a.m8285a(parcel, Status.CREATOR);
        AbstractC3762a.m8286b(parcel);
        mo7587s(status);
        return true;
    }

    @Override // rf.InterfaceC6501f
    /* renamed from: s */
    public final void mo7587s(Status status) {
        de.m10609a(status, null, this.f17424f);
    }
}

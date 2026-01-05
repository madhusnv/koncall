package xf;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import ig.AbstractBinderC3252h;
import jg.AbstractC3762a;
import og.de;
import wf.C8025a;
import wf.C8027c;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xf.f */
/* loaded from: classes.dex */
public final class BinderC8371f extends AbstractBinderC3252h implements InterfaceC8369d {

    /* renamed from: f */
    public final /* synthetic */ int f40029f;

    /* renamed from: g */
    public final /* synthetic */ C8650g f40030g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC8371f(C8650g c8650g, int i10) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 1);
        this.f40029f = i10;
        this.f40030g = c8650g;
    }

    @Override // ig.AbstractBinderC3252h
    /* renamed from: O */
    public final boolean mo7586O(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            Status status = (Status) AbstractC3762a.m8285a(parcel, Status.CREATOR);
            C8025a c8025a = (C8025a) AbstractC3762a.m8285a(parcel, C8025a.CREATOR);
            AbstractC3762a.m8286b(parcel);
            mo15540u(status, c8025a);
            return true;
        }
        if (i10 == 2) {
            Status status2 = (Status) AbstractC3762a.m8285a(parcel, Status.CREATOR);
            C8027c c8027c = (C8027c) AbstractC3762a.m8285a(parcel, C8027c.CREATOR);
            AbstractC3762a.m8286b(parcel);
            mo15541z(status2, c8027c);
            return true;
        }
        if (i10 == 3) {
            AbstractC3762a.m8286b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i10 != 4) {
            return false;
        }
        AbstractC3762a.m8286b(parcel);
        throw new UnsupportedOperationException();
    }

    @Override // xf.InterfaceC8369d
    /* renamed from: u */
    public void mo15540u(Status status, C8025a c8025a) {
        switch (this.f40029f) {
            case 0:
                de.m10610b(status, c8025a, this.f40030g);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // xf.InterfaceC8369d
    /* renamed from: z */
    public void mo15541z(Status status, C8027c c8027c) {
        switch (this.f40029f) {
            case 1:
                de.m10610b(status, c8027c, this.f40030g);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

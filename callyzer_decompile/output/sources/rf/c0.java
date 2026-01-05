package rf;

import android.os.RemoteException;
import c9.C0910e;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a */
    public final int f31216a;

    public c0(int i10) {
        this.f31216a = i10;
    }

    /* renamed from: e */
    public static Status m12512e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    /* renamed from: a */
    public abstract void mo12502a(Status status);

    /* renamed from: b */
    public abstract void mo12503b(Exception exc);

    /* renamed from: c */
    public abstract void mo12504c(C6511p c6511p);

    /* renamed from: d */
    public abstract void mo12505d(C0910e c0910e, boolean z6);
}

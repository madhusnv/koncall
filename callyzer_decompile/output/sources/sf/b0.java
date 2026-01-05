package sf;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import ig.AbstractBinderC3252h;
import lg.AbstractC4464a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends AbstractBinderC3252h {

    /* renamed from: f */
    public AbstractC6819e f32373f;

    /* renamed from: g */
    public final int f32374g;

    public b0(AbstractC6819e abstractC6819e, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 2);
        this.f32373f = abstractC6819e;
        this.f32374g = i10;
    }

    @Override // ig.AbstractBinderC3252h
    /* renamed from: Q */
    public final boolean mo7597Q(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC4464a.m9309a(parcel, Bundle.CREATOR);
            AbstractC4464a.m9310b(parcel);
            AbstractC6840z.m13037h(this.f32373f, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC6819e abstractC6819e = this.f32373f;
            int i12 = this.f32374g;
            abstractC6819e.getClass();
            d0 d0Var = new d0(abstractC6819e, i11, strongBinder, bundle);
            a0 a0Var = abstractC6819e.f32385f;
            a0Var.sendMessage(a0Var.obtainMessage(1, i12, -1, d0Var));
            this.f32373f = null;
        } else if (i10 == 2) {
            parcel.readInt();
            AbstractC4464a.m9310b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i13 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            f0 f0Var = (f0) AbstractC4464a.m9309a(parcel, f0.CREATOR);
            AbstractC4464a.m9310b(parcel);
            AbstractC6819e abstractC6819e2 = this.f32373f;
            AbstractC6840z.m13037h(abstractC6819e2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC6840z.m13036g(f0Var);
            abstractC6819e2.f32401y = f0Var;
            if (abstractC6819e2.mo7595x()) {
                C6820f c6820f = f0Var.f32413d;
                C6826l c6826lM13020b = C6826l.m13020b();
                C6827m c6827m = c6820f == null ? null : c6820f.f32404a;
                synchronized (c6826lM13020b) {
                    if (c6827m == null) {
                        c6827m = C6826l.f32466c;
                    } else {
                        C6827m c6827m2 = (C6827m) c6826lM13020b.f32467a;
                        if (c6827m2 == null || c6827m2.f32469a < c6827m.f32469a) {
                        }
                    }
                    c6826lM13020b.f32467a = c6827m;
                }
            }
            Bundle bundle2 = f0Var.f32410a;
            AbstractC6840z.m13037h(this.f32373f, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC6819e abstractC6819e3 = this.f32373f;
            int i14 = this.f32374g;
            abstractC6819e3.getClass();
            d0 d0Var2 = new d0(abstractC6819e3, i13, strongBinder2, bundle2);
            a0 a0Var2 = abstractC6819e3.f32385f;
            a0Var2.sendMessage(a0Var2.obtainMessage(1, i14, -1, d0Var2));
            this.f32373f = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

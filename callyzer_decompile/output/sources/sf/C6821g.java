package sf;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import lg.AbstractC4464a;
import pf.C5904d;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.g */
/* loaded from: classes.dex */
public final class C6821g extends AbstractC7149a {
    public static final Parcelable.Creator<C6821g> CREATOR = new g0(1);

    /* renamed from: q */
    public static final Scope[] f32414q = new Scope[0];

    /* renamed from: r */
    public static final C5904d[] f32415r = new C5904d[0];

    /* renamed from: a */
    public final int f32416a;

    /* renamed from: b */
    public final int f32417b;

    /* renamed from: c */
    public final int f32418c;

    /* renamed from: d */
    public String f32419d;

    /* renamed from: e */
    public IBinder f32420e;

    /* renamed from: f */
    public Scope[] f32421f;

    /* renamed from: g */
    public Bundle f32422g;

    /* renamed from: h */
    public Account f32423h;

    /* renamed from: j */
    public C5904d[] f32424j;

    /* renamed from: k */
    public C5904d[] f32425k;

    /* renamed from: l */
    public final boolean f32426l;

    /* renamed from: m */
    public final int f32427m;

    /* renamed from: n */
    public boolean f32428n;

    /* renamed from: p */
    public final String f32429p;

    public C6821g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C5904d[] c5904dArr, C5904d[] c5904dArr2, boolean z6, int i13, boolean z10, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f32414q : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        C5904d[] c5904dArr3 = f32415r;
        C5904d[] c5904dArr4 = c5904dArr == null ? c5904dArr3 : c5904dArr;
        c5904dArr3 = c5904dArr2 != null ? c5904dArr2 : c5904dArr3;
        this.f32416a = i10;
        this.f32417b = i11;
        this.f32418c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f32419d = "com.google.android.gms";
        } else {
            this.f32419d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = AbstractBinderC6815a.f32371f;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface m0Var = iInterfaceQueryLocalInterface instanceof InterfaceC6823i ? (InterfaceC6823i) iInterfaceQueryLocalInterface : new m0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    m0 m0Var2 = (m0) m0Var;
                    Parcel parcelM3748O = m0Var2.m3748O(m0Var2.m3750Q(), 2);
                    Account account3 = (Account) AbstractC4464a.m9309a(parcelM3748O, Account.CREATOR);
                    parcelM3748O.recycle();
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    account2 = account3;
                } catch (RemoteException unused) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th2;
                }
            }
            this.f32423h = account2;
        } else {
            this.f32420e = iBinder;
            this.f32423h = account;
        }
        this.f32421f = scopeArr2;
        this.f32422g = bundle2;
        this.f32424j = c5904dArr4;
        this.f32425k = c5904dArr3;
        this.f32426l = z6;
        this.f32427m = i13;
        this.f32428n = z10;
        this.f32429p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        g0.m13011a(this, parcel, i10);
    }
}

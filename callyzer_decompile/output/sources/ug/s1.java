package ug;

import al.RunnableC0188p;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractBinderC1309y;
import com.google.android.gms.internal.measurement.AbstractC1310z;
import dj.RunnableC1730c;
import il.CallableC3297e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.CallableC3892b;
import l0.RunnableC4307g;
import og.wg;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import pf.AbstractC5907g;
import pf.C5908h;
import sf.AbstractC6840z;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s1 extends AbstractBinderC1309y implements i0 {

    /* renamed from: e */
    public final h4 f35819e;

    /* renamed from: f */
    public Boolean f35820f;

    /* renamed from: g */
    public String f35821g;

    public s1(h4 h4Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        AbstractC6840z.m13036g(h4Var);
        this.f35819e = h4Var;
        this.f35821g = null;
    }

    @Override // ug.i0
    /* renamed from: B */
    public final List mo13893B(String str, String str2, boolean z6, n4 n4Var) {
        m14138g(n4Var);
        String str3 = n4Var.f35697a;
        AbstractC6840z.m13036g(str3);
        h4 h4Var = this.f35819e;
        try {
            List<k4> list = (List) h4Var.mo327b().m14045T(new q1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (k4 k4Var : list) {
                if (z6 || !l4.l0(k4Var.f35579c)) {
                    arrayList.add(new j4(k4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            h4Var.mo326a().f35862f.m14142c("Failed to query user properties. appId", v0.m14157U(str3), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e10) {
            e = e10;
            h4Var.mo326a().f35862f.m14142c("Failed to query user properties. appId", v0.m14157U(str3), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ug.i0
    /* renamed from: C */
    public final void mo13894C(n4 n4Var) {
        AbstractC6840z.m13033d(n4Var.f35697a);
        AbstractC6840z.m13036g(n4Var.f35715v);
        m14137f(new p1(this, n4Var, 3));
    }

    @Override // ug.i0
    /* renamed from: D */
    public final void mo13895D(n4 n4Var, Bundle bundle, k0 k0Var) {
        m14138g(n4Var);
        String str = n4Var.f35697a;
        AbstractC6840z.m13036g(str);
        this.f35819e.mo327b().m14047V(new RunnableC0188p(this, n4Var, bundle, k0Var, str, 1));
    }

    @Override // ug.i0
    /* renamed from: F */
    public final void mo13896F(j4 j4Var, n4 n4Var) {
        AbstractC6840z.m13036g(j4Var);
        m14138g(n4Var);
        m14136P(new RunnableC1730c(6, this, j4Var, n4Var));
    }

    @Override // ug.i0
    /* renamed from: G */
    public final void mo13897G(n4 n4Var) {
        m14138g(n4Var);
        m14136P(new p1(this, n4Var, 1));
    }

    @Override // ug.i0
    /* renamed from: H */
    public final void mo13898H(n4 n4Var) {
        AbstractC6840z.m13033d(n4Var.f35697a);
        AbstractC6840z.m13036g(n4Var.f35715v);
        m14137f(new o1(this, n4Var, 2));
    }

    @Override // ug.i0
    /* renamed from: I */
    public final C7438i mo13899I(n4 n4Var) {
        m14138g(n4Var);
        String str = n4Var.f35697a;
        AbstractC6840z.m13033d(str);
        h4 h4Var = this.f35819e;
        try {
            return (C7438i) h4Var.mo327b().m14046U(new CallableC3297e(this, n4Var, 2)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            h4Var.mo326a().f35862f.m14142c("Failed to get consent. appId", v0.m14157U(str), e2);
            return new C7438i(null);
        }
    }

    @Override // ug.i0
    /* renamed from: J */
    public final byte[] mo13900J(String str, C7449t c7449t) {
        AbstractC6840z.m13033d(str);
        AbstractC6840z.m13036g(c7449t);
        m14135O(str, true);
        h4 h4Var = this.f35819e;
        t0 t0Var = h4Var.mo326a().f35869n;
        n1 n1Var = h4Var.f35497m;
        q0 q0Var = n1Var.f35673k;
        String str2 = c7449t.f35827a;
        t0Var.m14141b(q0Var.m14113a(str2), "Log and bundle. event");
        h4Var.mo334l().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) h4Var.mo327b().m14046U(new CallableC3892b(this, c7449t, str)).get();
            if (bArr == null) {
                h4Var.mo326a().f35862f.m14141b(v0.m14157U(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            h4Var.mo334l().getClass();
            h4Var.mo326a().f35869n.m14143d("Log and bundle processed. event, size, time_ms", n1Var.f35673k.m14113a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e2) {
            e = e2;
            h4Var.mo326a().f35862f.m14143d("Failed to log and bundle. appId, event, error", v0.m14157U(str), n1Var.f35673k.m14113a(str2), e);
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            h4Var.mo326a().f35862f.m14143d("Failed to log and bundle. appId, event, error", v0.m14157U(str), n1Var.f35673k.m14113a(str2), e);
            return null;
        }
    }

    @Override // ug.i0
    /* renamed from: N */
    public final void mo13901N(n4 n4Var) {
        m14138g(n4Var);
        m14136P(new o1(this, n4Var, 0));
    }

    /* renamed from: O */
    public final void m14135O(String str, boolean z6) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        h4 h4Var = this.f35819e;
        if (zIsEmpty) {
            h4Var.mo326a().f35862f.m14140a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z6) {
            try {
                if (this.f35820f == null) {
                    boolean z10 = true;
                    if (!"com.google.android.gms".equals(this.f35821g) && !AbstractC8947b.m16429f(h4Var.f35497m.f35664a, Binder.getCallingUid()) && !C5908h.m11519a(h4Var.f35497m.f35664a).m11522b(Binder.getCallingUid())) {
                        z10 = false;
                    }
                    this.f35820f = Boolean.valueOf(z10);
                }
                if (this.f35820f.booleanValue()) {
                    return;
                }
            } catch (SecurityException e2) {
                h4Var.mo326a().f35862f.m14141b(v0.m14157U(str), "Measurement Service called with invalid calling package. appId");
                throw e2;
            }
        }
        if (this.f35821g == null) {
            Context context = h4Var.f35497m.f35664a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = AbstractC5907g.f28749a;
            if (AbstractC8947b.m16431h(callingUid, context, str)) {
                this.f35821g = str;
            }
        }
        if (str.equals(this.f35821g)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    /* renamed from: P */
    public final void m14136P(Runnable runnable) {
        h4 h4Var = this.f35819e;
        if (h4Var.mo327b().m14044S()) {
            runnable.run();
        } else {
            h4Var.mo327b().m14047V(runnable);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1309y
    /* renamed from: d */
    public final boolean mo3185d(int i10, Parcel parcel, Parcel parcel2) {
        List list;
        h4 h4Var = this.f35819e;
        ArrayList arrayList = null;
        k0 j0Var = null;
        m0 l0Var = null;
        int i11 = 1;
        switch (i10) {
            case 1:
                C7449t c7449t = (C7449t) AbstractC1310z.m3795a(parcel, C7449t.CREATOR);
                n4 n4Var = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                mo13904j(c7449t, n4Var);
                parcel2.writeNoException();
                return true;
            case 2:
                j4 j4Var = (j4) AbstractC1310z.m3795a(parcel, j4.CREATOR);
                n4 n4Var2 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                mo13896F(j4Var, n4Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                n4 n4Var3 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                mo13901N(n4Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                C7449t c7449t2 = (C7449t) AbstractC1310z.m3795a(parcel, C7449t.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                AbstractC1310z.m3798d(parcel);
                AbstractC6840z.m13036g(c7449t2);
                AbstractC6840z.m13033d(string);
                m14135O(string, true);
                m14136P(new RunnableC1730c(5, this, c7449t2, string));
                parcel2.writeNoException();
                return true;
            case 6:
                n4 n4Var4 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                mo13897G(n4Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                n4 n4Var5 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                z = parcel.readInt() != 0;
                AbstractC1310z.m3798d(parcel);
                m14138g(n4Var5);
                String str = n4Var5.f35697a;
                AbstractC6840z.m13036g(str);
                try {
                    List<k4> list2 = (List) h4Var.mo327b().m14045T(new CallableC3297e(this, str, i11)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (k4 k4Var : list2) {
                        if (z || !l4.l0(k4Var.f35579c)) {
                            arrayList2.add(new j4(k4Var));
                        }
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e2) {
                    e = e2;
                    h4Var.mo326a().f35862f.m14142c("Failed to get user properties. appId", v0.m14157U(str), e);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e10) {
                    e = e10;
                    h4Var.mo326a().f35862f.m14142c("Failed to get user properties. appId", v0.m14157U(str), e);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C7449t c7449t3 = (C7449t) AbstractC1310z.m3795a(parcel, C7449t.CREATOR);
                String string2 = parcel.readString();
                AbstractC1310z.m3798d(parcel);
                byte[] bArrMo13900J = mo13900J(string2, c7449t3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo13900J);
                return true;
            case 10:
                long j6 = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                AbstractC1310z.m3798d(parcel);
                mo13909p(j6, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                n4 n4Var6 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                String strMo13907n = mo13907n(n4Var6);
                parcel2.writeNoException();
                parcel2.writeString(strMo13907n);
                return true;
            case 12:
                C7434e c7434e = (C7434e) AbstractC1310z.m3795a(parcel, C7434e.CREATOR);
                n4 n4Var7 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                mo13903i(c7434e, n4Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                C7434e c7434e2 = (C7434e) AbstractC1310z.m3795a(parcel, C7434e.CREATOR);
                AbstractC1310z.m3798d(parcel);
                AbstractC6840z.m13036g(c7434e2);
                AbstractC6840z.m13036g(c7434e2.f35359c);
                AbstractC6840z.m13033d(c7434e2.f35357a);
                m14135O(c7434e2.f35357a, true);
                m14136P(new RunnableC4307g(17, this, new C7434e(c7434e2), z));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = AbstractC1310z.f6461a;
                boolean z6 = parcel.readInt() != 0;
                n4 n4Var8 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                List listMo13893B = mo13893B(string6, string7, z6, n4Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo13893B);
                return true;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = AbstractC1310z.f6461a;
                boolean z10 = parcel.readInt() != 0;
                AbstractC1310z.m3798d(parcel);
                List listMo13902h = mo13902h(string8, string9, string10, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo13902h);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                n4 n4Var9 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                List listMo13908o = mo13908o(string11, string12, n4Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo13908o);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                AbstractC1310z.m3798d(parcel);
                List listMo13911t = mo13911t(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo13911t);
                return true;
            case 18:
                n4 n4Var10 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                mo13914x(n4Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                n4 n4Var11 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                mo13910r(bundle, n4Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                n4 n4Var12 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                mo13906l(n4Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                n4 n4Var13 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                C7438i c7438iMo13899I = mo13899I(n4Var13);
                parcel2.writeNoException();
                if (c7438iMo13899I == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                c7438iMo13899I.writeToParcel(parcel2, 1);
                return true;
            case 24:
                n4 n4Var14 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                AbstractC1310z.m3798d(parcel);
                m14138g(n4Var14);
                String str2 = n4Var14.f35697a;
                AbstractC6840z.m13036g(str2);
                if (h4Var.e0().m13889W(null, f0.Y0)) {
                    try {
                        list = (List) h4Var.mo327b().m14046U(new r1(this, n4Var14, bundle2, z ? 1 : 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e11) {
                        h4Var.mo326a().f35862f.m14142c("Failed to get trigger URIs. appId", v0.m14157U(str2), e11);
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) h4Var.mo327b().m14045T(new r1(this, n4Var14, bundle2, i11)).get();
                    } catch (InterruptedException | ExecutionException e12) {
                        h4Var.mo326a().f35862f.m14142c("Failed to get trigger URIs. appId", v0.m14157U(str2), e12);
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                n4 n4Var15 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                mo13894C(n4Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                n4 n4Var16 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                mo13898H(n4Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                n4 n4Var17 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                AbstractC1310z.m3798d(parcel);
                mo13913w(n4Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                n4 n4Var18 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                a4 a4Var = (a4) AbstractC1310z.m3795a(parcel, a4.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    l0Var = iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new l0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 0);
                }
                AbstractC1310z.m3798d(parcel);
                mo13905k(n4Var18, a4Var, l0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                n4 n4Var19 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                C7433d c7433d = (C7433d) AbstractC1310z.m3795a(parcel, C7433d.CREATOR);
                AbstractC1310z.m3798d(parcel);
                mo13912v(n4Var19, c7433d);
                parcel2.writeNoException();
                return true;
            case BERTags.DATE /* 31 */:
                n4 n4Var20 = (n4) AbstractC1310z.m3795a(parcel, n4.CREATOR);
                Bundle bundle3 = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    j0Var = iInterfaceQueryLocalInterface2 instanceof k0 ? (k0) iInterfaceQueryLocalInterface2 : new j0(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 0);
                }
                AbstractC1310z.m3798d(parcel);
                mo13895D(n4Var20, bundle3, j0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    /* renamed from: f */
    public final void m14137f(Runnable runnable) {
        h4 h4Var = this.f35819e;
        if (h4Var.mo327b().m14044S()) {
            runnable.run();
        } else {
            h4Var.mo327b().m14049X(runnable);
        }
    }

    /* renamed from: g */
    public final void m14138g(n4 n4Var) {
        AbstractC6840z.m13036g(n4Var);
        String str = n4Var.f35697a;
        AbstractC6840z.m13033d(str);
        m14135O(str, false);
        this.f35819e.k0().m14029Q(n4Var.f35698b);
    }

    @Override // ug.i0
    /* renamed from: h */
    public final List mo13902h(String str, String str2, String str3, boolean z6) {
        m14135O(str, true);
        h4 h4Var = this.f35819e;
        try {
            List<k4> list = (List) h4Var.mo327b().m14045T(new q1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (k4 k4Var : list) {
                if (z6 || !l4.l0(k4Var.f35579c)) {
                    arrayList.add(new j4(k4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            h4Var.mo326a().f35862f.m14142c("Failed to get user properties as. appId", v0.m14157U(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e10) {
            e = e10;
            h4Var.mo326a().f35862f.m14142c("Failed to get user properties as. appId", v0.m14157U(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ug.i0
    /* renamed from: i */
    public final void mo13903i(C7434e c7434e, n4 n4Var) {
        AbstractC6840z.m13036g(c7434e);
        AbstractC6840z.m13036g(c7434e.f35359c);
        m14138g(n4Var);
        C7434e c7434e2 = new C7434e(c7434e);
        c7434e2.f35357a = n4Var.f35697a;
        m14136P(new RunnableC1730c(3, this, c7434e2, n4Var));
    }

    @Override // ug.i0
    /* renamed from: j */
    public final void mo13904j(C7449t c7449t, n4 n4Var) {
        AbstractC6840z.m13036g(c7449t);
        m14138g(n4Var);
        m14136P(new RunnableC1730c(4, this, c7449t, n4Var));
    }

    @Override // ug.i0
    /* renamed from: k */
    public final void mo13905k(n4 n4Var, a4 a4Var, m0 m0Var) {
        m14138g(n4Var);
        String str = n4Var.f35697a;
        AbstractC6840z.m13036g(str);
        this.f35819e.mo327b().m14047V(new c6.b1(this, str, a4Var, m0Var, 4));
    }

    @Override // ug.i0
    /* renamed from: l */
    public final void mo13906l(n4 n4Var) {
        AbstractC6840z.m13033d(n4Var.f35697a);
        AbstractC6840z.m13036g(n4Var.f35715v);
        m14137f(new p1(this, n4Var, 2));
    }

    @Override // ug.i0
    /* renamed from: n */
    public final String mo13907n(n4 n4Var) {
        m14138g(n4Var);
        h4 h4Var = this.f35819e;
        try {
            return (String) h4Var.mo327b().m14045T(new CallableC3297e(h4Var, n4Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            h4Var.mo326a().f35862f.m14142c("Failed to get app instance id. appId", v0.m14157U(n4Var.f35697a), e2);
            return null;
        }
    }

    @Override // ug.i0
    /* renamed from: o */
    public final List mo13908o(String str, String str2, n4 n4Var) {
        m14138g(n4Var);
        String str3 = n4Var.f35697a;
        AbstractC6840z.m13036g(str3);
        h4 h4Var = this.f35819e;
        try {
            return (List) h4Var.mo327b().m14045T(new q1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            h4Var.mo326a().f35862f.m14141b(e2, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ug.i0
    /* renamed from: p */
    public final void mo13909p(long j6, String str, String str2, String str3) {
        m14136P(new wg(this, str2, str3, str, j6, 1));
    }

    @Override // ug.i0
    /* renamed from: r */
    public final void mo13910r(Bundle bundle, n4 n4Var) {
        m14138g(n4Var);
        String str = n4Var.f35697a;
        AbstractC6840z.m13036g(str);
        m14136P(new c6.b1(this, bundle, str, n4Var, 6));
    }

    @Override // ug.i0
    /* renamed from: t */
    public final List mo13911t(String str, String str2, String str3) {
        m14135O(str, true);
        h4 h4Var = this.f35819e;
        try {
            return (List) h4Var.mo327b().m14045T(new q1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            h4Var.mo326a().f35862f.m14141b(e2, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ug.i0
    /* renamed from: v */
    public final void mo13912v(n4 n4Var, C7433d c7433d) {
        m14138g(n4Var);
        m14136P(new RunnableC1730c(7, this, n4Var, c7433d, false));
    }

    @Override // ug.i0
    /* renamed from: w */
    public final void mo13913w(n4 n4Var) {
        m14138g(n4Var);
        m14136P(new p1(this, n4Var, 0));
    }

    @Override // ug.i0
    /* renamed from: x */
    public final void mo13914x(n4 n4Var) {
        String str = n4Var.f35697a;
        AbstractC6840z.m13033d(str);
        m14135O(str, false);
        m14136P(new o1(this, n4Var, 1));
    }
}

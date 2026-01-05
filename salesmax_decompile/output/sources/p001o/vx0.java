package p001o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.C10773c;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class vx0 {

    /* renamed from: f */
    public static final C17687a f50974f = new C17687a(null);

    /* renamed from: g */
    public static final String f50975g = vx0.class.getCanonicalName();

    /* renamed from: h */
    public static vx0 f50976h;

    /* renamed from: a */
    public String f50977a;

    /* renamed from: b */
    public long f50978b;

    /* renamed from: c */
    public String f50979c;

    /* renamed from: d */
    public String f50980d;

    /* renamed from: e */
    public boolean f50981e;

    /* renamed from: o.vx0$a */
    public static final class C17687a {
        public C17687a() {
        }

        public /* synthetic */ C17687a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final vx0 m53526a(vx0 vx0Var) {
            vx0Var.f50978b = System.currentTimeMillis();
            vx0.f50976h = vx0Var;
            return vx0Var;
        }

        /* renamed from: b */
        public final vx0 m53527b(Context context) {
            vx0 vx0VarM53528c = m53528c(context);
            if (vx0VarM53528c != null) {
                return vx0VarM53528c;
            }
            vx0 vx0VarM53529d = m53529d(context);
            return vx0VarM53529d == null ? new vx0() : vx0VarM53529d;
        }

        /* renamed from: c */
        public final vx0 m53528c(Context context) {
            Object objM21652U;
            try {
                if (!m53532g(context)) {
                    return null;
                }
                Method methodM21649M = cri.m21649M("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (methodM21649M == null || (objM21652U = cri.m21652U(null, methodM21649M, context)) == null) {
                    return null;
                }
                Method methodM21648L = cri.m21648L(objM21652U.getClass(), "getId", new Class[0]);
                Method methodM21648L2 = cri.m21648L(objM21652U.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (methodM21648L != null && methodM21648L2 != null) {
                    vx0 vx0Var = new vx0();
                    vx0Var.f50977a = (String) cri.m21652U(objM21652U, methodM21648L, new Object[0]);
                    Boolean bool = (Boolean) cri.m21652U(objM21652U, methodM21648L2, new Object[0]);
                    vx0Var.f50981e = bool != null ? bool.booleanValue() : false;
                    return vx0Var;
                }
                return null;
            } catch (Exception e) {
                cri.j0("android_id", e);
                return null;
            }
        }

        /* renamed from: d */
        public final vx0 m53529d(Context context) {
            if (!m53532g(context)) {
                return null;
            }
            ServiceConnectionC17689c serviceConnectionC17689c = new ServiceConnectionC17689c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, serviceConnectionC17689c, 1)) {
                        C17688b c17688b = new C17688b(serviceConnectionC17689c.m53534a());
                        vx0 vx0Var = new vx0();
                        vx0Var.f50977a = c17688b.L0();
                        vx0Var.f50981e = c17688b.M0();
                        return vx0Var;
                    }
                } catch (Exception e) {
                    cri.j0("android_id", e);
                } finally {
                    context.unbindService(serviceConnectionC17689c);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[Catch: all -> 0x00f7, Exception -> 0x00f9, TryCatch #4 {Exception -> 0x00f9, all -> 0x00f7, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x0055, B:14:0x0062, B:21:0x0081, B:23:0x0087, B:25:0x008c, B:27:0x0091, B:17:0x006c, B:19:0x0079, B:48:0x00ef, B:49:0x00f6), top: B:66:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[Catch: all -> 0x00f7, Exception -> 0x00f9, TryCatch #4 {Exception -> 0x00f9, all -> 0x00f7, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x0055, B:14:0x0062, B:21:0x0081, B:23:0x0087, B:25:0x008c, B:27:0x0091, B:17:0x006c, B:19:0x0079, B:48:0x00ef, B:49:0x00f6), top: B:66:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[Catch: all -> 0x00f7, Exception -> 0x00f9, TRY_LEAVE, TryCatch #4 {Exception -> 0x00f9, all -> 0x00f7, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x0055, B:14:0x0062, B:21:0x0081, B:23:0x0087, B:25:0x008c, B:27:0x0091, B:17:0x006c, B:19:0x0079, B:48:0x00ef, B:49:0x00f6), top: B:66:0x0010 }] */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final vx0 m53530e(Context context) throws Throwable {
            Cursor cursor;
            Uri uri;
            Uri uri2;
            String strM53531f;
            sq8.m48649h(context, "context");
            vx0 vx0VarM53527b = m53527b(context);
            Cursor cursor2 = null;
            try {
            } catch (Exception e) {
                e = e;
                cursor = null;
            } catch (Throwable th) {
                th = th;
            }
            if (sq8.m48644c(Looper.myLooper(), Looper.getMainLooper())) {
                throw new ur6("getAttributionIdentifiers cannot be called on the main thread.");
            }
            vx0 vx0Var = vx0.f50976h;
            if (vx0Var != null && System.currentTimeMillis() - vx0Var.f50978b < 3600000) {
                return vx0Var;
            }
            String[] strArr = {"aid", "androidid", "limit_tracking"};
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
            ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
            if (providerInfoResolveContentProvider != null) {
                String str = providerInfoResolveContentProvider.packageName;
                sq8.m48648g(str, "contentProviderInfo.packageName");
                if (!js6.m34454a(context, str)) {
                    if (providerInfoResolveContentProvider2 != null) {
                        String str2 = providerInfoResolveContentProvider2.packageName;
                        sq8.m48648g(str2, "wakizashiProviderInfo.packageName");
                        if (js6.m34454a(context, str2)) {
                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        }
                    }
                    uri = null;
                    strM53531f = m53531f(context);
                    if (strM53531f != null) {
                        vx0VarM53527b.f50980d = strM53531f;
                    }
                    if (uri != null) {
                        return m53526a(vx0VarM53527b);
                    }
                    Cursor cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("aid");
                                int columnIndex2 = cursorQuery.getColumnIndex("androidid");
                                int columnIndex3 = cursorQuery.getColumnIndex("limit_tracking");
                                vx0VarM53527b.f50979c = cursorQuery.getString(columnIndex);
                                if (columnIndex2 > 0 && columnIndex3 > 0 && vx0VarM53527b.m53522h() == null) {
                                    vx0VarM53527b.f50977a = cursorQuery.getString(columnIndex2);
                                    vx0VarM53527b.f50981e = Boolean.parseBoolean(cursorQuery.getString(columnIndex3));
                                }
                                cursorQuery.close();
                                return m53526a(vx0VarM53527b);
                            }
                        } catch (Exception e2) {
                            cursor = cursorQuery;
                            e = e2;
                            try {
                                cri.k0(vx0.f50975g, "Caught unexpected exception in getAttributionId(): " + e);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = cursor;
                            }
                        } catch (Throwable th3) {
                            cursor2 = cursorQuery;
                            th = th3;
                        }
                    }
                    vx0 vx0VarM53526a = m53526a(vx0VarM53527b);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return vx0VarM53526a;
                }
                uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                uri = uri2;
                strM53531f = m53531f(context);
                if (strM53531f != null) {
                }
                if (uri != null) {
                }
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }

        /* renamed from: f */
        public final String m53531f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        /* renamed from: g */
        public final boolean m53532g(Context context) throws ClassNotFoundException {
            Method methodM21649M = cri.m21649M("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodM21649M == null) {
                return false;
            }
            Object objM21652U = cri.m21652U(null, methodM21649M, context);
            return (objM21652U instanceof Integer) && sq8.m48644c(objM21652U, 0);
        }

        /* renamed from: h */
        public final boolean m53533h(Context context) throws Throwable {
            sq8.m48649h(context, "context");
            vx0 vx0VarM53530e = m53530e(context);
            return vx0VarM53530e != null && vx0VarM53530e.m53525k();
        }
    }

    /* renamed from: o.vx0$b */
    public static final class C17688b implements IInterface {

        /* renamed from: f */
        public static final a f50982f = new a(null);

        /* renamed from: a */
        public final IBinder f50983a;

        /* renamed from: o.vx0$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public C17688b(IBinder iBinder) {
            sq8.m48649h(iBinder, "binder");
            this.f50983a = iBinder;
        }

        public final String L0() {
            Parcel parcelObtain = Parcel.obtain();
            sq8.m48648g(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            sq8.m48648g(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f50983a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean M0() {
            Parcel parcelObtain = Parcel.obtain();
            sq8.m48648g(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            sq8.m48648g(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.f50983a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f50983a;
        }
    }

    /* renamed from: o.vx0$c */
    public static final class ServiceConnectionC17689c implements ServiceConnection {

        /* renamed from: a */
        public final AtomicBoolean f50984a = new AtomicBoolean(false);

        /* renamed from: b */
        public final BlockingQueue f50985b = new LinkedBlockingDeque();

        /* renamed from: a */
        public final IBinder m53534a() throws InterruptedException {
            if (!(!this.f50984a.compareAndSet(true, true))) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            Object objTake = this.f50985b.take();
            sq8.m48648g(objTake, "queue.take()");
            return (IBinder) objTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws InterruptedException {
            if (iBinder != null) {
                try {
                    this.f50985b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: h */
    public final String m53522h() {
        if (C10773c.m12993G() && C10773c.m13018k()) {
            return this.f50977a;
        }
        return null;
    }

    /* renamed from: i */
    public final String m53523i() {
        return this.f50980d;
    }

    /* renamed from: j */
    public final String m53524j() {
        return this.f50979c;
    }

    /* renamed from: k */
    public final boolean m53525k() {
        return this.f50981e;
    }
}

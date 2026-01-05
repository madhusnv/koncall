package p001o;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p001o.bc7;

/* loaded from: classes2.dex */
public abstract class tb7 {

    /* renamed from: a */
    public static final Comparator f46769a = new Comparator() { // from class: o.sb7
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tb7.m49685g((byte[]) obj, (byte[]) obj2);
        }
    };

    /* renamed from: o.tb7$a */
    public interface InterfaceC17050a {
        /* renamed from: a */
        static InterfaceC17050a m49687a(Context context, Uri uri) {
            return new C17051b(context, uri);
        }

        /* renamed from: b */
        Cursor mo49688b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* renamed from: o.tb7$b */
    public static class C17051b implements InterfaceC17050a {

        /* renamed from: a */
        public final ContentProviderClient f46770a;

        public C17051b(Context context, Uri uri) {
            this.f46770a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p001o.tb7.InterfaceC17050a
        /* renamed from: b */
        public Cursor mo49688b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f46770a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // p001o.tb7.InterfaceC17050a
        public void close() {
            ContentProviderClient contentProviderClient = this.f46770a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* renamed from: b */
    public static List m49680b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m49681c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static List m49682d(ub7 ub7Var, Resources resources) {
        return ub7Var.m51328b() != null ? ub7Var.m51328b() : xb7.m55924c(resources, ub7Var.m51329c());
    }

    /* renamed from: e */
    public static bc7.C12351a m49683e(Context context, ub7 ub7Var, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoM49684f = m49684f(context.getPackageManager(), ub7Var, context.getResources());
        return providerInfoM49684f == null ? bc7.C12351a.m18586a(1, null) : bc7.C12351a.m18586a(0, m49686h(context, ub7Var, providerInfoM49684f.authority, cancellationSignal));
    }

    /* renamed from: f */
    public static ProviderInfo m49684f(PackageManager packageManager, ub7 ub7Var, Resources resources) throws PackageManager.NameNotFoundException {
        String strM51331e = ub7Var.m51331e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM51331e, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strM51331e);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(ub7Var.m51332f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strM51331e + ", but package was not " + ub7Var.m51332f());
        }
        List listM49680b = m49680b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listM49680b, f46769a);
        List listM49682d = m49682d(ub7Var, resources);
        for (int i = 0; i < listM49682d.size(); i++) {
            ArrayList arrayList = new ArrayList((Collection) listM49682d.get(i));
            Collections.sort(arrayList, f46769a);
            if (m49681c(listM49680b, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static /* synthetic */ int m49685g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bc7.C12352b[] m49686h(Context context, ub7 ub7Var, String str, CancellationSignal cancellationSignal) throws Throwable {
        ArrayList arrayList;
        int i;
        Uri uriWithAppendedId;
        int i2;
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str).appendPath(TransferTable.COLUMN_FILE).build();
        InterfaceC17050a interfaceC17050aM49687a = InterfaceC17050a.m49687a(context, uriBuild);
        Cursor cursor = null;
        try {
            int i3 = 1;
            Cursor cursorMo49688b = interfaceC17050aM49687a.mo49688b(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{ub7Var.m51333g()}, null, cancellationSignal);
            if (cursorMo49688b != null) {
                try {
                    if (cursorMo49688b.getCount() > 0) {
                        int columnIndex = cursorMo49688b.getColumnIndex("result_code");
                        ArrayList arrayList3 = new ArrayList();
                        int columnIndex2 = cursorMo49688b.getColumnIndex("_id");
                        int columnIndex3 = cursorMo49688b.getColumnIndex("file_id");
                        int columnIndex4 = cursorMo49688b.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorMo49688b.getColumnIndex("font_weight");
                        int columnIndex6 = cursorMo49688b.getColumnIndex("font_italic");
                        while (cursorMo49688b.moveToNext()) {
                            int i4 = columnIndex != -1 ? cursorMo49688b.getInt(columnIndex) : 0;
                            int i5 = columnIndex4 != -1 ? cursorMo49688b.getInt(columnIndex4) : 0;
                            if (columnIndex3 == -1) {
                                i = i5;
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorMo49688b.getLong(columnIndex2));
                            } else {
                                i = i5;
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorMo49688b.getLong(columnIndex3));
                            }
                            int i6 = columnIndex5 != -1 ? cursorMo49688b.getInt(columnIndex5) : 400;
                            if (columnIndex6 == -1 || cursorMo49688b.getInt(columnIndex6) != i3) {
                                i2 = i6;
                                z = 0;
                            } else {
                                z = i3;
                                i2 = i6;
                            }
                            arrayList3.add(bc7.C12352b.m18589a(uriWithAppendedId, i, i2, z, i4));
                            i3 = 1;
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList2;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorMo49688b;
                    if (cursor != null) {
                        cursor.close();
                    }
                    interfaceC17050aM49687a.close();
                    throw th;
                }
            }
            if (cursorMo49688b != null) {
                cursorMo49688b.close();
            }
            interfaceC17050aM49687a.close();
            return (bc7.C12352b[]) arrayList.toArray(new bc7.C12352b[0]);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}

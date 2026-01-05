package y5;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import cj.C0975a;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import e1.C1917s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import og.oa;
import r1.C6438w;
import t5.AbstractC7044b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y5.b */
/* loaded from: classes.dex */
public abstract class AbstractC8556b {

    /* renamed from: a */
    public static final C1917s f41536a = new C1917s(2);

    /* renamed from: b */
    public static final C0975a f41537b = new C0975a(12);

    /* renamed from: a */
    public static C6438w m15826a(Context context, List list) {
        Trace.beginSection(oa.m10795e("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                C8557c c8557c = (C8557c) list.get(i10);
                ProviderInfo providerInfoM15827b = m15827b(context.getPackageManager(), c8557c, context.getResources());
                if (providerInfoM15827b == null) {
                    return new C6438w();
                }
                arrayList.add(m15828c(context, c8557c, providerInfoM15827b.authority));
            }
            return new C6438w(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: b */
    public static ProviderInfo m15827b(PackageManager packageManager, C8557c c8557c, Resources resources) {
        C0975a c0975a = f41537b;
        C1917s c1917s = f41536a;
        Trace.beginSection(oa.m10795e("FontProvider.getProvider"));
        try {
            List listM13337j = c8557c.f41541d;
            String str = c8557c.f41538a;
            String str2 = c8557c.f41539b;
            if (listM13337j == null) {
                listM13337j = AbstractC7044b.m13337j(resources, 0);
            }
            C8555a c8555a = new C8555a();
            c8555a.f41533a = str;
            c8555a.f41534b = str2;
            c8555a.f41535c = listM13337j;
            ProviderInfo providerInfo = (ProviderInfo) c1917s.m5620h(c8555a);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(str));
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c0975a);
            for (int i10 = 0; i10 < listM13337j.size(); i10++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM13337j.get(i10));
                Collections.sort(arrayList2, c0975a);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                            break;
                        }
                    }
                    c1917s.m5624l(c8555a, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: c */
    public static C8561g[] m15828c(Context context, C8557c c8557c, String str) {
        ContentProviderClient contentProviderClient;
        ContentProviderClient contentProviderClient2;
        ContentProviderClient contentProviderClient3;
        Uri uriWithAppendedId;
        Trace.beginSection(oa.m10795e("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath(TransferTable.COLUMN_FILE).build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {TransferTable.COLUMN_ID, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(oa.m10795e("ContentQueryWrapper.query"));
                try {
                    try {
                        String[] strArr2 = {c8557c.f41540c};
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            try {
                                cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                            } catch (RemoteException unused) {
                            }
                        }
                        if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                            contentProviderClient2 = contentProviderClientAcquireUnstableContentProviderClient;
                        } else {
                            int columnIndex = cursorQuery.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorQuery.getColumnIndex(TransferTable.COLUMN_ID);
                            int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                            int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                            int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                            while (cursorQuery.moveToNext()) {
                                int i10 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                                int i11 = columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    contentProviderClient3 = contentProviderClientAcquireUnstableContentProviderClient;
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2));
                                } else {
                                    contentProviderClient3 = contentProviderClientAcquireUnstableContentProviderClient;
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                                }
                                arrayList2.add(new C8561g(uriWithAppendedId, i11, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i10));
                                contentProviderClientAcquireUnstableContentProviderClient = contentProviderClient3;
                            }
                            contentProviderClient2 = contentProviderClientAcquireUnstableContentProviderClient;
                            arrayList = arrayList2;
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClient2 != null) {
                            contentProviderClient2.close();
                        }
                        return (C8561g[]) arrayList.toArray(new C8561g[0]);
                    } finally {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    contentProviderClient = context;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
            }
        } finally {
            Trace.endSection();
        }
    }
}

package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.sun.mail.imap.IMAPStore;
import i0.m0;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import r5.C6469d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: d */
    public static final String[] f2195d = {"_display_name", "_size"};

    /* renamed from: e */
    public static final File f2196e = new File("/");

    /* renamed from: f */
    public static final HashMap f2197f = new HashMap();

    /* renamed from: a */
    public final Object f2198a = new Object();

    /* renamed from: b */
    public String f2199b;

    /* renamed from: c */
    public C6469d f2200c;

    /* renamed from: a */
    public static String m752a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    /* renamed from: c */
    public static C6469d m753c(Context context, String str) {
        C6469d c6469dM755e;
        HashMap map = f2197f;
        synchronized (map) {
            try {
                c6469dM755e = (C6469d) map.get(str);
                if (c6469dM755e == null) {
                    try {
                        try {
                            c6469dM755e = m755e(context, str);
                            map.put(str, c6469dM755e);
                        } catch (IOException e2) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                        }
                    } catch (XmlPullParserException e10) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6469dM755e;
    }

    /* renamed from: d */
    public static Uri m754d(Context context, File file) {
        C6469d c6469dM753c = m753c(context, "com.websoptimization.callyzerbiz.provider");
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c6469dM753c.f31137b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (m752a(canonicalPath).startsWith(m752a(path) + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new IllegalArgumentException(m0.m7378k("Failed to find configured root that contains ", canonicalPath));
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(c6469dM753c.f31136a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    /* renamed from: e */
    public static C6469d m755e(Context context, String str) throws XmlPullParserException, IOException {
        C6469d c6469d = new C6469d(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException(m0.m7378k("Couldn't find meta-data for provider with authority ", str));
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return c6469d;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, IMAPStore.ID_NAME);
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f2196e;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    }
                }
                if (externalStorageDirectory == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        c6469d.f31137b.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + externalStorageDirectory, e2);
                    }
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority;
        if (str == null || str.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str2 = providerInfo.authority.split(";")[0];
        synchronized (this.f2198a) {
            this.f2199b = str2;
        }
        HashMap map = f2197f;
        synchronized (map) {
            map.remove(str2);
        }
    }

    /* renamed from: b */
    public final C6469d m756b() {
        C6469d c6469d;
        synchronized (this.f2198a) {
            try {
                if (this.f2199b == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.f2200c == null) {
                    this.f2200c = m753c(getContext(), this.f2199b);
                }
                c6469d = this.f2200c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6469d;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return m756b().m12454a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) throws IOException {
        File fileM12454a = m756b().m12454a(uri);
        int iLastIndexOf = fileM12454a.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileM12454a.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws IOException {
        int i10;
        File fileM12454a = m756b().m12454a(uri);
        if ("r".equals(str)) {
            i10 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i10 = 738197504;
        } else if ("wa".equals(str)) {
            i10 = 704643072;
        } else if ("rw".equals(str)) {
            i10 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(m0.m7378k("Invalid mode: ", str));
            }
            i10 = 1006632960;
        }
        return ParcelFileDescriptor.open(fileM12454a, i10);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws IOException {
        int i10;
        File fileM12454a = m756b().m12454a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f2195d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = queryParameter == null ? fileM12454a.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(fileM12454a.length());
            }
            i11 = i10;
        }
        String[] strArr4 = new String[i11];
        System.arraycopy(strArr3, 0, strArr4, 0, i11);
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, 0, objArr2, 0, i11);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}

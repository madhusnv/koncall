package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParserException;
import p001o.c64;
import p001o.s6c;

/* loaded from: classes2.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: e */
    public static final String[] f7148e = {"_display_name", "_size"};

    /* renamed from: f */
    public static final File f7149f = new File("/");

    /* renamed from: g */
    public static final HashMap f7150g = new HashMap();

    /* renamed from: a */
    public final Object f7151a;

    /* renamed from: b */
    public String f7152b;

    /* renamed from: c */
    public InterfaceC2025b f7153c;

    /* renamed from: d */
    public final int f7154d;

    /* renamed from: androidx.core.content.FileProvider$a */
    public static class C2024a {
        /* renamed from: a */
        public static File[] m5844a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* renamed from: androidx.core.content.FileProvider$b */
    public interface InterfaceC2025b {
        /* renamed from: a */
        Uri mo5845a(File file);

        /* renamed from: b */
        File mo5846b(Uri uri);
    }

    /* renamed from: androidx.core.content.FileProvider$c */
    public static class C2026c implements InterfaceC2025b {

        /* renamed from: a */
        public final String f7155a;

        /* renamed from: b */
        public final HashMap f7156b = new HashMap();

        public C2026c(String str) {
            this.f7155a = str;
        }

        @Override // androidx.core.content.FileProvider.InterfaceC2025b
        /* renamed from: a */
        public Uri mo5845a(File file) throws IOException {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f7156b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (m5848d(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = ((File) entry.getValue()).getPath();
                return new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(this.f7155a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.InterfaceC2025b
        /* renamed from: b */
        public File mo5846b(Uri uri) throws IOException {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = (File) this.f7156b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (m5848d(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        /* renamed from: c */
        public void m5847c(String str, File file) throws IOException {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f7156b.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
            }
        }

        /* renamed from: d */
        public final boolean m5848d(String str, String str2) {
            String strM5842k = FileProvider.m5842k(str);
            String strM5842k2 = FileProvider.m5842k(str2);
            if (!strM5842k.equals(strM5842k2)) {
                if (!strM5842k.startsWith(strM5842k2 + '/')) {
                    return false;
                }
            }
            return true;
        }
    }

    public FileProvider() {
        this(0);
    }

    /* renamed from: b */
    public static File m5834b(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: c */
    public static Object[] m5835c(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    /* renamed from: d */
    public static String[] m5836d(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: e */
    public static XmlResourceParser m5837e(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    /* renamed from: g */
    public static InterfaceC2025b m5838g(Context context, String str, int i) {
        InterfaceC2025b interfaceC2025bM5841j;
        HashMap map = f7150g;
        synchronized (map) {
            interfaceC2025bM5841j = (InterfaceC2025b) map.get(str);
            if (interfaceC2025bM5841j == null) {
                try {
                    try {
                        interfaceC2025bM5841j = m5841j(context, str, i);
                        map.put(str, interfaceC2025bM5841j);
                    } catch (XmlPullParserException e) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return interfaceC2025bM5841j;
    }

    /* renamed from: h */
    public static Uri m5839h(Context context, String str, File file) {
        return m5838g(context, str, 0).mo5845a(file);
    }

    /* renamed from: i */
    public static int m5840i(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: j */
    public static InterfaceC2025b m5841j(Context context, String str, int i) throws XmlPullParserException, IOException {
        C2026c c2026c = new C2026c(str);
        XmlResourceParser xmlResourceParserM5837e = m5837e(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = xmlResourceParserM5837e.next();
            if (next == 1) {
                return c2026c;
            }
            if (next == 2) {
                String name = xmlResourceParserM5837e.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserM5837e.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserM5837e.getAttributeValue(null, ClientCookie.PATH_ATTR);
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f7149f;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = c64.getExternalFilesDirs(context, null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = c64.getExternalCacheDirs(context);
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrM5844a = C2024a.m5844a(context);
                    if (fileArrM5844a.length > 0) {
                        externalStorageDirectory = fileArrM5844a[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    c2026c.m5847c(attributeValue, m5834b(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    /* renamed from: k */
    public static String m5842k(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.f7151a) {
            this.f7152b = str;
        }
        HashMap map = f7150g;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return m5843f().mo5846b(uri).delete() ? 1 : 0;
    }

    /* renamed from: f */
    public final InterfaceC2025b m5843f() {
        InterfaceC2025b interfaceC2025b;
        synchronized (this.f7151a) {
            s6c.m47912d(this.f7152b, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            if (this.f7153c == null) {
                this.f7153c = m5838g(getContext(), this.f7152b, this.f7154d);
            }
            interfaceC2025b = this.f7153c;
        }
        return interfaceC2025b;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileMo5846b = m5843f().mo5846b(uri);
        int iLastIndexOf = fileMo5846b.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileMo5846b.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(m5843f().mo5846b(uri), m5840i(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File fileMo5846b = m5843f().mo5846b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f7148e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileMo5846b.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(fileMo5846b.length());
            }
            i2 = i;
        }
        String[] strArrM5836d = m5836d(strArr3, i2);
        Object[] objArrM5835c = m5835c(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArrM5836d, 1);
        matrixCursor.addRow(objArrM5835c);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public FileProvider(int i) {
        this.f7151a = new Object();
        this.f7154d = i;
    }
}

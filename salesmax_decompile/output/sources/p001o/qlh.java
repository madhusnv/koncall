package p001o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.AbstractC10730a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes5.dex */
public class qlh {

    /* renamed from: f */
    public static final kz6 f42125f = new kz6();

    /* renamed from: a */
    public final kz6 f42126a;

    /* renamed from: b */
    public final olh f42127b;

    /* renamed from: c */
    public final wo0 f42128c;

    /* renamed from: d */
    public final ContentResolver f42129d;

    /* renamed from: e */
    public final List f42130e;

    public qlh(List list, olh olhVar, wo0 wo0Var, ContentResolver contentResolver) {
        this(list, f42125f, olhVar, wo0Var, contentResolver);
    }

    /* renamed from: a */
    public int m45636a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f42129d.openInputStream(uri);
                int iM12690b = AbstractC10730a.m12690b(this.f42130e, inputStreamOpenInputStream, this.f42128c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iM12690b;
            } catch (IOException | NullPointerException unused2) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to open uri: ");
                    sb.append(uri);
                }
                if (inputStreamOpenInputStream == null) {
                    return -1;
                }
                try {
                    inputStreamOpenInputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m45637b(Uri uri) throws Throwable {
        Cursor cursorMo40770a;
        Cursor cursor = null;
        try {
            cursorMo40770a = this.f42127b.mo40770a(uri);
            if (cursorMo40770a != null) {
                try {
                    try {
                        if (cursorMo40770a.moveToFirst()) {
                            String string = cursorMo40770a.getString(0);
                            cursorMo40770a.close();
                            return string;
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to query for thumbnail for Uri: ");
                            sb.append(uri);
                        }
                        if (cursorMo40770a != null) {
                            cursorMo40770a.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorMo40770a;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorMo40770a != null) {
                cursorMo40770a.close();
            }
            return null;
        } catch (SecurityException unused2) {
            cursorMo40770a = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final boolean m45638c(File file) {
        return this.f42126a.m36368a(file) && 0 < this.f42126a.m36370c(file);
    }

    /* renamed from: d */
    public InputStream m45639d(Uri uri) throws Throwable {
        String strM45637b = m45637b(uri);
        if (TextUtils.isEmpty(strM45637b)) {
            return null;
        }
        File fileM36369b = this.f42126a.m36369b(strM45637b);
        if (!m45638c(fileM36369b)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileM36369b);
        try {
            return this.f42129d.openInputStream(uriFromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
        }
    }

    public qlh(List list, kz6 kz6Var, olh olhVar, wo0 wo0Var, ContentResolver contentResolver) {
        this.f42126a = kz6Var;
        this.f42127b = olhVar;
        this.f42128c = wo0Var;
        this.f42129d = contentResolver;
        this.f42130e = list;
    }
}

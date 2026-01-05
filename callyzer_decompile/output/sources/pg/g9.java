package pg;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Binder;
import androidx.core.content.FileProvider;
import ec.C2003a;
import ec.C2005c;
import ec.C2011i;
import ec.InterfaceC2004b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import og.be;
import og.ud;
import rb.C6488a;
import rw.AbstractC6663m;
import tb.AbstractC7094e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class g9 {
    /* renamed from: a */
    public static final Uri m11661a(Context context, String str) {
        AbstractC4154l.m8923f(context, "context");
        if (AbstractC5178p.m10116x(str, "content://", false)) {
            return Uri.parse(str);
        }
        Uri uriM754d = FileProvider.m754d(context, new File(str));
        AbstractC4154l.m8920c(uriM754d);
        return uriM754d;
    }

    /* renamed from: b */
    public static final boolean m11662b(Context context, Uri uri) throws IOException {
        AbstractC4154l.m8923f(uri, "<this>");
        AbstractC4154l.m8923f(context, "context");
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery == null) {
                return false;
            }
            try {
                if (cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return true;
                }
                cursorQuery.close();
                return false;
            } finally {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            e2.getMessage();
            uri.toString();
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m11663c(Context context, Uri uri) {
        AbstractC4154l.m8923f(uri, "<this>");
        AbstractC4154l.m8923f(context, "context");
        return context.checkUriPermission(uri, Binder.getCallingPid(), Binder.getCallingUid(), 1) == 0;
    }

    /* renamed from: d */
    public static final boolean m11664d(Context context, Uri uri) throws SecurityException, IOException, IllegalArgumentException {
        AbstractC4154l.m8923f(uri, "<this>");
        AbstractC4154l.m8923f(context, "context");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(12);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(16);
        try {
            mediaMetadataRetriever.release();
        } catch (IOException e2) {
            e2.toString();
        }
        return (strExtractMetadata == null || strExtractMetadata.length() == 0 || !AbstractC5178p.m10116x(strExtractMetadata, "video", true) || strExtractMetadata2 == null || strExtractMetadata2.length() == 0 || !AbstractC5185w.m10130l(strExtractMetadata2, "yes", true)) ? false : true;
    }

    /* renamed from: e */
    public static final void m11665e(C2005c c2005c, boolean z6, String str, Boolean bool) {
        if (z6) {
            c2005c.mo1862b(AbstractC7094e.f34217g, tb.a0.f34207c);
        }
        C2003a key = AbstractC7094e.f34214d;
        AbstractC4154l.m8923f(key, "key");
        if (str != null && !AbstractC5178p.m10101L(str)) {
            c2005c.mo1862b(key, str);
        }
        if (bool != null) {
            c2005c.mo1862b(AbstractC7094e.f34220j, Boolean.valueOf(!bool.booleanValue()));
        }
    }

    /* renamed from: f */
    public static final C6488a m11666f(boolean z6, String str, String str2, Boolean bool) {
        InterfaceC2004b interfaceC2004b;
        if (!z6 && str == null && str2 == null && bool == null) {
            interfaceC2004b = C2011i.f9543a;
        } else {
            C2005c c2005cM10980f = ud.m10980f();
            C2003a key = AbstractC7094e.f34211a;
            AbstractC4154l.m8923f(key, "key");
            if (str2 != null && !AbstractC5178p.m10101L(str2)) {
                c2005cM10980f.mo1862b(key, str2);
            }
            m11665e(c2005cM10980f, z6, str, bool);
            interfaceC2004b = c2005cM10980f;
        }
        return be.m10556a("aws.auth#sigv4", interfaceC2004b);
    }

    /* renamed from: g */
    public static /* synthetic */ C6488a m11667g(String str, String str2, Boolean bool, int i10) {
        boolean z6 = (i10 & 1) == 0;
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        return m11666f(z6, str, str2, bool);
    }

    /* renamed from: h */
    public static final File m11668h(Context context, Uri uri) throws IOException {
        AbstractC4154l.m8923f(context, "context");
        if (!m11662b(context, uri)) {
            throw new FileNotFoundException();
        }
        String string = uri.toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        File file = new File(context.getCacheDir(), (String) AbstractC6663m.m12750N(AbstractC5178p.m10112W(string, new String[]{"/"}, 6)));
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            return file;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                og.p1.m10811a(inputStreamOpenInputStream, fileOutputStream);
                fileOutputStream.close();
                inputStreamOpenInputStream.close();
                return file;
            } finally {
            }
        } finally {
        }
    }
}

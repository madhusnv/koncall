package t6;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import java.util.ArrayList;
import og.jg;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t6.a */
/* loaded from: classes.dex */
public final class C7054a {

    /* renamed from: a */
    public final Context f34102a;

    /* renamed from: b */
    public final Uri f34103b;

    public C7054a(Context context, Uri uri) {
        this.f34102a = context;
        this.f34103b = uri;
    }

    /* renamed from: a */
    public final boolean m13345a() {
        Context context = this.f34102a;
        Uri uri = this.f34103b;
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(jg.m10725d(context, uri, "mime_type"));
    }

    /* renamed from: b */
    public final String m13346b() {
        return jg.m10725d(this.f34102a, this.f34103b, "_display_name");
    }

    /* renamed from: c */
    public final String m13347c() throws Throwable {
        String strM10725d = jg.m10725d(this.f34102a, this.f34103b, "mime_type");
        if ("vnd.android.document/directory".equals(strM10725d)) {
            return null;
        }
        return strM10725d;
    }

    /* renamed from: d */
    public final boolean m13348d() throws Throwable {
        String strM10725d = jg.m10725d(this.f34102a, this.f34103b, "mime_type");
        return ("vnd.android.document/directory".equals(strM10725d) || TextUtils.isEmpty(strM10725d)) ? false : true;
    }

    /* renamed from: e */
    public final long m13349e() {
        return jg.m10724c(this.f34102a, this.f34103b, "last_modified");
    }

    /* renamed from: f */
    public final C7054a[] m13350f() {
        Context context = this.f34102a;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = this.f34103b;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(0)));
                    }
                    try {
                        AbstractC5601a.m11255z(cursorQuery);
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                } catch (Exception unused) {
                }
            } catch (Exception e10) {
                e10.toString();
                if (cursorQuery != null) {
                    try {
                        AbstractC5601a.m11255z(cursorQuery);
                    } catch (RuntimeException e11) {
                        throw e11;
                    }
                }
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            C7054a[] c7054aArr = new C7054a[uriArr.length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                c7054aArr[i10] = new C7054a(context, uriArr[i10]);
            }
            return c7054aArr;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                try {
                    AbstractC5601a.m11255z(cursorQuery);
                } catch (RuntimeException e12) {
                    throw e12;
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }
}

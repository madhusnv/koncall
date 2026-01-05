package p001o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ixh extends zv5 {

    /* renamed from: b */
    public Context f29349b;

    /* renamed from: c */
    public Uri f29350c;

    public ixh(zv5 zv5Var, Context context, Uri uri) {
        super(zv5Var);
        this.f29349b = context;
        this.f29350c = uri;
    }

    /* renamed from: i */
    public static void m32891i(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    @Override // p001o.zv5
    /* renamed from: c */
    public String mo32892c() {
        return rw5.m47193b(this.f29349b, this.f29350c);
    }

    @Override // p001o.zv5
    /* renamed from: d */
    public Uri mo32893d() {
        return this.f29350c;
    }

    @Override // p001o.zv5
    /* renamed from: e */
    public boolean mo32894e() {
        return rw5.m47195d(this.f29349b, this.f29350c);
    }

    @Override // p001o.zv5
    /* renamed from: f */
    public boolean mo32895f() {
        return rw5.m47196e(this.f29349b, this.f29350c);
    }

    @Override // p001o.zv5
    /* renamed from: g */
    public long mo32896g() {
        return rw5.m47197f(this.f29349b, this.f29350c);
    }

    @Override // p001o.zv5
    /* renamed from: h */
    public zv5[] mo32897h() throws Exception {
        ContentResolver contentResolver = this.f29349b.getContentResolver();
        Uri uri = this.f29350c;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f29350c, cursorQuery.getString(0)));
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed query: ");
                sb.append(e);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            zv5[] zv5VarArr = new zv5[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                zv5VarArr[i] = new ixh(this, this.f29349b, uriArr[i]);
            }
            return zv5VarArr;
        } finally {
            m32891i(cursorQuery);
        }
    }
}

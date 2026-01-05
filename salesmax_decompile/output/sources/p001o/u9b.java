package p001o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import p001o.gjb;
import p001o.lu4;

/* loaded from: classes5.dex */
public final class u9b implements gjb {

    /* renamed from: a */
    public final Context f48602a;

    /* renamed from: o.u9b$a */
    public static final class C17340a implements hjb {

        /* renamed from: a */
        public final Context f48603a;

        public C17340a(Context context) {
            this.f48603a = context;
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new u9b(this.f48603a);
        }
    }

    /* renamed from: o.u9b$b */
    public static class C17341b implements lu4 {

        /* renamed from: c */
        public static final String[] f48604c = {"_data"};

        /* renamed from: a */
        public final Context f48605a;

        /* renamed from: b */
        public final Uri f48606b;

        public C17341b(Context context, Uri uri) {
            this.f48605a = context;
            this.f48606b = uri;
        }

        @Override // p001o.lu4
        /* renamed from: a */
        public Class mo18153a() {
            return File.class;
        }

        @Override // p001o.lu4
        /* renamed from: b */
        public void mo18154b() {
        }

        @Override // p001o.lu4
        public void cancel() {
        }

        @Override // p001o.lu4
        /* renamed from: d */
        public void mo18155d(gid gidVar, lu4.InterfaceC15153a interfaceC15153a) {
            Cursor cursorQuery = this.f48605a.getContentResolver().query(this.f48606b, f48604c, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (!TextUtils.isEmpty(string)) {
                interfaceC15153a.mo17836f(new File(string));
                return;
            }
            interfaceC15153a.mo17835c(new FileNotFoundException("Failed to find file path for: " + this.f48606b));
        }

        @Override // p001o.lu4
        /* renamed from: e */
        public ez4 mo18156e() {
            return ez4.LOCAL;
        }
    }

    public u9b(Context context) {
        this.f48602a = context;
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(Uri uri, int i, int i2, rec recVar) {
        return new gjb.C13758a(new l6c(uri), new C17341b(this.f48602a, uri));
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(Uri uri) {
        return w9b.m54118b(uri);
    }
}

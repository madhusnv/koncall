package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;
import p001o.f9g;
import p001o.id5;
import p001o.prb;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class FacebookContentProvider extends ContentProvider {

    /* renamed from: a */
    public static final C10755a f11318a = new C10755a(null);

    /* renamed from: b */
    public static final String f11319b = FacebookContentProvider.class.getName();

    /* renamed from: com.facebook.FacebookContentProvider$a */
    public static final class C10755a {
        public C10755a() {
        }

        public /* synthetic */ C10755a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: a */
    public final Pair m12818a(Uri uri) throws Exception {
        try {
            String path = uri.getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            sq8.m48648g(path, "checkNotNull(uri.path)");
            String strSubstring = path.substring(1);
            sq8.m48648g(strSubstring, "this as java.lang.String).substring(startIndex)");
            String[] strArr = (String[]) f9g.D0(strSubstring, new String[]{"/"}, false, 0, 6, null).toArray(new String[0]);
            String str = strArr[0];
            String str2 = strArr[1];
            if ("..".contentEquals(str) || "..".contentEquals(str2)) {
                throw new Exception();
            }
            return new Pair(UUID.fromString(str), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        sq8.m48649h(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        sq8.m48649h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        sq8.m48649h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws Exception {
        sq8.m48649h(uri, "uri");
        sq8.m48649h(str, "mode");
        Pair pairM12818a = m12818a(uri);
        if (pairM12818a == null) {
            throw new FileNotFoundException();
        }
        try {
            File fileM44086c = prb.m44086c((UUID) pairM12818a.first, (String) pairM12818a.second);
            if (fileM44086c != null) {
                return ParcelFileDescriptor.open(fileM44086c, 268435456);
            }
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Got unexpected exception:");
            sb.append(e);
            throw e;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        sq8.m48649h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        sq8.m48649h(uri, "uri");
        return 0;
    }
}

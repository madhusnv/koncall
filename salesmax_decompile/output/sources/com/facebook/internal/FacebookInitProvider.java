package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.C10773c;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class FacebookInitProvider extends ContentProvider {

    /* renamed from: a */
    public static final C10782a f11465a = new C10782a(null);

    /* renamed from: b */
    public static final String f11466b = FacebookInitProvider.class.getSimpleName();

    /* renamed from: com.facebook.internal.FacebookInitProvider$a */
    public static final class C10782a {
        public C10782a() {
        }

        public /* synthetic */ C10782a(id5 id5Var) {
            this();
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
        try {
            Context context = getContext();
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            C10773c.m12999N(context);
            return false;
        } catch (Exception unused) {
            return false;
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

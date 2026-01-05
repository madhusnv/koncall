package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.C3767a;
import ji.C3773g;
import ji.C3775i;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: a */
    public static final C3767a f7172a = new C3767a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());

    /* renamed from: b */
    public static final AtomicBoolean f7173b = new AtomicBoolean(false);

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        AbstractC6840z.m13037h(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        try {
            AtomicBoolean atomicBoolean = f7173b;
            atomicBoolean.set(true);
            Context context = getContext();
            synchronized (C3773g.f19660k) {
                try {
                    if (C3773g.f19661l.containsKey("[DEFAULT]")) {
                        C3773g.m8291c();
                    } else {
                        C3775i c3775iM8298a = C3775i.m8298a(context);
                        if (c3775iM8298a != null) {
                            C3773g.m8292f(context, c3775iM8298a);
                        }
                    }
                } finally {
                }
            }
            atomicBoolean.set(false);
            return false;
        } catch (Throwable th2) {
            f7173b.set(false);
            throw th2;
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

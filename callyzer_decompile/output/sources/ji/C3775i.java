package ji;

import android.content.Context;
import android.text.TextUtils;
import c9.C0910e;
import c9.C0917l;
import java.util.Arrays;
import sf.AbstractC6840z;
import zf.AbstractC8949d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ji.i */
/* loaded from: classes.dex */
public final class C3775i {

    /* renamed from: a */
    public final String f19677a;

    /* renamed from: b */
    public final String f19678b;

    /* renamed from: c */
    public final String f19679c;

    /* renamed from: d */
    public final String f19680d;

    /* renamed from: e */
    public final String f19681e;

    /* renamed from: f */
    public final String f19682f;

    /* renamed from: g */
    public final String f19683g;

    public C3775i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = AbstractC8949d.f42961a;
        AbstractC6840z.m13038i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f19678b = str;
        this.f19677a = str2;
        this.f19679c = str3;
        this.f19680d = str4;
        this.f19681e = str5;
        this.f19682f = str6;
        this.f19683g = str7;
    }

    /* renamed from: a */
    public static C3775i m8298a(Context context) {
        C0917l c0917l = new C0917l(context);
        String strM2643i = c0917l.m2643i("google_app_id");
        if (TextUtils.isEmpty(strM2643i)) {
            return null;
        }
        return new C3775i(strM2643i, c0917l.m2643i("google_api_key"), c0917l.m2643i("firebase_database_url"), c0917l.m2643i("ga_trackingId"), c0917l.m2643i("gcm_defaultSenderId"), c0917l.m2643i("google_storage_bucket"), c0917l.m2643i("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3775i)) {
            return false;
        }
        C3775i c3775i = (C3775i) obj;
        return AbstractC6840z.m13040k(this.f19678b, c3775i.f19678b) && AbstractC6840z.m13040k(this.f19677a, c3775i.f19677a) && AbstractC6840z.m13040k(this.f19679c, c3775i.f19679c) && AbstractC6840z.m13040k(this.f19680d, c3775i.f19680d) && AbstractC6840z.m13040k(this.f19681e, c3775i.f19681e) && AbstractC6840z.m13040k(this.f19682f, c3775i.f19682f) && AbstractC6840z.m13040k(this.f19683g, c3775i.f19683g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19678b, this.f19677a, this.f19679c, this.f19680d, this.f19681e, this.f19682f, this.f19683g});
    }

    public final String toString() {
        C0910e c0910e = new C0910e(this);
        c0910e.m2606p(this.f19678b, "applicationId");
        c0910e.m2606p(this.f19677a, "apiKey");
        c0910e.m2606p(this.f19679c, "databaseUrl");
        c0910e.m2606p(this.f19681e, "gcmSenderId");
        c0910e.m2606p(this.f19682f, "storageBucket");
        c0910e.m2606p(this.f19683g, "projectId");
        return c0910e.toString();
    }
}

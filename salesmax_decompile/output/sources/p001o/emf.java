package p001o;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class emf implements ce9 {

    /* renamed from: a */
    public final SharedPreferences.Editor f21935a;

    /* renamed from: b */
    public final String f21936b;

    public emf(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f21936b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f21935a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f21935a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // p001o.ce9
    /* renamed from: a */
    public void mo21064a(xd9 xd9Var) throws IOException {
        if (!this.f21935a.putString(this.f21936b, fy7.m27757b(xd9Var.mo44940a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // p001o.ce9
    /* renamed from: b */
    public void mo21065b(s76 s76Var) throws IOException {
        if (!this.f21935a.putString(this.f21936b, fy7.m27757b(s76Var.mo44940a())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}

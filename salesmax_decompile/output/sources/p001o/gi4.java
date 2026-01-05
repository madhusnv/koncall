package p001o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import p001o.bi4;

/* loaded from: classes2.dex */
public final class gi4 {

    /* renamed from: a */
    public final Intent f25267a;

    /* renamed from: b */
    public final Bundle f25268b;

    /* renamed from: o.gi4$a */
    public static final class C13739a {

        /* renamed from: c */
        public ArrayList f25271c;

        /* renamed from: d */
        public Bundle f25272d;

        /* renamed from: e */
        public ArrayList f25273e;

        /* renamed from: f */
        public SparseArray f25274f;

        /* renamed from: g */
        public Bundle f25275g;

        /* renamed from: a */
        public final Intent f25269a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        public final bi4.C12415a f25270b = new bi4.C12415a();

        /* renamed from: h */
        public int f25276h = 0;

        /* renamed from: i */
        public boolean f25277i = true;

        public C13739a(ji4 ji4Var) {
            if (ji4Var != null) {
                m28791b(ji4Var);
            }
        }

        /* renamed from: a */
        public gi4 m28790a() {
            if (!this.f25269a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m28792c(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f25271c;
            if (arrayList != null) {
                this.f25269a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f25273e;
            if (arrayList2 != null) {
                this.f25269a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f25269a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f25277i);
            this.f25269a.putExtras(this.f25270b.m19124a().m19123a());
            Bundle bundle = this.f25275g;
            if (bundle != null) {
                this.f25269a.putExtras(bundle);
            }
            if (this.f25274f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f25274f);
                this.f25269a.putExtras(bundle2);
            }
            this.f25269a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f25276h);
            return new gi4(this.f25269a, this.f25272d);
        }

        /* renamed from: b */
        public C13739a m28791b(ji4 ji4Var) {
            this.f25269a.setPackage(ji4Var.m33857d().getPackageName());
            m28792c(ji4Var.m33856c(), ji4Var.m33858e());
            return this;
        }

        /* renamed from: c */
        public final void m28792c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            gn1.m29146b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f25269a.putExtras(bundle);
        }
    }

    public gi4(Intent intent, Bundle bundle) {
        this.f25267a = intent;
        this.f25268b = bundle;
    }

    /* renamed from: a */
    public void m28789a(Context context, Uri uri) {
        this.f25267a.setData(uri);
        c64.startActivity(context, this.f25267a, this.f25268b);
    }
}

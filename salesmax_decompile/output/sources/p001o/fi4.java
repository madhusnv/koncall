package p001o;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p001o.i68;

/* loaded from: classes2.dex */
public abstract class fi4 {

    /* renamed from: a */
    public final j68 f23366a;

    /* renamed from: b */
    public final ComponentName f23367b;

    /* renamed from: c */
    public final Context f23368c;

    /* renamed from: o.fi4$a */
    public class C13436a extends ii4 {

        /* renamed from: a */
        public final /* synthetic */ Context f23369a;

        public C13436a(Context context) {
            this.f23369a = context;
        }

        @Override // p001o.ii4
        public final void onCustomTabsServiceConnected(ComponentName componentName, fi4 fi4Var) {
            fi4Var.m26740h(0L);
            this.f23369a.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: o.fi4$b */
    public class BinderC13437b extends i68.AbstractBinderC14199a {

        /* renamed from: a */
        public Handler f23370a = new Handler(Looper.getMainLooper());

        /* renamed from: f */
        public final /* synthetic */ ei4 f23371f;

        /* renamed from: o.fi4$b$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f23373a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f23374b;

            public a(int i, Bundle bundle) {
                this.f23373a = i;
                this.f23374b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC13437b.this.f23371f.mo25100d(this.f23373a, this.f23374b);
            }
        }

        /* renamed from: o.fi4$b$b */
        public class b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f23376a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f23377b;

            public b(String str, Bundle bundle) {
                this.f23376a = str;
                this.f23377b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC13437b.this.f23371f.mo25097a(this.f23376a, this.f23377b);
            }
        }

        /* renamed from: o.fi4$b$c */
        public class c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Bundle f23379a;

            public c(Bundle bundle) {
                this.f23379a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC13437b.this.f23371f.mo25099c(this.f23379a);
            }
        }

        /* renamed from: o.fi4$b$d */
        public class d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f23381a;

            /* renamed from: b */
            public final /* synthetic */ Bundle f23382b;

            public d(String str, Bundle bundle) {
                this.f23381a = str;
                this.f23382b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC13437b.this.f23371f.mo25101e(this.f23381a, this.f23382b);
            }
        }

        /* renamed from: o.fi4$b$e */
        public class e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f23384a;

            /* renamed from: b */
            public final /* synthetic */ Uri f23385b;

            /* renamed from: c */
            public final /* synthetic */ boolean f23386c;

            /* renamed from: d */
            public final /* synthetic */ Bundle f23387d;

            public e(int i, Uri uri, boolean z, Bundle bundle) {
                this.f23384a = i;
                this.f23385b = uri;
                this.f23386c = z;
                this.f23387d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                BinderC13437b.this.f23371f.mo25102f(this.f23384a, this.f23385b, this.f23386c, this.f23387d);
            }
        }

        public BinderC13437b(ei4 ei4Var) {
            this.f23371f = ei4Var;
        }

        @Override // p001o.i68
        public void C0(int i, Bundle bundle) {
            if (this.f23371f == null) {
                return;
            }
            this.f23370a.post(new a(i, bundle));
        }

        @Override // p001o.i68
        public void G0(String str, Bundle bundle) {
            if (this.f23371f == null) {
                return;
            }
            this.f23370a.post(new d(str, bundle));
        }

        @Override // p001o.i68
        public void H0(Bundle bundle) {
            if (this.f23371f == null) {
                return;
            }
            this.f23370a.post(new c(bundle));
        }

        @Override // p001o.i68
        public void J0(int i, Uri uri, boolean z, Bundle bundle) {
            if (this.f23371f == null) {
                return;
            }
            this.f23370a.post(new e(i, uri, z, bundle));
        }

        @Override // p001o.i68
        /* renamed from: M */
        public void mo26741M(String str, Bundle bundle) {
            if (this.f23371f == null) {
                return;
            }
            this.f23370a.post(new b(str, bundle));
        }

        @Override // p001o.i68
        /* renamed from: e */
        public Bundle mo26742e(String str, Bundle bundle) {
            ei4 ei4Var = this.f23371f;
            if (ei4Var == null) {
                return null;
            }
            return ei4Var.mo25098b(str, bundle);
        }
    }

    public fi4(j68 j68Var, ComponentName componentName, Context context) {
        this.f23366a = j68Var;
        this.f23367b = componentName;
        this.f23368c = context;
    }

    /* renamed from: a */
    public static boolean m26733a(Context context, String str, ii4 ii4Var) {
        ii4Var.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, ii4Var, 33);
    }

    /* renamed from: b */
    public static boolean m26734b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return m26733a(applicationContext, str, new C13436a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static String m26735d(Context context, List list) {
        return m26736e(context, list, false);
    }

    /* renamed from: e */
    public static String m26736e(Context context, List list, boolean z) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final i68.AbstractBinderC14199a m26737c(ei4 ei4Var) {
        return new BinderC13437b(ei4Var);
    }

    /* renamed from: f */
    public ji4 m26738f(ei4 ei4Var) {
        return m26739g(ei4Var, null);
    }

    /* renamed from: g */
    public final ji4 m26739g(ei4 ei4Var, PendingIntent pendingIntent) {
        boolean zMo4491L;
        i68.AbstractBinderC14199a abstractBinderC14199aM26737c = m26737c(ei4Var);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zMo4491L = this.f23366a.k0(abstractBinderC14199aM26737c, bundle);
            } else {
                zMo4491L = this.f23366a.mo4491L(abstractBinderC14199aM26737c);
            }
            if (zMo4491L) {
                return new ji4(this.f23366a, abstractBinderC14199aM26737c, this.f23367b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public boolean m26740h(long j) {
        try {
            return this.f23366a.q0(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}

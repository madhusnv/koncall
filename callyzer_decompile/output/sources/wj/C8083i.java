package wj;

import ak.CallableC0163b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import e1.C1903e;
import h6.ExecutorC2852h;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import p020v.b0;
import pg.l8;
import q5.C6118k;
import v0.C7622f;
import w3.C7892j;
import yg.C8656m;
import yg.InterfaceC8644a;
import zf.AbstractC8947b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wj.i */
/* loaded from: classes.dex */
public final class C8083i {

    /* renamed from: c */
    public static final Object f38705c = new Object();

    /* renamed from: d */
    public static a0 f38706d;

    /* renamed from: a */
    public final Object f38707a;

    /* renamed from: b */
    public final Object f38708b;

    public C8083i(ExecutorService executorService) {
        this.f38708b = new C1903e(0);
        this.f38707a = executorService;
    }

    /* renamed from: a */
    public static C8656m m15220a(Context context, Intent intent, boolean z6) {
        a0 a0Var;
        Log.isLoggable("FirebaseMessaging", 3);
        synchronized (f38705c) {
            try {
                if (f38706d == null) {
                    f38706d = new a0(context);
                }
                a0Var = f38706d;
            } finally {
            }
        }
        if (!z6) {
            return a0Var.m15216b(intent).m15980g(new ExecutorC2852h(0), new C7892j(5));
        }
        if (C8090p.m15225t().m15235L(context)) {
            synchronized (AbstractC8098x.f38763b) {
                try {
                    AbstractC8098x.m15281a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        AbstractC8098x.f38764c.m15543a(AbstractC8098x.f38762a);
                    }
                    a0Var.m15216b(intent).m15976c(new b0(6, intent));
                } finally {
                }
            }
        } else {
            a0Var.m15216b(intent);
        }
        return l8.m11765f(-1);
    }

    /* renamed from: b */
    public C8656m m15221b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f38707a;
        ExecutorC2852h executorC2852h = (ExecutorC2852h) this.f38708b;
        boolean z6 = AbstractC8947b.m16428e() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z10 = (intent.getFlags() & 268435456) != 0;
        return (!z6 || z10) ? l8.m11762c(executorC2852h, new CallableC0163b(3, context, intent)).m15981h(executorC2852h, new InterfaceC8644a() { // from class: wj.h
            @Override // yg.InterfaceC8644a
            /* renamed from: f */
            public final Object mo20f(C8656m c8656m) {
                return (AbstractC8947b.m16428e() && ((Integer) c8656m.m15983j()).intValue() == 402) ? C8083i.m15220a(context, intent, z10).m15980g(new ExecutorC2852h(0), new C7892j(4)) : c8656m;
            }
        }) : m15220a(context, intent, z10);
    }

    public C8083i(Context context) {
        this.f38707a = context;
        this.f38708b = new ExecutorC2852h(0);
    }

    public C8083i(C7622f c7622f) throws JSONException, NumberFormatException {
        this.f38707a = c7622f.m14517u("gcm.n.title");
        c7622f.m14515s("gcm.n.title");
        Object[] objArrM14514r = c7622f.m14514r("gcm.n.title");
        if (objArrM14514r != null) {
            String[] strArr = new String[objArrM14514r.length];
            for (int i10 = 0; i10 < objArrM14514r.length; i10++) {
                strArr[i10] = String.valueOf(objArrM14514r[i10]);
            }
        }
        this.f38708b = c7622f.m14517u("gcm.n.body");
        c7622f.m14515s("gcm.n.body");
        Object[] objArrM14514r2 = c7622f.m14514r("gcm.n.body");
        if (objArrM14514r2 != null) {
            String[] strArr2 = new String[objArrM14514r2.length];
            for (int i11 = 0; i11 < objArrM14514r2.length; i11++) {
                strArr2[i11] = String.valueOf(objArrM14514r2[i11]);
            }
        }
        c7622f.m14517u("gcm.n.icon");
        if (TextUtils.isEmpty(c7622f.m14517u("gcm.n.sound2"))) {
            c7622f.m14517u("gcm.n.sound");
        }
        c7622f.m14517u("gcm.n.tag");
        c7622f.m14517u("gcm.n.color");
        c7622f.m14517u("gcm.n.click_action");
        c7622f.m14517u("gcm.n.android_channel_id");
        String strM14517u = c7622f.m14517u("gcm.n.link_android");
        strM14517u = TextUtils.isEmpty(strM14517u) ? c7622f.m14517u("gcm.n.link") : strM14517u;
        if (!TextUtils.isEmpty(strM14517u)) {
            Uri.parse(strM14517u);
        }
        c7622f.m14517u("gcm.n.image");
        c7622f.m14517u("gcm.n.ticker");
        c7622f.m14511b("gcm.n.notification_priority");
        c7622f.m14511b("gcm.n.visibility");
        c7622f.m14511b("gcm.n.notification_count");
        c7622f.m14510a("gcm.n.sticky");
        c7622f.m14510a("gcm.n.local_only");
        c7622f.m14510a("gcm.n.default_sound");
        c7622f.m14510a("gcm.n.default_vibrate_timings");
        c7622f.m14510a("gcm.n.default_light_settings");
        String strM14517u2 = c7622f.m14517u("gcm.n.event_time");
        if (!TextUtils.isEmpty(strM14517u2)) {
            try {
                Long.parseLong(strM14517u2);
            } catch (NumberFormatException unused) {
                C7622f.m14508A("gcm.n.event_time");
            }
        }
        c7622f.m14513o();
        c7622f.m14518v();
    }

    public C8083i(C6118k c6118k, String str) {
        this.f38707a = c6118k;
        this.f38708b = str;
    }
}

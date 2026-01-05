package p001o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C10773c;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes5.dex */
public final class srb {

    /* renamed from: a */
    public static final srb f45832a;

    /* renamed from: b */
    public static final String f45833b;

    /* renamed from: c */
    public static final List f45834c;

    /* renamed from: d */
    public static final List f45835d;

    /* renamed from: e */
    public static final Map f45836e;

    /* renamed from: f */
    public static final AtomicBoolean f45837f;

    /* renamed from: g */
    public static final Integer[] f45838g;

    /* renamed from: o.srb$a */
    public static final class C16898a extends AbstractC16902e {
        @Override // p001o.srb.AbstractC16902e
        /* renamed from: c */
        public /* bridge */ /* synthetic */ String mo48804c() {
            return (String) m48806g();
        }

        @Override // p001o.srb.AbstractC16902e
        /* renamed from: d */
        public String mo48805d() {
            return "com.facebook.arstudio.player";
        }

        /* renamed from: g */
        public Void m48806g() {
            return null;
        }
    }

    /* renamed from: o.srb$b */
    public static final class C16899b extends AbstractC16902e {
        @Override // p001o.srb.AbstractC16902e
        /* renamed from: c */
        public String mo48804c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // p001o.srb.AbstractC16902e
        /* renamed from: d */
        public String mo48805d() {
            return "com.instagram.android";
        }

        @Override // p001o.srb.AbstractC16902e
        /* renamed from: e */
        public String mo48807e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* renamed from: o.srb$c */
    public static final class C16900c extends AbstractC16902e {
        @Override // p001o.srb.AbstractC16902e
        /* renamed from: c */
        public String mo48804c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // p001o.srb.AbstractC16902e
        /* renamed from: d */
        public String mo48805d() {
            return "com.facebook.katana";
        }

        @Override // p001o.srb.AbstractC16902e
        /* renamed from: f */
        public void mo48808f() {
            if (m48809g()) {
                srb.m48780c();
            }
        }

        /* renamed from: g */
        public final boolean m48809g() {
            return C10773c.m13019l().getApplicationInfo().targetSdkVersion >= 30;
        }
    }

    /* renamed from: o.srb$d */
    public static final class C16901d extends AbstractC16902e {
        @Override // p001o.srb.AbstractC16902e
        /* renamed from: c */
        public /* bridge */ /* synthetic */ String mo48804c() {
            return (String) m48810g();
        }

        @Override // p001o.srb.AbstractC16902e
        /* renamed from: d */
        public String mo48805d() {
            return "com.facebook.orca";
        }

        /* renamed from: g */
        public Void m48810g() {
            return null;
        }
    }

    /* renamed from: o.srb$e */
    public static abstract class AbstractC16902e {

        /* renamed from: a */
        public TreeSet f45839a;

        /* JADX WARN: Removed duplicated region for block: B:13:0x0016 A[Catch: all -> 0x0031, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:14:0x001e, B:16:0x0022, B:21:0x002c, B:13:0x0016), top: B:27:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x002c A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x000b, B:14:0x001e, B:16:0x0022, B:21:0x002c, B:13:0x0016), top: B:27:0x0005 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized void m48811a(boolean z) {
            TreeSet treeSet;
            boolean z2 = true;
            if (!z) {
                TreeSet treeSet2 = this.f45839a;
                if (treeSet2 == null) {
                    this.f45839a = srb.m48779b(srb.f45832a, this);
                    treeSet = this.f45839a;
                    if (treeSet != null && !treeSet.isEmpty()) {
                        z2 = false;
                    }
                    if (z2) {
                        mo48808f();
                    }
                } else {
                    if (!((treeSet2 == null || treeSet2.isEmpty()) ? false : true)) {
                    }
                    treeSet = this.f45839a;
                    if (treeSet != null) {
                        z2 = false;
                    }
                    if (z2) {
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final TreeSet m48812b() {
            TreeSet treeSet = this.f45839a;
            if (treeSet == null) {
                m48811a(false);
            } else {
                if (!((treeSet == null || treeSet.isEmpty()) ? false : true)) {
                }
            }
            return this.f45839a;
        }

        /* renamed from: c */
        public abstract String mo48804c();

        /* renamed from: d */
        public abstract String mo48805d();

        /* renamed from: e */
        public String mo48807e() {
            return "id_token,token,signed_request,graph_domain";
        }

        /* renamed from: f */
        public void mo48808f() {
        }
    }

    /* renamed from: o.srb$f */
    public static final class C16903f {

        /* renamed from: c */
        public static final a f45840c = new a(null);

        /* renamed from: a */
        public AbstractC16902e f45841a;

        /* renamed from: b */
        public int f45842b;

        /* renamed from: o.srb$f$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final C16903f m48816a(AbstractC16902e abstractC16902e, int i) {
                C16903f c16903f = new C16903f(null);
                c16903f.f45841a = abstractC16902e;
                c16903f.f45842b = i;
                return c16903f;
            }

            /* renamed from: b */
            public final C16903f m48817b() {
                C16903f c16903f = new C16903f(null);
                c16903f.f45842b = -1;
                return c16903f;
            }
        }

        public C16903f() {
        }

        public /* synthetic */ C16903f(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public final int m48815c() {
            return this.f45842b;
        }
    }

    /* renamed from: o.srb$g */
    public static final class C16904g extends AbstractC16902e {
        @Override // p001o.srb.AbstractC16902e
        /* renamed from: c */
        public String mo48804c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // p001o.srb.AbstractC16902e
        /* renamed from: d */
        public String mo48805d() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        srb srbVar = new srb();
        f45832a = srbVar;
        f45833b = srb.class.getName();
        f45834c = srbVar.m48799f();
        f45835d = srbVar.m48798e();
        f45836e = srbVar.m48797d();
        f45837f = new AtomicBoolean(false);
        f45838g = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    /* renamed from: A */
    public static final void m48775A() {
        if (a94.m16694d(srb.class)) {
            return;
        }
        try {
            try {
                Iterator it = f45834c.iterator();
                while (it.hasNext()) {
                    ((AbstractC16902e) it.next()).m48811a(true);
                }
            } finally {
                f45837f.set(false);
            }
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
        }
    }

    /* renamed from: B */
    public static final Intent m48776B(Context context, Intent intent, AbstractC16902e abstractC16902e) {
        ResolveInfo resolveInfoResolveActivity;
        if (a94.m16694d(srb.class)) {
            return null;
        }
        try {
            sq8.m48649h(context, "context");
            if (intent == null || (resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            sq8.m48648g(str, "resolveInfo.activityInfo.packageName");
            if (js6.m34454a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* renamed from: C */
    public static final Intent m48777C(Context context, Intent intent, AbstractC16902e abstractC16902e) {
        ResolveInfo resolveInfoResolveService;
        if (a94.m16694d(srb.class)) {
            return null;
        }
        try {
            sq8.m48649h(context, "context");
            if (intent == null || (resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            String str = resolveInfoResolveService.serviceInfo.packageName;
            sq8.m48648g(str, "resolveInfo.serviceInfo.packageName");
            if (js6.m34454a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ TreeSet m48779b(srb srbVar, AbstractC16902e abstractC16902e) {
        if (a94.m16694d(srb.class)) {
            return null;
        }
        try {
            return srbVar.m48802o(abstractC16902e);
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ String m48780c() {
        if (a94.m16694d(srb.class)) {
            return null;
        }
        try {
            return f45833b;
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* renamed from: h */
    public static final int m48781h(TreeSet treeSet, int i, int[] iArr) {
        if (a94.m16694d(srb.class)) {
            return 0;
        }
        try {
            sq8.m48649h(iArr, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = iArr.length - 1;
            Iterator itDescendingIterator = treeSet.descendingIterator();
            int iMax = -1;
            while (itDescendingIterator.hasNext()) {
                Integer num = (Integer) itDescendingIterator.next();
                sq8.m48648g(num, "fbAppVersion");
                iMax = Math.max(iMax, num.intValue());
                while (length >= 0 && iArr[length] > num.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == num.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(iMax, i);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return 0;
        }
    }

    /* renamed from: i */
    public static final Bundle m48782i(ur6 ur6Var) {
        if (a94.m16694d(srb.class) || ur6Var == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", ur6Var.toString());
            if (ur6Var instanceof wr6) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* renamed from: j */
    public static final Intent m48783j(Context context, String str, Collection collection, String str2, boolean z, boolean z2, za5 za5Var, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5) {
        if (a94.m16694d(srb.class)) {
            return null;
        }
        try {
            sq8.m48649h(context, "context");
            sq8.m48649h(str, "applicationId");
            sq8.m48649h(collection, "permissions");
            sq8.m48649h(str2, "e2e");
            sq8.m48649h(za5Var, "defaultAudience");
            sq8.m48649h(str3, "clientState");
            sq8.m48649h(str4, "authType");
            C16899b c16899b = new C16899b();
            return m48776B(context, f45832a.m48801k(c16899b, str, collection, str2, z2, za5Var, str3, str4, false, str5, z3, xka.INSTAGRAM, z4, z5, "", null, null), c16899b);
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Intent, java.lang.String] */
    /* renamed from: l */
    public static final Intent m48784l(Context context) {
        if (a94.m16694d(srb.class)) {
            return null;
        }
        try {
            sq8.m48649h(context, "context");
            for (AbstractC16902e abstractC16902e : f45834c) {
                Intent intentM48777C = m48777C(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(abstractC16902e.mo48805d()).getElementName(), abstractC16902e);
                if (intentM48777C != null) {
                    return intentM48777C;
                }
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* renamed from: m */
    public static final Intent m48785m(Intent intent, Bundle bundle, ur6 ur6Var) {
        if (a94.m16694d(srb.class)) {
            return null;
        }
        try {
            sq8.m48649h(intent, "requestIntent");
            UUID uuidM48788q = m48788q(intent);
            if (uuidM48788q == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m48793w(intent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", uuidM48788q.toString());
            if (ur6Var != null) {
                bundle2.putBundle(Constants.IPC_BUNDLE_KEY_SEND_ERROR, m48782i(ur6Var));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* renamed from: n */
    public static final List m48786n(Context context, String str, Collection collection, String str2, boolean z, boolean z2, za5 za5Var, String str3, String str4, boolean z3, String str5, boolean z4, boolean z5, boolean z6, String str6, String str7, String str8) {
        if (a94.m16694d(srb.class)) {
            return null;
        }
        try {
            sq8.m48649h(str, "applicationId");
            sq8.m48649h(collection, "permissions");
            sq8.m48649h(str2, "e2e");
            sq8.m48649h(za5Var, "defaultAudience");
            sq8.m48649h(str3, "clientState");
            sq8.m48649h(str4, "authType");
            List list = f45834c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                Intent intentM48801k = f45832a.m48801k((AbstractC16902e) it.next(), str, collection, str2, z2, za5Var, str3, str4, z3, str5, z4, xka.FACEBOOK, z5, z6, str6, str7, str8);
                if (intentM48801k != null) {
                    arrayList2.add(intentM48801k);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* renamed from: p */
    public static final Bundle m48787p(Intent intent) {
        if (a94.m16694d(srb.class)) {
            return null;
        }
        try {
            sq8.m48649h(intent, "intent");
            if (m48795y(m48793w(intent))) {
                return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* renamed from: q */
    public static final UUID m48788q(Intent intent) {
        String stringExtra;
        if (a94.m16694d(srb.class) || intent == null) {
            return null;
        }
        try {
            if (m48795y(m48793w(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra == null) {
                return null;
            }
            try {
                return UUID.fromString(stringExtra);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* renamed from: r */
    public static final ur6 m48789r(Bundle bundle) {
        if (a94.m16694d(srb.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !e9g.m24606x(string, "UserCanceled", true)) ? new ur6(string2) : new wr6(string2);
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* renamed from: t */
    public static final int m48790t(int i) {
        if (a94.m16694d(srb.class)) {
            return 0;
        }
        try {
            return f45832a.m48803s(f45834c, new int[]{i}).m48815c();
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return 0;
        }
    }

    /* renamed from: u */
    public static final int m48791u() {
        if (a94.m16694d(srb.class)) {
            return 0;
        }
        try {
            return f45838g[0].intValue();
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return 0;
        }
    }

    /* renamed from: v */
    public static final Bundle m48792v(Intent intent) {
        if (a94.m16694d(srb.class)) {
            return null;
        }
        try {
            sq8.m48649h(intent, "intent");
            return !m48795y(m48793w(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return null;
        }
    }

    /* renamed from: w */
    public static final int m48793w(Intent intent) {
        if (a94.m16694d(srb.class)) {
            return 0;
        }
        try {
            sq8.m48649h(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return 0;
        }
    }

    /* renamed from: x */
    public static final boolean m48794x(Intent intent) {
        if (a94.m16694d(srb.class)) {
            return false;
        }
        try {
            sq8.m48649h(intent, "resultIntent");
            Bundle bundleM48787p = m48787p(intent);
            return bundleM48787p != null ? bundleM48787p.containsKey(Constants.IPC_BUNDLE_KEY_SEND_ERROR) : intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return false;
        }
    }

    /* renamed from: y */
    public static final boolean m48795y(int i) {
        if (a94.m16694d(srb.class)) {
            return false;
        }
        try {
            return gp0.m29251R(f45838g, Integer.valueOf(i)) && i >= 20140701;
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
            return false;
        }
    }

    /* renamed from: z */
    public static final void m48796z() {
        if (a94.m16694d(srb.class)) {
            return;
        }
        try {
            if (f45837f.compareAndSet(false, true)) {
                C10773c.m13028u().execute(new Runnable() { // from class: o.rrb
                    @Override // java.lang.Runnable
                    public final void run() {
                        srb.m48775A();
                    }
                });
            }
        } catch (Throwable th) {
            a94.m16692b(th, srb.class);
        }
    }

    /* renamed from: d */
    public final Map m48797d() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C16901d());
            List list = f45834c;
            map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            map.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            map.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.CAMERA_EFFECT", f45835d);
            map.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return map;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: e */
    public final List m48798e() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            ArrayList arrayListM21242g = ch3.m21242g(new C16898a());
            arrayListM21242g.addAll(m48799f());
            return arrayListM21242g;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: f */
    public final List m48799f() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return ch3.m21242g(new C16900c(), new C16904g());
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: g */
    public final Uri m48800g(AbstractC16902e abstractC16902e) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            Uri uri = Uri.parse("content://" + abstractC16902e.mo48805d() + ".provider.PlatformProvider/versions");
            sq8.m48648g(uri, "parse(CONTENT_SCHEME + a…ATFORM_PROVIDER_VERSIONS)");
            return uri;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: k */
    public final Intent m48801k(AbstractC16902e abstractC16902e, String str, Collection collection, String str2, boolean z, za5 za5Var, String str3, String str4, boolean z2, String str5, boolean z3, xka xkaVar, boolean z4, boolean z5, String str6, String str7, String str8) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            String strMo48804c = abstractC16902e.mo48804c();
            if (strMo48804c == null) {
                return null;
            }
            Intent intentPutExtra = new Intent().setClassName(abstractC16902e.mo48805d(), strMo48804c).putExtra("client_id", str);
            sq8.m48648g(intentPutExtra, "Intent()\n            .se…PP_ID_KEY, applicationId)");
            intentPutExtra.putExtra("facebook_sdk_version", C10773c.m12989C());
            if (!cri.e0(collection)) {
                intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!cri.d0(str2)) {
                intentPutExtra.putExtra("e2e", str2);
            }
            intentPutExtra.putExtra("state", str3);
            intentPutExtra.putExtra("response_type", abstractC16902e.mo48807e());
            intentPutExtra.putExtra("nonce", str6);
            intentPutExtra.putExtra("return_scopes", "true");
            if (z) {
                intentPutExtra.putExtra("default_audience", za5Var.getNativeProtocolAudience());
            }
            intentPutExtra.putExtra("legacy_override", C10773c.m13031x());
            intentPutExtra.putExtra("auth_type", str4);
            if (z2) {
                intentPutExtra.putExtra("fail_on_logged_out", true);
            }
            intentPutExtra.putExtra("messenger_page_id", str5);
            intentPutExtra.putExtra("reset_messenger_state", z3);
            if (z4) {
                intentPutExtra.putExtra("fx_app", xkaVar.toString());
            }
            if (z5) {
                intentPutExtra.putExtra("skip_dedupe", true);
            }
            return intentPutExtra;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: o */
    public final TreeSet m48802o(AbstractC16902e abstractC16902e) {
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = C10773c.m13019l().getContentResolver();
            String[] strArr = {ClientCookie.VERSION_ATTR};
            Uri uriM48800g = m48800g(abstractC16902e);
            try {
                try {
                    providerInfoResolveContentProvider = C10773c.m13019l().getPackageManager().resolveContentProvider(abstractC16902e.mo48805d() + ".provider.PlatformProvider", 0);
                } catch (RuntimeException unused) {
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        cursorQuery = contentResolver.query(uriM48800g, strArr, null, null, null);
                    } catch (IllegalArgumentException | NullPointerException | SecurityException unused2) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex(ClientCookie.VERSION_ATTR))));
                            } catch (Throwable th) {
                                cursor = cursorQuery;
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
            }
        } catch (Throwable th3) {
            a94.m16692b(th3, this);
            return null;
        }
    }

    /* renamed from: s */
    public final C16903f m48803s(List list, int[] iArr) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            m48796z();
            if (list == null) {
                return C16903f.f45840c.m48817b();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC16902e abstractC16902e = (AbstractC16902e) it.next();
                int iM48781h = m48781h(abstractC16902e.m48812b(), m48791u(), iArr);
                if (iM48781h != -1) {
                    return C16903f.f45840c.m48816a(abstractC16902e, iM48781h);
                }
            }
            return C16903f.f45840c.m48817b();
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }
}

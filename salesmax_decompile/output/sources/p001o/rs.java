package p001o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import p001o.os;

/* loaded from: classes2.dex */
public class rs extends os {

    /* renamed from: a */
    public static final C16655a f43993a = new C16655a(null);

    /* renamed from: o.rs$a */
    public static final class C16655a {
        public C16655a() {
        }

        public /* synthetic */ C16655a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ResolveInfo m47121a(Context context) {
            sq8.m48649h(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        /* renamed from: b */
        public final ResolveInfo m47122b(Context context) {
            sq8.m48649h(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        /* renamed from: c */
        public final String m47123c(InterfaceC16658d interfaceC16658d) {
            sq8.m48649h(interfaceC16658d, "input");
            if (interfaceC16658d instanceof C16657c) {
                return "image/*";
            }
            if (interfaceC16658d instanceof C16656b) {
                return null;
            }
            throw new szb();
        }

        /* renamed from: d */
        public final boolean m47124d(Context context) {
            sq8.m48649h(context, "context");
            return m47121a(context) != null;
        }

        /* renamed from: e */
        public final boolean m47125e(Context context) {
            sq8.m48649h(context, "context");
            return m47122b(context) != null;
        }

        /* renamed from: f */
        public final boolean m47126f() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                return true;
            }
            return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }
    }

    /* renamed from: o.rs$b */
    public static final class C16656b implements InterfaceC16658d {

        /* renamed from: a */
        public static final C16656b f43994a = new C16656b();
    }

    /* renamed from: o.rs$c */
    public static final class C16657c implements InterfaceC16658d {

        /* renamed from: a */
        public static final C16657c f43995a = new C16657c();
    }

    /* renamed from: o.rs$d */
    public interface InterfaceC16658d {
    }

    @Override // p001o.os
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo6230a(Context context, q7d q7dVar) {
        Intent intent;
        sq8.m48649h(context, "context");
        sq8.m48649h(q7dVar, "input");
        C16655a c16655a = f43993a;
        if (c16655a.m47126f()) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(c16655a.m47123c(q7dVar.m44932a()));
            return intent2;
        }
        if (c16655a.m47125e(context)) {
            ResolveInfo resolveInfoM47122b = c16655a.m47122b(context);
            if (resolveInfoM47122b == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ActivityInfo activityInfo = resolveInfoM47122b.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent.setType(c16655a.m47123c(q7dVar.m44932a()));
        } else {
            if (!c16655a.m47124d(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(c16655a.m47123c(q7dVar.m44932a()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            ResolveInfo resolveInfoM47121a = c16655a.m47121a(context);
            if (resolveInfoM47121a == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ActivityInfo activityInfo2 = resolveInfoM47121a.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent.setType(c16655a.m47123c(q7dVar.m44932a()));
        }
        return intent;
    }

    @Override // p001o.os
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final os.C15882a mo42610b(Context context, q7d q7dVar) {
        sq8.m48649h(context, "context");
        sq8.m48649h(q7dVar, "input");
        return null;
    }

    @Override // p001o.os
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Uri mo6231c(int i, Intent intent) {
        if (!(i == -1)) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) kh3.h0(ps.f40465a.m44101a(intent));
        }
        return data;
    }
}

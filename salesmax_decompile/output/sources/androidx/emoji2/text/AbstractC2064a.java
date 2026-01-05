package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.C2066c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p001o.fgd;
import p001o.ub7;

/* renamed from: androidx.emoji2.text.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2064a {

    /* renamed from: androidx.emoji2.text.a$a */
    public static class a {

        /* renamed from: a */
        public final b f7256a;

        public a(b bVar) {
            this.f7256a = bVar == null ? m6049e() : bVar;
        }

        /* renamed from: e */
        public static b m6049e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new c();
        }

        /* renamed from: a */
        public final C2066c.c m6050a(Context context, ub7 ub7Var) {
            if (ub7Var == null) {
                return null;
            }
            return new C2068e(context, ub7Var);
        }

        /* renamed from: b */
        public final List m6051b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: c */
        public C2066c.c m6052c(Context context) {
            return m6050a(context, m6056h(context));
        }

        /* renamed from: d */
        public final ub7 m6053d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new ub7(str, str2, "emojicompat-emoji-font", m6051b(this.f7256a.mo6058b(packageManager, str2)));
        }

        /* renamed from: f */
        public final boolean m6054f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        /* renamed from: g */
        public final ProviderInfo m6055g(PackageManager packageManager) {
            Iterator it = this.f7256a.mo6059c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfoMo6057a = this.f7256a.mo6057a((ResolveInfo) it.next());
                if (m6054f(providerInfoMo6057a)) {
                    return providerInfoMo6057a;
                }
            }
            return null;
        }

        /* renamed from: h */
        public ub7 m6056h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            fgd.m26664h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo providerInfoM6055g = m6055g(packageManager);
            if (providerInfoM6055g == null) {
                return null;
            }
            try {
                return m6053d(providerInfoM6055g, packageManager);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.a$b */
    public static class b {
        /* renamed from: a */
        public abstract ProviderInfo mo6057a(ResolveInfo resolveInfo);

        /* renamed from: b */
        public Signature[] mo6058b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: c */
        public abstract List mo6059c(PackageManager packageManager, Intent intent, int i);
    }

    /* renamed from: androidx.emoji2.text.a$c */
    public static class c extends b {
        @Override // androidx.emoji2.text.AbstractC2064a.b
        /* renamed from: a */
        public ProviderInfo mo6057a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.AbstractC2064a.b
        /* renamed from: c */
        public List mo6059c(PackageManager packageManager, Intent intent, int i) {
            return packageManager.queryIntentContentProviders(intent, i);
        }
    }

    /* renamed from: androidx.emoji2.text.a$d */
    public static class d extends c {
        @Override // androidx.emoji2.text.AbstractC2064a.b
        /* renamed from: b */
        public Signature[] mo6058b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: a */
    public static C2068e m6048a(Context context) {
        return (C2068e) new a(null).m6052c(context);
    }
}

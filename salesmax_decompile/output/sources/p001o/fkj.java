package p001o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes3.dex */
public final class fkj {

    /* renamed from: e */
    public static final sjj f23567e = new sjj("AppUpdateService");

    /* renamed from: f */
    public static final Intent f23568f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public rkj f23569a;

    /* renamed from: b */
    public final String f23570b;

    /* renamed from: c */
    public final Context f23571c;

    /* renamed from: d */
    public final kkj f23572d;

    public fkj(Context context, kkj kkjVar) {
        this.f23570b = context.getPackageName();
        this.f23571c = context;
        this.f23572d = kkjVar;
        if (thj.m49901a(context)) {
            this.f23569a = new rkj(vkj.m52903a(context), f23567e, "AppUpdateService", f23568f, rjj.f43722a, null);
        }
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Bundle m26973b(fkj fkjVar, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        bundle.putAll(m26977g());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(fkjVar.f23571c.getPackageManager().getPackageInfo(fkjVar.f23571c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f23567e.m48396a("The current version of the app could not be retrieved", new Object[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ bn0 m26974d(fkj fkjVar, Bundle bundle, String str) {
        int i = bundle.getInt("version.code", -1);
        int i2 = bundle.getInt("update.availability");
        int i3 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        int i4 = bundle.getInt("in.app.update.priority", 0);
        long j = bundle.getLong("bytes.downloaded");
        long j2 = bundle.getLong("total.bytes.to.download");
        long j3 = bundle.getLong("additional.size.required");
        long jM35822a = fkjVar.f23572d.m35822a();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        map.put("blocking.destructive.intent", m26979i(bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        map.put("nonblocking.destructive.intent", m26979i(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        map.put("blocking.intent", m26979i(bundle.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        map.put("nonblocking.intent", m26979i(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return bn0.m19393e(str, i, i2, i3, numValueOf, i4, j, j2, j3, jM35822a, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    /* renamed from: g */
    public static Bundle m26977g() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map mapM25161a = ejj.m25161a("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) mapM25161a.get("java")).intValue());
        if (mapM25161a.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) mapM25161a.get("native")).intValue());
        }
        if (mapM25161a.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) mapM25161a.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    /* renamed from: h */
    public static Task m26978h() {
        f23567e.m48396a("onError(%d)", -9);
        return Tasks.forException(new yj8(-9));
    }

    /* renamed from: i */
    public static HashSet m26979i(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    /* renamed from: c */
    public final Task m26980c(String str) {
        if (this.f23569a == null) {
            return m26978h();
        }
        f23567e.m48398c("requestUpdateInfo(%s)", str);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f23569a.m46894s(new tjj(this, taskCompletionSource, str, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}

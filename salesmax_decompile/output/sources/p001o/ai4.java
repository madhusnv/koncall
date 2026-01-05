package p001o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C10773c;
import com.facebook.login.C10826a;
import java.util.ArrayList;
import p001o.gi4;

/* loaded from: classes5.dex */
public class ai4 {

    /* renamed from: b */
    public static final C12180a f14771b = new C12180a(null);

    /* renamed from: a */
    public Uri f14772a;

    /* renamed from: o.ai4$a */
    public static final class C12180a {
        public C12180a() {
        }

        public /* synthetic */ C12180a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public Uri m17141a(String str, Bundle bundle) {
            sq8.m48649h(str, "action");
            return cri.m21662g(cgf.m21201b(), C10773c.m13031x() + "/dialog/" + str, bundle);
        }
    }

    public ai4(String str, Bundle bundle) {
        sq8.m48649h(str, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        en7[] en7VarArrValues = en7.values();
        ArrayList arrayList = new ArrayList(en7VarArrValues.length);
        for (en7 en7Var : en7VarArrValues) {
            arrayList.add(en7Var.getRawValue());
        }
        this.f14772a = arrayList.contains(str) ? cri.m21662g(cgf.m21206g(), "/dialog/" + str, bundle) : f14771b.m17141a(str, bundle);
    }

    /* renamed from: a */
    public final boolean m17139a(Activity activity, String str) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            sq8.m48649h(activity, "activity");
            gi4 gi4VarM28790a = new gi4.C13739a(C10826a.f11635a.m13356b()).m28790a();
            gi4VarM28790a.f25267a.setPackage(str);
            try {
                gi4VarM28790a.m28789a(activity, this.f14772a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: b */
    public final void m17140b(Uri uri) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(uri, "<set-?>");
            this.f14772a = uri;
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}

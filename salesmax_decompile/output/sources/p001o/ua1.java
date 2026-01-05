package p001o;

import android.os.Bundle;
import com.facebook.C10773c;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes5.dex */
public final class ua1 {

    /* renamed from: b */
    public static boolean f48632b;

    /* renamed from: a */
    public static final ua1 f48631a = new ua1();

    /* renamed from: c */
    public static HashSet f48633c = new HashSet();

    /* renamed from: a */
    public static final void m51267a() {
        if (a94.m16694d(ua1.class)) {
            return;
        }
        try {
            if (f48632b) {
                return;
            }
            f48631a.m51269b();
            f48632b = !f48633c.isEmpty();
        } catch (Throwable th) {
            a94.m16692b(th, ua1.class);
        }
    }

    /* renamed from: d */
    public static final void m51268d(Bundle bundle) {
        if (a94.m16694d(ua1.class)) {
            return;
        }
        try {
            if (f48632b && bundle != null) {
                Iterator it = f48633c.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, ua1.class);
        }
    }

    /* renamed from: b */
    public final void m51269b() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            tt6 tt6VarM56803u = xt6.m56803u(C10773c.m13020m(), false);
            if (tt6VarM56803u == null) {
                return;
            }
            f48633c = m51270c(tt6VarM56803u.m50535b());
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: c */
    public final HashSet m51270c(JSONArray jSONArray) {
        HashSet hashSet;
        try {
            if (a94.m16694d(this)) {
                return null;
            }
            try {
                hashSet = cri.m21666m(jSONArray);
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
            } catch (Exception unused) {
                hashSet = new HashSet();
            }
            return hashSet;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }
}

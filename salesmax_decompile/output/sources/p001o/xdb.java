package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class xdb {

    /* renamed from: d */
    public static final C18119a f53550d = new C18119a(null);

    /* renamed from: e */
    public static final Set f53551e = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final String f53552a;

    /* renamed from: b */
    public final String f53553b;

    /* renamed from: c */
    public final List f53554c;

    /* renamed from: o.xdb$a */
    public static final class C18119a {
        public C18119a() {
        }

        public /* synthetic */ C18119a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m56085a(JSONObject jSONObject) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("k");
                    String strOptString2 = jSONObjectOptJSONObject.optString("v");
                    sq8.m48648g(strOptString, "k");
                    if (!(strOptString.length() == 0)) {
                        Set setM56081a = xdb.m56081a();
                        sq8.m48648g(next, TransferTable.COLUMN_KEY);
                        List listD0 = f9g.D0(strOptString, new String[]{","}, false, 0, 6, null);
                        sq8.m48648g(strOptString2, "v");
                        setM56081a.add(new xdb(next, listD0, strOptString2, null));
                    }
                }
            }
        }

        /* renamed from: b */
        public final Set m56086b() {
            HashSet hashSet = new HashSet();
            Iterator it = xdb.m56081a().iterator();
            while (it.hasNext()) {
                hashSet.add(((xdb) it.next()).m56083c());
            }
            return hashSet;
        }

        /* renamed from: c */
        public final Set m56087c() {
            return new HashSet(xdb.m56081a());
        }

        /* renamed from: d */
        public final void m56088d(String str) {
            sq8.m48649h(str, "rulesFromServer");
            try {
                xdb.m56081a().clear();
                m56085a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
    }

    public /* synthetic */ xdb(String str, List list, String str2, id5 id5Var) {
        this(str, list, str2);
    }

    /* renamed from: a */
    public static final /* synthetic */ Set m56081a() {
        if (a94.m16694d(xdb.class)) {
            return null;
        }
        try {
            return f53551e;
        } catch (Throwable th) {
            a94.m16692b(th, xdb.class);
            return null;
        }
    }

    /* renamed from: b */
    public final List m56082b() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f53554c);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public final String m56083c() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return this.f53552a;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final String m56084d() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return this.f53553b;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    public xdb(String str, List list, String str2) {
        this.f53552a = str;
        this.f53553b = str2;
        this.f53554c = list;
    }
}

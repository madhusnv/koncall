package p001o;

import android.util.Log;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class sja {

    /* renamed from: e */
    public static final C16851a f45482e = new C16851a(null);

    /* renamed from: f */
    public static final HashMap f45483f = new HashMap();

    /* renamed from: a */
    public final bka f45484a;

    /* renamed from: b */
    public final String f45485b;

    /* renamed from: c */
    public StringBuilder f45486c;

    /* renamed from: d */
    public int f45487d;

    /* renamed from: o.sja$a */
    public static final class C16851a {
        public C16851a() {
        }

        public /* synthetic */ C16851a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m48386a(bka bkaVar, int i, String str, String str2) {
            sq8.m48649h(bkaVar, "behavior");
            sq8.m48649h(str, "tag");
            sq8.m48649h(str2, "string");
            if (C10773c.m12995I(bkaVar)) {
                String strM48391f = m48391f(str2);
                if (!e9g.m24597K(str, "FacebookSDK.", false, 2, null)) {
                    str = "FacebookSDK." + str;
                }
                Log.println(i, str, strM48391f);
                if (bkaVar == bka.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        /* renamed from: b */
        public final void m48387b(bka bkaVar, String str, String str2) {
            sq8.m48649h(bkaVar, "behavior");
            sq8.m48649h(str, "tag");
            sq8.m48649h(str2, "string");
            m48386a(bkaVar, 3, str, str2);
        }

        /* renamed from: c */
        public final void m48388c(bka bkaVar, String str, String str2, Object... objArr) {
            sq8.m48649h(bkaVar, "behavior");
            sq8.m48649h(str, "tag");
            sq8.m48649h(str2, "format");
            sq8.m48649h(objArr, "args");
            if (C10773c.m12995I(bkaVar)) {
                h8g h8gVar = h8g.f26398a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str3 = String.format(str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                sq8.m48648g(str3, "format(format, *args)");
                m48386a(bkaVar, 3, str, str3);
            }
        }

        /* renamed from: d */
        public final synchronized void m48389d(String str) {
            sq8.m48649h(str, "accessToken");
            if (!C10773c.m12995I(bka.INCLUDE_ACCESS_TOKENS)) {
                m48390e(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        /* renamed from: e */
        public final synchronized void m48390e(String str, String str2) {
            sq8.m48649h(str, "original");
            sq8.m48649h(str2, "replace");
            sja.f45483f.put(str, str2);
        }

        /* renamed from: f */
        public final synchronized String m48391f(String str) {
            String strM24593G;
            strM24593G = str;
            for (Map.Entry entry : sja.f45483f.entrySet()) {
                strM24593G = e9g.m24593G(strM24593G, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return strM24593G;
        }
    }

    public sja(bka bkaVar, String str) {
        sq8.m48649h(bkaVar, "behavior");
        sq8.m48649h(str, "tag");
        this.f45487d = 3;
        this.f45484a = bkaVar;
        this.f45485b = "FacebookSDK." + rri.m47116k(str, "tag");
        this.f45486c = new StringBuilder();
    }

    /* renamed from: b */
    public final void m48380b(String str) {
        sq8.m48649h(str, "string");
        if (m48385g()) {
            this.f45486c.append(str);
        }
    }

    /* renamed from: c */
    public final void m48381c(String str, Object... objArr) {
        sq8.m48649h(str, "format");
        sq8.m48649h(objArr, "args");
        if (m48385g()) {
            StringBuilder sb = this.f45486c;
            h8g h8gVar = h8g.f26398a;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            sq8.m48648g(str2, "format(format, *args)");
            sb.append(str2);
        }
    }

    /* renamed from: d */
    public final void m48382d(String str, Object obj) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
        m48381c("  %s:\t%s\n", str, obj);
    }

    /* renamed from: e */
    public final void m48383e() {
        String string = this.f45486c.toString();
        sq8.m48648g(string, "contents.toString()");
        m48384f(string);
        this.f45486c = new StringBuilder();
    }

    /* renamed from: f */
    public final void m48384f(String str) {
        sq8.m48649h(str, "string");
        f45482e.m48386a(this.f45484a, this.f45487d, this.f45485b, str);
    }

    /* renamed from: g */
    public final boolean m48385g() {
        return C10773c.m12995I(this.f45484a);
    }
}

package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.messaging.Constants;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class mj6 {

    /* renamed from: d */
    public static final C15340a f35541d = new C15340a(null);

    /* renamed from: a */
    public String f35542a;

    /* renamed from: b */
    public String f35543b;

    /* renamed from: c */
    public Long f35544c;

    /* renamed from: o.mj6$a */
    public static final class C15340a {
        public C15340a() {
        }

        public /* synthetic */ C15340a(id5 id5Var) {
            this();
        }
    }

    public mj6(String str) {
        this.f35544c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f35543b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l = this.f35544c;
        sq8.m48647f(l, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(l.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        sq8.m48648g(string, "StringBuffer()\n         …)\n            .toString()");
        this.f35542a = string;
    }

    /* renamed from: a */
    public final void m39179a() {
        tk8.m50109d(this.f35542a);
    }

    /* renamed from: b */
    public final int m39180b(mj6 mj6Var) {
        sq8.m48649h(mj6Var, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Long l = this.f35544c;
        if (l == null) {
            return -1;
        }
        long jLongValue = l.longValue();
        Long l2 = mj6Var.f35544c;
        if (l2 != null) {
            return sq8.m48652k(l2.longValue(), jLongValue);
        }
        return 1;
    }

    /* renamed from: c */
    public final JSONObject m39181c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f35544c;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.f35543b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final boolean m39182d() {
        return (this.f35543b == null || this.f35544c == null) ? false : true;
    }

    /* renamed from: e */
    public final void m39183e() {
        if (m39182d()) {
            tk8.m50125t(this.f35542a, toString());
        }
    }

    public String toString() throws JSONException {
        JSONObject jSONObjectM39181c = m39181c();
        if (jSONObjectM39181c == null) {
            return super.toString();
        }
        String string = jSONObjectM39181c.toString();
        sq8.m48648g(string, "params.toString()");
        return string;
    }

    public mj6(File file) {
        sq8.m48649h(file, TransferTable.COLUMN_FILE);
        String name = file.getName();
        sq8.m48648g(name, "file.name");
        this.f35542a = name;
        JSONObject jSONObjectM50123r = tk8.m50123r(name, true);
        if (jSONObjectM50123r != null) {
            this.f35544c = Long.valueOf(jSONObjectM50123r.optLong("timestamp", 0L));
            this.f35543b = jSONObjectM50123r.optString("error_message", null);
        }
    }
}

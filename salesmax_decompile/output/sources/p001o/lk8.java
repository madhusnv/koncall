package p001o;

import android.os.Build;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.messaging.Constants;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class lk8 {

    /* renamed from: h */
    public static final C15094b f33949h = new C15094b(null);

    /* renamed from: a */
    public String f33950a;

    /* renamed from: b */
    public EnumC15095c f33951b;

    /* renamed from: c */
    public JSONArray f33952c;

    /* renamed from: d */
    public String f33953d;

    /* renamed from: e */
    public String f33954e;

    /* renamed from: f */
    public String f33955f;

    /* renamed from: g */
    public Long f33956g;

    /* renamed from: o.lk8$a */
    public static final class C15093a {

        /* renamed from: a */
        public static final C15093a f33957a = new C15093a();

        /* renamed from: a */
        public static final lk8 m37384a(String str, String str2) {
            return new lk8(str, str2, (id5) null);
        }

        /* renamed from: b */
        public static final lk8 m37385b(Throwable th, EnumC15095c enumC15095c) {
            sq8.m48649h(enumC15095c, "t");
            return new lk8(th, enumC15095c, (id5) null);
        }

        /* renamed from: c */
        public static final lk8 m37386c(JSONArray jSONArray) {
            sq8.m48649h(jSONArray, "features");
            return new lk8(jSONArray, (id5) null);
        }

        /* renamed from: d */
        public static final lk8 m37387d(File file) {
            sq8.m48649h(file, TransferTable.COLUMN_FILE);
            return new lk8(file, (id5) null);
        }
    }

    /* renamed from: o.lk8$b */
    public static final class C15094b {
        public C15094b() {
        }

        public /* synthetic */ C15094b(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final EnumC15095c m37389b(String str) {
            return e9g.m24597K(str, "crash_log_", false, 2, null) ? EnumC15095c.CrashReport : e9g.m24597K(str, "shield_log_", false, 2, null) ? EnumC15095c.CrashShield : e9g.m24597K(str, "thread_check_log_", false, 2, null) ? EnumC15095c.ThreadCheck : e9g.m24597K(str, "analysis_log_", false, 2, null) ? EnumC15095c.Analysis : e9g.m24597K(str, "anr_log_", false, 2, null) ? EnumC15095c.AnrReport : EnumC15095c.Unknown;
        }
    }

    /* renamed from: o.lk8$c */
    public enum EnumC15095c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* renamed from: o.lk8$c$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f33958a;

            static {
                int[] iArr = new int[EnumC15095c.values().length];
                try {
                    iArr[EnumC15095c.Analysis.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC15095c.AnrReport.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC15095c.CrashReport.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC15095c.CrashShield.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC15095c.ThreadCheck.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f33958a = iArr;
            }
        }

        public final String getLogPrefix() {
            int i = a.f33958a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = a.f33958a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown" : "ThreadCheck" : "CrashShield" : "CrashReport" : "AnrReport" : "Analysis";
        }
    }

    /* renamed from: o.lk8$d */
    public /* synthetic */ class C15096d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33959a;

        static {
            int[] iArr = new int[EnumC15095c.values().length];
            try {
                iArr[EnumC15095c.Analysis.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15095c.AnrReport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC15095c.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC15095c.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC15095c.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f33959a = iArr;
        }
    }

    public /* synthetic */ lk8(File file, id5 id5Var) {
        this(file);
    }

    /* renamed from: a */
    public final void m37377a() {
        tk8.m50109d(this.f33950a);
    }

    /* renamed from: b */
    public final int m37378b(lk8 lk8Var) {
        sq8.m48649h(lk8Var, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Long l = this.f33956g;
        if (l == null) {
            return -1;
        }
        long jLongValue = l.longValue();
        Long l2 = lk8Var.f33956g;
        if (l2 != null) {
            return sq8.m48652k(l2.longValue(), jLongValue);
        }
        return 1;
    }

    /* renamed from: c */
    public final JSONObject m37379c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f33952c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l = this.f33956g;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final JSONObject m37380d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f33953d;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l = this.f33956g;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.f33954e;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f33955f;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            EnumC15095c enumC15095c = this.f33951b;
            if (enumC15095c != null) {
                jSONObject.put("type", enumC15095c);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final JSONObject m37381e() {
        EnumC15095c enumC15095c = this.f33951b;
        int i = enumC15095c == null ? -1 : C15096d.f33959a[enumC15095c.ordinal()];
        if (i == 1) {
            return m37379c();
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return m37380d();
        }
        return null;
    }

    /* renamed from: f */
    public final boolean m37382f() {
        EnumC15095c enumC15095c = this.f33951b;
        int i = enumC15095c == null ? -1 : C15096d.f33959a[enumC15095c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if ((i != 3 && i != 4 && i != 5) || this.f33955f == null || this.f33956g == null) {
                    return false;
                }
            } else if (this.f33955f == null || this.f33954e == null || this.f33956g == null) {
                return false;
            }
        } else if (this.f33952c == null || this.f33956g == null) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m37383g() {
        if (m37382f()) {
            tk8.m50125t(this.f33950a, toString());
        }
    }

    public String toString() {
        JSONObject jSONObjectM37381e = m37381e();
        if (jSONObjectM37381e == null) {
            String string = new JSONObject().toString();
            sq8.m48648g(string, "JSONObject().toString()");
            return string;
        }
        String string2 = jSONObjectM37381e.toString();
        sq8.m48648g(string2, "params.toString()");
        return string2;
    }

    public /* synthetic */ lk8(String str, String str2, id5 id5Var) {
        this(str, str2);
    }

    public /* synthetic */ lk8(Throwable th, EnumC15095c enumC15095c, id5 id5Var) {
        this(th, enumC15095c);
    }

    public /* synthetic */ lk8(JSONArray jSONArray, id5 id5Var) {
        this(jSONArray);
    }

    public lk8(JSONArray jSONArray) {
        this.f33951b = EnumC15095c.Analysis;
        this.f33956g = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f33952c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.f33956g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        sq8.m48648g(string, "StringBuffer()\n         …)\n            .toString()");
        this.f33950a = string;
    }

    public lk8(Throwable th, EnumC15095c enumC15095c) {
        this.f33951b = enumC15095c;
        this.f33953d = cri.m21675w();
        this.f33954e = tk8.m50110e(th);
        this.f33955f = tk8.m50113h(th);
        this.f33956g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(enumC15095c.getLogPrefix());
        stringBuffer.append(String.valueOf(this.f33956g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        sq8.m48648g(string, "StringBuffer().append(t.…ppend(\".json\").toString()");
        this.f33950a = string;
    }

    public lk8(String str, String str2) {
        this.f33951b = EnumC15095c.AnrReport;
        this.f33953d = cri.m21675w();
        this.f33954e = str;
        this.f33955f = str2;
        this.f33956g = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.f33956g));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        sq8.m48648g(string, "StringBuffer()\n         …)\n            .toString()");
        this.f33950a = string;
    }

    public lk8(File file) {
        String name = file.getName();
        sq8.m48648g(name, "file.name");
        this.f33950a = name;
        this.f33951b = f33949h.m37389b(name);
        JSONObject jSONObjectM50123r = tk8.m50123r(this.f33950a, true);
        if (jSONObjectM50123r != null) {
            this.f33956g = Long.valueOf(jSONObjectM50123r.optLong("timestamp", 0L));
            this.f33953d = jSONObjectM50123r.optString("app_version", null);
            this.f33954e = jSONObjectM50123r.optString("reason", null);
            this.f33955f = jSONObjectM50123r.optString("callstack", null);
            this.f33952c = jSONObjectM50123r.optJSONArray("feature_names");
        }
    }
}

package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class i91 {

    /* renamed from: a */
    public static final Set f28266a = nif.m40668i('!', '$', '%', '&', '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~');

    /* renamed from: a */
    public static final kl6 m31756a(f9d f9dVar) {
        String strMo26798i = f9dVar.mo26798i("AWS_EXECUTION_ENV");
        if (strMo26798i != null) {
            return new kl6(strMo26798i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m31757b(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == ' ') {
                sb.append("_");
            } else if ('a' <= cCharAt && cCharAt < '{') {
                sb.append(cCharAt);
            } else if (!('A' <= cCharAt && cCharAt < '[')) {
                if (('0' <= cCharAt && cCharAt < ':') || f28266a.contains(Character.valueOf(cCharAt))) {
                }
            }
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* renamed from: c */
    public static final f91 m31758c(r9d r9dVar, ji0 ji0Var, String str) {
        sq8.m48649h(r9dVar, "platform");
        sq8.m48649h(ji0Var, "apiMeta");
        s7f s7fVar = new s7f("kotlin", ji0Var.m33844a());
        odc odcVarMo26793a = r9dVar.mo26793a();
        pfc pfcVar = new pfc(odcVarMo26793a.m42086a(), odcVarMo26793a.m42087b());
        vg9 vg9VarM29981e = h91.m29981e();
        if (str == null && (str = r9dVar.mo26796e("aws.userAgentAppId")) == null) {
            str = r9dVar.mo26798i("AWS_SDK_UA_APP_ID");
        }
        return new f91(s7fVar, ji0Var, pfcVar, vg9VarM29981e, m31756a(r9dVar), ik7.f28780c.m32244a(r9dVar), str, zi4.f57243c.m59486a(r9dVar));
    }

    /* renamed from: d */
    public static final String m31759d(String str, String str2, String str3) {
        sq8.m48649h(str, "category");
        sq8.m48649h(str2, TransferTable.COLUMN_KEY);
        if (str3 == null) {
            return m31757b(str) + '/' + m31757b(str2);
        }
        return m31757b(str) + '/' + m31757b(str2) + '#' + m31757b(str3);
    }

    /* renamed from: e */
    public static /* synthetic */ String m31760e(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return m31759d(str, str2, str3);
    }
}

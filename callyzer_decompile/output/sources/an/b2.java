package an;

import android.os.Bundle;
import bt.C0768m;
import com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import com.amplifyframework.core.Consumer;
import ex.InterfaceC2139c;
import fs.C2371b;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4166x;
import l7.C4409i;
import og.re;
import q7.C6138e;
import rw.C6668r;
import yv.C8800o;
import zm.EnumC8991a;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f647a;

    /* renamed from: b */
    public final /* synthetic */ Object f648b;

    /* renamed from: c */
    public final /* synthetic */ Object f649c;

    /* renamed from: d */
    public final /* synthetic */ Object f650d;

    /* renamed from: e */
    public final /* synthetic */ Object f651e;

    /* renamed from: f */
    public final /* synthetic */ Object f652f;

    public /* synthetic */ b2(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, String str, AuthConfirmSignInOptions authConfirmSignInOptions, Consumer consumer, Consumer consumer2) {
        this.f647a = 2;
        this.f650d = realAWSCognitoAuthPlugin;
        this.f649c = str;
        this.f648b = authConfirmSignInOptions;
        this.f651e = consumer;
        this.f652f = consumer2;
    }

    /* renamed from: a */
    private final Object m440a(Object obj) throws Exception {
        String strM16212u;
        EnumC8991a callLogSyncStatus = (EnumC8991a) this.f648b;
        String str = (String) this.f649c;
        String str2 = (String) this.f650d;
        LocalDateTime localDateTime = (LocalDateTime) this.f651e;
        EnumC8994d enumC8994d = (EnumC8994d) this.f652f;
        InterfaceC4024a _connection = (InterfaceC4024a) obj;
        AbstractC4154l.m8923f(_connection, "_connection");
        InterfaceC4026c interfaceC4026cY0 = _connection.y0("UPDATE CallLog SET call_log_sync_status = call_log_sync_status & (~?) WHERE phone_number = ? AND sim_number = ? AND date_time = ? AND call_type = ?");
        try {
            AbstractC4154l.m8923f(callLogSyncStatus, "callLogSyncStatus");
            interfaceC4026cY0.mo1778g(1, callLogSyncStatus.getValue());
            interfaceC4026cY0.mo1776B(2, str);
            interfaceC4026cY0.mo1776B(3, str2);
            if (localDateTime != null) {
                C8800o c8800o = C8800o.f42459a;
                strM16212u = C8800o.m16212u(localDateTime);
            } else {
                strM16212u = null;
            }
            if (strM16212u == null) {
                interfaceC4026cY0.mo1779i(4);
            } else {
                interfaceC4026cY0.mo1776B(4, strM16212u);
            }
            if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                interfaceC4026cY0.mo1779i(5);
            } else {
                interfaceC4026cY0.mo1778g(5, r0.intValue());
            }
            interfaceC4026cY0.r0();
            int iM10878b = re.m10878b(_connection);
            interfaceC4026cY0.close();
            return Integer.valueOf(iM10878b);
        } catch (Throwable th2) {
            interfaceC4026cY0.close();
            throw th2;
        }
    }

    /* renamed from: b */
    private final Object m441b(Object obj) {
        List listSubList;
        C4164v c4164v = (C4164v) this.f649c;
        ArrayList arrayList = (ArrayList) this.f650d;
        C4166x c4166x = (C4166x) this.f648b;
        C6138e c6138e = (C6138e) this.f651e;
        Bundle bundle = (Bundle) this.f652f;
        C4409i entry = (C4409i) obj;
        AbstractC4154l.m8923f(entry, "entry");
        c4164v.f21160a = true;
        int iIndexOf = arrayList.indexOf(entry);
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            listSubList = arrayList.subList(c4166x.f21162a, i10);
            c4166x.f21162a = i10;
        } else {
            listSubList = C6668r.f31943a;
        }
        c6138e.m12167a(entry.f22046b, bundle, entry, listSubList);
        return qw.a0.f30746a;
    }

    /* renamed from: d */
    private final Object m442d(Object obj) {
        CharSequence charSequenceSubSequence;
        String str = (String) this.f649c;
        String str2 = (String) this.f650d;
        k2.w0 w0Var = (k2.w0) this.f648b;
        k2.w0 w0Var2 = (k2.w0) this.f651e;
        k2.w0 w0Var3 = (k2.w0) this.f652f;
        g4.l0 layout = (g4.l0) obj;
        AbstractC4154l.m8923f(layout, "layout");
        if (!((Boolean) w0Var.getValue()).booleanValue() && !((Boolean) w0Var2.getValue()).booleanValue()) {
            if (layout.m6446d()) {
                int iM6470c = layout.f13671b.m6470c(1, false) - (str.length() + 4);
                if (iM6470c < 0) {
                    iM6470c = 0;
                }
                int length = str2.length();
                if (iM6470c > length) {
                    iM6470c = length;
                }
                String strSubstring = str2.substring(0, iM6470c);
                AbstractC4154l.m8922e(strSubstring, "substring(...)");
                int length2 = strSubstring.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i10 = length2 - 1;
                        if (!og.d2.m10603f(strSubstring.charAt(length2))) {
                            charSequenceSubSequence = strSubstring.subSequence(0, length2 + 1);
                            break;
                        }
                        if (i10 < 0) {
                            break;
                        }
                        length2 = i10;
                    }
                    charSequenceSubSequence = "";
                    w0Var3.setValue(charSequenceSubSequence.toString());
                } else {
                    charSequenceSubSequence = "";
                    w0Var3.setValue(charSequenceSubSequence.toString());
                }
            }
            w0Var2.setValue(Boolean.TRUE);
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a6b A[Catch: all -> 0x092c, TryCatch #0 {all -> 0x092c, blocks: (B:47:0x085a, B:49:0x0910, B:54:0x0925, B:58:0x0931, B:60:0x0948, B:62:0x095f, B:63:0x0962, B:64:0x0969, B:69:0x097a, B:71:0x0983, B:75:0x0992, B:79:0x09a1, B:83:0x09b0, B:87:0x09bf, B:91:0x09ce, B:95:0x09da, B:100:0x09e8, B:102:0x09f3, B:107:0x0a09, B:133:0x0a63, B:138:0x0a71, B:141:0x0a7e, B:146:0x0a92, B:151:0x0aa8, B:150:0x0a9d, B:145:0x0a8b, B:152:0x0ac1, B:153:0x0ac8, B:136:0x0a6b, B:129:0x0a55, B:131:0x0a5c, B:124:0x0a48, B:126:0x0a4f, B:119:0x0a3b, B:121:0x0a42, B:113:0x0a2a, B:115:0x0a31, B:110:0x0a1e, B:106:0x0a02, B:98:0x09e2, B:90:0x09c8, B:86:0x09b9, B:82:0x09aa, B:78:0x099b, B:74:0x098c, B:67:0x0974, B:52:0x091f), top: B:159:0x085a }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0a71 A[Catch: all -> 0x092c, TryCatch #0 {all -> 0x092c, blocks: (B:47:0x085a, B:49:0x0910, B:54:0x0925, B:58:0x0931, B:60:0x0948, B:62:0x095f, B:63:0x0962, B:64:0x0969, B:69:0x097a, B:71:0x0983, B:75:0x0992, B:79:0x09a1, B:83:0x09b0, B:87:0x09bf, B:91:0x09ce, B:95:0x09da, B:100:0x09e8, B:102:0x09f3, B:107:0x0a09, B:133:0x0a63, B:138:0x0a71, B:141:0x0a7e, B:146:0x0a92, B:151:0x0aa8, B:150:0x0a9d, B:145:0x0a8b, B:152:0x0ac1, B:153:0x0ac8, B:136:0x0a6b, B:129:0x0a55, B:131:0x0a5c, B:124:0x0a48, B:126:0x0a4f, B:119:0x0a3b, B:121:0x0a42, B:113:0x0a2a, B:115:0x0a31, B:110:0x0a1e, B:106:0x0a02, B:98:0x09e2, B:90:0x09c8, B:86:0x09b9, B:82:0x09aa, B:78:0x099b, B:74:0x098c, B:67:0x0974, B:52:0x091f), top: B:159:0x085a }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0a7e A[Catch: all -> 0x092c, TryCatch #0 {all -> 0x092c, blocks: (B:47:0x085a, B:49:0x0910, B:54:0x0925, B:58:0x0931, B:60:0x0948, B:62:0x095f, B:63:0x0962, B:64:0x0969, B:69:0x097a, B:71:0x0983, B:75:0x0992, B:79:0x09a1, B:83:0x09b0, B:87:0x09bf, B:91:0x09ce, B:95:0x09da, B:100:0x09e8, B:102:0x09f3, B:107:0x0a09, B:133:0x0a63, B:138:0x0a71, B:141:0x0a7e, B:146:0x0a92, B:151:0x0aa8, B:150:0x0a9d, B:145:0x0a8b, B:152:0x0ac1, B:153:0x0ac8, B:136:0x0a6b, B:129:0x0a55, B:131:0x0a5c, B:124:0x0a48, B:126:0x0a4f, B:119:0x0a3b, B:121:0x0a42, B:113:0x0a2a, B:115:0x0a31, B:110:0x0a1e, B:106:0x0a02, B:98:0x09e2, B:90:0x09c8, B:86:0x09b9, B:82:0x09aa, B:78:0x099b, B:74:0x098c, B:67:0x0974, B:52:0x091f), top: B:159:0x085a }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0ac1 A[Catch: all -> 0x092c, TryCatch #0 {all -> 0x092c, blocks: (B:47:0x085a, B:49:0x0910, B:54:0x0925, B:58:0x0931, B:60:0x0948, B:62:0x095f, B:63:0x0962, B:64:0x0969, B:69:0x097a, B:71:0x0983, B:75:0x0992, B:79:0x09a1, B:83:0x09b0, B:87:0x09bf, B:91:0x09ce, B:95:0x09da, B:100:0x09e8, B:102:0x09f3, B:107:0x0a09, B:133:0x0a63, B:138:0x0a71, B:141:0x0a7e, B:146:0x0a92, B:151:0x0aa8, B:150:0x0a9d, B:145:0x0a8b, B:152:0x0ac1, B:153:0x0ac8, B:136:0x0a6b, B:129:0x0a55, B:131:0x0a5c, B:124:0x0a48, B:126:0x0a4f, B:119:0x0a3b, B:121:0x0a42, B:113:0x0a2a, B:115:0x0a31, B:110:0x0a1e, B:106:0x0a02, B:98:0x09e2, B:90:0x09c8, B:86:0x09b9, B:82:0x09aa, B:78:0x099b, B:74:0x098c, B:67:0x0974, B:52:0x091f), top: B:159:0x085a }] */
    @Override // ex.InterfaceC2139c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r49) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 2788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: an.b2.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ b2(C2371b c2371b, C0768m c0768m, String str, k2.w0 w0Var, k2.w0 w0Var2) {
        this.f647a = 3;
        this.f650d = c2371b;
        this.f648b = c0768m;
        this.f649c = str;
        this.f651e = w0Var;
        this.f652f = w0Var2;
    }

    public /* synthetic */ b2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f647a = i10;
        this.f649c = obj;
        this.f650d = obj2;
        this.f648b = obj3;
        this.f651e = obj4;
        this.f652f = obj5;
    }

    public /* synthetic */ b2(String str, EnumC8991a enumC8991a, String str2, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.f647a = 0;
        this.f649c = str;
        this.f648b = enumC8991a;
        this.f650d = str2;
        this.f651e = localDateTime;
        this.f652f = localDateTime2;
    }

    public /* synthetic */ b2(EnumC8991a enumC8991a, String str, String str2, LocalDateTime localDateTime, EnumC8994d enumC8994d) {
        this.f647a = 1;
        this.f648b = enumC8991a;
        this.f649c = str;
        this.f650d = str2;
        this.f651e = localDateTime;
        this.f652f = enumC8994d;
    }
}

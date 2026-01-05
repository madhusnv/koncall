package p001o;

import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginCreateCredentialResponse;
import android.service.credentials.CallingAppInfo;
import p001o.lg1;
import p001o.mg1;

/* loaded from: classes2.dex */
public abstract class jg1 {

    /* renamed from: a */
    public static final C14525a f30379a = new C14525a(null);

    /* renamed from: o.jg1$a */
    public static final class C14525a {
        public C14525a() {
        }

        public /* synthetic */ C14525a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final BeginCreateCredentialResponse m33785a(cg1 cg1Var) {
            sq8.m48649h(cg1Var, "response");
            dg1.m22997a();
            throw null;
        }

        /* renamed from: b */
        public final bg1 m33786b(BeginCreateCredentialRequest beginCreateCredentialRequest) {
            k32 k32Var;
            k32 k32Var2;
            k32 k32Var3;
            sq8.m48649h(beginCreateCredentialRequest, "request");
            k32 k32Var4 = null;
            try {
                String type2 = beginCreateCredentialRequest.getType();
                int iHashCode = type2.hashCode();
                if (iHashCode != -543568185) {
                    if (iHashCode == -95037569 && type2.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        mg1.C15310a c15310a = mg1.f35368g;
                        Bundle data = beginCreateCredentialRequest.getData();
                        sq8.m48648g(data, "request.data");
                        CallingAppInfo callingAppInfo = beginCreateCredentialRequest.getCallingAppInfo();
                        if (callingAppInfo != null) {
                            String packageName = callingAppInfo.getPackageName();
                            sq8.m48648g(packageName, "it.packageName");
                            SigningInfo signingInfo = callingAppInfo.getSigningInfo();
                            sq8.m48648g(signingInfo, "it.signingInfo");
                            k32Var3 = new k32(packageName, signingInfo, callingAppInfo.getOrigin());
                        } else {
                            k32Var3 = null;
                        }
                        return c15310a.m38961a(data, k32Var3);
                    }
                } else if (type2.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    lg1.C15069a c15069a = lg1.f33742e;
                    Bundle data2 = beginCreateCredentialRequest.getData();
                    sq8.m48648g(data2, "request.data");
                    CallingAppInfo callingAppInfo2 = beginCreateCredentialRequest.getCallingAppInfo();
                    if (callingAppInfo2 != null) {
                        String packageName2 = callingAppInfo2.getPackageName();
                        sq8.m48648g(packageName2, "it.packageName");
                        SigningInfo signingInfo2 = callingAppInfo2.getSigningInfo();
                        sq8.m48648g(signingInfo2, "it.signingInfo");
                        k32Var = new k32(packageName2, signingInfo2, callingAppInfo2.getOrigin());
                    } else {
                        k32Var = null;
                    }
                    return c15069a.m37138a(data2, k32Var);
                }
                String type3 = beginCreateCredentialRequest.getType();
                sq8.m48648g(type3, "request.type");
                Bundle data3 = beginCreateCredentialRequest.getData();
                sq8.m48648g(data3, "request.data");
                CallingAppInfo callingAppInfo3 = beginCreateCredentialRequest.getCallingAppInfo();
                if (callingAppInfo3 != null) {
                    String packageName3 = callingAppInfo3.getPackageName();
                    sq8.m48648g(packageName3, "it.packageName");
                    SigningInfo signingInfo3 = callingAppInfo3.getSigningInfo();
                    sq8.m48648g(signingInfo3, "it.signingInfo");
                    k32Var2 = new k32(packageName3, signingInfo3, callingAppInfo3.getOrigin());
                } else {
                    k32Var2 = null;
                }
                return new kg1(type3, data3, k32Var2);
            } catch (yj7 unused) {
                String type4 = beginCreateCredentialRequest.getType();
                sq8.m48648g(type4, "request.type");
                Bundle data4 = beginCreateCredentialRequest.getData();
                sq8.m48648g(data4, "request.data");
                CallingAppInfo callingAppInfo4 = beginCreateCredentialRequest.getCallingAppInfo();
                if (callingAppInfo4 != null) {
                    String packageName4 = callingAppInfo4.getPackageName();
                    sq8.m48648g(packageName4, "it.packageName");
                    SigningInfo signingInfo4 = callingAppInfo4.getSigningInfo();
                    sq8.m48648g(signingInfo4, "it.signingInfo");
                    k32Var4 = new k32(packageName4, signingInfo4, callingAppInfo4.getOrigin());
                }
                return new kg1(type4, data4, k32Var4);
            }
        }
    }
}

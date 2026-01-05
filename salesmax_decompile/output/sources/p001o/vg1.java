package p001o;

import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CallingAppInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.ng1;

/* loaded from: classes2.dex */
public abstract class vg1 {

    /* renamed from: a */
    public static final C17573a f50293a = new C17573a(null);

    /* renamed from: o.vg1$a */
    public static final class C17573a {
        public C17573a() {
        }

        public /* synthetic */ C17573a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final BeginGetCredentialResponse m52733a(pg1 pg1Var) {
            sq8.m48649h(pg1Var, "response");
            new BeginGetCredentialResponse.Builder();
            throw null;
        }

        /* renamed from: b */
        public final og1 m52734b(BeginGetCredentialRequest beginGetCredentialRequest) {
            k32 k32Var;
            sq8.m48649h(beginGetCredentialRequest, "request");
            ArrayList arrayList = new ArrayList();
            List beginGetCredentialOptions = beginGetCredentialRequest.getBeginGetCredentialOptions();
            sq8.m48648g(beginGetCredentialOptions, "request.beginGetCredentialOptions");
            Iterator it = beginGetCredentialOptions.iterator();
            while (it.hasNext()) {
                BeginGetCredentialOption beginGetCredentialOptionM46687a = rg1.m46687a(it.next());
                ng1.C15578a c15578a = ng1.f36805d;
                String id = beginGetCredentialOptionM46687a.getId();
                sq8.m48648g(id, "it.id");
                String type2 = beginGetCredentialOptionM46687a.getType();
                sq8.m48648g(type2, "it.type");
                Bundle candidateQueryData = beginGetCredentialOptionM46687a.getCandidateQueryData();
                sq8.m48648g(candidateQueryData, "it.candidateQueryData");
                arrayList.add(c15578a.m40527a(id, type2, candidateQueryData));
            }
            CallingAppInfo callingAppInfo = beginGetCredentialRequest.getCallingAppInfo();
            if (callingAppInfo != null) {
                String packageName = callingAppInfo.getPackageName();
                sq8.m48648g(packageName, "it.packageName");
                SigningInfo signingInfo = callingAppInfo.getSigningInfo();
                sq8.m48648g(signingInfo, "it.signingInfo");
                k32Var = new k32(packageName, signingInfo, callingAppInfo.getOrigin());
            } else {
                k32Var = null;
            }
            return new og1(arrayList, k32Var);
        }
    }
}

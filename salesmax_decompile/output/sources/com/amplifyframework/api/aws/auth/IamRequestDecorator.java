package com.amplifyframework.api.aws.auth;

import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.aws.auth.IamRequestDecorator;
import com.amplifyframework.api.aws.sigv4.AWS4Signer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p001o.ek5;
import p001o.f48;
import p001o.l8i;
import p001o.m18;
import p001o.o38;
import p001o.p8i;
import p001o.qc4;
import p001o.rl1;
import p001o.ule;
import p001o.ux7;
import p001o.xk7;
import p001o.xle;
import p001o.xx7;
import p001o.y38;
import p001o.y3i;
import p001o.y9b;

/* loaded from: classes5.dex */
public class IamRequestDecorator implements RequestDecorator {
    private static final String DEFAULT_CONTENT_TYPE = "application/json";
    private final qc4 credentialsProvider;
    private final String serviceName;
    private final AWS4Signer v4Signer;

    public IamRequestDecorator(AWS4Signer aWS4Signer, qc4 qc4Var, String str) {
        this.v4Signer = aWS4Signer;
        this.credentialsProvider = qc4Var;
        this.serviceName = str;
    }

    private byte[] getBytes(xle xleVar) throws ApiException.ApiAuthException, IOException {
        if (xleVar == null) {
            return "".getBytes();
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                rl1 rl1Var = new rl1();
                xleVar.mo18955i(rl1Var);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = rl1Var.o3().read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (IOException e) {
            throw new ApiException.ApiAuthException("Unable to calculate SigV4 signature for the request", e, "Check your application logs for details.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y3i lambda$decorate$0(ule uleVar, xx7 xx7Var) {
        for (String str : uleVar.m51735f().m55330n()) {
            xx7Var.m59810r(str, uleVar.m51734e(str));
        }
        xx7Var.m59810r("Host", uleVar.m51741l().m53888t().getHost());
        return null;
    }

    @Override // com.amplifyframework.api.aws.auth.RequestDecorator
    public final ule decorate(final ule uleVar) throws ApiException.ApiAuthException, IOException {
        byte[] bytes = getBytes(uleVar.m51730a());
        y38 y38Var = (y38) this.v4Signer.signBlocking(f48.m26051a(o38.Companion.m41496a(uleVar.m51737h()), l8i.f33466k.m36798l(uleVar.m51741l().m53887s().toString(), p8i.f39606b.m43192a()), ux7.f49593b.m52100b(new xk7() { // from class: o.pa8
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return IamRequestDecorator.lambda$decorate$0(uleVar, (xx7) obj);
            }
        }), m18.Companion.m38178a(bytes), ek5.f21784a.m25185a()), this.credentialsProvider, this.serviceName).m16689a();
        ule.C17397a c17397a = new ule.C17397a();
        String str = DEFAULT_CONTENT_TYPE;
        for (Map.Entry entry : y38Var.getHeaders().mo17772b()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) ((List) entry.getValue()).get(0);
            c17397a.m51745a(str2, str3);
            if ("content-type".equalsIgnoreCase(str2)) {
                str = str3;
            }
        }
        y9b y9bVarM57397g = y9b.m57397g(str);
        if (y9bVarM57397g == null) {
            y9bVarM57397g = y9b.m57397g(DEFAULT_CONTENT_TYPE);
        }
        c17397a.m51744B(uleVar.m51741l());
        c17397a.m51759p(uleVar.m51737h(), uleVar.m51730a() == null ? null : xle.m56456f(bytes, y9bVarM57397g));
        return c17397a.m51746b();
    }
}

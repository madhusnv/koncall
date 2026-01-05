package com.google.api;

import p001o.fbj;
import p001o.qp6;
import p001o.wm5;
import p001o.wn7;
import p001o.xm5;

/* loaded from: classes3.dex */
public final class ClientProto {
    public static final int DEFAULT_HOST_FIELD_NUMBER = 1049;
    public static final int METHOD_SIGNATURE_FIELD_NUMBER = 1051;
    public static final int OAUTH_SCOPES_FIELD_NUMBER = 1050;
    public static final wn7.C17939f defaultHost;
    public static final wn7.C17939f methodSignature;
    public static final wn7.C17939f oauthScopes;

    static {
        wm5 wm5VarM54704i = wm5.m54704i();
        fbj.EnumC13396b enumC13396b = fbj.EnumC13396b.STRING;
        methodSignature = wn7.newRepeatedGeneratedExtension(wm5VarM54704i, null, null, METHOD_SIGNATURE_FIELD_NUMBER, enumC13396b, false, String.class);
        defaultHost = wn7.newSingularGeneratedExtension(xm5.m56472i(), "", null, null, DEFAULT_HOST_FIELD_NUMBER, enumC13396b, String.class);
        oauthScopes = wn7.newSingularGeneratedExtension(xm5.m56472i(), "", null, null, OAUTH_SCOPES_FIELD_NUMBER, enumC13396b, String.class);
    }

    private ClientProto() {
    }

    public static void registerAllExtensions(qp6 qp6Var) {
        qp6Var.m45751a(methodSignature);
        qp6Var.m45751a(defaultHost);
        qp6Var.m45751a(oauthScopes);
    }
}

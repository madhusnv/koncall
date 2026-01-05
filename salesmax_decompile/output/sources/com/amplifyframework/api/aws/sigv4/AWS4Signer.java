package com.amplifyframework.api.aws.sigv4;

import com.google.android.gms.cast.MediaTrack;
import p001o.a91;
import p001o.cc5;
import p001o.h84;
import p001o.ic4;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nb8;
import p001o.nl7;
import p001o.o64;
import p001o.qc4;
import p001o.qm1;
import p001o.sq8;
import p001o.u81;
import p001o.uq8;
import p001o.v81;
import p001o.wre;
import p001o.y38;
import p001o.y3i;
import p001o.z81;

/* loaded from: classes5.dex */
public abstract class AWS4Signer {
    private u81 awsSignedBodyHeaderType;
    private final String regionName;

    @l75(m36647c = "com.amplifyframework.api.aws.sigv4.AWS4Signer", m36648f = "AWS4Signer.kt", m36649l = {46, 49}, m36650m = MediaTrack.ROLE_SIGN)
    /* renamed from: com.amplifyframework.api.aws.sigv4.AWS4Signer$sign$1 */
    public static final class C103141 extends o64 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C103141(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWS4Signer.this.sign(null, null, null, this);
        }
    }

    @l75(m36647c = "com.amplifyframework.api.aws.sigv4.AWS4Signer$signBlocking$1", m36648f = "AWS4Signer.kt", m36649l = {62}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.api.aws.sigv4.AWS4Signer$signBlocking$1 */
    public static final class C103151 extends jgg implements nl7 {
        final /* synthetic */ qc4 $credentialsProvider;
        final /* synthetic */ y38 $httpRequest;
        final /* synthetic */ String $serviceName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103151(y38 y38Var, qc4 qc4Var, String str, n64 n64Var) {
            super(2, n64Var);
            this.$httpRequest = y38Var;
            this.$credentialsProvider = qc4Var;
            this.$serviceName = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return AWS4Signer.this.new C103151(this.$httpRequest, this.$credentialsProvider, this.$serviceName, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                AWS4Signer aWS4Signer = AWS4Signer.this;
                y38 y38Var = this.$httpRequest;
                qc4 qc4Var = this.$credentialsProvider;
                String str = this.$serviceName;
                this.label = 1;
                obj = aWS4Signer.sign(y38Var, qc4Var, str, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C103151) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public AWS4Signer(String str) {
        sq8.m48649h(str, "regionName");
        this.regionName = str;
        this.awsSignedBodyHeaderType = u81.NONE;
    }

    public final u81 getAwsSignedBodyHeaderType() {
        return this.awsSignedBodyHeaderType;
    }

    public final void setAwsSignedBodyHeaderType(u81 u81Var) {
        sq8.m48649h(u81Var, "<set-?>");
        this.awsSignedBodyHeaderType = u81Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sign(y38 y38Var, qc4 qc4Var, String str, n64 n64Var) {
        C103141 c103141;
        AWS4Signer aWS4Signer;
        y38 y38Var2;
        z81.C18572a c18572a;
        z81.C18572a c18572a2;
        z81.C18572a c18572a3;
        if (n64Var instanceof C103141) {
            c103141 = (C103141) n64Var;
            int i = c103141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103141.label = i - Integer.MIN_VALUE;
            } else {
                c103141 = new C103141(n64Var);
            }
        }
        Object objMo18582c = c103141.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c103141.label;
        if (i2 == 0) {
            wre.m54934b(objMo18582c);
            z81.C18573b c18573b = z81.f56654o;
            z81.C18572a c18572a4 = new z81.C18572a();
            c18572a4.m58923x(this.regionName);
            c18572a4.m58900D(true);
            c18572a4.m58924y(str);
            c103141.L$0 = this;
            c103141.L$1 = y38Var;
            c103141.L$2 = c18572a4;
            c103141.L$3 = c18572a4;
            c103141.L$4 = c18572a4;
            c103141.label = 1;
            Object objM40285a = nb8.C15534a.m40285a(qc4Var, null, c103141, 1, null);
            if (objM40285a == objM51918f) {
                return objM51918f;
            }
            aWS4Signer = this;
            y38Var2 = y38Var;
            c18572a = c18572a4;
            c18572a2 = c18572a;
            objMo18582c = objM40285a;
            c18572a3 = c18572a2;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    wre.m54934b(objMo18582c);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c18572a = (z81.C18572a) c103141.L$4;
            c18572a3 = (z81.C18572a) c103141.L$3;
            c18572a2 = (z81.C18572a) c103141.L$2;
            y38Var2 = (y38) c103141.L$1;
            aWS4Signer = (AWS4Signer) c103141.L$0;
            wre.m54934b(objMo18582c);
        }
        c18572a.m58917r((ic4) objMo18582c);
        c18572a3.m58898B(aWS4Signer.awsSignedBodyHeaderType);
        z81 z81VarM58901b = c18572a2.m58901b();
        v81 v81VarM20837c = cc5.m20837c();
        c103141.L$0 = null;
        c103141.L$1 = null;
        c103141.L$2 = null;
        c103141.L$3 = null;
        c103141.L$4 = null;
        c103141.label = 2;
        objMo18582c = v81VarM20837c.mo18582c(y38Var2, z81VarM58901b, c103141);
        return objMo18582c == objM51918f ? objM51918f : objMo18582c;
    }

    public final a91 signBlocking(y38 y38Var, qc4 qc4Var, String str) {
        sq8.m48649h(y38Var, "httpRequest");
        sq8.m48649h(qc4Var, "credentialsProvider");
        sq8.m48649h(str, "serviceName");
        return (a91) qm1.m45641b(null, new C103151(y38Var, qc4Var, str, null), 1, null);
    }
}

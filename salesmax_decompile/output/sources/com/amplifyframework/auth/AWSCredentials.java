package com.amplifyframework.auth;

import p001o.gk8;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public class AWSCredentials {
    public static final Factory Factory = new Factory(null);
    private final String accessKeyId;
    private final String secretAccessKey;

    public static final class Factory {
        private Factory() {
        }

        public /* synthetic */ Factory(id5 id5Var) {
            this();
        }

        public final AWSCredentials createAWSCredentials(String str, String str2, String str3, Long l) {
            if (str == null || str2 == null) {
                return null;
            }
            return (str3 == null || l == null) ? new AWSCredentials(str, str2) : new AWSTemporaryCredentials(str, str2, str3, gk8.C13769a.m28957c(gk8.f25374b, l.longValue(), 0, 2, null));
        }
    }

    public AWSCredentials(String str, String str2) {
        sq8.m48649h(str, "accessKeyId");
        sq8.m48649h(str2, "secretAccessKey");
        this.accessKeyId = str;
        this.secretAccessKey = str2;
    }

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }
}

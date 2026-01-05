package com.amplifyframework.auth;

import j$.time.format.DateTimeFormatter;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import td.C7124a;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AWSCredentials {
    public static final Factory Factory = new Factory(null);
    private final String accessKeyId;
    private final String secretAccessKey;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Factory {
        public /* synthetic */ Factory(AbstractC4148f abstractC4148f) {
            this();
        }

        public final AWSCredentials createAWSCredentials(String str, String str2, String str3, Long l9) {
            if (str == null || str2 == null) {
                return null;
            }
            if (str3 == null || l9 == null) {
                return new AWSCredentials(str, str2);
            }
            DateTimeFormatter dateTimeFormatter = C7126c.f34342b;
            return new AWSTemporaryCredentials(str, str2, str3, C7124a.m13403a(0, l9.longValue()));
        }

        private Factory() {
        }
    }

    public AWSCredentials(String accessKeyId, String secretAccessKey) {
        AbstractC4154l.m8923f(accessKeyId, "accessKeyId");
        AbstractC4154l.m8923f(secretAccessKey, "secretAccessKey");
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
    }

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }
}

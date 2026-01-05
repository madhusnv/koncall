package com.amplifyframework.predictions.aws.service;

import p001o.id5;
import p001o.qc4;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class PresignedSynthesizeSpeechUrlOptions {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_EXPIRATION_SECONDS = 900;
    private final qc4 credentialsProvider;
    private final int expires;

    public static final class Builder {
        private qc4 credentialsProvider;
        private int expires = 900;

        public final PresignedSynthesizeSpeechUrlOptions build() {
            return new PresignedSynthesizeSpeechUrlOptions(this.credentialsProvider, this.expires, null);
        }

        public final Builder credentialsProvider(qc4 qc4Var) {
            sq8.m48649h(qc4Var, "credentialsProvider");
            this.credentialsProvider = qc4Var;
            return this;
        }

        public final Builder expires(int i) {
            this.expires = i;
            return this;
        }

        public final qc4 getCredentialsProvider() {
            return this.credentialsProvider;
        }

        public final int getExpires() {
            return this.expires;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }

        public final PresignedSynthesizeSpeechUrlOptions defaults() {
            return builder().build();
        }
    }

    public /* synthetic */ PresignedSynthesizeSpeechUrlOptions(qc4 qc4Var, int i, id5 id5Var) {
        this(qc4Var, i);
    }

    public static final Builder builder() {
        return Companion.builder();
    }

    public static final PresignedSynthesizeSpeechUrlOptions defaults() {
        return Companion.defaults();
    }

    public final qc4 getCredentialsProvider() {
        return this.credentialsProvider;
    }

    public final int getExpires() {
        return this.expires;
    }

    private PresignedSynthesizeSpeechUrlOptions(qc4 qc4Var, int i) {
        this.credentialsProvider = qc4Var;
        this.expires = i;
    }
}

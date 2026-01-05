package com.amplifyframework.predictions.aws.service;

import java.io.IOException;
import java.net.URL;
import p001o.aig;
import p001o.b4g;
import p001o.lfa;
import p001o.lr7;
import p001o.m3e;
import p001o.mdd;
import p001o.n64;
import p001o.nl7;
import p001o.nq7;
import p001o.pm5;
import p001o.qc4;
import p001o.qm1;
import p001o.sq8;
import p001o.wea;
import p001o.y38;
import p001o.yk5;

/* loaded from: classes5.dex */
public final class AmazonPollyPresigningClient implements mdd {
    private final mdd pollyClient;

    public AmazonPollyPresigningClient(mdd mddVar) {
        sq8.m48649h(mddVar, "pollyClient");
        this.pollyClient = mddVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.pollyClient.close();
    }

    @Override // p001o.mdd
    public Object deleteLexicon(yk5 yk5Var, n64 n64Var) {
        return this.pollyClient.deleteLexicon(yk5Var, n64Var);
    }

    @Override // p001o.mdd
    public Object describeVoices(pm5 pm5Var, n64 n64Var) {
        return this.pollyClient.describeVoices(pm5Var, n64Var);
    }

    @Override // p001o.mdd
    public mdd.C15289c getConfig() {
        return this.pollyClient.getConfig();
    }

    @Override // p001o.mdd
    public Object getLexicon(nq7 nq7Var, n64 n64Var) {
        return this.pollyClient.getLexicon(nq7Var, n64Var);
    }

    public final URL getPresignedSynthesizeSpeechUrl(aig aigVar) {
        sq8.m48649h(aigVar, "synthesizeSpeechRequest");
        return getPresignedSynthesizeSpeechUrl(aigVar, PresignedSynthesizeSpeechUrlOptions.Companion.defaults());
    }

    @Override // p001o.mdd
    public Object getSpeechSynthesisTask(lr7 lr7Var, n64 n64Var) {
        return this.pollyClient.getSpeechSynthesisTask(lr7Var, n64Var);
    }

    @Override // p001o.mdd
    public Object listLexicons(wea weaVar, n64 n64Var) {
        return this.pollyClient.listLexicons(weaVar, n64Var);
    }

    @Override // p001o.mdd
    public Object listSpeechSynthesisTasks(lfa lfaVar, n64 n64Var) {
        return this.pollyClient.listSpeechSynthesisTasks(lfaVar, n64Var);
    }

    @Override // p001o.mdd
    public Object putLexicon(m3e m3eVar, n64 n64Var) {
        return this.pollyClient.putLexicon(m3eVar, n64Var);
    }

    @Override // p001o.mdd
    public Object startSpeechSynthesisTask(b4g b4gVar, n64 n64Var) {
        return this.pollyClient.startSpeechSynthesisTask(b4gVar, n64Var);
    }

    @Override // p001o.mdd
    public <T> Object synthesizeSpeech(aig aigVar, nl7 nl7Var, n64 n64Var) {
        return this.pollyClient.synthesizeSpeech(aigVar, nl7Var, n64Var);
    }

    public final URL getPresignedSynthesizeSpeechUrl(aig aigVar, PresignedSynthesizeSpeechUrlOptions presignedSynthesizeSpeechUrlOptions) {
        sq8.m48649h(aigVar, "synthesizeSpeechRequest");
        sq8.m48649h(presignedSynthesizeSpeechUrlOptions, "options");
        qc4 credentialsProvider = presignedSynthesizeSpeechUrlOptions.getCredentialsProvider();
        if (credentialsProvider == null) {
            credentialsProvider = getConfig().m38772g();
        }
        return new URL(((y38) qm1.m45641b(null, new C10644x7e2834c8(credentialsProvider, this, aigVar, presignedSynthesizeSpeechUrlOptions, null), 1, null)).getUrl().toString());
    }
}

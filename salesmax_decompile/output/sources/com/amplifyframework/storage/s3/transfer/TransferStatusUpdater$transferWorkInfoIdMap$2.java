package com.amplifyframework.storage.s3.transfer;

import java.util.concurrent.ConcurrentHashMap;
import p001o.kf9;
import p001o.uk7;

/* loaded from: classes5.dex */
public final class TransferStatusUpdater$transferWorkInfoIdMap$2 extends kf9 implements uk7 {
    public static final TransferStatusUpdater$transferWorkInfoIdMap$2 INSTANCE = new TransferStatusUpdater$transferWorkInfoIdMap$2();

    public TransferStatusUpdater$transferWorkInfoIdMap$2() {
        super(0);
    }

    @Override // p001o.uk7
    public final ConcurrentHashMap<String, Integer> invoke() {
        return new ConcurrentHashMap<>();
    }
}

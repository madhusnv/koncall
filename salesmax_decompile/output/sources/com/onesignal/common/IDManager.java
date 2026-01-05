package com.onesignal.common;

import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.UUID;
import p001o.e9g;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class IDManager {
    public static final IDManager INSTANCE = new IDManager();
    public static final String LOCAL_PREFIX = "local-";

    private IDManager() {
    }

    public final String createLocalId() {
        return LOCAL_PREFIX + UUID.randomUUID();
    }

    public final boolean isLocalId(String str) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        return e9g.m24597K(str, LOCAL_PREFIX, false, 2, null);
    }
}

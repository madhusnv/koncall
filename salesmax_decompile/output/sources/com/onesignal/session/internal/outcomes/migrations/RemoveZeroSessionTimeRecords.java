package com.onesignal.session.internal.outcomes.migrations;

import com.onesignal.core.internal.database.IDatabaseProvider;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class RemoveZeroSessionTimeRecords {
    public static final RemoveZeroSessionTimeRecords INSTANCE = new RemoveZeroSessionTimeRecords();

    private RemoveZeroSessionTimeRecords() {
    }

    public final void run(IDatabaseProvider iDatabaseProvider) {
        sq8.m48649h(iDatabaseProvider, "databaseProvider");
        iDatabaseProvider.getOs().delete("outcome", "name = \"os__session_duration\" AND session_time = 0", null);
    }
}

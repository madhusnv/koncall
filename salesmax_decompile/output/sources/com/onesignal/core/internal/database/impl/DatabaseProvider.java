package com.onesignal.core.internal.database.impl;

import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.IDatabaseProvider;
import com.onesignal.session.internal.outcomes.impl.OutcomeTableProvider;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class DatabaseProvider implements IDatabaseProvider {
    private final IApplicationService _application;
    private final Object lock;
    private OSDatabase osDatabase;

    public DatabaseProvider(IApplicationService iApplicationService) {
        sq8.m48649h(iApplicationService, "_application");
        this._application = iApplicationService;
        this.lock = new Object();
    }

    @Override // com.onesignal.core.internal.database.IDatabaseProvider
    public IDatabase getOs() {
        if (this.osDatabase == null) {
            synchronized (this.lock) {
                if (this.osDatabase == null) {
                    this.osDatabase = new OSDatabase(new OutcomeTableProvider(), this._application.getAppContext(), 0, 4, null);
                }
                y3i y3iVar = y3i.f54824a;
            }
        }
        OSDatabase oSDatabase = this.osDatabase;
        sq8.m48646e(oSDatabase);
        return oSDatabase;
    }
}

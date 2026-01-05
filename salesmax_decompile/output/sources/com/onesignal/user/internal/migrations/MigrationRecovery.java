package com.onesignal.user.internal.migrations;

import com.onesignal.debug.internal.logging.Logging;

/* loaded from: classes6.dex */
public abstract class MigrationRecovery implements IMigrationRecovery {
    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        if (isInBadState()) {
            Logging.warn$default(recoveryMessage(), null, 2, null);
            recover();
        }
    }
}

package com.onesignal.core.internal.device.impl;

import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.core.internal.preferences.PreferenceStores;
import java.util.UUID;
import p001o.kf9;
import p001o.uk7;

/* loaded from: classes6.dex */
public final class InstallIdService$currentId$2 extends kf9 implements uk7 {
    final /* synthetic */ InstallIdService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallIdService$currentId$2(InstallIdService installIdService) {
        super(0);
        this.this$0 = installIdService;
    }

    @Override // p001o.uk7
    public final UUID invoke() {
        String string$default = IPreferencesService.DefaultImpls.getString$default(this.this$0._prefs, PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_INSTALL_ID, null, 4, null);
        if (string$default != null) {
            return UUID.fromString(string$default);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        this.this$0._prefs.saveString(PreferenceStores.ONESIGNAL, PreferenceOneSignalKeys.PREFS_OS_INSTALL_ID, uuidRandomUUID.toString());
        return uuidRandomUUID;
    }
}

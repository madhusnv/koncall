package com.onesignal.core.internal.device.impl;

import com.onesignal.core.internal.device.IInstallIdService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import java.util.UUID;
import p001o.gi9;
import p001o.n64;
import p001o.si9;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class InstallIdService implements IInstallIdService {
    private final IPreferencesService _prefs;
    private final gi9 currentId$delegate;

    public InstallIdService(IPreferencesService iPreferencesService) {
        sq8.m48649h(iPreferencesService, "_prefs");
        this._prefs = iPreferencesService;
        this.currentId$delegate = si9.m48360a(new InstallIdService$currentId$2(this));
    }

    private final UUID getCurrentId() {
        Object value = this.currentId$delegate.getValue();
        sq8.m48648g(value, "<get-currentId>(...)");
        return (UUID) value;
    }

    @Override // com.onesignal.core.internal.device.IInstallIdService
    public Object getId(n64 n64Var) {
        return getCurrentId();
    }
}

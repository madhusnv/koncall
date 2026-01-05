package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface AuthProviderOrBuilder extends tcb {
    String getAudiences();

    xq1 getAudiencesBytes();

    String getAuthorizationUrl();

    xq1 getAuthorizationUrlBytes();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getId();

    xq1 getIdBytes();

    String getIssuer();

    xq1 getIssuerBytes();

    String getJwksUri();

    xq1 getJwksUriBytes();

    JwtLocation getJwtLocations(int i);

    int getJwtLocationsCount();

    List<JwtLocation> getJwtLocationsList();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}

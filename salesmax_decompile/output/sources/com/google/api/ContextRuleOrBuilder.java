package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface ContextRuleOrBuilder extends tcb {
    String getAllowedRequestExtensions(int i);

    xq1 getAllowedRequestExtensionsBytes(int i);

    int getAllowedRequestExtensionsCount();

    List<String> getAllowedRequestExtensionsList();

    String getAllowedResponseExtensions(int i);

    xq1 getAllowedResponseExtensionsBytes(int i);

    int getAllowedResponseExtensionsCount();

    List<String> getAllowedResponseExtensionsList();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getProvided(int i);

    xq1 getProvidedBytes(int i);

    int getProvidedCount();

    List<String> getProvidedList();

    String getRequested(int i);

    xq1 getRequestedBytes(int i);

    int getRequestedCount();

    List<String> getRequestedList();

    String getSelector();

    xq1 getSelectorBytes();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}

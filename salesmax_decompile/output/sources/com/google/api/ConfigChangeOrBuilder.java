package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface ConfigChangeOrBuilder extends tcb {
    Advice getAdvices(int i);

    int getAdvicesCount();

    List<Advice> getAdvicesList();

    ChangeType getChangeType();

    int getChangeTypeValue();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getElement();

    xq1 getElementBytes();

    String getNewValue();

    xq1 getNewValueBytes();

    String getOldValue();

    xq1 getOldValueBytes();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}

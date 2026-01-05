package com.google.api;

import com.google.api.ResourceDescriptor;
import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface ResourceDescriptorOrBuilder extends tcb {
    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    ResourceDescriptor.History getHistory();

    int getHistoryValue();

    String getNameField();

    xq1 getNameFieldBytes();

    String getPattern(int i);

    xq1 getPatternBytes(int i);

    int getPatternCount();

    List<String> getPatternList();

    String getPlural();

    xq1 getPluralBytes();

    String getSingular();

    xq1 getSingularBytes();

    String getType();

    xq1 getTypeBytes();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}

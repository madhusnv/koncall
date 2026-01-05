package com.google.api;

import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface LogDescriptorOrBuilder extends tcb {
    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getDescription();

    xq1 getDescriptionBytes();

    String getDisplayName();

    xq1 getDisplayNameBytes();

    LabelDescriptor getLabels(int i);

    int getLabelsCount();

    List<LabelDescriptor> getLabelsList();

    String getName();

    xq1 getNameBytes();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}

package com.google.api;

import com.google.api.MetricDescriptor;
import java.util.List;
import p001o.scb;
import p001o.tcb;
import p001o.xq1;

/* loaded from: classes3.dex */
public interface MetricDescriptorOrBuilder extends tcb {
    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    String getDescription();

    xq1 getDescriptionBytes();

    String getDisplayName();

    xq1 getDisplayNameBytes();

    LabelDescriptor getLabels(int i);

    int getLabelsCount();

    List<LabelDescriptor> getLabelsList();

    LaunchStage getLaunchStage();

    int getLaunchStageValue();

    MetricDescriptor.MetricDescriptorMetadata getMetadata();

    MetricDescriptor.MetricKind getMetricKind();

    int getMetricKindValue();

    String getName();

    xq1 getNameBytes();

    String getType();

    xq1 getTypeBytes();

    String getUnit();

    xq1 getUnitBytes();

    MetricDescriptor.ValueType getValueType();

    int getValueTypeValue();

    boolean hasMetadata();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}

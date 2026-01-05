package com.google.api;

import com.google.api.Distribution;
import java.util.List;
import p001o.scb;
import p001o.tcb;

/* loaded from: classes3.dex */
public interface DistributionOrBuilder extends tcb {
    long getBucketCounts(int i);

    int getBucketCountsCount();

    List<Long> getBucketCountsList();

    Distribution.BucketOptions getBucketOptions();

    long getCount();

    @Override // p001o.tcb
    /* synthetic */ scb getDefaultInstanceForType();

    Distribution.Exemplar getExemplars(int i);

    int getExemplarsCount();

    List<Distribution.Exemplar> getExemplarsList();

    double getMean();

    Distribution.Range getRange();

    double getSumOfSquaredDeviation();

    boolean hasBucketOptions();

    boolean hasRange();

    @Override // p001o.tcb
    /* synthetic */ boolean isInitialized();
}

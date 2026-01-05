package com.amplifyframework.storage.s3.transfer;

import p001o.gi6;
import p001o.hi6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TransferType {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ TransferType[] $VALUES;
    public static final TransferType UPLOAD = new TransferType("UPLOAD", 0);
    public static final TransferType DOWNLOAD = new TransferType("DOWNLOAD", 1);
    public static final TransferType ANY = new TransferType("ANY", 2);

    private static final /* synthetic */ TransferType[] $values() {
        return new TransferType[]{UPLOAD, DOWNLOAD, ANY};
    }

    static {
        TransferType[] transferTypeArr$values = $values();
        $VALUES = transferTypeArr$values;
        $ENTRIES = hi6.m30609a(transferTypeArr$values);
    }

    private TransferType(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static TransferType valueOf(String str) {
        return (TransferType) Enum.valueOf(TransferType.class, str);
    }

    public static TransferType[] values() {
        return (TransferType[]) $VALUES.clone();
    }
}

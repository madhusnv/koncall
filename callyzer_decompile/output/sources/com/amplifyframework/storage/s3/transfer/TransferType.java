package com.amplifyframework.storage.s3.transfer;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TransferType {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
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
        $ENTRIES = b8.m11548b(transferTypeArr$values);
    }

    private TransferType(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static TransferType valueOf(String str) {
        return (TransferType) Enum.valueOf(TransferType.class, str);
    }

    public static TransferType[] values() {
        return (TransferType[]) $VALUES.clone();
    }
}

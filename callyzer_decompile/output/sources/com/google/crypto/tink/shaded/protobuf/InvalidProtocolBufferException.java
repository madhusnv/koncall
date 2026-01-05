package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
    }

    /* renamed from: a */
    public static InvalidProtocolBufferException m4149a() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: b */
    public static InvalidWireTypeException m4150b() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: c */
    public static InvalidProtocolBufferException m4151c() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    public static InvalidProtocolBufferException m4152d() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public static InvalidProtocolBufferException m4153e() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* renamed from: f */
    public static InvalidProtocolBufferException m4154f() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

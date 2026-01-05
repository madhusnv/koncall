package com.google.firebase.encoders;

/* loaded from: classes5.dex */
public interface ValueEncoderContext {
    ValueEncoderContext add(double d);

    ValueEncoderContext add(float f);

    ValueEncoderContext add(int i);

    ValueEncoderContext add(long j);

    ValueEncoderContext add(String str);

    ValueEncoderContext add(boolean z);

    ValueEncoderContext add(byte[] bArr);
}

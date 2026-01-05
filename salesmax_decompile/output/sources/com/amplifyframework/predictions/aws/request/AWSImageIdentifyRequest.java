package com.amplifyframework.predictions.aws.request;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class AWSImageIdentifyRequest {
    private static final int COMPRESS_QUALITY_PERCENT = 100;
    private final ByteBuffer imageData;

    private AWSImageIdentifyRequest(ByteBuffer byteBuffer) {
        this.imageData = byteBuffer;
    }

    public static AWSImageIdentifyRequest fromBitmap(Bitmap bitmap) {
        Objects.requireNonNull(bitmap);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return new AWSImageIdentifyRequest(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
    }

    public ByteBuffer getImageData() {
        return this.imageData;
    }
}

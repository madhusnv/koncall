package com.amplifyframework.predictions.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Arrays;
import java.util.Date;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class VideoEvent {
    private final byte[] bytes;
    private final Date timestamp;

    public VideoEvent(byte[] bytes, Date timestamp) {
        AbstractC4154l.m8923f(bytes, "bytes");
        AbstractC4154l.m8923f(timestamp, "timestamp");
        this.bytes = bytes;
        this.timestamp = timestamp;
    }

    public static /* synthetic */ VideoEvent copy$default(VideoEvent videoEvent, byte[] bArr, Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr = videoEvent.bytes;
        }
        if ((i10 & 2) != 0) {
            date = videoEvent.timestamp;
        }
        return videoEvent.copy(bArr, date);
    }

    public final byte[] component1() {
        return this.bytes;
    }

    public final Date component2() {
        return this.timestamp;
    }

    public final VideoEvent copy(byte[] bytes, Date timestamp) {
        AbstractC4154l.m8923f(bytes, "bytes");
        AbstractC4154l.m8923f(timestamp, "timestamp");
        return new VideoEvent(bytes, timestamp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEvent)) {
            return false;
        }
        VideoEvent videoEvent = (VideoEvent) obj;
        return AbstractC4154l.m8918a(this.bytes, videoEvent.bytes) && AbstractC4154l.m8918a(this.timestamp, videoEvent.timestamp);
    }

    public final byte[] getBytes() {
        return this.bytes;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.timestamp.hashCode() + (Arrays.hashCode(this.bytes) * 31);
    }

    public String toString() {
        return "VideoEvent(bytes=" + Arrays.toString(this.bytes) + ", timestamp=" + this.timestamp + ")";
    }
}

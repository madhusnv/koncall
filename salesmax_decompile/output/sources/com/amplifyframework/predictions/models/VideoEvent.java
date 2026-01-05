package com.amplifyframework.predictions.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import java.util.Arrays;
import java.util.Date;
import p001o.sq8;

@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class VideoEvent {
    private final byte[] bytes;
    private final Date timestamp;

    public VideoEvent(byte[] bArr, Date date) {
        sq8.m48649h(bArr, "bytes");
        sq8.m48649h(date, "timestamp");
        this.bytes = bArr;
        this.timestamp = date;
    }

    public static /* synthetic */ VideoEvent copy$default(VideoEvent videoEvent, byte[] bArr, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = videoEvent.bytes;
        }
        if ((i & 2) != 0) {
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

    public final VideoEvent copy(byte[] bArr, Date date) {
        sq8.m48649h(bArr, "bytes");
        sq8.m48649h(date, "timestamp");
        return new VideoEvent(bArr, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEvent)) {
            return false;
        }
        VideoEvent videoEvent = (VideoEvent) obj;
        return sq8.m48644c(this.bytes, videoEvent.bytes) && sq8.m48644c(this.timestamp, videoEvent.timestamp);
    }

    public final byte[] getBytes() {
        return this.bytes;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.bytes) * 31) + this.timestamp.hashCode();
    }

    public String toString() {
        return "VideoEvent(bytes=" + Arrays.toString(this.bytes) + ", timestamp=" + this.timestamp + ")";
    }
}

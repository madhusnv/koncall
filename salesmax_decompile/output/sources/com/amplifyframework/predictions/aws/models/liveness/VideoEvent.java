package com.amplifyframework.predictions.aws.models.liveness;

import java.nio.ByteBuffer;
import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.lo3;
import p001o.sq8;
import p001o.tbd;
import p001o.uef;

@dff
/* loaded from: classes5.dex */
public final class VideoEvent {
    public static final Companion Companion = new Companion(null);
    private final long timestampMillis;
    private final ByteBuffer videoChunk;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return VideoEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VideoEvent(int i, @dff(with = ByteBufferSerializer.class) ByteBuffer byteBuffer, long j, fff fffVar) {
        if (3 != (i & 3)) {
            tbd.m49692a(i, 3, VideoEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.videoChunk = byteBuffer;
        this.timestampMillis = j;
    }

    public static /* synthetic */ VideoEvent copy$default(VideoEvent videoEvent, ByteBuffer byteBuffer, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            byteBuffer = videoEvent.videoChunk;
        }
        if ((i & 2) != 0) {
            j = videoEvent.timestampMillis;
        }
        return videoEvent.copy(byteBuffer, j);
    }

    public static /* synthetic */ void getTimestampMillis$annotations() {
    }

    @dff(with = ByteBufferSerializer.class)
    public static /* synthetic */ void getVideoChunk$annotations() {
    }

    public static final /* synthetic */ void write$Self(VideoEvent videoEvent, lo3 lo3Var, uef uefVar) {
        lo3Var.mo37566l(uefVar, 0, ByteBufferSerializer.INSTANCE, videoEvent.videoChunk);
        lo3Var.mo37565k(uefVar, 1, videoEvent.timestampMillis);
    }

    public final ByteBuffer component1() {
        return this.videoChunk;
    }

    public final long component2() {
        return this.timestampMillis;
    }

    public final VideoEvent copy(ByteBuffer byteBuffer, long j) {
        sq8.m48649h(byteBuffer, "videoChunk");
        return new VideoEvent(byteBuffer, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEvent)) {
            return false;
        }
        VideoEvent videoEvent = (VideoEvent) obj;
        return sq8.m48644c(this.videoChunk, videoEvent.videoChunk) && this.timestampMillis == videoEvent.timestampMillis;
    }

    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    public final ByteBuffer getVideoChunk() {
        return this.videoChunk;
    }

    public int hashCode() {
        return (this.videoChunk.hashCode() * 31) + Long.hashCode(this.timestampMillis);
    }

    public String toString() {
        return "VideoEvent(videoChunk=" + this.videoChunk + ", timestampMillis=" + this.timestampMillis + ")";
    }

    public VideoEvent(ByteBuffer byteBuffer, long j) {
        sq8.m48649h(byteBuffer, "videoChunk");
        this.videoChunk = byteBuffer;
        this.timestampMillis = j;
    }
}

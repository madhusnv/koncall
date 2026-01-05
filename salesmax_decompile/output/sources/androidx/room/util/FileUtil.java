package androidx.room.util;

import android.annotation.SuppressLint;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class FileUtil {
    @SuppressLint({"LambdaLast"})
    public static final void copy(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        sq8.m48649h(readableByteChannel, "input");
        sq8.m48649h(fileChannel, "output");
        try {
            fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}

package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import p001o.jd8;

/* renamed from: androidx.camera.core.c */
/* loaded from: classes2.dex */
public interface InterfaceC1893c extends AutoCloseable {

    /* renamed from: androidx.camera.core.c$a */
    public interface a {
        /* renamed from: a */
        int mo4658a();

        /* renamed from: b */
        int mo4659b();

        ByteBuffer getBuffer();
    }

    void C0(Rect rect);

    Image J2();

    @Override // java.lang.AutoCloseable
    void close();

    int getHeight();

    int getWidth();

    /* renamed from: l */
    int mo4657l();

    a[] u1();

    jd8 y2();
}

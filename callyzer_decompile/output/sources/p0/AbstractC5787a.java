package p0;

import android.util.Size;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p0.a */
/* loaded from: classes.dex */
public abstract class AbstractC5787a {

    /* renamed from: a */
    public static final Size f28368a = new Size(0, 0);

    /* renamed from: b */
    public static final Size f28369b;

    /* renamed from: c */
    public static final Size f28370c;

    /* renamed from: d */
    public static final Size f28371d;

    /* renamed from: e */
    public static final Size f28372e;

    /* renamed from: f */
    public static final Size f28373f;

    static {
        new Size(DilithiumEngine.DilithiumPolyT1PackedBytes, 240);
        f28369b = new Size(640, 480);
        f28370c = new Size(720, 480);
        f28371d = new Size(1280, 720);
        f28372e = new Size(1920, 1080);
        f28373f = new Size(1920, 1440);
        new Size(2560, 1440);
        new Size(3840, 2160);
    }

    /* renamed from: a */
    public static int m11337a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}

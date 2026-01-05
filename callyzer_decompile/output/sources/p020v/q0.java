package p020v;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import i0.n2;
import java.util.Locale;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import p0.AbstractC5787a;
import uf.C7427b;
import v0.C7622f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: e */
    public static final Size f36668e = new Size(1920, 1080);

    /* renamed from: f */
    public static final Size f36669f = new Size(DilithiumEngine.DilithiumPolyT1PackedBytes, 240);

    /* renamed from: g */
    public static final Size f36670g = new Size(640, 480);

    /* renamed from: h */
    public static final Object f36671h = new Object();

    /* renamed from: i */
    public static volatile q0 f36672i;

    /* renamed from: a */
    public final DisplayManager f36673a;

    /* renamed from: b */
    public volatile Size f36674b = null;

    /* renamed from: c */
    public final C7427b f36675c = new C7427b(17);

    /* renamed from: d */
    public final C7622f f36676d = new C7622f(14);

    public q0(Context context) {
        this.f36673a = (DisplayManager) context.getSystemService("display");
    }

    /* renamed from: b */
    public static q0 m14422b(Context context) {
        if (f36672i == null) {
            synchronized (f36671h) {
                try {
                    if (f36672i == null) {
                        f36672i = new q0(context);
                    }
                } finally {
                }
            }
        }
        return f36672i;
    }

    /* renamed from: d */
    public static Display m14423d(Display[] displayArr, boolean z6) {
        Display display = null;
        int i10 = -1;
        for (Display display2 : displayArr) {
            if (!z6 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x * point.y;
                if (i11 > i10) {
                    display = display2;
                    i10 = i11;
                }
            }
        }
        return display;
    }

    /* renamed from: a */
    public final Size m14424a() {
        Size sizeM599b;
        Point point = new Point();
        m14425c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = AbstractC5787a.f28368a;
        if (size.getHeight() * size.getWidth() < AbstractC5787a.m11337a(f36669f)) {
            size = ((SmallDisplaySizeQuirk) this.f36676d.f36778a) != null ? (Size) SmallDisplaySizeQuirk.f1846a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = f36670g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = f36668e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        if (((ExtraCroppingQuirk) this.f36675c.f35231b) != null && (sizeM599b = ExtraCroppingQuirk.m599b(n2.PRIV)) != null) {
            if (sizeM599b.getHeight() * sizeM599b.getWidth() > size.getHeight() * size.getWidth()) {
                return sizeM599b;
            }
        }
        return size;
    }

    /* renamed from: c */
    public final Display m14425c(boolean z6) {
        Display[] displays = this.f36673a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayM14423d = m14423d(displays, z6);
        if (displayM14423d == null && z6) {
            displayM14423d = m14423d(displays, false);
        }
        if (displayM14423d != null) {
            return displayM14423d;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* renamed from: e */
    public final Size m14426e() {
        if (this.f36674b != null) {
            return this.f36674b;
        }
        this.f36674b = m14424a();
        return this.f36674b;
    }
}

package p020v;

import a1.C0006e;
import a1.RunnableC0025x;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import c0.C0811d;
import c0.EnumC0826s;
import d7.d0;
import eb.i3;
import i0.AbstractC3084o;
import i0.e0;
import j0.C3505e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import nf.C5047i;
import og.u1;
import og.y0;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p021w.C7843i;
import p021w.C7851q;
import p022x.C8233c;
import p022x.InterfaceC8232b;
import pg.d8;
import pg.j7;
import qi.RunnableC6224g;
import v0.C7622f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.w */
/* loaded from: classes.dex */
public final class C7613w implements e0 {

    /* renamed from: a */
    public final String f36742a;

    /* renamed from: b */
    public final C7843i f36743b;

    /* renamed from: c */
    public final C5047i f36744c;

    /* renamed from: e */
    public C7599i f36746e;

    /* renamed from: f */
    public final C3505e f36747f;

    /* renamed from: h */
    public final i3 f36749h;

    /* renamed from: d */
    public final Object f36745d = new Object();

    /* renamed from: g */
    public ArrayList f36748g = null;

    public C7613w(String str, C7851q c7851q) throws NumberFormatException {
        str.getClass();
        this.f36742a = str;
        C7843i c7843iM14835b = c7851q.m14835b(str);
        this.f36743b = c7843iM14835b;
        C5047i c5047i = new C5047i(3);
        c5047i.f24823b = this;
        this.f36744c = c5047i;
        this.f36749h = d8.m11584b(c7843iM14835b);
        new HashMap();
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            u1.m10951j("Camera2EncoderProfilesProvider");
        }
        this.f36747f = new C3505e(new C0811d(EnumC0826s.CLOSED, null));
    }

    /* renamed from: a */
    public final void m14457a(C7599i c7599i) {
        synchronized (this.f36745d) {
            try {
                this.f36746e = c7599i;
                ArrayList arrayList = this.f36748g;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        Pair pair = (Pair) obj;
                        C7599i c7599i2 = this.f36746e;
                        c7599i2.f36571c.execute(new RunnableC0025x(23, c7599i2, (Executor) pair.second, (AbstractC3084o) pair.first));
                    }
                    this.f36748g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Integer num = (Integer) this.f36743b.m14823a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int iIntValue = num.intValue();
        if (iIntValue != 0 && iIntValue != 1 && iIntValue != 2 && iIntValue != 3 && iIntValue != 4) {
            new StringBuilder("Unknown value: ").append(iIntValue);
        }
        u1.m10945d("Camera2CameraInfo");
    }

    @Override // i0.e0
    /* renamed from: b */
    public final d0 mo7320b() {
        return this.f36747f;
    }

    @Override // i0.e0
    /* renamed from: c */
    public final Set mo7321c() {
        return ((InterfaceC8232b) C8233c.m15408d(this.f36743b).f39372a).mo15407c();
    }

    @Override // i0.e0
    /* renamed from: d */
    public final int mo7322d() {
        return mo7329l(0);
    }

    @Override // i0.e0
    /* renamed from: e */
    public final String mo7323e() {
        return this.f36742a;
    }

    @Override // i0.e0
    /* renamed from: g */
    public final Rect mo7324g() {
        Rect rect = (Rect) this.f36743b.m14823a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // i0.e0
    /* renamed from: i */
    public final int mo7326i() {
        Integer num = (Integer) this.f36743b.m14823a(CameraCharacteristics.LENS_FACING);
        y0.m11051a("Unable to get the lens facing of the camera.", num != null);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC5601a.m11232c(iIntValue, "The given lens facing integer: ", " can not be recognized."));
    }

    @Override // i0.e0
    /* renamed from: j */
    public final void mo7327j(Executor executor, C0006e c0006e) {
        synchronized (this.f36745d) {
            try {
                C7599i c7599i = this.f36746e;
                if (c7599i != null) {
                    c7599i.f36571c.execute(new RunnableC0025x(23, c7599i, executor, c0006e));
                    return;
                }
                if (this.f36748g == null) {
                    this.f36748g = new ArrayList();
                }
                this.f36748g.add(new Pair(c0006e, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i0.e0
    /* renamed from: k */
    public final String mo7328k() {
        Integer num = (Integer) this.f36743b.m14823a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // i0.e0
    /* renamed from: l */
    public final int mo7329l(int i10) {
        Integer num = (Integer) this.f36743b.m14823a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return j7.m11712b(j7.m11713c(i10), num.intValue(), 1 == mo7326i());
    }

    @Override // i0.e0
    /* renamed from: m */
    public final Object mo7330m() {
        return (CameraCharacteristics) this.f36743b.f37608b.f35231b;
    }

    @Override // i0.e0
    /* renamed from: n */
    public final i3 mo7331n() {
        return this.f36749h;
    }

    @Override // i0.e0
    /* renamed from: o */
    public final List mo7332o(int i10) {
        Size[] sizeArrM14011v = this.f36743b.m14825c().m14011v(i10);
        return sizeArrM14011v != null ? Arrays.asList(sizeArrM14011v) : Collections.EMPTY_LIST;
    }

    @Override // i0.e0
    /* renamed from: p */
    public final void mo7333p(AbstractC3084o abstractC3084o) {
        synchronized (this.f36745d) {
            try {
                C7599i c7599i = this.f36746e;
                if (c7599i != null) {
                    c7599i.f36571c.execute(new RunnableC6224g(8, c7599i, abstractC3084o));
                    return;
                }
                ArrayList arrayList = this.f36748g;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == abstractC3084o) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i0.e0
    /* renamed from: q */
    public final Set mo7334q() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.f36743b.m14823a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i10 : iArr) {
                hashSet.add(Integer.valueOf(i10));
            }
        }
        return hashSet;
    }

    @Override // i0.e0
    /* renamed from: r */
    public final Set mo7335r() {
        int[] outputFormats;
        C7622f c7622f = (C7622f) this.f36743b.m14825c().f35537b;
        c7622f.getClass();
        try {
            outputFormats = ((StreamConfigurationMap) c7622f.f36778a).getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException unused) {
            u1.m10952k("StreamConfigurationMapCompatBaseImpl");
            outputFormats = null;
        }
        int[] iArr = outputFormats != null ? (int[]) outputFormats.clone() : null;
        if (iArr == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i10 : iArr) {
            hashSet.add(Integer.valueOf(i10));
        }
        return hashSet;
    }
}

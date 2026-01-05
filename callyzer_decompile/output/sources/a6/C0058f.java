package a6;

import a1.RunnableC0025x;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import com.google.android.gms.internal.measurement.o4;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d7.g0;
import eb.i3;
import ee.C2039g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k0.ExecutorC3900j;
import k4.C4001v;
import kotlin.jvm.internal.AbstractC4154l;
import l0.AbstractC4308h;
import l0.C4310j;
import l0.C4311k;
import ly.AbstractC4600x;
import n0.AbstractC4940a;
import o2.C5271d;
import p020v.C7597g;
import p020v.C7599i;
import p020v.C7614x;
import p020v.v0;
import p021w.C7843i;
import pg.t8;
import w3.C7892j;
import x4.C8302l;
import yi.C8681j;
import yi.InterfaceC8682k;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a6.f */
/* loaded from: classes.dex */
public class C0058f implements InterfaceC8682k {

    /* renamed from: a */
    public boolean f233a;

    /* renamed from: b */
    public final Object f234b;

    public C0058f(Uri uri, boolean z6, boolean z10) {
        this.f234b = uri;
        this.f233a = z6;
    }

    /* renamed from: b */
    public static boolean m162b(C7843i c7843i) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) c7843i.m14823a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i10 : iArr) {
                if (i10 == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // yi.InterfaceC8682k
    /* renamed from: a */
    public void mo163a(C8681j c8681j, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f234b;
        if (this.f233a) {
            this.f233a = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    /* renamed from: c */
    public CameraCaptureSession.CaptureCallback m164c(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.f233a) {
            return captureCallback;
        }
        C7597g c7597g = new C7597g(3);
        C8302l c8302l = (C8302l) c7597g.f36542b;
        ((List) this.f234b).add(c8302l);
        c8302l.f39850b.mo9026a(new RunnableC0025x(26, this, c7597g, c8302l), t8.m11872a());
        return new C7614x(Arrays.asList(c7597g, captureCallback));
    }

    /* renamed from: d */
    public boolean m165d() {
        return this.f233a;
    }

    /* renamed from: e */
    public InterfaceFutureC8957d m166e() {
        List list = (List) this.f234b;
        if (list.isEmpty()) {
            return C4310j.f21736c;
        }
        C4311k c4311k = new C4311k(new ArrayList(new ArrayList(list)), false, t8.m11872a());
        C7892j c7892j = new C7892j(14);
        return AbstractC4308h.m9034d(AbstractC4308h.m9037g(c4311k, new C4001v(2, c7892j), t8.m11872a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m167f(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L48
            if (r8 < 0) goto L48
            int r0 = r7.length()
            int r0 = r0 - r8
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.f234b
            a6.e r0 = (a6.C0057e) r0
            if (r0 != 0) goto L16
            boolean r7 = r6.m165d()
            return r7
        L16:
            r0.getClass()
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L1d:
            r4 = 1
            if (r2 >= r8) goto L3d
            if (r3 != r1) goto L3d
            char r3 = r7.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            a6.f r5 = a6.AbstractC0059g.f235a
            if (r3 == 0) goto L39
            if (r3 == r4) goto L37
            if (r3 == r1) goto L37
            switch(r3) {
                case 14: goto L39;
                case 15: goto L39;
                case 16: goto L37;
                case 17: goto L37;
                default: goto L35;
            }
        L35:
            r3 = r1
            goto L3a
        L37:
            r3 = r0
            goto L3a
        L39:
            r3 = r4
        L3a:
            int r2 = r2 + 1
            goto L1d
        L3d:
            if (r3 == 0) goto L47
            if (r3 == r4) goto L46
            boolean r7 = r6.m165d()
            return r7
        L46:
            return r0
        L47:
            return r4
        L48:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.C0058f.m167f(java.lang.CharSequence, int):boolean");
    }

    /* renamed from: g */
    public void m168g() {
        this.f233a = false;
    }

    /* renamed from: h */
    public void mo169h(byte b10) {
        ((C2039g) this.f234b).m5768r(String.valueOf(b10));
    }

    /* renamed from: i */
    public void m170i(char c2) {
        C2039g c2039g = (C2039g) this.f234b;
        c2039g.m5761k(c2039g.f9605b, 1);
        char[] cArr = (char[]) c2039g.f9606c;
        int i10 = c2039g.f9605b;
        c2039g.f9605b = i10 + 1;
        cArr[i10] = c2;
    }

    /* renamed from: j */
    public void mo171j(int i10) {
        ((C2039g) this.f234b).m5768r(String.valueOf(i10));
    }

    /* renamed from: k */
    public void mo172k(long j6) {
        ((C2039g) this.f234b).m5768r(String.valueOf(j6));
    }

    /* renamed from: l */
    public void m173l(String v10) {
        AbstractC4154l.m8923f(v10, "v");
        ((C2039g) this.f234b).m5768r(v10);
    }

    /* renamed from: m */
    public void mo174m(short s5) {
        ((C2039g) this.f234b).m5768r(String.valueOf(s5));
    }

    /* renamed from: n */
    public void mo175n(String value) {
        byte b10;
        AbstractC4154l.m8923f(value, "value");
        C2039g c2039g = (C2039g) this.f234b;
        c2039g.m5761k(c2039g.f9605b, value.length() + 2);
        char[] cArr = (char[]) c2039g.f9606c;
        int i10 = c2039g.f9605b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c2 = cArr[i13];
            byte[] bArr = AbstractC4600x.f22769b;
            if (c2 < bArr.length && bArr[c2] != 0) {
                int length2 = value.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    c2039g.m5761k(i13, 2);
                    char cCharAt = value.charAt(i14);
                    byte[] bArr2 = AbstractC4600x.f22769b;
                    if (cCharAt >= bArr2.length || (b10 = bArr2[cCharAt]) == 0) {
                        int i15 = i13 + 1;
                        ((char[]) c2039g.f9606c)[i13] = cCharAt;
                        i13 = i15;
                    } else {
                        if (b10 == 1) {
                            String str = AbstractC4600x.f22768a[cCharAt];
                            AbstractC4154l.m8920c(str);
                            c2039g.m5761k(i13, str.length());
                            str.getChars(0, str.length(), (char[]) c2039g.f9606c, i13);
                            int length3 = str.length() + i13;
                            c2039g.f9605b = length3;
                            i13 = length3;
                        } else {
                            char[] cArr2 = (char[]) c2039g.f9606c;
                            cArr2[i13] = '\\';
                            cArr2[i13 + 1] = (char) b10;
                            i13 += 2;
                            c2039g.f9605b = i13;
                        }
                    }
                }
                c2039g.m5761k(i13, 1);
                ((char[]) c2039g.f9606c)[i13] = '\"';
                c2039g.f9605b = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        c2039g.f9605b = i12 + 1;
    }

    /* renamed from: p */
    public void m177p() {
        LinkedList linkedList = new LinkedList((List) this.f234b);
        while (!linkedList.isEmpty()) {
            InterfaceFutureC8957d interfaceFutureC8957d = (InterfaceFutureC8957d) linkedList.poll();
            Objects.requireNonNull(interfaceFutureC8957d);
            interfaceFutureC8957d.cancel(true);
        }
    }

    /* renamed from: r */
    public o4 m179r(String str, long j6) {
        Long lValueOf = Long.valueOf(j6);
        Object obj = o4.f6321g;
        return new o4(this, str, lValueOf, 0);
    }

    /* renamed from: s */
    public o4 m180s(String str, boolean z6) {
        Boolean boolValueOf = Boolean.valueOf(z6);
        Object obj = o4.f6321g;
        return new o4(this, str, boolValueOf, 1);
    }

    /* renamed from: t */
    public o4 m181t(String str, String str2) {
        Object obj = o4.f6321g;
        return new o4(this, str, str2, 3);
    }

    public /* synthetic */ C0058f(Object obj) {
        this.f234b = obj;
        this.f233a = true;
    }

    public C0058f(Executor executor, CameraCharacteristics cameraCharacteristics) {
        i3 i3Var = AbstractC4940a.f24615a;
        if (AbstractC4940a.f24615a.m5729g(LowMemoryQuirk.class) != null) {
            new ExecutorC3900j(executor);
        }
        this.f234b = i3Var;
        this.f233a = i3Var.m5728f(IncorrectJpegMetadataQuirk.class);
    }

    public C0058f(boolean z6) {
        this.f234b = Collections.synchronizedList(new ArrayList());
        this.f233a = z6;
    }

    public C0058f(C7599i c7599i) {
        this.f233a = false;
        this.f234b = new C5271d(2);
    }

    public C0058f(C7599i c7599i, C7843i c7843i) {
        new AtomicInteger(-1);
        this.f234b = new Object();
        boolean zM162b = m162b(c7843i);
        new g0(-1);
        v0 v0Var = new v0();
        if (zM162b) {
            c7599i.m14393h(v0Var);
        }
    }

    /* renamed from: o */
    public void m176o() {
    }

    /* renamed from: q */
    public void m178q() {
    }

    public C0058f(C0057e c0057e, boolean z6) {
        this.f234b = c0057e;
        this.f233a = z6;
    }

    public C0058f(BottomSheetBehavior bottomSheetBehavior, boolean z6) {
        this.f234b = bottomSheetBehavior;
        this.f233a = z6;
    }
}

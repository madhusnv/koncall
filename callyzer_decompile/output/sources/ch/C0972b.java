package ch;

import a2.AbstractC0030c;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import bg.C0658c;
import ex.InterfaceC2137a;
import h1.AbstractC2785p;
import h1.InterfaceC2792w;
import h1.b2;
import h1.c0;
import java.util.ArrayList;
import jd.AbstractC3755e;
import k2.AbstractC3967p;
import k2.InterfaceC3954c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l4.InterfaceC4374s;
import m5.AbstractC4664r;
import m5.C4661o;
import net.schmizz.sshj.common.CircularBuffer$CircularBufferException;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import wj.C8090p;
import x1.v1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ch.b */
/* loaded from: classes.dex */
public final class C0972b implements b2, InterfaceC3954c, InterfaceC4374s {

    /* renamed from: a */
    public final /* synthetic */ int f5782a;

    /* renamed from: b */
    public int f5783b;

    /* renamed from: c */
    public int f5784c;

    /* renamed from: d */
    public Object f5785d;

    public C0972b(Context context) {
        this.f5782a = 6;
        this.f5784c = 0;
        this.f5785d = context;
    }

    @Override // h1.z1
    /* renamed from: B */
    public AbstractC2785p mo2730B(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        return ((C8090p) this.f5785d).mo2730B(j6, abstractC2785p, abstractC2785p2, abstractC2785p3);
    }

    @Override // h1.b2
    /* renamed from: N */
    public int mo2731N() {
        return this.f5784c;
    }

    @Override // h1.b2
    /* renamed from: W */
    public int mo2732W() {
        return this.f5783b;
    }

    @Override // l4.InterfaceC4374s
    /* renamed from: Y */
    public int mo2733Y(int i10) {
        int iMo2733Y = ((InterfaceC4374s) this.f5785d).mo2733Y(i10);
        if (i10 >= 0 && i10 <= this.f5783b) {
            v1.m15484b(iMo2733Y, this.f5784c, i10);
        }
        return iMo2733Y;
    }

    /* renamed from: a */
    public void m2734a(int i10, String str) {
        int i11 = this.f5784c + i10;
        int i12 = this.f5783b;
        if (i11 <= i12) {
            this.f5784c = i11;
            return;
        }
        String strConcat = "Unexpected end-of-doc while ".concat(str);
        int iMax = Math.max(0, this.f5784c - 3);
        int iMin = Math.min(i12 - 1, this.f5784c + 3);
        String strSubstring = ((String) this.f5785d).substring(iMax, iMin + 1);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        throw new DeserializationException(AbstractC0030c.m115f('\n', strConcat, "At offset " + this.f5784c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC3755e.f19620a.m10088d(strSubstring, "·") + '\n' + (AbstractC5185w.m10134p(this.f5784c - iMax, " ") + '^')));
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: c */
    public void mo2735c(int i10, Object obj) {
        ((InterfaceC3954c) this.f5785d).mo2735c(i10 + (this.f5784c == 0 ? this.f5783b : 0), obj);
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: d */
    public void mo2736d(Object obj) {
        this.f5784c++;
        ((InterfaceC3954c) this.f5785d).mo2736d(obj);
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: f */
    public void mo2737f(int i10, int i11, int i12) {
        int i13 = this.f5784c == 0 ? this.f5783b : 0;
        ((InterfaceC3954c) this.f5785d).mo2737f(i10 + i13, i11 + i13, i12);
    }

    /* renamed from: g */
    public boolean m2738g(String str) {
        if (!AbstractC5185w.m10137s(this.f5784c, (String) this.f5785d, str, false)) {
            return false;
        }
        this.f5784c = str.length() + this.f5784c;
        return true;
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: h */
    public void mo2739h(int i10, int i11) {
        ((InterfaceC3954c) this.f5785d).mo2739h(i10 + (this.f5784c == 0 ? this.f5783b : 0), i11);
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: i */
    public void mo2740i() {
        if (!(this.f5784c > 0)) {
            AbstractC3967p.m8636c("OffsetApplier up called with no corresponding down");
        }
        this.f5784c--;
        ((InterfaceC3954c) this.f5785d).mo2740i();
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: j */
    public void mo2741j(int i10, Object obj) {
        ((InterfaceC3954c) this.f5785d).mo2741j(i10 + (this.f5784c == 0 ? this.f5783b : 0), obj);
    }

    @Override // k2.InterfaceC3954c
    /* renamed from: k */
    public Object mo2742k() {
        return ((InterfaceC3954c) this.f5785d).mo2742k();
    }

    /* renamed from: l */
    public int m2743l() {
        int i10 = this.f5784c - this.f5783b;
        return i10 >= 0 ? i10 : i10 + ((byte[]) this.f5785d).length;
    }

    @Override // h1.z1
    /* renamed from: n */
    public AbstractC2785p mo2744n(long j6, AbstractC2785p abstractC2785p, AbstractC2785p abstractC2785p2, AbstractC2785p abstractC2785p3) {
        return ((C8090p) this.f5785d).mo2744n(j6, abstractC2785p, abstractC2785p2, abstractC2785p3);
    }

    /* renamed from: o */
    public boolean m2745o(String str) {
        return m2750t(this.f5784c + Math.min(str.length(), this.f5783b - this.f5784c)).equals(str);
    }

    /* renamed from: p */
    public void m2746p(int i10, int i11, byte[] bArr) throws CircularBuffer$CircularBufferException {
        int iMin;
        int iM2743l = m2743l();
        if (((byte[]) this.f5785d).length - iM2743l <= i11) {
            int i12 = 1;
            int i13 = iM2743l + i11 + 1;
            while (true) {
                iMin = 16777216;
                if (i12 >= i13) {
                    iMin = Math.min(i12, 16777216);
                    break;
                } else {
                    i12 <<= 1;
                    if (i12 <= 0) {
                        break;
                    }
                }
            }
            if (iMin < i13) {
                throw new CircularBuffer$CircularBufferException("Attempted overflow");
            }
            byte[] bArr2 = new byte[iMin];
            int i14 = this.f5784c;
            int i15 = this.f5783b;
            if (i14 >= i15) {
                System.arraycopy((byte[]) this.f5785d, i15, bArr2, 0, iM2743l);
                this.f5784c -= this.f5783b;
            } else {
                byte[] bArr3 = (byte[]) this.f5785d;
                int length = bArr3.length - i15;
                System.arraycopy(bArr3, i15, bArr2, 0, length);
                System.arraycopy((byte[]) this.f5785d, 0, bArr2, length, this.f5784c);
                this.f5784c += length;
            }
            this.f5783b = 0;
            this.f5785d = bArr2;
        }
        int i16 = this.f5784c;
        int i17 = i16 + i11;
        byte[] bArr4 = (byte[]) this.f5785d;
        if (i17 <= bArr4.length) {
            System.arraycopy(bArr, i10, bArr4, i16, i11);
        } else {
            int length2 = bArr4.length - i16;
            System.arraycopy(bArr, i10, bArr4, i16, length2);
            int i18 = i11 - length2;
            System.arraycopy(bArr, i10 + length2, (byte[]) this.f5785d, 0, i18);
            i17 = i18;
        }
        this.f5784c = i17;
    }

    /* renamed from: q */
    public char m2747q(String str) {
        String str2 = (String) this.f5785d;
        int i10 = this.f5784c;
        int i11 = i10 + 1;
        int i12 = this.f5783b;
        if (i11 <= i12) {
            this.f5784c = i11;
            return str2.charAt(i10);
        }
        String strConcat = "Unexpected end-of-doc while ".concat(str);
        int iMax = Math.max(0, this.f5784c - 3);
        int iMin = Math.min(i12 - 1, this.f5784c + 3);
        String strSubstring = str2.substring(iMax, iMin + 1);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        throw new DeserializationException(AbstractC0030c.m115f('\n', strConcat, "At offset " + this.f5784c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC3755e.f19620a.m10088d(strSubstring, "·") + '\n' + (AbstractC5185w.m10134p(this.f5784c - iMax, " ") + '^')));
    }

    /* renamed from: r */
    public String m2748r(String str, String str2) {
        String str3 = (String) this.f5785d;
        int iM10099J = AbstractC5178p.m10099J(str3, str, this.f5784c, false, 4);
        if (iM10099J >= 0) {
            String strM2750t = m2750t(iM10099J);
            this.f5784c = iM10099J;
            return strM2750t;
        }
        String strConcat = "Unexpected end-of-doc while ".concat(str2);
        int iMax = Math.max(0, this.f5784c - 3);
        int iMin = Math.min(this.f5783b - 1, this.f5784c + 3);
        String strSubstring = str3.substring(iMax, iMin + 1);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        throw new DeserializationException(AbstractC0030c.m115f('\n', strConcat, "At offset " + this.f5784c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC3755e.f19620a.m10088d(strSubstring, "·") + '\n' + (AbstractC5185w.m10134p(this.f5784c - iMax, " ") + '^')));
    }

    /* renamed from: s */
    public void m2749s(String str) {
        int i10 = this.f5784c;
        int i11 = i10 - 1;
        int i12 = this.f5783b;
        if (i11 <= i12) {
            this.f5784c = i10 - 1;
            return;
        }
        String strConcat = "Unexpected end-of-doc while ".concat(str);
        int iMax = Math.max(0, this.f5784c - 3);
        int iMin = Math.min(i12 - 1, this.f5784c + 3);
        String strSubstring = ((String) this.f5785d).substring(iMax, iMin + 1);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        throw new DeserializationException(AbstractC0030c.m115f('\n', strConcat, "At offset " + this.f5784c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC3755e.f19620a.m10088d(strSubstring, "·") + '\n' + (AbstractC5185w.m10134p(this.f5784c - iMax, " ") + '^')));
    }

    /* renamed from: t */
    public String m2750t(int i10) {
        String strSubstring = ((String) this.f5785d).substring(this.f5784c, i10);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public String toString() {
        switch (this.f5782a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("CircularBuffer [rpos=");
                sb2.append(this.f5783b);
                sb2.append(", wpos=");
                sb2.append(this.f5784c);
                sb2.append(", size=");
                return AbstractC5601a.m11233d(((byte[]) this.f5785d).length, "]", sb2);
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public synchronized int m2751u() {
        PackageInfo packageInfoM1920c;
        if (this.f5783b == 0) {
            try {
                packageInfoM1920c = C0658c.m1928a((Context) this.f5785d).m1920c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e2) {
                "Failed to find package ".concat(e2.toString());
                packageInfoM1920c = null;
            }
            if (packageInfoM1920c != null) {
                this.f5783b = packageInfoM1920c.versionCode;
            }
        }
        return this.f5783b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:3:0x0001, B:7:0x0007, B:12:0x0029, B:14:0x0030, B:16:0x0042, B:26:0x0065, B:21:0x004b, B:23:0x005e, B:29:0x0069, B:33:0x0071), top: B:38:0x0001 }] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized int m2752v() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f5784c     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            java.lang.Object r0 = r5.f5785d     // Catch: java.lang.Throwable -> L49
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L49
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L49
            bg.b r0 = bg.C0658c.m1928a(r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            java.lang.Object r0 = r0.f4200a     // Catch: java.lang.Throwable -> L49
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L49
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L49
            int r0 = r0.checkPermission(r2, r3)     // Catch: java.lang.Throwable -> L49
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L29
            monitor-exit(r5)
            return r3
        L29:
            boolean r0 = zf.AbstractC8947b.m16428e()     // Catch: java.lang.Throwable -> L49
            r2 = 1
            if (r0 != 0) goto L4b
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L49
            java.util.List r0 = r1.queryIntentServices(r0, r3)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L4b
            goto L65
        L49:
            r0 = move-exception
            goto L75
        L4b:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L49
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r3)     // Catch: java.lang.Throwable -> L49
            r1 = 2
            if (r0 == 0) goto L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L69
            r2 = r1
        L65:
            r5.f5784c = r2     // Catch: java.lang.Throwable -> L49
            monitor-exit(r5)
            return r2
        L69:
            boolean r0 = zf.AbstractC8947b.m16428e()     // Catch: java.lang.Throwable -> L49
            if (r2 == r0) goto L70
            goto L71
        L70:
            r2 = r1
        L71:
            r5.f5784c = r2     // Catch: java.lang.Throwable -> L49
            monitor-exit(r5)
            return r2
        L75:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.C0972b.m2752v():int");
    }

    @Override // l4.InterfaceC4374s
    /* renamed from: w */
    public int mo2753w(int i10) {
        int iMo2753w = ((InterfaceC4374s) this.f5785d).mo2753w(i10);
        if (i10 >= 0 && i10 <= this.f5784c) {
            v1.m15485c(iMo2753w, this.f5783b, i10);
        }
        return iMo2753w;
    }

    public C0972b(String str) {
        this.f5782a = 2;
        this.f5785d = str;
        this.f5783b = str.length();
    }

    public C0972b(View view) {
        this.f5782a = 0;
        this.f5785d = view;
    }

    public C0972b(InterfaceC4374s interfaceC4374s, int i10, int i11) {
        this.f5782a = 9;
        this.f5785d = interfaceC4374s;
        this.f5783b = i10;
        this.f5784c = i11;
    }

    public C0972b(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f5782a = 4;
        this.f5785d = new ArrayList();
        this.f5784c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC4664r.f23060g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f5783b = typedArrayObtainStyledAttributes.getResourceId(index, this.f5783b);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5784c);
                this.f5784c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C4661o().m9544b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0972b(InterfaceC3954c interfaceC3954c, int i10) {
        this.f5782a = 3;
        this.f5785d = interfaceC3954c;
        this.f5783b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0972b(int i10, int i11, InterfaceC2137a interfaceC2137a) {
        this.f5782a = 8;
        this.f5783b = i10;
        this.f5784c = i11;
        this.f5785d = (AbstractC4155m) interfaceC2137a;
    }

    public C0972b(int i10) {
        this.f5782a = i10;
        switch (i10) {
            case 7:
                this.f5785d = new C0972b[256];
                this.f5783b = 0;
                this.f5784c = 0;
                break;
        }
    }

    public C0972b(int i10, int i11) {
        this.f5782a = 7;
        this.f5785d = null;
        this.f5783b = i10;
        int i12 = i11 & 7;
        this.f5784c = i12 == 0 ? 8 : i12;
    }

    public C0972b(int i10, int i11, InterfaceC2792w interfaceC2792w) {
        this.f5782a = 1;
        this.f5783b = i10;
        this.f5784c = i11;
        this.f5785d = new C8090p(new c0(i10, i11, interfaceC2792w));
    }
}

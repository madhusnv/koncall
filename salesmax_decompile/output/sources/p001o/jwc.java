package p001o;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jwc {

    /* renamed from: f */
    public static final InterfaceC14673c f31173f = new C14671a();

    /* renamed from: a */
    public final List f31174a;

    /* renamed from: b */
    public final List f31175b;

    /* renamed from: d */
    public final SparseBooleanArray f31177d = new SparseBooleanArray();

    /* renamed from: c */
    public final Map f31176c = new vo0();

    /* renamed from: e */
    public final C14674d f31178e = m34606a();

    /* renamed from: o.jwc$a */
    public static class C14671a implements InterfaceC14673c {
        @Override // p001o.jwc.InterfaceC14673c
        /* renamed from: a */
        public boolean mo34613a(int i, float[] fArr) {
            return (m34616d(fArr) || m34614b(fArr) || m34615c(fArr)) ? false : true;
        }

        /* renamed from: b */
        public final boolean m34614b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        /* renamed from: c */
        public final boolean m34615c(float[] fArr) {
            float f = fArr[0];
            return f >= 10.0f && f <= 37.0f && fArr[1] <= 0.82f;
        }

        /* renamed from: d */
        public final boolean m34616d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    /* renamed from: o.jwc$b */
    public static final class C14672b {

        /* renamed from: a */
        public final List f31179a;

        /* renamed from: b */
        public final Bitmap f31180b;

        /* renamed from: c */
        public final List f31181c;

        /* renamed from: d */
        public int f31182d;

        /* renamed from: e */
        public int f31183e;

        /* renamed from: f */
        public int f31184f;

        /* renamed from: g */
        public final List f31185g;

        /* renamed from: h */
        public Rect f31186h;

        public C14672b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f31181c = arrayList;
            this.f31182d = 16;
            this.f31183e = 12544;
            this.f31184f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f31185g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(jwc.f31173f);
            this.f31180b = bitmap;
            this.f31179a = null;
            arrayList.add(qjg.f42075e);
            arrayList.add(qjg.f42076f);
            arrayList.add(qjg.f42077g);
            arrayList.add(qjg.f42078h);
            arrayList.add(qjg.f42079i);
            arrayList.add(qjg.f42080j);
        }

        /* renamed from: a */
        public jwc m34617a() {
            List listM40582d;
            InterfaceC14673c[] interfaceC14673cArr;
            Bitmap bitmap = this.f31180b;
            if (bitmap != null) {
                Bitmap bitmapM34620d = m34620d(bitmap);
                Rect rect = this.f31186h;
                if (bitmapM34620d != this.f31180b && rect != null) {
                    double width = bitmapM34620d.getWidth() / this.f31180b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), bitmapM34620d.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), bitmapM34620d.getHeight());
                }
                int[] iArrM34618b = m34618b(bitmapM34620d);
                int i = this.f31182d;
                if (this.f31185g.isEmpty()) {
                    interfaceC14673cArr = null;
                } else {
                    List list = this.f31185g;
                    interfaceC14673cArr = (InterfaceC14673c[]) list.toArray(new InterfaceC14673c[list.size()]);
                }
                nh3 nh3Var = new nh3(iArrM34618b, i, interfaceC14673cArr);
                if (bitmapM34620d != this.f31180b) {
                    bitmapM34620d.recycle();
                }
                listM40582d = nh3Var.m40582d();
            } else {
                listM40582d = this.f31179a;
                if (listM40582d == null) {
                    throw new AssertionError();
                }
            }
            jwc jwcVar = new jwc(listM40582d, this.f31181c);
            jwcVar.m34607b();
            return jwcVar;
        }

        /* renamed from: b */
        public final int[] m34618b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f31186h;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.f31186h.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i = 0; i < iHeight; i++) {
                Rect rect2 = this.f31186h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * iWidth, iWidth);
            }
            return iArr2;
        }

        /* renamed from: c */
        public C14672b m34619c(int i) {
            this.f31182d = i;
            return this;
        }

        /* renamed from: d */
        public final Bitmap m34620d(Bitmap bitmap) {
            int iMax;
            int i;
            double dSqrt = -1.0d;
            if (this.f31183e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f31183e;
                if (width > i2) {
                    dSqrt = Math.sqrt(i2 / width);
                }
            } else if (this.f31184f > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f31184f)) {
                dSqrt = i / iMax;
            }
            return dSqrt <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dSqrt), (int) Math.ceil(bitmap.getHeight() * dSqrt), false);
        }
    }

    /* renamed from: o.jwc$c */
    public interface InterfaceC14673c {
        /* renamed from: a */
        boolean mo34613a(int i, float[] fArr);
    }

    /* renamed from: o.jwc$d */
    public static final class C14674d {

        /* renamed from: a */
        public final int f31187a;

        /* renamed from: b */
        public final int f31188b;

        /* renamed from: c */
        public final int f31189c;

        /* renamed from: d */
        public final int f31190d;

        /* renamed from: e */
        public final int f31191e;

        /* renamed from: f */
        public boolean f31192f;

        /* renamed from: g */
        public int f31193g;

        /* renamed from: h */
        public int f31194h;

        /* renamed from: i */
        public float[] f31195i;

        public C14674d(int i, int i2) {
            this.f31187a = Color.red(i);
            this.f31188b = Color.green(i);
            this.f31189c = Color.blue(i);
            this.f31190d = i;
            this.f31191e = i2;
        }

        /* renamed from: a */
        public final void m34621a() {
            if (this.f31192f) {
                return;
            }
            int iM40615g = ni3.m40615g(-1, this.f31190d, 4.5f);
            int iM40615g2 = ni3.m40615g(-1, this.f31190d, 3.0f);
            if (iM40615g != -1 && iM40615g2 != -1) {
                this.f31194h = ni3.m40624p(-1, iM40615g);
                this.f31193g = ni3.m40624p(-1, iM40615g2);
                this.f31192f = true;
                return;
            }
            int iM40615g3 = ni3.m40615g(-16777216, this.f31190d, 4.5f);
            int iM40615g4 = ni3.m40615g(-16777216, this.f31190d, 3.0f);
            if (iM40615g3 == -1 || iM40615g4 == -1) {
                this.f31194h = iM40615g != -1 ? ni3.m40624p(-1, iM40615g) : ni3.m40624p(-16777216, iM40615g3);
                this.f31193g = iM40615g2 != -1 ? ni3.m40624p(-1, iM40615g2) : ni3.m40624p(-16777216, iM40615g4);
                this.f31192f = true;
            } else {
                this.f31194h = ni3.m40624p(-16777216, iM40615g3);
                this.f31193g = ni3.m40624p(-16777216, iM40615g4);
                this.f31192f = true;
            }
        }

        /* renamed from: b */
        public int m34622b() {
            m34621a();
            return this.f31194h;
        }

        /* renamed from: c */
        public float[] m34623c() {
            if (this.f31195i == null) {
                this.f31195i = new float[3];
            }
            ni3.m40609a(this.f31187a, this.f31188b, this.f31189c, this.f31195i);
            return this.f31195i;
        }

        /* renamed from: d */
        public int m34624d() {
            return this.f31191e;
        }

        /* renamed from: e */
        public int m34625e() {
            return this.f31190d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C14674d.class != obj.getClass()) {
                return false;
            }
            C14674d c14674d = (C14674d) obj;
            return this.f31191e == c14674d.f31191e && this.f31190d == c14674d.f31190d;
        }

        /* renamed from: f */
        public int m34626f() {
            m34621a();
            return this.f31193g;
        }

        public int hashCode() {
            return (this.f31190d * 31) + this.f31191e;
        }

        public String toString() {
            return C14674d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(m34625e()) + "] [HSL: " + Arrays.toString(m34623c()) + "] [Population: " + this.f31191e + "] [Title Text: #" + Integer.toHexString(m34626f()) + "] [Body Text: #" + Integer.toHexString(m34622b()) + ']';
        }
    }

    public jwc(List list, List list2) {
        this.f31174a = list;
        this.f31175b = list2;
    }

    /* renamed from: a */
    public final C14674d m34606a() {
        int size = this.f31174a.size();
        int iM34624d = Integer.MIN_VALUE;
        C14674d c14674d = null;
        for (int i = 0; i < size; i++) {
            C14674d c14674d2 = (C14674d) this.f31174a.get(i);
            if (c14674d2.m34624d() > iM34624d) {
                iM34624d = c14674d2.m34624d();
                c14674d = c14674d2;
            }
        }
        return c14674d;
    }

    /* renamed from: b */
    public void m34607b() {
        int size = this.f31175b.size();
        for (int i = 0; i < size; i++) {
            qjg qjgVar = (qjg) this.f31175b.get(i);
            qjgVar.m45569k();
            this.f31176c.put(qjgVar, m34609d(qjgVar));
        }
        this.f31177d.clear();
    }

    /* renamed from: c */
    public final float m34608c(C14674d c14674d, qjg qjgVar) {
        float[] fArrM34623c = c14674d.m34623c();
        C14674d c14674d2 = this.f31178e;
        return (qjgVar.m45565g() > 0.0f ? qjgVar.m45565g() * (1.0f - Math.abs(fArrM34623c[1] - qjgVar.m45567i())) : 0.0f) + (qjgVar.m45559a() > 0.0f ? qjgVar.m45559a() * (1.0f - Math.abs(fArrM34623c[2] - qjgVar.m45566h())) : 0.0f) + (qjgVar.m45564f() > 0.0f ? qjgVar.m45564f() * (c14674d.m34624d() / (c14674d2 != null ? c14674d2.m34624d() : 1)) : 0.0f);
    }

    /* renamed from: d */
    public final C14674d m34609d(qjg qjgVar) {
        C14674d c14674dM34610e = m34610e(qjgVar);
        if (c14674dM34610e != null && qjgVar.m45568j()) {
            this.f31177d.append(c14674dM34610e.m34625e(), true);
        }
        return c14674dM34610e;
    }

    /* renamed from: e */
    public final C14674d m34610e(qjg qjgVar) {
        int size = this.f31174a.size();
        float f = 0.0f;
        C14674d c14674d = null;
        for (int i = 0; i < size; i++) {
            C14674d c14674d2 = (C14674d) this.f31174a.get(i);
            if (m34612g(c14674d2, qjgVar)) {
                float fM34608c = m34608c(c14674d2, qjgVar);
                if (c14674d == null || fM34608c > f) {
                    c14674d = c14674d2;
                    f = fM34608c;
                }
            }
        }
        return c14674d;
    }

    /* renamed from: f */
    public List m34611f() {
        return Collections.unmodifiableList(this.f31174a);
    }

    /* renamed from: g */
    public final boolean m34612g(C14674d c14674d, qjg qjgVar) {
        float[] fArrM34623c = c14674d.m34623c();
        return fArrM34623c[1] >= qjgVar.m45563e() && fArrM34623c[1] <= qjgVar.m45561c() && fArrM34623c[2] >= qjgVar.m45562d() && fArrM34623c[2] <= qjgVar.m45560b() && !this.f31177d.get(c14674d.m34625e());
    }
}

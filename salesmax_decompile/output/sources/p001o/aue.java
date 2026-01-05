package p001o;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.InterfaceC1893c;
import java.nio.ByteBuffer;
import java.util.Objects;
import p001o.hm6;

/* loaded from: classes2.dex */
public final class aue implements InterfaceC1893c {

    /* renamed from: a */
    public final Object f15252a;

    /* renamed from: b */
    public final int f15253b;

    /* renamed from: c */
    public final int f15254c;

    /* renamed from: d */
    public final Rect f15255d;

    /* renamed from: e */
    public InterfaceC1893c.a[] f15256e;

    /* renamed from: f */
    public final jd8 f15257f;

    /* renamed from: o.aue$a */
    public class C12252a implements InterfaceC1893c.a {

        /* renamed from: a */
        public final /* synthetic */ int f15258a;

        /* renamed from: b */
        public final /* synthetic */ int f15259b;

        /* renamed from: c */
        public final /* synthetic */ ByteBuffer f15260c;

        public C12252a(int i, int i2, ByteBuffer byteBuffer) {
            this.f15258a = i;
            this.f15259b = i2;
            this.f15260c = byteBuffer;
        }

        @Override // androidx.camera.core.InterfaceC1893c.a
        /* renamed from: a */
        public int mo4658a() {
            return this.f15258a;
        }

        @Override // androidx.camera.core.InterfaceC1893c.a
        /* renamed from: b */
        public int mo4659b() {
            return this.f15259b;
        }

        @Override // androidx.camera.core.InterfaceC1893c.a
        public ByteBuffer getBuffer() {
            return this.f15260c;
        }
    }

    /* renamed from: o.aue$b */
    public class C12253b implements jd8 {

        /* renamed from: a */
        public final /* synthetic */ long f15261a;

        /* renamed from: b */
        public final /* synthetic */ int f15262b;

        /* renamed from: c */
        public final /* synthetic */ Matrix f15263c;

        public C12253b(long j, int i, Matrix matrix) {
            this.f15261a = j;
            this.f15262b = i;
            this.f15263c = matrix;
        }

        @Override // p001o.jd8
        /* renamed from: a */
        public wig mo17845a() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // p001o.jd8
        /* renamed from: b */
        public void mo17846b(hm6.C13999b c13999b) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // p001o.jd8
        public long getTimestamp() {
            return this.f15261a;
        }
    }

    public aue(lic licVar) {
        this((Bitmap) licVar.mo22323c(), licVar.mo22322b(), licVar.mo22326f(), licVar.mo22327g(), licVar.mo22321a().getTimestamp());
    }

    /* renamed from: c */
    public static jd8 m17842c(long j, int i, Matrix matrix) {
        return new C12253b(j, i, matrix);
    }

    /* renamed from: d */
    public static InterfaceC1893c.a m17843d(ByteBuffer byteBuffer, int i, int i2) {
        return new C12252a(i, i2, byteBuffer);
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public void C0(Rect rect) {
        synchronized (this.f15252a) {
            m17844a();
            if (rect != null) {
                this.f15255d.set(rect);
            }
        }
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public Image J2() {
        synchronized (this.f15252a) {
            m17844a();
        }
        return null;
    }

    /* renamed from: a */
    public final void m17844a() {
        synchronized (this.f15252a) {
            fgd.m26666j(this.f15256e != null, "The image is closed.");
        }
    }

    @Override // androidx.camera.core.InterfaceC1893c, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f15252a) {
            m17844a();
            this.f15256e = null;
        }
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public int getHeight() {
        int i;
        synchronized (this.f15252a) {
            m17844a();
            i = this.f15254c;
        }
        return i;
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public int getWidth() {
        int i;
        synchronized (this.f15252a) {
            m17844a();
            i = this.f15253b;
        }
        return i;
    }

    @Override // androidx.camera.core.InterfaceC1893c
    /* renamed from: l */
    public int mo4657l() {
        synchronized (this.f15252a) {
            m17844a();
        }
        return 1;
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public InterfaceC1893c.a[] u1() {
        InterfaceC1893c.a[] aVarArr;
        synchronized (this.f15252a) {
            m17844a();
            InterfaceC1893c.a[] aVarArr2 = this.f15256e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // androidx.camera.core.InterfaceC1893c
    public jd8 y2() {
        jd8 jd8Var;
        synchronized (this.f15252a) {
            m17844a();
            jd8Var = this.f15257f;
        }
        return jd8Var;
    }

    public aue(Bitmap bitmap, Rect rect, int i, Matrix matrix, long j) {
        this(ke8.m35532e(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i, matrix, j);
    }

    public aue(ByteBuffer byteBuffer, int i, int i2, int i3, Rect rect, int i4, Matrix matrix, long j) {
        this.f15252a = new Object();
        this.f15253b = i2;
        this.f15254c = i3;
        this.f15255d = rect;
        this.f15257f = m17842c(j, i4, matrix);
        byteBuffer.rewind();
        this.f15256e = new InterfaceC1893c.a[]{m17843d(byteBuffer, i2 * i, i)};
    }
}

package p001o;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.media3.common.C2181a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.objectweb.asm.Opcodes;
import p001o.vs7;

/* loaded from: classes2.dex */
public final class y4f implements gui, fa2 {

    /* renamed from: H */
    public byte[] f54879H;

    /* renamed from: q */
    public int f54888q;

    /* renamed from: s */
    public SurfaceTexture f54889s;

    /* renamed from: a */
    public final AtomicBoolean f54880a = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicBoolean f54881b = new AtomicBoolean(true);

    /* renamed from: c */
    public final nnd f54882c = new nnd();

    /* renamed from: d */
    public final wj7 f54883d = new wj7();

    /* renamed from: e */
    public final kmh f54884e = new kmh();

    /* renamed from: f */
    public final kmh f54885f = new kmh();

    /* renamed from: g */
    public final float[] f54886g = new float[16];

    /* renamed from: h */
    public final float[] f54887h = new float[16];

    /* renamed from: x */
    public volatile int f54890x = 0;

    /* renamed from: y */
    public int f54891y = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m57202g(SurfaceTexture surfaceTexture) {
        this.f54880a.set(true);
    }

    @Override // p001o.fa2
    /* renamed from: a */
    public void mo7197a(long j, float[] fArr) {
        this.f54883d.m54626e(j, fArr);
    }

    /* renamed from: c */
    public void m57203c(float[] fArr, boolean z) {
        GLES20.glClear(Opcodes.ACC_ENUM);
        try {
            vs7.m53369b();
        } catch (vs7.C17668a e) {
            ria.m46820d("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.f54880a.compareAndSet(true, false)) {
            ((SurfaceTexture) op0.m42515e(this.f54889s)).updateTexImage();
            try {
                vs7.m53369b();
            } catch (vs7.C17668a e2) {
                ria.m46820d("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.f54881b.compareAndSet(true, false)) {
                vs7.m53378k(this.f54886g);
            }
            long timestamp = this.f54889s.getTimestamp();
            Long l = (Long) this.f54884e.m35938g(timestamp);
            if (l != null) {
                this.f54883d.m54624c(this.f54886g, l.longValue());
            }
            lnd lndVar = (lnd) this.f54885f.m35941j(timestamp);
            if (lndVar != null) {
                this.f54882c.m40806d(lndVar);
            }
        }
        Matrix.multiplyMM(this.f54887h, 0, fArr, 0, this.f54886g, 0);
        this.f54882c.m40804a(this.f54888q, this.f54887h, z);
    }

    @Override // p001o.fa2
    /* renamed from: d */
    public void mo7198d() {
        this.f54884e.m35935c();
        this.f54883d.m54625d();
        this.f54881b.set(true);
    }

    @Override // p001o.gui
    /* renamed from: e */
    public void mo7199e(long j, long j2, C2181a c2181a, MediaFormat mediaFormat) {
        this.f54884e.m35933a(j2, Long.valueOf(j));
        m57206i(c2181a.f7954y, c2181a.f7955z, j2);
    }

    /* renamed from: f */
    public SurfaceTexture m57204f() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            vs7.m53369b();
            this.f54882c.m40805b();
            vs7.m53369b();
            this.f54888q = vs7.m53373f();
        } catch (vs7.C17668a e) {
            ria.m46820d("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f54888q);
        this.f54889s = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: o.x4f
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f53189a.m57202g(surfaceTexture2);
            }
        });
        return this.f54889s;
    }

    /* renamed from: h */
    public void m57205h(int i) {
        this.f54890x = i;
    }

    /* renamed from: i */
    public final void m57206i(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.f54879H;
        int i2 = this.f54891y;
        this.f54879H = bArr;
        if (i == -1) {
            i = this.f54890x;
        }
        this.f54891y = i;
        if (i2 == i && Arrays.equals(bArr2, this.f54879H)) {
            return;
        }
        byte[] bArr3 = this.f54879H;
        lnd lndVarM39389a = bArr3 != null ? mnd.m39389a(bArr3, this.f54891y) : null;
        if (lndVarM39389a == null || !nnd.m40803c(lndVarM39389a)) {
            lndVarM39389a = lnd.m37529b(this.f54891y);
        }
        this.f54885f.m35933a(j, lndVarM39389a);
    }
}
